/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: VoidTypeAttribution.java,v 1.1 2011/04/25 19:39:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;

public class VoidTypeAttribution extends ClassAttribution
{
	public static final VoidTypeAttribution INSTANCE = new VoidTypeAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		super.computeLookup(target, environmentView, scopeView);
		if (!environmentView.hasFinalResult()) {
			MetaModelManager metaModelManager = environmentView.getMetaModelManager();
			for (org.eclipse.ocl.examples.pivot.Package primaryPackage : metaModelManager.getAllPackages()) {
//				if (primaryPackage != metaModelManager.getOrphanPackage()) {
					for (Type aType : metaModelManager.getLocalClasses(primaryPackage)) {
						Type primaryType = metaModelManager.getPrimaryType(aType);
						environmentView.addNamedElements(metaModelManager.getLocalOperations(primaryType, Boolean.FALSE));
						environmentView.addNamedElements(metaModelManager.getLocalProperties(primaryType, Boolean.FALSE));
					}
//				}
			}
		}
		return scopeView.getOuterScope();
	}
}
