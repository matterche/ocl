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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainClassifierType;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.ElementValue;
import org.eclipse.ocl.examples.domain.values.TypeValue;
import org.eclipse.ocl.examples.domain.values.ValueFactory;

public class DomainTypeValueImpl extends AbstractObjectValue<DomainClassifierType> implements TypeValue
{
	public DomainTypeValueImpl(ValueFactory valueFactory, DomainClassifierType type) {
		super(valueFactory, type);
	}

	@Override
	public DomainClassifierType asElement() {
		return object;
	}

	@Override
	public ElementValue asElementValue() {
		return this;
	}

	@Override
	public EObject asNavigableObject() throws InvalidValueException {
		DomainType navigableObject = object.getInstanceType();
		if (navigableObject instanceof EObject) {
			return (EObject) navigableObject;
		}
		else {
			return (EObject) valueFactory.throwInvalidValueException(EvaluatorMessages.TypedValueRequired, "Object");
		}
	}

	@Override
	public DomainTypeValueImpl asTypeValue() {
		return this;
	}

	public DomainClassifierType getElement() {
		return object;
	}

	public DomainType getInstanceType() {
		return object.getInstanceType();
	}

	public DomainClassifierType getType() {
		return object;
	}
}
