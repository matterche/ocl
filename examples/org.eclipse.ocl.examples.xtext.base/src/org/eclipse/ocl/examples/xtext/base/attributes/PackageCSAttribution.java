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
 * $Id: PackageCSAttribution.java,v 1.3 2011/04/20 19:02:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;

public class PackageCSAttribution extends AbstractAttribution
{
	public static final PackageCSAttribution INSTANCE = new PackageCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		PackageCS targetElement = (PackageCS)target;
		org.eclipse.ocl.examples.pivot.Package pivot = PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.Package.class, targetElement);
		if (pivot != null) {
			MetaModelManager metaModelManager = environmentView.getMetaModelManager();
			environmentView.addNamedElements(metaModelManager.getLocalPackages(pivot));
			environmentView.addNamedElements(metaModelManager.getLocalClasses(pivot));
		}
		return scopeView.getParent();
	}
}
