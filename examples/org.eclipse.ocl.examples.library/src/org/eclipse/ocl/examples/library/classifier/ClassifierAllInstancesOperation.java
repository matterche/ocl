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
 * $Id: ClassifierAllInstancesOperation.java,v 1.1.2.2 2010/10/05 17:29:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.classifier;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;

/**
 * ClassifierAllInstancesOperation realises the Classifier::allInstances() library operation.
 * 
 * @since 3.1
 */
public class ClassifierAllInstancesOperation extends AbstractOperation
{
	public static final ClassifierAllInstancesOperation INSTANCE = new ClassifierAllInstancesOperation();

	public Object evaluate(EvaluationVisitor evaluationVisitor, Object sourceVal, OperationCallExp operationCall) {
		Map<?, ? extends Set<?>> extentMap = evaluationVisitor.getExtentMap();
		Set<?> instances = extentMap.get(sourceVal);
		return instances != null ? instances : Collections.EMPTY_SET;
	}
}
