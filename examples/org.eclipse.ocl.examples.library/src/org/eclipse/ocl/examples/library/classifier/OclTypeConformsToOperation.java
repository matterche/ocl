/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.library.classifier;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OclTypeConformsToOperation realises the OclType::conformsTo(OclType) library operation.
 */
public class OclTypeConformsToOperation extends AbstractBinaryOperation
{
	public static final OclTypeConformsToOperation INSTANCE = new OclTypeConformsToOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal, Value argVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
		TypeValue thisVal = sourceVal.asTypeValue();
		TypeValue thatVal = argVal.asTypeValue();
		DomainType thisType = thisVal.getInstanceType();
		DomainType thatType = thatVal.getInstanceType();
		return valueFactory.booleanValueOf(thisType.conformsTo(standardLibrary, thatType));
	}
}
