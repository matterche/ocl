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
 * $Id: AbstractRootCSScopeAdapter.java,v 1.6 2011/05/11 19:50:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scope;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;

public abstract class AbstractRootCSScopeAdapter extends ElementCSScopeAdapter implements RootScopeAdapter
{
	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		if (environmentView.accepts(PivotPackage.Literals.TYPE)) {
			for (Type type : metaModelManager.getGlobalTypes()) {
				environmentView.addNamedElement(type);
			}
		}
		if (environmentView.accepts(PivotPackage.Literals.NAMESPACE)) {
			for (Map.Entry<String, Namespace> entry : metaModelManager.getGlobalNamespaces()) {
				environmentView.addElement(entry.getKey(), null, entry.getValue());
			}
		}
		return super.computeLookup(target, environmentView, scopeView);
	}
}
