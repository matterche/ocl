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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
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
import org.eclipse.ocl.examples.pivot.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.pivot.values.Bag;
import org.eclipse.ocl.examples.pivot.values.BagValue;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.InvalidValue;
import org.eclipse.ocl.examples.pivot.values.NullValue;
import org.eclipse.ocl.examples.pivot.values.OrderedSet;
import org.eclipse.ocl.examples.pivot.values.OrderedSetValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;
import org.eclipse.ocl.examples.pivot.values.SequenceValue;
import org.eclipse.ocl.examples.pivot.values.SetValue;
import org.eclipse.ocl.examples.pivot.values.StringValue;
import org.eclipse.ocl.examples.pivot.values.UnlimitedValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.osgi.util.NLS;

public abstract class AbstractValueFactory implements ValueFactory
{
	public static final BigInteger INTEGER_MAX_VALUE = BigInteger.valueOf(Integer.MAX_VALUE);
	public static final BigInteger INTEGER_MIN_VALUE = BigInteger.valueOf(Integer.MIN_VALUE);
	public static final BigInteger LONG_MAX_VALUE = BigInteger.valueOf(Long.MAX_VALUE);
	public static final BigInteger LONG_MIN_VALUE = BigInteger.valueOf(Long.MIN_VALUE);
	private static final String maxLongValue = Long.toString(Long.MAX_VALUE);
	private static final int maxLongSize = maxLongValue.length();	

	private BooleanValue falseValue; 
	private InvalidValue invalidValue; 
	private NullValue nullValue; 
	private IntegerValue oneValue;
	private BooleanValue trueValue; 
	private UnlimitedValue unlimitedValue; 
	private IntegerValue zeroValue;

	protected final StandardLibrary standardLibrary;
	
	public AbstractValueFactory(StandardLibrary standardLibrary) {
		this.standardLibrary = standardLibrary;
	}

	public BooleanValue booleanValueOf(boolean value) {
		return value ? getTrue() : getFalse();
	}

    public BagValue createBagOf(Object... objects) {
    	Bag<Value> collection = new BagImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createBagValue(standardLibrary.getBagType(elementType), collection);
    }

    public BagValue createBagOf(Iterable<?> objects) {
    	Bag<Value> collection = new BagImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createBagValue(standardLibrary.getBagType(elementType), collection);
    }
	
	public BagValue createBagValue(CollectionType type, Value... values) {
		return new BagValueImpl(this, type, values);
	}

	public BagValue createBagValue(CollectionType type, Bag<? extends Value> values) {
		return new BagValueImpl(this, type, values);
	}

	public BagValue createBagValue(CollectionType type, Collection<? extends Value> values) {
		return new BagValueImpl(this, type, values);
	}

	public BagValue createBagValue(Value... values) {
		Type elementType = getElementType(values);
		CollectionType collectionType = standardLibrary.getBagType(elementType);
		return new BagValueImpl(this, collectionType, values);
	}
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @param values the required collection contents
	 * @return the new collection
	 */
	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Value... values) {
		return createCollectionValue(isOrdered, isUnique, getElementType(values), values);
	}

	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Collection<Value> values) {
		return createCollectionValue(isOrdered, isUnique, getElementType(values), values);
	}

	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Type elementType, Value... values) {
		if (isOrdered) {
			if (isUnique) {
				return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), values);
			}
			else {
				return createSequenceValue(standardLibrary.getSequenceType(elementType), values);
			}
		}
		else {
			if (isUnique) {
				return createSetValue(standardLibrary.getSetType(elementType), values);
			}
			else {
				return createBagValue(standardLibrary.getBagType(elementType), values);
			}
		}
	}

    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @param values the required collection contents
	 * @return the new collection
	 */
	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique, Type elementType, Collection<Value> values) {
		if (isOrdered) {
			if (isUnique) {
				return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), values);
			}
			else {
				return createSequenceValue(standardLibrary.getSequenceType(elementType), values);
			}
		}
		else {
			if (isUnique) {
				return createSetValue(standardLibrary.getSetType(elementType), values);
			}
			else {
				return createBagValue(standardLibrary.getBagType(elementType), values);
			}
		}
	}
	
