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

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BaseLeft2RightVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.util.EssentialOCLCSVisitor;

public class AbstractEssentialOCLLeft2RightVisitor
	extends BaseLeft2RightVisitor implements EssentialOCLCSVisitor<Element>
{
	//
	//	This file is maintained by copying from AbstractExtendingEssentialOCLCSVisitor and changing R to Element.
	//
	protected AbstractEssentialOCLLeft2RightVisitor(CS2PivotConversion context) {
		super(context);
	}

	public Element visitBinaryOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS object) {
		return visitOperatorCS(object);
	}

	public Element visitBooleanLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Element visitCollectionLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Element visitCollectionLiteralPartCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS object) {
		return visitModelElementCS(object);
	}

	public Element visitCollectionTypeCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS object) {
		return visitTypedRefCS(object);
	}

	public Element visitConstructorExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS object) {
		return visitNameExpCS(object);
	}

	public Element visitConstructorPartCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorPartCS object) {
		return visitModelElementCS(object);
	}

	public Element visitContextCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS object) {
		return visitNamedElementCS(object);
	}

	public Element visitExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS object) {
		return visitModelElementCS(object);
	}

	public Element visitExpSpecificationCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpSpecificationCS object) {
		return visitSpecificationCS(object);
	}

	public Element visitIfExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS object) {
		return visitExpCS(object);
	}

	public Element visitIndexExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IndexExpCS object) {
		return visitNameExpCS(object);
	}

	public Element visitInfixExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS object) {
		return visitExpCS(object);
	}

	public Element visitInvalidLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvalidLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Element visitInvocationExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvocationExpCS object) {
		return visitNameExpCS(object);
	}

	public Element visitLetExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS object) {
		return visitExpCS(object);
	}

	public Element visitLetVariableCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS object) {
		return visitVariableCS(object);
	}

	public Element visitLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LiteralExpCS object) {
		return visitExpCS(object);
	}

	public Element visitNameExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS object) {
		return visitExpCS(object);
	}

	public Element visitNavigatingArgCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS object) {
		return visitModelElementCS(object);
	}

	public Element visitNavigationOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS object) {
		return visitBinaryOperatorCS(object);
	}

	public Element visitNestedExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS object) {
		return visitExpCS(object);
	}

	public Element visitNullLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Element visitNumberLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Element visitOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS object) {
		return visitNamedElementCS(object);
	}

	public Element visitPrefixExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS object) {
		return visitExpCS(object);
	}

	public Element visitPrimitiveLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrimitiveLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Element visitSelfExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS object) {
		return visitExpCS(object);
	}

	public Element visitStringLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Element visitTupleLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Element visitTupleLiteralPartCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralPartCS object) {
		return visitVariableCS(object);
	}

	public Element visitTypeLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS object) {
		return visitLiteralExpCS(object);
	}

	public Element visitTypeNameExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS object) {
		return visitTypedRefCS(object);
	}

	public Element visitUnaryOperatorCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS object) {
		return visitOperatorCS(object);
	}

	public Element visitUnlimitedNaturalLiteralExpCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS object) {
		return visitPrimitiveLiteralExpCS(object);
	}

	public Element visitVariableCS(org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS object) {
		return visitNamedElementCS(object);
	}
}