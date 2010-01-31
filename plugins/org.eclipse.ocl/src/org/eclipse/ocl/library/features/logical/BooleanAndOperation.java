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
 * $Id: BooleanAndOperation.java,v 1.1.2.1 2010/01/31 22:23:45 ewillink Exp $
 */
package org.eclipse.ocl.library.features.logical;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.features.AbstractBinaryOperation;

/**
 * AndOperation realises the and() library operation.
 * 
 * @since 3.0
 */
public class BooleanAndOperation extends AbstractBinaryOperation
{
	@Override
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		if (sourceVal == Boolean.FALSE) {
			return Boolean.FALSE;
		}
		Object argVal = visitor.visitArgument(operationCall, 0);
		return evaluate(sourceVal, argVal);
	}

	public Object evaluate(Object left, Object right) {
		if (left == Boolean.FALSE) {
			return Boolean.FALSE;
		}
		if (right == Boolean.FALSE) {
			return Boolean.FALSE;
		}
		if ((left == Boolean.TRUE) && (right == Boolean.TRUE)) {
			return Boolean.TRUE;
		}
		return null;
	}
}
