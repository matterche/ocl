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
 * $Id: BooleanXorOperation.java,v 1.1.2.2 2010/12/23 19:24:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.logical;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * BooleanXorOperation realises the Boolean::xor() library operation.
 * 
 * @since 3.1
 */
public class BooleanXorOperation extends AbstractBinaryOperation
{
	public static final BooleanXorOperation INSTANCE = new BooleanXorOperation();

	public BooleanValue evaluate(Value left, Value right) {
		if (left == BooleanValue.TRUE) {
			if (right == BooleanValue.TRUE) {
				return BooleanValue.FALSE;
			}
			else if (right == BooleanValue.FALSE) {
				return BooleanValue.TRUE;
			}
		}
		else if (left == BooleanValue.FALSE) {
			if (right == BooleanValue.TRUE) {
				return BooleanValue.TRUE;
			}
			else if (right == BooleanValue.FALSE) {
				return BooleanValue.FALSE;
			}
		}
		return null;
	}
}
