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
 * $Id: ReferenceCSScopeAdapter.java,v 1.4 2011/02/15 10:36:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ReferenceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class ReferenceCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final ReferenceCSScopeAdapter INSTANCE = new ReferenceCSScopeAdapter();

	public void addAllReferences(EnvironmentView environmentView, Type csClass) {
		int oldSize = environmentView.getSize();
		environmentView.addNamedElements(csClass.getOwnedAttribute());
		int newSize = environmentView.getSize();
		if ((newSize <= oldSize) || (environmentView.getName() == null)) {
			for (Type csTypeRef : csClass.getSuperClass()) {
				if (csTypeRef instanceof TypedTypeRefCS) {
					Element type = ((TypedTypeRefCS)csTypeRef).getPivot();
					if (type instanceof Type) {
						addAllReferences(environmentView, (Type)type);
					}
				}
			}
		}
	}

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		ReferenceCS targetElement = (ReferenceCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == BaseCSTPackage.Literals.REFERENCE_CS__OPPOSITE) {
			TypedRefCS typeRef = targetElement.getOwnedType();
			if (typeRef instanceof TypedTypeRefCS) {
				Element type = ((TypedTypeRefCS)typeRef).getPivot();
				if (type instanceof Type) {
					addAllReferences(environmentView, (Type)type);
				}
			}
			return null;
		}
		else {
			return scopeView.getOuterScope();
		}
	}
}
