/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreLibraryPackage.java,v 1.1.2.4 2010/01/31 22:20:19 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;

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
 * @see org.eclipse.ocl.ecore.library.EcoreLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreLibraryPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/ocl/3.0.0/EcoreLibrary"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ocl.ecore.lib"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreLibraryPackage eINSTANCE = org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLClassifierImpl <em>Ecore OCL Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLClassifierImpl
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLClassifier()
	 * @generated
	 */
	int ECORE_OCL_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__CONFORMS = OCLMergedLibraryPackage.OCL_CLASSIFIER__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__NAME = OCLMergedLibraryPackage.OCL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_CLASSIFIER__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__CONTAINER = OCLMergedLibraryPackage.OCL_CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__ITERATION = OCLMergedLibraryPackage.OCL_CLASSIFIER__ITERATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__OPERATION = OCLMergedLibraryPackage.OCL_CLASSIFIER__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__PROPERTY = OCLMergedLibraryPackage.OCL_CLASSIFIER__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__BOUND_TYPE = OCLMergedLibraryPackage.OCL_CLASSIFIER__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ecore OCL Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_CLASSIFIER_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLDataTypeImpl <em>Ecore OCL Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLDataTypeImpl
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLDataType()
	 * @generated
	 */
	int ECORE_OCL_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__CONFORMS = OCLMergedLibraryPackage.OCL_DATA_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__NAME = OCLMergedLibraryPackage.OCL_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_DATA_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__CONTAINER = OCLMergedLibraryPackage.OCL_DATA_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__ITERATION = OCLMergedLibraryPackage.OCL_DATA_TYPE__ITERATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__OPERATION = OCLMergedLibraryPackage.OCL_DATA_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__PROPERTY = OCLMergedLibraryPackage.OCL_DATA_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__BOUND_TYPE = OCLMergedLibraryPackage.OCL_DATA_TYPE__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ecore OCL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_DATA_TYPE_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationImpl <em>Ecore OCL Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationImpl
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLEnumeration()
	 * @generated
	 */
	int ECORE_OCL_ENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__CONFORMS = OCLMergedLibraryPackage.OCL_ENUMERATION__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__NAME = OCLMergedLibraryPackage.OCL_ENUMERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_ENUMERATION__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__CONTAINER = OCLMergedLibraryPackage.OCL_ENUMERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__ITERATION = OCLMergedLibraryPackage.OCL_ENUMERATION__ITERATION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__OPERATION = OCLMergedLibraryPackage.OCL_ENUMERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__PROPERTY = OCLMergedLibraryPackage.OCL_ENUMERATION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__BOUND_TYPE = OCLMergedLibraryPackage.OCL_ENUMERATION__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_ENUMERATION__META_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION__LITERALS = OCLMergedLibraryPackage.OCL_ENUMERATION__LITERALS;

	/**
	 * The number of structural features of the '<em>Ecore OCL Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_ENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationLiteralImpl <em>Ecore OCL Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationLiteralImpl
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLEnumerationLiteral()
	 * @generated
	 */
	int ECORE_OCL_ENUMERATION_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION_LITERAL__NAME = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION_LITERAL__CONTAINER = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ecore OCL Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_ENUMERATION_LITERAL_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLOperationImpl <em>Ecore OCL Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLOperationImpl
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLOperation()
	 * @generated
	 */
	int ECORE_OCL_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__NAME = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__BOUND_TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__CONTAINER = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__IS_STATIC = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__PARAMETER = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ecore OCL Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_OPERATION_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLPropertyImpl <em>Ecore OCL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLPropertyImpl
	 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLProperty()
	 * @generated
	 */
	int ECORE_OCL_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_PROPERTY__NAME = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_PROPERTY__TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_PROPERTY__BOUND_TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_PROPERTY__CONTAINER = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_PROPERTY__IS_STATIC = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_PROPERTY__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ecore OCL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECORE_OCL_PROPERTY_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.ecore.library.EcoreOCLClassifier <em>Ecore OCL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore OCL Classifier</em>'.
	 * @see org.eclipse.ocl.ecore.library.EcoreOCLClassifier
	 * @generated
	 */
	EClass getEcoreOCLClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.ecore.library.EcoreOCLDataType <em>Ecore OCL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore OCL Data Type</em>'.
	 * @see org.eclipse.ocl.ecore.library.EcoreOCLDataType
	 * @generated
	 */
	EClass getEcoreOCLDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.ecore.library.EcoreOCLEnumeration <em>Ecore OCL Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore OCL Enumeration</em>'.
	 * @see org.eclipse.ocl.ecore.library.EcoreOCLEnumeration
	 * @generated
	 */
	EClass getEcoreOCLEnumeration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.ecore.library.EcoreOCLEnumerationLiteral <em>Ecore OCL Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore OCL Enumeration Literal</em>'.
	 * @see org.eclipse.ocl.ecore.library.EcoreOCLEnumerationLiteral
	 * @generated
	 */
	EClass getEcoreOCLEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.ecore.library.EcoreOCLOperation <em>Ecore OCL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore OCL Operation</em>'.
	 * @see org.eclipse.ocl.ecore.library.EcoreOCLOperation
	 * @generated
	 */
	EClass getEcoreOCLOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.ecore.library.EcoreOCLProperty <em>Ecore OCL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecore OCL Property</em>'.
	 * @see org.eclipse.ocl.ecore.library.EcoreOCLProperty
	 * @generated
	 */
	EClass getEcoreOCLProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreLibraryFactory getEcoreLibraryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLClassifierImpl <em>Ecore OCL Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLClassifierImpl
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLClassifier()
		 * @generated
		 */
		EClass ECORE_OCL_CLASSIFIER = eINSTANCE.getEcoreOCLClassifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLDataTypeImpl <em>Ecore OCL Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLDataTypeImpl
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLDataType()
		 * @generated
		 */
		EClass ECORE_OCL_DATA_TYPE = eINSTANCE.getEcoreOCLDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationImpl <em>Ecore OCL Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationImpl
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLEnumeration()
		 * @generated
		 */
		EClass ECORE_OCL_ENUMERATION = eINSTANCE.getEcoreOCLEnumeration();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationLiteralImpl <em>Ecore OCL Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLEnumerationLiteralImpl
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLEnumerationLiteral()
		 * @generated
		 */
		EClass ECORE_OCL_ENUMERATION_LITERAL = eINSTANCE.getEcoreOCLEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLOperationImpl <em>Ecore OCL Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLOperationImpl
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLOperation()
		 * @generated
		 */
		EClass ECORE_OCL_OPERATION = eINSTANCE.getEcoreOCLOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.ecore.library.impl.EcoreOCLPropertyImpl <em>Ecore OCL Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreOCLPropertyImpl
		 * @see org.eclipse.ocl.ecore.library.impl.EcoreLibraryPackageImpl#getEcoreOCLProperty()
		 * @generated
		 */
		EClass ECORE_OCL_PROPERTY = eINSTANCE.getEcoreOCLProperty();

	}

} //EcoreLibraryPackage