/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMergedLibraryPackage.java,v 1.1.2.2 2010/01/30 07:49:35 ewillink Exp $
 */
package org.eclipse.ocl.library.merged;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.library.LibraryPackage;

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
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryFactory
 * @model kind="package"
 * @generated
 */
public interface OCLMergedLibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "merged"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ocl/3.0.0/OCL/MergedLibrary"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ocl.lib.merge"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCLMergedLibraryPackage eINSTANCE = org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl <em>Merged Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedLibraryImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedLibrary()
	 * @generated
	 */
	int MERGED_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__NAME = LibraryPackage.OCL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__BAG = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__BOOLEAN = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__CLASSIFIER = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__COLLECTION = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__ENUMERATION = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__INTEGER = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Java</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__JAVA = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ocl Any</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__OCL_ANY = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ocl Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__OCL_INVALID = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ocl Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__OCL_MESSAGE = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ocl Tuple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__OCL_TUPLE = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ocl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__OCL_TYPE = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ocl Void</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__OCL_VOID = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ordered Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__ORDERED_SET = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Real</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__REAL = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__SEQUENCE = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__SET = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__STRING = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Unlimited Natural</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__UNLIMITED_NATURAL = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Invalid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__INVALID = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Null</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__NULL = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Unlimited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__UNLIMITED = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Base Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY__BASE_LIBRARY = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Merged Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_FEATURE_COUNT = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedOperationImpl <em>Merged Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedOperationImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedOperation()
	 * @generated
	 */
	int MERGED_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION__POST = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION__PRE = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merged Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_FEATURE_COUNT = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedLibraryOperationImpl <em>Merged Library Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedLibraryOperationImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedLibraryOperation()
	 * @generated
	 */
	int MERGED_LIBRARY_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_OPERATION__POST = MERGED_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_OPERATION__PRE = MERGED_OPERATION__PRE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_OPERATION__OPERATION = MERGED_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merged Library Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_OPERATION_FEATURE_COUNT = MERGED_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedMetaModelOperationImpl <em>Merged Meta Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedMetaModelOperationImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedMetaModelOperation()
	 * @generated
	 */
	int MERGED_META_MODEL_OPERATION = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedMetaModelPropertyImpl <em>Merged Meta Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedMetaModelPropertyImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedMetaModelProperty()
	 * @generated
	 */
	int MERGED_META_MODEL_PROPERTY = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl <em>Merged Operation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedOperationDefinition()
	 * @generated
	 */
	int MERGED_OPERATION_DEFINITION = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedPropertyImpl <em>Merged Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedPropertyImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedProperty()
	 * @generated
	 */
	int MERGED_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY__INIT = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY__DERIVE = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merged Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY_FEATURE_COUNT = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedLibraryPropertyImpl <em>Merged Library Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedLibraryPropertyImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedLibraryProperty()
	 * @generated
	 */
	int MERGED_LIBRARY_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_PROPERTY__INIT = MERGED_PROPERTY__INIT;

	/**
	 * The feature id for the '<em><b>Derive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_PROPERTY__DERIVE = MERGED_PROPERTY__DERIVE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_PROPERTY__PROPERTY = MERGED_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merged Library Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_LIBRARY_PROPERTY_FEATURE_COUNT = MERGED_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_OPERATION__POST = MERGED_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_OPERATION__PRE = MERGED_OPERATION__PRE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_OPERATION__OPERATION = MERGED_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_OPERATION__BODY = MERGED_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merged Meta Model Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_OPERATION_FEATURE_COUNT = MERGED_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_PROPERTY__INIT = MERGED_PROPERTY__INIT;

	/**
	 * The feature id for the '<em><b>Derive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_PROPERTY__DERIVE = MERGED_PROPERTY__DERIVE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_PROPERTY__PROPERTY = MERGED_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merged Meta Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_META_MODEL_PROPERTY_FEATURE_COUNT = MERGED_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_DEFINITION__POST = MERGED_OPERATION__POST;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_DEFINITION__PRE = MERGED_OPERATION__PRE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_DEFINITION__NAME = MERGED_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_DEFINITION__PARAMETER = MERGED_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_DEFINITION__TYPE = MERGED_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_DEFINITION__BODY = MERGED_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Merged Operation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OPERATION_DEFINITION_FEATURE_COUNT = MERGED_OPERATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedPropertyDefinitionImpl <em>Merged Property Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedPropertyDefinitionImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedPropertyDefinition()
	 * @generated
	 */
	int MERGED_PROPERTY_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY_DEFINITION__INIT = MERGED_PROPERTY__INIT;

	/**
	 * The feature id for the '<em><b>Derive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY_DEFINITION__DERIVE = MERGED_PROPERTY__DERIVE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY_DEFINITION__NAME = MERGED_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY_DEFINITION__TYPE = MERGED_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merged Property Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_PROPERTY_DEFINITION_FEATURE_COUNT = MERGED_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl <em>Merged Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.MergedTypeImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedType()
	 * @generated
	 */
	int MERGED_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Merged Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_TYPE__MERGED_LIBRARY = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_TYPE__TYPE = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_TYPE__CONFORMS = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_TYPE__OPERATION = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_TYPE__PROPERTY = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_TYPE__INV = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Merged Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_TYPE_FEATURE_COUNT = LibraryPackage.OCL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.OCLBoundCollectionTypeImpl <em>OCL Bound Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.OCLBoundCollectionTypeImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLBoundCollectionType()
	 * @generated
	 */
	int OCL_BOUND_COLLECTION_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_COLLECTION_TYPE__CONFORMS = LibraryPackage.OCL_BOUND_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_COLLECTION_TYPE__TYPE = LibraryPackage.OCL_BOUND_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_COLLECTION_TYPE__TYPE_BINDING = LibraryPackage.OCL_BOUND_TYPE__TYPE_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_COLLECTION_TYPE__NAME = LibraryPackage.OCL_BOUND_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Bound Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_BOUND_COLLECTION_TYPE_FEATURE_COUNT = LibraryPackage.OCL_BOUND_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.OCLClassifierImpl <em>OCL Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.OCLClassifierImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLClassifier()
	 * @generated
	 */
	int OCL_CLASSIFIER = 11;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__CONFORMS = LibraryPackage.OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__NAME = LibraryPackage.OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__TYPE_PARAMETER = LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__CONTAINER = LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__OPERATION = LibraryPackage.OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__PROPERTY = LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__BOUND_TYPE = LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER__META_MODEL_ELEMENT = LibraryPackage.OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CLASSIFIER_FEATURE_COUNT = LibraryPackage.OCL_CONCRETE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.OCLDataTypeImpl <em>OCL Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.OCLDataTypeImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLDataType()
	 * @generated
	 */
	int OCL_DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__CONFORMS = LibraryPackage.OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__NAME = LibraryPackage.OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__TYPE_PARAMETER = LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__CONTAINER = LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__OPERATION = LibraryPackage.OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__PROPERTY = LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__BOUND_TYPE = LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE__META_MODEL_ELEMENT = LibraryPackage.OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_DATA_TYPE_FEATURE_COUNT = LibraryPackage.OCL_CONCRETE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.OCLEnumerationImpl <em>OCL Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.OCLEnumerationImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLEnumeration()
	 * @generated
	 */
	int OCL_ENUMERATION = 13;

	/**
	 * The feature id for the '<em><b>Conforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__CONFORMS = LibraryPackage.OCL_CONCRETE_TYPE__CONFORMS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__NAME = LibraryPackage.OCL_CONCRETE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__TYPE_PARAMETER = LibraryPackage.OCL_CONCRETE_TYPE__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__CONTAINER = LibraryPackage.OCL_CONCRETE_TYPE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__OPERATION = LibraryPackage.OCL_CONCRETE_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__PROPERTY = LibraryPackage.OCL_CONCRETE_TYPE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__BOUND_TYPE = LibraryPackage.OCL_CONCRETE_TYPE__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__META_MODEL_ELEMENT = LibraryPackage.OCL_CONCRETE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION__LITERALS = LibraryPackage.OCL_CONCRETE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_FEATURE_COUNT = LibraryPackage.OCL_CONCRETE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.OCLEnumerationLiteralImpl <em>OCL Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.OCLEnumerationLiteralImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLEnumerationLiteral()
	 * @generated
	 */
	int OCL_ENUMERATION_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__NAME = LibraryPackage.OCL_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__CONTAINER = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_LITERAL_FEATURE_COUNT = LibraryPackage.OCL_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.OCLMetaModelOperationImpl <em>OCL Meta Model Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.OCLMetaModelOperationImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLMetaModelOperation()
	 * @generated
	 */
	int OCL_META_MODEL_OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__NAME = LibraryPackage.OCL_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__TYPE = LibraryPackage.OCL_OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__BOUND_TYPE = LibraryPackage.OCL_OPERATION__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Type Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__TYPE_PARAMETER = LibraryPackage.OCL_OPERATION__TYPE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__CONTAINER = LibraryPackage.OCL_OPERATION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__IS_STATIC = LibraryPackage.OCL_OPERATION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__ITERATOR = LibraryPackage.OCL_OPERATION__ITERATOR;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__PARAMETER = LibraryPackage.OCL_OPERATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT = LibraryPackage.OCL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_OPERATION_FEATURE_COUNT = LibraryPackage.OCL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.library.merged.impl.OCLMetaModelPropertyImpl <em>OCL Meta Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.library.merged.impl.OCLMetaModelPropertyImpl
	 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLMetaModelProperty()
	 * @generated
	 */
	int OCL_META_MODEL_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__NAME = LibraryPackage.OCL_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__TYPE = LibraryPackage.OCL_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Bound Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__BOUND_TYPE = LibraryPackage.OCL_PROPERTY__BOUND_TYPE;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__CONTAINER = LibraryPackage.OCL_PROPERTY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__IS_STATIC = LibraryPackage.OCL_PROPERTY__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT = LibraryPackage.OCL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Meta Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_META_MODEL_PROPERTY_FEATURE_COUNT = LibraryPackage.OCL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedLibrary <em>Merged Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Library</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedLibrary
	 * @generated
	 */
	EClass getMergedLibrary();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedLibrary#getBaseLibrary <em>Base Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Library</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedLibrary#getBaseLibrary()
	 * @see #getMergedLibrary()
	 * @generated
	 */
	EReference getMergedLibrary_BaseLibrary();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedLibraryOperation <em>Merged Library Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Library Operation</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedLibraryOperation
	 * @generated
	 */
	EClass getMergedLibraryOperation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedLibraryOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedLibraryOperation#getOperation()
	 * @see #getMergedLibraryOperation()
	 * @generated
	 */
	EReference getMergedLibraryOperation_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedLibraryProperty <em>Merged Library Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Library Property</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedLibraryProperty
	 * @generated
	 */
	EClass getMergedLibraryProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedLibraryProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedLibraryProperty#getProperty()
	 * @see #getMergedLibraryProperty()
	 * @generated
	 */
	EReference getMergedLibraryProperty_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation <em>Merged Meta Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Meta Model Operation</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedMetaModelOperation
	 * @generated
	 */
	EClass getMergedMetaModelOperation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedMetaModelOperation#getOperation()
	 * @see #getMergedMetaModelOperation()
	 * @generated
	 */
	EReference getMergedMetaModelOperation_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedMetaModelOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedMetaModelOperation#getBody()
	 * @see #getMergedMetaModelOperation()
	 * @generated
	 */
	EReference getMergedMetaModelOperation_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedMetaModelProperty <em>Merged Meta Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Meta Model Property</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedMetaModelProperty
	 * @generated
	 */
	EClass getMergedMetaModelProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedMetaModelProperty#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedMetaModelProperty#getProperty()
	 * @see #getMergedMetaModelProperty()
	 * @generated
	 */
	EReference getMergedMetaModelProperty_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedOperation <em>Merged Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Operation</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperation
	 * @generated
	 */
	EClass getMergedOperation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.merged.MergedOperation#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Post</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperation#getPost()
	 * @see #getMergedOperation()
	 * @generated
	 */
	EReference getMergedOperation_Post();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.merged.MergedOperation#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pre</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperation#getPre()
	 * @see #getMergedOperation()
	 * @generated
	 */
	EReference getMergedOperation_Pre();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition <em>Merged Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Operation Definition</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperationDefinition
	 * @generated
	 */
	EClass getMergedOperationDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperationDefinition#getName()
	 * @see #getMergedOperationDefinition()
	 * @generated
	 */
	EAttribute getMergedOperationDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperationDefinition#getParameter()
	 * @see #getMergedOperationDefinition()
	 * @generated
	 */
	EReference getMergedOperationDefinition_Parameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperationDefinition#getType()
	 * @see #getMergedOperationDefinition()
	 * @generated
	 */
	EReference getMergedOperationDefinition_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedOperationDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedOperationDefinition#getBody()
	 * @see #getMergedOperationDefinition()
	 * @generated
	 */
	EReference getMergedOperationDefinition_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedProperty <em>Merged Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Property</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedProperty
	 * @generated
	 */
	EClass getMergedProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedProperty#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Init</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedProperty#getInit()
	 * @see #getMergedProperty()
	 * @generated
	 */
	EReference getMergedProperty_Init();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedProperty#getDerive <em>Derive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Derive</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedProperty#getDerive()
	 * @see #getMergedProperty()
	 * @generated
	 */
	EReference getMergedProperty_Derive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition <em>Merged Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Property Definition</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedPropertyDefinition
	 * @generated
	 */
	EClass getMergedPropertyDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedPropertyDefinition#getName()
	 * @see #getMergedPropertyDefinition()
	 * @generated
	 */
	EAttribute getMergedPropertyDefinition_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedPropertyDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedPropertyDefinition#getType()
	 * @see #getMergedPropertyDefinition()
	 * @generated
	 */
	EReference getMergedPropertyDefinition_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.MergedType <em>Merged Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Type</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedType
	 * @generated
	 */
	EClass getMergedType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedType#getMergedLibrary <em>Merged Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merged Library</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedType#getMergedLibrary()
	 * @see #getMergedType()
	 * @generated
	 */
	EReference getMergedType_MergedLibrary();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.ocl.library.merged.MergedType#getConforms <em>Conforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conforms</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedType#getConforms()
	 * @see #getMergedType()
	 * @generated
	 */
	EReference getMergedType_Conforms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.merged.MergedType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedType#getOperation()
	 * @see #getMergedType()
	 * @generated
	 */
	EReference getMergedType_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.merged.MergedType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedType#getProperty()
	 * @see #getMergedType()
	 * @generated
	 */
	EReference getMergedType_Property();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedType#getInv <em>Inv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inv</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedType#getInv()
	 * @see #getMergedType()
	 * @generated
	 */
	EReference getMergedType_Inv();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.OCLBoundCollectionType <em>OCL Bound Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Bound Collection Type</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLBoundCollectionType
	 * @generated
	 */
	EClass getOCLBoundCollectionType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.OCLClassifier <em>OCL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Classifier</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLClassifier
	 * @generated
	 */
	EClass getOCLClassifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.OCLClassifier#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLClassifier#getMetaModelElement()
	 * @see #getOCLClassifier()
	 * @generated
	 */
	EReference getOCLClassifier_MetaModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.OCLDataType <em>OCL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Data Type</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLDataType
	 * @generated
	 */
	EClass getOCLDataType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.OCLDataType#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLDataType#getMetaModelElement()
	 * @see #getOCLDataType()
	 * @generated
	 */
	EReference getOCLDataType_MetaModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.OCLEnumeration <em>OCL Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Enumeration</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLEnumeration
	 * @generated
	 */
	EClass getOCLEnumeration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.OCLEnumeration#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLEnumeration#getMetaModelElement()
	 * @see #getOCLEnumeration()
	 * @generated
	 */
	EReference getOCLEnumeration_MetaModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.ocl.library.merged.OCLEnumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLEnumeration#getLiterals()
	 * @see #getOCLEnumeration()
	 * @generated
	 */
	EReference getOCLEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral <em>OCL Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Enumeration Literal</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLEnumerationLiteral
	 * @generated
	 */
	EClass getOCLEnumerationLiteral();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getContainer()
	 * @see #getOCLEnumerationLiteral()
	 * @generated
	 */
	EReference getOCLEnumerationLiteral_Container();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLEnumerationLiteral#getMetaModelElement()
	 * @see #getOCLEnumerationLiteral()
	 * @generated
	 */
	EReference getOCLEnumerationLiteral_MetaModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.OCLMetaModelOperation <em>OCL Meta Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Meta Model Operation</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLMetaModelOperation
	 * @generated
	 */
	EClass getOCLMetaModelOperation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.OCLMetaModelOperation#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLMetaModelOperation#getMetaModelElement()
	 * @see #getOCLMetaModelOperation()
	 * @generated
	 */
	EReference getOCLMetaModelOperation_MetaModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.library.merged.OCLMetaModelProperty <em>OCL Meta Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Meta Model Property</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLMetaModelProperty
	 * @generated
	 */
	EClass getOCLMetaModelProperty();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.OCLMetaModelProperty#getMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Model Element</em>'.
	 * @see org.eclipse.ocl.library.merged.OCLMetaModelProperty#getMetaModelElement()
	 * @see #getOCLMetaModelProperty()
	 * @generated
	 */
	EReference getOCLMetaModelProperty_MetaModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.ocl.library.merged.MergedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.ocl.library.merged.MergedType#getType()
	 * @see #getMergedType()
	 * @generated
	 */
	EReference getMergedType_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OCLMergedLibraryFactory getOCLMergedLibraryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedLibraryImpl <em>Merged Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedLibraryImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedLibrary()
		 * @generated
		 */
		EClass MERGED_LIBRARY = eINSTANCE.getMergedLibrary();

		/**
		 * The meta object literal for the '<em><b>Base Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_LIBRARY__BASE_LIBRARY = eINSTANCE.getMergedLibrary_BaseLibrary();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedLibraryOperationImpl <em>Merged Library Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedLibraryOperationImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedLibraryOperation()
		 * @generated
		 */
		EClass MERGED_LIBRARY_OPERATION = eINSTANCE.getMergedLibraryOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_LIBRARY_OPERATION__OPERATION = eINSTANCE.getMergedLibraryOperation_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedLibraryPropertyImpl <em>Merged Library Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedLibraryPropertyImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedLibraryProperty()
		 * @generated
		 */
		EClass MERGED_LIBRARY_PROPERTY = eINSTANCE.getMergedLibraryProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_LIBRARY_PROPERTY__PROPERTY = eINSTANCE.getMergedLibraryProperty_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedMetaModelOperationImpl <em>Merged Meta Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedMetaModelOperationImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedMetaModelOperation()
		 * @generated
		 */
		EClass MERGED_META_MODEL_OPERATION = eINSTANCE.getMergedMetaModelOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_META_MODEL_OPERATION__OPERATION = eINSTANCE.getMergedMetaModelOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_META_MODEL_OPERATION__BODY = eINSTANCE.getMergedMetaModelOperation_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedMetaModelPropertyImpl <em>Merged Meta Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedMetaModelPropertyImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedMetaModelProperty()
		 * @generated
		 */
		EClass MERGED_META_MODEL_PROPERTY = eINSTANCE.getMergedMetaModelProperty();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_META_MODEL_PROPERTY__PROPERTY = eINSTANCE.getMergedMetaModelProperty_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedOperationImpl <em>Merged Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedOperationImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedOperation()
		 * @generated
		 */
		EClass MERGED_OPERATION = eINSTANCE.getMergedOperation();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_OPERATION__POST = eINSTANCE.getMergedOperation_Post();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_OPERATION__PRE = eINSTANCE.getMergedOperation_Pre();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl <em>Merged Operation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedOperationDefinitionImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedOperationDefinition()
		 * @generated
		 */
		EClass MERGED_OPERATION_DEFINITION = eINSTANCE.getMergedOperationDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_OPERATION_DEFINITION__NAME = eINSTANCE.getMergedOperationDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_OPERATION_DEFINITION__PARAMETER = eINSTANCE.getMergedOperationDefinition_Parameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_OPERATION_DEFINITION__TYPE = eINSTANCE.getMergedOperationDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_OPERATION_DEFINITION__BODY = eINSTANCE.getMergedOperationDefinition_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedPropertyImpl <em>Merged Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedPropertyImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedProperty()
		 * @generated
		 */
		EClass MERGED_PROPERTY = eINSTANCE.getMergedProperty();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_PROPERTY__INIT = eINSTANCE.getMergedProperty_Init();

		/**
		 * The meta object literal for the '<em><b>Derive</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_PROPERTY__DERIVE = eINSTANCE.getMergedProperty_Derive();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedPropertyDefinitionImpl <em>Merged Property Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedPropertyDefinitionImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedPropertyDefinition()
		 * @generated
		 */
		EClass MERGED_PROPERTY_DEFINITION = eINSTANCE.getMergedPropertyDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_PROPERTY_DEFINITION__NAME = eINSTANCE.getMergedPropertyDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_PROPERTY_DEFINITION__TYPE = eINSTANCE.getMergedPropertyDefinition_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.MergedTypeImpl <em>Merged Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.MergedTypeImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getMergedType()
		 * @generated
		 */
		EClass MERGED_TYPE = eINSTANCE.getMergedType();

		/**
		 * The meta object literal for the '<em><b>Merged Library</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_TYPE__MERGED_LIBRARY = eINSTANCE.getMergedType_MergedLibrary();

		/**
		 * The meta object literal for the '<em><b>Conforms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_TYPE__CONFORMS = eINSTANCE.getMergedType_Conforms();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_TYPE__OPERATION = eINSTANCE.getMergedType_Operation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_TYPE__PROPERTY = eINSTANCE.getMergedType_Property();

		/**
		 * The meta object literal for the '<em><b>Inv</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_TYPE__INV = eINSTANCE.getMergedType_Inv();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.OCLBoundCollectionTypeImpl <em>OCL Bound Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.OCLBoundCollectionTypeImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLBoundCollectionType()
		 * @generated
		 */
		EClass OCL_BOUND_COLLECTION_TYPE = eINSTANCE.getOCLBoundCollectionType();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.OCLClassifierImpl <em>OCL Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.OCLClassifierImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLClassifier()
		 * @generated
		 */
		EClass OCL_CLASSIFIER = eINSTANCE.getOCLClassifier();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CLASSIFIER__META_MODEL_ELEMENT = eINSTANCE.getOCLClassifier_MetaModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.OCLDataTypeImpl <em>OCL Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.OCLDataTypeImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLDataType()
		 * @generated
		 */
		EClass OCL_DATA_TYPE = eINSTANCE.getOCLDataType();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_DATA_TYPE__META_MODEL_ELEMENT = eINSTANCE.getOCLDataType_MetaModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.OCLEnumerationImpl <em>OCL Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.OCLEnumerationImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLEnumeration()
		 * @generated
		 */
		EClass OCL_ENUMERATION = eINSTANCE.getOCLEnumeration();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION__META_MODEL_ELEMENT = eINSTANCE.getOCLEnumeration_MetaModelElement();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION__LITERALS = eINSTANCE.getOCLEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.OCLEnumerationLiteralImpl <em>OCL Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.OCLEnumerationLiteralImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLEnumerationLiteral()
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
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ENUMERATION_LITERAL__META_MODEL_ELEMENT = eINSTANCE.getOCLEnumerationLiteral_MetaModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.OCLMetaModelOperationImpl <em>OCL Meta Model Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.OCLMetaModelOperationImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLMetaModelOperation()
		 * @generated
		 */
		EClass OCL_META_MODEL_OPERATION = eINSTANCE.getOCLMetaModelOperation();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_META_MODEL_OPERATION__META_MODEL_ELEMENT = eINSTANCE.getOCLMetaModelOperation_MetaModelElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.library.merged.impl.OCLMetaModelPropertyImpl <em>OCL Meta Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.library.merged.impl.OCLMetaModelPropertyImpl
		 * @see org.eclipse.ocl.library.merged.impl.OCLMergedLibraryPackageImpl#getOCLMetaModelProperty()
		 * @generated
		 */
		EClass OCL_META_MODEL_PROPERTY = eINSTANCE.getOCLMetaModelProperty();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_META_MODEL_PROPERTY__META_MODEL_ELEMENT = eINSTANCE.getOCLMetaModelProperty_MetaModelElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_TYPE__TYPE = eINSTANCE.getMergedType_Type();

	}

} //OCLMergedLibraryPackage
