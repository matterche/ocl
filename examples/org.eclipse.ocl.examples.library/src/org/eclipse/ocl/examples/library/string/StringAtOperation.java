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
 * $Id: StringAtOperation.java,v 1.1.2.2 2010/12/23 19:24:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.StringValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * StringAtOperation realises the String::at() library operation.
 * 
 * @since 3.1
 */
public class StringAtOperation extends AbstractBinaryOperation
{
	public static final StringAtOperation INSTANCE = new StringAtOperation();

	public Value evaluate(Value left, Value right) {
		String leftString = left.asString();
		Integer rightInteger = right.asInteger();
		if ((leftString != null) && (rightInteger != null)) {
			int size = leftString.length();
			int index = rightInteger.intValue();
			if ((0 < index) && (index <= size)) {
				char c = leftString.charAt(index-1);
				return StringValue.valueOf(String.valueOf(c));
			}
		}			
		return null;
	}
}
