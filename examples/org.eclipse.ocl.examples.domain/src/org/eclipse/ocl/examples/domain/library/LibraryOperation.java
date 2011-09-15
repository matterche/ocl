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
 * $Id: LibraryOperation.java,v 1.3 2011/02/21 08:37:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.library;

import org.eclipse.ocl.examples.domain.elements.DomainCallExp;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.Value;



/**
 */
public interface LibraryOperation extends LibraryFeature
{
	/**
	 * Return true if this operation should be invoked even if one its arguments is invalid.
	 */
	boolean argumentsMayBeInvalid();

	/**
	 * Return the result of evaluating operationCall upon sourceVal within the environment
	 * provided by EvaluationVisitor. An invalid return may be indicated by throwing an exception
	 * returning Java null or OCL invalid.
	 *
	 * @param evaluationVisitor the evaluation context
	 * @param sourceVal the source operand for the operation
	 * @param operationCall the operation and additional arguments
	 * @return the evaluated value
	 * @throws InvalidValueException 
	 */
//	Value evaluate(Evaluator evaluator, Value sourceVal, OperationCallExp operationCall)
//		throws InvalidEvaluationException, InvalidValueException;
	Value evaluate(DomainEvaluator evaluator, DomainCallExp callExp, Value sourceValue, Value... argumentValues) throws InvalidEvaluationException, InvalidValueException;

}
