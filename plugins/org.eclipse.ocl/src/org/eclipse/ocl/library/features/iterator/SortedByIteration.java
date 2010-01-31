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
 * $Id: SortedByIteration.java,v 1.1.2.1 2010/01/31 22:23:44 ewillink Exp $
 */
package org.eclipse.ocl.library.features.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.internal.evaluation.IterationTemplate;
import org.eclipse.ocl.internal.evaluation.IterationTemplateSortedBy;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.features.AbstractIteration;
import org.eclipse.ocl.library.features.AbstractOperation;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * SelectIteration realises the Collection::select() library iteration.
 * 
 * @since 3.0
 */
public class SortedByIteration extends AbstractIteration
{
	public 	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor, Object sourceVal, IteratorExp<C, PM> iteratorExp) {
//		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = evaluationVisitor.getEnvironment();
//		MergedLibrary library = environment.getMergedLibrary();
//		OCLType sourceType = library.getLibraryTypeOfType(iteratorExp.getSource().getType());
//		boolean isOrdered = sourceType.isOrdered();
//		boolean isUnique = sourceType.isUnique();
//		Object initResultVal = CollectionUtil.createNewCollection(isOrdered, isUnique);
		List<Variable<C, PM>> iterators = iteratorExp.getIterator();
		OCLExpression<C> body = iteratorExp.getBody();
		Collection<?> coll = (Collection<?>) sourceVal;
		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateSortedBy.getInstance(evaluationVisitor);
		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		final Map<Object, Comparable<Object>> map =
			new HashMap<Object, Comparable<Object>>();
		evaluationVisitor.getEvaluationEnvironment().add(resultName, map);		
		try {
			// evaluate
			// TODO: find an efficient way to do this.
			Object evaluationResult = is.evaluate(coll, iterators, body, resultName);
			
			if (AbstractOperation.isInvalid(evaluationResult)) {
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
		List<Object> result = new ArrayList<Object>(coll);

		Collections.sort(result, new Comparator<Object>() {

			public int compare(Object o1, Object o2) {
				Comparable<Object> b1 = map.get(o1);
				Comparable<Object> b2 = map.get(o2);
				return (b1.compareTo(b2));
			}
		});

		// create result
		// type is Sequence if source is a sequence or a Bag,
		// SortedSet if source is a SortedSet or a Set
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = evaluationVisitor.getEnvironment();
		MergedLibrary library = environment.getMergedLibrary();
		OCLType sourceType = library.getLibraryTypeOfType(iteratorExp.getSource().getType());
//		boolean isOrdered = sourceType.isOrdered();
		boolean isUnique = sourceType.isUnique();
		Collection<Object> initResultVal = CollectionUtil.createNewCollection(true, isUnique);
		initResultVal.addAll(result);
		return initResultVal;
	}
}
