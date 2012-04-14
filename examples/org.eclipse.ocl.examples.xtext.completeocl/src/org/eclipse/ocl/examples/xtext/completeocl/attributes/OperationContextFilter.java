/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: OperationContextFilter.java,v 1.2 2011/04/25 19:39:58 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.attributes;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeFilter;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;

public class OperationContextFilter implements ScopeFilter
{
	private final OperationContextDeclCS csOperationContext;
	
	public OperationContextFilter(OperationContextDeclCS csOperationContext) {
		this.csOperationContext = csOperationContext;
	}

	public int compareMatches(EObject match1, Map<TemplateParameter, ParameterableElement> bindings1, EObject match2, Map<TemplateParameter, ParameterableElement> bindings2) {
		return 0;
	}

	public boolean matches(EnvironmentView environmentView, Type forType, EObject eObject) {
		if (!(eObject instanceof Operation)) {
			return false;
		}
		Operation candidateOperation = (Operation) eObject;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		Type context = metaModelManager.getPrimaryType(candidateOperation.getOwningType());
		if (context != metaModelManager.getPrimaryElement(forType)) {
			return false;
		}
		List<VariableCS> contextParameters = csOperationContext.getParameters();
		List<Parameter> candidateParameters = candidateOperation.getOwnedParameter();
		int iMax = contextParameters.size();
		if (iMax != candidateParameters.size()) {
			return false;
		}
		for (int i = 0; i < iMax; i++) {
			VariableCS contextParameter = contextParameters.get(i);
			Parameter candidateParameter = candidateParameters.get(i);
			Type contextType = metaModelManager.getPrimaryType(PivotUtil.getPivot(Type.class, contextParameter.getOwnedType()));
			Type candidateType = metaModelManager.getPrimaryType(candidateParameter.getType());
// FIXME Need to resolve parameter type pivots first
//			if (contextType != candidateType) {
//				return false;
//			}
		}
		return true;
	}
}