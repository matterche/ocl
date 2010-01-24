/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLType.java,v 1.1.2.5 2010/01/24 07:40:53 ewillink Exp $
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
 *   <li>{@link org.eclipse.ocl.library.OCLType#getConforms <em>Conforms</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLType#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ocl.library.OCLType#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType()
 * @model
 * @generated
 */
public interface OCLType extends OCLNamedElement {
	/**
	 * Returns the value of the '<em><b>Conforms</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.ocl.library.OCLType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conforms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms</em>' reference list.
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType_Conforms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OCLType> getConforms();

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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType_Operation()
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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<OCLProperty> getProperty();

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
	 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType_Container()
	 * @see org.eclipse.ocl.library.OCLPackage#getType
	 * @model opposite="type" transient="false"
	 * @generated
	 */
	OCLPackage getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.library.OCLType#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(OCLPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean conformsTo(OCLType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OCLType getNormalizedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterTypesMany="true"
	 * @generated
	 */
	EList<OCLOperation> getOperations(String name, EList<OCLType> parameterTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLType getTemplateBinding(OCLTemplateParameterType templateParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLTemplateParameterType> getTemplateParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLProperty getProperty(String name);

} // OCLType
