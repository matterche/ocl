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
 * $Id: BooleanXorOperation.java,v 1.1.2.4 2011/01/08 15:34:43 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.logical;

import org.eclipse.ocl.examples.library.AbstractBinaryOperation;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * BooleanXorOperation realises the Boolean::xor() library operation.
 * 
 * @since 3.1
 */
public class BooleanXorOperation extends AbstractBinaryOperation
{
	public static final BooleanXorOperation INSTANCE = new BooleanXorOperation();

	public BooleanValue evaluate(ValueFactory valueFactory, Value left, Value right) {
		if (left == valueFactory.TRUE) {
			if (right == valueFactory.TRUE) {
				return valueFactory.FALSE;
			}
			else if (right == valueFactory.FALSE) {
				return valueFactory.TRUE;
			}
		}
		else if (left == valueFactory.FALSE) {
			if (right == valueFactory.TRUE) {
				return valueFactory.TRUE;
			}
			else if (right == valueFactory.FALSE) {
				return valueFactory.FALSE;
			}
		}
		return null;
	}
}
