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
 * $Id: LetExpCSScopeAdapter.java,v 1.1.2.3 2010/12/11 10:45:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.util.Nameable;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;

public class LetExpCSScopeAdapter extends ExpCSScopeAdapter<LetExpCS, LetExp>
{
	public LetExpCSScopeAdapter(PivotManager pivotManager, LetExpCS csElement) {
		super(pivotManager, csElement, LetExp.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.LET_EXP_CS__IN) {
			for (VariableCS csVariable : target.getVariable()) {
				environmentView.addNamedElement(PivotPackage.Literals.VARIABLE, (Nameable) csVariable.getPivot());
			}
		}
		return scopeView.getOuterScope();
	}
}
