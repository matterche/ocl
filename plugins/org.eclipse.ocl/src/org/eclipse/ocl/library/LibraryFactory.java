/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactory.java,v 1.1.2.10 2010/01/31 22:23:43 ewillink Exp $
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
	 * Returns a new object of class '<em>OCL Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Any Type</em>'.
	 * @generated
	 */
	OCLAnyType createOCLAnyType();

	/**
	 * Returns a new object of class '<em>OCL Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library</em>'.
	 * @generated
	 */
	OCLLibrary createOCLLibrary();

	/**
	 * Returns a new object of class '<em>OCL Library Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library Iteration</em>'.
	 * @generated
	 */
	OCLLibraryIteration createOCLLibraryIteration();

	/**
	 * Returns a new object of class '<em>OCL Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Bound Type</em>'.
	 * @generated
	 */
	OCLBoundType createOCLBoundType();

	/**
	 * Returns a new object of class '<em>OCL Concrete Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Concrete Type</em>'.
	 * @generated
	 */
	OCLConcreteType createOCLConcreteType();

	/**
	 * Returns a new object of class '<em>OCL Deprecated Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Deprecated Type</em>'.
	 * @generated
	 */
	OCLDeprecatedType createOCLDeprecatedType();

	/**
	 * Returns a new object of class '<em>OCL Invalid Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Invalid Type</em>'.
	 * @generated
	 */
	OCLInvalidType createOCLInvalidType();

	/**
	 * Returns a new object of class '<em>OCL Java Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Java Type</em>'.
	 * @generated
	 */
	OCLJavaType createOCLJavaType();

	/**
	 * Returns a new object of class '<em>OCL Library Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library Operation</em>'.
	 * @generated
	 */
	OCLLibraryOperation createOCLLibraryOperation();

	/**
	 * Returns a new object of class '<em>OCL Library Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library Property</em>'.
	 * @generated
	 */
	OCLLibraryProperty createOCLLibraryProperty();

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
	 * Returns a new object of class '<em>OCL Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Root</em>'.
	 * @generated
	 */
	OCLRoot createOCLRoot();

	/**
	 * Returns a new object of class '<em>OCL Type Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Type Binding</em>'.
	 * @generated
	 */
	OCLTypeBinding createOCLTypeBinding();

	/**
	 * Returns a new object of class '<em>OCL Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Type Parameter</em>'.
	 * @generated
	 */
	OCLTypeParameter createOCLTypeParameter();

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

} //OCLLibraryFactory
