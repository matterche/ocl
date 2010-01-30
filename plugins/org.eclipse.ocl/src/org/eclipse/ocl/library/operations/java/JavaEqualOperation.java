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
 * $Id: JavaEqualOperation.java,v 1.1.2.1 2010/01/30 07:49:39 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.java;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.operations.AbstractOperation;

/**
 * JavaEqualOperation realises the Java::=() library operation.
 * 
 * @since 3.0
 */
public class JavaEqualOperation extends AbstractOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Boolean evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		Object argVal = visitor.visitArgument(operationCall, 0);
		if (isString(sourceVal) && isString(argVal)) {
			return String.valueOf(sourceVal).equals(String.valueOf(argVal));
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
