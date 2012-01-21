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
import org.eclipse.ocl.examples.domain.elements.DomainEnumerationLiteral;
import org.eclipse.ocl.examples.domain.values.EnumerationLiteralValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class EnumerationLiteralValueImpl extends AbstractEnumerationLiteralValueImpl<DomainEnumerationLiteral> implements EnumerationLiteralValue
{
	public EnumerationLiteralValueImpl(ValueFactory valueFactory, DomainEnumerationLiteral element) {
		super(valueFactory, element);
	}

	@Override
	public Object asEcoreObject() {
		return object.asEcoreObject(valueFactory.getStandardLibrary());
	}

	@Override
	public DomainEnumerationLiteral asElement() {
		return object;
	}

	public DomainEnumerationLiteral getElement() {
		return object;
	}

	public String getName() {
		return object.getName();
	}

	public DomainEnumeration getType() {
		if (type == null) {
			type = object.getEnumeration();
		}
		return type;
	}
}
