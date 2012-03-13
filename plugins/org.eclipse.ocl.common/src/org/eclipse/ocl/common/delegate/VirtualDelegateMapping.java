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

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.common.options.CommonOptions;
import org.eclipse.ocl.common.preferences.StringPreference;

public class VirtualDelegateMapping extends StringPreference
{
	public static VirtualDelegateMapping getRegistry(EModelElement modelElement) {
		VirtualDelegateMapping registry = DelegateResourceSetAdapter.getRegistry(
			modelElement, VirtualDelegateMapping.class, CommonOptions.DEFAULT_DELEGATION_MODE);
		return registry;
	}
	
	public VirtualDelegateMapping(String pluginId, String key, String defaultValue) {
		super(pluginId, key, defaultValue);
	}

	public String resolve(String delegateURI) {
		if (OCLConstants.OCL_DELEGATE_URI.equals(delegateURI)) {
			String defaultValue = getDefaultValue();
			if (defaultValue != null) {
				return defaultValue;
			}
		}
		return delegateURI;
	}
}