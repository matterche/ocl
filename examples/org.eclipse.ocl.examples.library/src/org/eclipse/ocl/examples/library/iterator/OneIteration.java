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
 * $Id: OneIteration.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainIterationManager;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OneIteration realizes the Collection::one() library iteration.
 */
public class OneIteration extends AbstractIteration
{
	public static final OneIteration INSTANCE = new OneIteration();

	public BooleanValue.Accumulator createAccumulatorValue(DomainEvaluator evaluator, DomainType accumulatorType, DomainType bodyType) {
		ValueFactory valueFactory = evaluator.getValueFactory();
		return valueFactory.createBooleanAccumulatorValue();
	}

	@Override
    protected Value updateAccumulator(DomainIterationManager iterationManager) {
		Value bodyVal = iterationManager.evaluateBody();		
		if (bodyVal.isUndefined()) {
			return iterationManager.throwInvalidEvaluation(EvaluatorMessages.UndefinedBody, "one"); 	// Null body is invalid //$NON-NLS-1$
		}
		else if (bodyVal.isFalse()) {
			return null;									// Carry on for nothing found
		}
		else {
			Value accumulatorValue = iterationManager.getAccumulatorValue();
			if (accumulatorValue.isTrue()) {
				return iterationManager.getValueFactory().getFalse();				// Abort after second find
			}
			else {
				((BooleanValue.Accumulator)accumulatorValue).setValue(true);
				return null;									// Carry on after first find
			}
		}
	}
}
