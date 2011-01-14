/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
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
 * $Id: AbstractIteration.java,v 1.1.2.8 2011/01/14 14:54:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.values.impl.BagValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.OrderedSetValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SequenceValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SetValueImpl;

/**
 * AbstractIteration realises shared characteristics of library iterations.
 * 
 * @since 3.1
 */
public abstract class AbstractIteration<ACC extends Value> extends AbstractFeature implements LibraryIteration
{
	private static AtomicInteger tempCounter = new AtomicInteger();
	
	protected void advanceIterators(EvaluationEnvironment env,
			List<? extends VariableDeclaration> iterators,
			Iterator<?>[] javaIters,
			CollectionValue c,
			int curr) {
		
		// assumes all the iterators have been added to the environment
		// already by initializeIterators().
		for (int i = 0, n = curr; i <= n; i++) {
			VariableDeclaration iterDecl = iterators.get(i);
			String iterName = iterDecl.getName();
			if (i != curr)
				javaIters[i] = c.iterator();
			Value value = (Value) javaIters[i].next();
			env.replace(iterName, value);
		}
	}

	protected CollectionValue.Accumulator createAccumulationValue(ValueFactory valueFactory, boolean isOrdered, boolean isUnique) {
		if (isOrdered) {
			if (isUnique) {
				return new OrderedSetValueImpl.Accumulator(valueFactory);
			}
			else {
				return new SequenceValueImpl.Accumulator(valueFactory);
			}
		}
		else {
			if (isUnique) {
				return new SetValueImpl.Accumulator(valueFactory);
			}
			else {
				return new BagValueImpl.Accumulator(valueFactory);
			}
		}
	}

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceValue, CallExp callExp) {
		return evaluate(evaluationVisitor, sourceValue, (LoopExp) callExp);
	}	
	
	// FIXME Make resultName a non-environment working variable
	protected Value evaluateIteration(EvaluationVisitor evaluationVisitor, CollectionValue coll, LoopExp iteratorExp,
			ACC accumulatorValue) {
		EvaluationEnvironment env = evaluationVisitor.getEvaluationEnvironment();
		List<? extends VariableDeclaration> iterators = iteratorExp.getReferredIteration().getOwnedIterators();
		OclExpression body = iteratorExp.getBody();		
		// if the collection is empty, then nothing to do
		if (coll.isEmpty().isTrue())
			return resolveTerminalValue(env, accumulatorValue);
		
		// construct an array of java iterators, one for each
		// ocl iterator in the expression
		int numIters = iterators.size();
		Iterator<?>[] javaIters = new Iterator<?>[numIters];
		try {
			initializeIterators(env, iterators, javaIters, coll);			
			while (true) {
				// evaluate the body of the expression in this environment
				Value resultVal = updateAccumulator(evaluationVisitor, iterators, body, accumulatorValue);
				if (resultVal != null) {
					return resultVal;
				}
				// find the next unfinished iterator
				int curr = getNextUnfinishedIterator(javaIters);				
				if (curr >= numIters) {
					// all iterators are finished and so are we:
					return resolveTerminalValue(env, accumulatorValue);
				}
		
				// more iteration to go:
				// reset all iterators up to the current unfinished one
				// and replace their assignments in the environment
				advanceIterators(env, iterators, javaIters, coll, curr);
			}
			
			// return the result value
			
		} finally {
			// remove the iterators from the environment			
			removeIterators(env, iterators);
		}
	}

	
	@Deprecated
	protected static synchronized String generateName() {
		return "__result__" + tempCounter.getAndIncrement();	//$NON-NLS-1$
	}
	
	private int getNextUnfinishedIterator(Iterator<?>[] javaIters) {
		int curr;
		int numIters = javaIters.length;
		for (curr = 0; curr < numIters; curr++)
			if (javaIters[curr].hasNext())
				break;
		return curr;
	}
	
	private void initializeIterators(EvaluationEnvironment env,
			List<? extends VariableDeclaration> iterators,
			Iterator<?>[] javaIters,
			CollectionValue c) {
		
		for (int i = 0, n = javaIters.length; i < n; i++) {
			javaIters[i] = c.iterator();
			VariableDeclaration iterDecl = iterators.get(i);
//			String iterName = iterDecl.accept(evaluationVisitor).toString(); // FIXME
			String iterName = iterDecl.getName(); // FIXME
			Value value = (Value) javaIters[i].next();
			env.replace(iterName, value);
		}
	}

	private void removeIterators(EvaluationEnvironment env,
			List<? extends VariableDeclaration> iterators) {
		// remove the iterators from the environment
		for (int i = 0, n = iterators.size(); i < n; i++) {
			VariableDeclaration iterDecl = iterators.get(i);
			 String iterName = iterDecl.getName();
			 env.remove(iterName);
		 }
	}

	/**
	 * Return the value appropriate to an iteration over all the source elements. The
	 * default implementation just retiurns the accumulator. Derived iterations should
	 * override.
	 * 
	 * @param env
	 * @param accumulatorValue
	 * @return
	 */
	protected Value resolveTerminalValue(EvaluationEnvironment env, ACC accumulatorValue) {
		return accumulatorValue;
	}
	
	/**
	 * Update the accumulatorValue with the bodyValue resulting from the current iteration
	 * for which the iterators define the context in the environment.
	 * 
	 * @return non-null premature result of iteration, or null if complete
	 */
	protected abstract Value updateAccumulator(EvaluationVisitor evaluationVisitor, List<? extends VariableDeclaration> iterators, OclExpression body, ACC accumulatorValue);
}
