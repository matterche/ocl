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
 * $Id: ClosureIteration.java,v 1.1.2.10 2011/01/14 14:54:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.List;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.values.impl.AbstractValue;

/**
 * ClosureIteration realises the Collection::closure() library iteration.
 * 
 * @since 3.1
 */
public class ClosureIteration extends AbstractIteration<ClosureIteration.ClosureValue>
{
	protected static class ClosureValue extends AbstractValue
	{	// FIXME Flatten this by eliminating depth
		private CollectionValue.Accumulator accumulator;
		private int depth = 0;

		protected ClosureValue(CollectionValue.Accumulator accumulator) {
			super(accumulator.getValueFactory());
			this.accumulator = accumulator;
		}

		public boolean add(Value value) {
			return accumulator.add(value);
		}

		public Type getType(StandardLibrary standardLibrary, Type staticType) {
			return accumulator.getType(standardLibrary, staticType);
		}
	}
	
	public static final ClosureIteration INSTANCE = new ClosureIteration();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, LoopExp iteratorExp) {
		ValueFactory valueFactory = evaluationVisitor.getValueFactory();
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = iteratorExp.getSource().getType();
		boolean isOrdered = stdlib.isOrdered(sourceType);
		CollectionValue.Accumulator accumulatorValue = createAccumulationValue(valueFactory, isOrdered, true);
		ClosureValue closureValue = new ClosureValue(accumulatorValue);
		return evaluateIteration(evaluationVisitor, (CollectionValue) sourceVal, iteratorExp, closureValue);
/*		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = iteratorExp.getSource().getType();
		boolean isOrdered = stdlib.isOrdered(sourceType);
//		boolean isUnique = sourceType.isUnique();
		Value initResultVal = createAccumulationValue(evaluationVisitor.getValueFactory(), isOrdered, true);
		List<? extends VariableDeclaration> iterators = iteratorExp.getReferredIteration().getOwnedIterators();
		OclExpression body = iteratorExp.getBody();		
		CollectionValue coll = (CollectionValue) sourceVal;
		// get an iteration template to evaluate the iterator
		IterationTemplate template = IterationTemplateClosure.getInstance(evaluationVisitor, body);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		evaluationVisitor.getEvaluationEnvironment().add(resultName, initResultVal);		
		try {
			// evaluate
			return template.evaluateBody(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			evaluationVisitor.getEvaluationEnvironment().remove(resultName);
		} */
	}
	
	@Override
	protected Value resolveTerminalValue(EvaluationEnvironment env, ClosureValue accumulatorValue) {
		return accumulatorValue.accumulator;
	}
	
	/**
	 * Recursively evaluates the iterator body expression.
	 */
    protected Value updateAccumulator(EvaluationVisitor evaluationVisitor, List<? extends VariableDeclaration> iterators,
    		OclExpression body, ClosureValue accumulatorValue) {
		EvaluationEnvironment env = evaluationVisitor.getEvaluationEnvironment();
		Value bodyVal = body.accept(evaluationVisitor);		
		if (bodyVal.isUndefined()) {
			return bodyVal.toInvalidValue();				// Null body is invalid
		}
		if (accumulatorValue.depth > 0) {
			// If there is the parent is the iterator
			String iterName = iterators.get(0).getName();
			Value currObj = env.getValueOf(iterName);
			if (!accumulatorValue.add(currObj)) {
				return accumulatorValue;
			}
		}
		if (bodyVal != null) {
			try {
				accumulatorValue.depth++;
				CollectionValue bodyColl;
				if (bodyVal instanceof CollectionValue) {
					bodyColl = (CollectionValue) bodyVal;
				}
				else {
					bodyColl = env.getValueFactory().createSequenceValue(bodyVal);
				}
				Value[] iteratorValues = pauseIterators(env, iterators);
				evaluateIteration(evaluationVisitor, bodyColl, (LoopExp) body.eContainer(), accumulatorValue);
				resumeIterators(env, iterators, iteratorValues);
			}
			finally {
				accumulatorValue.depth--;
			}
		}
		return null;
	}
	
	/**
	 * Removes the current values of the specified iterators from the
	 * current evaluation environment, to be restored later.  This
	 * protects the recursive invocation of the template from attempting
	 * to rebind the iterator variables.
	 * 
	 * @param iterators the iterators to pause
	 * 
	 * @return the current values of the <code>iterators</code>
	 */
	private Value[] pauseIterators(EvaluationEnvironment env, List<? extends VariableDeclaration> iterators) {
		Value[] result = new Value[iterators.size()];
		for (int i = 0, n = result.length; i < n; i++) {
			VariableDeclaration iterDecl = iterators.get(i);			
			result[i] = env.remove(iterDecl.getName());
		}		
		return result;
	}
	
	/**
	 * Restores the current values of the specified iterators to the
	 * current evaluation environment.
	 * 
	 * @param iterators the iterators to resume
	 * @param values the iterator values to restore
	 */
	private void resumeIterators(EvaluationEnvironment env, List<? extends VariableDeclaration> iterators, Value[] values) {
		for (int i = 0, n = values.length; i < n; i++) {
			VariableDeclaration iterDecl = iterators.get(i);			
			env.add(iterDecl.getName(), values[i]);
		}
	}
}
