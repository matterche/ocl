/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedLibraryOperation.java,v 1.1.2.1 2010/01/24 07:41:03 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.library.OCLLibraryOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Operation Reference</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedLibraryOperation#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibraryOperation()
 * @model
 * @generated
 */
public interface MergedLibraryOperation extends MergedOperation {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #setOperation(OCLLibraryOperation)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibraryOperation_Operation()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	OCLLibraryOperation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OCLLibraryOperation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperation()
	 * @see #getOperation()
	 * @see #setOperation(OCLLibraryOperation)
	 * @generated
	 */
	void unsetOperation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryOperation#getOperation <em>Operation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation</em>' reference is set.
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @see #setOperation(OCLLibraryOperation)
	 * @generated
	 */
	boolean isSetOperation();

} // MergedOperationReference
