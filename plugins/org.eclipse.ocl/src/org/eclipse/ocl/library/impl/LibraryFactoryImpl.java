/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactoryImpl.java,v 1.1.2.7 2010/01/20 09:09:32 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.library.*;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.LibraryProperty;
import org.eclipse.ocl.library.OCLConstraintOperation;
import org.eclipse.ocl.library.OCLConstraintProperty;
import org.eclipse.ocl.library.OCLGenericType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLType;
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
			case LibraryPackage.LIBRARY_OPERATION: return createLibraryOperation();
			case LibraryPackage.LIBRARY_PROPERTY: return createLibraryProperty();
			case LibraryPackage.OCL_ANY_TYPE: return createOCLAnyType();
			case LibraryPackage.OCL_CONSTRAINT_OPERATION: return createOCLConstraintOperation();
			case LibraryPackage.OCL_CONSTRAINT_PROPERTY: return createOCLConstraintProperty();
			case LibraryPackage.OCL_GENERIC_TYPE: return createOCLGenericType();
			case LibraryPackage.OCL_INVALID_TYPE: return createOCLInvalidType();
			case LibraryPackage.OCL_LIBRARY_OPERATION: return createOCLLibraryOperation();
			case LibraryPackage.OCL_LIBRARY_PROPERTY: return createOCLLibraryProperty();
			case LibraryPackage.OCL_PACKAGE: return createOCLPackage();
			case LibraryPackage.OCL_PARAMETER: return createOCLParameter();
			case LibraryPackage.OCL_TYPE: return createOCLType();
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
			case LibraryPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case LibraryPackage.EVALUATION_VISITOR:
				return createEvaluationVisitorFromString(eDataType, initialValue);
			case LibraryPackage.OPERATION_CALL_EXP:
				return createOperationCallExpFromString(eDataType, initialValue);
			case LibraryPackage.PROPERTY_CALL_EXP:
				return createPropertyCallExpFromString(eDataType, initialValue);
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
			case LibraryPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case LibraryPackage.EVALUATION_VISITOR:
				return convertEvaluationVisitorToString(eDataType, instanceValue);
			case LibraryPackage.OPERATION_CALL_EXP:
				return convertOperationCallExpToString(eDataType, instanceValue);
			case LibraryPackage.PROPERTY_CALL_EXP:
				return convertPropertyCallExpToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryOperation createLibraryOperation() {
		LibraryOperationImpl libraryOperation = new LibraryOperationImpl();
		return libraryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryProperty createLibraryProperty() {
		LibraryPropertyImpl libraryProperty = new LibraryPropertyImpl();
		return libraryProperty;
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
	public OCLConstraintOperation createOCLConstraintOperation() {
		OCLConstraintOperationImpl oclConstraintOperation = new OCLConstraintOperationImpl();
		return oclConstraintOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLConstraintProperty createOCLConstraintProperty() {
		OCLConstraintPropertyImpl oclConstraintProperty = new OCLConstraintPropertyImpl();
		return oclConstraintProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLGenericType createOCLGenericType() {
		OCLGenericTypeImpl oclGenericType = new OCLGenericTypeImpl();
		return oclGenericType;
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
	public OCLType createOCLType() {
		OCLTypeImpl oclType = new OCLTypeImpl();
		return oclType;
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
	 * @generated NOT
	 */
	public EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> createEvaluationVisitorFromString(EDataType eDataType, String initialValue) {
		throw new UnsupportedOperationException();  // Cannot happen; only used as parameter
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertEvaluationVisitorToString(EDataType eDataType, Object instanceValue) {
		throw new UnsupportedOperationException();  // Cannot happen; only used as parameter
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OperationCallExp<?, ?> createOperationCallExpFromString(EDataType eDataType, String initialValue) {
		throw new UnsupportedOperationException();  // Cannot happen; only used as parameter
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertOperationCallExpToString(EDataType eDataType, Object instanceValue) {
		throw new UnsupportedOperationException();  // Cannot happen; only used as parameter
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PropertyCallExp<?, ?> createPropertyCallExpFromString(EDataType eDataType, String initialValue) {
		throw new UnsupportedOperationException();  // Cannot happen; only used as parameter
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyCallExpToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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

} //LibraryFactoryImpl
