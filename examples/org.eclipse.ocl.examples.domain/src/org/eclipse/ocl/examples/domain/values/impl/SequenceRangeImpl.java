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
 * $Id$
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.IntegerRange;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class SequenceRangeImpl extends AbstractSequenceValue<IntegerRange>
{	// FIXME Should be AbstractOrderedSet ...
	public SequenceRangeImpl(ValueFactory valueFactory, DomainCollectionType type, IntegerRange range) {
		super(valueFactory, type, range);
	}

	@Override
	public SequenceValue append(Value value) throws InvalidValueException {
		IntegerValue nextValue = elements.getLast().add(valueFactory.getOne());
		if (value.equals(nextValue)) {
			IntegerRange range = valueFactory.createRange(elements.getFirst(), nextValue);
			return new SequenceRangeImpl(valueFactory, getCollectionType(), range);
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
			if (elements.contains(integerValue)) {
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
		if (obj instanceof SequenceRangeImpl) {
			SequenceRangeImpl that = (SequenceRangeImpl)obj;
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
		return elements;
	}

//    public Type getType(TypeManager typeManager, Type staticType) {
//    	if (type == null) {
//    		if ((elements.getFirst() >= 0) && (elements.getLast() >= 0)) {
//    			type = typeManager.getCollectionType(true, false, typeManager.getUnlimitedNaturalType());
//    		}
//    		else{
//    			type = typeManager.getCollectionType(true, false, typeManager.getIntegerType());
//    		}
//    	}
//		return type;
//	}

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
		IntegerValue previousValue = elements.getFirst().subtract(valueFactory.getOne());
		if (value.equals(previousValue)) {
			IntegerRange range = valueFactory.createRange(previousValue, elements.getLast());
			return new SequenceRangeImpl(valueFactory, getCollectionType(), range);
		}
		else {
			List<Value> elements = createElements();
			elements.add(0, value);
			return valueFactory.createSequenceValue(getCollectionType(), elements);
		}
	}

//	@Override
//	public SequenceValue reverse() {
//		return new IntegerRangeValueImpl(valueFactory, getCollectionType(), elements.getLast(), elements.getFirst());
//	}

//	public SequenceValue subSequence(int lower, int upper) {
		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Iterator<Value> toIteratorValue() throws InvalidValueException {
		return getElements().iterator();
	}

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