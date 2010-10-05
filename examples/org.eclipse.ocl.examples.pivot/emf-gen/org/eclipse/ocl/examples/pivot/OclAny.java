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
 * $Id: OclAny.java,v 1.1.2.2 2010/10/05 17:39:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.ocl.examples.pivot.utilities.PivotObject;
import org.eclipse.ocl.examples.pivot.utilities.Visitable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Any</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getOclAny()
 * @model abstract="true" superTypes="org.eclipse.ocl.examples.pivot._"
 * @extends PivotObject
 * @generated
 */
public interface OclAny
		extends PivotObject, Visitable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.ocl.examples.pivot.Class oclType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean oclIsInvalid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean oclIsUndefined();

} // OclAny
