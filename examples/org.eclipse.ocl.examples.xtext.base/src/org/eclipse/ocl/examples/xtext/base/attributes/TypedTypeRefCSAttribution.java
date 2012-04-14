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
 * $Id: TypedTypeRefCSAttribution.java,v 1.5 2011/05/11 19:51:15 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.Attribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.scoping.BaseScopeView;

public class TypedTypeRefCSAttribution extends AbstractAttribution
{
	public static final TypedTypeRefCSAttribution INSTANCE = new TypedTypeRefCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		TypedTypeRefCS targetElement = (TypedTypeRefCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == BaseCSTPackage.Literals.TYPED_TYPE_REF_CS__OWNED_TEMPLATE_BINDING) {
			MetaModelManager metaModelManager = environmentView.getMetaModelManager();
			ElementCS parent = targetElement.getLogicalParent();
			Attribution parentScope = parent != null ? PivotUtil.getAttribution(parent) : null;
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
