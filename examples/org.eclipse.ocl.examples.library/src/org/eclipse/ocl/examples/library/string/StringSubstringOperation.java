/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: StringSubstringOperation.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractTernaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * StringSubstringOperation realises the String::substring() library operation.
 */
public class StringSubstringOperation extends AbstractTernaryOperation
{
	public static final StringSubstringOperation INSTANCE = new StringSubstringOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value firstArgumentValue, Value secondArgumentValue) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		String sourceString = sourceValue.asString();
		Integer startInteger = firstArgumentValue.asInteger();
		Integer endInteger = secondArgumentValue.asInteger();
		int size = sourceString.length();
		int lower = startInteger.intValue();
		int upper = endInteger.intValue();
		if ((0 < lower) && (lower <= upper) && (upper <= size)) {
			return valueFactory.stringValueOf(sourceString.substring(lower-1, upper));
		}
		else {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.IndexesOutOfRange, lower, upper, size);
		}
	}
}
