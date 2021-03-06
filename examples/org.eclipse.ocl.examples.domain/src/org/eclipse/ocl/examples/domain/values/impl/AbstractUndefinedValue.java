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
 * $Id: AbstractUndefinedValue.java,v 1.6 2011/05/07 16:41:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.IntegerValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.NumericValue;
import org.eclipse.ocl.examples.domain.values.RealValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractUndefinedValue extends AbstractValue implements NullValue
{	
	protected AbstractUndefinedValue(ValueFactory valueFactory) {
		super(valueFactory);
	}

	public NullValue abs() throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue add(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue add(RealValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public BooleanValue asFalse() {
		return this;
	}

//	public Double asDouble() {
//		return null;
//	}

	public Object asObject() {
		return null;
	}

	public BooleanValue asTrue() {
		return this;
	}

	public BigDecimal bigDecimalValue() {
		return null;
	}

	public BigInteger bigIntegerValue() {
		return null;
	}

	public int compareTo(NumericValue o) {
		throw new UnsupportedOperationException("AbstractUndefinedValue.compareTo");
	}

	public NullValue div(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue divide(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue divide(RealValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public double doubleValue() {
		throw new UnsupportedOperationException("InvalidValue.compareTo");
	}

	public NullValue floor() throws InvalidValueException {
		return toInvalidValue();
	}

	public DomainType getElement() {
		return null;
	}

	public DomainType getInstanceType() {
		return null;
	}

	public Object getObject() {
		return null;
	}

	@Override
	public boolean isUndefined() {
		return true;
	}

	public NullValue max(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue max(RealValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue min(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue min(RealValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue mod(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue multiply(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue multiply(RealValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue negate() throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue round() throws InvalidValueException {
		return toInvalidValue();
	}

	public int signum() {
		throw new UnsupportedOperationException("InvalidValue.compareTo");
	}

	public String stringValue() {
		return null;
	}

	public NullValue subtract(IntegerValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	public NullValue subtract(RealValue right) throws InvalidValueException {
		return toInvalidValue();
	}

	protected NullValue toInvalidValue() throws InvalidValueException {
		valueFactory.throwInvalidValueException(EvaluatorMessages.ConvertibleValueRequired, "Invalid");
		return null;
	}
}
