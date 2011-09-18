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

import org.eclipse.ocl.examples.domain.types.DomainInheritance;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotAnyInheritance extends PivotInheritance
{
	public PivotAnyInheritance(MetaModelManager metaModelManager, AnyType type) {
		super(metaModelManager, type);
	}

	@Override
	public DomainInheritance getCommonInheritance(DomainInheritance thatInheritance) {
		return this;
	}

	@Override
	protected Iterable<? extends DomainInheritance> getInitialSuperInheritances() {
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
