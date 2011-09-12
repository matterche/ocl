/**
 * <copyright>
 *
 * Copyright (c) 2005,2011 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   E.D.Willink - split off from EvaluationVisitor
 *
 * </copyright>
 *
 * $Id: IntegerRangeValueImpl.java,v 1.4 2011/02/21 08:37:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.SequenceValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

public class IntegerRangeValueImpl extends AbstractSequenceValue<IntegerRangeImpl>
{	// FIXME Should be AbstractOrderedSet ...
	public IntegerRangeValueImpl(ValueFactory valueFactory, CollectionType type, IntegerValue first, IntegerValue last) throws InvalidValueException {
		super(valueFactory, type, new IntegerRangeImpl(first, last));
	}

	@Override
	public SequenceValue append(Value value) throws InvalidValueException {
		IntegerValue integerValue = value.asIntegerValue();
		IntegerValue nextValue = elements.getLast().add(valueFactory.getOne());
		if (integerValue.equals(nextValue)) {
			return new IntegerRangeValueImpl(valueFactory, getCollectionType(), elements.getFirst(), nextValue);
		}
		else {
			List<Value> elements = createElements();
			elements.add(value);
			return valueFactory.createSequenceValue(getCollectionType(), elements);
		}
	}

	@Override
	public IntegerValue count(Value value) throws InvalidValueException {
		IntegerValue integerValue = value.isIntegerValue();
		if ((integerValue != null) && !integerValue.isUndefined()) {
			IntegerValue first = elements.getFirst();
			IntegerValue last = elements.getLast();
			if ((first.compareTo(integerValue) <= 0) && (integerValue.compareTo(last) <= 0)) {
				return valueFactory.getOne();
			}
		}
		return valueFactory.getZero();
	}

	protected List<Value> createElements() {
		List<Value> elements = new ArrayList<Value>(intSize());
		for (Value value : this) {
			elements.add(value);
		}
		return elements;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IntegerRangeValueImpl) {
			IntegerRangeValueImpl that = (IntegerRangeValueImpl)obj;
			return this.elements.equals(that.elements);
		}
		else {
			return super.equals(obj);
		}
	}

//	public BooleanValue excludes(Value value) {
		// TODO Auto-generated method stub
//		return null;
//	}

//	public BooleanValue excludesAll(CollectionValue c) {
		// TODO Auto-generated method stub
//		return null;
//	}

//	public CollectionValue excluding(Value value) {
		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Value first() {
		return elements.getFirst();
	}

	@Override
	public SequenceValue flatten() {
		return this;
	}

	@Override
	public List<Value> getElements() {
		if (elements == null) {
			createElements();
		}
		return (List<Value>)elements;
	}

//	public BooleanValue includes(Value value) {
		// TODO Auto-generated method stub
//		return null;
//	}

//	public BooleanValue includesAll(CollectionValue c) {
		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public SequenceValue including(Value value) throws InvalidValueException {
		return append(value);
	}

//	public IntegerValue indexOf(Value object) {
		// TODO Auto-generated method stub
//		return null;
//	}

//	public OrderedCollectionValue insertAt(int index, Value object) {
		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Value last() {
		return elements.getLast();
	}

	@Override
	public SequenceValue prepend(Value value) throws InvalidValueException {
		IntegerValue integerValue = value.asIntegerValue();
		IntegerValue previousValue = elements.getFirst().subtract(valueFactory.getOne());
		if (integerValue.equals(previousValue)) {
			return new IntegerRangeValueImpl(valueFactory, getCollectionType(), previousValue, elements.getLast());
		}
		else {
			List<Value> elements = createElements();
			elements.add(0, value);
			return valueFactory.createSequenceValue(getCollectionType(), elements);
		}
	}

	@Override
	public SequenceValue reverse() throws InvalidValueException {
		return new IntegerRangeValueImpl(valueFactory, getCollectionType(), elements.getLast(), elements.getFirst());
	}

//	public SequenceValue subSequence(int lower, int upper) {
		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public void toString(StringBuffer s, int lengthLimit) {
		s.append("Sequence{");
		s.append(elements.getFirst());
		s.append("..");
		s.append(elements.getLast());
		s.append("}");
		s.toString();
	}
}