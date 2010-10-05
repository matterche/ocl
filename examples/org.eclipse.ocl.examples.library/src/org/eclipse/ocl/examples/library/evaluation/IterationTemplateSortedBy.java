/**
 * <copyright>
 *
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: IterationTemplateSortedBy.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;

/**
 *
 */
public class IterationTemplateSortedBy extends IterationTemplate {
	private IterationTemplateSortedBy(EvaluationVisitor evaluationVisitor) {
		super(evaluationVisitor);
	}
	
	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor) {
		return new IterationTemplateSortedBy(evaluationVisitor);
	}
	
	@Override
    protected Object evaluateResult(List<Variable> iterators, String resultName, Object bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();
		
		@SuppressWarnings("unchecked")
		Map<Object, Comparable<Object>> resultVal =
			(Map<Object, Comparable<Object>>) env.getValueOf(resultName);
		
		// must have exactly one iterator
		String iterName = iterators.get(0).getName();
		Object iterVal = env.getValueOf(iterName);
		
		// check for undefined result:
		// the current result value cannot be true since the short-circuit
		// "isDone" mechanism below would have caused the evaluation to stop.
		// If the body result is undefined then the entire expression's value
		// is invalid
		if (isUndefined(bodyVal)) {
			setDone(true);
			return getInvalid();
		}
		
		@SuppressWarnings("unchecked")
		Comparable<Object> comparable = (Comparable<Object>) bodyVal;
		
		resultVal.put(iterVal, comparable);
		return resultVal;
	}
}
