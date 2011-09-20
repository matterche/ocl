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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class EObjectValueImpl extends AbstractObjectValue<EObject>
{
	protected DomainType type = null;			// Lazily computed
	
	public EObjectValueImpl(ValueFactory valueFactory, EObject eObject) {
		super(valueFactory, eObject);
	}

	public DomainType getType() {
		if (type == null) {
			this.type = valueFactory.getStandardLibrary().getType(object.eClass());
		}
		return type;
	}

	@Override
	public String toString() {
		return DomainUtil.getLabel(object);
	}
}
