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
 * $Id: BooleanValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

public class BooleanValue extends AbstractValue
{
	public final static BooleanValue FALSE = new BooleanValue(false); 
	public final static BooleanValue TRUE = new BooleanValue(true); 
	
	public static BooleanValue valueOf(boolean value) {
		return value ? TRUE : FALSE;
	}

	public static BooleanValue valueOfNot(BooleanValue value) {
		return value == FALSE ? TRUE : FALSE;
	}
	
	private final boolean value;
	
	private BooleanValue(boolean value) {
		this.value = value;
	}

//	@Override
//	public boolean and(Value v) {
//		return (v instanceof BooleanValue) && (value && ((BooleanValue)v).value);
//	}

	@Override
	public BooleanValue asBooleanValue() {
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
