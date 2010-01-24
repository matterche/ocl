/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLLibrary.java,v 1.1.2.5 2010/01/24 07:40:57 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLLibrary#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLLibrary#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibrary()
 * @model
 * @generated
 */
public interface OCLLibrary extends OCLPackageParent {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibrary_Extends()
	 * @model
	 * @generated
	 */
	EList<OCLLibrary> getExtends();

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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLLibrary_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLType> getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.ocl.library.ILibraryOperation"
	 * @generated
	 */
	ILibraryOperation getLibraryOperation(Class<? extends ILibraryOperation> libraryOperationClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model libraryOperationDataType="org.eclipse.ocl.library.ILibraryOperation"
	 * @generated
	 */
	void putLibraryOperation(Class<? extends ILibraryOperation> libraryOperationClass, ILibraryOperation libraryOperation);

} // Library
