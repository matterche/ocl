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
 * $Id: BooleanNotEqualOperation.java,v 1.1.2.1 2010/01/24 07:41:18 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.logical;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * BooleanNotEqualOperation realises the Boolean::<>() library operation.
 * 
 * @since 3.0
 */
public class BooleanNotEqualOperation extends BooleanEqualOperation
{
	@Override
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Boolean evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		return !super.evaluate(visitor, sourceVal, operationCall);
	}
}
