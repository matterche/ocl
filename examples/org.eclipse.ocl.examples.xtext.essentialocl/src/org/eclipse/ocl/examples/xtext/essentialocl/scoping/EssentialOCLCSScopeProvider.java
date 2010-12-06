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
 * $Id: EssentialOCLCSScopeProvider.java,v 1.1.2.3 2010/12/06 18:03:09 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.BaseScopeProvider;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.DefaultScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.EmptyCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.util.EssentialOCLCSTSwitch;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class EssentialOCLCSScopeProvider extends BaseScopeProvider
{
	protected static class Factory extends BaseScopeProvider.Factory
	{
		protected Factory() {
			addSwitch(EssentialOCLCSTPackage.eINSTANCE, new EssentialOCLScopeSwitch());
		}
	}

	public static ModelElementCSScopeAdapter.Factory FACTORY = new Factory();
	
	public static class EssentialOCLScopeSwitch
		extends EssentialOCLCSTSwitch<ScopeAdapter>
		implements ScopeAdapter.Switch
	{	
		@Override
		public ScopeAdapter caseBinaryOperatorCS(BinaryOperatorCS eObject) {
			return new BinaryOperatorCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseCollectionLiteralExpCS(CollectionLiteralExpCS eObject) {
			return new CollectionLiteralExpCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseCollectionLiteralPartCS(CollectionLiteralPartCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseContextCS(ContextCS object) {
			return new ContextCSScopeAdapter(object);
		}

		@Override
		public ScopeAdapter caseExpCS(ExpCS eObject) {
			return new ExpCSScopeAdapter<ExpCS, OclExpression>(eObject, OclExpression.class);
		}

		@Override
		public ScopeAdapter caseInfixExpCS(InfixExpCS object) {
			return new InfixExpCSScopeAdapter(object);
		}

		@Override
		public LetExpCSScopeAdapter caseLetExpCS(LetExpCS eObject) {
			return new LetExpCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseNameExpCS(NameExpCS eObject) {
			return new NameExpCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseNavigatingExpCS(NavigatingExpCS eObject) {
			return new NavigatingExpCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseNavigationOperatorCS(NavigationOperatorCS eObject) {
			return new NavigationOperatorCSScopeAdapter(eObject);
		}

/*		@Override
		public ScopeAdapter caseRoundBracketExpCS(RoundBracketExpCS eObject) {
			OperatorExpCS parent = null;
			for (EObject child = eObject, cursor = child.eContainer(); cursor instanceof OperatorExpCS; child = cursor, cursor = cursor.eContainer()) {
				parent = (OperatorExpCS)cursor;
				if (parent.getSource() != child) {
					break;
				}
			}
			if (parent != null) {
				String op = parent.getOp();
				if (".".equals(op)) {
					return new DotOperationCallExpScopeAdapter(eObject);
				}
				else if ("->".equals(op)) {
					return new ArrowOperationCallExpScopeAdapter(eObject);
				}
			}
			return new DotOperationCallExpScopeAdapter(eObject);	// Implicit
		} */

		@Override
		public ScopeAdapter caseSelfExpCS(SelfExpCS eObject) {
			return new SelfExpCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseTupleLiteralExpCS(TupleLiteralExpCS eObject) {
			return new TupleLiteralExpCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseTupleLiteralPartCS(TupleLiteralPartCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseVariableCS(VariableCS eObject) {
			return new VariableCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter defaultCase(EObject eObject) {
			return new DefaultScopeAdapter(eObject);
		}

		public ScopeAdapter doInPackageSwitch(EObject eObject) {
			return doSwitch(eObject.eClass(), eObject);
		}
	}
}
