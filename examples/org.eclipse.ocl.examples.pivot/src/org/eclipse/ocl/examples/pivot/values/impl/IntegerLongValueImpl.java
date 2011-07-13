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
 * $Id: IntegerValueImpl.java,v 1.4 2011/02/21 08:37:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.NumericValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;


public class IntegerLongValueImpl extends AbstractValue implements IntegerValue
{
	private final long value;
	private BigInteger bigValue = null;
	
	public IntegerLongValueImpl(ValueFactory valueFactory, long value) {
		super(valueFactory);
		this.value = value;
	}

	public IntegerValue abs() {
		if (value >= 0) {
			return this;
		}
		else if (value > Long.MIN_VALUE) {
			return valueFactory.integerValueOf(-value);
		}
		else {
			return valueFactory.integerValueOf(BigInteger.ONE.shiftLeft(Long.SIZE-1));
		}
	}

	public IntegerValue add(IntegerValue right) {
		if (right instanceof IntegerLongValueImpl) {
			long thatValue = ((IntegerLongValueImpl)right).longValue();
			long sum = value + thatValue;
			if (value >= 0) {
				if ((thatValue >= 0) && (sum >= 0)) {
					return valueFactory.integerValueOf(sum);
				}
			}
			else {
				if ((thatValue <= 0) && (sum <= 0)) {
					return valueFactory.integerValueOf(sum);
				}
			}
		}
		return valueFactory.integerValueOf(bigIntegerValue().add(right.bigIntegerValue()));
	}

	@Override
	public Double asDouble() {
		return Double.valueOf(value);
	}
	
	@Override
	public Integer asInteger() throws InvalidValueException {
		return Integer.valueOf(intValue());
	}

	@Override
	public IntegerValue asIntegerValue() {
		return this;
	}

	public Object asObject() {
		return value;
	}

	public Value asValidValue() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		return new BigDecimal(value);
	}

	public BigInteger bigIntegerValue() {
		if (bigValue == null) {
			bigValue = BigInteger.valueOf(value);
		}
		return bigValue;
	}

	public int compareTo(NumericValue o) {
		if (o instanceof IntegerIntValueImpl) {
			int thatValue = ((IntegerIntValueImpl)o).intValue();
			return (value < thatValue ? -1 : (value == thatValue ? 0 : 1));
		}
		if (o instanceof IntegerLongValueImpl) {
			long thatValue = ((IntegerLongValueImpl)o).longValue();
			return (value < thatValue ? -1 : (value == thatValue ? 0 : 1));
		}
		if (o instanceof IntegerValue) {
			return bigIntegerValue().compareTo(((IntegerValue)o).bigIntegerValue());
		}
		else {
			return Double.compare(doubleValue(), o.doubleValue());
		}
	}

	public IntegerValue div(IntegerValue right) throws InvalidValueException {
		if (right.bigIntegerValue().signum() == 0) {
			return null;
		}
		return valueFactory.integerValueOf(bigIntegerValue().divide(right.bigIntegerValue()));
	}

	public RealValue divide(IntegerValue right) throws InvalidValueException {
		BigDecimal bigLeft = bigDecimalValue();
		BigDecimal bigRight = right.bigDecimalValue();
		return RealValueImpl.divideBigDecimal(valueFactory, bigLeft, bigRight);
	}

	public double doubleValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof IntegerIntValueImpl) {
			int thatValue = ((IntegerIntValueImpl)obj).intValue();
			return value == thatValue;
		}
		if (obj instanceof IntegerLongValueImpl) {
			long thatValue = ((IntegerLongValueImpl)obj).longValue();
			return value == thatValue;
		}
		if (obj instanceof IntegerValue) {
			BigInteger bigIntegerValue = ((IntegerValue)obj).bigIntegerValue();
			return (bigIntegerValue != null) && (bigIntegerValue().compareTo(bigIntegerValue) == 0);
		}
		if (obj instanceof RealValue) {
			BigDecimal bigDecimalValue = ((RealValue)obj).bigDecimalValue();
			return (bigDecimalValue != null) && (bigDecimalValue().compareTo(bigDecimalValue) == 0);
		}
