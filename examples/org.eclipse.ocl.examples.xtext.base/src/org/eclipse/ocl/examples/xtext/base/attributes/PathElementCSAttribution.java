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
package org.eclipse.ocl.examples.xtext.base.attributes;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.scoping.BaseScopeView;

public class PathElementCSAttribution extends AbstractAttribution
{
	public static final PathElementCSAttribution INSTANCE = new PathElementCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		PathElementCS targetElement = (PathElementCS)target;
		EClassifier eClassifier = targetElement.getElementType();
		if (eClassifier == null) {
			return scopeView.getParent();
		}
		EClassifier savedRequiredType = environmentView.getRequiredType();
		try {
			environmentView.setRequiredType(eClassifier);
			ElementCS scopeTarget = targetElement.getLogicalParent();
			BaseScopeView.computeLookups(environmentView, scopeTarget, target, null, null);
			return null;
		}
		finally {
			environmentView.setRequiredType(savedRequiredType);
		}
	}
}
