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

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
import org.eclipse.ocl.examples.domain.elements.DomainOperation;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.utilities.IndexableIterable;
import org.eclipse.ocl.examples.library.executor.ReflectiveFragment;
import org.eclipse.ocl.examples.pivot.Type;

public class PivotReflectiveFragment extends ReflectiveFragment
{
	public PivotReflectiveFragment(PivotReflectiveType derivedInheritance, DomainInheritance baseInheritance) {
		super(derivedInheritance, baseInheritance);
	}

	@Override
	protected DomainOperation getOperationOverload(DomainOperation baseOperation) {
		Type pivotType = ((PivotReflectiveType) derivedInheritance).getPivotType();
		IndexableIterable<? extends DomainType> baseParameterTypes = baseOperation.getParameterType();
		int iMax = baseParameterTypes.size();
		for (DomainOperation localOperation : pivotType.getOwnedOperation()) {
			if (localOperation.getName().equals(baseOperation.getName())) {
				IndexableIterable<? extends DomainType> localParameterTypes = localOperation.getParameterType();
				if (iMax == localParameterTypes.size()) {
					int i = 0;
					for (; i < iMax; i++) {
						DomainType localParameterType = localParameterTypes.get(i);
						DomainType baseParameterType = baseParameterTypes.get(i);
						if (!localParameterType.equals(baseParameterType)) {
							break;
						}
					}
					if (i >= iMax) {
						return localOperation;
					}
				}
			}
		}
		return null;
	}
}