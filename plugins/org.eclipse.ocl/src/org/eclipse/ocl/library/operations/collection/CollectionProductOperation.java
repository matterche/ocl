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
 * $Id: CollectionProductOperation.java,v 1.1.2.1 2010/01/24 07:41:05 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.collection;

import java.util.Collection;
import java.util.Set;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * CollectionProductOperation realises the Collection::product() library operation.
 * 
 * @since 3.0
 */
public class CollectionProductOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		if (isInvalid(sourceVal)) {
			return null;
		}
		Object argVal = visitor.visitArgument(operationCall, 0);
		if (isInvalid(argVal)) {
			return null;
		}		
		if (!(argVal instanceof Collection<?>)) {
			return null;
		}		
		if (isNull(sourceVal)) {
			return evaluateCollection(visitor, CollectionUtil.createNewBag(), operationCall, (Collection<?>)argVal);
		}
		else if (sourceVal instanceof Collection<?>) {
			return evaluateCollection(visitor, (Collection<?>)sourceVal, operationCall, (Collection<?>) argVal);
		}
		else {
			Set<Object> sourceSet = CollectionUtil.createNewSet();
			sourceSet.add(sourceVal);
			return evaluateCollection(visitor, sourceSet, operationCall, (Collection<?>)argVal);
		}
	}

	protected <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluateCollection(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Collection<?> sourceVal, OperationCallExp<?, ?> operationCall, Collection<?> argVal) {
		@SuppressWarnings("unchecked")
		CollectionType<C, ?> collType = (CollectionType<C, ?>) operationCall.getType();
		EvaluationEnvironment<C, O, P, CLS, E> evaluationEnvironment = visitor.getEvaluationEnvironment();
		Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> environment = visitor.getEnvironment();
		return CollectionUtil.product(evaluationEnvironment, environment, sourceVal, argVal, collType.getElementType());
	}
}
