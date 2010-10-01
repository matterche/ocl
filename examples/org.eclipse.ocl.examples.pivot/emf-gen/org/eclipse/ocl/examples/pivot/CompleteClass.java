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
 * $Id: CompleteClass.java,v 1.1.2.1 2010/10/01 13:49:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getOperations <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.CompleteClass#getProperties <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass()
 * @model
 * @generated
 */
public interface CompleteClass extends org.eclipse.ocl.examples.pivot.Class
{
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_Model()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	org.eclipse.ocl.examples.pivot.Class getModel();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_Operation()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCompleteClass_Property()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

} // CompleteClass
