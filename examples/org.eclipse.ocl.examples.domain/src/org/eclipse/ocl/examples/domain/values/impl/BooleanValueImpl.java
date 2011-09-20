/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: BooleanValueImpl.java,v 1.4 2011/02/21 08:37:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.BooleanValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class BooleanValueImpl extends AbstractValue implements BooleanValue
{	
	public static class Accumulator extends BooleanValueImpl implements BooleanValue.Accumulator
	{
		public Accumulator(ValueFactory valueFactory, DomainType type, boolean value) {
			super(valueFactory, type, value);
		}

		@Override
		public BooleanValue asBooleanValue() {
			return valueFactory.booleanValueOf(value);
		}

		@Override
		public Value asObject() {
			return valueFactory.booleanValueOf(value);
		}

		@Override
		public Value asValidValue() {
			return valueFactory.booleanValueOf(value);
		}

		public void setValue(boolean value) {
			this.value = value;			
		}		
	}
	
	protected boolean value;
	
	public BooleanValueImpl(ValueFactory valueFactory, DomainType type, boolean value) {
		super(valueFactory, type);
		this.value = value;
	}

	@Override
	public boolean asBoolean() {
		return value;
	}

	@Override
	public BooleanValue asBooleanValue() {
		return this;
	}

	public Object asObject() {
		return value;
	}

	public Value asValidValue() {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BooleanValue) {
			try {
				return value == ((BooleanValue)obj).asBoolean();
			} catch (InvalidValueException e) {
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return value ? 0x72277227 : 0x27722772;
	}

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
