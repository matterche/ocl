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
 * $Id: AnyIteration.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainIterationManager;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * AnyIteration realizes the Collection::any() library iteration.
 */
public class AnyIteration extends AbstractIteration
{
	public static final AnyIteration INSTANCE = new AnyIteration();

	public CollectionValue.Accumulator createAccumulatorValue(DomainEvaluator evaluator, DomainType accumulatorType, DomainType bodyType) {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		return valueFactory.createCollectionAccumulatorValue(standardLibrary.getSequenceType(accumulatorType));
	}
	
	@Override
	protected Value resolveTerminalValue(DomainIterationManager iterationManager) {
		CollectionValue.Accumulator accumulatorValue = (CollectionValue.Accumulator)iterationManager.getAccumulatorValue();
		if (accumulatorValue.intSize() > 0) {
			return accumulatorValue.asList().get(0);		// Normal something found result.
		}
		else {
			return iterationManager.getValueFactory().getNull();
		}
	}
	
	@Override
    protected Value updateAccumulator(DomainIterationManager iterationManager) {
		Value bodyVal = iterationManager.evaluateBody();		
		if (bodyVal.isUndefined()) {
			return iterationManager.throwInvalidEvaluation(EvaluatorMessages.UndefinedBody, "any"); 	// Null body is invalid //$NON-NLS-1$
		}
		else if (bodyVal.isFalse()) {
			return null;									// Carry on for nothing found
		}
		else {
			CollectionValue.Accumulator accumulatorValue = (CollectionValue.Accumulator)iterationManager.getAccumulatorValue();
			if (accumulatorValue.intSize() > 0) {
				return iterationManager.getValueFactory().getFalse();				// Abort after second find
			}
			else {
				Value value = iterationManager.get();		
				accumulatorValue.add(value);
				return null;									// Carry on after first find
			}
		}
	}
}
