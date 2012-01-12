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
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AbstractedCollectionValue.java,v 1.2 2011/02/21 08:37:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractedCollectionValue
	extends AbstractValue
	implements CollectionValue
{
	protected final DomainCollectionType type;
	private DomainType actualType = null;			// Lazily computed

	protected AbstractedCollectionValue(ValueFactory valueFactory, DomainCollectionType type) {
		super(valueFactory);
		this.type = type;
	}

	public Collection<Value> asCollection() {
		return getElements();
	}

	@Override
	public CollectionValue asCollectionValue() {
		return this;
	}

	public List<Value> asList() {
		return new ArrayList<Value>(getElements());
	}

	public Object asObject() {
		return getElements();
	}

	public Value asValidValue() {
		return this;
	}

	@Override
	public DomainType getActualType() {
		if (actualType == null) {
			DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			DomainType elementType = null;
			for (Value value : getElements()) {
				DomainType valueType = value.getActualType();
				if (valueType != null) {
					if (elementType == null) {
						elementType = valueType;
					}
					else {
						elementType = elementType.getCommonType(standardLibrary, valueType);
					}
				}
			}
			if (elementType == null) {
				actualType = type;
			}
			else {
				actualType = standardLibrary.getCollectionType(type, elementType);
			}
		}	
		return actualType;
	}

	protected abstract Collection<Value> getElements();

	public DomainCollectionType getType() {
		return type;
	}

	@Override
	public CollectionValue isCollectionValue() {
		return this;
	}

	public BooleanValue isEmpty() {
		return valueFactory.booleanValueOf(intSize() == 0);
	}

	public BooleanValue notEmpty() {
		return valueFactory.booleanValueOf(intSize() != 0);
	}

	public IntegerValue size() {
		return valueFactory.integerValueOf(intSize());
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		toString(s, 100);
		return s.toString();
	}

	@Override
	public void toString(StringBuilder s, int lengthLimit) {
		s.append("{");
		boolean isFirst = true;
		for (Value element : this) {
			if (!isFirst) {
				s.append(",");
			}
			if (s.length() < lengthLimit) {
				element.toString(s, lengthLimit-1);
			}
			else {
				s.append("...");
				break;
			}
			isFirst = false;
		}
		s.append("}");		
	}
}
