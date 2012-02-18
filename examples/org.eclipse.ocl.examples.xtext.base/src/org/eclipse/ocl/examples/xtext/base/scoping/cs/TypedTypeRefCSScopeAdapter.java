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
 * $Id: TypedTypeRefCSScopeAdapter.java,v 1.5 2011/05/11 19:51:15 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class TypedTypeRefCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final TypedTypeRefCSScopeAdapter INSTANCE = new TypedTypeRefCSScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		TypedTypeRefCS targetElement = (TypedTypeRefCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__OWNED_TEMPLATE_BINDING) {
			MetaModelManager metaModelManager = environmentView.getMetaModelManager();
			ElementCS parent = targetElement.getLogicalParent();
			CSScopeAdapter parentScope = parent != null ? ElementUtil.getScopeAdapter(parent) : null;
			return new BaseScopeView(metaModelManager, parent, parentScope, target, target.eContainingFeature(), null);
		}
		else if (containmentFeature == BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__PATH_NAME) {
			return scopeView.getOuterScope();
		}
		else {
			Type type = targetElement.getType();
			if ((type != null) && !type.eIsProxy()) {
				environmentView.addElementsOfScope(type, scopeView);
			}
			return scopeView.getOuterScope();
		}
	}
}
