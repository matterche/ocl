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
 * $Id: ClassAttribution.java,v 1.10 2011/05/21 14:56:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.attributes;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

public class ClassAttribution extends AbstractAttribution
{
	public static final ClassAttribution INSTANCE = new ClassAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Class targetClass = (org.eclipse.ocl.examples.pivot.Class) target;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		if (targetClass.getOwningTemplateParameter() != null) {
			Type type = metaModelManager.getOclAnyType(); // WIP use lowerbound
			environmentView.addNamedElements(type, metaModelManager.getLocalOperations(type, Boolean.FALSE));
			environmentView.addNamedElements(type, metaModelManager.getLocalProperties(type, Boolean.FALSE));
			return null;
		}
		if (targetClass.getTemplateBinding().size() == 0) {
			EObject scopeTarget = scopeView.getTarget();
			if (scopeTarget instanceof Pivotable) {
				Element pivot = ((Pivotable)scopeTarget).getPivot();
				if (pivot == target) {		// Inherited template parameters are invisible.
					environmentView.addElements(PivotUtil.getTypeTemplateParameterables(targetClass));
				}
			}
		}
		if (target instanceof ClassifierType) {
			Type instanceType = ((ClassifierType)target).getInstanceType();
			if ((instanceType != null) && (instanceType.getOwningTemplateParameter() == null)) {		// Maybe null
				environmentView.addNamedElements(instanceType, metaModelManager.getLocalOperations(instanceType, Boolean.TRUE));
				environmentView.addNamedElements(instanceType, metaModelManager.getLocalProperties(instanceType, Boolean.TRUE));
			}
		}
		environmentView.addNamedElements(targetClass, metaModelManager.getLocalOperations(targetClass, Boolean.FALSE));
		environmentView.addNamedElements(targetClass, metaModelManager.getLocalProperties(targetClass, Boolean.FALSE));
//		if (!environmentView.hasFinalResult()) {
			if (target instanceof ClassifierType) {
				Set<Type> alreadyVisitedMetaTypes = new HashSet<Type>();
				Type instanceType = ((ClassifierType)target).getInstanceType();
				if ((instanceType != null) && (instanceType.getOwningTemplateParameter() == null)) {		// Maybe null
					environmentView.addAllContents(instanceType, scopeView, instanceType, Boolean.TRUE, alreadyVisitedMetaTypes);
				}
			}	// FIXME don't shorten non-static search after static match
			Set<Type> alreadyVisitedTypes = new HashSet<Type>();
//			org.eclipse.ocl.examples.pivot.Class unspecializedTarget = PivotUtil.getUnspecializedTemplateableElement(target);	// FIXME
			for (Type superClass : metaModelManager.getSuperClasses(targetClass)) {
				environmentView.addAllContents(targetClass, scopeView, superClass, Boolean.FALSE, alreadyVisitedTypes);
			}
//		}
		return scopeView.getParent();
	}
}
