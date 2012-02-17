/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
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
 * StringSubstituteFirstOperation realises the String::substituteFirst() library operation.
 */
public class StringSubstituteFirstOperation extends AbstractTernaryOperation
{
	public static final StringSubstituteFirstOperation INSTANCE = new StringSubstituteFirstOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value firstArgumentValue, Value secondArgumentValue) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		String sourceString = sourceValue.asString();
		String oldSubstring = firstArgumentValue.asString();
		String newSubstring = secondArgumentValue.asString();
		int index = sourceString.indexOf(oldSubstring);
		if (index < 0) {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.MissingSubstring, oldSubstring, sourceString);
		}
		else {
			return valueFactory.stringValueOf(sourceString.substring(0, index) + newSubstring + sourceString.substring(index + oldSubstring.length(), sourceString.length()));
		}
	}
}
