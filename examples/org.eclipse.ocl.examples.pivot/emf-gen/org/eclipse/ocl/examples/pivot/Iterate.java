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
 * $Id: Iterate.java,v 1.1.2.1 2010/10/01 13:49:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.Iterate#getOwnedAccumulators <em>Owned Accumulator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getIterate()
 * @model
 * @generated
 */
public interface Iterate extends Iterator
{
	/**
	 * Returns the value of the '<em><b>Owned Accumulator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Accumulator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Accumulator</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getIterate_OwnedAccumulator()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Parameter> getOwnedAccumulators();

	/**
	 * Creates a new {@link org.eclipse.ocl.examples.pivot.Parameter} and appends it to the '<em><b>Owned Accumulator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.ocl.examples.pivot.Parameter}.
	 * @see #getOwnedAccumulators()
	 * @generated
	 */
	Parameter createOwnedAccumulator();

} // Iterate
