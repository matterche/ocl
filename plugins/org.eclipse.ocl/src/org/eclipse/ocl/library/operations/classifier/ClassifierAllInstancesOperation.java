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
 * $Id: ClassifierAllInstancesOperation.java,v 1.1.2.1 2010/01/24 07:41:20 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.classifier;

import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;

/**
 * ClassifierAllInstancesOperation realises the Classifier::allInstances() library operation.
 * 
 * @since 3.0
 */
public class ClassifierAllInstancesOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		Map<?, ? extends Set<?>> extentMap = visitor.getExtentMap();
		Set<?> instances = extentMap.get(sourceVal);
		return instances;
	}
}
