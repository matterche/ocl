/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLLibraryPackage.java,v 1.1.2.3 2010/01/30 07:49:47 ewillink Exp $
 */
package org.eclipse.ocl.uml.library;

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
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.uml.library.UMLLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface UMLLibraryPackage extends EPackage {
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
	String eNS_URI = "http://www.eclipse.org/ocl/3.0.0/UMLLibrary"; //$NON-NLS-1$

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
	UMLLibraryPackage eINSTANCE = org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLClassifierImpl <em>UMLOCL Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.uml.library.impl.UMLOCLClassifierImpl
	 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLClassifier()
	 * @generated
	 */
	int UMLOCL_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__CONFORMS = OCLMergedLibraryPackage.OCL_CLASSIFIER__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__NAME = OCLMergedLibraryPackage.OCL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_CLASSIFIER__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__CONTAINER = OCLMergedLibraryPackage.OCL_CLASSIFIER__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__OPERATION = OCLMergedLibraryPackage.OCL_CLASSIFIER__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__PROPERTY = OCLMergedLibraryPackage.OCL_CLASSIFIER__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__BOUND_TYPE = OCLMergedLibraryPackage.OCL_CLASSIFIER__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_CLASSIFIER__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>UMLOCL Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_CLASSIFIER_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLDataTypeImpl <em>UMLOCL Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.uml.library.impl.UMLOCLDataTypeImpl
	 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLDataType()
	 * @generated
	 */
	int UMLOCL_DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__CONFORMS = OCLMergedLibraryPackage.OCL_DATA_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__NAME = OCLMergedLibraryPackage.OCL_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_DATA_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__CONTAINER = OCLMergedLibraryPackage.OCL_DATA_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__OPERATION = OCLMergedLibraryPackage.OCL_DATA_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__PROPERTY = OCLMergedLibraryPackage.OCL_DATA_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__BOUND_TYPE = OCLMergedLibraryPackage.OCL_DATA_TYPE__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_DATA_TYPE__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>UMLOCL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_DATA_TYPE_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationImpl <em>UMLOCL Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationImpl
	 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLEnumeration()
	 * @generated
	 */
	int UMLOCL_ENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__CONFORMS = OCLMergedLibraryPackage.OCL_ENUMERATION__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__NAME = OCLMergedLibraryPackage.OCL_ENUMERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_ENUMERATION__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__CONTAINER = OCLMergedLibraryPackage.OCL_ENUMERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__OPERATION = OCLMergedLibraryPackage.OCL_ENUMERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__PROPERTY = OCLMergedLibraryPackage.OCL_ENUMERATION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__BOUND_TYPE = OCLMergedLibraryPackage.OCL_ENUMERATION__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_ENUMERATION__META_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION__LITERALS = OCLMergedLibraryPackage.OCL_ENUMERATION__LITERALS;

	/**
	 * The number of structural features of the '<em>UMLOCL Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_ENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationLiteralImpl <em>UMLOCL Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationLiteralImpl
	 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLEnumerationLiteral()
	 * @generated
	 */
	int UMLOCL_ENUMERATION_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION_LITERAL__NAME = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION_LITERAL__CONTAINER = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>UMLOCL Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_ENUMERATION_LITERAL_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLOperationImpl <em>UMLOCL Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.uml.library.impl.UMLOCLOperationImpl
	 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLOperation()
	 * @generated
	 */
	int UMLOCL_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__NAME = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__BOUND_TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__TYPE_PARAMETER = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__CONTAINER = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__ITERATOR = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__PARAMETER = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>UMLOCL Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_OPERATION_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLPropertyImpl <em>UMLOCL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.uml.library.impl.UMLOCLPropertyImpl
	 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLProperty()
	 * @generated
	 */
	int UMLOCL_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_PROPERTY__NAME = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_PROPERTY__TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_PROPERTY__BOUND_TYPE = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_PROPERTY__CONTAINER = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_PROPERTY__META_MODEL_ELEMENT = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>UMLOCL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMLOCL_PROPERTY_FEATURE_COUNT = OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.uml.library.UMLOCLClassifier <em>UMLOCL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UMLOCL Classifier</em>'.
	 * @see org.eclipse.ocl.uml.library.UMLOCLClassifier
	 * @generated
	 */
	EClass getUMLOCLClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.uml.library.UMLOCLDataType <em>UMLOCL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UMLOCL Data Type</em>'.
	 * @see org.eclipse.ocl.uml.library.UMLOCLDataType
	 * @generated
	 */
	EClass getUMLOCLDataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.uml.library.UMLOCLEnumeration <em>UMLOCL Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UMLOCL Enumeration</em>'.
	 * @see org.eclipse.ocl.uml.library.UMLOCLEnumeration
	 * @generated
	 */
	EClass getUMLOCLEnumeration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.uml.library.UMLOCLEnumerationLiteral <em>UMLOCL Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UMLOCL Enumeration Literal</em>'.
	 * @see org.eclipse.ocl.uml.library.UMLOCLEnumerationLiteral
	 * @generated
	 */
	EClass getUMLOCLEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.uml.library.UMLOCLOperation <em>UMLOCL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UMLOCL Operation</em>'.
	 * @see org.eclipse.ocl.uml.library.UMLOCLOperation
	 * @generated
	 */
	EClass getUMLOCLOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.uml.library.UMLOCLProperty <em>UMLOCL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UMLOCL Property</em>'.
	 * @see org.eclipse.ocl.uml.library.UMLOCLProperty
	 * @generated
	 */
	EClass getUMLOCLProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLLibraryFactory getUMLLibraryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLClassifierImpl <em>UMLOCL Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.uml.library.impl.UMLOCLClassifierImpl
		 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLClassifier()
		 * @generated
		 */
		EClass UMLOCL_CLASSIFIER = eINSTANCE.getUMLOCLClassifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLDataTypeImpl <em>UMLOCL Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.uml.library.impl.UMLOCLDataTypeImpl
		 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLDataType()
		 * @generated
		 */
		EClass UMLOCL_DATA_TYPE = eINSTANCE.getUMLOCLDataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationImpl <em>UMLOCL Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationImpl
		 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLEnumeration()
		 * @generated
		 */
		EClass UMLOCL_ENUMERATION = eINSTANCE.getUMLOCLEnumeration();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationLiteralImpl <em>UMLOCL Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.uml.library.impl.UMLOCLEnumerationLiteralImpl
		 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLEnumerationLiteral()
		 * @generated
		 */
		EClass UMLOCL_ENUMERATION_LITERAL = eINSTANCE.getUMLOCLEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLOperationImpl <em>UMLOCL Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.uml.library.impl.UMLOCLOperationImpl
		 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLOperation()
		 * @generated
		 */
		EClass UMLOCL_OPERATION = eINSTANCE.getUMLOCLOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.uml.library.impl.UMLOCLPropertyImpl <em>UMLOCL Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.uml.library.impl.UMLOCLPropertyImpl
		 * @see org.eclipse.ocl.uml.library.impl.UMLLibraryPackageImpl#getUMLOCLProperty()
		 * @generated
		 */
		EClass UMLOCL_PROPERTY = eINSTANCE.getUMLOCLProperty();

	}

} //UMLLibraryPackage
