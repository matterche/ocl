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
 * $Id: NumericNegateOperation.java,v 1.1.2.1 2010/01/03 22:53:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * NegateOperation realises the unary -() library operation.
 * 
 * @since 3.0
 */
public class NumericNegateOperation extends NumericUnaryOperation
{
	@Override
	protected Object evaluateBigDecimal(Limitation limitation, BigDecimal left, Object leftVal) {
		switch (limitation) {
			case LIMITED: return left.negate();
			default: return null;
		}
	}

	@Override
	protected Object evaluateBigInteger(Limitation limitation, BigInteger left, Object leftVal) {
		switch (limitation) {
			case LIMITED: return left.negate();
			default: return null;
		}
	}

	@Override
	protected Object evaluateDouble(Limitation limitation, Double left, Object leftVal) {
		switch (limitation) {
			case LIMITED: return -left;
			default: return null;
		}
	}

	@Override
	protected Object evaluateInteger(Limitation limitation, Integer left, Object leftVal) {
		switch (limitation) {
			case LIMITED: return -left;
			default: return null;
		}
	}

	@Override
	protected Object evaluateLong(Limitation limitation, Long left, Object leftVal) {
		switch (limitation) {
			case LIMITED: return -left;
			default: return null;
		}
	}
}
