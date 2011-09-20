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
package org.eclipse.ocl.examples.library.executor;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.impl.AbstractValueFactory;

public class ExecutorValueFactory extends AbstractValueFactory
{
	public ExecutorValueFactory(DomainStandardLibrary standardLibrary) {
		super(standardLibrary);
	}

	public Object getEcoreValueOf(Value result) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

/*	@Override
	public Value valueOf(Object object) {
		Value value = super.valueOf(object);
		if (value != null) {
			return value;
		}
		if (object instanceof EObject) {
			return new EObjectValueImpl(this, (EObject) object);
		}
		return new ObjectValueImpl(this, getStandardLibrary().getAnyClassifierType(), object);	// WIP A better type
	} */
}