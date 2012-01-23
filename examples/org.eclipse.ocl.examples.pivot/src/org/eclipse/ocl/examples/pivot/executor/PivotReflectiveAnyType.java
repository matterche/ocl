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
package org.eclipse.ocl.examples.pivot.executor;

import java.util.Collections;

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.pivot.AnyType;

public class PivotReflectiveAnyType extends PivotReflectiveType
{
	public PivotReflectiveAnyType(PivotReflectivePackage executorPackage, AnyType type) {
		super(executorPackage, type);
		installOclAny();
	}

	@Override
	public DomainInheritance getCommonInheritance(DomainInheritance thatInheritance) {
		return this;
	}

	@Override
	public Iterable<? extends DomainInheritance> getInitialSuperInheritances() {
		return Collections.emptyList();
	}

	@Override
	public boolean isInstallable() {
		return true;
	}

	@Override
	public boolean isUndefined() {
		return false;
	}
}
