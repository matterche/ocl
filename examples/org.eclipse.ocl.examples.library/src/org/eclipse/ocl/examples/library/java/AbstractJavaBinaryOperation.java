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
 * $Id: AbstractJavaBinaryOperation.java,v 1.1.2.1 2010/10/01 13:28:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.java;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;

/**
 * AbstractStringBinaryOperation dispatches a binary string library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.1
 */
public abstract class AbstractJavaBinaryOperation extends AbstractBinaryOperation
{
	public Object evaluate(Object left, Object right) {
		if (isInvalid(left) || isInvalid(right)) {
			return evaluateInvalid(left, right);
		}
		else if (isNull(left) || isNull(right)) {
			return evaluateNull(left, right);
		}
		if (!isString(left) || !isString(right)) {
			return null;
		}
		return evaluateJava((Comparable<?>)left, (Comparable<?>)right);
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
	 * Evaluate an operation for which both left and right are String.
	 * @param left argument
	 * @param right argument
	 * @return result
	 */
	protected abstract Object evaluateJava(Comparable<?> left, Comparable<?> right);
}
