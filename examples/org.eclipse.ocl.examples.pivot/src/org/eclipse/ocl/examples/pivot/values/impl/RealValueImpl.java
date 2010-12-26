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
 * $Id: RealValueImpl.java,v 1.1.2.1 2010/12/26 15:21:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.NumericValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;

public class RealValueImpl extends AbstractValue implements RealValue
{
	private static final int MINIMUM_SCALE = Double.SIZE/2;		// Gives nearly twice the precision of Double

	protected static RealValue divideBigDecimal(BigDecimal left, BigDecimal right) {
		try {
			if (right.signum() == 0) {
				return null;
			}
			int scale = Math.max(left.scale() - right.scale(), MINIMUM_SCALE);
			BigDecimal result = left.divide(right, scale, RoundingMode.HALF_EVEN);
			return valueOf(result);
		} catch (ArithmeticException e) {
			return new InvalidValueImpl(null, null, "Divide failure", e);
		}
	}

	public static RealValue valueOf(double value) {
		return new RealValueImpl(value);
	}

	public static RealValue valueOf(BigDecimal value) {
		return new RealValueImpl(value);
	}

//	public static RealValue valueOf(IntegerValue value) {
//		return new RealValueImpl(value.bigDecimalValue());
//	}
	
	public static RealValue valueOf(String aValue) {
		return new RealValueImpl(new BigDecimal(aValue.trim()));
	}

	private final BigDecimal value;
	private IntegerValue integerValue = null;	// Lazily computed exact IntegerValue or InvalidValue
	
	private RealValueImpl(double value) {
		this(BigDecimal.valueOf(value));
	}

	private RealValueImpl(BigDecimal value) {
		this.value = value;
		assert value != null;
	}

	public RealValue abs() {
		return valueOf(value.abs());
	}

	public RealValue add(RealValue right) {
		return valueOf(value.add(right.bigDecimalValue()));
	}

	@Override
	public RealValue asRealValue() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		return value;
	}

	public int compareTo(NumericValue o) {
		RealValue that = o.toRealValue();
		if (that instanceof RealValue) {
			return value.compareTo(((RealValue)that).bigDecimalValue());
		}
		else {
			return Double.compare(doubleValue(), o.doubleValue());
		}
	}

	public RealValue divide(RealValue right) {
		return divideBigDecimal(value, right.bigDecimalValue());
	}

	public double doubleValue() {
		return value.doubleValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RealValue) {
			BigDecimal bigDecimalValue = ((RealValue)obj).bigDecimalValue();
			return (bigDecimalValue != null) && (value.compareTo(bigDecimalValue) == 0);
		}
		if (obj instanceof IntegerValue) {
			return toIntegerValue().equals(obj);
		}
		if (obj instanceof NumericValue) {
			RealValue thatValue = ((NumericValue) obj).toRealValue();
			if (thatValue != null) {
				BigDecimal bigDecimalValue = ((RealValue)thatValue).bigDecimalValue();
				return (bigDecimalValue != null) && (value.compareTo(bigDecimalValue) == 0);
			}
		}
		return false;
	}

	public IntegerValue floor() {
		return IntegerValueImpl.valueOf(value.setScale(0, RoundingMode.FLOOR).toBigInteger());
	}

	@Override
	public int hashCode() {
		IntegerValue intValue = toIntegerValue();
		return intValue.hashCode();
	}

	public RealValue max(RealValue right) {
		return valueOf(value.max(right.bigDecimalValue()));
	}

	public RealValue min(RealValue right) {
		return valueOf(value.min(right.bigDecimalValue()));
	}

	public RealValue multiply(RealValue right) {
		return valueOf(value.multiply(right.bigDecimalValue()));
	}

	public RealValue negate() {
		return valueOf(value.negate());
	}
	
	public IntegerValue round() {
		BigDecimal rounded;
		if (value.signum() >= 0) {
			rounded = value.setScale(0, RoundingMode.HALF_UP);		// functions as HALF_AWAY
		}
		else {
			rounded = value.negate().setScale(0, RoundingMode.HALF_DOWN).negate();
		}
		return IntegerValueImpl.valueOf(rounded.toBigInteger());
	}

	public int signum() {
		return value.signum();
	}

	public RealValue subtract(RealValue right) {
		return valueOf(value.subtract(right.bigDecimalValue()));
	}

	public IntegerValue toIntegerValue() {
		if (integerValue == null) {
			try {
				BigInteger intValue = value.toBigIntegerExact();
				integerValue = IntegerValueImpl.valueOf(intValue);
			}
			catch (ArithmeticException e) {
				integerValue = new InvalidValueImpl(this, null, "not integer", e);			
			}
		}
		return integerValue;
	}

	@Override
	public RealValue toRealValue() {
		return this;
	}

	@Override
	public String toString() {
		return value.toString();
	}

//	public <T extends NumericValue> T toValue(Class<T> numericClass) {
//		if (numericClass.isAssignableFrom(RealValue.class)) {
//			return (T) this;
//		}
//		if (numericClass.isAssignableFrom(IntegerValue.class)) {
//			return (T) toIntegerValue();
//		}
//		return (T) ValueUtils.createInvalidValue(numericClass, null, "unsupported RealValue", null);
//	}
}
