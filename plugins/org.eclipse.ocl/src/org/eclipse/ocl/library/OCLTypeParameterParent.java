/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLTypeParameterParent.java,v 1.1.2.2 2010/01/30 20:15:35 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Type Parameter Parent</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLTypeParameterParent#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeParameterParent()
 * @model abstract="true"
 * @generated
 */
public interface OCLTypeParameterParent extends OCLNamedElement {
	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLTypeParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLTypeParameter#getTypeParameterParent <em>Type Parameter Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameter</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLTypeParameterParent_TypeParameter()
	 * @see org.eclipse.ocl.library.OCLTypeParameter#getTypeParameterParent
	 * @model opposite="typeParameterParent" containment="true"
	 * @generated
	 */
	EList<OCLTypeParameter> getTypeParameter();

} // OCLTypeParameterParent
