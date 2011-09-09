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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class TypedTypeRefCSScopeAdapter extends ElementRefCSScopeAdapter<TypedTypeRefCS, Type>
{
	public TypedTypeRefCSScopeAdapter(MetaModelManager metaModelManager, TypedTypeRefCS csElement) {
		super(metaModelManager, csElement, Type.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__OWNED_TEMPLATE_BINDING) {
			MetaModelManager metaModelManager = environmentView.getMetaModelManager();
			return getOuterScopeView(metaModelManager, null);
		}
		else if (containmentFeature == BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__TYPE) {
			return getNamespaceScope(environmentView, scopeView, target.getNamespace());
		}
		else if (containmentFeature == BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__NAMESPACE) {
			return getNextNamespaceScope(environmentView, scopeView, target.getNamespace());
		}
		else {
			Type type = target.getType();
			if ((type != null) && !type.eIsProxy()) {
				environmentView.addElementsOfScope(type, scopeView);
			}
			return scopeView.getOuterScope();
		}
	}
}
