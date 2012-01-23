/**
 * <copyright>
 *
 * Copyright (c) 2010,2012 E.D.Willink and others.
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
package org.eclipse.ocl.examples.domain.values;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainElement;
import org.eclipse.ocl.examples.domain.elements.DomainEnumerationLiteral;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainTupleType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;

public interface ValueFactory
{
	BooleanValue booleanValueOf(boolean value);
		
    BagValue createBagOf(Object... objects);
    BagValue createBagOf(Iterable<?> objects);
	BagValue createBagValue(DomainCollectionType type, Value... values);
	BagValue createBagValue(DomainCollectionType type, Bag<? extends Value> values);
	BagValue createBagValue(DomainCollectionType type, Collection<? extends Value> values);
	BagValue createBagValue(Value... values);

	BooleanValue.Accumulator createBooleanAccumulatorValue();
	CollectionValue.Accumulator createCollectionAccumulatorValue(DomainCollectionType type);
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @return the new collection
	 */
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Value... values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Collection<Value> values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, DomainType elementType, Value... values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, DomainType elementType, Collection<Value> values);

	ObjectValue createEObjectValue(EObject eObject);	
	ElementValue createElementValue(DomainElement element);
	
	EnumerationLiteralValue createEnumerationLiteralValue(DomainEnumerationLiteral element);
	EnumerationLiteralValue createEnumerationLiteralValue(EEnumLiteral eEnumLiteral);
	EnumerationLiteralValue createEnumerationLiteralValue(Enumerator enumerator, EEnum eEnum);
	
	InvalidValue createInvalidValue(InvalidEvaluationException exception);
	InvalidValue createInvalidValue(InvalidValueException exception);

	ObjectValue createObjectValue(Object object);

    OrderedSetValue createOrderedSetOf(Object... objects);
    OrderedSetValue createOrderedSetOf(Iterable<?> objects);
	OrderedSetValue createOrderedSetValue(DomainCollectionType type, Value... values);
	OrderedSetValue createOrderedSetValue(DomainCollectionType type, OrderedSet<? extends Value> values);
	OrderedSetValue createOrderedSetValue(DomainCollectionType type, Collection<? extends Value> values);
	OrderedSetValue createOrderedSetValue(Value... value);

	IntegerRange createRange(IntegerValue firstInteger, IntegerValue lastInteger) throws InvalidValueException;

	SequenceValue createSequenceAccumulatorValue(DomainCollectionType type, List<Value> values);
    SequenceValue createSequenceOf(Object... objects);
    SequenceValue createSequenceOf(Iterable<?> objects);
	SequenceValue createSequenceRange(DomainCollectionType type, IntegerRange range);
	SequenceValue createSequenceValue(DomainCollectionType type, Value... values);
	SequenceValue createSequenceValue(DomainCollectionType type, List<? extends Value> values);
	SequenceValue createSequenceValue(DomainCollectionType type, Collection<? extends Value> values);
	SequenceValue createSequenceValue(Value... value);
	
    SetValue createSetOf(Object... objects);
    SetValue createSetOf(Iterable<?> objects);
	SetValue createSetValue(DomainCollectionType type, Value... values);
	SetValue createSetValue(DomainCollectionType type, Set<? extends Value> values);
	SetValue createSetValue(DomainCollectionType type, Collection<? extends Value> values);
	SetValue createSetValue(Value... value);
	
	TupleValue createTupleValue(DomainTupleType type, Map<? extends DomainTypedElement, Value> values);

	Value createTypeValue(DomainType type);

	void dispose();

	Object getEcoreValueOf(Value result);
    DomainType getElementType(Value... values);
    DomainType getElementType(Iterable<Value> values);

	BooleanValue getFalse();
	InvalidValue getInvalid();
	NullValue getNull();
	IntegerValue getOne();
	DomainStandardLibrary getStandardLibrary();
	BooleanValue getTrue();
	UnlimitedValue getUnlimited();
	IntegerValue getZero();
	
	IntegerValue integerValueOf(int value);
	IntegerValue integerValueOf(long value);
	IntegerValue integerValueOf(BigInteger value);
	IntegerValue integerValueOf(String aValue) throws InvalidValueException;
	
	RealValue realValueOf(double value);
	RealValue realValueOf(BigDecimal value);
	RealValue realValueOf(IntegerValue integerValue);	
	RealValue realValueOf(String aValue) throws InvalidValueException;
	
	StringValue stringValueOf(String value) ;
	
	InvalidValue throwInvalidValueException(String message, Object... bindings) throws InvalidValueException;

	DomainType typeOf(Value value, Value... values);

	Value valueOf(Object object);
	Value valueOf(Object eValue, EClassifier eClassifier);
	Value valueOf(Object eValue, ETypedElement eFeature);
}
 