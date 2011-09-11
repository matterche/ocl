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

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;

public abstract class AbstractRootCSScopeAdapter<CS extends RootCS & ModelElementCS, P extends Element>
	extends ModelElementCSScopeAdapter<CS, P>
	implements RootCSScopeAdapter
{
	public AbstractRootCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		super(csElement, pivotClass);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
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
		return super.computeLookup(environmentView, scopeView);
	}

	public String getAlias(PackageCS csPackage) {
		for (ImportCS csImport : target.getOwnedImport()) {
			Namespace namespace = csImport.getNamespace();
			if (!namespace.eIsProxy()) {
				if (csPackage.getPivot() == namespace) {
					return csImport.getName();
				}
			}
		}
		return csPackage.getName();
	}

	@Override
	public AbstractRootCSScopeAdapter<?,?> getRootScopeAdapter() {
		return this;
	}
}
