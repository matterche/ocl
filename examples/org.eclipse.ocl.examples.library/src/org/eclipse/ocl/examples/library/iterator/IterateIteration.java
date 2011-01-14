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
 * $Id: IterateIteration.java,v 1.1.2.2 2011/01/14 14:54:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.List;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
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
public class IterateIteration extends AbstractIteration<CollectionValue.Accumulator>
{
	public static final IterateIteration INSTANCE = new IterateIteration();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, LoopExp iterateExp) {
		ValueFactory valueFactory = evaluationVisitor.getValueFactory();
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = iterateExp.getSource().getType();
		boolean isOrdered = stdlib.isOrdered(sourceType);
		boolean isUnique = stdlib.isUnique(sourceType);
		CollectionValue.Accumulator accumulatorValue = createAccumulationValue(valueFactory, isOrdered, isUnique);
		EvaluationEnvironment evaluationEnvironment = evaluationVisitor.getEvaluationEnvironment();
		Variable accumulator = ((IterateExp)iterateExp).getResult();
		String explicitAccumulatorName = null;
		if (!accumulator.isImplicit()) {
			explicitAccumulatorName = accumulator.getName();
			evaluationEnvironment.add(explicitAccumulatorName, accumulatorValue);		
		}
		try {
			return evaluateIteration(evaluationVisitor, (CollectionValue) sourceVal, iterateExp, accumulatorValue);
		}
		finally {
			if (explicitAccumulatorName != null) {
				evaluationEnvironment.remove(explicitAccumulatorName);		
			}
		}

/*		ValueFactory valueFactory = evaluationVisitor.getValueFactory();
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
			Value resultValue = is.evaluateBody(coll, iterators, body, resultName);
			if (resultValue.isInvalid()) {
				return resultValue;
			}
			return valueFactory.getFalse();
//			return valueFactory.booleanValueOf(!is.isDone());
		} finally {
			// remove result name from environment
			evaluationEnvironment.remove(resultName);
		} */
	}

	@Override
	protected Value updateAccumulator(EvaluationVisitor evaluationVisitor, List<? extends VariableDeclaration> iterators,
			OclExpression body, CollectionValue.Accumulator accumulatorValue) {
		Value bodyVal = body.accept(evaluationVisitor);		
		if (bodyVal.isInvalid()) {
			return bodyVal;				// Invalid body is invalid
		}
		return null;					// carry on
	}
}
