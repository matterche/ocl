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
 * $Id: StringEqualOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;

/**
 * StringEqualOperation realises the String::=() library operation.
 * 
 * @since 3.1
 */
public class StringEqualOperation extends AbstractBinaryOperation
{
	public static final StringEqualOperation INSTANCE = new StringEqualOperation();

	public Boolean evaluate(Object left, Object right) {
		if (isString(left) && isString(right)) {
			return String.valueOf(left).equals(String.valueOf(right));
		}
		if (isInvalid(left) && isInvalid(right)) {
			return Boolean.TRUE;
		}
		if (isNull(left) && isNull(right)) {
			return Boolean.TRUE;
		}			
		return Boolean.FALSE;
	}
}
