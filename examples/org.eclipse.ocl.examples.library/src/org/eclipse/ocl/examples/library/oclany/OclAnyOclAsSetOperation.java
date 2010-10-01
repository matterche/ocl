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
 * $Id: OclAnyOclAsSetOperation.java,v 1.1.2.1 2010/10/01 13:28:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import java.util.Set;

import org.eclipse.ocl.examples.library.AbstractUnaryOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * OclAnyOclAsSetOperation realises the OclAny::oclAsSet() library operation.
 * 
 * @since 3.1
 */
public class OclAnyOclAsSetOperation extends AbstractUnaryOperation
{
	public static final OclAnyOclAsSetOperation INSTANCE = new OclAnyOclAsSetOperation();

	public Object evaluate(Object argument) {
		if (isInvalid(argument)) {
			return null;
		}
		if (isNull(argument)) {
			return null;
		}
		Set<Object> newSet = CollectionUtil.createNewSet();
		newSet.add(argument);
		return newSet;
	}
}
