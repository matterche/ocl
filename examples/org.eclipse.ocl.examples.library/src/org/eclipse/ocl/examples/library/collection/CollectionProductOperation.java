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
 * $Id: CollectionProductOperation.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.collection;

import java.util.Collection;
import java.util.Set;

import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionUtil;

/**
 * CollectionProductOperation realises the Collection::product() library operation.
 * 
 * @since 3.1
 */
public class CollectionProductOperation extends AbstractOperation // FIXME Make this an AbstractBinaryOperation
{
	public static final CollectionProductOperation INSTANCE = new CollectionProductOperation();

	public Object evaluate(EvaluationVisitor evaluationVisitor, Object sourceVal, OperationCallExp operationCall) {
		if (isInvalid(sourceVal)) {
			return null;
		}
		Object argVal = evaluateArgument(evaluationVisitor, operationCall, 0);
		if (isInvalid(sourceVal) ||isInvalid(argVal)) {
			return null;
		}		
		if (!(argVal instanceof Collection<?>)) {
			return null;
		}		
		if (isNull(sourceVal)) {
			return evaluateCollection(evaluationVisitor, CollectionUtil.createNewBag(), operationCall, (Collection<?>)argVal);
		}
		else if (sourceVal instanceof Collection<?>) {
			return evaluateCollection(evaluationVisitor, (Collection<?>)sourceVal, operationCall, (Collection<?>) argVal);
		}
		else {
			Set<Object> sourceSet = CollectionUtil.createNewSet();
			sourceSet.add(sourceVal);
			return evaluateCollection(evaluationVisitor, sourceSet, operationCall, (Collection<?>)argVal);
		}
	}

	protected Object evaluateCollection(EvaluationVisitor evaluationVisitor, Collection<?> sourceVal, OperationCallExp operationCall, Collection<?> argVal) {
		CollectionType collType = (CollectionType) operationCall.getType();
		TupleType tupleType = (TupleType) collType.getElementType();
		return CollectionUtil.product(sourceVal, argVal, tupleType);
	}
}
