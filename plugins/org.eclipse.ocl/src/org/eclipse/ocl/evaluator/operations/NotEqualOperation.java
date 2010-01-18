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
 * $Id: NotEqualOperation.java,v 1.1.2.3 2010/01/18 22:07:17 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * NotEqualOperation realises the OCLAny::<>() library operation.
 * 
 * @since 3.0
 */
public class NotEqualOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		if (isInvalid(sourceVal) && isInvalid(argVal)) {
			return false;
		}
		if (isNull(sourceVal) && isNull(argVal)) {
			return false;
		}
		if (isUndefined(sourceVal) && isUndefined(argVal)) {
			return true;
		}
		return sourceVal != argVal;
	}
}
