/**
 * <copyright>
 *
 * Copyright (c) 2011,2012 E.D.Willink and others.
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
package org.eclipse.ocl.examples.domain.elements;

import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;


public interface DomainProperty extends DomainTypedElement
{
	/**
	 * Return the Inheritance dispatch table for the owning type.
	 */
	DomainInheritance getInheritance(DomainStandardLibrary standardLibrary);

	/**
	 * Return the opposite Property if there is one, else null.
	 */
	DomainProperty getOpposite();
	
	void setValue(ObjectValue objectValue, Value propertyValue) throws InvalidValueException;
}
