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
 * $Id: TupleTypeCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:30:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleTypeCS;

public class TupleTypeCSScopeAdapter extends EssentialOCLCSScopeAdapter<TupleTypeCS, TupleType>
{
	public TupleTypeCSScopeAdapter(TupleTypeCS csElement) {
		super(csElement, TupleType.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
//		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		environmentView.addNamedElements(getTarget().getOwnedParts());
		return scopeView.getOuterScope();
	}

	@Override
	public Type getSynthesizedType() {
		return getPivot();
	}
}
