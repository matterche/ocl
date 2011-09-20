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
package org.eclipse.ocl.examples.pivot.values;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.impl.AbstractValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.DomainTypeValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.IntegerValueImpl;
import org.eclipse.ocl.examples.domain.values.impl.RealValueImpl;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotValueFactory extends AbstractValueFactory
{
	public PivotValueFactory(MetaModelManager metaModelManager) {
		super(metaModelManager);
	}
	
	@Override
	public ObjectValue createEObjectValue(EObject eObject) {
		if (eObject instanceof Element) {
			if (eObject instanceof ClassifierType) {
				return createTypeValue((ClassifierType) eObject);
			}
			return new ElementValueImpl(this, (Element)eObject);
		}
		return super.createEObjectValue(eObject);
	}

	@Override
	public ElementValue createElementValue(DomainElement domainElement) {
		if (domainElement instanceof Element) {
			if (domainElement instanceof ClassifierType) {
				return new TypeValueImpl(this, (ClassifierType)domainElement);
			}
			return new ElementValueImpl(this, (Element)domainElement);
		}
		return super.createElementValue(domainElement);
	}

	@Override
	public ObjectValue createObjectValue(Object object) {
		// TODO Auto-generated method stub
		return super.createObjectValue(object);
	}

	@Override
	public TypeValue createTypeValue(DomainClassifierType domainType) {
		if (domainType instanceof ClassifierType) {
			return new TypeValueImpl(this, (ClassifierType)domainType);
		}
		return new DomainTypeValueImpl(this, domainType);
	}

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
	
/*	@Override
	public Value valueOf(Object object) {
		Value value = super.valueOf(object);
		if (value != null) {
			return value;
		}
		if (object instanceof Element) {
			if (object instanceof ClassifierType) {
				return createTypeValue((ClassifierType) object);
			}
			return createElementValue((DomainElement) object);
		}
		if (object instanceof EObject) {
			return new EObjectValueImpl(this, (EObject) object);
		}
		DomainType type = null;
		if (object instanceof EObject) {
			type = PivotUtil.findTypeOf(getMetaModelManager(), ((EObject)object).eClass());
		}
		if (type == null) {
			type = getStandardLibrary().getAnyClassifierType();	// WIP A better type
		}
		return new ObjectValueImpl(this, type, object);
	} */
}
 