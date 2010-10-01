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
 * $Id: IterationTemplateIsUnique.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;

/**
 *
 */
public class IterationTemplateIsUnique extends IterationTemplate {
	
	private IterationTemplateIsUnique(EvaluationContext evaluationContext) {
		super(evaluationContext);
	}
	
	public static IterationTemplate getInstance(EvaluationContext evaluationContext) {
		return new IterationTemplateIsUnique(evaluationContext);
	}
	
	@Override
    protected Object evaluateResult(List<Variable> iterators, String resultName, Object bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();
		
		@SuppressWarnings("unchecked")
		Set<Object> currVal = (Set<Object>) env.getValueOf(resultName);
		if (currVal.contains(bodyVal)) {
			setDone(true);
		}
		else
			currVal.add(bodyVal);
		return currVal;
	}
}
