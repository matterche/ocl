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
 * $Id: AbstractStringUnaryOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.AbstractUnaryOperation;

/**
 * AbstractStringBinaryOperation dispatches a binary string library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.1
 */
public abstract class AbstractStringUnaryOperation extends AbstractUnaryOperation
{
	public Object evaluate(Object sourceVal) {
		if (isInvalid(sourceVal)) {
			return evaluateInvalid(sourceVal);
		}
		else if (isNull(sourceVal)) {
			return evaluateNull(sourceVal);
		}
		if (!isString(sourceVal)) {
			return null;
		}
		return evaluateString((String)sourceVal);
	}
	
	/**
	 * Evaluate an operation for which the left is invalid.
	 * @param left argument
	 * @return result
	 */
	protected Object evaluateInvalid(Object left) {
		return null;
	}
	
	/**
	 * Evaluate an operation for which the left is null
	 * @param left argument
	 * @return result
	 */
	protected Object evaluateNull(Object left) {
		return null;
	}
	
	/**
	 * Evaluate an operation for which left is a String.
	 * @param left argument
	 * @return result
	 */
	protected abstract Object evaluateString(String left);
}
