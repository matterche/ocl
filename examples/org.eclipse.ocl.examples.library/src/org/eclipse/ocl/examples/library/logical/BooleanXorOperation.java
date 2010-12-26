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
 * $Id: BooleanXorOperation.java,v 1.1.2.3 2010/12/26 15:20:28 ewillink Exp $
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
		if (left == Value.TRUE) {
			if (right == Value.TRUE) {
				return Value.FALSE;
			}
			else if (right == Value.FALSE) {
				return Value.TRUE;
			}
		}
		else if (left == Value.FALSE) {
			if (right == Value.TRUE) {
				return Value.TRUE;
			}
			else if (right == Value.FALSE) {
				return Value.FALSE;
			}
		}
		return null;
	}
}
