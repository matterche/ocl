/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: AbstractUnaryOperation.java,v 1.1.2.1 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library.features;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.LibraryUnaryOperation;

/**
 * AbstractBinaryOperation dispatches a unary library operation to
 * matching-type-specific call-backs.
 * 
 * @since 3.0
 */
public abstract class AbstractUnaryOperation extends AbstractOperation implements LibraryUnaryOperation
{
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		return evaluate(sourceVal);
	}
}
