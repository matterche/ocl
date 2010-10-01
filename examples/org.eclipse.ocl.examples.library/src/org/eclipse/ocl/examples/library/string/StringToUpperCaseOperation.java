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
 * $Id: StringToUpperCaseOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.string;


/**
 * StringToUpperCaseOperation realises the String::toUpperCase() library operation.
 * 
 * @since 3.1
 */
public class StringToUpperCaseOperation extends AbstractStringUnaryOperation
{
	public static final StringToUpperCaseOperation INSTANCE = new StringToUpperCaseOperation();

	@Override
	public  Object evaluateString(String sourceVal) {
		return sourceVal.toUpperCase();
	}
}
