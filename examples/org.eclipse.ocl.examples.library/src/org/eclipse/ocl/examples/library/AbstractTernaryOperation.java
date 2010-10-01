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
 * $Id: AbstractTernaryOperation.java,v 1.1.2.1 2010/10/01 13:28:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.OperationCallExp;

/**
 * AbstractBinaryOperation dispatches a binary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.1
 */
public abstract class AbstractTernaryOperation extends AbstractOperation implements LibraryTernaryOperation
{
	public Object evaluate(EvaluationContext evaluationContext, Object sourceVal, OperationCallExp operationCall) {
		if (isInvalid(sourceVal)) {
			return null;
		}
		Object argVal1 = evaluateArgument(evaluationContext, operationCall, 0);
		if (isInvalid(argVal1)) {
			return null;
		}
		Object argVal2 = evaluateArgument(evaluationContext, operationCall, 1);
		if (isInvalid(argVal2)) {
			return null;
		}
		return evaluate(sourceVal, argVal1, argVal2);
	}
}
