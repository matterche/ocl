/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryFactoryImpl.java,v 1.1.2.6 2010/01/19 22:34:20 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.LibraryProperty;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.library.*;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLConstraintOperation;
import org.eclipse.ocl.library.OCLConstraintProperty;
import org.eclipse.ocl.library.OCLGenericType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLMetaModelProperty;
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
			case LibraryPackage.OCL_CLASSIFIER: return createOCLClassifier();
			case LibraryPackage.OCL_CONSTRAINT_OPERATION: return createOCLConstraintOperation();
			case LibraryPackage.OCL_CONSTRAINT_PROPERTY: return createOCLConstraintProperty();
			case LibraryPackage.OCL_DATA_TYPE: return createOCLDataType();
			case LibraryPackage.OCL_ENUMERATION: return createOCLEnumeration();
			case LibraryPackage.OCL_ENUMERATION_LITERAL: return createOCLEnumerationLiteral();
			case LibraryPackage.OCL_GENERIC_TYPE: return createOCLGenericType();
			case LibraryPackage.OCL_INVALID_TYPE: return createOCLInvalidType();
			case LibraryPackage.OCL_LIBRARY_OPERATION: return createOCLLibraryOperation();
			case LibraryPackage.OCL_LIBRARY_PROPERTY: return createOCLLibraryProperty();
			case LibraryPackage.OCL_META_MODEL_OPERATION: return createOCLMetaModelOperation();
			case LibraryPackage.OCL_META_MODEL_PROPERTY: return createOCLMetaModelProperty();
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
			case LibraryPackage.LIBRARY_PROPERTY:
				return createLibraryPropertyFromString(eDataType, initialValue);
			case LibraryPackage.OPERATION_CALL_EXP:
				return createOperationCallExpFromString(eDataType, initialValue);
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
			case LibraryPackage.LIBRARY_PROPERTY:
				return convertLibraryPropertyToString(eDataType, instanceValue);
			case LibraryPackage.OPERATION_CALL_EXP:
				return convertOperationCallExpToString(eDataType, instanceValue);
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
	public OCLClassifier createOCLClassifier() {
		OCLClassifierImpl oclClassifier = new OCLClassifierImpl();
		return oclClassifier;
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
	public OCLDataType createOCLDataType() {
		OCLDataTypeImpl oclDataType = new OCLDataTypeImpl();
		return oclDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLEnumeration createOCLEnumeration() {
		OCLEnumerationImpl oclEnumeration = new OCLEnumerationImpl();
		return oclEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLEnumerationLiteral createOCLEnumerationLiteral() {
		OCLEnumerationLiteralImpl oclEnumerationLiteral = new OCLEnumerationLiteralImpl();
		return oclEnumerationLiteral;
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
	public OCLMetaModelOperation createOCLMetaModelOperation() {
		OCLMetaModelOperationImpl oclMetaModelOperation = new OCLMetaModelOperationImpl();
		return oclMetaModelOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMetaModelProperty createOCLMetaModelProperty() {
		OCLMetaModelPropertyImpl oclMetaModelProperty = new OCLMetaModelPropertyImpl();
		return oclMetaModelProperty;
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EvaluationVisitor createEvaluationVisitorFromString(EDataType eDataType, String initialValue) {
		return (EvaluationVisitor)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationVisitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public OperationCallExp createOperationCallExpFromString(EDataType eDataType, String initialValue) {
		return (OperationCallExp)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationCallExpToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryProperty createLibraryPropertyFromString(EDataType eDataType, String initialValue) {
		return (LibraryProperty)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryPropertyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
