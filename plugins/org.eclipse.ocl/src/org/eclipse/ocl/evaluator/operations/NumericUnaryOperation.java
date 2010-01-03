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
 * $Id: NumericUnaryOperation.java,v 1.1.2.1 2010/01/03 22:53:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;

/**
 * AbstractUnaryOperation dispatches a unary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.0
 */
public abstract class NumericUnaryOperation extends AbstractOperation
{
	enum Limitation {
		LIMITED,
		UNLIMITED
	}

	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall) {
		Object sourceVal = evaluateSource(visitor, operationCall);
		Object result = null;
		Limitation limitation = isUnlimited(sourceVal) ? Limitation.UNLIMITED : Limitation.LIMITED;	
		if (sourceVal instanceof BigDecimal) {
			BigDecimal left = bigDecimalValueOf(sourceVal);
			if (left != null) {
				result = evaluateBigDecimal(limitation, left, sourceVal);			
			}
		}
		else if ((sourceVal instanceof Double) || (sourceVal instanceof Float)) {
			Double left = doubleValueOf(sourceVal);
			if (left != null) {
				result = evaluateDouble(limitation, left, sourceVal);			
			}
		}
		else if (sourceVal instanceof BigInteger) {
			BigInteger left = bigIntegerValueOf(sourceVal);
			if (left != null) {
				result = evaluateBigInteger(limitation, left, sourceVal);			
			}
		}
		else if (sourceVal instanceof Long) {
			Long left = longValueOf(sourceVal);
			if (left != null) {
				result = evaluateLong(limitation, left, sourceVal);			
			}
		}
		else if ((sourceVal instanceof Integer) 
		 || (sourceVal instanceof UnlimitedNaturalLiteralExp<?>)) {
			Integer left = integerValueOf(sourceVal);
			if (left != null) {
				result = evaluateInteger(limitation, left, sourceVal);			
			}
		}
		return result;
	}

	protected Object evaluateBigDecimal(Limitation limitation, BigDecimal left, Object leftVal) {
		return evaluate(limitation, left, leftVal);
	}
	
	protected Object evaluateBigInteger(Limitation limitation, BigInteger left, Object leftVal) {
		return evaluate(limitation, left, leftVal);
	}
	
	protected Object evaluateDouble(Limitation limitation, Double left,  Object leftVal) {
		return evaluate(limitation, left, leftVal);
	}
	
	protected Object evaluateInteger(Limitation limitation, Integer left, Object leftVal) {
		return evaluate(limitation, left, leftVal);
	}
	
	protected Object evaluateLong(Limitation limitation, Long left, Object leftVal) {
		return evaluate(limitation, left, leftVal);
	}
	
	/**
	 * Return the result of evaluating the operation on left and right which are both
	 * of the same derived Number type. The limitation identifies which of left and
	 * right are unlimited numbers. A null return or an exception may be used for invalid.
	 */
	protected <T extends Number & Comparable<T>> Object evaluate(Limitation limitation, T left, Object leftVal) {
		return null;
	}
}
