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

import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.QueryDelegate;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.pivot.utilities.TypeManagerResourceSetAdapter;

/**
 * An implementation of a delegate domain for an OCL enhanced package. The domain
 * maintains an OCL facade to be shared by all delegates within the package.
 */
public class OCLDelegateDomain implements DelegateDomain
{
	/**
	 * The EAnnotation source URI for delegate OCL annotations.
	 * <p>
	 * For an EOperation, the EAnnotation details may include
	 * <br>
	 * a <tt>body</tt> key to provide an OCL expression value that specifies <tt>body:</tt> of the operation.
	 * <br>
	 * a <tt>precondition</tt> key to provide an OCL expression value that specifies <tt>pre:</tt> for the operation.
	 * <br>
	 * a <tt>postcondition</tt> key to provide an OCL expression value that specifies <tt>post:</tt> for the operation.
	 * <p>
	 * For an EStructuralFeature, the EAnnotation details may include
	 * <br>
	 * a <tt>derivation</tt> key to provide an OCL expression value that specifies <tt>derive:</tt> for the property.
	 * <br>
	 * a <tt>initial</tt> key to provide an OCL expression value that specifies <tt>initial:</tt> for the operation.
	 * <p>
	 * For an EClassifier (EClass, EDataType), the EAnnotation details may include
	 * <br>
	 * a <tt><i>constraintName</i></tt> key to provide an OCL expression value that specifies <tt>inv <i>constraintName</i>:</tt> for the classifier.
	 * <p>
	 * Note that the delegate OCL functionality must be enabled by an EPackage Ecore annotation specifying this URI
	 * as the value of <tt>invocationDelegates</tt>, <tt>settingDelegates</tt> and <tt>validationDelegates</tt> details
	 * keys.
	 * <p>
	 * Note also that validation must be enabled by specifying an EClassifier Ecore annotation with a space separated list
	 * of invariant <tt><i>constraintName</i></tt>s as the value of the <tt>constraints</tt> details key. 
	 * <p>
	 * See <tt>/org.eclipse.ocl.ecore.tests/model/Company.ecore</tt> or <tt>http://wiki.eclipse.org/MDT/OCLinEcore</tt> for an example.
	 */
	public static final String OCL_DELEGATE_URI_LPG = org.eclipse.emf.ecore.EcorePackage.eNS_URI + "/OCL"; //$NON-NLS-1$
	public static final String OCL_DELEGATE_URI_PIVOT = org.eclipse.emf.ecore.EcorePackage.eNS_URI + "/OCL/Pivot"; //$NON-NLS-1$
	private static final String OCL_DELEGATE_URI_SLASH = OCL_DELEGATE_URI_LPG + "/"; //$NON-NLS-1$

	/**
	 * Return the OCL Delegate EAnnotation, which is an EAnnotation with {@link #OCL_DELEGATE_URI}
	 * as its source, or if no such EAnnotation is present, then the first EAnnotation with a source
	 * whose URI starts with {@link #OCL_DELEGATE_URI} and a / character/
	 */
	public static EAnnotation getDelegateAnnotation(EModelElement eModelElement) {
		List<EAnnotation> eAnnotations = eModelElement.getEAnnotations();
		for (EAnnotation eAnnotation : eAnnotations) {
			String source = eAnnotation.getSource();
			if ((source != null) && source.equals(OCL_DELEGATE_URI_LPG)) {
				return eAnnotation;
			}
		}
		for (EAnnotation eAnnotation : eAnnotations) {
			String source = eAnnotation.getSource();
			if ((source != null) && source.startsWith(OCL_DELEGATE_URI_SLASH)) {
				return eAnnotation;
			}
		}
		return null;
	}