//	public <E extends Element> ElementValue<E> createElementValue(E element) {
//		return new ElementValueImpl<E>(this, element);
//	}

//	public ObjectValue createObjectValue(Object object) {
//		return new ObjectValueImpl(this, object);
//	}

    public OrderedSetValue createOrderedSetOf(Object... objects) {
    	OrderedSet<Value> collection = new OrderedSetImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), collection);
    }

    public OrderedSetValue createOrderedSetOf(Iterable<?> objects) {
    	OrderedSet<Value> collection = new OrderedSetImpl<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createOrderedSetValue(standardLibrary.getOrderedSetType(elementType), collection);
    }

	public OrderedSetValue createOrderedSetValue(CollectionType type, Value... values) {
		return new OrderedSetValueImpl(this, type, values);
	}

	public OrderedSetValue createOrderedSetValue(CollectionType type, OrderedSet<? extends Value> values) {
		return new OrderedSetValueImpl(this, type, values);
	}

	public OrderedSetValue createOrderedSetValue(CollectionType type, Collection<? extends Value> values) {
		return new OrderedSetValueImpl(this, type, values);
	}

	public OrderedSetValue createOrderedSetValue(Value... values) {
		Type elementType = getElementType(values);
		CollectionType collectionType = standardLibrary.getOrderedSetType(elementType);
		return new OrderedSetValueImpl(this, collectionType, values);
	}

    public SequenceValue createSequenceOf(Object... objects) {
    	List<Value> collection = new ArrayList<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createSequenceValue(standardLibrary.getSequenceType(elementType), collection);
    }

    public SequenceValue createSequenceOf(Iterable<?> objects) {
    	List<Value> collection = new ArrayList<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createSequenceValue(standardLibrary.getSequenceType(elementType), collection);
    }

	public SequenceValue createSequenceValue(CollectionType type, Value... values) {
		return new SequenceValueImpl(this, type, values);
	}

	public SequenceValue createSequenceValue(CollectionType type, List<? extends Value> values) {
		return new SequenceValueImpl(this, type, values);
	}

	public SequenceValue createSequenceValue(CollectionType type, Collection<? extends Value> values) {
		return new SequenceValueImpl(this, type, values);
	}

	public SequenceValue createSequenceValue(Value... values) {
		Type elementType = getElementType(values);
		CollectionType collectionType = standardLibrary.getSequenceType(elementType);
		return new SequenceValueImpl(this, collectionType, values);
	}

    public SetValue createSetOf(Object... objects) {
    	Set<Value> collection = new HashSet<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createSetValue(standardLibrary.getSetType(elementType), collection);
    }

    public SetValue createSetOf(Iterable<?> objects) {
    	Set<Value> collection = new HashSet<Value>();
    	if (objects != null) {
    		for (Object object : objects) {
 				collection.add(valueOf(object));
    		}
    	}
    	Type elementType = getElementType(collection);
    	return createSetValue(standardLibrary.getSetType(elementType), collection);
    }

	public SetValue createSetValue(CollectionType type, Value... values) {
		return new SetValueImpl(this, type, values);
	}

	public SetValue createSetValue(CollectionType type, Set<? extends Value> values) {
		return new SetValueImpl(this, type, values);
	}

	public SetValue createSetValue(CollectionType type, Collection<? extends Value> values) {
		return new SetValueImpl(this, type, values);
	}

	public SetValue createSetValue(Value... values) {
		Type elementType = getElementType(values);
		CollectionType collectionType = standardLibrary.getSetType(elementType);
		return new SetValueImpl(this, collectionType, values);
	}

	public Value createTupleValue(TupleType type, Map<? extends TypedElement, Value> values) {
		return new TupleValueImpl(this, type, values);
	}

	public Value createTypeValue(ClassifierType type) {
		return new TypeValueImpl(this, type);
	}

	public void dispose() {
		falseValue = null; 
		invalidValue = null; 
		nullValue = null; 
		oneValue = null;
		trueValue = null; 
		unlimitedValue = null; 
		zeroValue = null;
	}
	
    public Type getElementType(Value... values) {
    	Type elementType = standardLibrary.getOclVoidType();
    	for (Value value : values) {
    		elementType = getCommonType(elementType, value.getType());
    	}
     	return elementType;
    }

    public Type getElementType(Iterable<Value> values) {
    	Type elementType = standardLibrary.getOclVoidType();
    	for (Value value : values) {
    		elementType = getCommonType(elementType, value.getType());
    	}
     	return elementType;
    }

	public BooleanValue getFalse() {
		if (falseValue == null) {
			falseValue = new BooleanValueImpl(this, standardLibrary.getBooleanType(), false); 
		}
		return falseValue;
	}

	public InvalidValue getInvalid() {
		if (invalidValue == null) {
			invalidValue = new InvalidValueImpl(this, standardLibrary.getOclInvalidType()); 
		}
		return invalidValue;
	}

	public NullValue getNull() {
		if (nullValue == null) {
			nullValue = new NullValueImpl(this, standardLibrary.getOclVoidType()); 
		}
		return nullValue;
	}

	public IntegerValue getOne() {
		if (oneValue == null) {
			oneValue = integerValueOf(1);
		}
		return oneValue;
	}
	
	public final StandardLibrary getStandardLibrary() {
		return standardLibrary;
	}

	public BooleanValue getTrue() {
		if (trueValue == null) {
			trueValue = new BooleanValueImpl(this, standardLibrary.getBooleanType(), true); 
		}
		return trueValue;
	}

	public UnlimitedValue getUnlimited() {
		if (unlimitedValue == null) {
			unlimitedValue = new UnlimitedValueImpl(this, standardLibrary.getUnlimitedNaturalType());
		}
		return unlimitedValue;
	}

	public IntegerValue getZero() {
		if (zeroValue == null) {
			zeroValue = integerValueOf(0);
		}
		return zeroValue;
	}

	public IntegerValue integerValueOf(int value) {
		Type type = value >= 0 ? standardLibrary.getUnlimitedNaturalType() : standardLibrary.getIntegerType();
		return new IntegerIntValueImpl(this, type, value);
	}

	public IntegerValue integerValueOf(long value) {
		Type type = value >= 0 ? standardLibrary.getUnlimitedNaturalType() : standardLibrary.getIntegerType();
		if ((Integer.MIN_VALUE <= value) && (value <= Integer.MAX_VALUE)) {
			return new IntegerIntValueImpl(this, type, (int) value);
		}
		else {
			return new IntegerLongValueImpl(this, type, value);
		}
	}
	
	public IntegerValue integerValueOf(BigInteger value) {
		Type type;
		if (value.signum() >= 0) {
			type = standardLibrary.getUnlimitedNaturalType();
			if (value.compareTo(INTEGER_MAX_VALUE) <= 0) {
				return new IntegerIntValueImpl(this, type, value.intValue());
			}
			if (value.compareTo(LONG_MAX_VALUE) <= 0) {
				return new IntegerLongValueImpl(this, type, value.longValue());
			}
		}
		else {
			type = standardLibrary.getIntegerType();
			if (value.compareTo(INTEGER_MIN_VALUE) >= 0) {
				return new IntegerIntValueImpl(this, type, value.intValue());
			}
			if (value.compareTo(LONG_MIN_VALUE) >= 0) {
				return new IntegerLongValueImpl(this, type, value.longValue());
			}
		}
		return new IntegerValueImpl(this, type, value);
	}
	
	/**
	 * Creates a BigInteger representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws InvalidValueException if representation cannot be created
	 * @since 3.1
	 */
	public IntegerValue integerValueOf(String aValue) throws InvalidValueException {
		try {
			int len = aValue.length();
			if ((len < maxLongSize) || ((len == maxLongSize) && (maxLongValue.compareTo(aValue) >= 0))) {
				return integerValueOf(BigInteger.valueOf(Long.parseLong(aValue)));
			}
			else {
				return integerValueOf(new BigInteger(aValue));
			}
		}
		catch (NumberFormatException e) {
			return throwInvalidValueException(e, EvaluatorMessages.InvalidInteger, aValue);
		}
	}

	public RealValue realValueOf(double value) {
		return new RealValueImpl(this, standardLibrary.getRealType(), value);
	}

	public RealValue realValueOf(BigDecimal value) {
		return new RealValueImpl(this, standardLibrary.getRealType(), value);
	}

