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
 * $Id: NumericMinusOperation.java,v 1.1.2.1 2010/01/03 22:53:48 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * MinusOperation realises the -() library operation.
 * 
 * @since 3.0
 */
public class NumericMinusOperation extends NumericBinaryOperation
{
	@Override
	protected Object evaluateBigDecimal(Limitation limitation, BigDecimal left, BigDecimal right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return left.subtract(right);
			default: return null;
		}
	}

	@Override
	protected Object evaluateBigInteger(Limitation limitation, BigInteger left, BigInteger right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return left.subtract(right);
			default: return null;
		}
	}

	@Override
	protected Object evaluateDouble(Limitation limitation, Double left, Double right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return left - right;
			default: return null;
		}
	}

	@Override
	protected Object evaluateInteger(Limitation limitation, Integer left, Integer right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return left - right;
			default: return null;
		}
	}

	@Override
	protected Object evaluateLong(Limitation limitation, Long left, Long right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return left - right;
			default: return null;
		}
	}
}
