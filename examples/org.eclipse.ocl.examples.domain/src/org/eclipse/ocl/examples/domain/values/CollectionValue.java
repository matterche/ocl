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
 * $Id: CollectionValue.java,v 1.6 2011/04/25 09:49:15 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;

public interface CollectionValue extends Value, Iterable<Value>
{
	interface Accumulator extends CollectionValue {
		boolean add(Value value);	
	}

	Collection<Value> asCollection();	
	List<Value> asList();
    IntegerValue count(Value value) throws InvalidValueException;
	BooleanValue excludes(Value value) throws InvalidValueException;	
	BooleanValue excludesAll(CollectionValue c) throws InvalidValueException;
	CollectionValue excluding(Value value) throws InvalidValueException;
    CollectionValue flatten() throws InvalidValueException;
	boolean flatten(Collection<Value> flattenedElements) throws InvalidValueException;
	DomainCollectionType getCollectionType();
	String getKind();
    BooleanValue includes(Value value) throws InvalidValueException;	
    BooleanValue includesAll(CollectionValue c) throws InvalidValueException;
	CollectionValue including(Value value) throws InvalidValueException;
	int intSize();
	CollectionValue intersection(CollectionValue c) throws InvalidValueException;
	BooleanValue isEmpty() throws InvalidValueException;
	Iterator<Value> iterator();
	Value maxMin(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation binaryOperation) throws InvalidValueException;
	BooleanValue notEmpty() throws InvalidValueException;
	Set<TupleValue> product(CollectionValue c, DomainTupleType tupleType) throws InvalidValueException;   	
	CollectionValue selectByKind(DomainType typeValue) throws InvalidValueException;
	CollectionValue selectByType(DomainType typeValue) throws InvalidValueException;
	IntegerValue size() throws InvalidValueException;
	SequenceValue sort(Comparator<Value> comparator) throws InvalidValueException;
	Value sum(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation binaryOperation, Value zero) throws InvalidValueException;
	SequenceValue toSequenceValue() throws InvalidValueException;
    CollectionValue union(CollectionValue c) throws InvalidValueException;
}
