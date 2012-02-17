/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class PathNameCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final PathNameCSScopeAdapter INSTANCE = new PathNameCSScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		PathNameCS targetElement = (PathNameCS)target;
		EObject child = scopeView.getChild();
		EList<SimpleNamedElementRefCS> path = targetElement.getPath();
		int index = path.indexOf(child);
		if (index < 0) {
			return scopeView.getOuterScope();
		}
		int iMax = path.size();
		if (index >= iMax-1) {
			return scopeView.getOuterScope();
		}
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		EClassifier savedRequiredType = environmentView.getRequiredType();
		try {
			environmentView.setRequiredType(PivotPackage.Literals.NAMESPACE);
			ElementCS scopeTarget = targetElement.getLogicalParent();
			CSScopeAdapter scopeAdapter = scopeTarget != null ? ElementUtil.getScopeAdapter(scopeTarget) : null;
			BaseScopeView baseScopeView = new BaseScopeView(metaModelManager, scopeTarget, scopeAdapter, target, null, null);
			environmentView.computeLookups(baseScopeView);
			return null;
		}
		finally {
			environmentView.setRequiredType(savedRequiredType);
		}
	}
}
