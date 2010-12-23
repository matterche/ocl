/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
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
 * $Id: AbstractNumericBinaryOperation.java,v 1.1.2.2 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * AbstractNumericBinaryOperation dispatches a binary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.1
 */
public abstract class AbstractNumericBinaryOperation extends AbstractBinaryOperation
{
	public Value evaluate(Value left, Value right) {
		if (left.isInvalid() || right.isInvalid()) {
			return evaluateInvalid(left, right);
		}
		else if (left.isNull() || right.isNull()) {
			return evaluateNull(left, right);
		}
		else if (left.isUnlimited() || right.isUnlimited()) {
			return evaluateUnlimited(left, right);
		}
		IntegerValue leftInteger = left.asIntegerValue();
		IntegerValue rightInteger = right.asIntegerValue();
		if ((leftInteger != null) && (rightInteger != null)) {
			return evaluateInteger(leftInteger, rightInteger);
		}
		RealValue leftReal = left.toRealValue();
		RealValue rightReal = right.toRealValue();
		if ((leftReal != null) && (rightReal != null)) {
			return evaluateReal(leftReal, rightReal);
		}
		return evaluateNonNumeric(left, right);
	}
	
	/**
	 * Evaluate an operation for which both left and right are Integer.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Value evaluateInteger(IntegerValue left, IntegerValue right) {
		return evaluate(left, right);
	}
	
	/**
	 * Evaluate an operation for which at least one of left and right are invalid.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Value evaluateInvalid(Value left, Value right) {
		return null;
	}
	
	/**
	 * Evaluate an operation for which at least neither left or right is null or invalid
	 * but at least one of left and right are a non-numeric value.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Value evaluateNonNumeric(Value left, Value right) {
		return null;
	}
	
	/**
	 * Evaluate an operation for which at least one of left and right are null
	 * and for which neither left nor right are invalid.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Value evaluateNull(Value left, Value right) {
		return null;
	}

	/**
	 * Evaluate an operation for which both left and right are Real.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Value evaluateReal(RealValue left, RealValue right) {
		return evaluate(left, right);
	}
	
	/**
	 * Evaluate an operation for which at least one of left and right are unlimited
	 * and for which neither left nor right are invalid or null.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected Value evaluateUnlimited(Value left, Value right) {
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