/*		if (obj instanceof NumericValue) {
			try {
				obj = ((NumericValue)obj).toIntegerValue();
				if (obj instanceof IntegerValue) {
					return value.equals(((IntegerValue)obj).bigIntegerValue());
				}
			} catch (InvalidValueException e) {
				throw new IllegalArgumentException(e);
			}
		} */
		return false;
	}

	public Type getType(TypeManager typeManager, Type staticType) {
		return value >= 0 ? typeManager.getUnlimitedNaturalType() : typeManager.getIntegerType();
	}

	@Override
	public int hashCode() {
		return (int)(value ^ (value >>> 32));
	}
	
	public int intValue() throws InvalidValueException {
		int intValue = (int) value;
		if (intValue != value) {
			throw new InvalidValueException("intValue() overflow");
		}
		return intValue;
	}

	@Override
	public IntegerValue isIntegerValue() {
		return this;
	}

	@Override
	public boolean isUnlimitedNatural() {
		return value >= 0;
	}
	
	public long longValue() {
		return value;
	}

	public IntegerValue max(IntegerValue right) throws InvalidValueException {
		if (right instanceof IntegerIntValueImpl) {
			int thatValue = ((IntegerIntValueImpl)right).intValue();
			return value >= thatValue ? this : right;
		}
		else if (right instanceof IntegerLongValueImpl) {
			long thatValue = ((IntegerLongValueImpl)right).longValue();
			return value >= thatValue ? this : right;
		}
		else {
			return bigIntegerValue().compareTo(right.bigIntegerValue()) >= 0 ? this : right;
		}
	}

	public IntegerValue min(IntegerValue right) throws InvalidValueException {
		if (right instanceof IntegerIntValueImpl) {
			int thatValue = ((IntegerIntValueImpl)right).intValue();
			return value <= thatValue ? this : right;
		}
		else if (right instanceof IntegerLongValueImpl) {
			long thatValue = ((IntegerLongValueImpl)right).longValue();
			return value <= thatValue ? this : right;
		}
		else {
			return bigIntegerValue().compareTo(right.bigIntegerValue()) <= 0 ? this : right;
		}
	}

	public IntegerValue mod(IntegerValue right) throws InvalidValueException {
		if (right.bigIntegerValue().signum() == 0) {
			return null;
		}
		return valueFactory.integerValueOf(bigIntegerValue().remainder(right.bigIntegerValue()));
	}

	public IntegerValue multiply(IntegerValue right) throws InvalidValueException {
		return valueFactory.integerValueOf(bigIntegerValue().multiply(right.bigIntegerValue()));
	}

	public IntegerValue negate() {
		if (value > Long.MIN_VALUE) {
			return valueFactory.integerValueOf(-value);
		}
		else {
			return valueFactory.integerValueOf(BigInteger.ONE.shiftLeft(Long.SIZE-1));
		}
	}

	public int signum() {
		return Long.signum(value);
	}

	public IntegerValue subtract(IntegerValue right) throws InvalidValueException {
		if (right instanceof IntegerLongValueImpl) {
			long thatValue = ((IntegerLongValueImpl)right).longValue();
			long diff = value - thatValue;
			if (value >= 0) {
				if ((thatValue <= 0) && (diff >= 0)) {
					return valueFactory.integerValueOf(diff);
				}
			}
			else {
				if ((thatValue >= 0) && (diff <= 0)) {
					return valueFactory.integerValueOf(diff);
				}
			}
		}
		return valueFactory.integerValueOf(bigIntegerValue().subtract(right.bigIntegerValue()));
	}

	@Override
	public IntegerValue toIntegerValue() {
		return this;
	}

	@Override
	public RealValue toRealValue() {
		return valueFactory.realValueOf(this);
	}

	@Override
	public String toString() {
		return Long.toString(value);
	}
}
