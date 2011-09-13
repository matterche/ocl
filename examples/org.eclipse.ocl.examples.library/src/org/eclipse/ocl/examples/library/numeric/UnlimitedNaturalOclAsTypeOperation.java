/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: NumericOclAsTypeOperation.java,v 1.6 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.pivot.values.TypeValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * UnlimitedNaturalOclAsTypeOperation realizes the UnlimitedNatural::oclAsType() library operation.
 */
public class UnlimitedNaturalOclAsTypeOperation extends OclAnyOclAsTypeOperation
{
	public static final UnlimitedNaturalOclAsTypeOperation INSTANCE = new UnlimitedNaturalOclAsTypeOperation();

	@Override
	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceVal, OperationCallExp operationCall) throws InvalidValueException {
		MetaModelManager metaModelManager = evaluationVisitor.getMetaModelManager();
		Type sourceType = sourceVal.getType();
		if (sourceType == null) {
			return evaluationVisitor.throwInvalidEvaluation(null, operationCall, sourceType, EvaluatorMessages.MissingSourceType);
		}
		Value argVal = evaluateArgument(evaluationVisitor, operationCall, 0);
		TypeValue typeVal = argVal.asTypeValue();
		Type argType = typeVal.getInstanceType();
		if (metaModelManager.conformsTo(sourceType, argType, null)) {
			if (sourceVal.isUnlimited() && ((argType == metaModelManager.getIntegerType()) || (argType == metaModelManager.getRealType()))) {
				return evaluationVisitor.throwInvalidEvaluation(null, operationCall, sourceVal, EvaluatorMessages.NonFiniteIntegerValue);
			}
			return sourceVal;
		}
		else {
			return evaluationVisitor.throwInvalidEvaluation(null, operationCall, argType, EvaluatorMessages.IncompatibleArgumentType, argType);
		}
	}
}
