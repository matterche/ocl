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
 * $Id: OclAnyOclAsCollectionOperation.java,v 1.1.2.3 2010/12/23 19:24:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.oclany;

import org.eclipse.ocl.examples.library.AbstractUnaryOperation;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.SetValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * OclAnyOclAsCollectionOperation realises the OclAny::oclAsCollection() library operation.
 * 
 * @since 3.1
 */
public class OclAnyOclAsCollectionOperation extends AbstractUnaryOperation
{
	public static final OclAnyOclAsCollectionOperation INSTANCE = new OclAnyOclAsCollectionOperation();

	public Value evaluate(Value argument) {
		if (argument.isInvalid()) {
			return null;
		}
		if (argument.isNull()) {
			return null;
		}
		if (argument instanceof CollectionValue) {
			return argument;
		}
		return new SetValue(argument);
	}
}
