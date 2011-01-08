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
 * $Id: BooleanNotOperation.java,v 1.1.2.4 2011/01/08 15:34:43 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.logical;

import org.eclipse.ocl.examples.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

/**
 * NotOperation realises the not() library operation.
 * 
 * @since 3.1
 */
public class BooleanNotOperation extends AbstractUnaryOperation
{
	public static final BooleanNotOperation INSTANCE = new BooleanNotOperation();

	public BooleanValue evaluate(ValueFactory valueFactory, Value argument) {
		if (argument == valueFactory.TRUE) {
			return valueFactory.FALSE;
		}
		else if (argument == valueFactory.FALSE) {
			return valueFactory.TRUE;
		}
		return null;
	}
}
