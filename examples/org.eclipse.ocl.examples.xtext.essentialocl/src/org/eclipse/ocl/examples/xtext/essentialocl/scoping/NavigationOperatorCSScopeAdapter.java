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
 * $Id: NavigationOperatorCSScopeAdapter.java,v 1.13 2011/05/05 17:52:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeFilter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;

public class NavigationOperatorCSScopeAdapter extends ElementCSScopeAdapter
{
	public static final NavigationOperatorCSScopeAdapter INSTANCE = new NavigationOperatorCSScopeAdapter();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		NavigationOperatorCS targetElement = (NavigationOperatorCS)target;
		EObject child = scopeView.getChild();
		if (child == targetElement.getArgument()) {
			OclExpression source = PivotUtil.getPivot(OclExpression.class, targetElement.getSource());
			if (source != null) {
				Type type = source.getType();
				if (!targetElement.getName().equals(PivotConstants.COLLECTION_NAVIGATION_OPERATOR)) {
					if (type instanceof CollectionType) {		// collection->implicit-collect(object-operation)
						Type elementType = ((CollectionType)type).getElementType();
						while (elementType instanceof CollectionType) {
							elementType = ((CollectionType)elementType).getElementType();		// implicit-collect flattens
						}
						environmentView.addElementsOfScope(elementType, scopeView);
					}
					else {										// object.object-operation
						environmentView.addElementsOfScope(type, scopeView);		
					}
				}
				else if (scopeView.getContainmentFeature() != PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT){
					if (type instanceof CollectionType) {		// collection->collection-operation
						environmentView.addElementsOfScope(type, scopeView);
					}
					else {										// object.oclAsSet()->collection-operation
						MetaModelManager metaModelManager = environmentView.getMetaModelManager();
						Type setType = metaModelManager.getSetType(type);
						environmentView.addElementsOfScope(setType, scopeView);
					}
				}
				else {
					if (type instanceof CollectionType) {		// collection->iteration-operation(iterator-feature)
						environmentView.addElementsOfScope(((CollectionType)type).getElementType(), scopeView);
					}
					else {										// object.oclAsSet()->iteration-operation(iterator-feature)
						environmentView.addElementsOfScope(type, scopeView);
					}
					
				}
				if (scopeView.getContainmentFeature() != PivotPackage.Literals.OPERATION_CALL_EXP__ARGUMENT) {
					return null;				// No further outer scope lookup				
				}
			}
			return scopeView.getOuterScope();
		}
		else {
			ElementCS parent = targetElement.getLogicalParent();
			CSScopeAdapter scopeAdapter = parent != null ? ElementUtil.getScopeAdapter(parent) : null;
			ScopeFilter filter = ContextCSScopeAdapter.NoImplicitProperties.INSTANCE;
			try {
				environmentView.addFilter(filter);
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				BaseScopeView baseScopeView = new BaseScopeView(metaModelManager, parent, scopeAdapter, target, PivotPackage.Literals.CALL_EXP__SOURCE, null);
				environmentView.computeLookups(baseScopeView);
				return null;
			}
			finally {
				environmentView.removeFilter(filter);
			}
		}
	}
}
