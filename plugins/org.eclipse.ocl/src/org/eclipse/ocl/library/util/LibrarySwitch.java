/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibrarySwitch.java,v 1.1.2.10 2010/01/30 20:15:35 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLDeprecatedType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLIterator;
import org.eclipse.ocl.library.OCLJavaType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLNamedElement;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLPackageParent;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLRoot;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLTypeBinding;
import org.eclipse.ocl.library.OCLTypeParameter;
import org.eclipse.ocl.library.OCLTypeParameterParent;
import org.eclipse.ocl.library.OCLTypeValue;
import org.eclipse.ocl.library.OCLTypedElement;
import org.eclipse.ocl.library.OCLVoidType;

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
			case LibraryPackage.OCL_ANY_TYPE: {
				OCLAnyType oclAnyType = (OCLAnyType)theEObject;
				T result = caseOCLAnyType(oclAnyType);
				if (result == null) result = caseOCLConcreteType(oclAnyType);
				if (result == null) result = caseOCLType(oclAnyType);
				if (result == null) result = caseOCLTypeParameterParent(oclAnyType);
				if (result == null) result = caseOCLTypeValue(oclAnyType);
				if (result == null) result = caseOCLNamedElement(oclAnyType);
				if (result == null) result = caseOCLElement(oclAnyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_BOUND_TYPE: {
				OCLBoundType oclBoundType = (OCLBoundType)theEObject;
				T result = caseOCLBoundType(oclBoundType);
				if (result == null) result = caseOCLType(oclBoundType);
				if (result == null) result = caseOCLTypeValue(oclBoundType);
				if (result == null) result = caseOCLElement(oclBoundType);
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
			case LibraryPackage.OCL_CONCRETE_TYPE: {
				OCLConcreteType oclConcreteType = (OCLConcreteType)theEObject;
				T result = caseOCLConcreteType(oclConcreteType);
				if (result == null) result = caseOCLType(oclConcreteType);
				if (result == null) result = caseOCLTypeParameterParent(oclConcreteType);
				if (result == null) result = caseOCLTypeValue(oclConcreteType);
				if (result == null) result = caseOCLNamedElement(oclConcreteType);
				if (result == null) result = caseOCLElement(oclConcreteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_DEPRECATED_TYPE: {
				OCLDeprecatedType oclDeprecatedType = (OCLDeprecatedType)theEObject;
				T result = caseOCLDeprecatedType(oclDeprecatedType);
				if (result == null) result = caseOCLConcreteType(oclDeprecatedType);
				if (result == null) result = caseOCLType(oclDeprecatedType);
				if (result == null) result = caseOCLTypeParameterParent(oclDeprecatedType);
				if (result == null) result = caseOCLTypeValue(oclDeprecatedType);
				if (result == null) result = caseOCLNamedElement(oclDeprecatedType);
				if (result == null) result = caseOCLElement(oclDeprecatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ELEMENT: {
				OCLElement oclElement = (OCLElement)theEObject;
				T result = caseOCLElement(oclElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_INVALID_TYPE: {
				OCLInvalidType oclInvalidType = (OCLInvalidType)theEObject;
				T result = caseOCLInvalidType(oclInvalidType);
				if (result == null) result = caseOCLConcreteType(oclInvalidType);
				if (result == null) result = caseOCLType(oclInvalidType);
				if (result == null) result = caseOCLTypeParameterParent(oclInvalidType);
				if (result == null) result = caseOCLTypeValue(oclInvalidType);
				if (result == null) result = caseOCLNamedElement(oclInvalidType);
				if (result == null) result = caseOCLElement(oclInvalidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_ITERATOR: {
				OCLIterator oclIterator = (OCLIterator)theEObject;
				T result = caseOCLIterator(oclIterator);
				if (result == null) result = caseOCLTypedElement(oclIterator);
				if (result == null) result = caseOCLNamedElement(oclIterator);
				if (result == null) result = caseOCLElement(oclIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_JAVA_TYPE: {
				OCLJavaType oclJavaType = (OCLJavaType)theEObject;
				T result = caseOCLJavaType(oclJavaType);
				if (result == null) result = caseOCLConcreteType(oclJavaType);
				if (result == null) result = caseOCLType(oclJavaType);
				if (result == null) result = caseOCLTypeParameterParent(oclJavaType);
				if (result == null) result = caseOCLTypeValue(oclJavaType);
				if (result == null) result = caseOCLNamedElement(oclJavaType);
				if (result == null) result = caseOCLElement(oclJavaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_LIBRARY: {
				OCLLibrary oclLibrary = (OCLLibrary)theEObject;
				T result = caseOCLLibrary(oclLibrary);
				if (result == null) result = caseOCLPackageParent(oclLibrary);
				if (result == null) result = caseOCLNamedElement(oclLibrary);
				if (result == null) result = caseOCLElement(oclLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_LIBRARY_OPERATION: {
				OCLLibraryOperation oclLibraryOperation = (OCLLibraryOperation)theEObject;
				T result = caseOCLLibraryOperation(oclLibraryOperation);
				if (result == null) result = caseOCLOperation(oclLibraryOperation);
				if (result == null) result = caseOCLTypedElement(oclLibraryOperation);
				if (result == null) result = caseOCLTypeParameterParent(oclLibraryOperation);
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
			case LibraryPackage.OCL_NAMED_ELEMENT: {
				OCLNamedElement oclNamedElement = (OCLNamedElement)theEObject;
				T result = caseOCLNamedElement(oclNamedElement);
				if (result == null) result = caseOCLElement(oclNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_OPERATION: {
				OCLOperation oclOperation = (OCLOperation)theEObject;
				T result = caseOCLOperation(oclOperation);
				if (result == null) result = caseOCLTypedElement(oclOperation);
				if (result == null) result = caseOCLTypeParameterParent(oclOperation);
				if (result == null) result = caseOCLNamedElement(oclOperation);
				if (result == null) result = caseOCLElement(oclOperation);
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
			case LibraryPackage.OCL_TYPE: {
				OCLType oclType = (OCLType)theEObject;
				T result = caseOCLType(oclType);
				if (result == null) result = caseOCLTypeValue(oclType);
				if (result == null) result = caseOCLElement(oclType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TYPE_BINDING: {
				OCLTypeBinding oclTypeBinding = (OCLTypeBinding)theEObject;
				T result = caseOCLTypeBinding(oclTypeBinding);
				if (result == null) result = caseOCLElement(oclTypeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TYPE_PARAMETER: {
				OCLTypeParameter oclTypeParameter = (OCLTypeParameter)theEObject;
				T result = caseOCLTypeParameter(oclTypeParameter);
				if (result == null) result = caseOCLTypeValue(oclTypeParameter);
				if (result == null) result = caseOCLNamedElement(oclTypeParameter);
				if (result == null) result = caseOCLElement(oclTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_TYPE_PARAMETER_PARENT: {
				OCLTypeParameterParent oclTypeParameterParent = (OCLTypeParameterParent)theEObject;
				T result = caseOCLTypeParameterParent(oclTypeParameterParent);
				if (result == null) result = caseOCLNamedElement(oclTypeParameterParent);
				if (result == null) result = caseOCLElement(oclTypeParameterParent);
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
			case LibraryPackage.OCL_TYPE_VALUE: {
				OCLTypeValue oclTypeValue = (OCLTypeValue)theEObject;
				T result = caseOCLTypeValue(oclTypeValue);
				if (result == null) result = caseOCLElement(oclTypeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LibraryPackage.OCL_VOID_TYPE: {
				OCLVoidType oclVoidType = (OCLVoidType)theEObject;
				T result = caseOCLVoidType(oclVoidType);
				if (result == null) result = caseOCLConcreteType(oclVoidType);
				if (result == null) result = caseOCLType(oclVoidType);
				if (result == null) result = caseOCLTypeParameterParent(oclVoidType);
				if (result == null) result = caseOCLTypeValue(oclVoidType);
				if (result == null) result = caseOCLNamedElement(oclVoidType);
				if (result == null) result = caseOCLElement(oclVoidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>OCL Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Bound Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLBoundType(OCLBoundType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>OCL Concrete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Concrete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLConcreteType(OCLConcreteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Deprecated Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Deprecated Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLDeprecatedType(OCLDeprecatedType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>OCL Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLIterator(OCLIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Java Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Java Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLJavaType(OCLJavaType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>OCL Type Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Type Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLTypeBinding(OCLTypeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLTypeParameter(OCLTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Type Parameter Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Type Parameter Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLTypeParameterParent(OCLTypeParameterParent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>OCL Type Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Type Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLTypeValue(OCLTypeValue object) {
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

} //OCLLibrarySwitch
