/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreLibrarySwitch.java,v 1.1.2.2 2010/01/24 07:40:43 ewillink Exp $
 */
package org.eclipse.ocl.ecore.library.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ecore.library.EcoreLibraryPackage;
import org.eclipse.ocl.ecore.library.EcoreOCLClassifier;
import org.eclipse.ocl.ecore.library.EcoreOCLDataType;
import org.eclipse.ocl.ecore.library.EcoreOCLEnumeration;
import org.eclipse.ocl.ecore.library.EcoreOCLEnumerationLiteral;
import org.eclipse.ocl.ecore.library.EcoreOCLOperation;
import org.eclipse.ocl.ecore.library.EcoreOCLProperty;
import org.eclipse.ocl.library.OCLClassifier;
import org.eclipse.ocl.library.OCLDataType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLEnumeration;
import org.eclipse.ocl.library.OCLEnumerationLiteral;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLMetaModelProperty;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.ecore.library.EcoreLibraryPackage
 * @generated
 */
public class EcoreLibrarySwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcoreLibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreLibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = EcoreLibraryPackage.eINSTANCE;
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
			case EcoreLibraryPackage.ECORE_OCL_CLASSIFIER: {
				EcoreOCLClassifier ecoreOCLClassifier = (EcoreOCLClassifier)theEObject;
				T result = caseEcoreOCLClassifier(ecoreOCLClassifier);
				if (result == null) result = caseOCLClassifier(ecoreOCLClassifier);
				if (result == null) result = caseOCLType(ecoreOCLClassifier);
				if (result == null) result = caseOCLNamedElement(ecoreOCLClassifier);
				if (result == null) result = caseOCLElement(ecoreOCLClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreLibraryPackage.ECORE_OCL_DATA_TYPE: {
				EcoreOCLDataType ecoreOCLDataType = (EcoreOCLDataType)theEObject;
				T result = caseEcoreOCLDataType(ecoreOCLDataType);
				if (result == null) result = caseOCLDataType(ecoreOCLDataType);
				if (result == null) result = caseOCLType(ecoreOCLDataType);
				if (result == null) result = caseOCLNamedElement(ecoreOCLDataType);
				if (result == null) result = caseOCLElement(ecoreOCLDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreLibraryPackage.ECORE_OCL_ENUMERATION: {
				EcoreOCLEnumeration ecoreOCLEnumeration = (EcoreOCLEnumeration)theEObject;
				T result = caseEcoreOCLEnumeration(ecoreOCLEnumeration);
				if (result == null) result = caseOCLEnumeration(ecoreOCLEnumeration);
				if (result == null) result = caseOCLType(ecoreOCLEnumeration);
				if (result == null) result = caseOCLNamedElement(ecoreOCLEnumeration);
				if (result == null) result = caseOCLElement(ecoreOCLEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreLibraryPackage.ECORE_OCL_ENUMERATION_LITERAL: {
				EcoreOCLEnumerationLiteral ecoreOCLEnumerationLiteral = (EcoreOCLEnumerationLiteral)theEObject;
				T result = caseEcoreOCLEnumerationLiteral(ecoreOCLEnumerationLiteral);
				if (result == null) result = caseOCLEnumerationLiteral(ecoreOCLEnumerationLiteral);
				if (result == null) result = caseOCLNamedElement(ecoreOCLEnumerationLiteral);
				if (result == null) result = caseOCLElement(ecoreOCLEnumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreLibraryPackage.ECORE_OCL_OPERATION: {
				EcoreOCLOperation ecoreOCLOperation = (EcoreOCLOperation)theEObject;
				T result = caseEcoreOCLOperation(ecoreOCLOperation);
				if (result == null) result = caseOCLMetaModelOperation(ecoreOCLOperation);
				if (result == null) result = caseOCLOperation(ecoreOCLOperation);
				if (result == null) result = caseOCLTypedElement(ecoreOCLOperation);
				if (result == null) result = caseOCLNamedElement(ecoreOCLOperation);
				if (result == null) result = caseOCLElement(ecoreOCLOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcoreLibraryPackage.ECORE_OCL_PROPERTY: {
				EcoreOCLProperty ecoreOCLProperty = (EcoreOCLProperty)theEObject;
				T result = caseEcoreOCLProperty(ecoreOCLProperty);
				if (result == null) result = caseOCLMetaModelProperty(ecoreOCLProperty);
				if (result == null) result = caseOCLProperty(ecoreOCLProperty);
				if (result == null) result = caseOCLTypedElement(ecoreOCLProperty);
				if (result == null) result = caseOCLNamedElement(ecoreOCLProperty);
				if (result == null) result = caseOCLElement(ecoreOCLProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore OCL Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore OCL Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreOCLClassifier(EcoreOCLClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore OCL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore OCL Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreOCLDataType(EcoreOCLDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore OCL Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore OCL Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreOCLEnumeration(EcoreOCLEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore OCL Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore OCL Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreOCLEnumerationLiteral(EcoreOCLEnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore OCL Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore OCL Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreOCLOperation(EcoreOCLOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ecore OCL Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecore OCL Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcoreOCLProperty(EcoreOCLProperty object) {
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

} //EcoreLibrarySwitch
