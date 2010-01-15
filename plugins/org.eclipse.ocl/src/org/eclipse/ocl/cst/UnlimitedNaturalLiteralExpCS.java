/**
 * <copyright>
 * 
 * Copyright (c) 2005, 2008 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 243976
 *
 * </copyright>
 *
 * $Id: UnlimitedNaturalLiteralExpCS.java,v 1.3.10.2 2010/01/15 17:27:38 ewillink Exp $
 */
package org.eclipse.ocl.cst;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlimited Natural Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.cst.UnlimitedNaturalLiteralExpCS#getUnlimitedNaturalSymbol <em>Unlimited Natural Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.cst.CSTPackage#getUnlimitedNaturalLiteralExpCS()
 * @model
 * @generated
 */
public interface UnlimitedNaturalLiteralExpCS
		extends PrimitiveLiteralExpCS {

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
	 * @see org.eclipse.ocl.cst.CSTPackage#getUnlimitedNaturalLiteralExpCS_UnlimitedNaturalSymbol()
	 * @model
	 * @generated
	 */
	BigInteger getUnlimitedNaturalSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.cst.UnlimitedNaturalLiteralExpCS#getUnlimitedNaturalSymbol <em>Unlimited Natural Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlimited Natural Symbol</em>' attribute.
	 * @see #getUnlimitedNaturalSymbol()
	 * @generated
	 */
	void setUnlimitedNaturalSymbol(BigInteger value);

} // UnlimitedNaturalLiteralExpCS
