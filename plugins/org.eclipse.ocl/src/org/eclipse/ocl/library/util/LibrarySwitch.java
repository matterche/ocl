/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibrarySwitch.java,v 1.1.2.4 2010/01/18 08:57:51 ewillink Exp $
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
			case LibraryPackage.LIBRARY_OPERATION: {
				LibraryOperation libraryOperation = (LibraryOperation)theEObject;
				T result = caseLibraryOperation(libraryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_CONSTRAINT_OPERATION: {
				OCLConstraintOperation oclConstraintOperation = (OCLConstraintOperation)theEObject;
				T result = caseOCLConstraintOperation(oclConstraintOperation);
				if (result == null) result = caseOCLOperation(oclConstraintOperation);
				if (result == null) result = caseOCLElement(oclConstraintOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_CONSTRAINT_PROPERTY: {
				OCLConstraintProperty oclConstraintProperty = (OCLConstraintProperty)theEObject;
				T result = caseOCLConstraintProperty(oclConstraintProperty);
				if (result == null) result = caseOCLProperty(oclConstraintProperty);
				if (result == null) result = caseOCLElement(oclConstraintProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ELEMENT: {
				OCLElement oclElement = (OCLElement)theEObject;
				T result = caseOCLElement(oclElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_GENERIC_TYPE: {
				OCLGenericType oclGenericType = (OCLGenericType)theEObject;
				T result = caseOCLGenericType(oclGenericType);
				if (result == null) result = caseOCLType(oclGenericType);
				if (result == null) result = caseOCLElement(oclGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_INVALID_TYPE: {
				OCLInvalidType oclInvalidType = (OCLInvalidType)theEObject;
				T result = caseOCLInvalidType(oclInvalidType);
				if (result == null) result = caseOCLType(oclInvalidType);
				if (result == null) result = caseOCLElement(oclInvalidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_LIBRARY_OPERATION: {
				OCLLibraryOperation oclLibraryOperation = (OCLLibraryOperation)theEObject;
				T result = caseOCLLibraryOperation(oclLibraryOperation);
				if (result == null) result = caseOCLOperation(oclLibraryOperation);
				if (result == null) result = caseOCLElement(oclLibraryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_LIBRARY_PROPERTY: {
				OCLLibraryProperty oclLibraryProperty = (OCLLibraryProperty)theEObject;
				T result = caseOCLLibraryProperty(oclLibraryProperty);
				if (result == null) result = caseOCLProperty(oclLibraryProperty);
				if (result == null) result = caseOCLElement(oclLibraryProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_META_MODEL_OPERATION: {
				OCLMetaModelOperation oclMetaModelOperation = (OCLMetaModelOperation)theEObject;
				T result = caseOCLMetaModelOperation(oclMetaModelOperation);
				if (result == null) result = caseOCLOperation(oclMetaModelOperation);
				if (result == null) result = caseOCLElement(oclMetaModelOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_META_MODEL_PROPERTY: {
				OCLMetaModelProperty oclMetaModelProperty = (OCLMetaModelProperty)theEObject;
				T result = caseOCLMetaModelProperty(oclMetaModelProperty);
				if (result == null) result = caseOCLProperty(oclMetaModelProperty);
				if (result == null) result = caseOCLElement(oclMetaModelProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_OPERATION: {
				OCLOperation oclOperation = (OCLOperation)theEObject;
				T result = caseOCLOperation(oclOperation);
				if (result == null) result = caseOCLElement(oclOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_PACKAGE: {
				OCLPackage oclPackage = (OCLPackage)theEObject;
				T result = caseOCLPackage(oclPackage);
				if (result == null) result = caseOCLElement(oclPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_PARAMETER: {
				OCLParameter oclParameter = (OCLParameter)theEObject;
				T result = caseOCLParameter(oclParameter);
				if (result == null) result = caseOCLElement(oclParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_PROPERTY: {
				OCLProperty oclProperty = (OCLProperty)theEObject;
				T result = caseOCLProperty(oclProperty);
				if (result == null) result = caseOCLElement(oclProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TYPE: {
				OCLType oclType = (OCLType)theEObject;
				T result = caseOCLType(oclType);
				if (result == null) result = caseOCLElement(oclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_VOID_TYPE: {
				OCLVoidType oclVoidType = (OCLVoidType)theEObject;
				T result = caseOCLVoidType(oclVoidType);
				if (result == null) result = caseOCLType(oclVoidType);
				if (result == null) result = caseOCLElement(oclVoidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryOperation(LibraryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Constraint Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Constraint Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLConstraintOperation(OCLConstraintOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Constraint Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Constraint Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLConstraintProperty(OCLConstraintProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>OCL Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLGenericType(OCLGenericType object) {
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

} //LibrarySwitch
