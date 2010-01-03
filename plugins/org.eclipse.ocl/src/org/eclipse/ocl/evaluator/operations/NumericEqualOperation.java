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
 * $Id: NumericEqualOperation.java,v 1.1.2.1 2010/01/03 22:53:49 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

/**
 * NumericEqualOperation realises the =() library operation.
 * 
 * @since 3.0
 */
public class NumericEqualOperation extends NumericBinaryOperation
{
	@Override
	protected <T extends Number & Comparable<T>> Object evaluate(Limitation limitation, T left, T right, Object leftVal, Object rightVal) {
		if (isInvalid(leftVal) && isInvalid(rightVal)) {
			return Boolean.TRUE;
		}
		if (isNull(leftVal) && isNull(rightVal)) {
			return Boolean.TRUE;
		}			
		if ((left == null) || (right == null)) {
			return Boolean.FALSE;
		}			
		switch (limitation) {
			case LIMITED_LIMITED: return left.compareTo(right) == 0;
			case LIMITED_UNLIMITED: return Boolean.FALSE;
			case UNLIMITED_LIMITED: return Boolean.FALSE;
			case UNLIMITED_UNLIMITED: return Boolean.TRUE;
			default: return Boolean.FALSE;
		}
	}
}
