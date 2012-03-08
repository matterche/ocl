/**
 * <copyright>
 * 
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   C.Damus, K.Hussey, E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 *
 * $Id: OCLDelegateDomain.java,v 1.6 2011/05/13 18:43:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.delegate;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.QueryDelegate;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.common.delegate.DelegateResourceSetAdapter;
import org.eclipse.ocl.common.delegate.VirtualDelegateMapping;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerListener;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;

/**
 * An implementation of a delegate domain for an OCL enhanced package. The domain
 * maintains an OCL facade to be shared by all delegates within the package.
 */
public class OCLDelegateDomain implements DelegateDomain, MetaModelManagerListener
{
	/**
	 * The delegate URI for Ecore annotations using the Pivot evaluator.
	 */
	public static final String OCL_DELEGATE_URI_PIVOT = OCLConstants.OCL_DELEGATE_URI_SLASH + "Pivot"; //$NON-NLS-1$
	
	/**
	 * Initialize the resourceSet registries, if non-null, or the global registries, if null,
	 * to support usage of the Pivot OCL Delegate Evaluator for the Pivot OCL Delegate URI. 
	 */
	public static void initialize(ResourceSet resourceSet) {
		initialize(resourceSet, OCL_DELEGATE_URI_PIVOT);
	}
	
	/**
	 * Initialize the resourceSet registries, if non-null, or the global registries, if null,
	 * to support usage of the Pivot OCL Delegate Evaluator for the oclDelegateURI. 
	 */
	public static void initialize(ResourceSet resourceSet, String oclDelegateURI) {
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {		// Install the 'plugin' registrations
			EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI, new OCLInvocationDelegateFactory.Global());
			EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI, new OCLSettingDelegateFactory.Global());
			EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI, new OCLValidationDelegateFactory.Global());
			QueryDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI, new OCLQueryDelegateFactory.Global());
		}
		if (resourceSet != null) {
			// Install a DelegateResourceSetAdapter to supervise local registries and resource post-loading
			DelegateResourceSetAdapter adapter = DelegateResourceSetAdapter.getAdapter(resourceSet);
			adapter.putRegistry(VirtualDelegateMapping.class, new VirtualDelegateMapping(VirtualDelegateMapping.INSTANCE.getDefaultValue()));
	
			// Install a local DelegateDomain.Factory
			DelegateDomain.Factory.Registry.Impl delegateDomainFactory = new DelegateDomain.Factory.Registry.Impl();
			delegateDomainFactory.put(oclDelegateURI, new OCLDelegateDomainFactory());
			adapter.putRegistry(DelegateDomain.Factory.Registry.class, delegateDomainFactory);
					
			// Install a local ValidationDelegate.Factory
			ValidationDelegate.Factory.Registry validationDelegateFactoryRegistry = new ValidationDelegate.Factory.Registry.Impl();
			validationDelegateFactoryRegistry.put(oclDelegateURI, new OCLValidationDelegateFactory(oclDelegateURI));
			adapter.putRegistry(ValidationDelegate.Factory.Registry.class, validationDelegateFactoryRegistry);
	
			// Install a local SettingDelegate.Factory
			EStructuralFeature.Internal.SettingDelegate.Factory.Registry settingDelegateFactoryRegistry = new EStructuralFeature.Internal.SettingDelegate.Factory.Registry.Impl();
			settingDelegateFactoryRegistry.put(oclDelegateURI, new OCLSettingDelegateFactory(oclDelegateURI));
			adapter.putRegistry(EStructuralFeature.Internal.SettingDelegate.Factory.Registry.class, settingDelegateFactoryRegistry);
	
			// Install a local InvocationDelegate.Factory
			EOperation.Internal.InvocationDelegate.Factory.Registry invocationDelegateFactoryRegistry = new EOperation.Internal.InvocationDelegate.Factory.Registry.Impl();
			invocationDelegateFactoryRegistry.put(oclDelegateURI, new OCLInvocationDelegateFactory(oclDelegateURI));
			adapter.putRegistry(EOperation.Internal.InvocationDelegate.Factory.Registry.class, invocationDelegateFactoryRegistry);	
	
			// Install a local QueryDelegate.Factory
			QueryDelegate.Factory.Registry queryDelegateFactoryRegistry = new QueryDelegate.Factory.Registry.Impl();
			queryDelegateFactoryRegistry.put(oclDelegateURI, new OCLQueryDelegateFactory(oclDelegateURI));
			adapter.putRegistry(QueryDelegate.Factory.Registry.class, queryDelegateFactoryRegistry);
		}
	}

	protected final String uri;
	protected final EPackage ePackage;
	protected OCL ocl = null;				// Lazily initialized and re-initialized
	// FIXME Introduce a lightweight function (? a lambda function) to avoid the need for a CompleteEnvironment for queries
//	private Map<CompletePackage, org.eclipse.ocl.examples.pivot.Package> queryPackages = null;
//	private Map<CompleteType, org.eclipse.ocl.examples.pivot.Class> queryTypes = null;
	
	/**
	 * Initializes me with my delegate URI and package.
	 * 
	 * @param delegateURI
	 *            the delegate namespace I handle
	 * @param ePackage
	 *            the package that I handle
	 * 
	 * @throws ParserException
	 *             if the operation's OCL body expression is invalid
	 */
	public OCLDelegateDomain(String delegateURI, EPackage ePackage) {
		this.uri = delegateURI;
		this.ePackage = ePackage;
	}

	private PivotEnvironmentFactory getEnvironmentFactory() {
		Resource res = ePackage.eResource();
		PivotEnvironmentFactory envFactory = null;
		if (res != null) {
			MetaModelManager metaModelManager = null;
			ResourceSet resourceSet = res.getResourceSet();
			if (resourceSet != null) {
				MetaModelManagerResourceSetAdapter rsAdapter = MetaModelManagerResourceSetAdapter.findAdapter(resourceSet);
				if (rsAdapter != null) {
					metaModelManager = rsAdapter.getMetaModelManager();
				}
				// it's a dynamic package. Use the local package registry
				EPackage.Registry packageRegistry = resourceSet.getPackageRegistry();
				envFactory = new PivotEnvironmentFactory(packageRegistry, metaModelManager);
				DelegateResourceAdapter.getAdapter(res);
			}
		}
		if (envFactory == null) {
			// the shared instance uses the static package registry
			envFactory = PivotEnvironmentFactory.getGlobalRegistryInstance();
		}
		return envFactory;
	}

	public final MetaModelManager getMetaModelManager() {
		return getOCL().getMetaModelManager();
	}

	public OCL getOCL() {
		if (ocl == null) {
			// Delegates are an application-independent extension of EMF
			//  so we must use the neutral/global context see Bug 338501
			ocl = OCL.newInstance(getEnvironmentFactory());
			ocl.getMetaModelManager().addListener(this);
		}
		return ocl;
	}
	
	public <T extends Element> T getPivot(Class<T> requiredClass, EObject eObject) {
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(eObject.eResource(), getOCL().getMetaModelManager());
		return ecore2Pivot.getCreated(requiredClass, eObject);
	}
	
	public final String getURI() {
		return uri;
	}

	public void metaModelManagerDisposed(MetaModelManager metaModelManager) {
		reset();
	}

	public void reset() {
		if (ocl != null) {
			ocl.dispose();
			ocl = null;
		}
	}

	@Override
	public String toString() {
		return ePackage.getName() + " : " + getURI(); //$NON-NLS-1$
	}
}
