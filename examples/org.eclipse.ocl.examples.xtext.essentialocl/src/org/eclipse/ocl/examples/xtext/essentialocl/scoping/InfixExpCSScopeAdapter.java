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
 * $Id: InfixExpCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:30:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;

public class InfixExpCSScopeAdapter extends ExpCSScopeAdapter<InfixExpCS, OperationCallExp>
{
	public InfixExpCSScopeAdapter(InfixExpCS csElement) {
		super(csElement, OperationCallExp.class);
	}

//	@Override
//	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
//		return getScopeAdapter(getPivot()).getOuterScopeView(null);
//	}

	@Override
	public Type getSynthesizedType() {
		OperationCallExp pivot = getPivot();
		return pivot != null ? pivot.getType() : null;
	}
}
