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
 * $Id: StringValueImpl.java,v 1.1.2.3 2011/01/08 15:35:07 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import org.eclipse.ocl.examples.pivot.values.StringValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.values.impl.AbstractValue;


public class StringValueImpl extends AbstractValue implements StringValue
{
	private final String value;
	
	public StringValueImpl(ValueFactory valueFactory, String value) {
		super(valueFactory);
		this.value = value;
	}

	@Override
	public String asString() {
		return value;
	}

	@Override
	public StringValue asStringValue() {
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StringValue)) {
			return false;
		}
		return value.equals(((StringValue)obj).asString());
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return "'" + value + "'";
	}

	@Override
	public void toString(StringBuffer s, int sizeLimit) {
		s.append("'");
		int length = value.length();
		int available = sizeLimit - (length + 1);
		if (length <= available) {
			s.append(value);
		}
		else {
			if (available > 0) {
				s.append(value.substring(0, available));
			}
			s.append("...");
		}
		s.append("'");
	}
}