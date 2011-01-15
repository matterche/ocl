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
 * $Id: NavigatingExpCSScopeAdapter.java,v 1.1.2.7 2011/01/15 19:03:06 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationRole;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;

public class NavigatingExpCSScopeAdapter extends ExpCSScopeAdapter<NavigatingExpCS, OperationCallExp>
{
	public NavigatingExpCSScopeAdapter(PivotManager pivotManager, NavigatingExpCS eObject) {
		super(pivotManager, eObject, OperationCallExp.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EObject fromArgument = scopeView.getChild();
		// Note that we only need to find the feature, which can be identified
		// from the enclosing type. The correct source object is resolved later.
		for (NavigatingArgCS csArgument : target.getArgument()) {
			if (csArgument.getRole() == NavigationRole.EXPRESSION) {
				break;
			}
			Element pivot = csArgument.getPivot();
			if (pivot instanceof Variable) {
				if (environmentView.addNamedElement(PivotPackage.Literals.VARIABLE, (Variable) pivot) > 0) {
					return null;
				}
				Type type = ((Variable)pivot).getType();
				environmentView.addElementsOfScope(pivotManager, type, scopeView);
				if (environmentView.getSize() > 0) {
					return null;
				}
				if (type instanceof CollectionType) {		// FIXME use navigation operator dependent semantics
					environmentView.addElementsOfScope(pivotManager, ((CollectionType)type).getElementType(), scopeView);
					if (environmentView.getSize() > 0) {
						return null;
					}
				}
			}
			if (csArgument == fromArgument) {
				break;
			}
		}
//		EObject csParent = getParent().getTarget();
		EObject csParent = target.eContainer();
		if (csParent instanceof InfixExpCS) {
			OperatorCS csOperator = target.getParent();
			if (csOperator != null) {
				ScopeAdapter scopeAdapter = getScopeAdapter(csOperator);
				ExpCS csSource = csOperator.getSource();
				if (target == csSource) {									// Implicit source
					return new BaseScopeView(scopeAdapter, target, PivotPackage.Literals.CALL_EXP__SOURCE, null);
				} else {
					OclExpression source = (OclExpression)csSource.getPivot();
					Type sourceType = source != null ? source.getType() : null;
					if (PivotConstants.COLLECTION_NAVIGATION_OPERATOR.equals(csOperator.getName()) && !(sourceType instanceof CollectionType)) {
						Type setType = pivotManager.getSetType();				// Implicit set
						environmentView.addElementsOfScope(pivotManager, setType, scopeView);
					}
					else {														// Normal dot navigation
						return new BaseScopeView(scopeAdapter, target, PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT, null);
					}
				}
			}
		}
		return getOuterScopeView(null);
	}
}
