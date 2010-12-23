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
 * $Id: SortedByIteration.java,v 1.1.2.4 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplate;
import org.eclipse.ocl.examples.library.evaluation.IterationTemplateSortedBy;
import org.eclipse.ocl.examples.library.util.CollectionUtil2;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.OrderedSetValue;
import org.eclipse.ocl.examples.pivot.values.SequenceValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * SelectIteration realises the Collection::select() library iteration.
 * 
 * @since 3.1
 */
public class SortedByIteration extends AbstractIteration
{
	public static final SortedByIteration INSTANCE = new SortedByIteration();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, OperationCallExp iteratorExp) {
//		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = evaluationVisitor.getEnvironment();
//		MergedLibrary library = environment.getMergedLibrary();
//		OCLType sourceType = library.getLibraryTypeOfType(iteratorExp.getSource().getType());
//		boolean isOrdered = sourceType.isOrdered();
//		boolean isUnique = sourceType.isUnique();
//		Object initResultVal = CollectionUtil.createNewCollection(isOrdered, isUnique);
		List<Variable> iterators = getIterators(iteratorExp);
		OclExpression body = getBody(iteratorExp);		
		CollectionValue coll = (CollectionValue) sourceVal;
		// get an iteration template to evaluate the iterator
		IterationTemplate is = IterationTemplateSortedBy.getInstance(evaluationVisitor);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		final Map<Object, Value> map = new HashMap<Object, Value>();
		evaluationVisitor.getEvaluationEnvironment().add(resultName, new IterationTemplateSortedBy.SortingValue(map));		
		try {
			// evaluate
			// TODO: find an efficient way to do this.
			Value evaluationResult = is.evaluate(coll, iterators, body, resultName);
			
			if (evaluationResult.isInvalid()) {
				// handle the OclInvalid result
				return evaluationResult;
			}
			
			is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			evaluationVisitor.getEvaluationEnvironment().remove(resultName);
		}
		// sort the source collection based on the natural ordering of the
		// body expression evaluations
		SequenceValue result = new SequenceValue(coll);

//		Collections.sort(result, new Comparator<Object>() {
//
//			public int compare(Object o1, Object o2) {
//				Comparable<Object> b1 = map.get(o1);
//				Comparable<Object> b2 = map.get(o2);
//				return (b1.compareTo(b2));
//			}
//		});

		// create result
		// type is Sequence if source is a sequence or a Bag,
		// SortedSet if source is a SortedSet or a Set
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = stdlib.getTypeOfType(iteratorExp.getSource().getType());
		boolean isUnique = CollectionUtil2.isUnique(sourceType);
		
		if (isUnique) {
			return new OrderedSetValue(result);
		}
		else {
			return new SequenceValue(result);
		}
				
//		CollectionValue initResultVal = CollectionUtil2.createNewCollection(true, isUnique);
//		initResultVal.addAll(result);
//		return result.sort(comparator);
	}
}
