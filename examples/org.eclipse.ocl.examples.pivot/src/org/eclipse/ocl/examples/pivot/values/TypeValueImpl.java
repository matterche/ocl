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
package org.eclipse.ocl.examples.pivot.values;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.domain.values.impl.AbstractObjectValue;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.Type;

public class TypeValueImpl extends AbstractObjectValue<ClassifierType> implements TypeValue
{
	public TypeValueImpl(ValueFactory valueFactory, ClassifierType type) {
		super(valueFactory, type);
	}

	@Override
	public ClassifierType asElement() {
		return object;
	}

	@Override
	public ElementValue asElementValue() {
		return this;
	}

	@Override
	public EObject asNavigableObject() throws InvalidValueException {
		return object.getInstanceType();
	}

	@Override
	public TypeValueImpl asTypeValue() {
		return this;
	}

	public ClassifierType getElement() {
		return object;
	}

	public Type getInstanceType() {
		return object.getInstanceType();
	}

	public ClassifierType getType() {
		return object;
	}
}
