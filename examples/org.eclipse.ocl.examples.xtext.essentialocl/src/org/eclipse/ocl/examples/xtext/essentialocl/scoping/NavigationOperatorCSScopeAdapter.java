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
 * $Id: NavigationOperatorCSScopeAdapter.java,v 1.1.2.4 2010/12/28 12:19:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;

public class NavigationOperatorCSScopeAdapter extends ExpCSScopeAdapter<NavigationOperatorCS, CallExp>
{
	public NavigationOperatorCSScopeAdapter(PivotManager pivotManager, NavigationOperatorCS eObject) {
		super(pivotManager, eObject, CallExp.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		BinaryOperatorCS csOperator = getTarget();
		if (containmentFeature == PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT) {
			OclExpression csSource = PivotUtil.getPivot(OclExpression.class, csOperator.getSource());
//			ScopeAdapter typeScopeAdapter = getScopeAdapter(pivotManager, source.getType());
			if (csSource instanceof TypeExp) {
				environmentView.addElementsOfScope(pivotManager, ((TypeExp)csSource).getReferredType(), scopeView);
			}
			else {
				environmentView.addElementsOfScope(pivotManager, csSource.getType(), scopeView);
			}
//			return typeScopeAdapter.compute Lookup(environmentView, typeScopeAdapter.getInnerScopeView(null));
//			return getScopeCSAdapter(parent).getOuterScopeView(null);
			return scopeView.getOuterScope();
		}
		else {
			ExpCS parent = target.getParent();
			return getScopeAdapter(parent).getOuterScopeView(null);
		}
	}
}