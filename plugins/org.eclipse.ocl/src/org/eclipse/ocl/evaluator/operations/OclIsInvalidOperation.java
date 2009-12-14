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
 * $Id: OclIsInvalidOperation.java,v 1.1.2.1 2009/12/14 21:59:09 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.utilities.PredefinedType;

/**
 * OclIsInvalidOperation realises the oclIsInvalid() library operation.
 * 
 * @since 3.0
 */
public class OclIsInvalidOperation extends ZeroArgumentOperation
{
	public static final OclIsInvalidOperation INSTANCE = new OclIsInvalidOperation();
	
	protected OclIsInvalidOperation() {
		super(PredefinedType.OCL_IS_INVALID);
	}

	public <C, O> Object evaluate(EvaluationVisitor<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<C, O> operationCall) {
		Object sourceVal = evaluateSource(visitor, operationCall);
		if (isInvalid(visitor, sourceVal)) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
