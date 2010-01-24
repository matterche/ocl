/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLEnumerationLiteral.java,v 1.1.2.3 2010/01/24 07:40:54 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.ecore.EObject;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Enumeration Literal</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLEnumerationLiteral()
 * @model abstract="true"
 * @generated
 */
public interface OCLEnumerationLiteral extends OCLNamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLEnumeration)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLEnumerationLiteral_Container()
	 * @see org.eclipse.ocl.library.OCLEnumeration#getLiterals
	 * @model opposite="literals" transient="false"
	 * @generated
	 */
	OCLEnumeration getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLEnumeration value);

	/**
	 * Returns the value of the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Element</em>' reference.
	 * @see #setMetaModelElement(EObject)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLEnumerationLiteral_MetaModelElement()
	 * @model
	 * @generated
	 */
	EObject getMetaModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getMetaModelElement <em>Meta Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Element</em>' reference.
	 * @see #getMetaModelElement()
	 * @generated
	 */
	void setMetaModelElement(EObject value);

} // OCLEnumerationLiteral
