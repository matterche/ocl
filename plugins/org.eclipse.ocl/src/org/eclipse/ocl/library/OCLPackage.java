/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLPackage.java,v 1.1.2.2 2009/12/14 21:59:08 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Package</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLPackage#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLPackage#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackage()
 * @model
 * @generated
 */
public interface OCLPackage extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackage_Extends()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLPackage> getExtends();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackage_Type()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OCLType> getType();

} // OCLPackage
