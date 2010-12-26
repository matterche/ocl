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
 * $Id: IntegerValueImpl.java,v 1.1.2.1 2010/12/26 15:21:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.NumericValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;


public class IntegerValueImpl extends AbstractValue implements IntegerValue
{
	private static final String maxLongValue = Long.toString(Long.MAX_VALUE);
	private static final int maxLongSize = maxLongValue.length();

	public static IntegerValueImpl valueOf(long value) {
		return new IntegerValueImpl(value);
	}
	
	public static IntegerValueImpl valueOf(BigInteger value) {
		return new IntegerValueImpl(value);
	}
	
	/**
	 * Creates a BigInteger representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws NumberFormatException if representation cannot be created
	 * @since 3.1
	 */
	public static IntegerValueImpl valueOf(String aValue) {
		int len = aValue.length();
		if ((len < maxLongSize) || ((len == maxLongSize) && (maxLongValue.compareTo(aValue) >= 0))) {
			return new IntegerValueImpl(BigInteger.valueOf(Long.parseLong(aValue)));
		}
		else {
			return new IntegerValueImpl(new BigInteger(aValue));
		}
	}

	private final BigInteger value;
	
	private IntegerValueImpl(long value) {
		this(BigInteger.valueOf(value));
	}

	private IntegerValueImpl(BigInteger value) {
		this.value = value;
		assert value != null;
	}

	public IntegerValue abs() {
		return valueOf(value.abs());
	}

	public IntegerValue add(IntegerValue right) {
		return valueOf(value.add(right.bigIntegerValue()));
	}
	
	@Override
	public Integer asInteger() {
		return value.intValue();
	}

	@Override
	public IntegerValue asIntegerValue() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		return new BigDecimal(value);
	}

	public BigInteger bigIntegerValue() {
		return value;
	}

	public int compareTo(NumericValue o) {
		if (o instanceof IntegerValue) {
			return value.compareTo(((IntegerValue)o).bigIntegerValue());
		}
		else {
			return Double.compare(doubleValue(), o.doubleValue());
		}
	}

	public IntegerValue div(IntegerValue right) {
		if (right.bigIntegerValue().signum() == 0) {
			return null;
		}
		return valueOf(value.divide(right.bigIntegerValue()));
	}

	public RealValue divide(IntegerValue right) {
		BigDecimal bigLeft = bigDecimalValue();
		BigDecimal bigRight = right.bigDecimalValue();
		return RealValueImpl.divideBigDecimal(bigLeft, bigRight);
	}

	public double doubleValue() {
		return value.doubleValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof NumericValue) {
			obj = ((NumericValue)obj).toIntegerValue();
		}
		if (!(obj instanceof IntegerValue)) {
			return false;
		}
		return value.equals(((IntegerValue)obj).bigIntegerValue());
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public boolean isUnlimitedNatural() {
		return value.signum() >= 0;
	}

	public IntegerValue max(IntegerValue right) {
		return valueOf(value.max(right.bigIntegerValue()));
	}

	public IntegerValue min(IntegerValue right) {
		return valueOf(value.min(right.bigIntegerValue()));
	}

	public IntegerValue mod(IntegerValue right) {
		if (right.bigIntegerValue().signum() == 0) {
			return null;
		}
		return valueOf(value.remainder(right.bigIntegerValue()));
	}

	public IntegerValue multiply(IntegerValue right) {
		return valueOf(value.multiply(right.bigIntegerValue()));
	}

	public IntegerValue negate() {
		return valueOf(value.negate());
	}

	public int signum() {
		return value.signum();
	}

	public IntegerValue subtract(IntegerValue right) {
		return valueOf(value.subtract(right.bigIntegerValue()));
	}

	public IntegerValue toIntegerValue() {
		return this;
	}

	@Override
	public RealValue toRealValue() {
		return createRealValue(this);
	}

	@Override
	public String toString() {
		return value.toString();
	}

//	public <T extends NumericValue> T toValue(Class<T> numericClass) {
//		if (numericClass.isAssignableFrom(IntegerValue.class)) {
//			return (T) this;
//		}
//		if (numericClass.isAssignableFrom(RealValue.class)) {
//			return (T) toRealValue();
//		}
//		return (T) ValueUtils.createInvalidValue(numericClass, null, "unsupported IntegerValue", null);
//	}
}
