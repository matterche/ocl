/**
 * <copyright>
 *
 * Copyright (c) 2005, 2009 IBM Corporation, Borland Software Corp., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Borland - Bug 265066
 *
 * </copyright>
 *
 * $Id: IterationTemplateAny.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;

import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;

/**
 *
 */
public class IterationTemplateAny extends IterationTemplate {

	protected IterationTemplateAny(EvaluationContext evaluationContext) {
		super(evaluationContext);
	}

	public static IterationTemplate getInstance(EvaluationContext evaluationContext) {
		return new IterationTemplateAny(evaluationContext);
	}
	
	@Override
    protected Object evaluateResult(List<Variable> iterators, String resultName, Object bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();
		// should be exactly one iterator
		String iterName = iterators.get(0).getName();
		Object currObj = env.getValueOf(iterName);
		Object resultVal = null;
		
		// If the body result is undefined then the entire expression's value
		// is invalid
		if (isUndefined(bodyVal)) {
			setDone(true);
			return getInvalid();
		}
		
		boolean bodyCond = ((Boolean)bodyVal).booleanValue();
		if (bodyCond) {
			resultVal = currObj;
			setDone(true);
		}
		return resultVal;
	}
}
