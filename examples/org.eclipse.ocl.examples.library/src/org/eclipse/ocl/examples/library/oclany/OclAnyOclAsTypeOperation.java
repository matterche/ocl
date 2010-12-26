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
 * $Id: OclAnyOclAsTypeOperation.java,v 1.1.2.5 2010/12/26 15:20:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.library.AbstractOperation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.TypeValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * OclAnyOclAsTypeOperation realises the OclAny::oclAsType() library operation.
 * 
 * @since 3.1
 */
public class OclAnyOclAsTypeOperation extends AbstractOperation
{
	public static final OclAnyOclAsTypeOperation INSTANCE = new OclAnyOclAsTypeOperation();

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, OperationCallExp operationCall) {
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		Type sourceType = stdlib.getTypeOfValue(sourceVal, operationCall.getSource().getType());
		if (sourceType == null) {
			return null;
		}
		Value argVal = evaluateArgument(evaluationVisitor, operationCall, 0); // FIXME cast
		TypeValue typeVal = argVal.asTypeValue();
		if (typeVal == null) {
			return createInvalidValue(argVal, operationCall, "Type required", null);
		}
		Type argType = typeVal.getType();
		if (stdlib.conformsTo(sourceType, argType)) {
			return evaluateConforming(evaluationVisitor, sourceVal, argType);
		}
		else {
			return evaluateNonConforming(evaluationVisitor, sourceVal, argType);
		}
	}

	protected Value evaluateConforming(EvaluationVisitor evaluationVisitor, Value sourceVal, Type argType) {
		return sourceVal;
	}

	protected Value evaluateNonConforming(EvaluationVisitor evaluationVisitor, Value sourceVal, Type argType) {
		return null;
	}
}
