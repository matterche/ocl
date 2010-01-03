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
 * $Id: BooleanNotEqualOperation.java,v 1.1.2.1 2010/01/03 22:53:48 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * BooleanNotEqualOperation realises the Boolean::<>() library operation.
 * 
 * @since 3.0
 */
public class BooleanNotEqualOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall) {
		Object sourceVal = evaluateSource(visitor, operationCall);
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		if (isBoolean(sourceVal) && isBoolean(argVal)) {
			return sourceVal != argVal;
		}
		if (isInvalid(sourceVal) && isInvalid(argVal)) {
			return Boolean.FALSE;
		}
		if (isNull(sourceVal) && isNull(argVal)) {
			return Boolean.FALSE;
		}			
		return Boolean.TRUE;
	}
}
