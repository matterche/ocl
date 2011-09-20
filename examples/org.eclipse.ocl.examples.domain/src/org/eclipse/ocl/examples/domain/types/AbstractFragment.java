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

import org.eclipse.ocl.examples.domain.elements.DomainFragment;
import org.eclipse.ocl.examples.domain.elements.DomainInheritance;


public abstract class AbstractFragment implements DomainFragment
{
	public final DomainInheritance derivedInheritance;
	public final DomainInheritance baseInheritance;

	public AbstractFragment(DomainInheritance derivedInheritance, DomainInheritance baseInheritance) {
		this.derivedInheritance = derivedInheritance;
		this.baseInheritance = baseInheritance;
	}

	public final DomainInheritance getBaseInheritance() {
		return baseInheritance;
	}

	public final DomainInheritance getInheritance() {
		return derivedInheritance;
	}

	@Override
	public String toString() {
		return derivedInheritance.getType().getName() + "__" + baseInheritance.getType().getName(); //$NON-NLS-1$
	}
}