/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AnyIteration.java,v 1.1.2.1 2010/01/31 22:23:44 ewillink Exp $
 */
package org.eclipse.ocl.library.features.iterator;

import java.util.Collection;
import java.util.List;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.internal.evaluation.IterationTemplate;
import org.eclipse.ocl.internal.evaluation.IterationTemplateAny;
import org.eclipse.ocl.library.features.AbstractIteration;

/**
 * AnyIteration realises the Collection::any() library iteration.
 * 
 * @since 3.0
 */
public class AnyIteration extends AbstractIteration
{
	public 	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor, Object sourceVal, IteratorExp<C, PM> iteratorExp) {
		List<Variable<C, PM>> iterators = iteratorExp.getIterator();
		OCLExpression<C> body = iteratorExp.getBody();		
		Collection<?> coll = (Collection<?>) sourceVal;
		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateAny.getInstance(evaluationVisitor);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		evaluationVisitor.getEvaluationEnvironment().add(resultName, null);		
		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			evaluationVisitor.getEvaluationEnvironment().remove(resultName);
		}
	}
}
