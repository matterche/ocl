/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: TypeNameExpCSScopeAdapter.java,v 1.1.2.2 2011/01/12 10:30:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;

public class TypeNameExpCSScopeAdapter extends ModelElementCSScopeAdapter<TypeNameExpCS, Element>
{
	private static final Logger logger = Logger.getLogger(TypeNameExpCSScopeAdapter.class);

	public TypeNameExpCSScopeAdapter(PivotManager pivotManager, TypeNameExpCS csElement) {
		super(pivotManager, csElement, Element.class);	// FIXME
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.TYPE_NAME_EXP_CS__NAMESPACE) {
			InternalEList<Namespace> namespaces = (InternalEList<Namespace>) target.getNamespace();
			for (int index = 0; index < namespaces.size(); index++) {
				Namespace namespace = namespaces.basicGet(index);
				if (namespace.eIsProxy()) {
					if (index == 0) {
						return scopeView.getOuterScope();
					}
					else {
						ScopeAdapter scopeAdapter = getScopeAdapter(pivotManager, namespaces.get(index-1));
						if (scopeAdapter != null) {
							scopeAdapter.computeLookup(environmentView, scopeView);
						}
						return null;
					}
				}
			}
			logger.warn("TypeNameExpCS.namespace resolution with no unresolved proxies");
		}
		else if (containmentFeature == EssentialOCLCSTPackage.Literals.TYPE_NAME_EXP_CS__ELEMENT) {
			InternalEList<Namespace> namespaces = (InternalEList<Namespace>) target.getNamespace();
			for (int index = 0; index < namespaces.size(); index++) {	// FIXME debugging
				Namespace namespace = namespaces.basicGet(index);
				if (namespace.eIsProxy()) {
					logger.warn("element resolution with unresolved namespace proxies");
				}
			}
			if (namespaces.size() > 0) {
				ScopeAdapter scopeAdapter = getScopeAdapter(pivotManager, namespaces.get(namespaces.size()-1));
				if (scopeAdapter != null) {
					return scopeAdapter.computeLookup(environmentView, scopeView);
				}
				return null;
			}
		}
		return scopeView.getOuterScope();
	}
}
