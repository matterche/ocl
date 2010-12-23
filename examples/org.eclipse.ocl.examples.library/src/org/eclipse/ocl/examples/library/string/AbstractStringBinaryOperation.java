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
 * $Id: AbstractStringBinaryOperation.java,v 1.1.2.2 2010/12/23 19:24:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * AbstractStringBinaryOperation dispatches a binary string library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.1
 */
public abstract class AbstractStringBinaryOperation extends AbstractBinaryOperation
{
	public Value evaluate(Value left, Value right) {
		if (left.isInvalid() || right.isInvalid()) {
			return evaluateInvalid(left, right);
		}
		else if (left.isNull() || right.isNull()) {
			return evaluateNull(left, right);
		}
		String leftString = left.asString();
		String rightString = right.asString();
		if ((leftString == null) || (rightString == null)) {
			return null;
		}
		return evaluateString(leftString, rightString);
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
	 * Evaluate an operation for which both left and right are String.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected abstract Value evaluateString(String left, String right);
}
