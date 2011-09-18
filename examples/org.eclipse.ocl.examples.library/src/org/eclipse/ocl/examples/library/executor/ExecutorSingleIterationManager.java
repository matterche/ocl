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
package org.eclipse.ocl.examples.library.executor;

import java.util.Iterator;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractIterationManager;
import org.eclipse.ocl.examples.domain.library.LibraryBinaryOperation;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.osgi.util.NLS;

public class ExecutorSingleIterationManager extends AbstractIterationManager
{	
	protected final DomainType returnType;
	protected final LibraryBinaryOperation body;
	private Value accumulatorValue;
	protected final Iterator<Value> iteratorValue;
	private Value currentValue;
	
	public ExecutorSingleIterationManager(DomainEvaluator evaluator, DomainType returnType, LibraryBinaryOperation body,
			CollectionValue collectionValue, Value accumulatorValue) {
		super(evaluator);
		this.returnType = returnType;
		this.body = body;
		this.accumulatorValue = accumulatorValue;
		this.iteratorValue = collectionValue.iterator();
		advanceIterators();
	}
	
	public boolean advanceIterators() {
		currentValue = iteratorValue.hasNext() ? iteratorValue.next() : null;
		return currentValue != null;
	}

	@Override
	public Value get() {
		return currentValue;
	}

	public Value getAccumulatorValue() {
		return accumulatorValue;
	}

	public Value evaluateBody() {
		try {
			return body.evaluate(evaluator, returnType, accumulatorValue, currentValue);
		} catch (InvalidValueException e) {
			return throwInvalidEvaluation(e);
		}
	}
	
	public boolean hasCurrent() {
		return currentValue != null;
	}

	public NullValue throwInvalidEvaluation(String message, Object... bindings) throws InvalidEvaluationException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidEvaluationException(null, boundMessage, null, null, null);
	}

	public Value updateBody() throws InvalidValueException {
		this.accumulatorValue = body.evaluate(evaluator, returnType, accumulatorValue, currentValue);
		return null;					// carry on
	}
}