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
 * $Id: ClassScopeAdapter.java,v 1.1.2.6 2011/01/07 12:13:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import java.util.List;

import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class ClassScopeAdapter extends AbstractPivotScopeAdapter<org.eclipse.ocl.examples.pivot.Class>
{
	public ClassScopeAdapter(PivotManager pivotManager, org.eclipse.ocl.examples.pivot.Class pivotElement) {
		super(pivotManager, pivotElement);
	}

	public void addInheritedContents(EnvironmentView environmentView, org.eclipse.ocl.examples.pivot.Class target, ScopeView scopeView) {
		List<org.eclipse.ocl.examples.pivot.Class> superClasses = target.getSuperClasses();
		if (superClasses.size() > 0) {
			for (org.eclipse.ocl.examples.pivot.Class superClass : superClasses) {
				environmentView.addElementsOfScope(pivotManager, superClass, scopeView);
			}
		}
		else {
			Type anyType = pivotManager.getOclAnyType();
			Type libType = pivotManager.getClassifierType();
			if ((libType != target) && (anyType != target)){		// FIXME Is this the right place for the trap
				addLibContents(environmentView, libType, scopeView);
			}
		}
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Class pivot = getTarget();
		org.eclipse.ocl.examples.pivot.Class unspecializedPivot;
		if (pivot.getTemplateBindings().size() > 0) {
			unspecializedPivot = PivotUtil.getUnspecializedTemplateableElement(pivot);
		}
		else {
			unspecializedPivot = pivot;
			environmentView.addElements(PivotPackage.Literals.TYPE, PivotUtil.getTypeTemplateParameterables(pivot));
		}
		environmentView.addNamedElements(PivotPackage.Literals.OPERATION, unspecializedPivot.getOwnedOperations());
		environmentView.addNamedElements(PivotPackage.Literals.PROPERTY, unspecializedPivot.getOwnedAttributes());
		if ((environmentView.getSize() == 0) || (environmentView.getName() == null)) {
//			if (environmentView.getRequiredType() != BaseCSTPackage.Literals.TYPE_CS) { // Avoid creating bindings for nested type parameters
			addInheritedContents(environmentView, unspecializedPivot, scopeView);
//			if ((environmentView.getSize() == 0) && (environmentView.getRequiredType() != BaseCSTPackage.Literals.TYPE_CS)) { // Avoid creating bindings for nested type parameters
//				for (org.eclipse.ocl.examples.pivot.Class superClass : pivot.getSuperClasses()) {
//					ScopeView nestedScopeView = scopeView;
//	//				if (csType instanceof BoundClassifierCS) {
//	//					nestedScopeView = new BaseScopeView(scopeView, ((BoundClassifierCS)csType).getBindings());
//	//				}
//					environmentView.addElementsOfScope(superClass, nestedScopeView);
//				}
		}
		return scopeView.getOuterScope();
	}

/*	@Override
	public PivotManager getPivotManager() {
		Resource resource = target.eResource();
		return PivotManager.getAdapter(resource.getResourceSet());
	} */
}
