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
 * $Id: IterationTemplateCollect.java,v 1.1.2.5 2011/01/13 19:16:20 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;

import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

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
    protected Value evaluateResult(List<? extends VariableDeclaration> iterators, String resultName, Value bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();		
		CollectionValue.Accumulator currVal = (CollectionValue.Accumulator) env.getValueOf(resultName);		
		if (bodyVal.isInvalid()) {
			return bodyVal;
		}
		else if (bodyVal.isNull()) {
			currVal.add(bodyVal);
		}
		else if (bodyVal instanceof CollectionValue) {
			CollectionValue bodyColl = (CollectionValue) bodyVal;
			for (Value value : bodyColl.flatten()) {
				currVal.add(value);
			}
		}
		else
			currVal.add(bodyVal);
		return currVal;
	}
}
