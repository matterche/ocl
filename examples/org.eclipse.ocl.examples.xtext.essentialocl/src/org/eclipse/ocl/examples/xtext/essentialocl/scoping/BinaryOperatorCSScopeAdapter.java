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
 * $Id: BinaryOperatorCSScopeAdapter.java,v 1.1.2.1 2010/10/05 17:52:12 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;

public class BinaryOperatorCSScopeAdapter extends ExpCSScopeAdapter<BinaryOperatorCS, OperationCallExp>
{
	public BinaryOperatorCSScopeAdapter(BinaryOperatorCS eObject) {
		super(eObject, OperationCallExp.class);
	}

//	@Override
//	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
//		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
//		BinaryOperatorCS target = getTarget();
//		ExpCS parent = target.getParent();
//		return getScopeAdapter(parent).getOuterScopeView(null);
//	}
}
