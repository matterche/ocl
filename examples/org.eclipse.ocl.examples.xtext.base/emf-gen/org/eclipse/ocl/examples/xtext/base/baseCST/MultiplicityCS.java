/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.base.baseCST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity CS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getMultiplicityCS()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MultiplicityCS extends ElementCS
{
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getLower();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getUpper();

} // MultiplicityCS
