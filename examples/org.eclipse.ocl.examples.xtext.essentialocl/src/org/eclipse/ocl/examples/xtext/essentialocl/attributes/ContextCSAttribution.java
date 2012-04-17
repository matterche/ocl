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
 * $Id: ContextCSAttribution.java,v 1.11 2011/05/02 09:31:32 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.attributes;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationContext;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeFilter;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.scoping.AbstractRootCSAttribution;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;

public class ContextCSAttribution extends AbstractRootCSAttribution
{
	public static final ContextCSAttribution INSTANCE = new ContextCSAttribution();

	public static final class NoImplicitProperties implements ScopeFilter
	{	// FIXME should gather both implicit property and type and then fix in resolveDuplicates
		public static NoImplicitProperties INSTANCE = new NoImplicitProperties();
		
		public int compareMatches(EObject match1, Map<TemplateParameter, ParameterableElement> bindings1, EObject match2, Map<TemplateParameter, ParameterableElement> bindings2) {
			return 0;
		}

		public boolean matches(EnvironmentView environmentView, Type forType, EObject eObject) {
			return !(eObject instanceof Property) || !((Property)eObject).isImplicit();
		}
	}

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		ContextCS targetElement = (ContextCS)target;
		environmentView.addFilter(NoImplicitProperties.INSTANCE);
		try {
			ExpressionInOcl pivot = PivotUtil.getPivot(ExpressionInOcl.class, targetElement);
			if ((pivot != null) && (pivot.getContextVariable().getType() != null)) {
				Variable resultVariable = pivot.getResultVariable();
				if (resultVariable != null) {
					environmentView.addNamedElement(resultVariable);
				}
				for (Variable parameterVariable : pivot.getParameterVariable()) {
					environmentView.addNamedElement(parameterVariable);
				}
				Variable contextVariable = pivot.getContextVariable();
				if (contextVariable != null) {
					environmentView.addNamedElement(contextVariable);
					if (!environmentView.hasFinalResult()) {
						Type type = contextVariable.getType();
						environmentView.addElementsOfScope(type, scopeView);
						for (Package pPackage = type.getPackage(); !environmentView.hasFinalResult() && (pPackage != null); pPackage = pPackage.getNestingPackage()) {
							environmentView.addElementsOfScope(pPackage, scopeView);
						}
					}
				}
			}
			else {
				Resource resource = target.eResource();
				if (resource instanceof EvaluationContext) {
					NamedElement specificationContext = ((EvaluationContext)resource).getSpecificationContext();
					if (specificationContext != null) {
						environmentView.computeLookups(specificationContext, null, null, PivotPackage.Literals.NAMED_ELEMENT__OWNED_RULE);
					}
				}
			}
			if (!environmentView.hasFinalResult()) {
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				environmentView.addElementsOfScope(metaModelManager.getOclAnyType().getPackage(), scopeView);
			}
			return super.computeLookup(targetElement, environmentView, scopeView);
		}
		finally {
			environmentView.removeFilter(NoImplicitProperties.INSTANCE);
		}
	}
}
