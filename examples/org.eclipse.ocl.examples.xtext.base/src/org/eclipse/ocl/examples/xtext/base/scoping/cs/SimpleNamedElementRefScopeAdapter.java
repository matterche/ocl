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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class SimpleNamedElementRefScopeAdapter extends ElementCSScopeAdapter
{
	public static final SimpleNamedElementRefScopeAdapter INSTANCE = new SimpleNamedElementRefScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
/*		SimpleNamedElementRefCS targetElement = (SimpleNamedElementRefCS)target;
		PathNameCS qualifiedNamedElement = targetElement.getQualifiedName();
		InternalEList<SimpleNamedElementRefCS> path = (InternalEList<SimpleNamedElementRefCS>) qualifiedNamedElement.getPath();
		int index = path.indexOf(targetElement);
		if (index <= 0) {
			return scopeView.getOuterScope();
		}
		else {
			NamedElement parentNamedElement = path.get(index-1).getElement();
			ScopeAdapter scopeAdapter = ElementUtil.getScopeAdapter(parentNamedElement);
			if (scopeAdapter != null) {
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				BaseScopeView nestedScopeView = new BaseScopeView(metaModelManager, parentNamedElement, scopeAdapter, null, scopeView.getTargetReference(), null);
				environmentView.computeLookups(nestedScopeView);
			}
			return null;
		} */
		return scopeView.getOuterScope();
	}
}
