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
 * $Id: ClassScopeAdapter.java,v 1.10 2011/05/21 14:56:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class ClassScopeAdapter extends AbstractPivotScopeAdapter<org.eclipse.ocl.examples.pivot.Class>
{
	private static void addAllContents(EnvironmentView environmentView, Type forType, ScopeView scopeView,
			Type pivotClass, Boolean selectStatic, Set<Type> alreadyVisited) {
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addNamedElements(forType, metaModelManager.getLocalOperations(pivotClass, selectStatic));
		environmentView.addNamedElements(forType, metaModelManager.getLocalProperties(pivotClass, selectStatic));
		alreadyVisited.add(pivotClass);
		if (!environmentView.hasFinalResult()) {
			for (Type superClass : metaModelManager.getSuperClasses(pivotClass)) {
				if (!alreadyVisited.contains(superClass)) {
					addAllContents(environmentView, forType, scopeView, superClass, selectStatic, alreadyVisited);
				}
			}
		}
	}
	
	public ClassScopeAdapter(org.eclipse.ocl.examples.pivot.Class pivotElement) {
		super(pivotElement);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		if (target.getOwningTemplateParameter() != null) {				// WIP
			return null;
		}
		if (target.getTemplateBindings().size() == 0) {
			environmentView.addElements(PivotUtil.getTypeTemplateParameterables(target));
		}
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		if (target instanceof ClassifierType) {
			Type instanceType = ((ClassifierType)target).getInstanceType();
			if ((instanceType != null) && (instanceType.getOwningTemplateParameter() == null)) {		// Maybe null
				environmentView.addNamedElements(instanceType, metaModelManager.getLocalOperations(instanceType, Boolean.TRUE));
				environmentView.addNamedElements(instanceType, metaModelManager.getLocalProperties(instanceType, Boolean.TRUE));
			}
		}
		environmentView.addNamedElements(target, metaModelManager.getLocalOperations(target, Boolean.FALSE));
		environmentView.addNamedElements(target, metaModelManager.getLocalProperties(target, Boolean.FALSE));
		if (!environmentView.hasFinalResult()) {
			if (target instanceof ClassifierType) {
				Set<Type> alreadyVisitedMetaTypes = new HashSet<Type>();
				Type instanceType = ((ClassifierType)target).getInstanceType();
				if ((instanceType != null) && (instanceType.getOwningTemplateParameter() == null)) {		// Maybe null
					addAllContents(environmentView, instanceType, scopeView, instanceType, Boolean.TRUE, alreadyVisitedMetaTypes);
				}
			}	// FIXME don't shorten non-static search after static match
			Set<Type> alreadyVisitedTypes = new HashSet<Type>();
//			org.eclipse.ocl.examples.pivot.Class unspecializedTarget = PivotUtil.getUnspecializedTemplateableElement(target);	// FIXME
			for (Type superClass : metaModelManager.getSuperClasses(target)) {
				addAllContents(environmentView, target, scopeView, superClass, Boolean.FALSE, alreadyVisitedTypes);
			}
		}
		return scopeView.getOuterScope();
	}
}
