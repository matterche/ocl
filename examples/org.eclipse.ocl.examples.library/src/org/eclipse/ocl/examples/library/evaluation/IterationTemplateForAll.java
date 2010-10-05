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
 * $Id: IterationTemplateForAll.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;

import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;

/**
 *
 */
public final class IterationTemplateForAll extends IterationTemplate {
	
	private IterationTemplateForAll(EvaluationVisitor evaluationVisitor) {
		super(evaluationVisitor);
	}
	
	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor) {
		return new IterationTemplateForAll(evaluationVisitor);
	}
	
	@Override
    protected Object evaluateResult(List<Variable> iterators, String resultName, Object body) {
		EvaluationEnvironment env = getEvalEnvironment();
		
		// check for undefined result:
		// the current result value cannot be false since the short-circuit
		// "isDone" mechanism below would have caused the evaluation to stop.
		// If the body result is undefined then the entire expression's value
		// is invalid
		if (isUndefined(body)) {
			setDone(true);
			return getInvalid();
		}
		
		Boolean currVal = (Boolean)env.getValueOf(resultName);
		Boolean bodyVal = (Boolean)body;
		
		boolean resultVal = currVal.booleanValue() && bodyVal.booleanValue();
		if (!resultVal)
			setDone(true);
		return resultVal ? Boolean.TRUE : Boolean.FALSE;
	}
}
