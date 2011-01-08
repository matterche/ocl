/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: NullValueImpl.java,v 1.1.2.3 2011/01/08 11:39:38 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import org.eclipse.ocl.examples.pivot.values.InvalidValue;
import org.eclipse.ocl.examples.pivot.values.NullValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

public class NullValueImpl extends AbstractUndefinedCollectionValue implements NullValue
{
	public final static NullValueImpl INSTANCE = new NullValueImpl(); 
	
	private NullValueImpl() {}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof NullValue;
	}

	@Override
	public int hashCode() {
		return 0x11111111;
	}

	public InvalidValue asInvalidValue() {
		return null;
	}

	public boolean isInvalid() {
		return false;
	}

	public boolean isNull() {
		return true;
	}

	public String oclToString() {
		return "null";
	}

	public InvalidValue toInvalidValue() {
		return ValueFactory.createInvalidValue(this, null, "null", null);
	}

	@Override
	public String toString() {
		return "null";
	}
}
