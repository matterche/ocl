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
 * $Id: RootPackageScopeAdapter.java,v 1.3 2011/04/20 19:02:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.RootScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class RootPackageScopeAdapter
extends AbstractPivotScopeAdapter<org.eclipse.ocl.examples.pivot.Package>
implements RootScopeAdapter
{
	public static final RootPackageScopeAdapter INSTANCE = new RootPackageScopeAdapter();

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, org.eclipse.ocl.examples.pivot.Package target, ScopeView scopeView) {
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addNamedElements(metaModelManager.getLocalPackages(target));
		environmentView.addNamedElements(metaModelManager.getLocalClasses(target));
		environmentView.addNamedElements(target.getOwnedPrecedences());
		return scopeView.getOuterScope();
	}
}
