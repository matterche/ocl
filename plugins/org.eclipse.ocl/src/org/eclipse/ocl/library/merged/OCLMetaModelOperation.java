/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMetaModelOperation.java,v 1.1.2.1 2010/01/30 07:49:36 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.OCLOperation;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Meta Model Operation</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.OCLMetaModelOperation#getMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLMetaModelOperation()
 * @model abstract="true"
 * @generated
 */
public interface OCLMetaModelOperation extends OCLOperation {

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
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLMetaModelOperation_MetaModelElement()
	 * @model
	 * @generated
	 */
	EObject getMetaModelElement();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.OCLMetaModelOperation#getMetaModelElement <em>Meta Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Element</em>' reference.
	 * @see #getMetaModelElement()
	 * @generated
	 */
	void setMetaModelElement(EObject value);
} // OCLMetaModelOperation
