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

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;

public class ExecutorTypedElement implements DomainTypedElement
{
	private String name;
	private DomainType type;

	public ExecutorTypedElement(String name, DomainType type) {
		this.name = name;
		this.type = type;
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