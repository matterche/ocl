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

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.values.SimpleTypeValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class SimpleTypeValueImpl extends AbstractTypeValueImpl<DomainType> implements SimpleTypeValue
{
	public SimpleTypeValueImpl(ValueFactory valueFactory, DomainType type) {
		super(valueFactory, type);
	}

	@Override
	public boolean equals(Object that) {
		if (!super.equals(that)) {
			return false;
		}
		if (!(that instanceof SimpleTypeValue)) {
			return false;
		}
		return true;
	}
}
