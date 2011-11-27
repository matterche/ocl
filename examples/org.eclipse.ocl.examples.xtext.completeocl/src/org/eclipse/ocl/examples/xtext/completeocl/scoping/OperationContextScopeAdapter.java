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
 * $Id: OperationContextScopeAdapter.java,v 1.9 2011/02/08 17:53:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView.Filter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.ClassScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;

public class OperationContextScopeAdapter extends ElementCSScopeAdapter<OperationContextDeclCS>
{
	public static final OperationContextScopeAdapter INSTANCE = new OperationContextScopeAdapter();

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, OperationContextDeclCS target, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == CompleteOCLCSTPackage.Literals.OPERATION_CONTEXT_DECL_CS__OPERATION) {
			Filter filter = new OperationContextFilter(target);
			try {
				environmentView.addFilter(filter);
				return getNamespaceScope(environmentView, scopeView, target.getNamespace());
			}
			finally {
				environmentView.removeFilter(filter);
			}
		}
		else if (containmentFeature == CompleteOCLCSTPackage.Literals.CONTEXT_DECL_CS__NAMESPACE) {
			return getNextNamespaceScope(environmentView, scopeView, target.getNamespace());
		}
		else if (containmentFeature == CompleteOCLCSTPackage.Literals.CONTEXT_DECL_CS__RULES) {
//			return getNextNamespaceScope(environmentView, scopeView, target.getNamespace());
			Type type = target.getOperation().getOwningType();
			if ((type != null) && !type.eIsProxy()) {
				MetaModelManager metaModelManager = environmentView.getMetaModelManager();
				environmentView.addNamedElements(type, metaModelManager.getLocalOperations(type, Boolean.FALSE));
				environmentView.addNamedElements(type, metaModelManager.getLocalProperties(type, Boolean.FALSE));
				if (!environmentView.hasFinalResult()) {
					Set<Type> alreadyVisitedTypes = new HashSet<Type>();
//					org.eclipse.ocl.examples.pivot.Class unspecializedTarget = PivotUtil.getUnspecializedTemplateableElement(target);	// FIXME
					for (Type superClass : metaModelManager.getSuperClasses(type)) {
						ClassScopeAdapter.addAllContents(environmentView, type, scopeView, superClass, Boolean.FALSE, alreadyVisitedTypes);
					}
				}
			}
		}
		return scopeView.getOuterScope();

		/*		if ((containmentFeature == CompleteOCLCSTPackage.Literals.OPERATION_CONTEXT_DECL_CS__PRES) 
		 || (containmentFeature == CompleteOCLCSTPackage.Literals.OPERATION_CONTEXT_DECL_CS__BODIES) 
		 || (containmentFeature == CompleteOCLCSTPackage.Literals.OPERATION_CONTEXT_DECL_CS__POSTS)) {
			OperationRefCS csOperationRef = target.getOperation();
			while (csOperationRef instanceof QualifiedOperationRefCS) {
				csOperationRef = ((QualifiedOperationRefCS)csOperationRef).getElement();
			}
			if (csOperationRef instanceof SimpleOperationRefCS) {
				SimpleOperationRefCS csSimpleOperationRef = (SimpleOperationRefCS)csOperationRef;
				OperationCS operationContext = csSimpleOperationRef.getOperation();
				ModelElementCS classifierContext = (ModelElementCS) operationContext.eContainer();
				environmentView.addNamedElements(operationContext.getOwnedParameter());
				environmentView.addElementsOfScope(classifierContext, scopeView);
				environmentView.addElement(Environment.SELF_VARIABLE_NAME, classifierContext);
			}
		} 
		return scopeView.getOuterScope(); */
	}
}
