/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: NumericDivideOperation.java,v 1.1.2.1 2010/01/03 22:53:48 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


/**
 * DivideOperation realises the /() library operation.
 * 
 * @since 3.0
 */
public class NumericDivideOperation extends NumericBinaryOperation
{
	protected BigDecimal divideBigDecimal(BigDecimal left, BigDecimal right) {
		try {
			return left.divide(right, RoundingMode.HALF_EVEN);
		} catch (ArithmeticException e) {
			return null;
		}
	}
	
	protected Double divideDouble(double left, double right) {
		double result = left / right;
		if (Double.isInfinite(result) || Double.isNaN(result)) {
			return null;
		}
		else {
			return result;
		}
	}

	@Override
	protected Object evaluateBigDecimal(Limitation limitation, BigDecimal left, BigDecimal right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return divideBigDecimal(left, right);
			default: return null;
		}
	}

	@Override
	protected Object evaluateBigInteger(Limitation limitation, BigInteger left, BigInteger right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return divideBigDecimal(new BigDecimal(left), new BigDecimal(right));
			default: return null;
		}
	}

	@Override
	protected Object evaluateDouble(Limitation limitation, Double left, Double right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return divideDouble(left, right);
			default: return null;
		}
	}

	@Override
	protected Object evaluateInteger(Limitation limitation, Integer left, Integer right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return divideDouble(left, right);
			default: return null;
		}
	}

	@Override
	protected Object evaluateLong(Limitation limitation, Long left, Long right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return divideDouble(left, right);
			default: return null;
		}
	}
}
