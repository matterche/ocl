/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeParameter.java,v 1.1.2.2 2010/01/30 20:15:35 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Type Parameter</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLTypeParameter#getTypeParameterParent <em>Type Parameter Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeParameter()
 * @model
 * @generated
 */
public interface OCLTypeParameter extends OCLTypeValue, OCLNamedElement {

	/**
	 * Returns the value of the '<em><b>Type Parameter Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLTypeParameterParent#getTypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameter Parent</em>' container reference.
	 * @see #setTypeParameterParent(OCLTypeParameterParent)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeParameter_TypeParameterParent()
	 * @see org.eclipse.ocl.library.OCLTypeParameterParent#getTypeParameter
	 * @model opposite="typeParameter" transient="false"
	 * @generated
	 */
	OCLTypeParameterParent getTypeParameterParent();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLTypeParameter#getTypeParameterParent <em>Type Parameter Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameter Parent</em>' container reference.
	 * @see #getTypeParameterParent()
	 * @generated
	 */
	void setTypeParameterParent(OCLTypeParameterParent value);
} // OCLTypeParameter
