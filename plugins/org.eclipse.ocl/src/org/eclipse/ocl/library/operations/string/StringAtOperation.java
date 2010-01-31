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
 * $Id: StringAtOperation.java,v 1.1.2.2 2010/01/31 08:43:26 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.string;

import org.eclipse.ocl.library.operations.AbstractBinaryOperation;

/**
 * StringAtOperation realises the String::at() library operation.
 * 
 * @since 3.0
 */
public class StringAtOperation extends AbstractBinaryOperation
{
	public Object evaluate(Object left, Object right) {
		if (isString(left) && isInteger(right)) {
			String string = String.valueOf(left);
			int size = string.length();
			int index = ((Number)right).intValue();
			if ((0 < index) && (index <= size))
				return String.valueOf(string.charAt(index-1));
		}			
		return null;
	}
}
