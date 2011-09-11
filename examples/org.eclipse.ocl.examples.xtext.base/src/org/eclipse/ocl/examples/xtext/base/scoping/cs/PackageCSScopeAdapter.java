/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: PackageCSScopeAdapter.java,v 1.3 2011/04/20 19:02:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class PackageCSScopeAdapter extends ModelElementCSScopeAdapter<PackageCS, org.eclipse.ocl.examples.pivot.Package>
{
	public PackageCSScopeAdapter(PackageCS csElement) {
		super(csElement, org.eclipse.ocl.examples.pivot.Package.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Package pivot = getPivot();
		if (pivot != null) {
			MetaModelManager metaModelManager = environmentView.getMetaModelManager();
			environmentView.addNamedElements(metaModelManager.getLocalPackages(pivot));
			environmentView.addNamedElements(metaModelManager.getLocalClasses(pivot));
		}
		return scopeView.getOuterScope();
	}
}
