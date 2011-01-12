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
 * $Id: IterationTemplateSortedBy.java,v 1.1.2.7 2011/01/12 10:28:53 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.values.impl.AbstractValue;

/**
 *
 */
public class IterationTemplateSortedBy extends IterationTemplate
{
	public static class SortingValue extends AbstractValue
	{
		private Map<Object, Value> content;

		public SortingValue(ValueFactory valueFactory, Map<Object, Value> content) {
			super(valueFactory);
			this.content = content;
		}

		public Type getType(StandardLibrary standardLibrary, Type staticType) {
			return staticType;
		}

		public void put(Value iterVal, Value comparable) {
			content.put(iterVal, comparable);
		}

		@Override
		public String toString() {
			return content.toString();
		}
	}
	
	private IterationTemplateSortedBy(EvaluationVisitor evaluationVisitor) {
		super(evaluationVisitor);
	}
	
	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor) {
		return new IterationTemplateSortedBy(evaluationVisitor);
	}
	
	@Override
    protected Value evaluateResult(List<? extends VariableDeclaration> iterators, String resultName, Value bodyVal) {
		EvaluationEnvironment env = getEvalEnvironment();
		SortingValue resultVal = (SortingValue) env.getValueOf(resultName);
		
		// must have exactly one iterator
		String iterName = iterators.get(0).getName();
		Value iterVal = env.getValueOf(iterName);
		resultVal.put(iterVal, bodyVal);
		return resultVal;
	}
}
