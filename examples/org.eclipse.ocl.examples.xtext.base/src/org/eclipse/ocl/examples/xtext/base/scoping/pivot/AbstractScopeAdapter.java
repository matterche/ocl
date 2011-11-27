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
 * $Id: AbstractScopeAdapter.java,v 1.5 2011/04/25 09:50:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

/**
 * Ann AbstractScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements.
 *
 * @param <T>
 */
public abstract class AbstractScopeAdapter implements ScopeAdapter, Adapter.Internal
{	
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		return scopeView.getOuterScope();
	}

	public void dispose() {}

	public final EObject getTarget() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 */
	public void notifyChanged(Notification msg) {
		// Do nothing.
	}

	public void setTarget(Notifier newTarget) {
		int count = 0;
		for (Adapter adapter : newTarget.eAdapters()) {
			if (adapter instanceof ScopeAdapter) {
				count++;
			}
		}
		assert count == 1;
	}

	public void unsetTarget(Notifier oldTarget) {}
}
