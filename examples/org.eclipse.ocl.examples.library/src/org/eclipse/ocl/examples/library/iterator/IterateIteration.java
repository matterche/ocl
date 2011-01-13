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
 * $Id: IterateIteration.java,v 1.1.2.1 2011/01/13 19:16:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.List;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplate;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * IsUniqueIteration realises the Collection::isUnique() library iteration.
 * 
 * @since 3.1
 */
public class IterateIteration extends AbstractIteration
{
	public static final IterateIteration INSTANCE = new IterateIteration();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, LoopExp iterateExp) {
		ValueFactory valueFactory = evaluationVisitor.getValueFactory();
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		List<? extends VariableDeclaration> iterators = iterateExp.getReferredIteration().getOwnedIterators();
		OclExpression body = iterateExp.getBody();		
		CollectionValue coll = (CollectionValue) sourceVal;
		Type sourceType = iterateExp.getSource().getType();
		boolean isOrdered = stdlib.isOrdered(sourceType);
		boolean isUnique = stdlib.isUnique(sourceType);
//		CollectionType collType = sourceVal.getType();
		// get an iteration template to evaluate the iterator
		IterationTemplate is = IterationTemplate.getInstance(evaluationVisitor);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		EvaluationEnvironment evaluationEnvironment = evaluationVisitor.getEvaluationEnvironment();
		evaluationEnvironment.add(resultName, createAccumulationValue(valueFactory, isOrdered, isUnique));		
		try {
			// evaluate
			is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			evaluationEnvironment.remove(resultName);
		}
		return valueFactory.booleanValueOf(!is.isDone());
	}
}
