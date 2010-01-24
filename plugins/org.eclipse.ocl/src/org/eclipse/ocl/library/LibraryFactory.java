/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactory.java,v 1.1.2.8 2010/01/24 07:40:54 ewillink Exp $
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
	 * Returns a new object of class '<em>OCL Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library</em>'.
	 * @generated
	 */
	OCLLibrary createOCLLibrary();

	/**
	 * Returns a new object of class '<em>OCL Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Any Type</em>'.
	 * @generated
	 */
	OCLAnyType createOCLAnyType();

	/**
	 * Returns a new object of class '<em>OCL Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Bag Type</em>'.
	 * @generated
	 */
	OCLBagType createOCLBagType();

	/**
	 * Returns a new object of class '<em>OCL Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Collection Type</em>'.
	 * @generated
	 */
	OCLCollectionType createOCLCollectionType();

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
	 * Returns a new object of class '<em>OCL Library Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Library Property</em>'.
	 * @generated
	 */
	OCLLibraryProperty createOCLLibraryProperty();

	/**
	 * Returns a new object of class '<em>OCL Non Ordered Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Non Ordered Collection Type</em>'.
	 * @generated
	 */
	OCLNonOrderedCollectionType createOCLNonOrderedCollectionType();

	/**
	 * Returns a new object of class '<em>OCL Non Unique Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Non Unique Collection Type</em>'.
	 * @generated
	 */
	OCLNonUniqueCollectionType createOCLNonUniqueCollectionType();

	/**
	 * Returns a new object of class '<em>OCL Ordered Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Ordered Collection Type</em>'.
	 * @generated
	 */
	OCLOrderedCollectionType createOCLOrderedCollectionType();

	/**
	 * Returns a new object of class '<em>OCL Ordered Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Ordered Set Type</em>'.
	 * @generated
	 */
	OCLOrderedSetType createOCLOrderedSetType();

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
	 * Returns a new object of class '<em>OCL Template Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Template Parameter Type</em>'.
	 * @generated
	 */
	OCLTemplateParameterType createOCLTemplateParameterType();

	/**
	 * Returns a new object of class '<em>OCL Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Root</em>'.
	 * @generated
	 */
	OCLRoot createOCLRoot();

	/**
	 * Returns a new object of class '<em>OCL Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Tuple Type</em>'.
	 * @generated
	 */
	OCLTupleType createOCLTupleType();

	/**
	 * Returns a new object of class '<em>OCL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Type</em>'.
	 * @generated
	 */
	OCLType createOCLType();

	/**
	 * Returns a new object of class '<em>OCL Unique Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Unique Collection Type</em>'.
	 * @generated
	 */
	OCLUniqueCollectionType createOCLUniqueCollectionType();

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

	/**
	 * Returns a new object of class '<em>OCL Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Sequence Type</em>'.
	 * @generated
	 */
	OCLSequenceType createOCLSequenceType();

	/**
	 * Returns a new object of class '<em>OCL Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCL Set Type</em>'.
	 * @generated
	 */
	OCLSetType createOCLSetType();

} //OCLLibraryFactory
