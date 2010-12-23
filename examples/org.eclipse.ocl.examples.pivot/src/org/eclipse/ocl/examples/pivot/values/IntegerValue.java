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
 * $Id: IntegerValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.math.BigDecimal;
import java.math.BigInteger;


public class IntegerValue extends AbstractValue implements NumericValue
{
	private static final String maxLongValue = Long.toString(Long.MAX_VALUE);
	private static final int maxLongSize = maxLongValue.length();

	public static IntegerValue valueOf(long value) {
		return new IntegerValue(value);
	}
	
	public static IntegerValue valueOf(BigInteger value) {
		return new IntegerValue(value);
	}
	
	/**
	 * Creates a BigInteger representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws NumberFormatException if representation cannot be created
	 * @since 3.1
	 */
	public static IntegerValue valueOf(String aValue) {
		int len = aValue.length();
		if ((len < maxLongSize) || ((len == maxLongSize) && (maxLongValue.compareTo(aValue) >= 0))) {
			return new IntegerValue(BigInteger.valueOf(Long.parseLong(aValue)));
		}
		else {
			return new IntegerValue(new BigInteger(aValue));
		}
	}

	private final BigInteger value;
	
	private IntegerValue(long value) {
		this(BigInteger.valueOf(value));
	}

	private IntegerValue(BigInteger value) {
		this.value = value;
		assert value != null;
	}

	public Value abs() {
		return valueOf(value.abs());
	}

	public Value add(IntegerValue right) {
		return valueOf(value.add(right.value));
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

	public int compareTo(NumericValue o) {
		if (o instanceof IntegerValue) {
			return value.compareTo(((IntegerValue)o).value);
		}
		else {
			return Double.compare(doubleValue(), o.doubleValue());
		}
	}

	public Value div(IntegerValue right) {
		if (right.value.signum() == 0) {
			return null;
		}
		return valueOf(value.divide(right.value));
	}

	public Value divide(IntegerValue right) {
		return RealValue.divideBigDecimal(new BigDecimal(value), new BigDecimal(right.value));
	}

	public double doubleValue() {
		return value.doubleValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof IntegerValue)) {
			return false;
		}
		return value.equals(((IntegerValue)obj).value);
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public boolean isUnlimitedNatural() {
		return value.signum() >= 0;
	}

	public Value max(IntegerValue right) {
		return valueOf(value.max(right.value));
	}

	public Value min(IntegerValue right) {
		return valueOf(value.min(right.value));
	}

	public Value mod(IntegerValue right) {
		if (right.value.signum() == 0) {
			return null;
		}
		return valueOf(value.remainder(right.value));
	}

	public Value multiply(IntegerValue right) {
		return valueOf(value.multiply(right.value));
	}

	public Value negate() {
		return valueOf(value.negate());
	}

	public Value subtract(IntegerValue right) {
		return valueOf(value.subtract(right.value));
	}

	@Override
	public RealValue toRealValue() {
		return RealValue.valueOf(this);
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
