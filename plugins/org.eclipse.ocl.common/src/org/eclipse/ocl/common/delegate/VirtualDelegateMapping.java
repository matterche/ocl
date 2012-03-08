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

public class VirtualDelegateMapping
{
	public static VirtualDelegateMapping INSTANCE = new VirtualDelegateMapping(OCLConstants.OCL_DELEGATE_URI_LPG);
//	public static final Option<String> VIRTUAL_DELEGATE = INSTANCE;    

	public static VirtualDelegateMapping getRegistry(EModelElement modelElement) {
		VirtualDelegateMapping registry = DelegateResourceSetAdapter.getRegistry(
			modelElement, VirtualDelegateMapping.class, INSTANCE);
		return registry;
	}

	private String delegatedURI;
	
	public VirtualDelegateMapping(String delegatedURI) {
//		super("virtual.delegate.mapping", delegatedURI); //$NON-NLS-1$
		this.delegatedURI = delegatedURI;
	}

	public String getDefaultValue() {
		return delegatedURI;
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

	public void setDefaultValue(String delegatedURI) {
		this.delegatedURI = delegatedURI;
	}
}