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
 * $Id: SelectIteration.java,v 1.5 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainIterationManager;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.library.EvaluatorSingleIterationManager;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * SelectIteration realizes the Collection::select() library iteration.
 */
public class SelectIteration extends AbstractIteration
{
	public static final SelectIteration INSTANCE = new SelectIteration();

	public CollectionValue.Accumulator createAccumulatorValue(DomainEvaluator evaluator, DomainType accumulatorType, DomainType bodyType) {
		return evaluator.getValueFactory().createCollectionAccumulatorValue((DomainCollectionType) accumulatorType);
	}
	
	@Override
    protected Value updateAccumulator(DomainIterationManager iterationManager) {
		Value bodyVal = iterationManager.evaluateBody();		
		if (bodyVal.isUndefined()) {
			return iterationManager.throwInvalidEvaluation(EvaluatorMessages.UndefinedBody, "select"); 	// Null body is invalid //$NON-NLS-1$
		}
		else if (bodyVal.isTrue()) {
			Value value = ((EvaluatorSingleIterationManager)iterationManager).get();		
			((CollectionValue.Accumulator)iterationManager.getAccumulatorValue()).add(value);
		}
		return null;
	}
}
