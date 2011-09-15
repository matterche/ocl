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
 * $Id: OclAnyOclAsSetOperation.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.types.DomainCollectionType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OclAnyOclAsSetOperation realises the OclAny::oclAsSet() library operation.
 */
public class OclAnyOclAsSetOperation extends AbstractUnaryOperation
{
	public static final OclAnyOclAsSetOperation INSTANCE = new OclAnyOclAsSetOperation();

	public Value evaluate(DomainEvaluator evaluator, DomainType returnType, Value sourceVal) throws InvalidValueException {
		ValueFactory valueFactory = evaluator.getValueFactory();
		if (sourceVal.isInvalid()) {
			return valueFactory.throwInvalidValueException(EvaluatorMessages.InvalidSource, "oclAsSet"); //$NON-NLS-1$
		}
		if (sourceVal.isNull()) {
			return valueFactory.createSetValue((DomainCollectionType)returnType);
		}
		else {
			return valueFactory.createSetValue((DomainCollectionType)returnType, sourceVal);
		}
	}
}
