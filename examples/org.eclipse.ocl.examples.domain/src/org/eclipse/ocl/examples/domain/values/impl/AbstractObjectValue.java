/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.domain.values.impl;

import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractObjectValue<T> extends AbstractValue implements ObjectValue
{
	protected final T object;
	
	protected AbstractObjectValue(ValueFactory valueFactory, T object) {
		super(valueFactory);
		this.object = object;
	}

	public Object asObject() {
		return object;
	}

	@Override
	public ObjectValue asObjectValue() {
		return this;
	}

	public Value asValidValue() {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ObjectValue)) {
			return false;
		}
		return object.equals(((ObjectValue)obj).getObject());
	}

	public Object getObject() {
		return object;
	}

	@Override
	public int hashCode() {
		return object.hashCode();
	}

	@Override
	public String toString() {
		return String.valueOf(object);
	}
}
