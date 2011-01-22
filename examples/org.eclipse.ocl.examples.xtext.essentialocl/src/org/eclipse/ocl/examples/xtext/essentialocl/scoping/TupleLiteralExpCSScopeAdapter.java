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
 * $Id: TupleLiteralExpCSScopeAdapter.java,v 1.1.2.4 2011/01/22 19:09:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralExpCS;

public class TupleLiteralExpCSScopeAdapter extends ExpCSScopeAdapter<TupleLiteralExpCS, TupleLiteralExp>
{
	public TupleLiteralExpCSScopeAdapter(PivotManager pivotManager, TupleLiteralExpCS csElement) {
		super(pivotManager, csElement, TupleLiteralExp.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		environmentView.addNamedElements(target.getOwnedParts());
		return scopeView.getOuterScope();
	}
}
