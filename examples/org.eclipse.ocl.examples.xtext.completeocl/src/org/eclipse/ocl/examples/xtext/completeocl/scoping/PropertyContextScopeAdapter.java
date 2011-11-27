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
 * $Id: PropertyContextScopeAdapter.java,v 1.8 2011/02/08 17:53:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.ClassScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;

public class PropertyContextScopeAdapter extends ModelElementCSScopeAdapter<PropertyContextDeclCS, Property>
{
	public PropertyContextScopeAdapter(PropertyContextDeclCS csElement) {
		super(csElement, Property.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == CompleteOCLCSTPackage.Literals.PROPERTY_CONTEXT_DECL_CS__PROPERTY) {
			return getNamespaceScope(environmentView, scopeView, target.getNamespace());
		}
		else if (containmentFeature == CompleteOCLCSTPackage.Literals.CONTEXT_DECL_CS__NAMESPACE) {
			return getNextNamespaceScope(environmentView, scopeView, target.getNamespace());
		}
		else if (containmentFeature == CompleteOCLCSTPackage.Literals.CONTEXT_DECL_CS__RULES) {
//			return getNextNamespaceScope(environmentView, scopeView, target.getNamespace());
			Type type = target.getProperty().getOwningType();
			if ((type != null) && !type.eIsProxy()) {
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				environmentView.addNamedElements(type, metaModelManager.getLocalOperations(type, Boolean.FALSE));
				environmentView.addNamedElements(type, metaModelManager.getLocalProperties(type, Boolean.FALSE));
				if (!environmentView.hasFinalResult()) {
					Set<Type> alreadyVisitedTypes = new HashSet<Type>();
//					org.eclipse.ocl.examples.pivot.Class unspecializedTarget = PivotUtil.getUnspecializedTemplateableElement(target);	// FIXME
					for (Type superClass : metaModelManager.getSuperClasses(type)) {
						ClassScopeAdapter.addAllContents(environmentView, type, scopeView, superClass, Boolean.FALSE, alreadyVisitedTypes);
					}
				}
			}
		}
		return scopeView.getOuterScope();
	}
}
