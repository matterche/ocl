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
 * $Id: OclVoidAndOperation.java,v 1.2 2011/01/24 19:56:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclvoid;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

/**
 * OclVoidAndOperation realises the OclVoid::and() library operation.
 */
public class OclVoidAndOperation extends AbstractBinaryOperation
{
	public static final OclVoidAndOperation INSTANCE = new OclVoidAndOperation();

	public BooleanValue evaluate(DomainEvaluator evaluator, DomainType returnType, Value left, Value right) {
		ValueFactory valueFactory = evaluator.getValueFactory();
		if (right == valueFactory.getFalse()) {
			return valueFactory.getFalse();
		}
		return null;
	}
}
