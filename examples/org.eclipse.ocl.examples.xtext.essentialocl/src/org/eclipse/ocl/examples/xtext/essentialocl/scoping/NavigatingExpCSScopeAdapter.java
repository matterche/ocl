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
 * $Id: NavigatingExpCSScopeAdapter.java,v 1.1.2.2 2010/12/06 18:03:09 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;

public class NavigatingExpCSScopeAdapter extends ExpCSScopeAdapter<NavigatingExpCS, OperationCallExp>
{
	public NavigatingExpCSScopeAdapter(NavigatingExpCS eObject) {
		super(eObject, OperationCallExp.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EObject csParent = getParent().getTarget();
		if (csParent instanceof InfixExpCS) {
			InfixExpCS csInfixParent = (InfixExpCS)csParent;
			NavigatingExpCS csTarget = getTarget();
			int index = csInfixParent.getOwnedExpression().indexOf(csTarget);
			if (index >= 0) {
				if (index < csInfixParent.getOwnedOperator().size()) {
					BinaryOperatorCS csOperatorAsSource = csInfixParent.getOwnedOperator().get(index);
					if (csTarget == csOperatorAsSource.getLeft()) {
						ScopeAdapter scopeAdapter = getScopeAdapter(csOperatorAsSource);
						return new BaseScopeView(scopeAdapter, PivotPackage.Literals.CALL_EXP__SOURCE, null);
					}
				}
				if (index-1 >= 0) {
					BinaryOperatorCS csOperatorAsArgument = csInfixParent.getOwnedOperator().get(index-1);
					if (csTarget.getNamedExp() == csOperatorAsArgument.getRight()) {
						ScopeAdapter scopeAdapter = getScopeAdapter(csOperatorAsArgument);
						return new BaseScopeView(scopeAdapter, PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT, null);
					}
				}
			}
		}
		return getOuterScopeView(null);
	}
}
