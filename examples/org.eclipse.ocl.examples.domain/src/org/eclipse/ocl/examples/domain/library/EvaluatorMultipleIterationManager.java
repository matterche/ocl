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
 * $Id: IterationManager.java,v 1.5 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.library;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;

public class EvaluatorMultipleIterationManager extends EvaluatorIterationManager
{
	protected final ValueIterator[] iterators;
	protected boolean hasCurrent;
	
	public EvaluatorMultipleIterationManager(DomainEvaluator invokingEvaluator, DomainExpression body, CollectionValue collectionValue, DomainTypedElement accumulator, Value accumulatorValue, DomainTypedElement... referredIterators) {
		super(invokingEvaluator.createNestedEvaluator(), body, collectionValue, accumulator, accumulatorValue);
		int iMax = referredIterators.length;
		ValueIterator[] iterators = new ValueIterator[iMax];
		for (int i = 0; i < iMax; i++) {
			ValueIterator valueIterator = new ValueIterator(evaluator, collectionValue, referredIterators[i]);
			if (!valueIterator.hasCurrent()) {
				this.iterators = null;
				this.hasCurrent = false;
				return;
			}
			iterators[i] = valueIterator;
		}
		this.iterators = iterators;
		this.hasCurrent = true;
	}
	
	public boolean advanceIterators() {
		if (hasCurrent) {
			for (ValueIterator advancingIterator : iterators) {
				advancingIterator.next();
				if (advancingIterator.hasCurrent()) {
					for (ValueIterator previousIterator : iterators) {
						if (previousIterator == advancingIterator) {
							return true;
						}
						previousIterator.reset();
					}
				}			
			}
			hasCurrent = false;
		}
		return false;
	}

	public Value get(int i) {
		return iterators[i].get();		
	}
	
	public boolean hasCurrent() {
		return hasCurrent;
	}
}