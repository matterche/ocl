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
 * $Id: PreExpCS.java,v 1.1.2.1 2010/10/01 15:03:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NamedExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreExpCS#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage#getPreExpCS()
 * @model
 * @generated
 */
public interface PreExpCS extends NamedExpCS
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NamedExpCS)
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage#getPreExpCS_Name()
	 * @model containment="true"
	 * @generated
	 */
	NamedExpCS getName();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreExpCS#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NamedExpCS value);

} // PreExpCS
