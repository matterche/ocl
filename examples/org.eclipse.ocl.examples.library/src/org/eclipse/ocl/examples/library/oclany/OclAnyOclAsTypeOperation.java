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
 * $Id: OclAnyOclAsTypeOperation.java,v 1.1.2.3 2010/12/11 10:44:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;

/**
 * OclAnyOclAsTypeOperation realises the OclAny::oclAsType() library operation.
 * 
 * @since 3.1
 */
public class OclAnyOclAsTypeOperation extends AbstractOperation
{
	public static final OclAnyOclAsTypeOperation INSTANCE = new OclAnyOclAsTypeOperation();

	public Object evaluate(EvaluationVisitor evaluationVisitor, Object sourceVal, OperationCallExp operationCall) {
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = stdlib.getTypeOfValue(sourceVal, operationCall.getSource().getType());
		if (sourceType == null) {
			return null;
		}
		Object argVal = evaluateArgument(evaluationVisitor, operationCall, 0); // FIXME cast
		if (!(argVal instanceof Type)) {
			return stdlib.createInvalidValue(argVal, operationCall, "Type required", null);
		}
		Type argType = (Type) argVal;
		if (stdlib.conformsTo(sourceType, argType)) {
			return evaluateConforming(evaluationVisitor, sourceVal, argType);
		}
		else {
			return evaluateNonConforming(evaluationVisitor, sourceVal, argType);
		}
	}

	protected Object evaluateConforming(EvaluationVisitor evaluationVisitor, Object sourceVal, Type argType) {
		return sourceVal;
	}

	protected Object evaluateNonConforming(EvaluationVisitor evaluationVisitor, Object sourceVal, Type argType) {
		return null;
	}
}
