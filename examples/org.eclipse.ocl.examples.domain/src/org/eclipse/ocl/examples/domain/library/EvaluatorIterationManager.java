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

import java.util.Iterator;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluationEnvironment;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.osgi.util.NLS;

public abstract class EvaluatorIterationManager extends AbstractIterationManager
{
	protected static class ValueIterator
	{
		private final DomainEvaluationEnvironment evaluationEnvironment;
		private final CollectionValue collectionValue;
		private final DomainTypedElement variable;
		private Iterator<Value> javaIter;
		private Value value = null;

		public ValueIterator(DomainEvaluator evaluator, CollectionValue collectionValue, DomainTypedElement variable) {
			this.evaluationEnvironment = evaluator.getEvaluationEnvironment();
			this.collectionValue = collectionValue;
			this.variable = variable;
			reset();
		}
		
		public Value get() {
			return value;
		}

		public boolean hasCurrent() {
			return value != null;
		}
		
		public Value next() {
			if (!javaIter.hasNext()) {
				value = null;
			}
			else {
				value = javaIter.next();
				evaluationEnvironment.replace(variable, value);
//				System.out.println(name + " = " + value);
			}
			return value;
		}

		public Value reset() {
			javaIter = collectionValue.iterator();
			return next();
		}

		@Override
		public String toString() {
			return String.valueOf(variable) + " = " + String.valueOf(value);
		}
	}

	protected static ValueIterator[] createIterators(DomainTypedElement[] referredIterators, DomainEvaluator evaluator, CollectionValue collectionValue) {
		int iMax = referredIterators.length;
		ValueIterator[] iterators = new ValueIterator[iMax];
		for (int i = 0; i < iMax; i++) {
			DomainTypedElement referredIterator = referredIterators[i];
			ValueIterator valueIterator = new ValueIterator(evaluator, collectionValue, referredIterator);
			if (!valueIterator.hasCurrent()) {
				return null;
			}
			iterators[i] = valueIterator;
		}
		return iterators;
	}

	protected final CollectionValue collectionValue;
	protected final DomainExpression body;
	protected final DomainTypedElement accumulatorVariable;
	private Value accumulatorValue;

	public EvaluatorIterationManager(DomainEvaluator evaluator, DomainExpression body, CollectionValue collectionValue, DomainTypedElement accumulatorVariable, Value accumulatorValue) {
		super(evaluator);
		this.collectionValue = collectionValue;
		this.body = body;
		this.accumulatorVariable = accumulatorVariable;
		this.accumulatorValue = accumulatorValue;
		if (accumulatorVariable != null) {
			getEvaluationEnvironment().add(accumulatorVariable, accumulatorValue);
		}
	}

	public EvaluatorIterationManager(EvaluatorIterationManager iterationManager, CollectionValue collectionValue) {
		super(iterationManager.evaluator);
		this.body = iterationManager.body;
		this.collectionValue = collectionValue;
		this.accumulatorValue = iterationManager.accumulatorValue;
		this.accumulatorVariable = iterationManager.accumulatorVariable;
	}
	
	public Value getAccumulatorValue() {
		return accumulatorValue;
	}

	public Value evaluateBody() {
		return evaluator.evaluate(body);
	}
	
	public CollectionValue getCollectionValue() {
		return collectionValue;
	}

	public DomainEvaluationEnvironment getEvaluationEnvironment() {
		return evaluator.getEvaluationEnvironment();
	}

	public NullValue throwInvalidEvaluation(String message, Object... bindings) throws InvalidEvaluationException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidEvaluationException(getEvaluationEnvironment(), boundMessage, null, null, null);
	}

	@Override
	public String toString() {
//		return body.eContainer().toString();
		return body.toString();
	}

	public Value updateBody() {
		Value bodyVal = evaluateBody();		
		this.accumulatorValue = bodyVal;
		if (accumulatorVariable != null) {
			getEvaluationEnvironment().replace(accumulatorVariable, accumulatorValue);
		}
		return null;					// carry on
	}
}