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

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public interface DomainEvaluator
{
	DomainEvaluator createNestedEvaluator();
	Value evaluate(DomainExpression body);
	DomainEvaluationEnvironment getEvaluationEnvironment();
	/**
	 * Return the manager of all model instances for use by allInstances() and hidden opposite support.
	 */
	DomainModelManager getModelManager();

	/**
	 * Return the factory for values and indirectly for types.
	 * 
	 * @throws EvaluationHaltedException if evaluation has been canceled.
	 */
	ValueFactory getValueFactory() throws EvaluationHaltedException;
	
	/**
	 * Return true if the evaluation has been canceled.
	 */
	boolean isCanceled();
	
	/**
	 * Request cancelation of the current the evaluation, or reset the request for a new evaluation.
	 * Cancelation occurs by throwing an {@link EvaluationHaltedException} when {@link #getValuefactory()}
	 * is next invoked. 
	 */
	void setCanceled(boolean isCanceled);

	NullValue throwInvalidEvaluation(InvalidValueException e) throws InvalidEvaluationException;

	NullValue throwInvalidEvaluation(Throwable e, DomainExpression expression, Object context, String message, Object... bindings) throws InvalidEvaluationException;
}
