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
 * $Id: EssentialOCLScopeVisitor.java,v 1.4 2011/05/14 11:18:07 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.eclipse.ocl.examples.xtext.base.cs2pivot.BaseScopeVisitor;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.EmptyCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpSpecificationCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvocationExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.ConstructorPartCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.ContextCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.ExpSpecificationCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.InvocationExpCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.LetExpCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.NavigationOperatorCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.TupleLiteralExpCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;

public class EssentialOCLScopeVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<CSScopeAdapter, Object, BaseScopeVisitor>
{
	public EssentialOCLScopeVisitor() {
		super(new BaseScopeVisitor(), null);
	}
	
	@Override
	public CSScopeAdapter visitBinaryOperatorCS(BinaryOperatorCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitCollectionLiteralExpCS(CollectionLiteralExpCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitCollectionLiteralPartCS(CollectionLiteralPartCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitCollectionTypeCS(CollectionTypeCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitConstructorExpCS(ConstructorExpCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitConstructorPartCS(ConstructorPartCS object) {
		return ConstructorPartCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitContextCS(ContextCS eObject) {
		return ContextCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitExpCS(ExpCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitExpSpecificationCS(ExpSpecificationCS eObject) {
		return ExpSpecificationCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitInfixExpCS(InfixExpCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitInvocationExpCS(InvocationExpCS eObject) {
		return InvocationExpCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitLetExpCS(LetExpCS eObject) {
		return LetExpCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitNameExpCS(NameExpCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitNavigatingArgCS(NavigatingArgCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;		// FIXME iterators
	}

	@Override
	public CSScopeAdapter visitNavigationOperatorCS(NavigationOperatorCS eObject) {
		return NavigationOperatorCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitSelfExpCS(SelfExpCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTupleLiteralExpCS(TupleLiteralExpCS eObject) {
		return TupleLiteralExpCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTupleLiteralPartCS(TupleLiteralPartCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitTypeNameExpCS(TypeNameExpCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}
	
	@Override
	public CSScopeAdapter visitUnaryOperatorCS(UnaryOperatorCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitVariableCS(VariableCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}
}