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
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class ModelElementRefCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final ModelElementRefCSScopeAdapter INSTANCE = new ModelElementRefCSScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		ModelElementRefCS targetElement = (ModelElementRefCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == BaseCSTPackage.Literals.MODEL_ELEMENT_REF_CS__ELEMENT) {
			return getNamespaceScope(environmentView, scopeView, targetElement.getNamespace());
		}
		else if (containmentFeature == BaseCSTPackage.Literals.MODEL_ELEMENT_REF_CS__NAMESPACE) {
			return getNextNamespaceScope(environmentView, scopeView, targetElement.getNamespace());
		}
		else {
			return scopeView.getOuterScope();
		}
	}
}
