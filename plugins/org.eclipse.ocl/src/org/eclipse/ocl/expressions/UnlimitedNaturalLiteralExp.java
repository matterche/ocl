/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 207365
 * 
 * </copyright>
 *
 * $Id: UnlimitedNaturalLiteralExp.java,v 1.7.10.2 2010/01/15 17:27:37 ewillink Exp $
 */
package org.eclipse.ocl.expressions;

import java.math.BigInteger;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlimited Natural Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp#getUnlimitedNaturalSymbol <em>Unlimited Natural Symbol</em>}</li>
 *   <li>{@link org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp#isUnlimited <em>Unlimited</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.expressions.ExpressionsPackage#getUnlimitedNaturalLiteralExp()
 * @model
 * @generated
 */
public interface UnlimitedNaturalLiteralExp<C>
		extends NumericLiteralExp<C> {

	/**
	 * Returns the value of the '<em><b>Unlimited Natural Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlimited Natural Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlimited Natural Symbol</em>' attribute.
	 * @see #setUnlimitedNaturalSymbol(BigInteger)
	 * @see org.eclipse.ocl.expressions.ExpressionsPackage#getUnlimitedNaturalLiteralExp_UnlimitedNaturalSymbol()
	 * @model
	 * @generated
	 */
	BigInteger getUnlimitedNaturalSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp#getUnlimitedNaturalSymbol <em>Unlimited Natural Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlimited Natural Symbol</em>' attribute.
	 * @see #getUnlimitedNaturalSymbol()
	 * @generated
	 */
	void setUnlimitedNaturalSymbol(BigInteger value);

	/** Java value denoting the OCL unlimited value. */
	BigInteger UNLIMITED = BigInteger.valueOf(-1);

	/**
	 * Returns the value of the '<em><b>Unlimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlimited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlimited</em>' attribute.
	 * @see org.eclipse.ocl.expressions.ExpressionsPackage#getUnlimitedNaturalLiteralExp_Unlimited()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isUnlimited();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.type.name = 'UnlimitedNatural'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean checkNaturalType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * @deprecated use setUnlimitedNaturalSymbol
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setIntegerSymbol(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @model valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	void setUnlimitedNaturalSymbol(Integer value);

} // UnlimitedNaturalLiteralExp
