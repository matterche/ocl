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
 * $Id: OclAnyOclAsTypeOperation.java,v 1.7 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OclAnyOclAsTypeOperation realises the OclAny::oclAsType() library operation.
 */
public class OclAnyOclAsTypeOperation extends AbstractBinaryOperation
{
	public static final OclAnyOclAsTypeOperation INSTANCE = new OclAnyOclAsTypeOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal, Value argVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainType sourceType = sourceVal.getActualType();
		if (sourceType == null) {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.MissingSourceType);
		}
		TypeValue typeVal = argVal.asTypeValue();
		DomainType argType = typeVal.getInstanceType();
		if (sourceType.conformsTo(valueFactory.getStandardLibrary(), argType)) {
			return sourceVal;
		}
		else {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.IncompatibleArgumentType, argType);
		}
	}
}
