/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLEnumerationLiteral.java,v 1.1.2.1 2010/01/30 07:49:34 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.OCLNamedElement;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Enumeration Literal</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLEnumerationLiteral()
 * @model abstract="true"
 * @generated
 */
public interface OCLEnumerationLiteral extends OCLNamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.merged.OCLEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLEnumeration)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLEnumerationLiteral_Container()
	 * @see org.eclipse.ocl.library.merged.OCLEnumeration#getLiterals
	 * @model opposite="literals" transient="false"
	 * @generated
	 */
	OCLEnumeration getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getContainer <em>Container</em>}' container reference.
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
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLEnumerationLiteral_MetaModelElement()
	 * @model
	 * @generated
	 */
	EObject getMetaModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getMetaModelElement <em>Meta Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Element</em>' reference.
	 * @see #getMetaModelElement()
	 * @generated
	 */
	void setMetaModelElement(EObject value);

} // OCLEnumerationLiteral
