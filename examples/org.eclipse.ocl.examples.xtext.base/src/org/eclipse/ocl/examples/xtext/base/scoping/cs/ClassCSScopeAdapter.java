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
 * $Id: ClassCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class ClassCSScopeAdapter extends BaseCSScopeAdapter<ClassCS, org.eclipse.ocl.examples.pivot.Class>
{
	public ClassCSScopeAdapter(ClassCS csElement) {
		super(csElement, org.eclipse.ocl.examples.pivot.Class.class);
	}

	public void addInheritedContents(EnvironmentView environmentView, org.eclipse.ocl.examples.pivot.Class target, ScopeView scopeView) {
		List<org.eclipse.ocl.examples.pivot.Class> superClasses = target.getSuperClasses();
		if (superClasses.size() > 0) {
			for (org.eclipse.ocl.examples.pivot.Class superClass : superClasses) {
					environmentView.addElementsOfScope(superClass, scopeView);
			}
		}
		else {
			Type libType = getLibraryClassifierType();
			addLibContents(environmentView, libType, scopeView);
		}
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
//		TypeBindingsCS bindings = scopeView.getBindings();
		org.eclipse.ocl.examples.pivot.Class pivot = getPivot();
		if (pivot != null) {
			if (containmentFeature == BaseCSTPackage.Literals.CLASS_CS__OWNED_SUPER_TYPE) {
				environmentView.addElements(PivotPackage.Literals.TYPE, ElementUtil.getTypeTemplateParameterables(pivot));
			}
			else {
				environmentView.addNamedElements(PivotPackage.Literals.OPERATION, pivot.getOwnedOperations());
				environmentView.addNamedElements(PivotPackage.Literals.PROPERTY, pivot.getOwnedAttributes());
				environmentView.addElements(PivotPackage.Literals.TYPE, ElementUtil.getTypeTemplateParameterables(pivot));
				if ((environmentView.getSize() == 0) || (environmentView.getName() == null)) {
//					if (environmentView.getRequiredType() != BaseCSTPackage.Literals.TYPE_CS) { // Avoid creating bindings for nested type parameters
					addInheritedContents(environmentView, pivot, scopeView);
//				if ((environmentView.getSize() == 0) && (environmentView.getRequiredType() != BaseCSTPackage.Literals.TYPE_CS)) { // Avoid creating bindings for nested type parameters
//					for (org.eclipse.ocl.examples.pivot.Class superClass : pivot.getSuperClasses()) {
//						ScopeView nestedScopeView = scopeView;
//	//					if (csType instanceof BoundClassifierCS) {
//	//						nestedScopeView = new BaseScopeView(scopeView, ((BoundClassifierCS)csType).getBindings());
//	//					}
//						environmentView.addElementsOfScope(superClass, nestedScopeView);
//					}
				}
			}
		}
		return scopeView.getOuterScope();
	}
	
	@Override
	public Type getSynthesizedType() {
		return getPivot();
	}
}
