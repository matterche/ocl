/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: StringIndexOfOperation.java,v 1.1.2.1 2010/12/26 16:56:29 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * OrderedSetSubOrderedSetOperation realises the OrderedSet::subOrderedSet() library operation.
 * 
 * @since 3.1
 */
public class StringIndexOfOperation extends AbstractBinaryOperation
{
	public static final StringIndexOfOperation INSTANCE = new StringIndexOfOperation();

	public Value evaluate(Value left, Value right) {
		String leftString = left.asString();
		if (leftString == null) {
			return createInvalidValue(left, null, "non-string indexOf source", null);
		}
		Integer rightInteger = right.asInteger();
		if (rightInteger == null) {
			return createInvalidValue(right, null, "non-integer indexOf argument", null);
		}
		int index = rightInteger -1;
		if ((index < 0) || (leftString.length() <= index)) {
			return createInvalidValue(right, null, "out of range indexOf argument", null);
		}
		return createStringValue(leftString.substring(index, index+1));
	}
}
