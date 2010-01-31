/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactoryImpl.java,v 1.1.2.12 2010/01/31 22:23:47 ewillink Exp $
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
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLDeprecatedType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLJavaType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryIteration;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
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
			case LibraryPackage.OCL_ANY_TYPE: return createOCLAnyType();
			case LibraryPackage.OCL_BOUND_TYPE: return createOCLBoundType();
			case LibraryPackage.OCL_CONCRETE_TYPE: return createOCLConcreteType();
			case LibraryPackage.OCL_DEPRECATED_TYPE: return createOCLDeprecatedType();
			case LibraryPackage.OCL_INVALID_TYPE: return createOCLInvalidType();
			case LibraryPackage.OCL_JAVA_TYPE: return createOCLJavaType();
			case LibraryPackage.OCL_LIBRARY: return createOCLLibrary();
			case LibraryPackage.OCL_LIBRARY_ITERATION: return createOCLLibraryIteration();
			case LibraryPackage.OCL_LIBRARY_OPERATION: return createOCLLibraryOperation();
			case LibraryPackage.OCL_LIBRARY_PROPERTY: return createOCLLibraryProperty();
			case LibraryPackage.OCL_PACKAGE: return createOCLPackage();
			case LibraryPackage.OCL_PARAMETER: return createOCLParameter();
			case LibraryPackage.OCL_ROOT: return createOCLRoot();
			case LibraryPackage.OCL_TYPE_BINDING: return createOCLTypeBinding();
			case LibraryPackage.OCL_TYPE_PARAMETER: return createOCLTypeParameter();
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
	public OCLAnyType createOCLAnyType() {
		OCLAnyTypeImpl oclAnyType = new OCLAnyTypeImpl();
		return oclAnyType;
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
	public OCLLibraryIteration createOCLLibraryIteration() {
		OCLLibraryIterationImpl oclLibraryIteration = new OCLLibraryIterationImpl();
		return oclLibraryIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLBoundType createOCLBoundType() {
		OCLBoundTypeImpl oclBoundType = new OCLBoundTypeImpl();
		return oclBoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLConcreteType createOCLConcreteType() {
		OCLConcreteTypeImpl oclConcreteType = new OCLConcreteTypeImpl();
		return oclConcreteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLDeprecatedType createOCLDeprecatedType() {
		OCLDeprecatedTypeImpl oclDeprecatedType = new OCLDeprecatedTypeImpl();
		return oclDeprecatedType;
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
	public OCLJavaType createOCLJavaType() {
		OCLJavaTypeImpl oclJavaType = new OCLJavaTypeImpl();
		return oclJavaType;
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
	public OCLRoot createOCLRoot() {
		OCLRootImpl oclRoot = new OCLRootImpl();
		return oclRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeBinding createOCLTypeBinding() {
		OCLTypeBindingImpl oclTypeBinding = new OCLTypeBindingImpl();
		return oclTypeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLTypeParameter createOCLTypeParameter() {
		OCLTypeParameterImpl oclTypeParameter = new OCLTypeParameterImpl();
		return oclTypeParameter;
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
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LibraryPackage getPackage() {
		return LibraryPackage.eINSTANCE;
	}

} //OCLLibraryFactoryImpl
