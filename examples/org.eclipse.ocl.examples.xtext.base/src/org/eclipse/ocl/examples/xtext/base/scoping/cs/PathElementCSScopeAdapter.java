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

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeFilter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class PathElementCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final PathElementCSScopeAdapter INSTANCE = new PathElementCSScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		PathElementCS targetElement = (PathElementCS)target;
		EClassifier eClassifier = targetElement.getElementType();
		if (eClassifier == null) {
			return scopeView.getOuterScope();
		}
		ScopeFilter scopeFilter = targetElement.getPathName().getScopeFilter();
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		EClassifier savedRequiredType = environmentView.getRequiredType();
		try {
			if (scopeFilter != null) {
				environmentView.addFilter(scopeFilter);
			}
			environmentView.setRequiredType(eClassifier);
			ElementCS scopeTarget = targetElement.getLogicalParent();
			CSScopeAdapter scopeAdapter = scopeTarget != null ? ElementUtil.getScopeAdapter(scopeTarget) : null;
			BaseScopeView baseScopeView = new BaseScopeView(metaModelManager, scopeTarget, scopeAdapter, target, null, null);
			environmentView.computeLookups(baseScopeView);
			return null;
		}
		finally {
			environmentView.setRequiredType(savedRequiredType);
			if (scopeFilter != null) {
				environmentView.removeFilter(scopeFilter);
			}
		}
	}
}
