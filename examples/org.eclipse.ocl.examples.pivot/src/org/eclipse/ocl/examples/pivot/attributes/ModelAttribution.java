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
 * $Id: RootPackageAttribution.java,v 1.3 2011/04/20 19:02:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;

public class ModelAttribution extends AbstractAttribution implements RootAttribution
{
	public static final ModelAttribution INSTANCE = new ModelAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Package targetPackage = (org.eclipse.ocl.examples.pivot.Package)target;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addNamedElements(metaModelManager.getLocalPackages(targetPackage));
		environmentView.addNamedElements(metaModelManager.getLocalClasses(targetPackage));
		environmentView.addNamedElements(targetPackage.getOwnedPrecedence());
		environmentView.addRootPackages();
		return scopeView.getParent();
	}
}
