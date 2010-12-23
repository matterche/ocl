/**
 * <copyright>
 *
 * Copyright (c) 2006, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   E.D.Willink - Bug 297541
 *
 * </copyright>
 *
 * $Id: IterationTemplateClosure.java,v 1.1.2.3 2010/12/23 19:24:48 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;

import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.SequenceValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * Instantiation of the iteration template for the <code>closure</code>
 * iterator.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class IterationTemplateClosure extends IterationTemplate
{
	private OclExpression body;	
	private int depth = 0;
	
	private IterationTemplateClosure(EvaluationVisitor evaluationVisitor, OclExpression body) {
		super(evaluationVisitor);		
		this.body = body;
	}
	
	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor, OclExpression body) {
		return new IterationTemplateClosure(evaluationVisitor, body);
	}
	
	/**
	 * Recursively evaluates the iterator body expression.
	 */
	@Override
    protected Value evaluateResult(List<Variable> iterators, String resultName, Value bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();		
		CollectionValue.Accumulator resultVal = (CollectionValue.Accumulator) env.getValueOf(resultName);
		if (depth > 0) {
			// If there is the parent is the iterator
			String iterName = iterators.get(0).getName();
			Value currObj = env.getValueOf(iterName);
			if (!resultVal.add(currObj)) {
				return resultVal;
			}
		}
		if (bodyVal != null) {
			try {
				depth++;
				CollectionValue bodyColl;
				if (bodyVal instanceof CollectionValue) {
					bodyColl = (CollectionValue) bodyVal;
				}
				else {
					bodyColl = new SequenceValue(bodyVal);
				}
				Value[] iteratorValues = pauseIterators(iterators);
				evaluate(bodyColl, iterators, body, resultName);
				resumeIterators(iterators, iteratorValues);
			}
			finally {
				depth--;
			}
		}
		return resultVal;
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
	private Value[] pauseIterators(List<Variable> iterators) {
		Value[] result = new Value[iterators.size()];
		EvaluationEnvironment env = getEvalEnvironment();		
		for (int i = 0, n = result.length; i < n; i++) {
			Variable iterDecl = iterators.get(i);			
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
	private void resumeIterators(List<Variable> iterators, Value[] values) {
		EvaluationEnvironment env = getEvalEnvironment();		
		for (int i = 0, n = values.length; i < n; i++) {
			Variable iterDecl = iterators.get(i);			
			env.add(iterDecl.getName(), values[i]);
		}
	}
}
