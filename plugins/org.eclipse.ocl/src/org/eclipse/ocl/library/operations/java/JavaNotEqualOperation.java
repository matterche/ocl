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
 * $Id: JavaNotEqualOperation.java,v 1.1.2.1 2010/01/30 07:49:39 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.java;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * JavaNotEqualOperation realises the Java::<>() library operation.
 * 
 * @since 3.0
 */
public class JavaNotEqualOperation extends JavaEqualOperation
{
	@Override
	public <PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Boolean evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> visitor, Object sourceVal, OperationCallExp<C, O> operationCall) {
		return !super.evaluate(visitor, sourceVal, operationCall);
	}
}
