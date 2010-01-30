/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLBoundCollectionType.java,v 1.1.2.1 2010/01/30 07:49:34 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Bound Collection Type</b></em>'.
	 * @since 3.0
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getOCLBoundCollectionType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NotMoreThanOneTypeParameter'"
 * @generated
 */
public interface OCLBoundCollectionType extends OCLBoundType, OCLNamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OCLType getElementType();

} // OCLBoundCollectionType
