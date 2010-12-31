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
 * $Id: TypeNameExpCSScopeAdapter.java,v 1.1.2.1 2010/12/31 19:11:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;

public class TypeNameExpCSScopeAdapter extends ModelElementCSScopeAdapter<TypeNameExpCS, Element>
{
	public TypeNameExpCSScopeAdapter(PivotManager pivotManager, TypeNameExpCS csElement) {
		super(pivotManager, csElement, Element.class);	// FIXME
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == BaseCSTPackage.Literals.QUALIFIED_REF_CS__ELEMENT) { // FIXME
			TypeNameExpCS target = getTarget();
//			ScopeAdapter scopeAdapter = getScopeAdapter(pivotManager, target.getNamespace());
//			if (scopeAdapter != null) {
//				scopeAdapter.computeLookup(environmentView, scopeView);
//			}
			return null;
		}
		else {
			return scopeView.getOuterScope();
		}
	}
}
