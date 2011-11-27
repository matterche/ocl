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
 * $Id: TypeNameExpCSScopeAdapter.java,v 1.3 2011/05/06 09:05:12 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;

public class TypeNameExpCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final TypeNameExpCSScopeAdapter INSTANCE = new TypeNameExpCSScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		TypeNameExpCS targetElement = (TypeNameExpCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.TYPE_NAME_EXP_CS__ELEMENT) {
			return getNamespaceScope(environmentView, scopeView, targetElement.getNamespace());
		}
		else if (containmentFeature == EssentialOCLCSTPackage.Literals.TYPE_NAME_EXP_CS__NAMESPACE) {
			return getNextNamespaceScope(environmentView, scopeView, targetElement.getNamespace());
		}
		return scopeView.getOuterScope();
	}
}
