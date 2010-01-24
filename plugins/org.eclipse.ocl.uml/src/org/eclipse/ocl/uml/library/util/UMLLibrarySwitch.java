/**
 * <copyright>
 * </copyright>
 *
 * $Id: UMLLibrarySwitch.java,v 1.1.2.2 2010/01/24 07:40:39 ewillink Exp $
 */
package org.eclipse.ocl.uml.library.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.ocl.uml.library.UMLLibraryPackage;
import org.eclipse.ocl.uml.library.UMLOCLClassifier;
import org.eclipse.ocl.uml.library.UMLOCLDataType;
import org.eclipse.ocl.uml.library.UMLOCLEnumeration;
import org.eclipse.ocl.uml.library.UMLOCLEnumerationLiteral;
import org.eclipse.ocl.uml.library.UMLOCLOperation;
import org.eclipse.ocl.uml.library.UMLOCLProperty;

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
 * @see org.eclipse.ocl.uml.library.UMLLibraryPackage
 * @generated
 */
public class UMLLibrarySwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLLibraryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLLibrarySwitch() {
		if (modelPackage == null) {
			modelPackage = UMLLibraryPackage.eINSTANCE;
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
			case UMLLibraryPackage.UMLOCL_CLASSIFIER: {
				UMLOCLClassifier umloclClassifier = (UMLOCLClassifier)theEObject;
				T result = caseUMLOCLClassifier(umloclClassifier);
				if (result == null) result = caseOCLClassifier(umloclClassifier);
				if (result == null) result = caseOCLType(umloclClassifier);
				if (result == null) result = caseOCLNamedElement(umloclClassifier);
				if (result == null) result = caseOCLElement(umloclClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLLibraryPackage.UMLOCL_DATA_TYPE: {
				UMLOCLDataType umloclDataType = (UMLOCLDataType)theEObject;
				T result = caseUMLOCLDataType(umloclDataType);
				if (result == null) result = caseOCLDataType(umloclDataType);
				if (result == null) result = caseOCLType(umloclDataType);
				if (result == null) result = caseOCLNamedElement(umloclDataType);
				if (result == null) result = caseOCLElement(umloclDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLLibraryPackage.UMLOCL_ENUMERATION: {
				UMLOCLEnumeration umloclEnumeration = (UMLOCLEnumeration)theEObject;
				T result = caseUMLOCLEnumeration(umloclEnumeration);
				if (result == null) result = caseOCLEnumeration(umloclEnumeration);
				if (result == null) result = caseOCLType(umloclEnumeration);
				if (result == null) result = caseOCLNamedElement(umloclEnumeration);
				if (result == null) result = caseOCLElement(umloclEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLLibraryPackage.UMLOCL_ENUMERATION_LITERAL: {
				UMLOCLEnumerationLiteral umloclEnumerationLiteral = (UMLOCLEnumerationLiteral)theEObject;
				T result = caseUMLOCLEnumerationLiteral(umloclEnumerationLiteral);
				if (result == null) result = caseOCLEnumerationLiteral(umloclEnumerationLiteral);
				if (result == null) result = caseOCLNamedElement(umloclEnumerationLiteral);
				if (result == null) result = caseOCLElement(umloclEnumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLLibraryPackage.UMLOCL_OPERATION: {
				UMLOCLOperation umloclOperation = (UMLOCLOperation)theEObject;
				T result = caseUMLOCLOperation(umloclOperation);
				if (result == null) result = caseOCLMetaModelOperation(umloclOperation);
				if (result == null) result = caseOCLOperation(umloclOperation);
				if (result == null) result = caseOCLTypedElement(umloclOperation);
				if (result == null) result = caseOCLNamedElement(umloclOperation);
				if (result == null) result = caseOCLElement(umloclOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLLibraryPackage.UMLOCL_PROPERTY: {
				UMLOCLProperty umloclProperty = (UMLOCLProperty)theEObject;
				T result = caseUMLOCLProperty(umloclProperty);
				if (result == null) result = caseOCLMetaModelProperty(umloclProperty);
				if (result == null) result = caseOCLProperty(umloclProperty);
				if (result == null) result = caseOCLTypedElement(umloclProperty);
				if (result == null) result = caseOCLNamedElement(umloclProperty);
				if (result == null) result = caseOCLElement(umloclProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UMLOCL Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UMLOCL Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLOCLClassifier(UMLOCLClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UMLOCL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UMLOCL Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLOCLDataType(UMLOCLDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UMLOCL Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UMLOCL Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLOCLEnumeration(UMLOCLEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UMLOCL Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UMLOCL Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLOCLEnumerationLiteral(UMLOCLEnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UMLOCL Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UMLOCL Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLOCLOperation(UMLOCLOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UMLOCL Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UMLOCL Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLOCLProperty(UMLOCLProperty object) {
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

} //UMLLibrarySwitch
