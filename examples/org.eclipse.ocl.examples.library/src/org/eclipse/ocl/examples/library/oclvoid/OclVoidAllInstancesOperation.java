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
 * $Id: OclVoidAllInstancesOperation.java,v 1.1.2.1 2010/10/01 13:28:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclvoid;

import java.util.Collections;

import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.OperationCallExp;

/**
 * OclVoidAllInstancesOperation realises the OclVoid::allInstances() library operation.
 * 
 * @since 3.1
 */
public class OclVoidAllInstancesOperation extends AbstractOperation
{
	public static final OclVoidAllInstancesOperation INSTANCE = new OclVoidAllInstancesOperation();

	public Object evaluate(EvaluationContext evaluationContext, Object sourceVal, OperationCallExp operationCall) {
		// OclVoid has a single instance: null
		return Collections.singleton(evaluationContext.getNullValue());
	}
}