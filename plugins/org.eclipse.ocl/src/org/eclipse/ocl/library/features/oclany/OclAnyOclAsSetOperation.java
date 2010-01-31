/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: OclAnyOclAsSetOperation.java,v 1.1.2.1 2010/01/31 22:23:41 ewillink Exp $
 */
package org.eclipse.ocl.library.features.oclany;

import java.util.Set;

import org.eclipse.ocl.library.features.AbstractUnaryOperation;
import org.eclipse.ocl.util.CollectionUtil;

/**
 * OclAnyOclAsSetOperation realises the OclAny::oclAsSet() library operation.
 * 
 * @since 3.0
 */
public class OclAnyOclAsSetOperation extends AbstractUnaryOperation
{
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
