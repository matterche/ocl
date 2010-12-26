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
 * $Id: StringCharactersOperation.java,v 1.1.2.1 2010/12/26 16:56:29 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ocl.examples.pivot.values.StringValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * OrderedSetSubOrderedSetOperation realises the OrderedSet::subOrderedSet() library operation.
 * 
 * @since 3.1
 */
public class StringCharactersOperation extends AbstractStringUnaryOperation
{
	public static final StringCharactersOperation INSTANCE = new StringCharactersOperation();

	@Override
	protected Value evaluateString(String string) {
		List<StringValue> results = new ArrayList<StringValue>(string.length());
		for (int i = 0; i < string.length(); i++) {
			String s = string.substring(i, i+1);
			results.add(createStringValue(s));
		}
		return createSequenceValue(results);
	}
}
