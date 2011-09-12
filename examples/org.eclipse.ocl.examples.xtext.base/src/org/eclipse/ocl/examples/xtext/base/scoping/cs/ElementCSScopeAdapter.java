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
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.RootScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.AbstractScopeAdapter;

/**
 * An ElementCSScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements.
 *
 * @param <T>
 */
public abstract class ElementCSScopeAdapter<CS extends ElementCS> extends AbstractScopeAdapter<CS> implements ScopeCSAdapter
{	
//	protected final RootCSScopeAdapter root;	
	
	protected ElementCSScopeAdapter(CS csElement) {
		this(getScopeCSAdapter((ElementCS) csElement.eContainer()), csElement);
	}

	protected ElementCSScopeAdapter(ScopeCSAdapter parent, CS target) {
		super(parent, target);
//		this.root = parent != null ? parent.getRootScopeAdapter() : null;	// Seems to be null on Outline refresh ?? thread conflict ??
		RootScopeAdapter root = getRootScopeAdapter();
		assert (root != null) || (target instanceof RootCS);
	}	

	/**
	 * Return the scope in which to resolve an element following a list of namespaces.
	 */
	protected ScopeView getNamespaceScope(EnvironmentView environmentView,
			ScopeView scopeView, List<Namespace> namespaces) {
		int namespaceCount = namespaces.size();
		if (namespaceCount > 0) {
			Namespace namespace = namespaces.get(namespaceCount-1);
			if ((namespace == null) || namespace.eIsProxy()) {
				return null;
			}
			ScopeAdapter scopeAdapter = getScopeAdapter(namespace);
			if (scopeAdapter != null) {
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				BaseScopeView nestedScopeView = new BaseScopeView(metaModelManager, scopeAdapter, null, scopeView.getTargetReference(), null);
				environmentView.computeLookups(nestedScopeView);
			}				
			return null;
		}
		return scopeView.getOuterScope();
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
					ScopeAdapter scopeAdapter = getScopeAdapter(parentNamespace);
					if (scopeAdapter != null) {
						MetaModelManager metaModelManager = environmentView.getMetaModelManager();
						BaseScopeView nestedScopeView = new BaseScopeView(metaModelManager, scopeAdapter, null, scopeView.getTargetReference(), null);
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

	public RootScopeAdapter getRootScopeAdapter() {
//		return root;
		return parent != null ? ((ScopeCSAdapter)parent).getRootScopeAdapter() : null;	// Seems to be null on Outline refresh ?? thread conflict ??

	}

	@Override
	public String toString() {
		return target.toString();
	}
}
