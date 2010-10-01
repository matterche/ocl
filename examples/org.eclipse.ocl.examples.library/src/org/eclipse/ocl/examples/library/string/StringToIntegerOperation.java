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
 * $Id: StringToIntegerOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;

import org.eclipse.ocl.examples.library.util.ObjectUtil2;

/**
 * StringToIntegerOperation realises the String::toInteger() library operation.
 * 
 * @since 3.1
 */
public class StringToIntegerOperation extends AbstractStringUnaryOperation
{
	public static final StringToIntegerOperation INSTANCE = new StringToIntegerOperation();

	@Override
	public  Object evaluateString(String sourceVal) {
		return ObjectUtil2.createBigInteger(sourceVal.trim());
	}
}
