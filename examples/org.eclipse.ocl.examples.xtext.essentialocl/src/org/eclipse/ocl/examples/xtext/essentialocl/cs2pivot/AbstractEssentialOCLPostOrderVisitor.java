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
 * $Id: EssentialOCLPreOrderVisitor.java,v 1.7 2011/05/11 19:26:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasePostOrderVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.essentialocl.util.EssentialOCLCSVisitor;

public class AbstractEssentialOCLPostOrderVisitor
	extends BasePostOrderVisitor implements EssentialOCLCSVisitor<Continuation<?>>
{
	//
	//	This file is maintained by copying from AbstractExtendingEssentialOCLCSVisitor and changing R to Continuation<?>.
	//
	protected AbstractEssentialOCLPostOrderVisitor(CS2PivotConversion context) {
		super(context);
	}

	public Continuation<?> visitBinaryOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS object) {
		return visitOperatorCS(object);
	}

	public Continuation<?> visitBooleanLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Continuation<?> visitCollectionLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Continuation<?> visitCollectionLiteralPartCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS object) {
		return visitModelElementCS(object);
	}

	public Continuation<?> visitCollectionTypeCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS object) {
		return visitTypedRefCS(object);
	}

	public Continuation<?> visitConstructorExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS object) {
		return visitNameExpCS(object);
	}

	public Continuation<?> visitConstructorPartCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorPartCS object) {
		return visitModelElementCS(object);
	}

	public Continuation<?> visitContextCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS object) {
		return visitNamedElementCS(object);
	}

	public Continuation<?> visitExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS object) {
		return visitModelElementCS(object);
	}

	public Continuation<?> visitExpSpecificationCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpSpecificationCS object) {
		return visitSpecificationCS(object);
	}

	public Continuation<?> visitIfExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitIndexExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IndexExpCS object) {
		return visitNameExpCS(object);
	}

	public Continuation<?> visitInfixExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitInvalidLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvalidLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Continuation<?> visitInvocationExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvocationExpCS object) {
		return visitNameExpCS(object);
	}

	public Continuation<?> visitLetExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitLetVariableCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS object) {
		return visitVariableCS(object);
	}

	public Continuation<?> visitLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LiteralExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitNameExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitNavigatingArgCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS object) {
		return visitModelElementCS(object);
	}

	public Continuation<?> visitNavigationOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS object) {
		return visitBinaryOperatorCS(object);
	}

	public Continuation<?> visitNestedExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitNullLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Continuation<?> visitNumberLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Continuation<?> visitOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS object) {
		return visitNamedElementCS(object);
	}

	public Continuation<?> visitPrefixExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitPrimitiveLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrimitiveLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Continuation<?> visitSelfExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS object) {
		return visitExpCS(object);
	}

	public Continuation<?> visitStringLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Continuation<?> visitTupleLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Continuation<?> visitTupleLiteralPartCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralPartCS object) {
		return visitVariableCS(object);
	}

	public Continuation<?> visitTypeLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Continuation<?> visitTypeNameExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS object) {
		return visitTypedRefCS(object);
	}

	public Continuation<?> visitUnaryOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS object) {
		return visitOperatorCS(object);
	}

	public Continuation<?> visitUnlimitedNaturalLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Continuation<?> visitVariableCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS object) {
		return visitNamedElementCS(object);
	}
}