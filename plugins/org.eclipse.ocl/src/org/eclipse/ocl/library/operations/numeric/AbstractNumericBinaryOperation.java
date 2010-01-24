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
 * $Id: AbstractNumericBinaryOperation.java,v 1.1.2.1 2010/01/24 07:40:58 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;

/**
 * AbstractNumericBinaryOperation dispatches a binary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.0
 */
public abstract class AbstractNumericBinaryOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		Object argVal = visitor.visitArgument(operationCall, 0);
		if (isInvalid(sourceVal) || isInvalid(argVal)) {
			return evaluateInvalid(sourceVal, argVal);
		}
		else if (isNull(sourceVal) || isNull(argVal)) {
			return evaluateNull(sourceVal, argVal);
		}
		else if (isUnlimited(sourceVal) || isUnlimited(argVal)) {
				return evaluateUnlimited(sourceVal, argVal);
		}
		else if (sourceVal instanceof BigInteger) {
			if (argVal instanceof BigInteger) {
				return evaluateInteger((BigInteger)sourceVal, (BigInteger)argVal);
			}
			sourceVal = new BigDecimal((BigInteger)sourceVal);
		}
		else if (argVal instanceof BigInteger) {
			argVal = new BigDecimal((BigInteger)argVal);
		}
		return evaluateReal((BigDecimal)sourceVal, (BigDecimal)argVal);
	}
	
	/**
	 * Evaluate an operation for which both left and right are Integer.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Object evaluateInteger(BigInteger left, BigInteger right) {
		return evaluate(left, right);
	}
	
	/**
	 * Evaluate an operation for which at least one of left and right are invalid.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Object evaluateInvalid(Object left, Object right) {
		return null;
	}
	
	/**
	 * Evaluate an operation for which at least one of left and right are null
	 * and for which neither left nor right are invalid.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Object evaluateNull(Object left, Object right) {
		return null;
	}

	/**
	 * Evaluate an operation for which both left and right are Real.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Object evaluateReal(BigDecimal left, BigDecimal right) {
		return evaluate(left, right);
	}
	
	/**
	 * Evaluate an operation for which at least one of left and right are unlimited
	 * and for which neither left nor right are invalid or null.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Object evaluateUnlimited(Object left, Object right) {
		return null;
	}
	
	/**
	 * Return the result of evaluating the operation on left and right which are both
	 * of the same derived Number type. 
	 * A null return or an exception may be used for invalid.
	 */
	protected <T extends Number & Comparable<T>> Object evaluate(T left, T right) {
		return null;
	}
}
