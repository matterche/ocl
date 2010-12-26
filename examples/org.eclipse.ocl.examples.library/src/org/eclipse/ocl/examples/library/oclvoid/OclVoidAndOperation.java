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
 * $Id: OclVoidAndOperation.java,v 1.1.2.3 2010/12/26 15:20:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclvoid;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * OclVoidAndOperation realises the OclVoid::and() library operation.
 * 
 * @since 3.1
 */
public class OclVoidAndOperation extends AbstractBinaryOperation
{
	public static final OclVoidAndOperation INSTANCE = new OclVoidAndOperation();

	public BooleanValue evaluate(Value left, Value right) {
		if (right == Value.FALSE) {
			return Value.FALSE;
		}
		return null;
	}
}
