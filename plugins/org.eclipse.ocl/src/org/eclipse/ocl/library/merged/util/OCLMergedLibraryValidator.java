/**
 * <copyright>
 * </copyright>
 *
 * $Id: OCLMergedLibraryValidator.java,v 1.1.2.3 2010/01/31 22:23:45 ewillink Exp $
 */
package org.eclipse.ocl.library.merged.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.ocl.library.merged.*;

import org.eclipse.ocl.library.util.LibraryValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * @since 3.0
 * <!-- end-user-doc -->
 * @see org.eclipse.ocl.library.merged.OCLMergedLibraryPackage
 * @generated
 */
public class OCLMergedLibraryValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OCLMergedLibraryValidator INSTANCE = new OCLMergedLibraryValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.ocl.library.merged"; //$NON-NLS-1$

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryValidator libraryValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLMergedLibraryValidator() {
		super();
		libraryValidator = LibraryValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OCLMergedLibraryPackage.eINSTANCE;
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
			case OCLMergedLibraryPackage.MERGED_ITERATION:
				return validateMergedIteration((MergedIteration)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_LIBRARY:
				return validateMergedLibrary((MergedLibrary)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_LIBRARY_ITERATION:
				return validateMergedLibraryIteration((MergedLibraryIteration)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_LIBRARY_OPERATION:
				return validateMergedLibraryOperation((MergedLibraryOperation)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_LIBRARY_PROPERTY:
				return validateMergedLibraryProperty((MergedLibraryProperty)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_META_MODEL_OPERATION:
				return validateMergedMetaModelOperation((MergedMetaModelOperation)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_META_MODEL_PROPERTY:
				return validateMergedMetaModelProperty((MergedMetaModelProperty)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_OPERATION:
				return validateMergedOperation((MergedOperation)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_OPERATION_DEFINITION:
				return validateMergedOperationDefinition((MergedOperationDefinition)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_PROPERTY:
				return validateMergedProperty((MergedProperty)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_PROPERTY_DEFINITION:
				return validateMergedPropertyDefinition((MergedPropertyDefinition)value, diagnostics, context);
			case OCLMergedLibraryPackage.MERGED_TYPE:
				return validateMergedType((MergedType)value, diagnostics, context);
			case OCLMergedLibraryPackage.OCL_BOUND_COLLECTION_TYPE:
				return validateOCLBoundCollectionType((OCLBoundCollectionType)value, diagnostics, context);
			case OCLMergedLibraryPackage.OCL_CLASSIFIER:
				return validateOCLClassifier((OCLClassifier)value, diagnostics, context);
			case OCLMergedLibraryPackage.OCL_DATA_TYPE:
				return validateOCLDataType((OCLDataType)value, diagnostics, context);
			case OCLMergedLibraryPackage.OCL_ENUMERATION:
				return validateOCLEnumeration((OCLEnumeration)value, diagnostics, context);
			case OCLMergedLibraryPackage.OCL_ENUMERATION_LITERAL:
				return validateOCLEnumerationLiteral((OCLEnumerationLiteral)value, diagnostics, context);
			case OCLMergedLibraryPackage.OCL_META_MODEL_OPERATION:
				return validateOCLMetaModelOperation((OCLMetaModelOperation)value, diagnostics, context);
			case OCLMergedLibraryPackage.OCL_META_MODEL_PROPERTY:
				return validateOCLMetaModelProperty((OCLMetaModelProperty)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedIteration(MergedIteration mergedIteration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedIteration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedLibrary(MergedLibrary mergedLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedLibraryIteration(MergedLibraryIteration mergedLibraryIteration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedLibraryIteration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedLibraryOperation(MergedLibraryOperation mergedLibraryOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedLibraryOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedLibraryProperty(MergedLibraryProperty mergedLibraryProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedLibraryProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedMetaModelOperation(MergedMetaModelOperation mergedMetaModelOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedMetaModelOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedMetaModelProperty(MergedMetaModelProperty mergedMetaModelProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedMetaModelProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedOperation(MergedOperation mergedOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedOperationDefinition(MergedOperationDefinition mergedOperationDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedOperationDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedProperty(MergedProperty mergedProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedPropertyDefinition(MergedPropertyDefinition mergedPropertyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedPropertyDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergedType(MergedType mergedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLBoundCollectionType(OCLBoundCollectionType oclBoundCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= libraryValidator.validateOCLType_EachConformsTypeIsBound(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= libraryValidator.validateOCLBoundType_OneTypeBindingForEachTypeParameter(oclBoundCollectionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOCLBoundCollectionType_NotMoreThanOneTypeParameter(oclBoundCollectionType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NotMoreThanOneTypeParameter constraint of '<em>OCL Bound Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLBoundCollectionType_NotMoreThanOneTypeParameter(OCLBoundCollectionType oclBoundCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic", //$NON-NLS-1$
						 new Object[] { "NotMoreThanOneTypeParameter", getObjectLabel(oclBoundCollectionType, context) }, //$NON-NLS-1$
						 new Object[] { oclBoundCollectionType },
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
	public boolean validateOCLClassifier(OCLClassifier oclClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(oclClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= libraryValidator.validateOCLType_EachConformsTypeIsBound(oclClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLDataType(OCLDataType oclDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(oclDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclDataType, diagnostics, context);
		if (result || diagnostics != null) result &= libraryValidator.validateOCLType_EachConformsTypeIsBound(oclDataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLEnumeration(OCLEnumeration oclEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(oclEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclEnumeration, diagnostics, context);
		if (result || diagnostics != null) result &= libraryValidator.validateOCLType_EachConformsTypeIsBound(oclEnumeration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLEnumerationLiteral(OCLEnumerationLiteral oclEnumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oclEnumerationLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLMetaModelOperation(OCLMetaModelOperation oclMetaModelOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(oclMetaModelOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclMetaModelOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclMetaModelOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclMetaModelOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclMetaModelOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclMetaModelOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclMetaModelOperation, diagnostics, context);
		if (result || diagnostics != null) result &= libraryValidator.validateOCLTypedElement_ReferencedTypeIsBound(oclMetaModelOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOCLMetaModelProperty(OCLMetaModelProperty oclMetaModelProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(oclMetaModelProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oclMetaModelProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oclMetaModelProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oclMetaModelProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oclMetaModelProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oclMetaModelProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oclMetaModelProperty, diagnostics, context);
		if (result || diagnostics != null) result &= libraryValidator.validateOCLTypedElement_ReferencedTypeIsBound(oclMetaModelProperty, diagnostics, context);
		return result;
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

} //OCLMergedLibraryValidator
