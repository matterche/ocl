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
 * $Id: EnumerationScopeAdapter.java,v 1.5 2011/04/25 09:50:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class EnumerationScopeAdapter extends AbstractPivotScopeAdapter
{
	public static final EnumerationScopeAdapter INSTANCE = new EnumerationScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Enumeration targetEnumeration = (org.eclipse.ocl.examples.pivot.Enumeration) target;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addElements(targetEnumeration.getOwnedLiteral());
		environmentView.addElementsOfScope(metaModelManager.getEnumerationType(), scopeView);
		if (!environmentView.hasFinalResult()) {
			environmentView.addElementsOfScope(metaModelManager.getOclAnyType(), scopeView);
		}	// FIXME Use ClassScopeAdapter.addInheritedContents consistently
		return scopeView.getOuterScope();
	}
}
