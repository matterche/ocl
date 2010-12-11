/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: RootPackageScopeAdapter.java,v 1.1.2.2 2010/12/11 10:45:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.RootScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class RootPackageScopeAdapter
extends AbstractPivotScopeAdapter<org.eclipse.ocl.examples.pivot.Package>
implements RootScopeAdapter
{
	public RootPackageScopeAdapter(PivotManager pivotManager, org.eclipse.ocl.examples.pivot.Package pivotElement) {
		super(pivotManager, null, pivotElement);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		environmentView.addNamedElements(PivotPackage.Literals.PACKAGE, target.getNestedPackages());
		environmentView.addNamedElements(PivotPackage.Literals.TYPE, target.getOwnedTypes());
		environmentView.addNamedElements(PivotPackage.Literals.PRECEDENCE, target.getOwnedPrecedences());
		return scopeView.getOuterScope();
	}

	@Override
	public RootScopeAdapter getRootScopeAdapter() {
		return this;
	}
}
