/**
 * <copyright>
 * </copyright>
 *
 * $Id: MergedLibraryIteration.java,v 1.1.2.1 2010/01/31 22:23:42 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.ocl.library.OCLLibraryIteration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Library Iteration</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.merged.MergedLibraryIteration#getIteration <em>Iteration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibraryIteration()
 * @model
 * @generated
 */
public interface MergedLibraryIteration extends MergedIteration {
	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' reference.
	 * @see #isSetIteration()
	 * @see #unsetIteration()
	 * @see #setIteration(OCLLibraryIteration)
	 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage#getMergedLibraryIteration_Iteration()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	OCLLibraryIteration getIteration();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryIteration#getIteration <em>Iteration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' reference.
	 * @see #isSetIteration()
	 * @see #unsetIteration()
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(OCLLibraryIteration value);

	/**
	 * Unsets the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryIteration#getIteration <em>Iteration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIteration()
	 * @see #getIteration()
	 * @see #setIteration(OCLLibraryIteration)
	 * @generated
	 */
	void unsetIteration();

	/**
	 * Returns whether the value of the '{@link org.eclipse.ocl.library.merged.MergedLibraryIteration#getIteration <em>Iteration</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Iteration</em>' reference is set.
	 * @see #unsetIteration()
	 * @see #getIteration()
	 * @see #setIteration(OCLLibraryIteration)
	 * @generated
	 */
	boolean isSetIteration();

} // MergedLibraryIteration
