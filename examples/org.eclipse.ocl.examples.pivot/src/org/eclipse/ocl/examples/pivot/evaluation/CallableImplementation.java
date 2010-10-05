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
 * $Id: CallableImplementation.java,v 1.1.2.1 2010/10/05 17:38:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.evaluation;

import org.eclipse.ocl.examples.pivot.CallExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getCallableImplementation()
 * @model interface="true" abstract="true"
 * @extends PivotObject
 * @generated NOT
 */
public interface CallableImplementation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.Object" required="true" ordered="false" contextRequired="true" contextOrdered="false" callRequired="true" callOrdered="false"
	 * @generated
	 */
	Object evaluate(EvaluationVisitor evaluationVisitor, Object sourceValue, CallExp call);

} // CallableImplementation
