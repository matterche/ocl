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
 * $Id: OclAnyEqualOperation.java,v 1.4 2011/05/07 16:41:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OclAnyEqualOperation realises the OCLAny::=() library operation and
 * regular derived implementations since the Value classes exhibit
 * OCL value semantics.
 */
public class OclAnyEqualOperation extends AbstractBinaryOperation
{
	public static final OclAnyEqualOperation INSTANCE = new OclAnyEqualOperation();

	public BooleanValue evaluate(DomainEvaluator evaluator, DomainType returnType, Value left, Value right) throws InvalidValueException {
		//
		//	A.2.2 is clear. 11.3.1 is vague.
		//
		ValueFactory valueFactory = evaluator.getValueFactory();
		if (left.isInvalid()) {
			valueFactory.throwInvalidValueException(EvaluatorMessages.InvalidSource, "="); //$NON-NLS-1$
		}
		if (right.isInvalid()) {
			valueFactory.throwInvalidValueException(EvaluatorMessages.InvalidArgument, "="); //$NON-NLS-1$
		}
		return valueFactory.booleanValueOf(left.equals(right));
	}
}
