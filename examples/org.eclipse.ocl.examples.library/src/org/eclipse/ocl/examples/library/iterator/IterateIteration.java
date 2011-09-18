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
 * $Id: IterateIteration.java,v 1.5 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainIterationManager;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractIteration;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.Value;

/**
 * IterateIteration realizes the Collection::iterate() library iteration.
 */
public class IterateIteration extends AbstractIteration
{
	public static final IterateIteration INSTANCE = new IterateIteration();

	public Value createAccumulatorValue(DomainEvaluator evaluator, DomainType accumulatorType, DomainType bodyType) {
		throw new UnsupportedOperationException();		// Never used since values are assigned directly as the accumulator
	}
	
	@Override
	public Value evaluateIteration(DomainIterationManager iterationManager) throws InvalidValueException {
		for ( ; iterationManager.hasCurrent(); iterationManager.advanceIterators()) {
			Value resultVal = iterationManager.updateBody();
			if (resultVal != null) {
				return resultVal;
			}
		}
		return resolveTerminalValue(iterationManager);			
	}

	@Override
	protected Value updateAccumulator(DomainIterationManager iterationManager) {
		throw new UnsupportedOperationException();		// Never used since evaluateIteration overwritten
	}
}
