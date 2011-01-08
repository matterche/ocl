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
 * $Id: IterationTemplateOne.java,v 1.1.2.5 2011/01/08 15:34:43 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;

import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 *
 */
public class IterationTemplateOne extends IterationTemplate {

	private IterationTemplateOne(EvaluationVisitor evaluationVisitor) {
		super(evaluationVisitor);
	}

	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor) {
		return new IterationTemplateOne(evaluationVisitor);
	}

	@Override
    protected Value evaluateResult(List<Variable> iterators, String resultName, Value bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();
		// should be exactly one iterator
		//		String iterName = ((VariableDeclaration)iterators.get(0)).getVarName();
		//		Object currObj = env.getValueOf(iterName);
		Value resultVal = env.getValueOf(resultName);
		if (bodyVal.isTrue()) {
			if (!foundOne) {
				// if this is the first element satisfying the body condition
				// make a note of it.
				foundOne = true;
				return getValueFactory().TRUE;
			} else {
				// this is the second satisfying element.  The result is false
				// and we can stop iterating.
				setDone(true);
				return getValueFactory().FALSE;
			}
		}
		return getValueFactory().booleanValueOf(resultVal.isTrue());
	}

	private boolean foundOne = false;
}