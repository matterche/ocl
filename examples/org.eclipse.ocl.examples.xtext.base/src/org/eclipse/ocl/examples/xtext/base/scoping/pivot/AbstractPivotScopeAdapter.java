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
 * $Id: AbstractPivotScopeAdapter.java,v 1.1.2.3 2010/12/11 10:45:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
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
	protected AbstractPivotScopeAdapter(PivotManager pivotManager, P pivotElement) {
		this(pivotManager, (Element)pivotElement.eContainer(), pivotElement);
	}
	
	protected AbstractPivotScopeAdapter(PivotManager pivotManager, Element parentElement, P pivotElement) {
		this(pivotManager, parentElement != null ? getScopeAdapter(pivotManager, parentElement) : null, pivotElement);
	}

	private AbstractPivotScopeAdapter(PivotManager pivotManager, ScopeAdapter containerScopeAdapter, P pivotElement) {
		super(pivotManager, containerScopeAdapter, pivotElement);
		this.document = parent != null ? parent.getRootScopeAdapter() : null;	// Seems to be null on Outline refresh ?? thread conflict ??
//		this.pivotClass = (Class<P>) pivotElement.getClass();
//		assert (document != null) || (pivotElement instanceof org.eclipse.ocl.examples.pivot.Package) : "Null parent for a " + pivotElement.getClass().getName();
	}

	public String getMoniker() {
		if (target instanceof MonikeredElement) {
			return Pivot2Moniker.toString((MonikeredElement)target);
		}
		throw new UnsupportedOperationException(getClass().getSimpleName() + ".getSignature for " + target.eClass().getName()); //$NON-NLS-1$
	}

/*	public PivotManager getPivotManager() {
		Resource pivotResource = target.eResource();
		PivotManager pivotManager = PivotManager.findAdapter(pivotResource.getResourceSet());
		if (pivotManager == null) {
			return null;
		}
		return pivotManager;
	} */

	public RootScopeAdapter getRootScopeAdapter() {
		return document;
	}

	@Override
	public String toString() {
		return String.valueOf(getMoniker());
	}
}
