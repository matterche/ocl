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
 * $Id: PivotScopeProvider.java,v 1.1.2.2 2010/12/06 17:53:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.common.utils.TracingOption;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.util.PivotSwitch;
import org.eclipse.ocl.examples.xtext.base.scope.BaseScopeView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.DefaultScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class PivotScopeProvider extends AbstractDeclarativeScopeProvider
{
	protected static class Factory extends ModelElementCSScopeAdapter.Factory
	{
		protected Factory() {
			addSwitch(PivotPackage.eINSTANCE, new PivotScopeSwitch());
		}
	}

	public static ModelElementCSScopeAdapter.Factory FACTORY = new Factory();
	
	public static final TracingOption LOOKUP = new TracingOption("org.eclipse.ocl.examples.xtext.base", "lookup");  //$NON-NLS-1$//$NON-NLS-2$
	
	public static class PivotScopeSwitch 
		extends PivotSwitch<ScopeAdapter>
		implements ScopeAdapter.Switch
	{
		@Override
		public ScopeAdapter caseClass(org.eclipse.ocl.examples.pivot.Class pivotElement) {
			return new ClassScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseConstraint(Constraint pivotElement) {
			return new ConstraintScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseExpressionInOcl(ExpressionInOcl pivotElement) {
			return new ExpressionInOclScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseIfExp(IfExp pivotElement) {
			return new IfExpScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseLetExp(LetExp pivotElement) {
			return new LetExpScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseOperation(Operation pivotElement) {
			return new OperationScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseOperationCallExp(OperationCallExp pivotElement) {
			return new OperationCallExpScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter casePackage(org.eclipse.ocl.examples.pivot.Package pivotElement) {
			if (pivotElement.eContainer() == null) {
				return new RootPackageScopeAdapter(pivotElement);
			}
			else {
				return new PackageScopeAdapter(pivotElement);
			}
		}

		@Override
		public ScopeAdapter casePropertyCallExp(PropertyCallExp pivotElement) {
			return new PropertyCallExpScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseTemplateSignature(TemplateSignature pivotElement) {
			return new TemplateSignatureScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseTypeTemplateParameter(TypeTemplateParameter pivotElement) {
			return new TypeTemplateParameterScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseVariable(Variable pivotElement) {
			return new VariableScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter caseVariableExp(VariableExp pivotElement) {
			return new VariableExpScopeAdapter(pivotElement);
		}

		@Override
		public ScopeAdapter defaultCase(EObject eObject) {
			return new DefaultScopeAdapter(eObject);
		}

		public ScopeAdapter doInPackageSwitch(EObject eObject) {
			int classifierID = eObject.eClass().getClassifierID();
			return doSwitch(classifierID, eObject);
		}
	}

	@Override
	public ScopeView getScope(EObject context, EReference reference) {
		ScopeAdapter scopeAdapter = ElementUtil.getScopeAdapter(context);
		if (scopeAdapter == null) {
			return null;
		}
		return new BaseScopeView(scopeAdapter, reference, reference);
	}
}
