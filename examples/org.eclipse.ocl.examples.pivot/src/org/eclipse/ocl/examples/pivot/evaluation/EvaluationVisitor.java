/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EvaluationVisitor.java,v 1.1.2.1 2010/10/01 13:51:57 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.evaluation;

import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.AssociationClassCallExp;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MessageExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
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
import org.eclipse.ocl.examples.pivot.Visitable;
import org.eclipse.ocl.examples.pivot.Visitor;

/**
 * A specialized visitor that is used for evaluation an
 * {@linkplain OCLExpression OCL expression} by walking its AST.
 * <p>
 * See the {@link Environment} class for a description of the
 * generic type parameters of this class. 
 * </p>
 * 
 * @author Tim Klinger (tklinger)
 * @author Christian W. Damus (cdamus)
 */
public interface EvaluationVisitor<T> extends Visitor<T> {
	
	/**
     * Obtains the environment that provides the metamodel semantics for the
     * expression to be evaluated.
     *  
	 * @return the environment
	 */
	public Environment getEnvironment();

	/**
     * Obtains the evaluation environment that keeps track of variable values
     * and knows how to call operations, navigate properties, etc.
     * 
	 * @return the evaluation environment
	 */
	public EvaluationEnvironment getEvaluationEnvironment();
	
	/**
     * Obtains the mapping of model classes to their extends.
     * 
	 * @return the extent map
	 */
	public Map<? extends org.eclipse.ocl.examples.pivot.Class, ? extends Set<? extends Object>> getExtentMap();
	
	/**
	 * Evaluates the specified <tt>expression</tt> on the current "self" context
	 * object.  This result type of this expression may be any type.  An
	 * implementation will typically just call {@link Visitable#accept(Visitor)}
	 * on the <tt>expression</tt>, but is free to elaborate on that.  Thus,
	 * clients should not simply ask the <tt>expression</tt> to accept this
	 * visitor.
	 * 
	 * @param expression the expression to evaluate
	 * 
	 * @return the value of the expression
	 */
	public Object visitExpression(OclExpression expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableExpRequired="true"
	 * @generated
	 */
	T visitVariableExp(VariableExp variableExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model letExpRequired="true"
	 * @generated
	 */
	T visitLetExp(LetExp letExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ifExpRequired="true"
	 * @generated
	 */
	T visitIfExp(IfExp ifExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model typeExpRequired="true"
	 * @generated
	 */
	T visitTypeExp(TypeExp typeExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callExpRequired="true"
	 * @generated
	 */
	T visitPropertyCallExp(PropertyCallExp callExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callExpRequired="true"
	 * @generated
	 */
	T visitOperationCallExp(OperationCallExp callExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callExpRequired="true"
	 * @generated
	 */
	T visitAssociationClassCallExp(AssociationClassCallExp callExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callExpRequired="true"
	 * @generated
	 */
	T visitIteratorExp(IteratorExp callExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model callExpRequired="true"
	 * @generated
	 */
	T visitIterateExp(IterateExp callExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unspecExpRequired="true"
	 * @generated
	 */
	T visitUnspecifiedValueExp(UnspecifiedValueExp unspecExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitIntegerLiteralExp(IntegerLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitRealLiteralExp(RealLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitStringLiteralExp(StringLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitBooleanLiteralExp(BooleanLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitEnumLiteralExp(EnumLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitCollectionLiteralExp(CollectionLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemRequired="true"
	 * @generated
	 */
	T visitCollectionItem(CollectionItem item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rangeRequired="true"
	 * @generated
	 */
	T visitCollectionRange(CollectionRange range);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitTupleLiteralExp(TupleLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model partRequired="true"
	 * @generated
	 */
	T visitTupleLiteralPart(TupleLiteralPart part);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitInvalidLiteralExp(InvalidLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalExpRequired="true"
	 * @generated
	 */
	T visitNullLiteralExp(NullLiteralExp literalExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stateExpRequired="true"
	 * @generated
	 */
	T visitStateExp(StateExp stateExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageExpRequired="true"
	 * @generated
	 */
	T visitMessageExp(MessageExp messageExp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableRequired="true"
	 * @generated
	 */
	T visitVariable(Variable variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model expressionRequired="true"
	 * @generated
	 */
	T visitExpressionInOcl(ExpressionInOcl expression);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model constraintRequired="true"
	 * @generated
	 */
	T visitConstraint(Constraint constraint);
}
