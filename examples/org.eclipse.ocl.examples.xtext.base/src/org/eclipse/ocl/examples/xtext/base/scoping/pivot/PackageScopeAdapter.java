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
 * $Id: PackageScopeAdapter.java,v 1.4 2011/04/20 19:02:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class PackageScopeAdapter extends AbstractPivotScopeAdapter
{
	public static final PackageScopeAdapter INSTANCE = new PackageScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Package targetPackage = (org.eclipse.ocl.examples.pivot.Package)target;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addNamedElements(metaModelManager.getLocalPackages(targetPackage));
		environmentView.addNamedElements(metaModelManager.getLocalClasses(targetPackage));
		environmentView.addNamedElements(targetPackage.getOwnedPrecedence());
		return scopeView.getOuterScope();
	}
}
