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
 * $Id: TupleLiteralPart.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.TupleLiteralPart#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getTupleLiteralPart()
 * @model
 * @generated
 */
public interface TupleLiteralPart extends TypedElement
{
  /**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(Property)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getTupleLiteralPart_Attribute()
	 * @model containment="true" resolveProxies="true" ordered="false"
	 * @generated
	 */
  Property getAttribute();

  /**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.TupleLiteralPart#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
  void setAttribute(Property value);

  /**
	 * Creates a new {@link org.eclipse.ocl.examples.pivot.Property} and sets the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.ocl.examples.pivot.Property} to create.
	 * @return The new {@link org.eclipse.ocl.examples.pivot.Property}.
	 * @see #getAttribute()
	 * @generated
	 */
  Property createAttribute(EClass eClass);

  /**
	 * Creates a new {@link org.eclipse.ocl.examples.pivot.Property} and sets the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.ocl.examples.pivot.Property}.
	 * @see #getAttribute()
	 * @generated
	 */
  Property createAttribute();

} // TupleLiteralPart
