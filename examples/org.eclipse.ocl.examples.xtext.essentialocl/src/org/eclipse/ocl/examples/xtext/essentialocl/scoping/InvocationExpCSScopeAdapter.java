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
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvocationExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationRole;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;

public class InvocationExpCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final InvocationExpCSScopeAdapter INSTANCE = new InvocationExpCSScopeAdapter();


	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		InvocationExpCS targetElement = (InvocationExpCS)target;
		EObject fromArgument = scopeView.getChild();
		if (fromArgument instanceof NavigatingArgCS) {
			if (((NavigatingArgCS)fromArgument).getRole() == NavigationRole.EXPRESSION) {
				CallExp pivot = PivotUtil.getPivot(CallExp.class, targetElement);
				if (pivot instanceof LoopExp) {				// FIXME This is null for nested iteration
					for (Variable iterator : ((LoopExp)pivot).getIterator()) {
						environmentView.addNamedElement(iterator);
						if (environmentView.hasFinalResult()) {
							return null;
						}
						environmentView.addElementsOfScope(iterator.getType(), scopeView);
						if (environmentView.hasFinalResult()) {
							return null;
						}
					}
					if (pivot instanceof IterateExp) {
						Variable result = ((IterateExp)pivot).getResult();
						environmentView.addNamedElement(result);
						if (environmentView.hasFinalResult()) {
							return null;
						}
						environmentView.addElementsOfScope(result.getType(), scopeView);
						if (environmentView.hasFinalResult()) {
							return null;
						}
					}
				}
				else if (pivot == null) {
					OperatorCS csParent = targetElement.getParent();
					if (csParent instanceof NavigationOperatorCS) {
						NavigationOperatorCS csNavigationOperator = (NavigationOperatorCS)csParent;
						ExpCS csSource = csNavigationOperator.getSource();
						OclExpression source = PivotUtil.getPivot(OclExpression.class, csSource);
						if (source != null) {
							Type type = source.getType();
							if (csNavigationOperator.getName().equals(PivotConstants.COLLECTION_NAVIGATION_OPERATOR)) {
								if (type instanceof CollectionType) {		// collection->collection-operation(name...
									environmentView.addElementsOfScope(((CollectionType)type).getElementType(), scopeView);
								}
							}
						}
					}
				}
			}
			else if (((NavigatingArgCS)fromArgument).getRole() == NavigationRole.ITERATOR) {			// Happens during save
				CallExp pivot = PivotUtil.getPivot(CallExp.class, targetElement);
				if (pivot instanceof LoopExp) {
					environmentView.addNamedElements(((LoopExp)pivot).getIterator());
				}
			}
			else if (((NavigatingArgCS)fromArgument).getRole() == NavigationRole.ACCUMULATOR) {
				CallExp pivot = PivotUtil.getPivot(CallExp.class, targetElement);
				if (pivot instanceof IterateExp) {
					environmentView.addNamedElement(((IterateExp)pivot).getResult());
				}
			}
			EnvironmentView.Filter filter = ContextCSScopeAdapter.NoImplicitProperties.INSTANCE;
			try {
				environmentView.addFilter(filter);
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				ElementCS parent = targetElement.getLogicalParent();
				CSScopeAdapter parentScope = parent != null ? ElementUtil.getScopeAdapter(parent) : null;
				BaseScopeView baseScopeView = new BaseScopeView(metaModelManager, parent, parentScope, target, PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT, null);
				environmentView.computeLookups(baseScopeView);
				return null;
			}
			finally {
				environmentView.removeFilter(filter);
			}
		}
		else {
			ExpCS explicitSource = null;
			ElementCS scopeTarget = null;	// Note that parent is null during PreOrder namespace resolution
			if (target.eContainer() instanceof InfixExpCS) {
				OperatorCS csOperator = targetElement.getParent();
				if (csOperator != null) {
					ExpCS csSource = csOperator.getSource();
					if (csSource != target) {
						scopeTarget = csOperator;
						explicitSource = csSource;
					}
				}
			}
			if (scopeTarget == null) {
				scopeTarget = targetElement.getLogicalParent();
			}
			CSScopeAdapter scopeAdapter = scopeTarget != null ? ElementUtil.getScopeAdapter(scopeTarget) : null;
			Type type = null;
			if (explicitSource != null) {
				OclExpression source = PivotUtil.getPivot(OclExpression.class, explicitSource);
				if (source != null) {
					type = source.getType();
				}
			}
			MetaModelManager metaModelManager = environmentView.getMetaModelManager();
			EnvironmentView.Filter filter = new OperationFilter(metaModelManager, type, targetElement);
			try {
				environmentView.addFilter(filter);
				BaseScopeView baseScopeView = new BaseScopeView(metaModelManager, scopeTarget, scopeAdapter, target, PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION, null);
				environmentView.computeLookups(baseScopeView);
				return null;
			}
			finally {
				environmentView.removeFilter(filter);
			}
		}
	}
}