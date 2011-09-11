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
 * $Id: AbstractPivotScopeAdapter.java,v 1.2 2011/01/24 21:00:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;
import org.eclipse.ocl.examples.xtext.base.scope.RootScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;

/**
 * A AbstractScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements.
 *
 * @param <T>
 */
public abstract class AbstractPivotScopeAdapter<P extends Element> extends AbstractScopeAdapter<P>
{	
	protected final RootScopeAdapter document;
	
	/**
	 * Creates an instance.
	 * @param parent 
	 */
	protected AbstractPivotScopeAdapter(P pivotElement) {
		this((Element)pivotElement.eContainer(), pivotElement);
	}
	
	protected AbstractPivotScopeAdapter(Element parentElement, P pivotElement) {
		this(parentElement != null ? getScopeAdapter(parentElement) : null, pivotElement);
	}

	private AbstractPivotScopeAdapter(ScopeAdapter containerScopeAdapter, P pivotElement) {
		super(containerScopeAdapter, pivotElement);
		this.document = parent != null ? parent.getRootScopeAdapter() : null;	// Seems to be null on Outline refresh ?? thread conflict ??
//		this.pivotClass = (Class<P>) pivotElement.getClass();
//		assert (document != null) || (pivotElement instanceof org.eclipse.ocl.examples.pivot.Package) : "Null parent for a " + pivotElement.getClass().getName();
	}

	public RootScopeAdapter getRootScopeAdapter() {
		return document;
	}

	@Override
	public String toString() {
		return Pivot2Moniker.toString(target);
	}
}
