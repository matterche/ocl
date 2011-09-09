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
 * $Id: VoidTypeScopeAdapter.java,v 1.1 2011/04/25 19:39:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class VoidTypeScopeAdapter extends ClassScopeAdapter
{
	public VoidTypeScopeAdapter(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Class pivotElement) {
		super(metaModelManager, pivotElement);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		super.computeLookup(environmentView, scopeView);
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
