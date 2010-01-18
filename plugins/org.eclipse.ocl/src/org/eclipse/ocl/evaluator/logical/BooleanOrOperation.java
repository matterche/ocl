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
 * $Id: BooleanOrOperation.java,v 1.1.2.1 2010/01/18 08:57:53 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.logical;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.evaluator.operations.AbstractOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * OrOperation realises the or() library operation.
 * 
 * @since 3.0
 */
public class BooleanOrOperation extends AbstractOperation
{
	@Override
	public Object evaluate(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, Object sourceVal, OperationCallExp<?, ?> operationCall) {
		if (sourceVal == Boolean.TRUE) {
			return Boolean.TRUE;
		}
		Object argVal = evaluateArgument(visitor, operationCall, 0);
		if (argVal == Boolean.TRUE) {
			return Boolean.TRUE;
		}
		if ((sourceVal == Boolean.FALSE) && (argVal == Boolean.FALSE)) {
			return Boolean.FALSE;
		}
		return null;
	}
}
