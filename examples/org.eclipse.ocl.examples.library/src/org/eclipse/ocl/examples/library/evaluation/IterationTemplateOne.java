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
 * $Id: IterationTemplateOne.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;

import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;

/**
 *
 */
public class IterationTemplateOne extends IterationTemplate {

	private IterationTemplateOne(EvaluationContext evaluationContext) {
		super(evaluationContext);
	}

	public static IterationTemplate getInstance(EvaluationContext evaluationContext) {
		return new IterationTemplateOne(evaluationContext);
	}

	@Override
    protected Object evaluateResult(List<Variable> iterators, String resultName,
		Object body) {
		EvaluationEnvironment env = getEvalEnvironment();
		// should be exactly one iterator
		//		String iterName = ((VariableDeclaration)iterators.get(0)).getVarName();
		//		Object currObj = env.getValueOf(iterName);
		Boolean resultVal = (Boolean) env.getValueOf(resultName);

		// If the body result is undefined then the entire expression's value
		// is invalid
		if (isUndefined(body)) {
			setDone(true);
			return getInvalid();
		}
		
		Boolean bodyVal = (Boolean) body;

		boolean bodyCond = bodyVal.booleanValue();
		if (bodyCond) {
			if (!foundOne) {
				// if this is the first element satsifying the body condition
				// make a note of it.
				foundOne = true;
				return Boolean.TRUE;
			} else {
				// this is the second satisfying element.  The result is false
				// and we can stop iterating.
				setDone(true);
				return Boolean.FALSE;
			}
		}
		return resultVal.booleanValue() ? Boolean.TRUE : Boolean.FALSE;
	}

	private boolean foundOne = false;
}