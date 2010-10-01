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
 * $Id: Visitable.java,v 1.1.2.1 2010/10/01 13:49:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.ocl.examples.pivot.utilities.PivotObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visitable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getVisitable()
 * @model abstract="true"
 * @extends PivotObject
 * @generated
 */
public interface Visitable extends PivotObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" visitorRequired="true" visitorOrdered="false"
	 * @generated
	 */
	<T> T accept(Visitor visitor);

} // Visitable
