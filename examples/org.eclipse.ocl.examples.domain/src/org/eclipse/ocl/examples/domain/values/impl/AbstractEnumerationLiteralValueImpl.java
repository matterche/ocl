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

import org.eclipse.ocl.examples.domain.elements.DomainEnumeration;
import org.eclipse.ocl.examples.domain.values.EnumerationLiteralValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public abstract class AbstractEnumerationLiteralValueImpl<T> extends AbstractObjectValue<T> implements EnumerationLiteralValue
{
	protected DomainEnumeration type = null;			// Lazily computed
	
	public AbstractEnumerationLiteralValueImpl(ValueFactory valueFactory, T element) {
		super(valueFactory, element);
	}

	@Override
	public EnumerationLiteralValue asElementValue() {
		return this;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (!(that instanceof EnumerationLiteralValue)) {
			return false;
		}
		DomainEnumeration thisEnumeration = getType();
		DomainEnumeration thatEnumeration = ((EnumerationLiteralValue)that).getType();
		if (!(thisEnumeration.equals(thatEnumeration))) {
			return false;
		}
		String thisName = getName();
		String thatName = ((EnumerationLiteralValue)that).getName();
		return thisName.equals(thatName);
	}

	@Override
	public int hashCode() {
		return getElement().hashCode();
	}
}
