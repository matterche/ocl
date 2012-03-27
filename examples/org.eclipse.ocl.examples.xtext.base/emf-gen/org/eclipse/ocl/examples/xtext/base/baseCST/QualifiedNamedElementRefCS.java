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

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.util.Pivotable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Element Ref CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedNamedElementRefCS#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedNamedElementRefCS#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getQualifiedNamedElementRefCS()
 * @model superTypes="org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS org.eclipse.ocl.examples.pivot.Pivotable"
 * @generated
 */
public interface QualifiedNamedElementRefCS extends ElementCS, Pivotable
{
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getQualifiedNamedElementRefCS_Path()
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.SimpleNamedElementRefCS#getQualifiedName
	 * @model opposite="qualifiedName" containment="true" required="true"
	 * @generated
	 */
	EList<SimpleNamedElementRefCS> getPath();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage#getQualifiedNamedElementRefCS_Element()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	NamedElement getElement();

} // QualifiedElementRefCS
