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
 * $Id: StringSubstringOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.AbstractTernaryOperation;

/**
 * StringSubstringOperation realises the String::substring() library operation.
 * 
 * @since 3.1
 */
public class StringSubstringOperation extends AbstractTernaryOperation
{
	public static final StringSubstringOperation INSTANCE = new StringSubstringOperation();

	public Object evaluate(Object source, Object arg1, Object arg2) {
		if (isString(source) && isInteger(arg1) && isInteger(arg2)) {
			String string = String.valueOf(source);
			int size = string.length();
			int lower = ((Number)arg1).intValue();
			int upper = ((Number)arg2).intValue();
			if ((0 < lower) && (lower <= upper) && (upper <= size))
				return string.substring(lower-1, upper);
		}			
		return null;
	}
}
