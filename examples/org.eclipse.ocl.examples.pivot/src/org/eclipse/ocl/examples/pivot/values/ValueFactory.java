/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: ValueFactory.java,v 1.1.2.3 2011/01/08 15:35:07 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OrderedSetType;
import org.eclipse.ocl.examples.pivot.SequenceType;
import org.eclipse.ocl.examples.pivot.SetType;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.util.PivotPlugin;
import org.eclipse.ocl.examples.pivot.values.impl.BagValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.BooleanValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.ElementValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.IntegerValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.InvalidValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.NullValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.ObjectValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.OrderedSetValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.RealValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SequenceValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SetValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.StringValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.TupleValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.TypeValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.UnlimitedValueImpl;

public class ValueFactory
{
	public static final ValueFactory INSTANCE = new ValueFactory();
	public final BagValue EMPTY_BAG = new BagValueImpl(this);
	public final OrderedSetValue EMPTY_ORDERED_SET = new OrderedSetValueImpl(this);
	public final SequenceValue EMPTY_SEQUENCE = new SequenceValueImpl(this);	
	public final SetValue EMPTY_SET = new SetValueImpl(this);
	public final BooleanValue FALSE = new BooleanValueImpl(this, false); 
	public final NullValue NULL = new NullValueImpl(this); 
	public final BooleanValue TRUE = new BooleanValueImpl(this, true); 
	public final UnlimitedValue UNLIMITED = new UnlimitedValueImpl(this); 
	public final NumericValue ZERO = integerValueOf(0);

	private static final String maxLongValue = Long.toString(Long.MAX_VALUE);
	private static final int maxLongSize = maxLongValue.length();	
	
	public BooleanValue booleanValueOf(boolean value) {
		return value ? TRUE : FALSE;
	}
	
	public BagValue createBagValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("bag-of-invalid");
		}
		return new BagValueImpl(this, values);
	}

	public BagValue createBagValue(Bag<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("bag-of-invalid");
		}
		return new BagValueImpl(this, values);
	}

	public BagValue createBagValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("bag-of-invalid");
		}
		return new BagValueImpl(this, values);
	}
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @return the new collection
	 * @since 3.1
	 */
	public CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique) {
		if (isOrdered) {
			if (isUnique) {
				return createOrderedSetValue();
			}
			else {
				return createSequenceValue();
			}
		}
		else {
			if (isUnique) {
				return createSetValue();
			}
			else {
				return createBagValue();
			}
		}
	}
	public CollectionValue createCollectionValue(CollectionKind kind, Value... values) {
		switch (kind) {
			case BAG: return createBagValue(values);
			case ORDERED_SET: return createOrderedSetValue(values);
			case SEQUENCE: return createSequenceValue(values);
			case SET: return createSetValue(values);
		}
		String message = OCLMessages.bind(OCLMessages.OCLCollectionKindNotImpl_ERROR_, kind);
		IllegalArgumentException error = new IllegalArgumentException(message);
		PivotPlugin.throwing(ValueFactory.class, "createNewCollection", error);//$NON-NLS-1$
		throw error;
	}

	public CollectionValue createCollectionValue(CollectionKind kind, Collection<Value> values) {
		switch (kind) {
			case BAG: return createBagValue(values);
			case ORDERED_SET: return createOrderedSetValue(values);
			case SEQUENCE: return createSequenceValue(values);
			case SET: return createSetValue(values);
		}
		String message = OCLMessages.bind(OCLMessages.OCLCollectionKindNotImpl_ERROR_, kind);
		IllegalArgumentException error = new IllegalArgumentException(message);
		PivotPlugin.throwing(ValueFactory.class, "createNewCollection", error);//$NON-NLS-1$
		throw error;
	}

	
	public <E extends Element> ElementValue<E> createElementValue(E element) {
		return new ElementValueImpl<E>(this, element);
	}

	public InvalidValue createInvalidValue(String reason) {
		return new InvalidValueImpl(this, null, null, reason, null);
	}

	public InvalidValue createInvalidValue(Object object, OclExpression expression, String reason, Throwable throwable) {
		return new InvalidValueImpl(this, object, expression, reason, throwable);
	}

	public OrderedSetValue createOrderedSetValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("ordered-set-of-invalid");
		}
		return new OrderedSetValueImpl(this, values);
	}

	public OrderedSetValue createOrderedSetValue(LinkedHashSet<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("ordered-set-of-invalid");
		}
		return new OrderedSetValueImpl(this, values);
	}

	public ObjectValue createObjectValue(Object object) {
		return new ObjectValueImpl(this, object);
	}

	public OrderedSetValue createOrderedSetValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("ordered-set-of-invalid");
		}
		return new OrderedSetValueImpl(this, values);
	}

	public SequenceValue createSequenceValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("sequence-of-invalid");
		}
		return new SequenceValueImpl(this, values);
	}

	public SequenceValue createSequenceValue(List<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("sequence-of-invalid");
		}
		return new SequenceValueImpl(this, values);
	}

	public SequenceValue createSequenceValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("sequence-of-invalid");
		}
		return new SequenceValueImpl(this, values);
	}

	public SetValue createSetValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("set-of-invalid");
		}
		return new SetValueImpl(this, values);
	}

	public SetValue createSetValue(Set<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("set-of-invalid");
		}
		return new SetValueImpl(this, values);
	}

	public SetValue createSetValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("set-of-invalid");
		}
		return new SetValueImpl(this, values);
	}

	public Value createTupleValue(TupleType type, Map<? extends TypedElement, Value> values) {
		return new TupleValueImpl(this, type, values);
	}

	public Value createTypeValue(Type type) {
		return new TypeValueImpl(this, type);
	}

	public IntegerValue integerValueOf(long value) {
		return new IntegerValueImpl(this, value);
	}
	
	public IntegerValue integerValueOf(BigInteger value) {
		return new IntegerValueImpl(this, value);
	}
	
	/**
	 * Creates a BigInteger representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws NumberFormatException if representation cannot be created
	 * @since 3.1
	 */
	public IntegerValue integerValueOf(String aValue) {
		int len = aValue.length();
		if ((len < maxLongSize) || ((len == maxLongSize) && (maxLongValue.compareTo(aValue) >= 0))) {
			return new IntegerValueImpl(this, BigInteger.valueOf(Long.parseLong(aValue)));
		}
		else {
			return new IntegerValueImpl(this, new BigInteger(aValue));
		}
	}

	public boolean isValid(Value[] elements) {
		if (elements == null) {
			return false;			
		}
		for (Value element : elements) {
			if (element.isInvalid()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isValid(Collection<? extends Value> elements) {
		if (elements == null) {
			return false;			
		}
		for (Value element : elements) {
			if (element.isInvalid()) {
				return false;
			}
		}
		return true;
	}

	public RealValue realValueOf(double value) {
		return new RealValueImpl(this, value);
	}

	public RealValue realValueOf(BigDecimal value) {
		return new RealValueImpl(this, value);
	}

//	public static RealValue realValueOf(IntegerValue value) {
//		return new RealValueImpl(value.bigDecimalValue());
//	}

	public RealValue realValueOf(IntegerValue integerValue) {
		return realValueOf(integerValue.bigDecimalValue());
	}
	
	public RealValue realValueOf(String aValue) {
		return new RealValueImpl(this, new BigDecimal(aValue.trim()));
	}
	
	public StringValue stringValueOf(String value) {
		return new StringValueImpl(this, value);
	}

}
 