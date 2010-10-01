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
 * $Id: OclAnyEqualOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;

/**
 * OclAnyEqualOperation realises the OCLAny::=() library operation.
 * 
 * @since 3.1
 */
public class OclAnyEqualOperation extends AbstractBinaryOperation
{
	public static final OclAnyEqualOperation INSTANCE = new OclAnyEqualOperation();

	public Boolean evaluate(Object left, Object right) {
		if (isInvalid(left) && isInvalid(right)) {
			return true;
		}
		if (isNull(left) && isNull(right)) {
			return true;
		}
		if (isUndefined(left) && isUndefined(right)) {
			return false;
		}
		return left == right;
	}
}
