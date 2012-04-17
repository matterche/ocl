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
 */
package org.eclipse.ocl.examples.xtext.essentialocl.attributes;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;

public class ConstructorPartCSAttribution extends AbstractAttribution
{
	public static final ConstructorPartCSAttribution INSTANCE = new ConstructorPartCSAttribution();

	public static void addAllContents(EnvironmentView environmentView, Type forType, ScopeView scopeView,
			Type pivotClass, Set<Type> alreadyVisited) {
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addNamedElements(forType, metaModelManager.getLocalProperties(pivotClass, false));
		alreadyVisited.add(pivotClass);
		for (Type superClass : metaModelManager.getSuperClasses(pivotClass)) {
			if (!alreadyVisited.contains(superClass)) {
				addAllContents(environmentView, forType, scopeView, superClass, alreadyVisited);
			}
		}
	}

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.CONSTRUCTOR_PART_CS__PROPERTY) {
			ConstructorExpCS targetElement = (ConstructorExpCS)target.eContainer();
			ConstructorExp pivot = PivotUtil.getPivot(ConstructorExp.class, targetElement);
			if (pivot != null) {
				Type type = pivot.getType();
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				environmentView.addNamedElements(metaModelManager.getLocalProperties(type, false));
				Set<Type> alreadyVisitedTypes = new HashSet<Type>();
				for (Type superClass : metaModelManager.getSuperClasses(type)) {
					addAllContents(environmentView, type, scopeView, superClass, alreadyVisitedTypes);
				}
			}
			return null;
		}
		return scopeView.getParent();
	}
}
