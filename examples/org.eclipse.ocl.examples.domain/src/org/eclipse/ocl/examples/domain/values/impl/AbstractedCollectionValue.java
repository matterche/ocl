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

import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractedCollectionValue
	extends AbstractValue
	implements CollectionValue
{
	protected AbstractedCollectionValue(ValueFactory valueFactory, DomainType type) {
		super(valueFactory, type);
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

	protected abstract Collection<Value> getElements();

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
		StringBuffer s = new StringBuffer();
		toString(s, 100);
		return s.toString();
	}

	@Override
	public void toString(StringBuffer s, int lengthLimit) {
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