	public static String getDelegateAnnotation(EModelElement eModelElement, String key) {
	    EAnnotation eAnnotation = getDelegateAnnotation(eModelElement);
	    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get(key);
	}
	
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
		if (!EcorePlugin.IS_ECLIPSE_RUNNING) {		// Install the 'plugin' registrations
			EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI, new OCLInvocationDelegateFactory.Global());
			EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI, new OCLSettingDelegateFactory.Global());
			EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI, new OCLValidationDelegateFactory.Global());
			QueryDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI, new OCLQueryDelegateFactory.Global());
		}
		if (resourceSet != null) {
			// Install a DelegateResourceSetAdapter to supervise local registries and resource post-loading
			DelegateResourceSetAdapter adapter = DelegateResourceSetAdapter.getAdapter(resourceSet);
	
			// Install a local DelegateDomain.Factory
			DelegateDomain.Factory.Registry.Impl delegateDomainFactory = new DelegateDomain.Factory.Registry.Impl();
			delegateDomainFactory.put(oclDelegateURI, new OCLDelegateDomainFactory());
			adapter.putRegistry(DelegateDomain.Factory.Registry.class, delegateDomainFactory);
					
			// Install a local ValidationDelegate.Factory
			ValidationDelegate.Factory.Registry validationDelegateFactoryRegistry = new ValidationDelegate.Factory.Registry.Impl();
			validationDelegateFactoryRegistry.put(oclDelegateURI, new OCLValidationDelegateFactory());
			adapter.putRegistry(ValidationDelegate.Factory.Registry.class, validationDelegateFactoryRegistry);
	
			// Install a local SettingDelegate.Factory
			EStructuralFeature.Internal.SettingDelegate.Factory.Registry settingDelegateFactoryRegistry = new EStructuralFeature.Internal.SettingDelegate.Factory.Registry.Impl();
			settingDelegateFactoryRegistry.put(oclDelegateURI, new OCLSettingDelegateFactory());
			adapter.putRegistry(EStructuralFeature.Internal.SettingDelegate.Factory.Registry.class, settingDelegateFactoryRegistry);
	
			// Install a local InvocationDelegate.Factory
			EOperation.Internal.InvocationDelegate.Factory.Registry invocationDelegateFactoryRegistry = new EOperation.Internal.InvocationDelegate.Factory.Registry.Impl();
			invocationDelegateFactoryRegistry.put(oclDelegateURI, new OCLInvocationDelegateFactory());
			adapter.putRegistry(EOperation.Internal.InvocationDelegate.Factory.Registry.class, invocationDelegateFactoryRegistry);	
	
			// Install a local QueryDelegate.Factory
			QueryDelegate.Factory.Registry queryDelegateFactoryRegistry = new QueryDelegate.Factory.Registry.Impl();
			queryDelegateFactoryRegistry.put(oclDelegateURI, new OCLQueryDelegateFactory());
			adapter.putRegistry(QueryDelegate.Factory.Registry.class, queryDelegateFactoryRegistry);
		}
	}

	protected final String uri;
	protected final EPackage ePackage;
	protected final OCL ocl;
	protected final TypeManager typeManager;
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
		// Delegates are an application-independent extension of EMF
		//  so we must use the neutral/global context see Bug 338501
		this.ocl = OCL.newInstance(getEnvironmentFactory());
		this.typeManager = ocl.getEnvironment().getTypeManager();
	}

	public void dispose() {
		if (ocl != null) {
			ocl.dispose();
		}
	}

	private PivotEnvironmentFactory getEnvironmentFactory() {
		Resource res = ePackage.eResource();
		PivotEnvironmentFactory envFactory = null;
		if (res != null) {
			TypeManager typeManager = null;
//			Ecore2Pivot ecore2Pivot = null; //Ecore2Pivot.findAdapter(res);
//			if (ecore2Pivot != null) {
//				typeManager = ecore2Pivot.getTypeManager();
//			}
			ResourceSet resourceSet = res.getResourceSet();
			if (resourceSet != null) {
//				if (typeManager != null) {
					TypeManagerResourceSetAdapter rsAdapter = TypeManagerResourceSetAdapter.findAdapter(resourceSet);
					if (rsAdapter != null) {
						typeManager = rsAdapter.getTypeManager();
					}
//				}
				// it's a dynamic package. Use the local package registry
				EPackage.Registry packageRegistry = resourceSet.getPackageRegistry();
				envFactory = new PivotEnvironmentFactory(packageRegistry, typeManager);
				DelegateResourceAdapter.getAdapter(res);
			}
		}
		if (envFactory == null) {
			// the shared instance uses the static package registry
			envFactory = PivotEnvironmentFactory.getGlobalRegistryInstance();
		}
		return envFactory;
	}

	public OCL getOCL() {
		return ocl;
	}
	
	public <T extends Element> T getPivot(Class<T> requiredClass, EObject eObject) {
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(eObject.eResource(), typeManager);
		return ecore2Pivot.getCreated(requiredClass, eObject);
	}

/*	public org.eclipse.ocl.examples.pivot.Package getQueryPackage(org.eclipse.ocl.examples.pivot.Package modelPackage) {
		CompleteEnvironmentManager completeEnvironmentManager = typeManager.useCompleteEnvironmentManager();
		CompletePackage completePackage = typeManager.getCompletePackage(modelPackage);
		if (queryPackages == null) {
			queryPackages = new HashMap<CompletePackage, org.eclipse.ocl.examples.pivot.Package>();
		}
		org.eclipse.ocl.examples.pivot.Package queryPackage = queryPackages.get(completePackage);
		if (queryPackage == null) {
			queryPackage = PivotFactory.eINSTANCE.createPackage();
			queryPackage.setName(modelPackage.getName());
			queryPackage.setMoniker(modelPackage.getMoniker());
			queryPackages.put(completePackage, queryPackage);
			completeEnvironmentManager.addPackage(completePackage, queryPackage);
			org.eclipse.ocl.examples.pivot.Package nestingModelPackage = modelPackage.getNestingPackage();
			if (nestingModelPackage != null) {
				org.eclipse.ocl.examples.pivot.Package nestingQueryPackage = getQueryPackage(nestingModelPackage);
				nestingQueryPackage.getNestedPackages().add(queryPackage);
			}
		}
		return queryPackage;
	} */

/*	public org.eclipse.ocl.examples.pivot.Class getQueryType(Type modelType) {
		CompleteEnvironmentManager completeEnvironmentManager = typeManager.useCompleteEnvironmentManager();
		org.eclipse.ocl.examples.pivot.Package contextPackage = getQueryPackage(modelType.getPackage());
		CompleteType completeType = typeManager.getCompleteType(modelType);
		if (queryTypes == null) {
			queryTypes = new HashMap<CompleteType, org.eclipse.ocl.examples.pivot.Class>();
		}
		org.eclipse.ocl.examples.pivot.Class queryType = queryTypes.get(completeType);
		if (queryType == null) {
			queryType = PivotFactory.eINSTANCE.createClass();
			queryType.setName(modelType.getName());
			queryTypes.put(completeType, queryType);
			contextPackage.getOwnedTypes().add(queryType);
			completeEnvironmentManager.addType(completeType, queryType);
		}
		return queryType;
	} */

	public TypeManager getTypeManager() {
		return typeManager;
	}
	
	public String getURI() {
		return uri;
	}

	@Override
	public String toString() {
		return ePackage.getName() + " : " + getURI(); //$NON-NLS-1$
	}
}
