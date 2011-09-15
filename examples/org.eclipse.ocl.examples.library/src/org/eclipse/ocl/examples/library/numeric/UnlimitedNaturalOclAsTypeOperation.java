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

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;

/**
 * UnlimitedNaturalOclAsTypeOperation realizes the UnlimitedNatural::oclAsType() library operation.
 */
public class UnlimitedNaturalOclAsTypeOperation extends OclAnyOclAsTypeOperation
{
	public static final UnlimitedNaturalOclAsTypeOperation INSTANCE = new UnlimitedNaturalOclAsTypeOperation();

	@Override
	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal, Value argVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainType sourceType = sourceVal.getType();
		if (sourceType == null) {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.MissingSourceType);
		}
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		TypeValue typeVal = argVal.asTypeValue();
		DomainType argType = typeVal.getInstanceType();
		if (sourceType.conformsTo(argType, standardLibrary)) {
			if (sourceVal.isUnlimited() && ((argType == standardLibrary.getRealType()) || (argType == standardLibrary.getIntegerType()))) {
				return valueFactory.throwInvalidValueException(EvaluatorMessages.NonFiniteIntegerValue);
			}
			return sourceVal;
		}
		else {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.IncompatibleArgumentType, argType);
		}
	}
}
