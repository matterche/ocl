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
 * $Id: ElementCSScopeAdapter.java,v 1.1.2.7 2011/01/23 12:00:41 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.scope.RootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
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
	protected final RootCSScopeAdapter root;
	protected long unresolveableModificationCount = -1;
	
	protected ElementCSScopeAdapter(PivotManager pivotManager, CS csElement) {
		this(pivotManager, getScopeCSAdapter((ElementCS) csElement.eContainer()), csElement);
	}

	protected ElementCSScopeAdapter(PivotManager pivotManager, ScopeCSAdapter parent, CS target) {
		super(pivotManager, parent, target);
		this.root = parent != null ? parent.getRootScopeAdapter() : null;	// Seems to be null on Outline refresh ?? thread conflict ??
		assert (root != null) || (target instanceof RootCS);
	}	

	public RootCSScopeAdapter getRootScopeAdapter() {
		return root;
	}
	
	public boolean isUnresolvable() {
		return (root == null) || (unresolveableModificationCount >= root.getModificationCount());
	}

	public void setUnresolvable() {
		if (root != null) {
			unresolveableModificationCount = root.getModificationCount();
		}
	}

	@Override
	public String toString() {
		return target.toString();
	}
}
