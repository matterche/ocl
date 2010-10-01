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
 * $Id: EnumerationLiteral.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An enumeration literal is a value of an enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends NamedElement
{
  /**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.pivot.Enumeration#getOwnedLiterals <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Enumeration that this EnumerationLiteral is a member of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getEnumerationLiteral_Enumeration()
	 * @see org.eclipse.ocl.examples.pivot.Enumeration#getOwnedLiterals
	 * @model opposite="ownedLiteral" transient="false" ordered="false"
	 * @generated
	 */
  Enumeration getEnumeration();

  /**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
  void setEnumeration(Enumeration value);

} // EnumerationLiteral
