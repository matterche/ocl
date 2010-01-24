/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLPackageParent.java,v 1.1.2.1 2010/01/24 07:40:57 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Package Parent</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLPackageParent#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackageParent()
 * @model abstract="true"
 * @generated
 */
public interface OCLPackageParent extends OCLNamedElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLPackage}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLPackage#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackageParent_Package()
	 * @see org.eclipse.ocl.library.OCLPackage#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<OCLPackage> getPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLPackage getPackage(String name);

} // LibraryPackageParent
