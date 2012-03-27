/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST;

import org.eclipse.ocl.examples.pivot.util.MorePivotable;

import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedNamedElementRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element Decl CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.NamedElementDeclCS#getQualifiedElementRef <em>Qualified Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage#getNamedElementDeclCS()
 * @model abstract="true" superTypes="org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS org.eclipse.ocl.examples.pivot.MorePivotable"
 * @generated
 */
public interface NamedElementDeclCS extends ModelElementCS, MorePivotable
{
	/**
	 * Returns the value of the '<em><b>Qualified Element Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Element Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Element Ref</em>' containment reference.
	 * @see #setQualifiedElementRef(QualifiedNamedElementRefCS)
	 * @see org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage#getNamedElementDeclCS_QualifiedElementRef()
	 * @model containment="true"
	 * @generated
	 */
	QualifiedNamedElementRefCS getQualifiedElementRef();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.NamedElementDeclCS#getQualifiedElementRef <em>Qualified Element Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Element Ref</em>' containment reference.
	 * @see #getQualifiedElementRef()
	 * @generated
	 */
	void setQualifiedElementRef(QualifiedNamedElementRefCS value);

} // NamedElementDeclCS
