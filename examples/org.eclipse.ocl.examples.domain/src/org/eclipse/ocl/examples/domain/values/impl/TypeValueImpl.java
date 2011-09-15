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
 * $Id: TypeValueImpl.java,v 1.5 2011/04/25 09:49:14 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import org.eclipse.ocl.examples.domain.types.DomainClassifierType;
import org.eclipse.ocl.examples.domain.types.DomainType;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class TypeValueImpl extends ElementValueImpl<DomainType> implements TypeValue
{
	public TypeValueImpl(ValueFactory valueFactory, DomainClassifierType type) {
		super(valueFactory, type, type);
	}

	@Override
	public TypeValueImpl asTypeValue() {
		return this;
	}

	public DomainType getInstanceType() {
		return ((DomainClassifierType) object).getInstanceType();
	}

//	@Override
//	public DomainClassifierType getType() {
//		return (DomainClassifierType) object;
//	}

	@Override
	public String toString() {
		return object.toString();
	}
}
