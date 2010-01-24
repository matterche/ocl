/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMergedLibrarySwitch.java,v 1.1.2.1 2010/01/24 07:41:11 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.merged.*;
import org.eclipse.ocl.library.merged.MergedLibrary;
import org.eclipse.ocl.library.merged.MergedOperation;
import org.eclipse.ocl.library.merged.MergedOperationDefinition;
import org.eclipse.ocl.library.merged.MergedLibraryOperation;
import org.eclipse.ocl.library.merged.MergedProperty;
import org.eclipse.ocl.library.merged.MergedPropertyDefinition;
import org.eclipse.ocl.library.merged.MergedLibraryProperty;
import org.eclipse.ocl.library.merged.MergedType;
import org.eclipse.ocl.library.merged.OCLMergedLibraryPackage;

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
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage
 * @generated
 */
public class OCLMergedLibrarySwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OCLMergedLibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMergedLibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = OCLMergedLibraryPackage.eINSTANCE;
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
			case OCLMergedLibraryPackage.MERGED_LIBRARY: {
				MergedLibrary mergedLibrary = (MergedLibrary)theEObject;
				T result = caseMergedLibrary(mergedLibrary);
				if (result == null) result = caseOCLNamedElement(mergedLibrary);
				if (result == null) result = caseOCLCache(mergedLibrary);
				if (result == null) result = caseOCLElement(mergedLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_LIBRARY_OPERATION: {
				MergedLibraryOperation mergedLibraryOperation = (MergedLibraryOperation)theEObject;
				T result = caseMergedLibraryOperation(mergedLibraryOperation);
				if (result == null) result = caseMergedOperation(mergedLibraryOperation);
				if (result == null) result = caseOCLElement(mergedLibraryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_LIBRARY_PROPERTY: {
				MergedLibraryProperty mergedLibraryProperty = (MergedLibraryProperty)theEObject;
				T result = caseMergedLibraryProperty(mergedLibraryProperty);
				if (result == null) result = caseMergedProperty(mergedLibraryProperty);
				if (result == null) result = caseOCLElement(mergedLibraryProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION: {
				MergedMetaModelOperation mergedMetaModelOperation = (MergedMetaModelOperation)theEObject;
				T result = caseMergedMetaModelOperation(mergedMetaModelOperation);
				if (result == null) result = caseMergedOperation(mergedMetaModelOperation);
				if (result == null) result = caseOCLElement(mergedMetaModelOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY: {
				MergedMetaModelProperty mergedMetaModelProperty = (MergedMetaModelProperty)theEObject;
				T result = caseMergedMetaModelProperty(mergedMetaModelProperty);
				if (result == null) result = caseMergedProperty(mergedMetaModelProperty);
				if (result == null) result = caseOCLElement(mergedMetaModelProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_OPERATION: {
				MergedOperation mergedOperation = (MergedOperation)theEObject;
				T result = caseMergedOperation(mergedOperation);
				if (result == null) result = caseOCLElement(mergedOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION: {
				MergedOperationDefinition mergedOperationDefinition = (MergedOperationDefinition)theEObject;
				T result = caseMergedOperationDefinition(mergedOperationDefinition);
				if (result == null) result = caseMergedOperation(mergedOperationDefinition);
				if (result == null) result = caseOCLElement(mergedOperationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_PROPERTY: {
				MergedProperty mergedProperty = (MergedProperty)theEObject;
				T result = caseMergedProperty(mergedProperty);
				if (result == null) result = caseOCLElement(mergedProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_PROPERTY_DEFINITION: {
				MergedPropertyDefinition mergedPropertyDefinition = (MergedPropertyDefinition)theEObject;
				T result = caseMergedPropertyDefinition(mergedPropertyDefinition);
				if (result == null) result = caseMergedProperty(mergedPropertyDefinition);
				if (result == null) result = caseOCLElement(mergedPropertyDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCLMergedLibraryPackage.MERGED_TYPE: {
				MergedType mergedType = (MergedType)theEObject;
				T result = caseMergedType(mergedType);
				if (result == null) result = caseOCLElement(mergedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedLibrary(MergedLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Library Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Library Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedLibraryOperation(MergedLibraryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Library Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Library Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedLibraryProperty(MergedLibraryProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Meta Model Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Meta Model Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedMetaModelOperation(MergedMetaModelOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Meta Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Meta Model Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedMetaModelProperty(MergedMetaModelProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedOperation(MergedOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Operation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedOperationDefinition(MergedOperationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedProperty(MergedProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Property Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Property Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedPropertyDefinition(MergedPropertyDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedType(MergedType object) {
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

} //OCLMergedLibrarySwitch
