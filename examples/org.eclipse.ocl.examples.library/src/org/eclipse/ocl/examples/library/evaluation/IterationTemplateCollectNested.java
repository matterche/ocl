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
 * $Id: IterationTemplateCollectNested.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
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
public final class IterationTemplateCollectNested extends IterationTemplate {
	private IterationTemplateCollectNested(EvaluationContext evaluationContext) {
		super(evaluationContext);
	}
	
	public static IterationTemplate getInstance(EvaluationContext evaluationContext) {
		return new IterationTemplateCollectNested(evaluationContext);
	}
	
	@Override
    protected Object evaluateResult(List<Variable> iterators, String resultName, Object bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();
		
		@SuppressWarnings("unchecked")
		Collection<Object> currVal = (Collection<Object>) env.getValueOf(resultName);
		
		// If the body result is invalid then the entire expression's value
		// is invalid, because OCL does not permit invalid in a collection
		if (isInvalid(bodyVal)) {
			setDone(true);
			return bodyVal;
		}
		
		currVal.add(bodyVal);
		return currVal;
	}
}
