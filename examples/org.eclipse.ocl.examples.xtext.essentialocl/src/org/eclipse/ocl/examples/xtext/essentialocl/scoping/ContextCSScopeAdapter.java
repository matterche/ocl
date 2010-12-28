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
 * $Id: ContextCSScopeAdapter.java,v 1.1.2.3 2010/12/28 12:19:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import java.util.Map;

import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.AbstractRootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;

public class ContextCSScopeAdapter extends AbstractRootCSScopeAdapter<ContextCS, ExpressionInOcl>
{
	public ContextCSScopeAdapter(PivotManager pivotManager, ContextCS csElement) {
		super(pivotManager, csElement, ExpressionInOcl.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		ExpressionInOcl pivot = getPivot();
		if (pivot != null) {
			Variable contextVariable = pivot.getContextVariable();
			if (contextVariable != null) {
				environmentView.addNamedElement(contextVariable);
				Type type = contextVariable.getType();
				environmentView.addElementsOfScope(pivotManager, type, scopeView);
			}
			Variable resultVariable = pivot.getResultVariable();
			if (resultVariable != null) {
				environmentView.addNamedElement(resultVariable);
			}
			environmentView.addElementsOfScope(pivotManager, pivotManager.getOclAnyType().getPackage(), scopeView);
			for (Map.Entry<String, org.eclipse.ocl.examples.pivot.Package> entry :pivotManager.getPackages()) {
				environmentView.addElement(entry.getKey(), entry.getValue());
			}
		
		}
		return super.computeLookup(environmentView, scopeView);
	}
}
