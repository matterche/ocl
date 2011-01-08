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
 * $Id: TypeValueImpl.java,v 1.1.2.3 2011/01/08 15:35:07 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values.impl;

import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.values.TypeValue;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

public class TypeValueImpl extends ElementValueImpl<Type> implements TypeValue
{
	public TypeValueImpl(ValueFactory valueFactory, Type type) {
		super(valueFactory, type);
	}

	@Override
	public TypeValueImpl asTypeValue() {
		return this;
	}

	@Override
	public int hashCode() {
		return element.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof TypeValue)) {
			return false;
		}
		return element.equals(((TypeValue)obj).getType());
	}

	public Type getType() {
		return element;
	}
}
