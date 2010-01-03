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
 * $Id: NumericMaxOperation.java,v 1.1.2.1 2010/01/03 22:53:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;


/**
 * MaxOperation realises the max() library operation.
 * 
 * @since 3.0
 */
public class NumericMaxOperation extends NumericBinaryOperation
{
	@Override
	protected <T extends Number & Comparable<T>> Object evaluate(Limitation limitation, T left, T right, Object leftVal, Object rightVal) {
		if ((left == null) || (right == null)) {
			return null;
		}			
		switch (limitation) {
			case LIMITED_LIMITED: return left.compareTo(right) > 0 ? left : right;
			case LIMITED_UNLIMITED: return rightVal;			// Use the passed UnlimitedNaturalLiteralExp
			case UNLIMITED_LIMITED: return leftVal;
			case UNLIMITED_UNLIMITED: return leftVal;
			default: return null;
		}
	}

	@Override
	protected Object evaluateBigDecimal(Limitation limitation, BigDecimal left,
			BigDecimal right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return super.evaluateBigDecimal(limitation, left, right, leftVal, rightVal);
			case UNLIMITED_UNLIMITED: return super.evaluateBigDecimal(limitation, left, right, leftVal, rightVal);
			default: return null;
		}
	}

	@Override
	protected Object evaluateDouble(Limitation limitation, Double left,
			Double right, Object leftVal, Object rightVal) {
		switch (limitation) {
			case LIMITED_LIMITED: return super.evaluateDouble(limitation, left, right, leftVal, rightVal);
			case UNLIMITED_UNLIMITED: return super.evaluateDouble(limitation, left, right, leftVal, rightVal);
			default: return null;
		}
	}
}
