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
 * $Id: OperationCSScopeAdapter.java,v 1.1.2.2 2010/12/11 10:45:32 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class OperationCSScopeAdapter extends BaseCSScopeAdapter<OperationCS, Operation>
{
	public OperationCSScopeAdapter(PivotManager pivotManager, OperationCS csElement) {
		super(pivotManager, csElement, Operation.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		Operation pivot = getPivot();
		if (pivot != null) {
			if (containmentFeature == BaseCSTPackage.Literals.OPERATION_CS__OWNED_PARAMETER) {
			}
			else {
				environmentView.addNamedElements(PivotPackage.Literals.PARAMETER, pivot.getOwnedParameters());
			}
			environmentView.addElements(PivotPackage.Literals.TEMPLATE_PARAMETER, PivotUtil.getTemplateParameters(pivot));
		}
		return scopeView.getOuterScope();
	}
}