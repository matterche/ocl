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
 * $Id: BooleanAndOperation.java,v 1.1.2.3 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.logical;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * AndOperation realises the and() library operation.
 * 
 * @since 3.1
 */
public class BooleanAndOperation extends AbstractBinaryOperation
{
	public static final BooleanAndOperation INSTANCE = new BooleanAndOperation();

	@Override
	public BooleanValue evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, OperationCallExp operationCall) {
		if (sourceVal == BooleanValue.FALSE) {
			return BooleanValue.FALSE;
		}
		Value argVal = evaluateArgument(evaluationVisitor, operationCall, 0);
		return evaluate(sourceVal, argVal);
	}

	public BooleanValue evaluate(Value left, Value right) {
		if (left == BooleanValue.FALSE) {
			return BooleanValue.FALSE;
		}
		if (right == BooleanValue.FALSE) {
			return BooleanValue.FALSE;
		}
		if ((left == BooleanValue.TRUE) && (right == BooleanValue.TRUE)) {
			return BooleanValue.TRUE;
		}
		return null;
	}
}
