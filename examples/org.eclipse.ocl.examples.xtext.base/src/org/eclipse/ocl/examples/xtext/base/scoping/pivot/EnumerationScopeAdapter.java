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
 * $Id: EnumerationScopeAdapter.java,v 1.1.2.2 2011/01/22 19:09:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class EnumerationScopeAdapter extends AbstractPivotScopeAdapter<org.eclipse.ocl.examples.pivot.Enumeration>
{
	public EnumerationScopeAdapter(PivotManager pivotManager, org.eclipse.ocl.examples.pivot.Enumeration pivotElement) {
		super(pivotManager, pivotElement);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		environmentView.addElements(target.getOwnedLiterals());
		return scopeView.getOuterScope();
	}
}