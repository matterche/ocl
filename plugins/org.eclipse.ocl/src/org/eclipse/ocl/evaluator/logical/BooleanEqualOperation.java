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
 * $Id: BooleanEqualOperation.java,v 1.1.2.1 2010/01/18 08:57:53 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.logical;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.evaluator.operations.AbstractOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * BooleanEqualOperation realises the Boolean::=() library operation.
 * 
 * @since 3.0
 */
public class BooleanEqualOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		if (isBoolean(sourceVal) && isBoolean(argVal)) {
			return sourceVal == argVal;
		}
		if (isInvalid(sourceVal) && isInvalid(argVal)) {
			return Boolean.TRUE;
		}
		if (isNull(sourceVal) && isNull(argVal)) {
			return Boolean.TRUE;
		}			
		return Boolean.FALSE;
	}
}
