/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLPackage.java,v 1.1.2.5 2010/01/30 07:49:16 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLPackage#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLPackage#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackage()
 * @model
 * @generated
 */
public interface OCLPackage extends OCLPackageParent {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLConcreteType}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLConcreteType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackage_Type()
	 * @see org.eclipse.ocl.library.OCLConcreteType#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<OCLConcreteType> getType();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLPackageParent#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLPackageParent)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLPackage_Container()
	 * @see org.eclipse.ocl.library.OCLPackageParent#getPackage
	 * @model opposite="package" transient="false"
	 * @generated
	 */
	OCLPackageParent getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLPackage#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLPackageParent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLConcreteType getType(String name);

} //OCLLibraryPackage
