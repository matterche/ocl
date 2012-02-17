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
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * StringMatchesOperation realises the String::matches() library operation.
 */
public class StringMatchesOperation extends AbstractBinaryOperation
{
	public static final StringMatchesOperation INSTANCE = new StringMatchesOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value left, Value right) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		String leftString = left.asString();
		String rightString = right.asString();
		boolean matches = leftString.matches(rightString);
		return valueFactory.booleanValueOf(matches);
	}
}
