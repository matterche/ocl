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
 * $Id: IterationTemplateAny.java,v 1.1.2.4 2011/01/12 10:28:53 ewillink Exp $
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
public class IterationTemplateAny extends IterationTemplate {

	protected IterationTemplateAny(EvaluationVisitor evaluationVisitor) {
		super(evaluationVisitor);
	}

	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor) {
		return new IterationTemplateAny(evaluationVisitor);
	}
	
	@Override
    protected Value evaluateResult(List<? extends VariableDeclaration> iterators, String resultName, Value bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();
		// should be exactly one iterator
		String iterName = iterators.get(0).getName();
		Value currObj = env.getValueOf(iterName);
		Value resultVal = null;
		
		if (bodyVal.isTrue()) {
			resultVal = currObj;
			setDone(true);
		}
		return resultVal;
	}
}
