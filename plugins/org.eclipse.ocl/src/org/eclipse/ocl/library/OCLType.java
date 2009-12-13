/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLType.java,v 1.1.2.1 2009/12/13 18:44:51 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLType#getConforms <em>Conforms</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLType#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType()
 * @model
 * @generated
 */
public interface OCLType extends OCLElement {
	/**
	 * Returns the value of the '<em><b>Conforms</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conforms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms</em>' reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType_Conforms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OCLType> getConforms();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType_Operation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OCLOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType_Property()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OCLProperty> getProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean conformsTo(OCLType type);

} // OCLType
