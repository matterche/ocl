/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryValidator.java,v 1.1.2.5 2010/07/09 10:21:44 ewillink Exp $
 */
package org.eclipse.ocl.library.util;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.library.LibraryIteration;
import org.eclipse.ocl.library.LibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.LibraryProperty;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLBoundType;
import org.eclipse.ocl.library.OCLCache;
import org.eclipse.ocl.library.OCLConcreteType;
import org.eclipse.ocl.library.OCLDeprecatedType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLIteration;
import org.eclipse.ocl.library.OCLJavaType;
import org.eclipse.ocl.library.OCLLibrary;
import org.eclipse.ocl.library.OCLLibraryIteration;
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
import org.eclipse.osgi.util.NLS;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.LibraryPackage
 * @generated
 */
public class LibraryValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LibraryValidator INSTANCE = new LibraryValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.ocl.library"; //$NON-NLS-1$

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LibraryPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LibraryPackage.OCL_ANY_TYPE:
				return validateOCLAnyType((OCLAnyType)value, diagnostics, context);
			case LibraryPackage.OCL_BOUND_TYPE:
				return validateOCLBoundType((OCLBoundType)value, diagnostics, context);
			case LibraryPackage.OCL_CACHE:
				return validateOCLCache((OCLCache)value, diagnostics, context);
			case LibraryPackage.OCL_CONCRETE_TYPE:
				return validateOCLConcreteType((OCLConcreteType)value, diagnostics, context);
			case LibraryPackage.OCL_DEPRECATED_TYPE:
				return validateOCLDeprecatedType((OCLDeprecatedType)value, diagnostics, context);
			case LibraryPackage.OCL_ELEMENT:
				return validateOCLElement((OCLElement)value, diagnostics, context);
			case LibraryPackage.OCL_INVALID_TYPE:
				return validateOCLInvalidType((OCLInvalidType)value, diagnostics, context);
			case LibraryPackage.OCL_ITERATION:
				return validateOCLIteration((OCLIteration)value, diagnostics, context);
			case LibraryPackage.OCL_JAVA_TYPE:
				return validateOCLJavaType((OCLJavaType)value, diagnostics, context);
			case LibraryPackage.OCL_LIBRARY:
				return validateOCLLibrary((OCLLibrary)value, diagnostics, context);
			case LibraryPackage.OCL_LIBRARY_ITERATION:
				return validateOCLLibraryIteration((OCLLibraryIteration)value, diagnostics, context);
			case LibraryPackage.OCL_LIBRARY_OPERATION:
				return validateOCLLibraryOperation((OCLLibraryOperation)value, diagnostics, context);
			case LibraryPackage.OCL_LIBRARY_PROPERTY:
				return validateOCLLibraryProperty((OCLLibraryProperty)value, diagnostics, context);
			case LibraryPackage.OCL_NAMED_ELEMENT:
				return validateOCLNamedElement((OCLNamedElement)value, diagnostics, context);
			case LibraryPackage.OCL_OPERATION:
				return validateOCLOperation((OCLOperation)value, diagnostics, context);
			case LibraryPackage.OCL_PACKAGE:
				return validateOCLPackage((OCLPackage)value, diagnostics, context);
			case LibraryPackage.OCL_PACKAGE_PARENT:
				return validateOCLPackageParent((OCLPackageParent)value, diagnostics, context);
			case LibraryPackage.OCL_PARAMETER:
				return validateOCLParameter((OCLParameter)value, diagnostics, context);
			case LibraryPackage.OCL_PROPERTY:
				return validateOCLProperty((OCLProperty)value, diagnostics, context);
			case LibraryPackage.OCL_ROOT:
				return validateOCLRoot((OCLRoot)value, diagnostics, context);
			case LibraryPackage.OCL_TYPE:
				return validateOCLType((OCLType)value, diagnostics, context);
			case LibraryPackage.OCL_TYPE_BINDING:
				return validateOCLTypeBinding((OCLTypeBinding)value, diagnostics, context);
			case LibraryPackage.OCL_TYPE_PARAMETER:
				return validateOCLTypeParameter((OCLTypeParameter)value, diagnostics, context);
			case LibraryPackage.OCL_TYPE_PARAMETER_PARENT:
				return validateOCLTypeParameterParent((OCLTypeParameterParent)value, diagnostics, context);
			case LibraryPackage.OCL_TYPED_ELEMENT:
				return validateOCLTypedElement((OCLTypedElement)value, diagnostics, context);
			case LibraryPackage.OCL_TYPE_VALUE:
				return validateOCLTypeValue((OCLTypeValue)value, diagnostics, context);
			case LibraryPackage.OCL_VOID_TYPE:
				return validateOCLVoidType((OCLVoidType)value, diagnostics, context);
			case LibraryPackage.LIBRARY_ITERATION:
				return validateLibraryIteration((LibraryIteration)value, diagnostics, context);
			case LibraryPackage.LIBRARY_OPERATION:
				return validateLibraryOperation((LibraryOperation)value, diagnostics, context);
			case LibraryPackage.LIBRARY_PROPERTY:
				return validateLibraryProperty((LibraryProperty)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLAnyType(OCLAnyType oclAnyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclAnyType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclAnyType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclAnyType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLLibrary(OCLLibrary oclLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLLibraryIteration(OCLLibraryIteration oclLibraryIteration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclLibraryIteration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclLibraryIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclLibraryIteration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLBoundType(OCLBoundType oclBoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclBoundType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclBoundType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLBoundType_OneTypeBindingForEachTypeParameter(oclBoundType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OneTypeBindingForEachTypeParameter constraint of '<em>OCL Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOCLBoundType_OneTypeBindingForEachTypeParameter(OCLBoundType oclBoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isOk = false;
		List<OCLTypeParameter> typeParameters = oclBoundType.getType().getTypeParameter();
		List<OCLTypeBinding> typeBindings = oclBoundType.getTypeBinding();
		if (typeParameters.size() == typeBindings.size()) {
			boolean gotIt = true;
			for (OCLTypeParameter typeParameter : typeParameters) {
				OCLTypeBinding typeBinding = oclBoundType.getTypeBinding(typeParameter);
				if (typeBinding == null) {
					gotIt = false;
					Object[] messageSubstitutions = new Object[] { getObjectLabel(typeParameter, context) };
					appendError(diagnostics, oclBoundType, LibraryMessages._UI_BoundType_MissingBinding, messageSubstitutions);					
				}
			}
			if (gotIt) {
				isOk = true;
			}
		}
		if (!isOk) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic", //$NON-NLS-1$
						 new Object[] { "OneTypeBindingForEachTypeParameter", getObjectLabel(oclBoundType, context) }, //$NON-NLS-1$
						 new Object[] { oclBoundType },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLCache(OCLCache oclCache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclCache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLConcreteType(OCLConcreteType oclConcreteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclConcreteType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclConcreteType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclConcreteType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLDeprecatedType(OCLDeprecatedType oclDeprecatedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclDeprecatedType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclDeprecatedType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclDeprecatedType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLElement(OCLElement oclElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLInvalidType(OCLInvalidType oclInvalidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclInvalidType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclInvalidType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclInvalidType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLIteration(OCLIteration oclIteration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclIteration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclIteration, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclIteration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLJavaType(OCLJavaType oclJavaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclJavaType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclJavaType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclJavaType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLLibraryOperation(OCLLibraryOperation oclLibraryOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclLibraryOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclLibraryOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclLibraryOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLLibraryProperty(OCLLibraryProperty oclLibraryProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclLibraryProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclLibraryProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclLibraryProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLNamedElement(OCLNamedElement oclNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclNamedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLOperation(OCLOperation oclOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLPackage(OCLPackage oclPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLPackageParent(OCLPackageParent oclPackageParent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclPackageParent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLParameter(OCLParameter oclParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLProperty(OCLProperty oclProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLRoot(OCLRoot oclRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLType(OCLType oclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EachConformsTypeIsBound constraint of '<em>OCL Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOCLType_EachConformsTypeIsBound(OCLType oclType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isOk = true;
		List<OCLType> types = oclType.getConforms();
		for (OCLType type : types) {
			for (OCLTypeParameter typeParameter : type.getTypeParameter()) {
				OCLTypeBinding typeBinding = oclType.getTypeBinding(typeParameter);
				if (typeBinding == null) {
					isOk = false;
					Object[] messageSubstitutions = new Object[] { typeParameter.getQualifiedName(), oclType.getQualifiedSignature() };
					appendError(diagnostics, oclType, LibraryMessages._UI_Type_ConformsTypeParameterIsNotBound, messageSubstitutions);					
				}
			}
		}
		return isOk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLTypeBinding(OCLTypeBinding oclTypeBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclTypeBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclTypeBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypeBinding_TypeParameterDefinedByBoundTypeParent(oclTypeBinding, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TypeParameterDefinedByBoundTypeParent constraint of '<em>OCL Type Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOCLTypeBinding_TypeParameterDefinedByBoundTypeParent(OCLTypeBinding oclTypeBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		OCLTypeParameter typeParameter = oclTypeBinding.getTypeParameter();
		if (typeParameter == null) {
			return true;		// Diagnosed as bad multiplicity
		}
		boolean isOk = true;
//		OCLTypeParameterParent typeParameterParent = typeParameter.getTypeParameterParent();
		OCLBoundType boundType = oclTypeBinding.getBoundType();
		if (boundType == null) {
			return true;		// Diagnosed as bad multiplicity
		}
		OCLType unboundType = boundType.getType();
		if (unboundType == null) {
			return true;		// Diagnosed as bad multiplicity
		}
		if (!unboundType.isTypeParameter(typeParameter)) {
//		for (EObject parent = boundType; parent instanceof OCLElement; parent = parent.eContainer()) {
//			if (parent != typeParameterParent) {
				isOk = false;
				Object[] messageSubstitutions = new Object[] { getObjectLabel(typeParameter, context) };
				appendError(diagnostics, oclTypeBinding, LibraryMessages._UI_TypeBinding_TypeParameterIsNotBoundByParent, messageSubstitutions);					
			}
//		}
		return isOk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLTypeParameter(OCLTypeParameter oclTypeParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclTypeParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLTypeParameterParent(OCLTypeParameterParent oclTypeParameterParent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclTypeParameterParent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLTypedElement(OCLTypedElement oclTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclTypedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclTypedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLTypedElement_ReferencedTypeIsBound(oclTypedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReferencedTypeIsBound constraint of '<em>OCL Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateOCLTypedElement_ReferencedTypeIsBound(OCLTypedElement oclTypedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isOk = true;
		OCLTypeValue type = oclTypedElement.getType();
		if (type instanceof OCLDeprecatedType) {
			isOk = false;
			Object[] messageSubstitutions = new Object[] { type.getQualifiedName(), oclTypedElement.getQualifiedSignature() };
			appendError(diagnostics, oclTypedElement, LibraryMessages._UI_TypedElement_ReferencedTypeIsDeprecated, messageSubstitutions);					
		}
		else if (type instanceof OCLType) {
			for (OCLTypeParameter typeParameter : ((OCLType) type).getTypeParameter()) {
				OCLTypeBinding typeBinding = ((OCLType) type).getTypeBinding(typeParameter);
				if ((typeBinding == null) && !oclTypedElement.isTypeParameter(typeParameter)) {
					isOk = false;
					Object[] messageSubstitutions = new Object[] { typeParameter.getQualifiedName(), oclTypedElement.getQualifiedSignature() };
					appendError(diagnostics, oclTypedElement, LibraryMessages._UI_TypedElement_ReferencedTypeParameterIsNotBound, messageSubstitutions);					
				}
			}
		}
		else if (type instanceof OCLTypeParameter) {
			if (!oclTypedElement.isTypeParameter((OCLTypeParameter) type)) {
				isOk = false;
				Object[] messageSubstitutions = new Object[] { type.getQualifiedName(), oclTypedElement.getQualifiedSignature() };
				appendError(diagnostics, oclTypedElement, LibraryMessages._UI_TypedElement_ReferencedTypeParameterIsNotBound, messageSubstitutions);					
			}
		}
		return isOk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLTypeValue(OCLTypeValue oclTypeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclTypeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLVoidType(OCLVoidType oclVoidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oclVoidType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclVoidType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLType_EachConformsTypeIsBound(oclVoidType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryIteration(LibraryIteration libraryIteration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryOperation(LibraryOperation libraryOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryProperty(LibraryProperty libraryProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	protected void appendError(DiagnosticChain diagnostics, Object astNode, String errorMessage, Object[] messageSubstitutions) {
		appendDiagnostic(diagnostics, astNode, Diagnostic.ERROR, errorMessage, messageSubstitutions);
	}

	protected void appendDiagnostic(DiagnosticChain diagnostics, Object astNode, int severity, String errorMessage, Object[] messageSubstitutions) {
		appendDiagnostic(diagnostics, new Object[] { astNode }, severity, errorMessage, messageSubstitutions);
	}

	protected void appendDiagnostic(DiagnosticChain diagnostics, Object[] astNodes, int severity, String errorMessage, Object[] messageSubstitutions) {
		appendDiagnostic(diagnostics, astNodes, getDiagnosticSource(), severity, errorMessage, messageSubstitutions);
	}

	protected void appendDiagnostic(DiagnosticChain diagnostics, Object[] astNodes, String diagnosticSource, int severity, String errorMessage, Object[] messageSubstitutions) {
		if (diagnostics != null) {
			int errorCode = 0; //getErrorCode(errorMessage);
			String message = NLS.bind(errorMessage, messageSubstitutions);
			Diagnostic diagnostic = new BasicDiagnostic(severity, diagnosticSource, errorCode, message, astNodes);
			diagnostics.add(diagnostic);
		}
	}
	
	public String getDiagnosticSource() {
		return DIAGNOSTIC_SOURCE;
	}


} //LibraryValidator
