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
package org.eclipse.ocl.examples.xtext.base.baseCST;

import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.util.Pivotable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Named Element Ref CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getSimpleNamedElementRefCS()
 * @model superTypes="org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS org.eclipse.ocl.examples.pivot.Pivotable"
 * @generated
 */
public interface SimpleNamedElementRefCS extends ElementCS, Pivotable
{
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' container reference.
	 * @see #setQualifiedName(PathNameCS)
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getSimpleNamedElementRefCS_QualifiedName()
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS#getPath
	 * @model opposite="path" required="true" transient="false"
	 * @generated
	 */
	PathNameCS getQualifiedName();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS#getQualifiedName <em>Qualified Name</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' container reference.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(PathNameCS value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(NamedElement)
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getSimpleNamedElementRefCS_Element()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(NamedElement value);

} // SimpleNamedElementRefCS
