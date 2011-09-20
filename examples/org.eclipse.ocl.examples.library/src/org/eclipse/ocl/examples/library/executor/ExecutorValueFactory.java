/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.library.executor;

import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.impl.AbstractValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.ObjectValueImpl;

public class ExecutorValueFactory extends AbstractValueFactory
{
	public ExecutorValueFactory(DomainStandardLibrary standardLibrary) {
		super(standardLibrary);
	}

	public <E extends DomainElement> ElementValue<E> createElementValue(E element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public Object getEcoreValueOf(Value result) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

//	@Override
//	public ExecutorType typeOf(Value value, Value... values) {
//		return (ExecutorType) super.typeOf(value, values);
//	}

	@Override
	public Value valueOf(Object object) {
		Value value = super.valueOf(object);
		if (value != null) {
			return value;
		}
//		if (object instanceof EObject) {
//			DomainType type = PivotUtil.findTypeOf(getTypeManager(), ((EObject)object).eClass());
//			if (type != null) {
//				return new ObjectValueImpl(this, type, object);	// WIP A better type
//			}
//		}
//		return typeManager.getClassifierType();
//	}
/* FIXME		if (object instanceof EEnumLiteral) {
			Resource resource = ((EEnumLiteral)object).eResource();
			Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(resource, null);
			EnumerationLiteral pivotLiteral = ecore2Pivot.getCreated(EnumerationLiteral.class, (EEnumLiteral)object);
			return createElementValue(pivotLiteral);
		} */
//		return createObjectValue(object);
//	}
//
//	public ObjectValue createObjectValue(ValueType type, Object object) {
		return new ObjectValueImpl(this, getStandardLibrary().getAnyClassifierType(), object);	// WIP A better type
	}
}