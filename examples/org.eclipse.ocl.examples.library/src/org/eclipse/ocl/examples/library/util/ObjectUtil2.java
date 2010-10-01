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
 * $Id: ObjectUtil2.java,v 1.1.2.1 2010/10/01 13:28:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.util;

import java.math.BigInteger;
import java.util.Collection;


public class ObjectUtil2 {
	private static final String maxLongValue = Long.toString(Long.MAX_VALUE);
	private static final int maxLongSize = maxLongValue.length();

	public static Collection<Object> createNewCollection(boolean isOrdered, boolean isUnique) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Creates a BigInteger representation for aValue.
	 * @param aValue the string representation of a (non-negative) integer number
	 * @return the numeric representation
	 * @throws NumberFormatException if representation cannot be created
	 * @since 3.1
	 */
	public static BigInteger createBigInteger(String aValue) {
		int len = aValue.length();
		if ((len < maxLongSize) || ((len == maxLongSize) && (maxLongValue.compareTo(aValue) >= 0))) {
			return BigInteger.valueOf(Long.parseLong(aValue));
		}
		else {
			return new BigInteger(aValue);
		}
	}

}
