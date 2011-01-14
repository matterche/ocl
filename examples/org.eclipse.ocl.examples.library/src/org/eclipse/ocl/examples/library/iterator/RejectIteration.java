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
 * $Id: RejectIteration.java,v 1.1.2.9 2011/01/14 14:54:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.List;

import org.eclipse.ocl.examples.library.AbstractIteration;
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
 * RejectIteration realises the Collection::reject() library iteration.
 * 
 * @since 3.1
 */
public class RejectIteration extends AbstractIteration<CollectionValue.Accumulator>
{
	public static final RejectIteration INSTANCE = new RejectIteration();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, LoopExp iteratorExp) {
		ValueFactory valueFactory = evaluationVisitor.getValueFactory();
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = iteratorExp.getSource().getType();
		boolean isOrdered = stdlib.isOrdered(sourceType);
		boolean isUnique = stdlib.isUnique(sourceType);
		CollectionValue.Accumulator accumulatorValue = createAccumulationValue(valueFactory, isOrdered, isUnique);
		return evaluateIteration(evaluationVisitor, (CollectionValue) sourceVal, iteratorExp, accumulatorValue);
	}
	
	@Override
    protected Value updateAccumulator(EvaluationVisitor evaluationVisitor, List<? extends VariableDeclaration> iterators,
    		OclExpression body, CollectionValue.Accumulator accumulatorValue) {
		Value bodyVal = body.accept(evaluationVisitor);		
		if (bodyVal.isUndefined()) {
			return bodyVal.toInvalidValue();
		}
		// should be exactly one iterator
		EvaluationEnvironment env = evaluationVisitor.getEvaluationEnvironment();
		String iterName = iterators.get(0).getName();
		Value currObj = env.getValueOf(iterName);		
		if (bodyVal.isFalse())
			accumulatorValue.add(currObj);
		return null;
	}
}
