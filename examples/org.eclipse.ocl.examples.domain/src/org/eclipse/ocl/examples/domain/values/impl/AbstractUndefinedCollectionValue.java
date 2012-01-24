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
 * $Id: AbstractUndefinedCollectionValue.java,v 1.5 2011/04/25 09:49:14 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.SequenceValue;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.domain.values.UniqueCollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractUndefinedCollectionValue extends AbstractUndefinedValue
{	
	private static class Iterator implements java.util.Iterator<Value>
	{
		public boolean hasNext() {
			return false;
		}

		public Value next() {
			return null;
		}

		public void remove() {
		}
	}

	protected AbstractUndefinedCollectionValue(ValueFactory valueFactory) {
		super(valueFactory);
	}

	public SequenceValue append(Value object) throws InvalidValueException {
		return toInvalidValue();
	}

	public Collection<Value> asCollection() {
		return null;
	}

	public List<Value> asList() {
		return null;
	}

	public Value at(int index) throws InvalidValueException {
		return toInvalidValue();
	}

    public IntegerValue count(Value value) throws InvalidValueException {
        return toInvalidValue();
    }

	public CollectionValue createNew() throws InvalidValueException {
		return toInvalidValue();
	}

//	@Override
//	public int hashCode() {
//		return elements.hashCode();
//	}

    public BooleanValue excludes(Value value) throws InvalidValueException {
    	return toInvalidValue();
    }


    public BooleanValue excludesAll(CollectionValue c) throws InvalidValueException {
    	return toInvalidValue();
    }

	public CollectionValue excluding(Value value) throws InvalidValueException {
		return toInvalidValue();
	}

    public Value first() throws InvalidValueException {
		return toInvalidValue();
	}

	public CollectionValue flatten() throws InvalidValueException {
    	return toInvalidValue();
    }

	public boolean flatten(Collection<Value> flattenedElements) {
		return false;
	}

	public DomainCollectionType getCollectionType() {
		return (DomainCollectionType) getType();
	}
	
	public String getKind() {
	    return "Collection";		// FIXME UOE ??
	}

    public BooleanValue includes(Value value) throws InvalidValueException {
    	return toInvalidValue();
    }

    public BooleanValue includesAll(CollectionValue c) throws InvalidValueException {
    	return toInvalidValue();
   }

	public CollectionValue including(Value value) throws InvalidValueException {
		return toInvalidValue();
	}

	public IntegerValue indexOf(Value object) throws InvalidValueException {
		return toInvalidValue();
	}

	public SequenceValue insertAt(int index, Value object) throws InvalidValueException {
		return toInvalidValue();
	}

	public int intSize() {
		return 0;
	}

	public CollectionValue intersection(CollectionValue c) throws InvalidValueException {
		return toInvalidValue();
	}

	public BooleanValue isEmpty() throws InvalidValueException {
    	return toInvalidValue();
	}

	public Iterator iterator() {
		return new Iterator();
	}
	
	public Value last() throws InvalidValueException {
		return toInvalidValue();
	}

	public Value maxMin(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation binaryOperation) throws InvalidValueException {
    	return toInvalidValue();
	}

	public NullValue minus(UniqueCollectionValue set) throws InvalidValueException {
		return toInvalidValue();
	}

	public BooleanValue notEmpty() throws InvalidValueException {
    	return toInvalidValue();
	}

	public SequenceValue prepend(Value object) throws InvalidValueException {
		return toInvalidValue();
	}

	public Set<TupleValue> product(CollectionValue c, DomainTupleType tupleType) {
		return null;
	}

	public SequenceValue reverse() throws InvalidValueException {
		return toInvalidValue();
	}

/*	public CollectionValue selectAsType(Type elementType) throws InvalidValueException {
    	return toInvalidValue();
	}

	public CollectionValue selectByKind(Type elementType) throws InvalidValueException {
    	return toInvalidValue();
	} */

	public IntegerValue size() throws InvalidValueException {
    	return toInvalidValue();
	}

    public SequenceValue sort(Comparator<Value> comparator) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue subOrderedSet(int lower, int upper) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue subSequence(int lower, int upper) throws InvalidValueException {
		return toInvalidValue();
	}

	public Value sum(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation binaryOperation, Value zero) throws InvalidValueException {
    	return toInvalidValue();
	}

	public NullValue symmetricDifference(UniqueCollectionValue set) throws InvalidValueException {
		return toInvalidValue();
	}
    
	public SequenceValue toSequenceValue() {
		return this;
	}

	public CollectionValue union(CollectionValue c) {
        return this;
    }
}
