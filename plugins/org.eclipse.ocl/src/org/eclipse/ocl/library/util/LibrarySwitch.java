/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibrarySwitch.java,v 1.1.2.8 2010/01/24 07:41:02 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.library.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.LibraryPackage
 * @generated
 */
public class LibrarySwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = LibraryPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LibraryPackage.OCL_LIBRARY: {
				OCLLibrary oclLibrary = (OCLLibrary)theEObject;
				T result = caseOCLLibrary(oclLibrary);
				if (result == null) result = caseOCLPackageParent(oclLibrary);
				if (result == null) result = caseOCLNamedElement(oclLibrary);
				if (result == null) result = caseOCLElement(oclLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ANY_TYPE: {
				OCLAnyType oclAnyType = (OCLAnyType)theEObject;
				T result = caseOCLAnyType(oclAnyType);
				if (result == null) result = caseOCLType(oclAnyType);
				if (result == null) result = caseOCLNamedElement(oclAnyType);
				if (result == null) result = caseOCLElement(oclAnyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_BAG_TYPE: {
				OCLBagType oclBagType = (OCLBagType)theEObject;
				T result = caseOCLBagType(oclBagType);
				if (result == null) result = caseOCLNonOrderedCollectionType(oclBagType);
				if (result == null) result = caseOCLNonUniqueCollectionType(oclBagType);
				if (result == null) result = caseOCLCollectionType(oclBagType);
				if (result == null) result = caseOCLType(oclBagType);
				if (result == null) result = caseOCLNamedElement(oclBagType);
				if (result == null) result = caseOCLElement(oclBagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_CACHE: {
				OCLCache oclCache = (OCLCache)theEObject;
				T result = caseOCLCache(oclCache);
				if (result == null) result = caseOCLElement(oclCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_CLASSIFIER: {
				OCLClassifier oclClassifier = (OCLClassifier)theEObject;
				T result = caseOCLClassifier(oclClassifier);
				if (result == null) result = caseOCLType(oclClassifier);
				if (result == null) result = caseOCLNamedElement(oclClassifier);
				if (result == null) result = caseOCLElement(oclClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_COLLECTION_TYPE: {
				OCLCollectionType oclCollectionType = (OCLCollectionType)theEObject;
				T result = caseOCLCollectionType(oclCollectionType);
				if (result == null) result = caseOCLType(oclCollectionType);
				if (result == null) result = caseOCLNamedElement(oclCollectionType);
				if (result == null) result = caseOCLElement(oclCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_DATA_TYPE: {
				OCLDataType oclDataType = (OCLDataType)theEObject;
				T result = caseOCLDataType(oclDataType);
				if (result == null) result = caseOCLType(oclDataType);
				if (result == null) result = caseOCLNamedElement(oclDataType);
				if (result == null) result = caseOCLElement(oclDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ELEMENT: {
				OCLElement oclElement = (OCLElement)theEObject;
				T result = caseOCLElement(oclElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ENUMERATION: {
				OCLEnumeration oclEnumeration = (OCLEnumeration)theEObject;
				T result = caseOCLEnumeration(oclEnumeration);
				if (result == null) result = caseOCLType(oclEnumeration);
				if (result == null) result = caseOCLNamedElement(oclEnumeration);
				if (result == null) result = caseOCLElement(oclEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ENUMERATION_LITERAL: {
				OCLEnumerationLiteral oclEnumerationLiteral = (OCLEnumerationLiteral)theEObject;
				T result = caseOCLEnumerationLiteral(oclEnumerationLiteral);
				if (result == null) result = caseOCLNamedElement(oclEnumerationLiteral);
				if (result == null) result = caseOCLElement(oclEnumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_INVALID_TYPE: {
				OCLInvalidType oclInvalidType = (OCLInvalidType)theEObject;
				T result = caseOCLInvalidType(oclInvalidType);
				if (result == null) result = caseOCLType(oclInvalidType);
				if (result == null) result = caseOCLNamedElement(oclInvalidType);
				if (result == null) result = caseOCLElement(oclInvalidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_LIBRARY_OPERATION: {
				OCLLibraryOperation oclLibraryOperation = (OCLLibraryOperation)theEObject;
				T result = caseOCLLibraryOperation(oclLibraryOperation);
				if (result == null) result = caseOCLOperation(oclLibraryOperation);
				if (result == null) result = caseOCLTypedElement(oclLibraryOperation);
				if (result == null) result = caseOCLNamedElement(oclLibraryOperation);
				if (result == null) result = caseOCLElement(oclLibraryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_LIBRARY_PROPERTY: {
				OCLLibraryProperty oclLibraryProperty = (OCLLibraryProperty)theEObject;
				T result = caseOCLLibraryProperty(oclLibraryProperty);
				if (result == null) result = caseOCLProperty(oclLibraryProperty);
				if (result == null) result = caseOCLTypedElement(oclLibraryProperty);
				if (result == null) result = caseOCLNamedElement(oclLibraryProperty);
				if (result == null) result = caseOCLElement(oclLibraryProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_META_MODEL_OPERATION: {
				OCLMetaModelOperation oclMetaModelOperation = (OCLMetaModelOperation)theEObject;
				T result = caseOCLMetaModelOperation(oclMetaModelOperation);
				if (result == null) result = caseOCLOperation(oclMetaModelOperation);
				if (result == null) result = caseOCLTypedElement(oclMetaModelOperation);
				if (result == null) result = caseOCLNamedElement(oclMetaModelOperation);
				if (result == null) result = caseOCLElement(oclMetaModelOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_META_MODEL_PROPERTY: {
				OCLMetaModelProperty oclMetaModelProperty = (OCLMetaModelProperty)theEObject;
				T result = caseOCLMetaModelProperty(oclMetaModelProperty);
				if (result == null) result = caseOCLProperty(oclMetaModelProperty);
				if (result == null) result = caseOCLTypedElement(oclMetaModelProperty);
				if (result == null) result = caseOCLNamedElement(oclMetaModelProperty);
				if (result == null) result = caseOCLElement(oclMetaModelProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_NAMED_ELEMENT: {
				OCLNamedElement oclNamedElement = (OCLNamedElement)theEObject;
				T result = caseOCLNamedElement(oclNamedElement);
				if (result == null) result = caseOCLElement(oclNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_NON_ORDERED_COLLECTION_TYPE: {
				OCLNonOrderedCollectionType oclNonOrderedCollectionType = (OCLNonOrderedCollectionType)theEObject;
				T result = caseOCLNonOrderedCollectionType(oclNonOrderedCollectionType);
				if (result == null) result = caseOCLCollectionType(oclNonOrderedCollectionType);
				if (result == null) result = caseOCLType(oclNonOrderedCollectionType);
				if (result == null) result = caseOCLNamedElement(oclNonOrderedCollectionType);
				if (result == null) result = caseOCLElement(oclNonOrderedCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_NON_UNIQUE_COLLECTION_TYPE: {
				OCLNonUniqueCollectionType oclNonUniqueCollectionType = (OCLNonUniqueCollectionType)theEObject;
				T result = caseOCLNonUniqueCollectionType(oclNonUniqueCollectionType);
				if (result == null) result = caseOCLCollectionType(oclNonUniqueCollectionType);
				if (result == null) result = caseOCLType(oclNonUniqueCollectionType);
				if (result == null) result = caseOCLNamedElement(oclNonUniqueCollectionType);
				if (result == null) result = caseOCLElement(oclNonUniqueCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_OPERATION: {
				OCLOperation oclOperation = (OCLOperation)theEObject;
				T result = caseOCLOperation(oclOperation);
				if (result == null) result = caseOCLTypedElement(oclOperation);
				if (result == null) result = caseOCLNamedElement(oclOperation);
				if (result == null) result = caseOCLElement(oclOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ORDERED_COLLECTION_TYPE: {
				OCLOrderedCollectionType oclOrderedCollectionType = (OCLOrderedCollectionType)theEObject;
				T result = caseOCLOrderedCollectionType(oclOrderedCollectionType);
				if (result == null) result = caseOCLCollectionType(oclOrderedCollectionType);
				if (result == null) result = caseOCLType(oclOrderedCollectionType);
				if (result == null) result = caseOCLNamedElement(oclOrderedCollectionType);
				if (result == null) result = caseOCLElement(oclOrderedCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ORDERED_SET_TYPE: {
				OCLOrderedSetType oclOrderedSetType = (OCLOrderedSetType)theEObject;
				T result = caseOCLOrderedSetType(oclOrderedSetType);
				if (result == null) result = caseOCLOrderedCollectionType(oclOrderedSetType);
				if (result == null) result = caseOCLUniqueCollectionType(oclOrderedSetType);
				if (result == null) result = caseOCLCollectionType(oclOrderedSetType);
				if (result == null) result = caseOCLType(oclOrderedSetType);
				if (result == null) result = caseOCLNamedElement(oclOrderedSetType);
				if (result == null) result = caseOCLElement(oclOrderedSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_PACKAGE: {
				OCLPackage oclPackage = (OCLPackage)theEObject;
				T result = caseOCLPackage(oclPackage);
				if (result == null) result = caseOCLPackageParent(oclPackage);
				if (result == null) result = caseOCLNamedElement(oclPackage);
				if (result == null) result = caseOCLElement(oclPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_PACKAGE_PARENT: {
				OCLPackageParent oclPackageParent = (OCLPackageParent)theEObject;
				T result = caseOCLPackageParent(oclPackageParent);
				if (result == null) result = caseOCLNamedElement(oclPackageParent);
				if (result == null) result = caseOCLElement(oclPackageParent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_PARAMETER: {
				OCLParameter oclParameter = (OCLParameter)theEObject;
				T result = caseOCLParameter(oclParameter);
				if (result == null) result = caseOCLTypedElement(oclParameter);
				if (result == null) result = caseOCLNamedElement(oclParameter);
				if (result == null) result = caseOCLElement(oclParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TEMPLATE_PARAMETER_TYPE: {
				OCLTemplateParameterType oclTemplateParameterType = (OCLTemplateParameterType)theEObject;
				T result = caseOCLTemplateParameterType(oclTemplateParameterType);
				if (result == null) result = caseOCLType(oclTemplateParameterType);
				if (result == null) result = caseOCLNamedElement(oclTemplateParameterType);
				if (result == null) result = caseOCLElement(oclTemplateParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_PROPERTY: {
				OCLProperty oclProperty = (OCLProperty)theEObject;
				T result = caseOCLProperty(oclProperty);
				if (result == null) result = caseOCLTypedElement(oclProperty);
				if (result == null) result = caseOCLNamedElement(oclProperty);
				if (result == null) result = caseOCLElement(oclProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ROOT: {
				OCLRoot oclRoot = (OCLRoot)theEObject;
				T result = caseOCLRoot(oclRoot);
				if (result == null) result = caseOCLLibrary(oclRoot);
				if (result == null) result = caseOCLCache(oclRoot);
				if (result == null) result = caseOCLPackageParent(oclRoot);
				if (result == null) result = caseOCLNamedElement(oclRoot);
				if (result == null) result = caseOCLElement(oclRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_SEQUENCE_TYPE: {
				OCLSequenceType oclSequenceType = (OCLSequenceType)theEObject;
				T result = caseOCLSequenceType(oclSequenceType);
				if (result == null) result = caseOCLOrderedCollectionType(oclSequenceType);
				if (result == null) result = caseOCLNonUniqueCollectionType(oclSequenceType);
				if (result == null) result = caseOCLCollectionType(oclSequenceType);
				if (result == null) result = caseOCLType(oclSequenceType);
				if (result == null) result = caseOCLNamedElement(oclSequenceType);
				if (result == null) result = caseOCLElement(oclSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_SET_TYPE: {
				OCLSetType oclSetType = (OCLSetType)theEObject;
				T result = caseOCLSetType(oclSetType);
				if (result == null) result = caseOCLUniqueCollectionType(oclSetType);
				if (result == null) result = caseOCLNonOrderedCollectionType(oclSetType);
				if (result == null) result = caseOCLCollectionType(oclSetType);
				if (result == null) result = caseOCLType(oclSetType);
				if (result == null) result = caseOCLNamedElement(oclSetType);
				if (result == null) result = caseOCLElement(oclSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TUPLE_TYPE: {
				OCLTupleType oclTupleType = (OCLTupleType)theEObject;
				T result = caseOCLTupleType(oclTupleType);
				if (result == null) result = caseOCLType(oclTupleType);
				if (result == null) result = caseOCLNamedElement(oclTupleType);
				if (result == null) result = caseOCLElement(oclTupleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TYPE: {
				OCLType oclType = (OCLType)theEObject;
				T result = caseOCLType(oclType);
				if (result == null) result = caseOCLNamedElement(oclType);
				if (result == null) result = caseOCLElement(oclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TYPED_ELEMENT: {
				OCLTypedElement oclTypedElement = (OCLTypedElement)theEObject;
				T result = caseOCLTypedElement(oclTypedElement);
				if (result == null) result = caseOCLNamedElement(oclTypedElement);
				if (result == null) result = caseOCLElement(oclTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_UNIQUE_COLLECTION_TYPE: {
				OCLUniqueCollectionType oclUniqueCollectionType = (OCLUniqueCollectionType)theEObject;
				T result = caseOCLUniqueCollectionType(oclUniqueCollectionType);
				if (result == null) result = caseOCLCollectionType(oclUniqueCollectionType);
				if (result == null) result = caseOCLType(oclUniqueCollectionType);
				if (result == null) result = caseOCLNamedElement(oclUniqueCollectionType);
				if (result == null) result = caseOCLElement(oclUniqueCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_VOID_TYPE: {
				OCLVoidType oclVoidType = (OCLVoidType)theEObject;
				T result = caseOCLVoidType(oclVoidType);
				if (result == null) result = caseOCLType(oclVoidType);
				if (result == null) result = caseOCLNamedElement(oclVoidType);
				if (result == null) result = caseOCLElement(oclVoidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLLibrary(OCLLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLAnyType(OCLAnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLBagType(OCLBagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLCache(OCLCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLClassifier(OCLClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLCollectionType(OCLCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLDataType(OCLDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLElement(OCLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLEnumeration(OCLEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLEnumerationLiteral(OCLEnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Invalid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Invalid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLInvalidType(OCLInvalidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Library Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Library Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLLibraryOperation(OCLLibraryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Library Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Library Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLLibraryProperty(OCLLibraryProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Meta Model Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Meta Model Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLMetaModelOperation(OCLMetaModelOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Meta Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Meta Model Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLMetaModelProperty(OCLMetaModelProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLNamedElement(OCLNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Non Ordered Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Non Ordered Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLNonOrderedCollectionType(OCLNonOrderedCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Non Unique Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Non Unique Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLNonUniqueCollectionType(OCLNonUniqueCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLOperation(OCLOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Ordered Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Ordered Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLOrderedCollectionType(OCLOrderedCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Ordered Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Ordered Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLOrderedSetType(OCLOrderedSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLPackage(OCLPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Package Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Package Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLPackageParent(OCLPackageParent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLParameter(OCLParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Template Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Template Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLTemplateParameterType(OCLTemplateParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLProperty(OCLProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLRoot(OCLRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Tuple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Tuple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLTupleType(OCLTupleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLType(OCLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLTypedElement(OCLTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Unique Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Unique Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLUniqueCollectionType(OCLUniqueCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLVoidType(OCLVoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLSequenceType(OCLSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLSetType(OCLSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OCLLibrarySwitch
