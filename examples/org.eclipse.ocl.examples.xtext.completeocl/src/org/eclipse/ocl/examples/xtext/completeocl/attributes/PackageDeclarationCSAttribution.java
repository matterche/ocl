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
 * $Id: PackageDeclarationAttribution.java,v 1.11 2011/05/11 19:29:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;

public class PackageDeclarationCSAttribution extends AbstractAttribution
{
	public static final PackageDeclarationCSAttribution INSTANCE = new PackageDeclarationCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		PackageDeclarationCS targetElement = (PackageDeclarationCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == CompleteOCLCSTPackage.Literals.PACKAGE_DECLARATION_CS__CONTEXTS) {
			org.eclipse.ocl.examples.pivot.Package pkg = targetElement.getPackage();
			if (pkg != null) {
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				environmentView.addNamedElements(null, metaModelManager.getLocalPackages(pkg));
				environmentView.addNamedElements(null, metaModelManager.getLocalClasses(pkg));
//				environmentView.addNamedElements(pkge.getOwnedPrecedence());
			}
		}
		return scopeView.getOuterScope();
	}
}
