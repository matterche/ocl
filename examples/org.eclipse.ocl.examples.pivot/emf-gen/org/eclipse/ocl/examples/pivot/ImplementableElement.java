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
 * $Id: ImplementableElement.java,v 1.1.2.4 2010/12/08 10:25:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.ocl.examples.pivot.evaluation.CallableImplementation;
import org.eclipse.ocl.examples.pivot.utilities.PivotObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.ImplementableElement#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.ImplementableElement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getImplementableElement()
 * @model interface="true" abstract="true"
 * @extends PivotObject
 * @generated
 */
public interface ImplementableElement
		extends PivotObject {

	/**
	 * Returns the value of the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Class</em>' attribute.
	 * @see #setImplementationClass(String)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getImplementableElement_ImplementationClass()
	 * @model dataType="org.eclipse.ocl.examples.pivot.String" ordered="false"
	 * @generated
	 */
	String getImplementationClass();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.ImplementableElement#getImplementationClass <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class</em>' attribute.
	 * @see #getImplementationClass()
	 * @generated
	 */
	void setImplementationClass(String value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(CallableImplementation)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getImplementableElement_Implementation()
	 * @model dataType="org.eclipse.ocl.examples.pivot.CallableImplementation" transient="true" ordered="false"
	 * @generated
	 */
	CallableImplementation getImplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.ImplementableElement#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(CallableImplementation value);

} // ImplementableElement