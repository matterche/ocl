/**
 * <copyright>
 *
 * Copyright (c) 2005, 2008 IBM Corporation and others.
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
 * $Id: IterationTemplateCollect.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.Collection;
import java.util.List;

import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.values.CollectionUtil;

/**
 *
 */
public class IterationTemplateCollect extends IterationTemplate {
	private IterationTemplateCollect(EvaluationVisitor evaluationVisitor) {
		super(evaluationVisitor);
	}
	
	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor) {
		return new IterationTemplateCollect(evaluationVisitor);
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
		
		if (bodyVal instanceof Collection<?>) {
			Collection<?> bodyColl = (Collection<?>) bodyVal;
			currVal.addAll(CollectionUtil.flatten(bodyColl));
		}
		else
			currVal.add(bodyVal);
		return currVal;
	}
}
