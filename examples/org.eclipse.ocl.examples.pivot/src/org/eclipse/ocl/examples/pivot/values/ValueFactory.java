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
 * $Id: ValueFactory.java,v 1.6 2011/05/07 16:41:16 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;

public interface ValueFactory
{
	BooleanValue booleanValueOf(boolean value);
	
    BagValue createBagOf(Object... objects);
    BagValue createBagOf(Iterable<?> objects);
	BagValue createBagValue(CollectionType type, Value... values);
	BagValue createBagValue(CollectionType type, Bag<? extends Value> values);
	BagValue createBagValue(CollectionType type, Collection<? extends Value> values);
	BagValue createBagValue(Value... values);
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @return the new collection
	 */
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Value... values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Collection<Value> values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Type elementType, Value... values);
	CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Type elementType, Collection<Value> values);
	
	<E extends Element> ElementValue<E> createElementValue(E element);

//	IntegerRange createRange(IntegerValue firstInteger, IntegerValue lastInteger) throws InvalidValueException;
	
//	ObjectValue createObjectValue(Object object);

    OrderedSetValue createOrderedSetOf(Object... objects);
    OrderedSetValue createOrderedSetOf(Iterable<?> objects);
	OrderedSetValue createOrderedSetValue(CollectionType type, Value... values);
	OrderedSetValue createOrderedSetValue(CollectionType type, OrderedSet<? extends Value> values);
	OrderedSetValue createOrderedSetValue(CollectionType type, Collection<? extends Value> values);
	OrderedSetValue createOrderedSetValue(Value... value);

//	SequenceValue createSequenceAccumulatorValue(CollectionType type, List<Value> values);
    SequenceValue createSequenceOf(Object... objects);
    SequenceValue createSequenceOf(Iterable<?> objects);
//	SequenceValue createSequenceRange(CollectionType type, IntegerRange range);
	SequenceValue createSequenceValue(CollectionType type, Value... values);
	SequenceValue createSequenceValue(CollectionType type, List<? extends Value> values);
	SequenceValue createSequenceValue(CollectionType type, Collection<? extends Value> values);
	SequenceValue createSequenceValue(Value... value);
	
    SetValue createSetOf(Object... objects);
    SetValue createSetOf(Iterable<?> objects);
	SetValue createSetValue(CollectionType type, Value... values);
	SetValue createSetValue(CollectionType type, Set<? extends Value> values);
	SetValue createSetValue(CollectionType type, Collection<? extends Value> values);
	SetValue createSetValue(Value... value);
	
	Value createTupleValue(TupleType type, Map<? extends TypedElement, Value> values);

	Value createTypeValue(ClassifierType type);

	void dispose();

	Type getCommonType(Type firstType, Type secondType);
	Object getEcoreValueOf(Value result);
    Type getElementType(Value... values);
    Type getElementType(Iterable<Value> values);

	BooleanValue getFalse();
	InvalidValue getInvalid();
	NullValue getNull();
	IntegerValue getOne();
	StandardLibrary getStandardLibrary();
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

	Type typeOf(Value value, Value... values);

	Value valueOf(Object object);
	Value valueOf(Object eValue, ETypedElement eFeature);
}
 