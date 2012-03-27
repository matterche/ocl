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
 * $Id: ClassifierContextScopeAdapter.java,v 1.8 2011/02/08 17:53:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.ClassScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;

public class ClassifierContextScopeAdapter extends ElementCSScopeAdapter
{
	public static final ClassifierContextScopeAdapter INSTANCE = new ClassifierContextScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		ClassifierContextDeclCS targetElement = (ClassifierContextDeclCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == CompleteOCLCSTPackage.Literals.CONTEXT_DECL_CS__RULES) {
			Type type = targetElement.getClassifier();
			if (type != null) {
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
