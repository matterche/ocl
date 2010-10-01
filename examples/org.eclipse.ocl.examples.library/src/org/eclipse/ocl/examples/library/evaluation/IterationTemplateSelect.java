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
 * $Id: IterationTemplateSelect.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.Collection;
import java.util.List;

import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;

/**
 *
 */
public class IterationTemplateSelect extends IterationTemplate {

	private IterationTemplateSelect(EvaluationContext evaluationContext) {
		super(evaluationContext);
	}

	public static IterationTemplate getInstance(EvaluationContext evaluationContext) {
		return new IterationTemplateSelect(evaluationContext);
	}

	@Override
    protected Object evaluateResult(List<Variable> iterators, String resultName, Object body) {
		EvaluationEnvironment env = getEvalEnvironment();
		
		// should be exactly one iterator
		String iterName = iterators.get(0).getName();
		Object currObj = env.getValueOf(iterName);
		
		@SuppressWarnings("unchecked")
		Collection<Object> resultVal = (Collection<Object>) env.getValueOf(resultName);
		
		// check for undefined result:
		// the current result value cannot be true since the short-circuit
		// "isDone" mechanism below would have caused the evaluation to stop.
		// If the body result is undefined then the entire expression's value
		// is invalid
		if (isUndefined(body)) {
			setDone(true);
			return getInvalid();
		}
		
		Boolean bodyVal = (Boolean)body;
		if (bodyVal == null)
			return resultVal;
		boolean bodyCond = bodyVal.booleanValue();
		if (bodyCond)
			resultVal.add(currObj);
		return resultVal;
	}
}
