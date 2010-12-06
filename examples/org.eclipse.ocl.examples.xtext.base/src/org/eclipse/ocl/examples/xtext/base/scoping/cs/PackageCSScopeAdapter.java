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
 * $Id: PackageCSScopeAdapter.java,v 1.1.2.2 2010/12/06 17:53:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class PackageCSScopeAdapter extends MonikeredElementCSScopeAdapter<PackageCS, org.eclipse.ocl.examples.pivot.Package>
{
	public PackageCSScopeAdapter(PackageCS csElement) {
		super(csElement, org.eclipse.ocl.examples.pivot.Package.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
//		TypeBindingsCS bindings = scopeView.getBindings();
		org.eclipse.ocl.examples.pivot.Package pivot = getPivot();
		if (pivot != null) {
			environmentView.addNamedElements(PivotPackage.Literals.PACKAGE, pivot.getNestedPackages());
			environmentView.addNamedElements(PivotPackage.Literals.TYPE, pivot.getOwnedTypes());
			environmentView.addNamedElements(PivotPackage.Literals.NAMESPACE, pivot.getOwnedTypes());		// FIXME needed for Enums
		}
		return scopeView.getOuterScope();
	}
}
