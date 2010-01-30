/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLEnumeration.java,v 1.1.2.1 2010/01/30 07:49:33 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.OCLConcreteType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Enumeration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.OCLEnumeration#getMetaModelElement <em>Meta Model Element</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.merged.OCLEnumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLEnumeration()
 * @model abstract="true"
 * @generated
 */
public interface OCLEnumeration extends OCLConcreteType {
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
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLEnumeration_MetaModelElement()
	 * @model
	 * @generated
	 */
	EObject getMetaModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.OCLEnumeration#getMetaModelElement <em>Meta Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Element</em>' reference.
	 * @see #getMetaModelElement()
	 * @generated
	 */
	void setMetaModelElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLEnumeration_Literals()
	 * @see org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<OCLEnumerationLiteral> getLiterals();

} // OCLEnumeration
