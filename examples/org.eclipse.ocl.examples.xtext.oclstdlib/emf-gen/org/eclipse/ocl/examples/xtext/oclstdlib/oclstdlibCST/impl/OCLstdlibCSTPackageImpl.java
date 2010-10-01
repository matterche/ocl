/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLstdlibCSTPackageImpl.java,v 1.4.6.1 2010/10/01 14:34:04 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.JavaImplementationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibConstraintCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibIterationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibOperationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibPropertyCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibRootPackageCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTFactory;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.PrecedenceCS;
import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OCLstdlibCSTPackageImpl
		extends EPackageImpl
		implements OCLstdlibCSTPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libConstraintCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libIterationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libOperationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libPropertyCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libRootPackageCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaImplementationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceCSEClass = null;

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
	 * @see org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OCLstdlibCSTPackageImpl() {
		super(eNS_URI, OCLstdlibCSTFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OCLstdlibCSTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OCLstdlibCSTPackage init() {
		if (isInited) return (OCLstdlibCSTPackage)EPackage.Registry.INSTANCE.getEPackage(OCLstdlibCSTPackage.eNS_URI);

		// Obtain or create and register package
		OCLstdlibCSTPackageImpl theOCLstdlibCSTPackage = (OCLstdlibCSTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OCLstdlibCSTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OCLstdlibCSTPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EssentialOCLCSTPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOCLstdlibCSTPackage.createPackageContents();

		// Initialize created meta-data
		theOCLstdlibCSTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOCLstdlibCSTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OCLstdlibCSTPackage.eNS_URI, theOCLstdlibCSTPackage);
		return theOCLstdlibCSTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibConstraintCS()
	{
		return libConstraintCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibConstraintCS_OwnedExpression()
	{
		return (EReference)libConstraintCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibIterationCS() {
		return libIterationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibOperationCS() {
		return libOperationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibOperationCS_Precedence()
	{
		return (EReference)libOperationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibPropertyCS() {
		return libPropertyCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibRootPackageCS()
	{
		return libRootPackageCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibRootPackageCS_OwnedPrecedence()
	{
		return (EReference)libRootPackageCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaImplementationCS() {
		return javaImplementationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaImplementationCS_Implementation() {
		return (EReference)javaImplementationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedenceCS()
	{
		return precedenceCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedenceCS_RightAssociative()
	{
		return (EAttribute)precedenceCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLstdlibCSTFactory getOCLstdlibCSTFactory() {
		return (OCLstdlibCSTFactory)getEFactoryInstance();
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
		libConstraintCSEClass = createEClass(LIB_CONSTRAINT_CS);
		createEReference(libConstraintCSEClass, LIB_CONSTRAINT_CS__OWNED_EXPRESSION);

		libIterationCSEClass = createEClass(LIB_ITERATION_CS);

		libOperationCSEClass = createEClass(LIB_OPERATION_CS);
		createEReference(libOperationCSEClass, LIB_OPERATION_CS__PRECEDENCE);

		libPropertyCSEClass = createEClass(LIB_PROPERTY_CS);

		libRootPackageCSEClass = createEClass(LIB_ROOT_PACKAGE_CS);
		createEReference(libRootPackageCSEClass, LIB_ROOT_PACKAGE_CS__OWNED_PRECEDENCE);

		javaImplementationCSEClass = createEClass(JAVA_IMPLEMENTATION_CS);
		createEReference(javaImplementationCSEClass, JAVA_IMPLEMENTATION_CS__IMPLEMENTATION);

		precedenceCSEClass = createEClass(PRECEDENCE_CS);
		createEAttribute(precedenceCSEClass, PRECEDENCE_CS__RIGHT_ASSOCIATIVE);
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

		// Obtain other dependent packages
		BaseCSTPackage theBaseCSTPackage = (BaseCSTPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSTPackage.eNS_URI);
		EssentialOCLCSTPackage theEssentialOCLCSTPackage = (EssentialOCLCSTPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSTPackage.eNS_URI);
		PivotPackage thePivotPackage = (PivotPackage)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		libConstraintCSEClass.getESuperTypes().add(theBaseCSTPackage.getConstraintCS());
		libIterationCSEClass.getESuperTypes().add(theBaseCSTPackage.getOperationCS());
		libIterationCSEClass.getESuperTypes().add(this.getJavaImplementationCS());
		libOperationCSEClass.getESuperTypes().add(theBaseCSTPackage.getOperationCS());
		libOperationCSEClass.getESuperTypes().add(this.getJavaImplementationCS());
		libPropertyCSEClass.getESuperTypes().add(theBaseCSTPackage.getAttributeCS());
		libPropertyCSEClass.getESuperTypes().add(this.getJavaImplementationCS());
		libRootPackageCSEClass.getESuperTypes().add(theBaseCSTPackage.getRootPackageCS());
		precedenceCSEClass.getESuperTypes().add(theBaseCSTPackage.getNamedElementCS());

		// Initialize classes and features; add operations and parameters
		initEClass(libConstraintCSEClass, LibConstraintCS.class, "LibConstraintCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibConstraintCS_OwnedExpression(), theEssentialOCLCSTPackage.getExpCS(), null, "ownedExpression", null, 0, 1, LibConstraintCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libIterationCSEClass, LibIterationCS.class, "LibIterationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libOperationCSEClass, LibOperationCS.class, "LibOperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibOperationCS_Precedence(), thePivotPackage.getPrecedence(), null, "precedence", null, 0, 1, LibOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libPropertyCSEClass, LibPropertyCS.class, "LibPropertyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libRootPackageCSEClass, LibRootPackageCS.class, "LibRootPackageCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibRootPackageCS_OwnedPrecedence(), this.getPrecedenceCS(), null, "ownedPrecedence", null, 0, -1, LibRootPackageCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaImplementationCSEClass, JavaImplementationCS.class, "JavaImplementationCS", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaImplementationCS_Implementation(), theTypesPackage.getJvmType(), null, "implementation", null, 0, 1, JavaImplementationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceCSEClass, PrecedenceCS.class, "PrecedenceCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedenceCS_RightAssociative(), ecorePackage.getEBoolean(), "rightAssociative", "false", 0, 1, PrecedenceCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] 
		   {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

} //OCLstdlibCSTPackageImpl
