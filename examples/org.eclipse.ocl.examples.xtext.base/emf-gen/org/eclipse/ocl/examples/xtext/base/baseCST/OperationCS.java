/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: OperationCS.java,v 1.3.6.1 2010/10/01 14:13:02 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.base.baseCST;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS#getOwnedIterator <em>Owned Iterator</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS#getOwnedAccumulator <em>Owned Accumulator</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS#getOwnedException <em>Owned Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getOperationCS()
 * @model
 * @generated
 */
public interface OperationCS extends FeatureCS, TemplateableElementCS {
	/**
	 * Returns the value of the '<em><b>Owned Iterator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Iterator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Iterator</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getOperationCS_OwnedIterator()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterCS> getOwnedIterator();

	/**
	 * Returns the value of the '<em><b>Owned Accumulator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Accumulator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Accumulator</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getOperationCS_OwnedAccumulator()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterCS> getOwnedAccumulator();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getOperationCS_OwnedParameter()
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<ParameterCS> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Owned Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exception</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getOperationCS_OwnedException()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypedRefCS> getOwnedException();

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class</em>' container reference.
	 * @see #setOwningClass(ClassCS)
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getOperationCS_OwningClass()
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false"
	 * @generated
	 */
	ClassCS getOwningClass();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS#getOwningClass <em>Owning Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' container reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(ClassCS value);

} // OperationCS
