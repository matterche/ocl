/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: Feature.java,v 1.4 2011/02/15 19:58:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.ocl.examples.domain.library.LibraryFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.Feature#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.pivot.Feature#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature
		extends TypedMultiplicityElement {

	/**
	 * Returns the value of the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Class</em>' attribute.
	 * @see #setImplementationClass(String)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getFeature_ImplementationClass()
	 * @model dataType="org.eclipse.ocl.examples.pivot.String" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementationClass'"
	 * @generated
	 */
	String getImplementationClass();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.Feature#getImplementationClass <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class</em>' attribute.
	 * @see #getImplementationClass()
	 * @generated
	 */
	void setImplementationClass(String value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(LibraryFeature)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getFeature_Implementation()
	 * @model dataType="org.eclipse.ocl.examples.pivot.LibraryFeature" transient="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/3.1.0/Pivot!Feature!implementation'"
	 * @generated
	 */
	LibraryFeature getImplementation();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.Feature#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(LibraryFeature value);

} // Feature
