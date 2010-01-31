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
 * $Id: BooleanNotOperation.java,v 1.1.2.2 2010/01/31 08:43:26 ewillink Exp $
 */
package org.eclipse.ocl.library.operations.logical;

import org.eclipse.ocl.library.operations.AbstractUnaryOperation;

/**
 * NotOperation realises the not() library operation.
 * 
 * @since 3.0
 */
public class BooleanNotOperation extends AbstractUnaryOperation
{
	public Object evaluate(Object argument) {
		if (argument == Boolean.TRUE) {
			return Boolean.FALSE;
		}
		else if (argument == Boolean.FALSE) {
			return Boolean.TRUE;
		}
		return null;
	}
}
