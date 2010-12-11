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
 * $Id: NameExpCSScopeAdapter.java,v 1.1.2.2 2010/12/11 10:45:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;

public class NameExpCSScopeAdapter extends ExpCSScopeAdapter<NameExpCS, OclExpression>
{
	public NameExpCSScopeAdapter(PivotManager pivotManager, NameExpCS csElement) {
		super(pivotManager, csElement, OclExpression.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		NameExpCS target = getTarget();
		List<Namespace> namespaces = target.getNamespace();
		int namespaceCount = namespaces.size();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.NAME_EXP_CS__ELEMENT) {
			if (namespaceCount > 0) {
				ScopeAdapter scopeAdapter = getScopeAdapter(pivotManager, namespaces.get(namespaceCount-1));
				if (scopeAdapter != null) {
					return scopeAdapter.getOuterScopeView(scopeView.getTargetReference());
//					scopeAdapter.computeLookup(environmentView, scopeView);
				}				
				return null;
			}
		}
		else if (containmentFeature == EssentialOCLCSTPackage.Literals.NAME_EXP_CS__NAMESPACE) {
			throw new UnsupportedOperationException("NameExpCSScopeAdapter.computeLookup namespace");
//			return null;
		}
		return scopeView.getOuterScope();
	}
}
