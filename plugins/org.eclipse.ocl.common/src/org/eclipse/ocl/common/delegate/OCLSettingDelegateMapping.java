/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.common.delegate;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;

/**
 * OCLSettingDelegateMapping provides a Factory entry that maps one delegate URI key to another.
 */
public class OCLSettingDelegateMapping implements EStructuralFeature.Internal.SettingDelegate.Factory
{
	protected final EStructuralFeature.Internal.SettingDelegate.Factory.Registry registry;
	protected final VirtualDelegateMapping virtualDelegateMapping;
	
	public OCLSettingDelegateMapping() {
		this(EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE, VirtualDelegateMapping.INSTANCE);
	}
	
	public OCLSettingDelegateMapping(EStructuralFeature.Internal.SettingDelegate.Factory.Registry registry, VirtualDelegateMapping virtualDelegateMapping) {
		this.registry = registry;
		this.virtualDelegateMapping = virtualDelegateMapping;
	}

	public SettingDelegate createSettingDelegate(EStructuralFeature eStructuralFeature) {
		String delegateURI = virtualDelegateMapping.getDefaultValue();
		EStructuralFeature.Internal.SettingDelegate.Factory factory = registry.getFactory(delegateURI);
		return factory.createSettingDelegate(eStructuralFeature);
	}
}