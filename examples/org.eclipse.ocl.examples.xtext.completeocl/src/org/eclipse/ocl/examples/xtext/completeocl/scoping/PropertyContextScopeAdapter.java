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
 * $Id: PropertyContextScopeAdapter.java,v 1.5.6.2 2010/12/06 18:36:45 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedStructuralFeatureRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.SimpleStructuralFeatureRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureRefCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
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
			return scopeView.getOuterScope();
		}
		else {
			StructuralFeatureRefCS csStructuralFeatureRef = getTarget().getProperty();
			while (csStructuralFeatureRef instanceof QualifiedStructuralFeatureRefCS) {
				csStructuralFeatureRef = ((QualifiedStructuralFeatureRefCS)csStructuralFeatureRef).getElement();
			}
			if (csStructuralFeatureRef instanceof SimpleStructuralFeatureRefCS) {
				SimpleStructuralFeatureRefCS csSimpleStructuralFeatureRef = (SimpleStructuralFeatureRefCS)csStructuralFeatureRef;
				StructuralFeatureCS feature = csSimpleStructuralFeatureRef.getFeature();
				EObject classifierContext = feature.eContainer();
				environmentView.addElementsOfScope(classifierContext, scopeView);
				environmentView.addElement("self", classifierContext);
			}
			return scopeView.getOuterScope();
		}
	}
}
