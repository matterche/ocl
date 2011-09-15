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
package org.eclipse.ocl.examples.domain.types;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;

public class AbstractTuplePart implements DomainTypedElement
{
	protected final DomainType type;
	protected final String name;

	public AbstractTuplePart(DomainType type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public DomainType getType() {
		return type;
	}

	@Override
	public String toString() {
		return String.valueOf(name) + " : " + String.valueOf(type); //$NON-NLS-1$
	}
}