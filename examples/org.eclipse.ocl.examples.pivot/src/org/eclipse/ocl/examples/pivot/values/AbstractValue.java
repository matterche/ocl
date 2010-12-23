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
 * $Id: AbstractValue.java,v 1.1.2.1 2010/12/23 19:25:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

public abstract class AbstractValue implements Value
{
//	public boolean and(Value v) {
//		return false;
//	}

	public BagValue asBagValue() {
		return null;
	}

	public BooleanValue asBooleanValue() {
		return null;
	}

	public CollectionValue asCollectionValue() {
		return null;
	}

	public Integer asInteger() {
		return null;
	}

	public IntegerValue asIntegerValue() {
		return null;
	}

	public OrderedCollectionValue asOrderedCollectionValue() {
		return null;
	}

	public OrderedSetValue asOrderedSetValue() {
		return null;
	}

	public RealValue asRealValue() {
		return null;
	}

	public SequenceValue asSequenceValue() {
		return null;
	}

	public SetValue asSetValue() {
		return null;
	}

	public String asString() {
		return null;
	}

	public TypeValue asTypeValue() {
		return null;
	}

	public boolean isFalse() {
		return false;
	}

	public boolean isInvalid() {
		return false;
	}

	public boolean isNull() {
		return false;
	}

	public boolean isTrue() {
		return false;
	}

	public boolean isUndefined() {
		return false;
	}

	public boolean isUnlimited() {
		return false;
	}
	
	public boolean isUnlimitedNatural() {
		return false;
	}

	public RealValue toRealValue() {
		return null;
	}
}
