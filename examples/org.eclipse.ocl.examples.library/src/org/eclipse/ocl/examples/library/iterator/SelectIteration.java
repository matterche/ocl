/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
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
 * $Id: SelectIteration.java,v 1.1.2.1 2010/10/01 13:28:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.Collection;
import java.util.List;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplate;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplateSelect;
import org.eclipse.ocl.examples.library.util.CollectionUtil2;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;

/**
 * SelectIteration realises the Collection::select() library iteration.
 * 
 * @since 3.1
 */
public class SelectIteration extends AbstractIteration
{
	public static final SelectIteration INSTANCE = new SelectIteration();

	public Object evaluate(EvaluationContext evaluationContext, Object sourceVal, IteratorExp iteratorExp) {
		Type sourceType = evaluationContext.getTypeOfType(iteratorExp.getSource().getType());
		boolean isOrdered = CollectionUtil2.isOrdered(sourceType);
		boolean isUnique = CollectionUtil2.isUnique(sourceType);
		Object initResultVal = CollectionUtil2.createNewCollection(isOrdered, isUnique);
		List<Variable> iterators = iteratorExp.getIterators();
		OclExpression body = iteratorExp.getBody();
		Collection<?> coll = (Collection<?>) sourceVal;
		// get an iteration template to evaluate the iterator
		IterationTemplate is = IterationTemplateSelect.getInstance(evaluationContext);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		evaluationContext.getEvaluationEnvironment().add(resultName, initResultVal);		
		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			evaluationContext.getEvaluationEnvironment().remove(resultName);
		}
	}
}
