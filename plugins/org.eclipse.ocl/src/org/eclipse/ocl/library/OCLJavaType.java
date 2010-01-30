/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLJavaType.java,v 1.1.2.1 2010/01/30 07:49:22 ewillink Exp $
 */
package org.eclipse.ocl.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Java Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLJavaType#getJavaClass <em>Java Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLJavaType()
 * @model
 * @generated
 */
public interface OCLJavaType extends OCLConcreteType {
	/**
	 * Returns the value of the '<em><b>Java Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Class</em>' attribute.
	 * @see #setJavaClass(Class)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLJavaType_JavaClass()
	 * @model
	 * @generated
	 */
	Class<?> getJavaClass();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLJavaType#getJavaClass <em>Java Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Class</em>' attribute.
	 * @see #getJavaClass()
	 * @generated
	 */
	void setJavaClass(Class<?> value);

} // OCLJavaType
