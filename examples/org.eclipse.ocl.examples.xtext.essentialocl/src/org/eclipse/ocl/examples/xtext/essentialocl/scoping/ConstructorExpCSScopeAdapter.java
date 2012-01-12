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
 *
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;

public class ConstructorExpCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final ConstructorExpCSScopeAdapter INSTANCE = new ConstructorExpCSScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		ConstructorExpCS targetElement = (ConstructorExpCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.NAME_EXP_CS__ELEMENT) {
			List<Namespace> namespaces = targetElement.getNamespace();
			if (namespaces.size() > 0) {
				return getNamespaceScope(environmentView, scopeView, namespaces);
			}
		}
		else if (containmentFeature == EssentialOCLCSTPackage.Literals.NAME_EXP_CS__NAMESPACE) {
			return getNextNamespaceScope(environmentView, scopeView, targetElement.getNamespace());
		}
		return scopeView.getOuterScope();
	}
}
