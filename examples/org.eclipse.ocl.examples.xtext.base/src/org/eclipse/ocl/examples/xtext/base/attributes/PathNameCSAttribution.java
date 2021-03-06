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
package org.eclipse.ocl.examples.xtext.base.attributes;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.Attribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.PivotScopeView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeFilter;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;

public class PathNameCSAttribution extends AbstractAttribution
{
	public static final PathNameCSAttribution INSTANCE = new PathNameCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		PathNameCS targetElement = (PathNameCS)target;
		EObject child = scopeView.getChild();
		List<PathElementCS> path = targetElement.getPath();
		int index = path.indexOf(child);
		ScopeFilter scopeFilter = null;
		try {
			if (index >= path.size()-1) {			// Last element may have a scope filter
				scopeFilter = targetElement.getScopeFilter();
				if (scopeFilter != null) {
					environmentView.addFilter(scopeFilter);
				}
			}
			if (index <= 0) {						// First path element is resolved in parent scope
				environmentView.computeLookups(scopeView.getParent());
			}
			else {									// Subsequent elements in previous scope
				Element parent = path.get(index-1).getElement();
				if ((parent != null) && !parent.eIsProxy()) {
//					environmentView.computeLookups(parent, null, null, scopeView.getTargetReference());
					Attribution parentAttribution = PivotUtil.getAttribution(parent);
					ScopeView parentScopeView = new PivotScopeView(environmentView.getMetaModelManager(), parent, parentAttribution, null, null, scopeView.getTargetReference());
					environmentView.addElementsOfScope(parent, parentScopeView);
				}
			}
			return null;
		}
		finally {
			if (scopeFilter != null) {
				environmentView.removeFilter(scopeFilter);
			}
		}
	}
}
