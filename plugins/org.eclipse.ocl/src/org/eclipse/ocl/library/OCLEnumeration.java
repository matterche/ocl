/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLEnumeration.java,v 1.1.2.2 2010/01/20 09:09:32 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Enumeration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLEnumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLEnumeration()
 * @model abstract="true"
 * @generated
 */
public interface OCLEnumeration extends OCLType, OCLMetaModelElement {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLEnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLEnumeration_Literals()
	 * @see org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<OCLEnumerationLiteral> getLiterals();

} // OCLEnumeration
