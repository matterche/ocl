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
 * $Id: ParameterizedTypeRefCS.java,v 1.2.6.1 2010/10/01 14:13:01 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.base.baseCST;

import org.eclipse.ocl.examples.pivot.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Type Ref CS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getParameterizedTypeRefCS()
 * @model abstract="true"
 * @generated
 */
public interface ParameterizedTypeRefCS extends TypedRefCS, TemplateBindableElementCS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Type getType();

} // ParameterizedTypeRefCS
