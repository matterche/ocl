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
 * $Id: ValueFactory.java,v 1.1.2.2 2011/01/08 11:39:38 ewillink Exp $
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
import org.eclipse.ocl.examples.pivot.values.impl.ObjectValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.OrderedSetValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.RealValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SequenceValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SetValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.StringValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.TupleValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.TypeValueImpl;

public class ValueFactory
{
	public static BagValue createBagValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("bag-of-invalid");
		}
		return new BagValueImpl(values);
	}

	public static BagValue createBagValue(Bag<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("bag-of-invalid");
		}
		return new BagValueImpl(values);
	}

	public static BagValue createBagValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("bag-of-invalid");
		}
		return new BagValueImpl(values);
	}

    public static BooleanValue createBooleanValue(boolean b) {
		return b ? BooleanValueImpl.TRUE : BooleanValueImpl.FALSE;
	}
    
	/**
	 * Creates a new OCL <tt>Collection</tt> of the specified ordering and uniqueness.
     * 
	 * @param isOrdered the required collection ordering
	 * @param isUnique the required collection uniqueness
	 * @return the new collection
	 * @since 3.1
	 */
	public static CollectionValue createCollectionValue(boolean isOrdered, boolean isUnique) {
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
	public static CollectionValue createCollectionValue(CollectionKind kind, Value... values) {
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

	public static CollectionValue createCollectionValue(CollectionKind kind, Collection<Value> values) {
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

	
	public static <E extends Element> ElementValue<E> createElementValue(E element) {
		return new ElementValueImpl<E>(element);
	}

	public static IntegerValue createIntegerValue(String string) {
		return IntegerValueImpl.valueOf(string);
	}

	public static IntegerValue createIntegerValue(BigInteger value) {
		return IntegerValueImpl.valueOf(value);
	}

	public static IntegerValue createIntegerValue(long value) {
		return IntegerValueImpl.valueOf(value);
	}

	public static InvalidValue createInvalidValue(String reason) {
		return new InvalidValueImpl(null, null, reason, null);
	}

	public static InvalidValue createInvalidValue(Object object, OclExpression expression, String reason, Throwable throwable) {
		return new InvalidValueImpl(object, expression, reason, throwable);
	}

	public static OrderedSetValue createOrderedSetValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("ordered-set-of-invalid");
		}
		return new OrderedSetValueImpl(values);
	}

	public static OrderedSetValue createOrderedSetValue(LinkedHashSet<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("ordered-set-of-invalid");
		}
		return new OrderedSetValueImpl(values);
	}

	public static ObjectValue createObjectValue(Object object) {
		return new ObjectValueImpl(object);
	}

	public static OrderedSetValue createOrderedSetValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("ordered-set-of-invalid");
		}
		return new OrderedSetValueImpl(values);
	}

	public static RealValue createRealValue(double doubleValue) {
		return RealValueImpl.valueOf(doubleValue);
	}

	public static RealValue createRealValue(BigDecimal value) {
		return RealValueImpl.valueOf(value);
	}

	public static RealValue createRealValue(IntegerValue integerValue) {
		return RealValueImpl.valueOf(integerValue.bigDecimalValue());
	}

	public static RealValue createRealValue(String value) {
		return RealValueImpl.valueOf(value);
	}

	public static SequenceValue createSequenceValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("sequence-of-invalid");
		}
		return new SequenceValueImpl(values);
	}

	public static SequenceValue createSequenceValue(List<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("sequence-of-invalid");
		}
		return new SequenceValueImpl(values);
	}

	public static SequenceValue createSequenceValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("sequence-of-invalid");
		}
		return new SequenceValueImpl(values);
	}

	public static SetValue createSetValue(Value... values) {
		if (!isValid(values)) {
			return createInvalidValue("set-of-invalid");
		}
		return new SetValueImpl(values);
	}

	public static SetValue createSetValue(Set<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("set-of-invalid");
		}
		return new SetValueImpl(values);
	}

	public static SetValue createSetValue(Collection<? extends Value> values) {
		if (!isValid(values)) {
			return createInvalidValue("set-of-invalid");
		}
		return new SetValueImpl(values);
	}

	public static StringValue createStringValue(String value) {
		return StringValueImpl.valueOf(value);
	}

	public static Value createTupleValue(TupleType type, Map<? extends TypedElement, Value> values) {
		return new TupleValueImpl(type, values);
	}

	public static Value createTypeValue(Type type) {
		return new TypeValueImpl(type);
	}

	public static boolean isValid(Value[] elements) {
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
	
	public static boolean isValid(Collection<? extends Value> elements) {
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
}
 