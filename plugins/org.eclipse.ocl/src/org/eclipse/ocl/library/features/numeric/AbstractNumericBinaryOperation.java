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
 * $Id: AbstractNumericBinaryOperation.java,v 1.1.2.1 2010/01/31 22:23:48 ewillink Exp $
 */
package org.eclipse.ocl.library.features.numeric;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.ocl.library.features.AbstractBinaryOperation;

/**
 * AbstractNumericBinaryOperation dispatches a binary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.0
 */
public abstract class AbstractNumericBinaryOperation extends AbstractBinaryOperation
{
	public Object evaluate(Object left, Object right) {
		if (isInvalid(left) || isInvalid(right)) {
			return evaluateInvalid(left, right);
		}
		else if (isNull(left) || isNull(right)) {
			return evaluateNull(left, right);
		}
		else if (isUnlimited(left) || isUnlimited(right)) {
			return evaluateUnlimited(left, right);
		}
		else if (left instanceof BigInteger) {
			if (right instanceof BigInteger) {
				return evaluateInteger((BigInteger)left, (BigInteger)right);
			}
			else if (right instanceof BigDecimal) {
				left = new BigDecimal((BigInteger)left);
				return evaluateReal((BigDecimal)left, (BigDecimal)right);
			}
		}
		else if (left instanceof BigDecimal) {
			if (right instanceof BigDecimal) {
				return evaluateReal((BigDecimal)left, (BigDecimal)right);
			}
			else if (right instanceof BigInteger) {
				right = new BigDecimal((BigInteger)right);
				return evaluateReal((BigDecimal)left, (BigDecimal)right);
			}
		}
		return evaluateNonNumeric(left, right);
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
	 * Evaluate an operation for which at least neither left or right is null or invalid
	 * but at least one of left and right are a non-numeric value.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Object evaluateNonNumeric(Object left, Object right) {
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
