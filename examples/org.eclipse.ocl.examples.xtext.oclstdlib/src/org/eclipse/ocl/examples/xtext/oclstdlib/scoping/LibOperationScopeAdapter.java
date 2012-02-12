/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: LibOperationScopeAdapter.java,v 1.6 2011/01/24 22:28:25 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.util.Nameable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;

public class LibOperationScopeAdapter extends ElementCSScopeAdapter
{
	public static final LibOperationScopeAdapter INSTANCE = new LibOperationScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		OperationCS targetElement = (OperationCS)target;
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
//		TypeBindingsCS bindings = scopeView.getBindings();
		Operation pivot = PivotUtil.getPivot(Operation.class, targetElement);
		if (pivot != null) {
			if (containmentFeature == BaseCSTPackage.Literals.OPERATION_CS__OWNED_PARAMETER) {
			}
			else {
				environmentView.addNamedElements(pivot.getOwnedParameter());
			}
			environmentView.addElements(PivotUtil.getTypeTemplateParameterables(pivot));
		}
		else {
			TemplateSignatureCS csTemplateSignature = targetElement.getOwnedTemplateSignature();
			if (csTemplateSignature != null) {
				for (TemplateParameterCS csTemplateParameter : csTemplateSignature.getOwnedTemplateParameter()) {
					TemplateParameter templateParameter = (TemplateParameter) csTemplateParameter.getPivot();
					if (templateParameter != null) {
						environmentView.addNamedElement((Nameable) templateParameter.getParameteredElement());
					}
					else {
//						environmentView.addNamedElement((INamedElement) csTemplateParameter.getParameteredElement());
					}
				}
			}
		}
		return scopeView.getOuterScope();
	}
}
