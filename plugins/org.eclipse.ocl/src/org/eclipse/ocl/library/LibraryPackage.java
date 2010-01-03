/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackage.java,v 1.1.2.3 2010/01/03 22:53:47 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ocl/3.0.0/OCL/Library"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ocl.lib"; //$NON-NLS-1$

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "org.eclipse.ocl.library"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = org.eclipse.ocl.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLElementImpl <em>OCL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLElementImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLElement()
	 * @generated
	 */
	int OCL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>OCL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOperation()
	 * @generated
	 */
	int OCL_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__IS_ITERATOR = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__PARAMETER = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__TYPE = OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__CONTAINER = OCL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OCL Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLConstraintOperationImpl <em>OCL Constraint Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLConstraintOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConstraintOperation()
	 * @generated
	 */
	int OCL_CONSTRAINT_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION__NAME = OCL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION__IS_ITERATOR = OCL_OPERATION__IS_ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION__PARAMETER = OCL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION__TYPE = OCL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION__CONTAINER = OCL_OPERATION__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Constraint Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION_FEATURE_COUNT = OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPropertyImpl <em>OCL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLProperty()
	 * @generated
	 */
	int OCL_PROPERTY = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLConstraintPropertyImpl <em>OCL Constraint Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLConstraintPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConstraintProperty()
	 * @generated
	 */
	int OCL_CONSTRAINT_PROPERTY = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl <em>OCL Library Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryOperation()
	 * @generated
	 */
	int OCL_LIBRARY_OPERATION = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl <em>OCL Library Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryProperty()
	 * @generated
	 */
	int OCL_LIBRARY_PROPERTY = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl <em>OCL Meta Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelOperation()
	 * @generated
	 */
	int OCL_META_MODEL_OPERATION = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl <em>OCL Meta Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelProperty()
	 * @generated
	 */
	int OCL_META_MODEL_PROPERTY = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPackageImpl <em>OCL Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPackageImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackage()
	 * @generated
	 */
	int OCL_PACKAGE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLParameterImpl <em>OCL Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLParameterImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLParameter()
	 * @generated
	 */
	int OCL_PARAMETER = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypeImpl <em>OCL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLType()
	 * @generated
	 */
	int OCL_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLGenericTypeImpl <em>OCL Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLGenericTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLGenericType()
	 * @generated
	 */
	int OCL_GENERIC_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLInvalidTypeImpl <em>OCL Invalid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLInvalidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLInvalidType()
	 * @generated
	 */
	int OCL_INVALID_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__TYPE = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CONFORMS = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OPERATION = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__PROPERTY = OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CONTAINER = OCL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OCL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__TYPE = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY__TYPE = OCL_PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>OCL Constraint Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_GENERIC_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_GENERIC_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_GENERIC_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_GENERIC_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_GENERIC_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_GENERIC_TYPE__PARAMETER = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Generic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_GENERIC_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__NAME = OCL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__IS_ITERATOR = OCL_OPERATION__IS_ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__PARAMETER = OCL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__TYPE = OCL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__CONTAINER = OCL_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Library Operation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS = OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION__LIBRARY_OPERATION = OCL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Library Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_OPERATION_FEATURE_COUNT = OCL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLVoidTypeImpl <em>OCL Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLVoidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLVoidType()
	 * @generated
	 */
	int OCL_VOID_TYPE = 15;

	/**
	 * The meta object id for the '<em>Evaluation Visitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.EvaluationVisitor
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getEvaluationVisitor()
	 * @generated
	 */
	int EVALUATION_VISITOR = 18;

	/**
	 * The meta object id for the '<em>Operation Call Exp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.expressions.OperationCallExp
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOperationCallExp()
	 * @generated
	 */
	int OPERATION_CALL_EXP = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.LibraryOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.LibraryOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getLibraryOperation()
	 * @generated
	 */
	int LIBRARY_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION__REFERENCES = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__TYPE = OCL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Library Property Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS = OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Library Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__NAME = OCL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__IS_ITERATOR = OCL_OPERATION__IS_ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__PARAMETER = OCL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__TYPE = OCL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__CONTAINER = OCL_OPERATION__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION_FEATURE_COUNT = OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__TYPE = OCL_PROPERTY__TYPE;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE__EXTENDS = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE__TYPE = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PACKAGE_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Property</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.LibraryProperty
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getLibraryProperty()
	 * @generated
	 */
	int LIBRARY_PROPERTY = 19;


	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 16;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLConstraintOperation <em>OCL Constraint Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Constraint Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLConstraintOperation
	 * @generated
	 */
	EClass getOCLConstraintOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLConstraintProperty <em>OCL Constraint Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Constraint Property</em>'.
	 * @see org.eclipse.ocl.library.OCLConstraintProperty
	 * @generated
	 */
	EClass getOCLConstraintProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLElement <em>OCL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Element</em>'.
	 * @see org.eclipse.ocl.library.OCLElement
	 * @generated
	 */
	EClass getOCLElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ocl.library.OCLElement#getName()
	 * @see #getOCLElement()
	 * @generated
	 */
	EAttribute getOCLElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLGenericType <em>OCL Generic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Generic Type</em>'.
	 * @see org.eclipse.ocl.library.OCLGenericType
	 * @generated
	 */
	EClass getOCLGenericType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.OCLGenericType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLGenericType#getParameter()
	 * @see #getOCLGenericType()
	 * @generated
	 */
	EReference getOCLGenericType_Parameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLInvalidType <em>OCL Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Invalid Type</em>'.
	 * @see org.eclipse.ocl.library.OCLInvalidType
	 * @generated
	 */
	EClass getOCLInvalidType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLLibraryOperation <em>OCL Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Library Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryOperation
	 * @generated
	 */
	EClass getOCLLibraryOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperationClass <em>Library Operation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Operation Class</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperationClass()
	 * @see #getOCLLibraryOperation()
	 * @generated
	 */
	EAttribute getOCLLibraryOperation_LibraryOperationClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation <em>Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryOperation#getLibraryOperation()
	 * @see #getOCLLibraryOperation()
	 * @generated
	 */
	EReference getOCLLibraryOperation_LibraryOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLLibraryProperty <em>OCL Library Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Library Property</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryProperty
	 * @generated
	 */
	EClass getOCLLibraryProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryPropertyClass <em>Library Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Property Class</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryProperty#getLibraryPropertyClass()
	 * @see #getOCLLibraryProperty()
	 * @generated
	 */
	EAttribute getOCLLibraryProperty_LibraryPropertyClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLMetaModelOperation <em>OCL Meta Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Meta Model Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelOperation
	 * @generated
	 */
	EClass getOCLMetaModelOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLMetaModelProperty <em>OCL Meta Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Meta Model Property</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelProperty
	 * @generated
	 */
	EClass getOCLMetaModelProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLOperation <em>OCL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation
	 * @generated
	 */
	EClass getOCLOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLOperation#isIterator <em>Is Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Iterator</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#isIterator()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EAttribute getOCLOperation_IsIterator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLOperation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#getParameter()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EReference getOCLOperation_Parameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#getType()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EReference getOCLOperation_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLOperation#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLOperation#getContainer()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EReference getOCLOperation_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLPackage <em>OCL Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Package</em>'.
	 * @see org.eclipse.ocl.library.OCLPackage
	 * @generated
	 */
	EClass getOCLPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLPackage#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extends</em>'.
	 * @see org.eclipse.ocl.library.OCLPackage#getExtends()
	 * @see #getOCLPackage()
	 * @generated
	 */
	EReference getOCLPackage_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLPackage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLPackage#getType()
	 * @see #getOCLPackage()
	 * @generated
	 */
	EReference getOCLPackage_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLParameter <em>OCL Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Parameter</em>'.
	 * @see org.eclipse.ocl.library.OCLParameter
	 * @generated
	 */
	EClass getOCLParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLParameter#getType()
	 * @see #getOCLParameter()
	 * @generated
	 */
	EReference getOCLParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLProperty <em>OCL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Property</em>'.
	 * @see org.eclipse.ocl.library.OCLProperty
	 * @generated
	 */
	EClass getOCLProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.OCLProperty#getType()
	 * @see #getOCLProperty()
	 * @generated
	 */
	EReference getOCLProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLType <em>OCL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Type</em>'.
	 * @see org.eclipse.ocl.library.OCLType
	 * @generated
	 */
	EClass getOCLType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.OCLType#getConforms <em>Conforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conforms</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getConforms()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Conforms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getOperation()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getProperty()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Property();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLType#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLType#getContainer()
	 * @see #getOCLType()
	 * @generated
	 */
	EReference getOCLType_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLVoidType <em>OCL Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Void Type</em>'.
	 * @see org.eclipse.ocl.library.OCLVoidType
	 * @generated
	 */
	EClass getOCLVoidType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.EvaluationVisitor <em>Evaluation Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Evaluation Visitor</em>'.
	 * @see org.eclipse.ocl.EvaluationVisitor
	 * @model instanceClass="org.eclipse.ocl.EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>"
	 * @generated
	 */
	EDataType getEvaluationVisitor();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.expressions.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Call Exp</em>'.
	 * @see org.eclipse.ocl.expressions.OperationCallExp
	 * @model instanceClass="org.eclipse.ocl.expressions.OperationCallExp<?, ?>"
	 * @generated
	 */
	EDataType getOperationCallExp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.LibraryOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclipse.ocl.library.LibraryOperation
	 * @generated
	 */
	EClass getLibraryOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.LibraryOperation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see org.eclipse.ocl.library.LibraryOperation#getReferences()
	 * @see #getLibraryOperation()
	 * @generated
	 */
	EReference getLibraryOperation_References();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.LibraryProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property</em>'.
	 * @see org.eclipse.ocl.LibraryProperty
	 * @model instanceClass="org.eclipse.ocl.LibraryProperty"
	 * @generated
	 */
	EDataType getLibraryProperty();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLConstraintOperationImpl <em>OCL Constraint Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLConstraintOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConstraintOperation()
		 * @generated
		 */
		EClass OCL_CONSTRAINT_OPERATION = eINSTANCE.getOCLConstraintOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLConstraintPropertyImpl <em>OCL Constraint Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLConstraintPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConstraintProperty()
		 * @generated
		 */
		EClass OCL_CONSTRAINT_PROPERTY = eINSTANCE.getOCLConstraintProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLElementImpl <em>OCL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLElementImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLElement()
		 * @generated
		 */
		EClass OCL_ELEMENT = eINSTANCE.getOCLElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_ELEMENT__NAME = eINSTANCE.getOCLElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLGenericTypeImpl <em>OCL Generic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLGenericTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLGenericType()
		 * @generated
		 */
		EClass OCL_GENERIC_TYPE = eINSTANCE.getOCLGenericType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_GENERIC_TYPE__PARAMETER = eINSTANCE.getOCLGenericType_Parameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLInvalidTypeImpl <em>OCL Invalid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLInvalidTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLInvalidType()
		 * @generated
		 */
		EClass OCL_INVALID_TYPE = eINSTANCE.getOCLInvalidType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl <em>OCL Library Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLLibraryOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryOperation()
		 * @generated
		 */
		EClass OCL_LIBRARY_OPERATION = eINSTANCE.getOCLLibraryOperation();

		/**
		 * The meta object literal for the '<em><b>Library Operation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS = eINSTANCE.getOCLLibraryOperation_LibraryOperationClass();

		/**
		 * The meta object literal for the '<em><b>Library Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_LIBRARY_OPERATION__LIBRARY_OPERATION = eINSTANCE.getOCLLibraryOperation_LibraryOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl <em>OCL Library Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryProperty()
		 * @generated
		 */
		EClass OCL_LIBRARY_PROPERTY = eINSTANCE.getOCLLibraryProperty();

		/**
		 * The meta object literal for the '<em><b>Library Property Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS = eINSTANCE.getOCLLibraryProperty_LibraryPropertyClass();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl <em>OCL Meta Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelOperation()
		 * @generated
		 */
		EClass OCL_META_MODEL_OPERATION = eINSTANCE.getOCLMetaModelOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl <em>OCL Meta Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelProperty()
		 * @generated
		 */
		EClass OCL_META_MODEL_PROPERTY = eINSTANCE.getOCLMetaModelProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOperation()
		 * @generated
		 */
		EClass OCL_OPERATION = eINSTANCE.getOCLOperation();

		/**
		 * The meta object literal for the '<em><b>Is Iterator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_OPERATION__IS_ITERATOR = eINSTANCE.getOCLOperation_IsIterator();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__PARAMETER = eINSTANCE.getOCLOperation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__TYPE = eINSTANCE.getOCLOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_OPERATION__CONTAINER = eINSTANCE.getOCLOperation_Container();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLPackageImpl <em>OCL Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLPackageImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackage()
		 * @generated
		 */
		EClass OCL_PACKAGE = eINSTANCE.getOCLPackage();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PACKAGE__EXTENDS = eINSTANCE.getOCLPackage_Extends();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PACKAGE__TYPE = eINSTANCE.getOCLPackage_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLParameterImpl <em>OCL Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLParameterImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLParameter()
		 * @generated
		 */
		EClass OCL_PARAMETER = eINSTANCE.getOCLParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PARAMETER__TYPE = eINSTANCE.getOCLParameter_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLPropertyImpl <em>OCL Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLProperty()
		 * @generated
		 */
		EClass OCL_PROPERTY = eINSTANCE.getOCLProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PROPERTY__TYPE = eINSTANCE.getOCLProperty_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTypeImpl <em>OCL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLType()
		 * @generated
		 */
		EClass OCL_TYPE = eINSTANCE.getOCLType();

		/**
		 * The meta object literal for the '<em><b>Conforms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__CONFORMS = eINSTANCE.getOCLType_Conforms();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__OPERATION = eINSTANCE.getOCLType_Operation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__PROPERTY = eINSTANCE.getOCLType_Property();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__CONTAINER = eINSTANCE.getOCLType_Container();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLVoidTypeImpl <em>OCL Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLVoidTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLVoidType()
		 * @generated
		 */
		EClass OCL_VOID_TYPE = eINSTANCE.getOCLVoidType();

		/**
		 * The meta object literal for the '<em>Evaluation Visitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.EvaluationVisitor
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getEvaluationVisitor()
		 * @generated
		 */
		EDataType EVALUATION_VISITOR = eINSTANCE.getEvaluationVisitor();

		/**
		 * The meta object literal for the '<em>Operation Call Exp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.expressions.OperationCallExp
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOperationCallExp()
		 * @generated
		 */
		EDataType OPERATION_CALL_EXP = eINSTANCE.getOperationCallExp();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.LibraryOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.LibraryOperationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getLibraryOperation()
		 * @generated
		 */
		EClass LIBRARY_OPERATION = eINSTANCE.getLibraryOperation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_OPERATION__REFERENCES = eINSTANCE.getLibraryOperation_References();

		/**
		 * The meta object literal for the '<em>Property</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.LibraryProperty
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getLibraryProperty()
		 * @generated
		 */
		EDataType LIBRARY_PROPERTY = eINSTANCE.getLibraryProperty();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //LibraryPackage
