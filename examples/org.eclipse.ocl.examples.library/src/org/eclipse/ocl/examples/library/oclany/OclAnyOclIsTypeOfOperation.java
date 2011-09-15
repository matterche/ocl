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
 * $Id: OclAnyOclIsTypeOfOperation.java,v 1.6 2011/04/25 09:48:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OclAnyOclIsTypeOfOperation realises the OclAny::oclIsTypeOf() library operation.
 */
public class OclAnyOclIsTypeOfOperation extends AbstractBinaryOperation
{
	public static final OclAnyOclIsTypeOfOperation INSTANCE = new OclAnyOclIsTypeOfOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal, Value argVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		DomainType sourceType = sourceVal.getType();
		TypeValue argTypeValue = argVal.asTypeValue();
		DomainType argType = argTypeValue.getInstanceType();
		return valueFactory.booleanValueOf(sourceType.isEqualTo(argType, valueFactory.getStandardLibrary()));
	}
}
