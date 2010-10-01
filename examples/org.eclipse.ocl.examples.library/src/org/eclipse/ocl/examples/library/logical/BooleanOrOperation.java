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
 * $Id: BooleanOrOperation.java,v 1.1.2.1 2010/10/01 13:28:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.logical;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.OperationCallExp;

/**
 * OrOperation realises the or() library operation.
 * 
 * @since 3.1
 */
public class BooleanOrOperation extends AbstractBinaryOperation
{
	public static final BooleanOrOperation INSTANCE = new BooleanOrOperation();

	@Override
	public Object evaluate(EvaluationContext evaluationContext, Object sourceVal, OperationCallExp operationCall) {
		if (sourceVal == Boolean.TRUE) {
			return Boolean.TRUE;
		}
		Object argVal = evaluateArgument(evaluationContext, operationCall, 0);
		return evaluate(sourceVal, argVal);
	}

	public Object evaluate(Object left, Object right) {
		if (left == Boolean.TRUE) {
			return Boolean.TRUE;
		}
		if (right == Boolean.TRUE) {
			return Boolean.TRUE;
		}
		if ((left == Boolean.FALSE) && (right == Boolean.FALSE)) {
			return Boolean.FALSE;
		}
		return null;
	}
}