//	public static RealValue realValueOf(IntegerValue value) {
//		return new RealValueImpl(value.bigDecimalValue());
//	}

	public RealValue realValueOf(IntegerValue integerValue) {
		return realValueOf(integerValue.bigDecimalValue());
	}
	
	public RealValue realValueOf(String aValue) throws InvalidValueException {
		try {
			return new RealValueImpl(this, standardLibrary.getRealType(), new BigDecimal(aValue.trim()));
		}
		catch (NumberFormatException e) {
			return throwInvalidValueException(e, EvaluatorMessages.InvalidReal, aValue);
		}
	}
	
	public StringValue stringValueOf(String value) {
		return new StringValueImpl(this, standardLibrary.getStringType(), value);
	}

	public InvalidValue throwInvalidValueException(String message, Object... bindings) throws InvalidValueException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidValueException(boundMessage);
	}

	public InvalidValue throwInvalidValueException(Throwable e, String message, Object... bindings) throws InvalidValueException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidValueException(boundMessage, e);
	}

	public Type typeOf(Value value, Value... values) {
		Type type = value.getType();
		if (values != null) {
			for (Value anotherValue : values) {
				type = getCommonType(type, anotherValue.getType());
			}		
		}
		return type;
	}

	public Value valueOf(Object object) {
		if (object instanceof Value) {
			return (Value) object;
		}
		if (object instanceof Number) {
			if ((object instanceof Integer) || (object instanceof Long)
					|| (object instanceof Short)) {
				return integerValueOf(((Number) object).longValue());
			}
			if ((object instanceof Float) || (object instanceof Double)) {
				return realValueOf(((Number) object).doubleValue());
			}
			if (object instanceof BigDecimal) {
				return realValueOf((BigDecimal) object);
			}
			if (object instanceof BigInteger) {
				return integerValueOf((BigInteger) object);
			}			
		}
		if (object instanceof String) {
			return stringValueOf((String) object);
		}
		if (object instanceof Boolean) {
			return booleanValueOf((Boolean) object);
		}
		if (object instanceof Element) {
			if (object instanceof ClassifierType) {
				return createTypeValue((ClassifierType) object);
			}
			return createElementValue((Element) object);
		}
		if (object == null) {
			return getNull();
		}
		if (object.getClass().isArray()) {
			try {
				return createSequenceOf((Object[])object);
			} 
			catch (IllegalArgumentException e) {}
		}
		if (object instanceof Iterable<?>) {
			if ((object instanceof LinkedHashSet) || (object instanceof OrderedSet)) {
				return createOrderedSetOf((Iterable<?>)object);
			}
			else if (object instanceof Bag) {
				return createBagOf((Iterable<?>)object);
			}
			else if (object instanceof Set) {
				return createSetOf((Iterable<?>)object);
			}
			else {
				return createSequenceOf((Iterable<?>)object);
			}
		}
		return null;
	}

	public Value valueOf(Object eValue, ETypedElement eFeature) {
		if (eFeature.isMany()) {
			Collection<?> eValues = (Collection<?>) eValue;
			ArrayList<Value> values = new ArrayList<Value>(eValues.size());
			for (Object eVal : eValues) {
				values.add(valueOf(eVal));
			}
			boolean isOrdered = eFeature.isOrdered();
			boolean isUnique = eFeature.isUnique();
			return createCollectionValue(isOrdered, isUnique, values);
		}
		else if (eValue instanceof Value) {
			return (Value) eValue;		
		}
		else {
			return valueOf(eValue);
		}
	}
}
 