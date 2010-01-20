/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackage.java,v 1.1.2.7 2010/01/20 16:57:25 ewillink Exp $
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
	int OCL_ELEMENT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLOperation()
	 * @generated
	 */
	int OCL_OPERATION = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLConstraintOperationImpl <em>OCL Constraint Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLConstraintOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConstraintOperation()
	 * @generated
	 */
	int OCL_CONSTRAINT_OPERATION = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPropertyImpl <em>OCL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLProperty()
	 * @generated
	 */
	int OCL_PROPERTY = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLConstraintPropertyImpl <em>OCL Constraint Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLConstraintPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLConstraintProperty()
	 * @generated
	 */
	int OCL_CONSTRAINT_PROPERTY = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryOperationImpl <em>OCL Library Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryOperation()
	 * @generated
	 */
	int OCL_LIBRARY_OPERATION = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl <em>OCL Library Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLLibraryPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLLibraryProperty()
	 * @generated
	 */
	int OCL_LIBRARY_PROPERTY = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl <em>OCL Meta Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLMetaModelOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelOperation()
	 * @generated
	 */
	int OCL_META_MODEL_OPERATION = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl <em>OCL Meta Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLMetaModelPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelProperty()
	 * @generated
	 */
	int OCL_META_MODEL_PROPERTY = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLPackageImpl <em>OCL Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLPackageImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLPackage()
	 * @generated
	 */
	int OCL_PACKAGE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLParameterImpl <em>OCL Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLParameterImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLParameter()
	 * @generated
	 */
	int OCL_PARAMETER = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTypeImpl <em>OCL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLType()
	 * @generated
	 */
	int OCL_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLGenericTypeImpl <em>OCL Generic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLGenericTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLGenericType()
	 * @generated
	 */
	int OCL_GENERIC_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLInvalidTypeImpl <em>OCL Invalid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLInvalidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLInvalidType()
	 * @generated
	 */
	int OCL_INVALID_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLVoidTypeImpl <em>OCL Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLVoidTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLVoidType()
	 * @generated
	 */
	int OCL_VOID_TYPE = 23;

	/**
	 * The meta object id for the '<em>Evaluation Visitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.EvaluationVisitor
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getEvaluationVisitor()
	 * @generated
	 */
	int EVALUATION_VISITOR = 25;

	/**
	 * The meta object id for the '<em>Expression In OCL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.utilities.ExpressionInOCL
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getExpressionInOCL()
	 * @generated
	 */
	int EXPRESSION_IN_OCL = 26;

	/**
	 * The meta object id for the '<em>Operation Call Exp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.expressions.OperationCallExp
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOperationCallExp()
	 * @generated
	 */
	int OPERATION_CALL_EXP = 27;

	/**
	 * The meta object id for the '<em>Property Call Exp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.expressions.PropertyCallExp
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getPropertyCallExp()
	 * @generated
	 */
	int PROPERTY_CALL_EXP = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.LibraryOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.LibraryOperationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getLibraryOperation()
	 * @generated
	 */
	int LIBRARY_OPERATION = 0;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLDataTypeImpl <em>OCL Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLDataTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLDataType()
	 * @generated
	 */
	int OCL_DATA_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationImpl <em>OCL Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLEnumerationImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumeration()
	 * @generated
	 */
	int OCL_ENUMERATION = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl <em>OCL Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumerationLiteral()
	 * @generated
	 */
	int OCL_ENUMERATION_LITERAL = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLClassifierImpl <em>OCL Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLClassifierImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLClassifier()
	 * @generated
	 */
	int OCL_CLASSIFIER = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.LibraryPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.LibraryPropertyImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getLibraryProperty()
	 * @generated
	 */
	int LIBRARY_PROPERTY = 1;


	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_PROPERTY__REFERENCES = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_PROPERTY_FEATURE_COUNT = 1;

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
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLAnyTypeImpl <em>OCL Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLAnyTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLAnyType()
	 * @generated
	 */
	int OCL_ANY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The number of structural features of the '<em>OCL Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION__SPECIFICATION = OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION__STEREOTYPE = OCL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Constraint Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_OPERATION_FEATURE_COUNT = OCL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__CONTAINER = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY__TYPE = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PROPERTY_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY__CONTAINER = OCL_PROPERTY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY__TYPE = OCL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY__SPECIFICATION = OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY__STEREOTYPE = OCL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Constraint Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONSTRAINT_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__LITERALS = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__CONTAINER = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__CONTAINER = OCL_PROPERTY__CONTAINER;

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
	 * The feature id for the '<em><b>Library Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY = OCL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Library Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LIBRARY_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.OCLMetaModelElement <em>OCL Meta Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.OCLMetaModelElement
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelElement()
	 * @generated
	 */
	int OCL_META_MODEL_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_ELEMENT__META_MODEL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_ELEMENT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT = OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION_FEATURE_COUNT = OCL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__NAME = OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__CONTAINER = OCL_PROPERTY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__TYPE = OCL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT = OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY_FEATURE_COUNT = OCL_PROPERTY_FEATURE_COUNT + 1;

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
	int OCL_PARAMETER__NAME = OCL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__CONTAINER = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER__TYPE = OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_PARAMETER_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.impl.OCLTupleTypeImpl <em>OCL Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.impl.OCLTupleTypeImpl
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTupleType()
	 * @generated
	 */
	int OCL_TUPLE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__CONFORMS = OCL_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__PROPERTY = OCL_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__CONTAINER = OCL_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE__META_MODEL_ELEMENT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 24;


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
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLConstraintOperation#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.eclipse.ocl.library.OCLConstraintOperation#getSpecification()
	 * @see #getOCLConstraintOperation()
	 * @generated
	 */
	EAttribute getOCLConstraintOperation_Specification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLConstraintOperation#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see org.eclipse.ocl.library.OCLConstraintOperation#getStereotype()
	 * @see #getOCLConstraintOperation()
	 * @generated
	 */
	EAttribute getOCLConstraintOperation_Stereotype();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLConstraintProperty#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.eclipse.ocl.library.OCLConstraintProperty#getSpecification()
	 * @see #getOCLConstraintProperty()
	 * @generated
	 */
	EAttribute getOCLConstraintProperty_Specification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.OCLConstraintProperty#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see org.eclipse.ocl.library.OCLConstraintProperty#getStereotype()
	 * @see #getOCLConstraintProperty()
	 * @generated
	 */
	EAttribute getOCLConstraintProperty_Stereotype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLDataType <em>OCL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Data Type</em>'.
	 * @see org.eclipse.ocl.library.OCLDataType
	 * @generated
	 */
	EClass getOCLDataType();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLEnumeration <em>OCL Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Enumeration</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumeration
	 * @generated
	 */
	EClass getOCLEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.OCLEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumeration#getLiterals()
	 * @see #getOCLEnumeration()
	 * @generated
	 */
	EReference getOCLEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLEnumerationLiteral <em>OCL Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Enumeration Literal</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumerationLiteral
	 * @generated
	 */
	EClass getOCLEnumerationLiteral();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLEnumerationLiteral#getContainer()
	 * @see #getOCLEnumerationLiteral()
	 * @generated
	 */
	EReference getOCLEnumerationLiteral_Container();

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
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLLibraryProperty#getLibraryProperty <em>Library Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Library Property</em>'.
	 * @see org.eclipse.ocl.library.OCLLibraryProperty#getLibraryProperty()
	 * @see #getOCLLibraryProperty()
	 * @generated
	 */
	EReference getOCLLibraryProperty_LibraryProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLMetaModelElement <em>OCL Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelElement
	 * @generated
	 */
	EClass getOCLMetaModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.OCLMetaModelElement#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.OCLMetaModelElement#getMetaModelElement()
	 * @see #getOCLMetaModelElement()
	 * @generated
	 */
	EReference getOCLMetaModelElement_MetaModelElement();

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
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLParameter#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLParameter#getContainer()
	 * @see #getOCLParameter()
	 * @generated
	 */
	EReference getOCLParameter_Container();

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
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.OCLProperty#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.OCLProperty#getContainer()
	 * @see #getOCLProperty()
	 * @generated
	 */
	EReference getOCLProperty_Container();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLTupleType <em>OCL Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Tuple Type</em>'.
	 * @see org.eclipse.ocl.library.OCLTupleType
	 * @generated
	 */
	EClass getOCLTupleType();

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
	 * Returns the meta object for data type '{@link org.eclipse.ocl.utilities.ExpressionInOCL <em>Expression In OCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression In OCL</em>'.
	 * @see org.eclipse.ocl.utilities.ExpressionInOCL
	 * @model instanceClass="org.eclipse.ocl.utilities.ExpressionInOCL<?, ?>"
	 * @generated
	 */
	EDataType getExpressionInOCL();

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
	 * Returns the meta object for data type '{@link org.eclipse.ocl.expressions.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Call Exp</em>'.
	 * @see org.eclipse.ocl.expressions.PropertyCallExp
	 * @model instanceClass="org.eclipse.ocl.expressions.PropertyCallExp<?, ?>"
	 * @generated
	 */
	EDataType getPropertyCallExp();

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
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLClassifier <em>OCL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Classifier</em>'.
	 * @see org.eclipse.ocl.library.OCLClassifier
	 * @generated
	 */
	EClass getOCLClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.LibraryProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.ocl.library.LibraryProperty
	 * @generated
	 */
	EClass getLibraryProperty();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.LibraryProperty#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see org.eclipse.ocl.library.LibraryProperty#getReferences()
	 * @see #getLibraryProperty()
	 * @generated
	 */
	EReference getLibraryProperty_References();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.OCLAnyType <em>OCL Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Any Type</em>'.
	 * @see org.eclipse.ocl.library.OCLAnyType
	 * @generated
	 */
	EClass getOCLAnyType();

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
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT_OPERATION__SPECIFICATION = eINSTANCE.getOCLConstraintOperation_Specification();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT_OPERATION__STEREOTYPE = eINSTANCE.getOCLConstraintOperation_Stereotype();

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
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT_PROPERTY__SPECIFICATION = eINSTANCE.getOCLConstraintProperty_Specification();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_CONSTRAINT_PROPERTY__STEREOTYPE = eINSTANCE.getOCLConstraintProperty_Stereotype();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLDataTypeImpl <em>OCL Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLDataTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLDataType()
		 * @generated
		 */
		EClass OCL_DATA_TYPE = eINSTANCE.getOCLDataType();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationImpl <em>OCL Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLEnumerationImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumeration()
		 * @generated
		 */
		EClass OCL_ENUMERATION = eINSTANCE.getOCLEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION__LITERALS = eINSTANCE.getOCLEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl <em>OCL Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLEnumerationLiteralImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLEnumerationLiteral()
		 * @generated
		 */
		EClass OCL_ENUMERATION_LITERAL = eINSTANCE.getOCLEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION_LITERAL__CONTAINER = eINSTANCE.getOCLEnumerationLiteral_Container();

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
		 * The meta object literal for the '<em><b>Library Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY = eINSTANCE.getOCLLibraryProperty_LibraryProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.OCLMetaModelElement <em>OCL Meta Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.OCLMetaModelElement
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLMetaModelElement()
		 * @generated
		 */
		EClass OCL_META_MODEL_ELEMENT = eINSTANCE.getOCLMetaModelElement();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_META_MODEL_ELEMENT__META_MODEL_ELEMENT = eINSTANCE.getOCLMetaModelElement_MetaModelElement();

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
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PARAMETER__CONTAINER = eINSTANCE.getOCLParameter_Container();

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
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PROPERTY__CONTAINER = eINSTANCE.getOCLProperty_Container();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_PROPERTY__TYPE = eINSTANCE.getOCLProperty_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLTupleTypeImpl <em>OCL Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLTupleTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLTupleType()
		 * @generated
		 */
		EClass OCL_TUPLE_TYPE = eINSTANCE.getOCLTupleType();

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
		 * The meta object literal for the '<em>Expression In OCL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.utilities.ExpressionInOCL
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getExpressionInOCL()
		 * @generated
		 */
		EDataType EXPRESSION_IN_OCL = eINSTANCE.getExpressionInOCL();

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
		 * The meta object literal for the '<em>Property Call Exp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.expressions.PropertyCallExp
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getPropertyCallExp()
		 * @generated
		 */
		EDataType PROPERTY_CALL_EXP = eINSTANCE.getPropertyCallExp();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLClassifierImpl <em>OCL Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLClassifierImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLClassifier()
		 * @generated
		 */
		EClass OCL_CLASSIFIER = eINSTANCE.getOCLClassifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.LibraryPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.LibraryPropertyImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getLibraryProperty()
		 * @generated
		 */
		EClass LIBRARY_PROPERTY = eINSTANCE.getLibraryProperty();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_PROPERTY__REFERENCES = eINSTANCE.getLibraryProperty_References();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.impl.OCLAnyTypeImpl <em>OCL Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.impl.OCLAnyTypeImpl
		 * @see org.eclipse.ocl.library.impl.LibraryPackageImpl#getOCLAnyType()
		 * @generated
		 */
		EClass OCL_ANY_TYPE = eINSTANCE.getOCLAnyType();

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
