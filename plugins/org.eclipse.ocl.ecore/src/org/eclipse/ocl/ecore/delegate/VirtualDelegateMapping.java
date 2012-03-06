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
package org.eclipse.ocl.ecore.delegate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EModelElement;

/**
 * @since 3.2
 */
public class VirtualDelegateMapping
{
	public static VirtualDelegateMapping INSTANCE = new VirtualDelegateMapping();

	public static VirtualDelegateMapping getRegistry(EModelElement modelElement) {
		VirtualDelegateMapping registry = DelegateResourceSetAdapter.getRegistry(
			modelElement, VirtualDelegateMapping.class, INSTANCE);
		return registry;
	}
	
	private Map<String,String> map = new HashMap<String,String>();
	
	public String get(String key) {
		return map.get(key);
	}

	public static void installMapping(Set<Entry<String, Object>> entries, String delegateURI, Object virtualDelegate) {
		for (Map.Entry<String,Object> entry : entries) {
			if (entry.getValue() == virtualDelegate) {
				INSTANCE.put(entry.getKey(), delegateURI);
			}
		}
	}

	public void put(String key, String value) {
		map.put(key, value);
	}

	public String resolve(String delegateURI) {
		String resolvedURI = get(delegateURI);
		if (resolvedURI != null) {
			return resolvedURI;
		}
		else {
			return delegateURI;
		}
	}
}