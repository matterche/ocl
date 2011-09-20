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
 * $Id: ValueFactoryImpl.java,v 1.9 2011/05/07 16:41:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.AbstractValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.ElementValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.IntegerValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.ObjectValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.RealValueImpl;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotValueFactory extends AbstractValueFactory
{
	public PivotValueFactory(MetaModelManager metaModelManager) {
		super(metaModelManager);
	}
	
	public <E extends DomainElement> ElementValue<E> createElementValue(E element) {
		EClass eClass = ((EObject)element).eClass();
		return new ElementValueImpl<E>(this, getMetaModelManager().getPivotType(eClass.getName()), element);
	}

//	public Type getCommonType(DomainType firstType, DomainType secondType) {
//		return getMetaModelManager().getCommonType((DomainType)firstType, (DomainType)secondType, null);			// WIP
//	}

	public Object getEcoreValueOf(Value value) {
		if (value instanceof NullValue) {
			return null;
		}
		else if (value instanceof CollectionValue) {
			CollectionValue collectionValue = (CollectionValue) value;
			List<Object> ecoreResult = new BasicEList<Object>(collectionValue.intSize());
			for (Value elementValue : collectionValue) {
				ecoreResult.add(getEcoreValueOf(elementValue));
			}
			return ecoreResult;
		}
		else if (value instanceof IntegerValueImpl) {
			return ((IntegerValueImpl)value).intValue();
		}
		else if (value instanceof RealValueImpl) {
			return ((RealValueImpl)value).doubleValue();
		}
		else {
			Object object = value.asObject();
			if (object instanceof Element) {
				EObject target = ((Element)object).getETarget();
				if (target instanceof EEnumLiteral) {
					return ((EEnumLiteral)target).getInstance();
				}
				return target;
			}
			return object;
		}
	}

	public MetaModelManager getMetaModelManager() {
		return (MetaModelManager) getStandardLibrary();
	}

	public ValueFactory getValueFactory() {
		return this;
	}
	
	@Override
	public Value valueOf(Object object) {
		Value value = super.valueOf(object);
		if (value != null) {
			return value;
		}
		if (object instanceof EObject) {
			DomainType type = PivotUtil.findTypeOf(getMetaModelManager(), ((EObject)object).eClass());
			if (type != null) {
				return new ObjectValueImpl(this, type, object);	// WIP A better type
			}
		}
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
 