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
 * $Id: IterateExpScopeAdapter.java,v 1.1.2.1 2010/12/19 15:51:37 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class IterateExpScopeAdapter extends AbstractPivotScopeAdapter<IterateExp>
{
	public IterateExpScopeAdapter(PivotManager pivotManager, IterateExp pivotElement) {
		super(pivotManager, pivotElement);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == PivotPackage.Literals.LOOP_EXP__BODY) {
			OclExpression source = target.getSource();
			environmentView.addElementsOfScope(pivotManager, source.getType(), scopeView);
			environmentView.addElements(PivotPackage.Literals.VARIABLE, target.getIterators());
			environmentView.addNamedElement(PivotPackage.Literals.VARIABLE, target.getResult());
		}
		else if (containmentFeature == PivotPackage.Literals.ITERATE_EXP__RESULT) {
			OclExpression source = target.getSource();
			environmentView.addElements(PivotPackage.Literals.VARIABLE, target.getIterators());
			environmentView.addElementsOfScope(pivotManager, source.getType(), scopeView);
		}
		else if (containmentFeature == PivotPackage.Literals.LOOP_EXP__ITERATOR) {
			OclExpression source = target.getSource();
			environmentView.addElementsOfScope(pivotManager, source.getType(), scopeView);
			EObject child = scopeView.getChild();
			for (Variable iterator : target.getIterators()) {
				environmentView.addNamedElement(PivotPackage.Literals.VARIABLE, iterator);
				if (iterator == child) {
					break;
				}
			}
		}
		return scopeView.getOuterScope();
	}
}