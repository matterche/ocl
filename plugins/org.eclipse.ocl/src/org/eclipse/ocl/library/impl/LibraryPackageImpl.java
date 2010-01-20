/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackageImpl.java,v 1.1.2.8 2010/01/20 16:57:26 ewillink Exp $
 */
package org.eclipse.ocl.library.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.library.LibraryFactory;
import org.eclipse.ocl.library.LibraryOperation;
import org.eclipse.ocl.library.LibraryPackage;
import org.eclipse.ocl.library.LibraryProperty;
import org.eclipse.ocl.library.OCLAnyType;
import org.eclipse.ocl.library.OCLClassifier;
import org.eclipse.ocl.library.OCLConstraintOperation;
import org.eclipse.ocl.library.OCLConstraintProperty;
import org.eclipse.ocl.library.OCLDataType;
import org.eclipse.ocl.library.OCLElement;
import org.eclipse.ocl.library.OCLEnumeration;
import org.eclipse.ocl.library.OCLEnumerationLiteral;
import org.eclipse.ocl.library.OCLGenericType;
import org.eclipse.ocl.library.OCLInvalidType;
import org.eclipse.ocl.library.OCLLibraryOperation;
import org.eclipse.ocl.library.OCLLibraryProperty;
import org.eclipse.ocl.library.OCLMetaModelElement;
import org.eclipse.ocl.library.OCLMetaModelOperation;
import org.eclipse.ocl.library.OCLMetaModelProperty;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLPackage;
import org.eclipse.ocl.library.OCLParameter;
import org.eclipse.ocl.library.OCLProperty;
import org.eclipse.ocl.library.OCLTupleType;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.OCLVoidType;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * @since 3.0
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryPackageImpl extends EPackageImpl implements LibraryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclAnyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclConstraintOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclConstraintPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclInvalidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclLibraryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclLibraryPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMetaModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMetaModelOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMetaModelPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTupleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclVoidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType evaluationVisitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expressionInOCLEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationCallExpEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyCallExpEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.ocl.library.LibraryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LibraryPackageImpl() {
		super(eNS_URI, LibraryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LibraryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LibraryPackage init() {
		if (isInited) return (LibraryPackage)EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);

		// Obtain or create and register package
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LibraryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theLibraryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLibraryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LibraryPackage.eNS_URI, theLibraryPackage);
		return theLibraryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLConstraintOperation() {
		return oclConstraintOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraintOperation_Specification() {
		return (EAttribute)oclConstraintOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraintOperation_Stereotype() {
		return (EAttribute)oclConstraintOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLConstraintProperty() {
		return oclConstraintPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraintProperty_Specification() {
		return (EAttribute)oclConstraintPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLConstraintProperty_Stereotype() {
		return (EAttribute)oclConstraintPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLDataType() {
		return oclDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLElement() {
		return oclElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLElement_Name() {
		return (EAttribute)oclElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLEnumeration() {
		return oclEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLEnumeration_Literals() {
		return (EReference)oclEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLEnumerationLiteral() {
		return oclEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLEnumerationLiteral_Container() {
		return (EReference)oclEnumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLGenericType() {
		return oclGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLGenericType_Parameter() {
		return (EReference)oclGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLInvalidType() {
		return oclInvalidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLLibraryOperation() {
		return oclLibraryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryOperation_LibraryOperationClass() {
		return (EAttribute)oclLibraryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLLibraryOperation_LibraryOperation() {
		return (EReference)oclLibraryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLLibraryProperty() {
		return oclLibraryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLLibraryProperty_LibraryPropertyClass() {
		return (EAttribute)oclLibraryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLLibraryProperty_LibraryProperty() {
		return (EReference)oclLibraryPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLMetaModelElement() {
		return oclMetaModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLMetaModelElement_MetaModelElement() {
		return (EReference)oclMetaModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLMetaModelOperation() {
		return oclMetaModelOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLMetaModelProperty() {
		return oclMetaModelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLOperation() {
		return oclOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLOperation_IsIterator() {
		return (EAttribute)oclOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLOperation_Parameter() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLOperation_Type() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLOperation_Container() {
		return (EReference)oclOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLPackage() {
		return oclPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLPackage_Extends() {
		return (EReference)oclPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLPackage_Type() {
		return (EReference)oclPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLParameter() {
		return oclParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLParameter_Container() {
		return (EReference)oclParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLParameter_Type() {
		return (EReference)oclParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLProperty() {
		return oclPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLProperty_Container() {
		return (EReference)oclPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLProperty_Type() {
		return (EReference)oclPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLTupleType() {
		return oclTupleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLType() {
		return oclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Conforms() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Operation() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Property() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLType_Container() {
		return (EReference)oclTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLVoidType() {
		return oclVoidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEvaluationVisitor() {
		return evaluationVisitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExpressionInOCL() {
		return expressionInOCLEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationCallExp() {
		return operationCallExpEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyCallExp() {
		return propertyCallExpEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryOperation() {
		return libraryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryOperation_References() {
		return (EReference)libraryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLClassifier() {
		return oclClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryProperty() {
		return libraryPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryProperty_References() {
		return (EReference)libraryPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLAnyType() {
		return oclAnyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFactory getLibraryFactory() {
		return (LibraryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		libraryOperationEClass = createEClass(LIBRARY_OPERATION);
		createEReference(libraryOperationEClass, LIBRARY_OPERATION__REFERENCES);

		libraryPropertyEClass = createEClass(LIBRARY_PROPERTY);
		createEReference(libraryPropertyEClass, LIBRARY_PROPERTY__REFERENCES);

		oclAnyTypeEClass = createEClass(OCL_ANY_TYPE);

		oclClassifierEClass = createEClass(OCL_CLASSIFIER);

		oclConstraintOperationEClass = createEClass(OCL_CONSTRAINT_OPERATION);
		createEAttribute(oclConstraintOperationEClass, OCL_CONSTRAINT_OPERATION__SPECIFICATION);
		createEAttribute(oclConstraintOperationEClass, OCL_CONSTRAINT_OPERATION__STEREOTYPE);

		oclConstraintPropertyEClass = createEClass(OCL_CONSTRAINT_PROPERTY);
		createEAttribute(oclConstraintPropertyEClass, OCL_CONSTRAINT_PROPERTY__SPECIFICATION);
		createEAttribute(oclConstraintPropertyEClass, OCL_CONSTRAINT_PROPERTY__STEREOTYPE);

		oclDataTypeEClass = createEClass(OCL_DATA_TYPE);

		oclElementEClass = createEClass(OCL_ELEMENT);
		createEAttribute(oclElementEClass, OCL_ELEMENT__NAME);

		oclEnumerationEClass = createEClass(OCL_ENUMERATION);
		createEReference(oclEnumerationEClass, OCL_ENUMERATION__LITERALS);

		oclEnumerationLiteralEClass = createEClass(OCL_ENUMERATION_LITERAL);
		createEReference(oclEnumerationLiteralEClass, OCL_ENUMERATION_LITERAL__CONTAINER);

		oclGenericTypeEClass = createEClass(OCL_GENERIC_TYPE);
		createEReference(oclGenericTypeEClass, OCL_GENERIC_TYPE__PARAMETER);

		oclInvalidTypeEClass = createEClass(OCL_INVALID_TYPE);

		oclLibraryOperationEClass = createEClass(OCL_LIBRARY_OPERATION);
		createEAttribute(oclLibraryOperationEClass, OCL_LIBRARY_OPERATION__LIBRARY_OPERATION_CLASS);
		createEReference(oclLibraryOperationEClass, OCL_LIBRARY_OPERATION__LIBRARY_OPERATION);

		oclLibraryPropertyEClass = createEClass(OCL_LIBRARY_PROPERTY);
		createEAttribute(oclLibraryPropertyEClass, OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY_CLASS);
		createEReference(oclLibraryPropertyEClass, OCL_LIBRARY_PROPERTY__LIBRARY_PROPERTY);

		oclMetaModelElementEClass = createEClass(OCL_META_MODEL_ELEMENT);
		createEReference(oclMetaModelElementEClass, OCL_META_MODEL_ELEMENT__META_MODEL_ELEMENT);

		oclMetaModelOperationEClass = createEClass(OCL_META_MODEL_OPERATION);

		oclMetaModelPropertyEClass = createEClass(OCL_META_MODEL_PROPERTY);

		oclOperationEClass = createEClass(OCL_OPERATION);
		createEAttribute(oclOperationEClass, OCL_OPERATION__IS_ITERATOR);
		createEReference(oclOperationEClass, OCL_OPERATION__PARAMETER);
		createEReference(oclOperationEClass, OCL_OPERATION__TYPE);
		createEReference(oclOperationEClass, OCL_OPERATION__CONTAINER);

		oclPackageEClass = createEClass(OCL_PACKAGE);
		createEReference(oclPackageEClass, OCL_PACKAGE__EXTENDS);
		createEReference(oclPackageEClass, OCL_PACKAGE__TYPE);

		oclParameterEClass = createEClass(OCL_PARAMETER);
		createEReference(oclParameterEClass, OCL_PARAMETER__CONTAINER);
		createEReference(oclParameterEClass, OCL_PARAMETER__TYPE);

		oclPropertyEClass = createEClass(OCL_PROPERTY);
		createEReference(oclPropertyEClass, OCL_PROPERTY__CONTAINER);
		createEReference(oclPropertyEClass, OCL_PROPERTY__TYPE);

		oclTupleTypeEClass = createEClass(OCL_TUPLE_TYPE);

		oclTypeEClass = createEClass(OCL_TYPE);
		createEReference(oclTypeEClass, OCL_TYPE__CONFORMS);
		createEReference(oclTypeEClass, OCL_TYPE__OPERATION);
		createEReference(oclTypeEClass, OCL_TYPE__PROPERTY);
		createEReference(oclTypeEClass, OCL_TYPE__CONTAINER);

		oclVoidTypeEClass = createEClass(OCL_VOID_TYPE);

		// Create data types
		exceptionEDataType = createEDataType(EXCEPTION);
		evaluationVisitorEDataType = createEDataType(EVALUATION_VISITOR);
		expressionInOCLEDataType = createEDataType(EXPRESSION_IN_OCL);
		operationCallExpEDataType = createEDataType(OPERATION_CALL_EXP);
		propertyCallExpEDataType = createEDataType(PROPERTY_CALL_EXP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oclAnyTypeEClass.getESuperTypes().add(this.getOCLType());
		oclClassifierEClass.getESuperTypes().add(this.getOCLType());
		oclClassifierEClass.getESuperTypes().add(this.getOCLMetaModelElement());
		oclConstraintOperationEClass.getESuperTypes().add(this.getOCLOperation());
		oclConstraintPropertyEClass.getESuperTypes().add(this.getOCLProperty());
		oclDataTypeEClass.getESuperTypes().add(this.getOCLType());
		oclDataTypeEClass.getESuperTypes().add(this.getOCLMetaModelElement());
		oclEnumerationEClass.getESuperTypes().add(this.getOCLType());
		oclEnumerationEClass.getESuperTypes().add(this.getOCLMetaModelElement());
		oclEnumerationLiteralEClass.getESuperTypes().add(this.getOCLElement());
		oclEnumerationLiteralEClass.getESuperTypes().add(this.getOCLMetaModelElement());
		oclGenericTypeEClass.getESuperTypes().add(this.getOCLType());
		oclInvalidTypeEClass.getESuperTypes().add(this.getOCLType());
		oclLibraryOperationEClass.getESuperTypes().add(this.getOCLOperation());
		oclLibraryPropertyEClass.getESuperTypes().add(this.getOCLProperty());
		oclMetaModelOperationEClass.getESuperTypes().add(this.getOCLOperation());
		oclMetaModelOperationEClass.getESuperTypes().add(this.getOCLMetaModelElement());
		oclMetaModelPropertyEClass.getESuperTypes().add(this.getOCLProperty());
		oclMetaModelPropertyEClass.getESuperTypes().add(this.getOCLMetaModelElement());
		oclOperationEClass.getESuperTypes().add(this.getOCLElement());
		oclPackageEClass.getESuperTypes().add(this.getOCLElement());
		oclParameterEClass.getESuperTypes().add(this.getOCLElement());
		oclPropertyEClass.getESuperTypes().add(this.getOCLElement());
		oclTupleTypeEClass.getESuperTypes().add(this.getOCLType());
		oclTupleTypeEClass.getESuperTypes().add(this.getOCLMetaModelElement());
		oclTypeEClass.getESuperTypes().add(this.getOCLElement());
		oclVoidTypeEClass.getESuperTypes().add(this.getOCLType());

		// Initialize classes and features; add operations and parameters
		initEClass(libraryOperationEClass, LibraryOperation.class, "LibraryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLibraryOperation_References(), this.getOCLLibraryOperation(), this.getOCLLibraryOperation_LibraryOperation(), "references", null, 0, -1, LibraryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(libraryOperationEClass, ecorePackage.getEJavaObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getEvaluationVisitor(), "evaluationVisitor", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "source", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOperationCallExp(), "operationCall", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getException());

		initEClass(libraryPropertyEClass, LibraryProperty.class, "LibraryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getLibraryProperty_References(), this.getOCLLibraryProperty(), null, "references", null, 0, -1, LibraryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(libraryPropertyEClass, ecorePackage.getEJavaObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getEvaluationVisitor(), "evaluationVisitor", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "source", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getPropertyCallExp(), "propertyCall", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getException());

		initEClass(oclAnyTypeEClass, OCLAnyType.class, "OCLAnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclClassifierEClass, OCLClassifier.class, "OCLClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclConstraintOperationEClass, OCLConstraintOperation.class, "OCLConstraintOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOCLConstraintOperation_Specification(), this.getExpressionInOCL(), "specification", null, 0, 1, OCLConstraintOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLConstraintOperation_Stereotype(), ecorePackage.getEString(), "stereotype", null, 1, 1, OCLConstraintOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclConstraintPropertyEClass, OCLConstraintProperty.class, "OCLConstraintProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOCLConstraintProperty_Specification(), this.getExpressionInOCL(), "specification", null, 0, 1, OCLConstraintProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getOCLConstraintProperty_Stereotype(), ecorePackage.getEString(), "stereotype", null, 1, 1, OCLConstraintProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclDataTypeEClass, OCLDataType.class, "OCLDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclElementEClass, OCLElement.class, "OCLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOCLElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, OCLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclEnumerationEClass, OCLEnumeration.class, "OCLEnumeration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLEnumeration_Literals(), this.getOCLEnumerationLiteral(), this.getOCLEnumerationLiteral_Container(), "literals", null, 0, -1, OCLEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclEnumerationLiteralEClass, OCLEnumerationLiteral.class, "OCLEnumerationLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLEnumerationLiteral_Container(), this.getOCLEnumeration(), this.getOCLEnumeration_Literals(), "container", null, 0, 1, OCLEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclGenericTypeEClass, OCLGenericType.class, "OCLGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLGenericType_Parameter(), this.getOCLType(), null, "parameter", null, 1, -1, OCLGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclInvalidTypeEClass, OCLInvalidType.class, "OCLInvalidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclLibraryOperationEClass, OCLLibraryOperation.class, "OCLLibraryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getLibraryOperation());
		g2.setEUpperBound(g3);
		initEAttribute(getOCLLibraryOperation_LibraryOperationClass(), g1, "libraryOperationClass", null, 1, 1, OCLLibraryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLLibraryOperation_LibraryOperation(), this.getLibraryOperation(), this.getLibraryOperation_References(), "libraryOperation", null, 0, 1, OCLLibraryOperation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclLibraryPropertyEClass, OCLLibraryProperty.class, "OCLLibraryProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getLibraryProperty());
		g2.setEUpperBound(g3);
		initEAttribute(getOCLLibraryProperty_LibraryPropertyClass(), g1, "libraryPropertyClass", null, 1, 1, OCLLibraryProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLLibraryProperty_LibraryProperty(), this.getLibraryProperty(), null, "libraryProperty", null, 0, 1, OCLLibraryProperty.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclMetaModelElementEClass, OCLMetaModelElement.class, "OCLMetaModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLMetaModelElement_MetaModelElement(), ecorePackage.getEObject(), null, "metaModelElement", null, 0, 1, OCLMetaModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclMetaModelOperationEClass, OCLMetaModelOperation.class, "OCLMetaModelOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclMetaModelPropertyEClass, OCLMetaModelProperty.class, "OCLMetaModelProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclOperationEClass, OCLOperation.class, "OCLOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOCLOperation_IsIterator(), ecorePackage.getEBoolean(), "isIterator", null, 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLOperation_Parameter(), this.getOCLParameter(), this.getOCLParameter_Container(), "parameter", null, 0, -1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLOperation_Type(), this.getOCLType(), null, "type", null, 1, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLOperation_Container(), this.getOCLType(), this.getOCLType_Operation(), "container", null, 0, 1, OCLOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclOperationEClass, ecorePackage.getEJavaObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getEvaluationVisitor(), "evaluationVisitor", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "source", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOperationCallExp(), "operationCall", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getException());

		addEOperation(oclOperationEClass, ecorePackage.getEJavaObject(), "getOperationCode", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclPackageEClass, OCLPackage.class, "OCLPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLPackage_Extends(), this.getOCLPackage(), null, "extends", null, 0, -1, OCLPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLPackage_Type(), this.getOCLType(), this.getOCLType_Container(), "type", null, 0, -1, OCLPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPackageEClass, this.getOCLType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPackageEClass, this.getLibraryOperation(), "getLibraryOperation", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getLibraryOperation());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "libraryOperationClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPackageEClass, null, "putLibraryOperation", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getLibraryOperation());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "libraryOperationClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getLibraryOperation(), "libraryOperation", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclParameterEClass, OCLParameter.class, "OCLParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLParameter_Container(), this.getOCLOperation(), this.getOCLOperation_Parameter(), "container", null, 0, 1, OCLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLParameter_Type(), this.getOCLType(), null, "type", null, 1, 1, OCLParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclPropertyEClass, OCLProperty.class, "OCLProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLProperty_Container(), this.getOCLType(), this.getOCLType_Property(), "container", null, 0, 1, OCLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLProperty_Type(), this.getOCLType(), null, "type", null, 1, 1, OCLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclPropertyEClass, ecorePackage.getEJavaObject(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getEvaluationVisitor(), "evaluationVisitor", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "source", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getPropertyCallExp(), "propertyCall", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEException(op, this.getException());

		initEClass(oclTupleTypeEClass, OCLTupleType.class, "OCLTupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(oclTypeEClass, OCLType.class, "OCLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getOCLType_Conforms(), this.getOCLType(), null, "conforms", null, 0, -1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLType_Operation(), this.getOCLOperation(), this.getOCLOperation_Container(), "operation", null, 0, -1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLType_Property(), this.getOCLProperty(), this.getOCLProperty_Container(), "property", null, 0, -1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getOCLType_Container(), this.getOCLPackage(), this.getOCLPackage_Type(), "container", null, 0, 1, OCLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, ecorePackage.getEBoolean(), "conformsTo", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLOperation(), "getOperation", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getOCLType(), "parameterTypes", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(oclTypeEClass, this.getOCLProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(oclVoidTypeEClass, OCLVoidType.class, "OCLVoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize data types
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(evaluationVisitorEDataType, EvaluationVisitor.class, "EvaluationVisitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "org.eclipse.ocl.EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>"); //$NON-NLS-1$ //$NON-NLS-2$
		initEDataType(expressionInOCLEDataType, ExpressionInOCL.class, "ExpressionInOCL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "org.eclipse.ocl.utilities.ExpressionInOCL<?, ?>"); //$NON-NLS-1$ //$NON-NLS-2$
		initEDataType(operationCallExpEDataType, OperationCallExp.class, "OperationCallExp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "org.eclipse.ocl.expressions.OperationCallExp<?, ?>"); //$NON-NLS-1$ //$NON-NLS-2$
		initEDataType(propertyCallExpEDataType, PropertyCallExp.class, "PropertyCallExp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "org.eclipse.ocl.expressions.PropertyCallExp<?, ?>"); //$NON-NLS-1$ //$NON-NLS-2$

		// Create resource
		createResource(eNS_URI);
	}

} //LibraryPackageImpl
