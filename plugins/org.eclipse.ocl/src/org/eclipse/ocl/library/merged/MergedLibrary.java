/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedLibrary.java,v 1.1.2.3 2010/01/30 07:49:35 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Library</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedLibrary#getBaseLibrary <em>Base Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibrary()
 * @model abstract="true"
 * @generated
 */
public interface MergedLibrary extends OCLNamedElement, OCLCache {
	/**
	 * Returns the value of the '<em><b>Base Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Library</em>' reference.
	 * @see #setBaseLibrary(OCLRoot)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibrary_BaseLibrary()
	 * @model
	 * @generated
	 */
	OCLRoot getBaseLibrary();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedLibrary#getBaseLibrary <em>Base Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Library</em>' reference.
	 * @see #getBaseLibrary()
	 * @generated
	 */
	void setBaseLibrary(OCLRoot value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLBoundCollectionType getBagType(OCLType elementType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLType getLibraryTypeOfType(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLType getLibraryTypeOfValue(Object value, Object staticType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLBoundCollectionType getOrderedSetType(OCLType elementType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLBoundCollectionType getSequenceType(OCLType elementType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLBoundCollectionType getSetType(OCLType elementType);
	
	MergedType getMergedType(OCLType superType);

	MergedOperation mergeOperation(OCLType ownerType, String name, OCLType returnType, String[] paramNames, OCLType[] paramTypes, String stereotype, ExpressionInOCL<?, ?> specification);

	MergedProperty mergeProperty(OCLType ownerType, String name, OCLType valueType, String stereotype, ExpressionInOCL<?, ?> specification);

} // MergedLibrary
