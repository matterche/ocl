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
 * $Id: LibOperationScopeAdapter.java,v 1.5.6.2 2010/12/06 18:14:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.scoping;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.util.Nameable;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.BaseCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class LibOperationScopeAdapter extends BaseCSScopeAdapter<OperationCS, Operation>
{
	public LibOperationScopeAdapter(OperationCS csElement) {
		super(csElement, Operation.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
//		TypeBindingsCS bindings = scopeView.getBindings();
		Operation pivot = getPivot();
		if (pivot != null) {
			if (containmentFeature == BaseCSTPackage.Literals.OPERATION_CS__OWNED_PARAMETER) {
			}
			else {
				environmentView.addNamedElements(PivotPackage.Literals.PARAMETER, pivot.getOwnedParameters());
			}
			environmentView.addElements(PivotPackage.Literals.TYPE, ElementUtil.getTypeTemplateParameterables(pivot));
		}
		else {
			OperationCS target = getTarget();
			TemplateSignatureCS csTemplateSignature = target.getOwnedTemplateSignature();
			if (csTemplateSignature != null) {
				for (TemplateParameterCS csTemplateParameter : csTemplateSignature.getOwnedTemplateParameter()) {
					TemplateParameter templateParameter = (TemplateParameter) csTemplateParameter.getPivot();
					if (templateParameter != null) {
						environmentView.addNamedElement(PivotPackage.Literals.TYPE, (Nameable) templateParameter.getParameteredElement());
					}
					else {
//						environmentView.addNamedElement(BaseCSTPackage.Literals.TYPE, (INamedElement) csTemplateParameter.getParameteredElement());
					}
				}
			}
		}
		return scopeView.getOuterScope();
	}
}
