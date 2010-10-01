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
 * $Id: IteratorExp.java,v 1.1.2.1 2010/10/01 13:49:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.IteratorExp#getReferredIterator <em>Referred Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getIteratorExp()
 * @model
 * @generated
 */
public interface IteratorExp extends LoopExp
{

	/**
	 * Returns the value of the '<em><b>Referred Iterator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Iterator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Iterator</em>' reference.
	 * @see #setReferredIterator(Iterator)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getIteratorExp_ReferredIterator()
	 * @model ordered="false"
	 * @generated
	 */
	Iterator getReferredIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.IteratorExp#getReferredIterator <em>Referred Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Iterator</em>' reference.
	 * @see #getReferredIterator()
	 * @generated
	 */
	void setReferredIterator(Iterator value);
} // IteratorExp
