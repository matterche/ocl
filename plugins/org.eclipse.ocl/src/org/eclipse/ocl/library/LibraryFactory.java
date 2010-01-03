/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactory.java,v 1.1.2.3 2010/01/03 22:53:47 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.LibraryPackage
 * @generated
 */
public interface LibraryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryFactory eINSTANCE = org.eclipse.ocl.library.impl.LibraryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OCL Constraint Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Constraint Operation</em>'.
	 * @generated
	 */
	OCLConstraintOperation createOCLConstraintOperation();

	/**
	 * Returns a new object of class '<em>OCL Constraint Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Constraint Property</em>'.
	 * @generated
	 */
	OCLConstraintProperty createOCLConstraintProperty();

	/**
	 * Returns a new object of class '<em>OCL Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Generic Type</em>'.
	 * @generated
	 */
	OCLGenericType createOCLGenericType();

	/**
	 * Returns a new object of class '<em>OCL Invalid Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Invalid Type</em>'.
	 * @generated
	 */
	OCLInvalidType createOCLInvalidType();

	/**
	 * Returns a new object of class '<em>OCL Library Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library Operation</em>'.
	 * @generated
	 */
	OCLLibraryOperation createOCLLibraryOperation();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	LibraryOperation createLibraryOperation();

	/**
	 * Returns a new object of class '<em>OCL Library Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library Property</em>'.
	 * @generated
	 */
	OCLLibraryProperty createOCLLibraryProperty();

	/**
	 * Returns a new object of class '<em>OCL Meta Model Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Meta Model Operation</em>'.
	 * @generated
	 */
	OCLMetaModelOperation createOCLMetaModelOperation();

	/**
	 * Returns a new object of class '<em>OCL Meta Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Meta Model Property</em>'.
	 * @generated
	 */
	OCLMetaModelProperty createOCLMetaModelProperty();

	/**
	 * Returns a new object of class '<em>OCL Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Package</em>'.
	 * @generated
	 */
	OCLPackage createOCLPackage();

	/**
	 * Returns a new object of class '<em>OCL Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Parameter</em>'.
	 * @generated
	 */
	OCLParameter createOCLParameter();

	/**
	 * Returns a new object of class '<em>OCL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Type</em>'.
	 * @generated
	 */
	OCLType createOCLType();

	/**
	 * Returns a new object of class '<em>OCL Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Void Type</em>'.
	 * @generated
	 */
	OCLVoidType createOCLVoidType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LibraryPackage getLibraryPackage();

} //LibraryFactory
