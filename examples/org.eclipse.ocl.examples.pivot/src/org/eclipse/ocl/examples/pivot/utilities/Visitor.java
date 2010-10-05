/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: Visitor.java,v 1.1.2.1 2010/10/05 17:38:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import org.eclipse.ocl.examples.pivot.AssociationClassCallExp;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.Iterate;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MessageExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StateExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralPart;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableExp;

/**
 */
public interface Visitor<T> {
	/**
     * Return the result of visiting a visitable for which no more specifuc pivot type method
     * is available.
     */
	T visit(Visitable visitable);

	T visitAssociationClassCallExp(AssociationClassCallExp associationClassCallExp);
	T visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp);
	T visitCollectionItem(CollectionItem collectionItem);
	T visitCollectionLiteralExp(CollectionLiteralExp collectionLiteralExp);
	T visitCollectionRange(CollectionRange collectionRange);
	T visitConstraint(Constraint constraint);
	T visitEnumLiteralExp(EnumLiteralExp enumLiteralExp);
	T visitExpressionInOcl(ExpressionInOcl expressionInOcl);
	T visitIfExp(IfExp ifExp);
	T visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp);
	T visitInvalidLiteralExp(InvalidLiteralExp invalidLiteralExp);
	T visitIterateExp(IterateExp iterateExp);
	T visitIteratorExp(IteratorExp iteratorExp);
	T visitLetExp(LetExp letExp);
	T visitMessageExp(MessageExp messageExp);
	T visitNullLiteralExp(NullLiteralExp nullLiteralExp);
	T visitOperationCallExp(OperationCallExp operationCallExp);
	T visitPropertyCallExp(PropertyCallExp propertyCallExp);
	T visitRealLiteralExp(RealLiteralExp realLiteralExp);
	T visitStateExp(StateExp stateExp);
	T visitStringLiteralExp(StringLiteralExp stringLiteralExp);
	T visitTupleLiteralExp(TupleLiteralExp tupleLiteralExp);
	T visitTupleLiteralPart(TupleLiteralPart tupleLiteralPart);
	T visitTypeExp(TypeExp typeExp);
	T visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp unlimitedNaturalLiteralExp);
	T visitUnspecifiedValueExp(UnspecifiedValueExp unspecifiedValueExp);
	T visitVariable(Variable variable);
	T visitVariableExp(VariableExp variableExp);

	T visitClass(org.eclipse.ocl.examples.pivot.Class cls);
	T visitIterate(Iterate iterate);
	T visitIterator(org.eclipse.ocl.examples.pivot.Iterator iterator);
	T visitOperation(Operation operation);
	T visitPackage(org.eclipse.ocl.examples.pivot.Package pkg);
	T visitParameter(Parameter parameter);
	T visitPrecedence(Precedence precedence);
	T visitProperty(Property property);
}
