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
 * $Id: LoopExp.java,v 1.1.2.1 2010/10/01 13:49:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.LoopExp#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.LoopExp#getIterators <em>Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getLoopExp()
 * @model abstract="true"
 * @generated
 */
public interface LoopExp extends CallExp
{
  /**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getLoopExp_Body()
	 * @model containment="true" resolveProxies="true" required="true" ordered="false"
	 * @generated
	 */
  OclExpression getBody();

  /**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.LoopExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
  void setBody(OclExpression value);

  /**
	 * Creates a new {@link org.eclipse.ocl.examples.pivot.OclExpression} and sets the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.ocl.examples.pivot.OclExpression} to create.
	 * @return The new {@link org.eclipse.ocl.examples.pivot.OclExpression}.
	 * @see #getBody()
	 * @generated
	 */
  OclExpression createBody(EClass eClass);

  /**
	 * Creates a new {@link org.eclipse.ocl.examples.pivot.OclExpression} and sets the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.ocl.examples.pivot.OclExpression}.
	 * @see #getBody()
	 * @generated
	 */
	OclExpression createBody();

/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.Variable}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterator</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getLoopExp_Iterator()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
  EList<Variable> getIterators();

  /**
	 * Creates a new {@link org.eclipse.ocl.examples.pivot.Variable} and appends it to the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.ocl.examples.pivot.Variable}.
	 * @see #getIterators()
	 * @generated
	 */
  Variable createIterator();

} // LoopExp
