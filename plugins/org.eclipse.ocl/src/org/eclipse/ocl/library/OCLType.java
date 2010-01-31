/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLType.java,v 1.1.2.7 2010/01/31 22:23:43 ewillink Exp $
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
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.library.LibraryPackage#getOCLType()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EachConformsTypeIsBound'"
 * @generated
 */
public interface OCLType extends OCLTypeValue {
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
	EList<OCLIteration> getIteration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLIteration getIteration(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLOperation> getOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parameterTypesMany="true"
	 * @generated
	 */
	EList<OCLOperation> getOperations(String name, EList<OCLType> parameterTypes, OCLType contextType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLProperty> getProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLProperty getProperty(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLTypeBinding> getTypeBinding();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	OCLTypeBinding getTypeBinding(OCLTypeParameter typeParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<OCLTypeParameter> getTypeParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isUnique();

} // OCLType
