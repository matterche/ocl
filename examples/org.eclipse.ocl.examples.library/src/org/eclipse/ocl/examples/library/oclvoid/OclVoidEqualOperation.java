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
 * $Id: OclVoidEqualOperation.java,v 1.1.2.1 2010/10/01 13:28:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclvoid;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;

/**
 * OclVoidEqualOperation realises the OclVoid::=() library operation.
 * 
 * @since 3.1
 */
public class OclVoidEqualOperation extends AbstractBinaryOperation
{
	public static final OclVoidEqualOperation INSTANCE = new OclVoidEqualOperation();

	public Boolean evaluate(Object left, Object right) {
		if (isNull(right)) {
			return true;
		}
		return false;
	}
}
