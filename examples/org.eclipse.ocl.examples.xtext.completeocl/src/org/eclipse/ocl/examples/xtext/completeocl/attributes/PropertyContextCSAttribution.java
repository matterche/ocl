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
 * $Id: PropertyContextAttribution.java,v 1.8 2011/02/08 17:53:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.attributes;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.attributes.ClassAttribution;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;

public class PropertyContextCSAttribution extends AbstractAttribution
{
	public static final PropertyContextCSAttribution INSTANCE = new PropertyContextCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		PropertyContextDeclCS targetElement = (PropertyContextDeclCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == CompleteOCLCSTPackage.Literals.CONTEXT_DECL_CS__RULES) {
			Property property = targetElement.getProperty();
			if (property != null) {
				Type type = property.getOwningType();
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				environmentView.addNamedElements(type, metaModelManager.getLocalOperations(type, Boolean.FALSE));
				environmentView.addNamedElements(type, metaModelManager.getLocalProperties(type, Boolean.FALSE));
				if (!environmentView.hasFinalResult()) {
					Set<Type> alreadyVisitedTypes = new HashSet<Type>();
//					org.eclipse.ocl.examples.pivot.Class unspecializedTarget = PivotUtil.getUnspecializedTemplateableElement(target);	// FIXME
					for (Type superClass : metaModelManager.getSuperClasses(type)) {
						ClassAttribution.addAllContents(environmentView, type, scopeView, superClass, Boolean.FALSE, alreadyVisitedTypes);
					}
				}
			}
		}
		return scopeView.getOuterScope();
	}
}
