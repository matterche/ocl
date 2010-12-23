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
 * $Id: RealValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RealValue extends AbstractValue implements NumericValue
{
	private static final int MINIMUM_SCALE = Double.SIZE/2;		// Gives nearly twice the precision of Double

	protected static Value divideBigDecimal(BigDecimal left, BigDecimal right) {
		try {
			if (right.signum() == 0) {
				return null;
			}
			int scale = Math.max(left.scale() - right.scale(), MINIMUM_SCALE);
			BigDecimal result = left.divide(right, scale, RoundingMode.HALF_EVEN);
			return valueOf(result);
		} catch (ArithmeticException e) {
			return new InvalidValue(null, null, "Divide failure", e);
		}
	}

	public static RealValue valueOf(double value) {
		return new RealValue(value);
	}

	public static RealValue valueOf(BigDecimal value) {
		return new RealValue(value);
	}

	public static RealValue valueOf(IntegerValue value) {
		return new RealValue(value.bigDecimalValue());
	}
	
	public static RealValue valueOf(String aValue) {
		return new RealValue(new BigDecimal(aValue.trim()));
	}

	private final BigDecimal value;
	
	private RealValue(double value) {
		this(BigDecimal.valueOf(value));
	}

	private RealValue(BigDecimal value) {
		this.value = value;
		assert value != null;
	}

	public Value abs() {
		return valueOf(value.abs());
	}

	public Value add(RealValue right) {
		return valueOf(value.add(right.value));
	}

	@Override
	public RealValue asRealValue() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		return value;
	}

	public int compareTo(NumericValue o) {
		if (o instanceof IntegerValue) {
			return value.compareTo(((RealValue)o).value);
		}
		else {
			return Double.compare(doubleValue(), o.doubleValue());
		}
	}

	public Value divide(RealValue right) {
		return divideBigDecimal(value, right.value);
	}

	public double doubleValue() {
		return value.doubleValue();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof RealValue)) {
			return false;
		}
		return value.equals(((RealValue)obj).value);
	}
	
	public IntegerValue floor() {
		return IntegerValue.valueOf(value.setScale(0, RoundingMode.FLOOR).toBigInteger());
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public Value max(RealValue right) {
		return valueOf(value.max(right.value));
	}

	public Value min(RealValue right) {
		return valueOf(value.min(right.value));
	}

	public Value multiply(RealValue right) {
		return valueOf(value.multiply(right.value));
	}

	public Value negate() {
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
		return IntegerValue.valueOf(rounded.toBigInteger());
	}

	public Value subtract(RealValue right) {
		return valueOf(value.subtract(right.value));
	}

	@Override
	public RealValue toRealValue() {
		return this;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
