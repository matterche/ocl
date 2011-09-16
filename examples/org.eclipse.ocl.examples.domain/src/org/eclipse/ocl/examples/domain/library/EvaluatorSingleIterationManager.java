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
import org.eclipse.ocl.examples.domain.evaluation.DomainIterationManager;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.Value;

public class EvaluatorSingleIterationManager
		extends EvaluatorIterationManager {

	protected final int depth;

	protected final DomainTypedElement referredIterator;

	protected final ValueIterator iterator;

	public EvaluatorSingleIterationManager(DomainEvaluator invokingEvaluator,
			DomainExpression body, CollectionValue collectionValue,
			DomainTypedElement accumulator, Value accumulatorValue,
			DomainTypedElement referredIterator) {
		super(invokingEvaluator.createNestedEvaluator(), body, collectionValue, accumulator, accumulatorValue);
		this.depth = 0;
		this.referredIterator = referredIterator;
		this.iterator = new ValueIterator(evaluator, collectionValue, referredIterator);
	}

	protected EvaluatorSingleIterationManager(EvaluatorSingleIterationManager iterationManager, CollectionValue value) {
		super(iterationManager, value);
		this.depth = iterationManager.depth + 1;
		this.referredIterator = iterationManager.referredIterator;
		this.iterator = new ValueIterator(evaluator, collectionValue, referredIterator);
	}

	public boolean advanceIterators() {
		iterator.next();
		return hasCurrent();
	}

	@Override
	public DomainIterationManager createNestedIterationManager(CollectionValue value) {
		return new EvaluatorSingleIterationManager(this, value);
	}

	@Override
	public Value get() {
		return iterator.get();
	}

	public boolean hasCurrent() {
		return iterator.hasCurrent();
	}

	@Override
	public boolean isOuterIteration() {
		return depth == 0;
	}
}