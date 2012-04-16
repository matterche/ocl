/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
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
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralPart;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BaseContainmentVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpSpecificationCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IndexExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvalidLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvocationExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrimitiveLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TupleLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.EssentialOCLCSVisitor;

public class EssentialOCLContainmentVisitor extends BaseContainmentVisitor implements EssentialOCLCSVisitor<Continuation<?>, CS2PivotConversion>
{
	public EssentialOCLContainmentVisitor(CS2PivotConversion context) {
		super(context);
	}

	public Continuation<?> visitBinaryOperatorCS(BinaryOperatorCS csElement) {
		return visitOperatorCS(csElement);
	}

	public Continuation<?> visitBooleanLiteralExpCS(BooleanLiteralExpCS csElement) {
		BooleanLiteralExp pivotElement = context.refreshModelElement(BooleanLiteralExp.class, PivotPackage.Literals.BOOLEAN_LITERAL_EXP, csElement);
		pivotElement.setBooleanSymbol(Boolean.valueOf(csElement.getName()));
		return null;
	}

	public Continuation<?> visitCollectionLiteralExpCS(CollectionLiteralExpCS csElement) {
		CollectionLiteralExp pivotElement = context.refreshModelElement(CollectionLiteralExp.class, PivotPackage.Literals.COLLECTION_LITERAL_EXP, csElement);
		context.refreshPivotList(CollectionLiteralPart.class, pivotElement.getPart(), csElement.getOwnedParts());
		return null;
	}

	public Continuation<?> visitCollectionLiteralPartCS(CollectionLiteralPartCS csElement) {
		if (csElement.getLastExpressionCS() == null) {
			context.refreshModelElement(CollectionItem.class, PivotPackage.Literals.COLLECTION_ITEM, csElement);	
		}
		else {
			context.refreshModelElement(CollectionRange.class, PivotPackage.Literals.COLLECTION_RANGE, csElement);
		}
		return null;
	}

	public Continuation<?> visitCollectionTypeCS(CollectionTypeCS csElement) {
		return null;
	}

	public Continuation<?> visitConstructorExpCS(ConstructorExpCS csElement) {
		ConstructorExp pivotElement = context.refreshModelElement(ConstructorExp.class, PivotPackage.Literals.CONSTRUCTOR_EXP, csElement);	
		context.refreshPivotList(ConstructorPart.class, pivotElement.getPart(), csElement.getOwnedParts());
		return null;
	}

	public Continuation<?> visitConstructorPartCS(ConstructorPartCS csElement) {
		context.refreshModelElement(ConstructorPart.class, PivotPackage.Literals.CONSTRUCTOR_PART, csElement);	
		return null;
	}

	public Continuation<?> visitContextCS(ContextCS csElement) {
		return null;
	}

	public Continuation<?> visitExpCS(ExpCS csElement) {
		return null;
	}

	public Continuation<?> visitExpSpecificationCS(ExpSpecificationCS csElement) {
		ExpressionInOcl pivotElement = context.refreshModelElement(ExpressionInOcl.class, PivotPackage.Literals.EXPRESSION_IN_OCL, csElement);
		pivotElement.getLanguage().add(PivotConstants.OCL_LANGUAGE);
//		pivotElement.getBody().add(csElement.getExprString());
		pivotElement.getMessage().add(null);
		return null;
	}

	public Continuation<?> visitIfExpCS(IfExpCS csElement) {
		context.refreshModelElement(IfExp.class, PivotPackage.Literals.IF_EXP, csElement);
		return null;
	}

	public Continuation<?> visitIndexExpCS(IndexExpCS csElement) {
		return null;
	}

	public Continuation<?> visitInfixExpCS(InfixExpCS csElement) {
		return null;
	}

	public Continuation<?> visitInvalidLiteralExpCS(InvalidLiteralExpCS csElement) {
		return null;
	}

