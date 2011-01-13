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
 * $Id: IterationTemplateForAll.java,v 1.1.2.7 2011/01/13 19:16:20 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;

import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.Value;

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
    protected Value evaluateResult(List<? extends VariableDeclaration> iterators, String resultName, Value bodyVal) {
		if (bodyVal.isUndefined()) {
			return bodyVal.toInvalidValue();
		}
		EvaluationEnvironment env = getEvalEnvironment();
		Value currVal = env.getValueOf(resultName);		
		boolean resultVal = currVal.isTrue() && bodyVal.isTrue();
		if (!resultVal)
			setDone(true);
		return getValueFactory().booleanValueOf(resultVal);
	}
}
