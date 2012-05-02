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
 * $Id: ObjectValueImpl.java,v 1.9 2011/04/20 19:02:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.domain.values.impl;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class ObjectValueImpl extends AbstractObjectValue<Object>
{
	protected DomainType type = null;
	
	public ObjectValueImpl(ValueFactory valueFactory, Object object) {
		super(valueFactory, object);
	}

	public DomainType getType() {
		if (type == null) {										// WIP A better type
			DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
			if (object instanceof Comparable) {
				type = standardLibrary.getOclComparableType();
			}
			else {
				type = standardLibrary.getAnyClassifierType();
			}
		}
		return type;
	}
}
