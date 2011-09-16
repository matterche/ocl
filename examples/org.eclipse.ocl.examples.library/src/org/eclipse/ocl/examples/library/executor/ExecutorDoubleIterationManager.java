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
import org.eclipse.ocl.examples.domain.library.LibraryTernaryOperation;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.CollectionValue;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.osgi.util.NLS;

public class ExecutorDoubleIterationManager extends AbstractIterationManager
{	
	protected final DomainType returnType;
	protected final LibraryTernaryOperation body;
	private Value accumulatorValue;
	protected final CollectionValue collectionValue;
	private Iterator<Value> iteratorValue1;
	private final Iterator<Value> iteratorValue2;
	private Value currentValue1;
	private Value currentValue2;
	
	public ExecutorDoubleIterationManager(DomainEvaluator evaluator, DomainType returnType, LibraryTernaryOperation body,
			CollectionValue collectionValue, Value accumulatorValue) {
		super(evaluator);
		this.returnType = returnType;
		this.body = body;
		this.accumulatorValue = accumulatorValue;
		this.collectionValue = collectionValue;
		this.iteratorValue1 = collectionValue.iterator();
		this.iteratorValue2 = collectionValue.iterator();
		currentValue1 = iteratorValue1.hasNext() ? iteratorValue1.next() : null;
		currentValue2 = iteratorValue2.hasNext() ? iteratorValue2.next() : null;
	}
	
	public boolean advanceIterators() {
		if (iteratorValue1.hasNext()) {
			currentValue1 = iteratorValue1.next();
		}
		else if (iteratorValue2.hasNext()) {
			currentValue2 = iteratorValue2.next();
			iteratorValue1 = collectionValue.iterator();
			currentValue1 = iteratorValue1.hasNext() ? iteratorValue1.next() : null;
		}
		else {
			currentValue1 = null;
			currentValue2 = null;
		}
		return currentValue1 != null;
	}

	public Value evaluateBody() {
		try {
			return body.evaluate(evaluator, returnType, accumulatorValue, currentValue1, currentValue2);
		} catch (InvalidValueException e) {
			return throwInvalidEvaluation(e);
		}
	}

	public Value getAccumulatorValue() {
		return accumulatorValue;
	}
	
	public boolean hasCurrent() {
		return currentValue1 != null;
	}

	public NullValue throwInvalidEvaluation(String message, Object... bindings) throws InvalidEvaluationException {
		String boundMessage = NLS.bind(message, bindings);
		throw new InvalidEvaluationException(null, boundMessage, null, null, null);
	}

	public Value updateBody() throws InvalidValueException {
		this.accumulatorValue = body.evaluate(evaluator, returnType, accumulatorValue, currentValue1, currentValue2);
		return null;					// carry on
	}
}