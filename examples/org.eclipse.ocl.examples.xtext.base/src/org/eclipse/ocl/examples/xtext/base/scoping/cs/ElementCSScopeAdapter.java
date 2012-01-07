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
 * $Id: ElementCSScopeAdapter.java,v 1.4 2011/04/20 19:02:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.AbstractScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.PivotScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

/**
 * An ElementCSScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements.
 *
 * @param <T>
 */
public class ElementCSScopeAdapter extends AbstractScopeAdapter implements CSScopeAdapter
{	
	/**
	 * Return the scope in which to resolve an element following a list of namespaces.
	 */
	protected ScopeView getNamespaceScope(EnvironmentView environmentView,
			ScopeView scopeView, List<Namespace> namespaces) {
		int namespaceCount = namespaces.size();
		if (namespaceCount <= 0) {
			return scopeView.getOuterScope();
		}
		Namespace namespace = namespaces.get(namespaceCount-1);
		if ((namespace == null) || namespace.eIsProxy()) {
			return null;
		}
		PivotScopeAdapter scopeAdapter = ElementUtil.getScopeAdapter(namespace);
		if (scopeAdapter == null) {
			return null;
		}
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		return new BaseScopeView(metaModelManager, namespace, scopeAdapter, null, scopeView.getTargetReference(), null);
	}

	/**
	 * Return the scope in which to resolve a member of a list of namespaces.
	 * <p>
	 * This code assumes that the calling context attempts to resolve namespaces
	 * from the outer most, so that the first proxy denotes the next namespace to resolve.
	 */
	protected ScopeView getNextNamespaceScope(EnvironmentView environmentView,
			ScopeView scopeView, EList<Namespace> namespaces) {
		// FIXME Use this for all namespace lists and all nested qualified names
		InternalEList<Namespace> internalNamespaces = (InternalEList<Namespace>)namespaces;
		int iMax = internalNamespaces.size();
		//
		//	A normal parse traverses unresolved proxies.
		//
		for (int i = 0; i < iMax; i++) {
			Namespace namespace = internalNamespaces.basicGet(i);
			if (namespace.eIsProxy()) {
				if (i <= 0) {
					return scopeView.getOuterScope();
				}
				else {
					Namespace parentNamespace = internalNamespaces.get(i-1);
					PivotScopeAdapter scopeAdapter = ElementUtil.getScopeAdapter(parentNamespace);
					if (scopeAdapter != null) {
						MetaModelManager metaModelManager = environmentView.getMetaModelManager();
						BaseScopeView nestedScopeView = new BaseScopeView(metaModelManager, parentNamespace, scopeAdapter, null, scopeView.getTargetReference(), null);
						environmentView.computeLookups(nestedScopeView);
					}
					return null;
				}
			}
		}
		//
		//	A serialization traverses them all again just for fun.
		//
		for (Namespace namespace : namespaces) {
			environmentView.addNamedElement(namespace);
			if (environmentView.hasFinalResult()) {
				break;
			}
		}
		return null;		// FIXME Import alias names
	}
	
	public final boolean isAdapterForType(Object type) {
		return type == CSScopeAdapter.class;
	}
}
