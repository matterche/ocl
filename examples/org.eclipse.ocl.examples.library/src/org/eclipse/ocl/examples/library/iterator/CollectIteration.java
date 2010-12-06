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
 * $Id: CollectIteration.java,v 1.1.2.3 2010/12/06 17:13:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.Collection;
import java.util.List;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplate;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplateCollect;
import org.eclipse.ocl.examples.library.util.CollectionUtil2;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;

/**
 * CollectIteration realises the Collection::collect() library iteration.
 * 
 * @since 3.1
 */
public class CollectIteration extends AbstractIteration
{
	public static final CollectIteration INSTANCE = new CollectIteration();

	public Object evaluate(EvaluationVisitor evaluationVisitor, Object sourceVal, OperationCallExp iteratorExp) {
		// get initial result value based on the source type
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = stdlib.getTypeOfType(iteratorExp.getSource().getType());
		boolean isOrdered = CollectionUtil2.isOrdered(sourceType);
		Object initResultVal = CollectionUtil2.createNewCollection(isOrdered, false);
		List<Variable> iterators = getIterators(iteratorExp);
		OclExpression body = getBody(iteratorExp);		
		Collection<?> coll = (Collection<?>) sourceVal;
		// get an iteration template to evaluate the iterator
		IterationTemplate is = IterationTemplateCollect.getInstance(evaluationVisitor);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		evaluationVisitor.getEvaluationEnvironment().add(resultName, initResultVal);		
		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			evaluationVisitor.getEvaluationEnvironment().remove(resultName);
		}
	}
}
