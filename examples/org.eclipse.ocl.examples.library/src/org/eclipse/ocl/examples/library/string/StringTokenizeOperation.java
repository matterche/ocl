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
 *
 * $Id: StringSubstringOperation.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.ocl.examples.domain.elements.DomainCallExp;
import org.eclipse.ocl.examples.domain.elements.DomainCollectionType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractOperation;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryTernaryOperation;
import org.eclipse.ocl.examples.domain.library.LibraryUnaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.StringValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * StringTokenizeOperation realises the String::tokenize() library operations.
 */
public class StringTokenizeOperation extends AbstractOperation implements LibraryUnaryOperation, LibraryBinaryOperation, LibraryTernaryOperation 
{
	public static final StringTokenizeOperation INSTANCE = new StringTokenizeOperation();
	private static final String DELIMS = " \t\n\r\f"; //$NON-NLS-1$

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue) throws InvalidValueException {
		return evaluate(evaluator, (DomainCollectionType)returnType, sourceValue, DELIMS, false);
	}

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value argumentValue) throws InvalidValueException {
		boolean returnDelims = argumentValue.asBoolean();
		return evaluate(evaluator, (DomainCollectionType)returnType, sourceValue, DELIMS, returnDelims);
	}

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceValue, Value firstArgumentValue, Value secondArgumentValue) throws InvalidValueException {
		String delims = firstArgumentValue.asString();
		boolean returnDelims = secondArgumentValue.asBoolean();
		return evaluate(evaluator, (DomainCollectionType)returnType, sourceValue, delims, returnDelims);
	}

	public Value evaluate(DomainEvaluator evaluator, DomainCallExp callExp, Value sourceValue, Value... argumentValues) throws InvalidEvaluationException, InvalidValueException {
		String delims = DELIMS;
		boolean returnDelims = false;
		if (argumentValues.length > 0) {
			if (argumentValues.length > 1) {
				if (argumentValues.length > 2) {
					return evaluator.getValueFactory().throwInvalidValueException(EvaluatorMessages.InvalidArgument, argumentValues[2]);
				}
				returnDelims = argumentValues[1].asBoolean();
			}
			delims = argumentValues[0].asString();
		}
		return evaluate(evaluator, (DomainCollectionType)callExp.getType(), sourceValue, delims, returnDelims);
	}

	public Value evaluate(DomainEvaluator evaluator, DomainCollectionType returnType, Value sourceValue, String delims, boolean returnDelims) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		String sourceString = sourceValue.asString();
		StringTokenizer tokenizer = new StringTokenizer(sourceString, delims, returnDelims);
		List<StringValue> results = new ArrayList<StringValue>();
		while (tokenizer.hasMoreTokens()) {
			results.add(valueFactory.stringValueOf(tokenizer.nextToken()));
		}
		return valueFactory.createSequenceValue(returnType, results);
	}
}
