/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: Bag.java,v 1.2 2011/01/24 20:47:51 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.evaluation;

import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * DomainIterationManager defines the supervisor for an iteration. It provides a body, one or more
 * iterators and an accumulator, which may be updated by evaluating the body.
 */
public interface DomainIterationManager
{
	/**
	 * Advance the iterators to the next iteration, returning false once all possible
	 * iterator states have been exhausted.
	 */
	boolean advanceIterators();

	/**
	 * Create a nested iteration supervisor.
	 * <br>
	 * This method supports the closure iteration for which there is only a single iterator,
	 * and so this method need only be supported by single iterator managers.
	 * 
	 * @param value the nested iteration domain
	 * @return the iteration space
	 * @throws InvalidValueException
	 */
	DomainIterationManager createNestedIterationManager(CollectionValue value);

	/**
	 * Evaluate the iteration body for the current iterators and return the evaluation result.
	 * <br>
	 * This is used by non-iterate iteration that intervene between the body evaluation
	 * and accumulator update.
	 */
	Value evaluateBody();
	
	/**
	 * Get the current state of the iterator.
	 * <br>
	 * This is only supported for single iterator iterations.
	 */
	Value get();

	/**
	 * Get the current state of the accumulator.
	 */
	Value getAccumulatorValue();

	/**
	 * Get the factory for values.
	 */
	ValueFactory getValueFactory();
	
	/**
	 * Return true if the iterators have a step to be evaluated. 
	 */
	boolean hasCurrent();
	
	/**
	 * Get the current iteration depth.
	 * <br>
	 * This is only supported for single iterator recursive iterations such as closure.
	 */
	boolean isOuterIteration();

	NullValue throwInvalidEvaluation(String message, Object... bindings) throws InvalidEvaluationException;

	NullValue throwInvalidEvaluation(InvalidValueException e);

	/**
	 * Evaluate the iteration body for the current iterators and update the accumulator
	 * accordingly.
	 * <br>
	 * This implements the body of an iterate iteration for which the accumulator value may
	 * be assigned to a completely independent value.
	 * 
	 * Returns null for the iteration to continue, non-null to terminate.
	 * @throws InvalidValueException 
	 */
	Value updateBody() throws InvalidValueException;
}