	public Continuation<?> visitInvocationExpCS(InvocationExpCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.OPERATION, csElement, null);
		return null;
	}

	public Continuation<?> visitLetExpCS(LetExpCS csElement) {
		return visitExpCS(csElement);
	}

	public Continuation<?> visitLetVariableCS(LetVariableCS csElement) {
		return visitVariableCS(csElement);
	}

	public Continuation<?> visitLiteralExpCS(LiteralExpCS csElement) {
		return null;
	}

	public Continuation<?> visitNameExpCS(NameExpCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.ELEMENT, csElement, null);
		return null;
	}

	public Continuation<?> visitNavigatingArgCS(NavigatingArgCS csElement) {
		return null;
	}

	public Continuation<?> visitNavigationOperatorCS(NavigationOperatorCS csElement) {
		return visitBinaryOperatorCS(csElement);
	}

	public Continuation<?> visitNestedExpCS(NestedExpCS csElement) {
		return null;
	}

	public Continuation<?> visitNullLiteralExpCS(NullLiteralExpCS csElement) {
		context.refreshModelElement(NullLiteralExp.class, PivotPackage.Literals.NULL_LITERAL_EXP, csElement);
		return null;
	}

	public Continuation<?> visitNumberLiteralExpCS(NumberLiteralExpCS csElement) {
		Number number = csElement.getName();
		if (number instanceof BigDecimal) {
			RealLiteralExp pivotElement = context.refreshModelElement(RealLiteralExp.class, PivotPackage.Literals.REAL_LITERAL_EXP, csElement);
			pivotElement.setRealSymbol((BigDecimal) number);
		}
		else {
			BigInteger bigInteger = (BigInteger) number;
			if (bigInteger.signum() < 0) {
				IntegerLiteralExp pivotElement = context.refreshModelElement(IntegerLiteralExp.class, PivotPackage.Literals.INTEGER_LITERAL_EXP, csElement);
				pivotElement.setIntegerSymbol(bigInteger);
			}
			else {
				UnlimitedNaturalLiteralExp pivotElement = context.refreshModelElement(UnlimitedNaturalLiteralExp.class, PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, csElement);
				pivotElement.setUnlimitedNaturalSymbol(bigInteger);
			}
		}
		return null;
	}

	public Continuation<?> visitOperatorCS(OperatorCS csElement) {
		OperationCallExp pivotElement = context.refreshModelElement(OperationCallExp.class, PivotPackage.Literals.OPERATION_CALL_EXP, csElement);
		context.refreshName(pivotElement, csElement.getName());
		return null;
	}

	public Continuation<?> visitPrefixExpCS(PrefixExpCS csElement) {
		return null;
	}

	public Continuation<?> visitPrimitiveLiteralExpCS(PrimitiveLiteralExpCS csElement) {
		return null;
	}

	public Continuation<?> visitSelfExpCS(SelfExpCS csElement) {
		context.refreshModelElement(VariableExp.class, PivotPackage.Literals.VARIABLE_EXP, csElement);
		return null;
	}

	public Continuation<?> visitStringLiteralExpCS(StringLiteralExpCS csElement) {
		StringLiteralExp pivotElement = context.refreshModelElement(StringLiteralExp.class, PivotPackage.Literals.STRING_LITERAL_EXP, csElement);
		List<String> names = csElement.getName();
		if (names.size() == 0) {
			pivotElement.setStringSymbol("");
		}
		else if (names.size() == 1) {
			pivotElement.setStringSymbol(names.get(0));
		}
		else {
			StringBuilder s = new StringBuilder();
			for (String name : names) {
				s.append(name);
			}
			pivotElement.setStringSymbol(s.toString());
		}
		return null;
	}

	public Continuation<?> visitTupleLiteralExpCS(TupleLiteralExpCS csElement) {
		TupleLiteralExp pivotElement = context.refreshModelElement(TupleLiteralExp.class, PivotPackage.Literals.TUPLE_LITERAL_EXP, csElement);	
		context.refreshPivotList(TupleLiteralPart.class, pivotElement.getPart(), csElement.getOwnedParts());
		return null;
	}

	public Continuation<?> visitTupleLiteralPartCS(TupleLiteralPartCS csElement) {
		refreshNamedElement(TupleLiteralPart.class, PivotPackage.Literals.TUPLE_LITERAL_PART, csElement);	
		return null;
	}

	public Continuation<?> visitTypeLiteralExpCS(TypeLiteralExpCS csElement) {
		return null;
	}

	public Continuation<?> visitTypeNameExpCS(TypeNameExpCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.TYPE, csElement, null);
		return null;
	}

	public Continuation<?> visitUnaryOperatorCS(UnaryOperatorCS csElement) {
		return visitOperatorCS(csElement);
	}

	public Continuation<?> visitUnlimitedNaturalLiteralExpCS(UnlimitedNaturalLiteralExpCS csElement) {
		UnlimitedNaturalLiteralExp pivotElement = context.refreshModelElement(UnlimitedNaturalLiteralExp.class, PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, csElement);
		pivotElement.setName("*");
		pivotElement.setUnlimitedNaturalSymbol(BigInteger.valueOf(-1));
		return null;
	}

	public Continuation<?> visitVariableCS(VariableCS csElement) {
		refreshNamedElement(Variable.class, PivotPackage.Literals.VARIABLE, csElement);
		return null;
	}
}