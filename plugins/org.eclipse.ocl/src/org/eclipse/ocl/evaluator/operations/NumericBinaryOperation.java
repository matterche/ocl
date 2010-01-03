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
 * $Id: NumericBinaryOperation.java,v 1.1.2.1 2010/01/03 22:53:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * AbstractBinaryOperation dispatches a binary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.0
 */
public abstract class NumericBinaryOperation extends AbstractOperation
{
	enum Limitation {
		LIMITED_LIMITED,
		LIMITED_UNLIMITED,
		UNLIMITED_LIMITED,
		UNLIMITED_UNLIMITED
	}

	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall) {
		Object sourceVal = evaluateSource(visitor, operationCall);
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		Object result = null;
		Limitation limitation;
		if (isUnlimited(sourceVal)) {
			limitation = isUnlimited(argVal) ? Limitation.UNLIMITED_UNLIMITED : Limitation.UNLIMITED_LIMITED;
		}
		else {
			limitation = isUnlimited(argVal) ? Limitation.LIMITED_UNLIMITED : Limitation.LIMITED_LIMITED;
		}
		
		boolean realSource = (sourceVal instanceof BigDecimal) || (sourceVal instanceof Double) || (sourceVal instanceof Float); 
		boolean realArg = (argVal instanceof BigDecimal) || (argVal instanceof Double) || (argVal instanceof Float); 
		if ((sourceVal instanceof BigDecimal)
		 || (argVal instanceof BigDecimal) 
		 || ((sourceVal instanceof BigInteger) && realArg) 
		 || ((argVal instanceof BigInteger) && realSource)) {
			BigDecimal left = bigDecimalValueOf(sourceVal);
			BigDecimal right = bigDecimalValueOf(argVal);
			result = evaluateBigDecimal(limitation, left, right, sourceVal, argVal);			
		}
		else if (realSource || realArg) {
			Double left = doubleValueOf(sourceVal);
			Double right = doubleValueOf(argVal);
			result = evaluateDouble(limitation, left, right, sourceVal, argVal);			
		}
		else if ((sourceVal instanceof BigInteger) 
		 || (argVal instanceof BigInteger)) {
			BigInteger left = bigIntegerValueOf(sourceVal);
			BigInteger right = bigIntegerValueOf(argVal);
			result = evaluateBigInteger(limitation, left, right, sourceVal, argVal);			
		}
		else if ((sourceVal instanceof Long) 
		 || (argVal instanceof Long)) {
			Long left = longValueOf(sourceVal);
			Long right = longValueOf(argVal);
			result = evaluateLong(limitation, left, right, sourceVal, argVal);			
		}
		else {
			Integer left = integerValueOf(sourceVal);
			Integer right = integerValueOf(argVal);
			result = evaluateInteger(limitation, left, right, sourceVal, argVal);			
		}
		return result;
	}

	protected Object evaluateBigDecimal(Limitation limitation, BigDecimal left, BigDecimal right, Object leftVal, Object rightVal) {
		return evaluate(limitation, left, right, leftVal, rightVal);
	}
	
	protected Object evaluateBigInteger(Limitation limitation, BigInteger left, BigInteger right, Object leftVal, Object rightVal) {
		return evaluate(limitation, left, right, leftVal, rightVal);
	}
	
	protected Object evaluateDouble(Limitation limitation, Double left, Double right, Object leftVal, Object rightVal) {
		return evaluate(limitation, left, right, leftVal, rightVal);
	}
	
	protected Object evaluateInteger(Limitation limitation, Integer left, Integer right, Object leftVal, Object rightVal) {
		return evaluate(limitation, left, right, leftVal, rightVal);
	}
	
	protected Object evaluateLong(Limitation limitation, Long left, Long right, Object leftVal, Object rightVal) {
		return evaluate(limitation, left, right, leftVal, rightVal);
	}
	
	/**
	 * Return the result of evaluating the operation on left and right which are both
	 * of the same derived Number type. The limitation identifies which of left and
	 * right are unlimited numbers. A null return or an exception may be used for invalid.
	 */
	protected <T extends Number & Comparable<T>> Object evaluate(Limitation limitation, T left, T right, Object leftVal, Object rightVal) {
		return null;
	}
}
