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
 * $Id: OclAnyOclIsInvalidOperation.java,v 1.1.2.3 2010/12/26 15:20:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * OclAnyOclIsInvalidOperation realises the OclAny::oclIsInvalid() library operation.
 * 
 * @since 3.1
 */
public class OclAnyOclIsInvalidOperation extends AbstractUnaryOperation
{
	public static final OclAnyOclIsInvalidOperation INSTANCE = new OclAnyOclIsInvalidOperation();

	public BooleanValue evaluate(Value argument) {
		if (argument.isInvalid()) {
			return Value.TRUE;
		}
		return Value.FALSE;
	}
}
