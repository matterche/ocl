/**
 * <copyright>
 * 
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: OCLSettingDelegateFactory.java,v 1.2 2010/04/08 06:27:21 ewillink Exp $
 */
package org.eclipse.ocl.ecore.delegate;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;

/**
 * Factory for OCL derived-attribute setting delegates.
 * 
 * @since 3.0
 */
public class OCLSettingDelegateFactory extends AbstractOCLDelegateFactory
		implements EStructuralFeature.Internal.SettingDelegate.Factory
{
	/**
	 * Construct a factory for an unknown delegate domain; often the global factory.
	 * 
	 * @deprecated Specify explicit delegateURI
	 */
	@Deprecated
	public OCLSettingDelegateFactory() {}
	
	/**
	 * Construct a factory for a known delegate domain.
	 * 
	 * @param delegateDomain the delegate domain.
	 * @since 3.2
	 */
	public OCLSettingDelegateFactory(String delegateURI) {
		super(delegateURI);
	}

	/**
	 * Construct a factory for a known delegate domain.
	 * 
	 * @param delegateDomain the delegate domain.
	 * @deprecated Use String argument to avoid leak hazards
	 */
	@Deprecated
	public OCLSettingDelegateFactory(OCLDelegateDomain delegateDomain) {
		super(delegateDomain);
	}

	public EStructuralFeature.Internal.SettingDelegate createSettingDelegate(EStructuralFeature structuralFeature) {
		EPackage ePackage = structuralFeature.getEContainingClass().getEPackage();
		return new OCLSettingDelegate(getDelegateDomain(ePackage), structuralFeature);
	}
	
	/**
	 * The Global variant of the Factory delegates to a local ResourceSet factory if one
	 * can be located at the EStructuralFeature.Internal.SettingDelegate.Factory.Registry
	 * by the DelegateResourceSetAdapter.
	 */
	public static class Global extends OCLSettingDelegateFactory
	{
		public Global() {
			super(OCLDelegateDomain.OCL_DELEGATE_URI_LPG);
		}

		public EStructuralFeature.Internal.SettingDelegate createSettingDelegate(EStructuralFeature structuralFeature) {
			EStructuralFeature.Internal.SettingDelegate.Factory.Registry localRegistry = DelegateResourceSetAdapter.getRegistry(
				structuralFeature, EStructuralFeature.Internal.SettingDelegate.Factory.Registry.class, null);
			if (localRegistry != null) {
				EStructuralFeature.Internal.SettingDelegate.Factory factory = localRegistry.getFactory(delegateURI);
				if (factory != null) {
					return factory.createSettingDelegate(structuralFeature);
				}
			}
			return super.createSettingDelegate(structuralFeature);
		}	
	}
	
	/**
	 * Mapping provides a Factory entry that maps one delegate URI key to another.
	 * 
	 * @since 3.2
	 */
	public static class Mapping extends Global implements EStructuralFeature.Internal.SettingDelegate.Factory.Descriptor
	{
		protected final EStructuralFeature.Internal.SettingDelegate.Factory.Registry registry;
		
		public Mapping() {
			this(EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE);
		}
		
		public Mapping(EStructuralFeature.Internal.SettingDelegate.Factory.Registry registry) {
			this.registry = registry;
		}

		@Override
		public SettingDelegate createSettingDelegate(EStructuralFeature structuralFeature) {
			VirtualDelegateMapping.installMapping(registry.entrySet(), delegateURI, this);
			return super.createSettingDelegate(structuralFeature);
		}

		public EStructuralFeature.Internal.SettingDelegate.Factory getFactory() {
			VirtualDelegateMapping.installMapping(registry.entrySet(), delegateURI, this);
			return registry.getFactory(delegateURI);
		}
	}
}
