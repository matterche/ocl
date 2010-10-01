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
 * $Id: OclAnyOclAsTypeOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * OclAnyOclAsTypeOperation realises the OclAny::oclAsType() library operation.
 * 
 * @since 3.1
 */
public class OclAnyOclAsTypeOperation extends AbstractOperation
{
	public static final OclAnyOclAsTypeOperation INSTANCE = new OclAnyOclAsTypeOperation();

	public Object evaluate(EvaluationContext evaluationContext, Object sourceVal, OperationCallExp operationCall) {
		Type sourceType = evaluationContext.getTypeOfValue(sourceVal, operationCall.getSource().getType());
		if (sourceType == null) {
			return null;
		}
		Object argVal = evaluateArgument(evaluationContext, operationCall, 0);
		Type argType = evaluationContext.getTypeOfType(argVal);
		if (evaluationContext.conformsTo(sourceType, argType)) {
			return evaluateConforming(evaluationContext, sourceVal, argType);
		}
		else {
			return evaluateNonConforming(evaluationContext, sourceVal, argType);
		}
	}

	protected Object evaluateConforming(EvaluationContext evaluationContext, Object sourceVal, Type argType) {
		return sourceVal;
	}

	protected Object evaluateNonConforming(EvaluationContext evaluationContext, Object sourceVal, Type argType) {
		return null;
	}
}
