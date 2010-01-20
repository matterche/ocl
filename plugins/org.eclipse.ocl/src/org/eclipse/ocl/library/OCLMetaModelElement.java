/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMetaModelElement.java,v 1.1.2.1 2010/01/20 09:09:33 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Meta Model Element</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLMetaModelElement#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLMetaModelElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OCLMetaModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Element</em>' reference.
	 * @see #setMetaModelElement(EObject)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLMetaModelElement_MetaModelElement()
	 * @model
	 * @generated
	 */
	EObject getMetaModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLMetaModelElement#getMetaModelElement <em>Meta Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Element</em>' reference.
	 * @see #getMetaModelElement()
	 * @generated
	 */
	void setMetaModelElement(EObject value);

} // OCLMetaModelElement
