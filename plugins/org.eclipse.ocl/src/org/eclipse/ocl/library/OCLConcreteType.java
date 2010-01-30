/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLConcreteType.java,v 1.1.2.1 2010/01/30 07:49:18 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Type</b></em>'.
 * @since 3.0
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.library.OCLConcreteType#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLConcreteType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLConcreteType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLConcreteType#getBoundType <em>Bound Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConcreteType()
 * @model
 * @generated
 */
public interface OCLConcreteType extends OCLType, OCLTypeParameterParent {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLOperation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLOperation#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConcreteType_Operation()
	 * @see org.eclipse.ocl.library.OCLOperation#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<OCLOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConcreteType_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Bound Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLBoundType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Type</em>' containment reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConcreteType_BoundType()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLBoundType> getBoundType();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.ocl.library.OCLPackage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(OCLPackage)
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLConcreteType_Container()
	 * @see org.eclipse.ocl.library.OCLPackage#getType
	 * @model opposite="type" transient="false"
	 * @generated
	 */
	OCLPackage getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLConcreteType#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLPackage value);

} // OCLType
