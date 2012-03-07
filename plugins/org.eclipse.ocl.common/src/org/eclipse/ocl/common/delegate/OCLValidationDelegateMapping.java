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

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EValidator;

/**
 * OCLValidationDelegateMapping provides a ValidationDelegate that maps one delegate URI key to another.
 */
public class OCLValidationDelegateMapping implements EValidator.ValidationDelegate
{
	protected final EValidator.ValidationDelegate.Registry validationDelegateRegistry;
	protected final VirtualDelegateMapping virtualDelegateMapping;
	private EValidator.ValidationDelegate delegate = null;
	
	public OCLValidationDelegateMapping() {
		this(EValidator.ValidationDelegate.Registry.INSTANCE, VirtualDelegateMapping.INSTANCE);
	}
	
	public OCLValidationDelegateMapping(EValidator.ValidationDelegate.Registry validationDelegateRegistry, VirtualDelegateMapping virtualDelegateMapping) {
		this.validationDelegateRegistry = validationDelegateRegistry;
		this.virtualDelegateMapping = virtualDelegateMapping;
	}
	
	public void reset() {
		delegate = null;
	}

	protected EValidator.ValidationDelegate resolveDelegate(Map<Object, Object> context) {
//		EValidator.ValidationDelegate.Registry validationDelegateRegistry = null;
//	    if (context != null)
//	    {
//	    	validationDelegateRegistry = (EValidator.ValidationDelegate.Registry)context.get(EValidator.ValidationDelegate.Registry.class);
//	    }
//	    if (validationDelegateRegistry == null) {
//	    	validationDelegateRegistry = EValidator.ValidationDelegate.Registry.INSTANCE;
//	    }
		String delegatedURI = virtualDelegateMapping.getDefaultValue();
		return validationDelegateRegistry.getValidationDelegate(delegatedURI);
	}

	public boolean validate(EClass eClass, EObject eObject,
			Map<Object, Object> context, EOperation invariant,
			String expression) {
		if (delegate == null) {
			delegate = resolveDelegate(context);
			if (delegate == null) {
				return false;
			}
		}
		return delegate.validate(eClass, eObject, context, invariant, expression);
	}

	public boolean validate(EClass eClass, EObject eObject,
			Map<Object, Object> context, String constraint,
			String expression) {
		if (delegate == null) {
			delegate = resolveDelegate(context);
			if (delegate == null) {
				return false;
			}
		}
		return delegate.validate(eClass, eObject, context, constraint, expression);
	}

	public boolean validate(EDataType eDataType, Object value,
			Map<Object, Object> context, String constraint,
			String expression) {
		if (delegate == null) {
			delegate = resolveDelegate(context);
			if (delegate == null) {
				return false;
			}
		}
		return delegate.validate(eDataType, value, context, constraint, expression);
	}
}