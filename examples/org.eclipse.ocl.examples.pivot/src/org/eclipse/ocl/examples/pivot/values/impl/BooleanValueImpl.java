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
 * $Id: BooleanValueImpl.java,v 1.1.2.1 2010/12/26 15:21:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import org.eclipse.ocl.examples.pivot.values.BooleanValue;
import org.eclipse.ocl.examples.pivot.values.Value;

public class BooleanValueImpl extends AbstractValue implements BooleanValue
{
	public final static BooleanValueImpl FALSE = new BooleanValueImpl(false); 
	public final static BooleanValueImpl TRUE = new BooleanValueImpl(true); 

	private final boolean value;
	
	private BooleanValueImpl(boolean value) {
		this.value = value;
	}

//	@Override
//	public boolean and(Value v) {
//		return (v instanceof BooleanValue) && (value && ((BooleanValue)v).value);
//	}

	@Override
	public BooleanValueImpl asBooleanValue() {
		return this;
	}

	@Override
	public BooleanValue asFalse() {
		return value ? Value.FALSE : Value.TRUE;
	}

	@Override
	public BooleanValue asTrue() {
		return this;
	}

//	public boolean booleanValue() {
//		return value;
//	}

	@Override
	public boolean isFalse() {
		return !value;
	}

	@Override
	public boolean isTrue() {
		return value;
	}

	@Override
	public String toString() {
		return Boolean.toString(value);
	}
}
