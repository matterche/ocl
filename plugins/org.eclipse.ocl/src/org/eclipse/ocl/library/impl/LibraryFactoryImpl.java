/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactoryImpl.java,v 1.1.2.9 2010/01/24 07:41:14 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBagType;
import org.eclipse.ocl.library.OCLCollectionType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLNonOrderedCollectionType;
import org.eclipse.ocl.library.OCLNonUniqueCollectionType;
import org.eclipse.ocl.library.OCLOrderedCollectionType;
import org.eclipse.ocl.library.OCLOrderedSetType;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLSequenceType;
import org.eclipse.ocl.library.OCLSetType;
import org.eclipse.ocl.library.OCLTemplateParameterType;
import org.eclipse.ocl.library.OCLTupleType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLUniqueCollectionType;
import org.eclipse.ocl.library.OCLVoidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * @since 3.0
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryFactoryImpl extends EFactoryImpl implements LibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LibraryFactory init() {
		try {
			LibraryFactory theLibraryFactory = (LibraryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/ocl/3.0.0/OCL/Library"); //$NON-NLS-1$ 
			if (theLibraryFactory != null) {
				return theLibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LibraryPackage.OCL_LIBRARY: return createOCLLibrary();
			case LibraryPackage.OCL_ANY_TYPE: return createOCLAnyType();
			case LibraryPackage.OCL_BAG_TYPE: return createOCLBagType();
			case LibraryPackage.OCL_COLLECTION_TYPE: return createOCLCollectionType();
			case LibraryPackage.OCL_INVALID_TYPE: return createOCLInvalidType();
			case LibraryPackage.OCL_LIBRARY_OPERATION: return createOCLLibraryOperation();
			case LibraryPackage.OCL_LIBRARY_PROPERTY: return createOCLLibraryProperty();
			case LibraryPackage.OCL_NON_ORDERED_COLLECTION_TYPE: return createOCLNonOrderedCollectionType();
			case LibraryPackage.OCL_NON_UNIQUE_COLLECTION_TYPE: return createOCLNonUniqueCollectionType();
			case LibraryPackage.OCL_ORDERED_COLLECTION_TYPE: return createOCLOrderedCollectionType();
			case LibraryPackage.OCL_ORDERED_SET_TYPE: return createOCLOrderedSetType();
			case LibraryPackage.OCL_PACKAGE: return createOCLPackage();
			case LibraryPackage.OCL_PARAMETER: return createOCLParameter();
			case LibraryPackage.OCL_TEMPLATE_PARAMETER_TYPE: return createOCLTemplateParameterType();
			case LibraryPackage.OCL_ROOT: return createOCLRoot();
			case LibraryPackage.OCL_SEQUENCE_TYPE: return createOCLSequenceType();
			case LibraryPackage.OCL_SET_TYPE: return createOCLSetType();
			case LibraryPackage.OCL_TUPLE_TYPE: return createOCLTupleType();
			case LibraryPackage.OCL_TYPE: return createOCLType();
			case LibraryPackage.OCL_UNIQUE_COLLECTION_TYPE: return createOCLUniqueCollectionType();
			case LibraryPackage.OCL_VOID_TYPE: return createOCLVoidType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLLibrary createOCLLibrary() {
		OCLLibraryImpl oclLibrary = new OCLLibraryImpl();
		return oclLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLAnyType createOCLAnyType() {
		OCLAnyTypeImpl oclAnyType = new OCLAnyTypeImpl();
		return oclAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLBagType createOCLBagType() {
		OCLBagTypeImpl oclBagType = new OCLBagTypeImpl();
		return oclBagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLCollectionType createOCLCollectionType() {
		OCLCollectionTypeImpl oclCollectionType = new OCLCollectionTypeImpl();
		return oclCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLInvalidType createOCLInvalidType() {
		OCLInvalidTypeImpl oclInvalidType = new OCLInvalidTypeImpl();
		return oclInvalidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLLibraryOperation createOCLLibraryOperation() {
		OCLLibraryOperationImpl oclLibraryOperation = new OCLLibraryOperationImpl();
		return oclLibraryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLLibraryProperty createOCLLibraryProperty() {
		OCLLibraryPropertyImpl oclLibraryProperty = new OCLLibraryPropertyImpl();
		return oclLibraryProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLNonOrderedCollectionType createOCLNonOrderedCollectionType() {
		OCLNonOrderedCollectionTypeImpl oclNonOrderedCollectionType = new OCLNonOrderedCollectionTypeImpl();
		return oclNonOrderedCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLNonUniqueCollectionType createOCLNonUniqueCollectionType() {
		OCLNonUniqueCollectionTypeImpl oclNonUniqueCollectionType = new OCLNonUniqueCollectionTypeImpl();
		return oclNonUniqueCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLOrderedCollectionType createOCLOrderedCollectionType() {
		OCLOrderedCollectionTypeImpl oclOrderedCollectionType = new OCLOrderedCollectionTypeImpl();
		return oclOrderedCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLOrderedSetType createOCLOrderedSetType() {
		OCLOrderedSetTypeImpl oclOrderedSetType = new OCLOrderedSetTypeImpl();
		return oclOrderedSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLPackage createOCLPackage() {
		OCLPackageImpl oclPackage = new OCLPackageImpl();
		return oclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLParameter createOCLParameter() {
		OCLParameterImpl oclParameter = new OCLParameterImpl();
		return oclParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTemplateParameterType createOCLTemplateParameterType() {
		OCLTemplateParameterTypeImpl oclTemplateParameterType = new OCLTemplateParameterTypeImpl();
		return oclTemplateParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLRoot createOCLRoot() {
		OCLRootImpl oclRoot = new OCLRootImpl();
		return oclRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTupleType createOCLTupleType() {
		OCLTupleTypeImpl oclTupleType = new OCLTupleTypeImpl();
		return oclTupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLType createOCLType() {
		OCLTypeImpl oclType = new OCLTypeImpl();
		return oclType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLUniqueCollectionType createOCLUniqueCollectionType() {
		OCLUniqueCollectionTypeImpl oclUniqueCollectionType = new OCLUniqueCollectionTypeImpl();
		return oclUniqueCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLVoidType createOCLVoidType() {
		OCLVoidTypeImpl oclVoidType = new OCLVoidTypeImpl();
		return oclVoidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryPackage getLibraryPackage() {
		return (LibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLSequenceType createOCLSequenceType() {
		OCLSequenceTypeImpl oclSequenceType = new OCLSequenceTypeImpl();
		return oclSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLSetType createOCLSetType() {
		OCLSetTypeImpl oclSetType = new OCLSetTypeImpl();
		return oclSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LibraryPackage getPackage() {
		return LibraryPackage.eINSTANCE;
	}

} //OCLLibraryFactoryImpl
