/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PivotPackageImpl.java,v 1.1.2.1 2010/10/01 13:49:56 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.internal.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;

import org.eclipse.ocl.examples.pivot.util.PivotValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PivotPackageImpl extends EPackageImpl implements PivotPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected String packageFilename = "pivot.ecore"; //$NON-NLS-1$

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass anyTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass namedElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass elementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass oclAnyEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass classEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass propertyEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementableElementEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typedElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedMultiplicityElementEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlimitedNaturalLiteralExpEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass multiplicityElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass parameterableElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass templateParameterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass templateSignatureEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass templateableElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass templateBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass templateParameterSubstitutionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass associationClassEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass parameterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationTemplateParameterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass commentEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeClassEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeEnvironmentEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeOperationEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completePackageEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completePropertyEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass packageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeTemplateParameterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass associationClassCallExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass navigationCallExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass featureCallExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iNamedElementEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPivotElementEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass callExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableImplementationEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass oclExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass bagTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass collectionTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dataTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass booleanLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass primitiveLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass literalExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass collectionItemEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass collectionLiteralPartEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass collectionLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass collectionRangeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumerationLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationContextEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumerationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass expressionInOclEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass opaqueExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ifExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass integerLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass numericLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass invalidLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass invalidTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterateEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass iterateExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass loopExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass iteratorExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass letExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass messageExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass messageTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monikeredElementEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass signalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass nullLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass oclInvalidEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass oclVoidEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationCallExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass orderedSetTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass packageableElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass primitiveTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass propertyCallExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass realLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sequenceTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass setTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stateExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stringLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass templateParameterTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tupleLiteralExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tupleLiteralPartEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tupleTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass unspecifiedValueExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueSpecificationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableExpEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitableEClass = null;

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitorEClass = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass voidTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associativityKindEEnum = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum collectionKindEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType booleanEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intEDataType = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType integerEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType realEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType stringEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType unlimitedNaturalEDataType = null;

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
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private PivotPackageImpl()
  {
		super(eNS_URI, PivotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PivotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
  public static PivotPackage init()
  {
		if (isInited) return (PivotPackage)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI);

		// Obtain or create and register package
		PivotPackageImpl thePivotPackage = (PivotPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PivotPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PivotPackageImpl());

		isInited = true;

		// Load packages
		thePivotPackage.loadPackage();

		// Fix loaded packages
		thePivotPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePivotPackage, 
			 new EValidator.Descriptor()
			 {
				 public EValidator getEValidator()
				 {
					 return PivotValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePivotPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PivotPackage.eNS_URI, thePivotPackage);
		return thePivotPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation()
	{
		if (annotationEClass == null)
		{
			annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(9);
		}
		return annotationEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_OwnedContent()
	{
        return (EReference)getAnnotation().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Reference()
	{
        return (EReference)getAnnotation().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_OwnedDetail()
	{
        return (EReference)getAnnotation().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAnyType()
  {
		if (anyTypeEClass == null)
		{
			anyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(10);
		}
		return anyTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getType()
  {
		if (typeEClass == null)
		{
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(98);
		}
		return typeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getType_Package()
  {
        return (EReference)getType().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNamedElement()
  {
		if (namedElementEClass == null)
		{
			namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(58);
		}
		return namedElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_OwnedAnnotation()
	{
        return (EReference)getNamedElement().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNamedElement_Name()
  {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_OwnedRule()
	{
        return (EReference)getNamedElement().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace()
	{
		if (namespaceEClass == null)
		{
			namespaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(59);
		}
		return namespaceEClass;
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getElement()
  {
		if (elementEClass == null)
		{
			elementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(33);
		}
		return elementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getElement_OwnedComment()
  {
        return (EReference)getElement().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOclAny()
  {
		if (oclAnyEClass == null)
		{
			oclAnyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(63);
		}
		return oclAnyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getOclAny__OclType()
  {
        return getOclAny().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getOclAny__OclIsInvalid()
  {
        return getOclAny().getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getOclAny__OclIsUndefined()
  {
        return getOclAny().getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getClass_()
  {
		if (classEClass == null)
		{
			classEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(18);
		}
		return classEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_InstanceClassName()
	{
        return (EAttribute)getClass_().getEStructuralFeatures().get(4);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getClass_IsAbstract()
  {
        return (EAttribute)getClass_().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getClass_OwnedAttribute()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getClass_OwnedOperation()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getClass_SuperClass()
  {
        return (EReference)getClass_().getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProperty()
  {
		if (propertyEClass == null)
		{
			propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(79);
		}
		return propertyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProperty_IsReadOnly()
  {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProperty_Default()
  {
        return (EAttribute)getProperty().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProperty_IsComposite()
  {
        return (EAttribute)getProperty().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getProperty_IsDerived()
  {
        return (EAttribute)getProperty().getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProperty_Opposite()
  {
        return (EReference)getProperty().getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProperty_Association()
  {
        return (EReference)getProperty().getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProperty_Class()
  {
        return (EReference)getProperty().getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getProperty__ValidateBindingToAttribute__DiagnosticChain_Map()
  {
        return getProperty().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementableElement()
	{
		if (implementableElementEClass == null)
		{
			implementableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(43);
		}
		return implementableElementEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementableElement_ImplementationClass()
	{
        return (EAttribute)getImplementableElement().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementableElement_Implementation()
	{
        return (EReference)getImplementableElement().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplementableElement__Evaluate__EvaluationContext_OclExpression()
	{
        return getImplementableElement().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypedElement()
  {
		if (typedElementEClass == null)
		{
			typedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(101);
		}
		return typedElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypedElement_Type()
  {
        return (EReference)getTypedElement().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedMultiplicityElement()
	{
		if (typedMultiplicityElementEClass == null)
		{
			typedMultiplicityElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(102);
		}
		return typedMultiplicityElementEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlimitedNaturalLiteralExp()
	{
		if (unlimitedNaturalLiteralExpEClass == null)
		{
			unlimitedNaturalLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(103);
		}
		return unlimitedNaturalLiteralExpEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnlimitedNaturalLiteralExp_Symbol()
	{
        return (EAttribute)getUnlimitedNaturalLiteralExp().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMultiplicityElement()
  {
		if (multiplicityElementEClass == null)
		{
			multiplicityElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(57);
		}
		return multiplicityElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMultiplicityElement_IsOrdered()
  {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMultiplicityElement_IsUnique()
  {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMultiplicityElement_Lower()
  {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMultiplicityElement_Upper()
  {
        return (EAttribute)getMultiplicityElement().getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMultiplicityElement__ValidateLowerGe0__DiagnosticChain_Map()
  {
        return getMultiplicityElement().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMultiplicityElement__ValidateUpperGeLower__DiagnosticChain_Map()
  {
        return getMultiplicityElement().getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMultiplicityElement__LowerBound()
  {
        return getMultiplicityElement().getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMultiplicityElement__UpperBound()
  {
        return getMultiplicityElement().getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMultiplicityElement__IsMultivalued()
  {
        return getMultiplicityElement().getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMultiplicityElement__IncludesCardinality__BigInteger()
  {
        return getMultiplicityElement().getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMultiplicityElement__IncludesMultiplicity__MultiplicityElement()
  {
        return getMultiplicityElement().getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getParameterableElement()
  {
		if (parameterableElementEClass == null)
		{
			parameterableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(75);
		}
		return parameterableElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getParameterableElement_TemplateParameter()
  {
        return (EReference)getParameterableElement().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getParameterableElement_OwningTemplateParameter()
  {
        return (EReference)getParameterableElement().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getParameterableElement__IsTemplateParameter()
  {
        return getParameterableElement().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecedence()
	{
		if (precedenceEClass == null)
		{
			precedenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(76);
		}
		return precedenceEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedence_Associativity()
	{
        return (EAttribute)getPrecedence().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecedence_Order()
	{
        return (EAttribute)getPrecedence().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTemplateParameter()
  {
		if (templateParameterEClass == null)
		{
			templateParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(90);
		}
		return templateParameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameter_Signature()
  {
        return (EReference)getTemplateParameter().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameter_OwnedParameteredElement()
  {
        return (EReference)getTemplateParameter().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameter_Default()
  {
        return (EReference)getTemplateParameter().getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameter_OwnedDefault()
  {
        return (EReference)getTemplateParameter().getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameter_ParameteredElement()
  {
        return (EReference)getTemplateParameter().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTemplateParameter__ValidateMustBeCompatible__DiagnosticChain_Map()
  {
        return getTemplateParameter().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTemplateSignature()
  {
		if (templateSignatureEClass == null)
		{
			templateSignatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(93);
		}
		return templateSignatureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateSignature_Parameter()
  {
        return (EReference)getTemplateSignature().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateSignature_Template()
  {
        return (EReference)getTemplateSignature().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateSignature_OwnedParameter()
  {
        return (EReference)getTemplateSignature().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTemplateSignature__ValidateOwnElements__DiagnosticChain_Map()
  {
        return getTemplateSignature().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTemplateableElement()
  {
		if (templateableElementEClass == null)
		{
			templateableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(94);
		}
		return templateableElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_OwnedSpecialization()
	{
        return (EReference)getTemplateableElement().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateableElement_TemplateBinding()
  {
        return (EReference)getTemplateableElement().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateableElement_OwnedTemplateSignature()
  {
        return (EReference)getTemplateableElement().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTemplateableElement__ParameterableElements()
  {
        return getTemplateableElement().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTemplateableElement__IsTemplate()
  {
        return getTemplateableElement().getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTemplateBinding()
  {
		if (templateBindingEClass == null)
		{
			templateBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(89);
		}
		return templateBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateBinding_Signature()
  {
        return (EReference)getTemplateBinding().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateBinding_ParameterSubstitution()
  {
        return (EReference)getTemplateBinding().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateBinding_BoundElement()
  {
        return (EReference)getTemplateBinding().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTemplateBinding__ValidateParameterSubstitutionFormal__DiagnosticChain_Map()
  {
        return getTemplateBinding().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTemplateBinding__ValidateOneParameterSubstitution__DiagnosticChain_Map()
  {
        return getTemplateBinding().getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTemplateParameterSubstitution()
  {
		if (templateParameterSubstitutionEClass == null)
		{
			templateParameterSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(91);
		}
		return templateParameterSubstitutionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameterSubstitution_Formal()
  {
        return (EReference)getTemplateParameterSubstitution().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameterSubstitution_Actual()
  {
        return (EReference)getTemplateParameterSubstitution().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameterSubstitution_OwnedActual()
  {
        return (EReference)getTemplateParameterSubstitution().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTemplateParameterSubstitution_TemplateBinding()
  {
        return (EReference)getTemplateParameterSubstitution().getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTemplateParameterSubstitution__ValidateMustBeCompatible__DiagnosticChain_Map()
  {
        return getTemplateParameterSubstitution().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssociationClass()
  {
		if (associationClassEClass == null)
		{
			associationClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(11);
		}
		return associationClassEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAssociationClass_UnownedAttribute()
  {
        return (EReference)getAssociationClass().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperation()
  {
		if (operationEClass == null)
		{
			operationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(68);
		}
		return operationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Precedence()
	{
        return (EReference)getOperation().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperation_RaisedException()
  {
        return (EReference)getOperation().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperation_OwnedParameter()
  {
        return (EReference)getOperation().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperation_Class()
  {
        return (EReference)getOperation().getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__ValidateTestConstraint__DiagnosticChain_Map()
	{
        return getOperation().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getParameter()
  {
		if (parameterEClass == null)
		{
			parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(74);
		}
		return parameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getParameter_Operation()
  {
        return (EReference)getParameter().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationTemplateParameter()
  {
		if (operationTemplateParameterEClass == null)
		{
			operationTemplateParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(70);
		}
		return operationTemplateParameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getComment()
  {
		if (commentEClass == null)
		{
			commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(24);
		}
		return commentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getComment_Body()
  {
        return (EAttribute)getComment().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getComment_AnnotatedElement()
  {
        return (EReference)getComment().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteClass()
	{
		if (completeClassEClass == null)
		{
			completeClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(25);
		}
		return completeClassEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteClass_Model()
	{
        return (EReference)getCompleteClass().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteClass_Operation()
	{
        return (EReference)getCompleteClass().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteClass_Property()
	{
        return (EReference)getCompleteClass().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteEnvironment()
	{
		if (completeEnvironmentEClass == null)
		{
			completeEnvironmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(26);
		}
		return completeEnvironmentEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompleteEnvironment__GetCompleteClass__Class()
	{
        return getCompleteEnvironment().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompleteEnvironment__GetCompleteOperation__Operation()
	{
        return getCompleteEnvironment().getEOperations().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompleteEnvironment__GetCompletePackage__Package()
	{
        return getCompleteEnvironment().getEOperations().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCompleteEnvironment__GetCompleteProperty__Property()
	{
        return getCompleteEnvironment().getEOperations().get(3);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteOperation()
	{
		if (completeOperationEClass == null)
		{
			completeOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(27);
		}
		return completeOperationEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteOperation_Model()
	{
        return (EReference)getCompleteOperation().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletePackage()
	{
		if (completePackageEClass == null)
		{
			completePackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(28);
		}
		return completePackageEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletePackage_Model()
	{
        return (EReference)getCompletePackage().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletePackage_Type()
	{
        return (EReference)getCompletePackage().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteProperty()
	{
		if (completePropertyEClass == null)
		{
			completePropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(29);
		}
		return completePropertyEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompleteProperty_Model()
	{
        return (EReference)getCompleteProperty().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint()
	{
		if (constraintEClass == null)
		{
			constraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(30);
		}
		return constraintEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainedElement()
	{
        return (EReference)getConstraint().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Specification()
	{
        return (EReference)getConstraint().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Context()
	{
        return (EReference)getConstraint().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Stereotype()
	{
        return (EAttribute)getConstraint().getEStructuralFeatures().get(3);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__ValidateNotApplyToSelf__DiagnosticChain_Map()
	{
        return getConstraint().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__ValidateValueSpecificationBoolean__DiagnosticChain_Map()
	{
        return getConstraint().getEOperations().get(1);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPackage()
  {
		if (packageEClass == null)
		{
			packageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(72);
		}
		return packageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_NsPrefix()
	{
        return (EAttribute)getPackage().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_NsURI()
	{
        return (EAttribute)getPackage().getEStructuralFeatures().get(3);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedPrecedence()
	{
        return (EReference)getPackage().getEStructuralFeatures().get(4);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPackage_NestedPackage()
  {
        return (EReference)getPackage().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPackage_NestingPackage()
  {
        return (EReference)getPackage().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPackage_OwnedType()
  {
        return (EReference)getPackage().getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeTemplateParameter()
  {
		if (typeTemplateParameterEClass == null)
		{
			typeTemplateParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(100);
		}
		return typeTemplateParameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeTemplateParameter_AllowSubstitutable()
  {
        return (EAttribute)getTypeTemplateParameter().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeTemplateParameter_ConstrainingType()
  {
        return (EReference)getTypeTemplateParameter().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeTemplateParameter__ValidateHasConstrainingType__DiagnosticChain_Map()
  {
        return getTypeTemplateParameter().getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAssociationClassCallExp()
  {
		if (associationClassCallExpEClass == null)
		{
			associationClassCallExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(12);
		}
		return associationClassCallExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAssociationClassCallExp_ReferredAssociationClass()
  {
        return (EReference)getAssociationClassCallExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNavigationCallExp()
  {
		if (navigationCallExpEClass == null)
		{
			navigationCallExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(60);
		}
		return navigationCallExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getNavigationCallExp_Qualifier()
  {
        return (EReference)getNavigationCallExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getNavigationCallExp_NavigationSource()
  {
        return (EReference)getNavigationCallExp().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFeatureCallExp()
  {
		if (featureCallExpEClass == null)
		{
			featureCallExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(39);
		}
		return featureCallExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINamedElement()
	{
		if (iNamedElementEClass == null)
		{
			iNamedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(40);
		}
		return iNamedElementEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getINamedElement__GetName()
	{
        return getINamedElement().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPivotElement()
	{
		if (iPivotElementEClass == null)
		{
			iPivotElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(41);
		}
		return iPivotElementEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPivotElement__GetPivot()
	{
        return getIPivotElement().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCallExp()
  {
		if (callExpEClass == null)
		{
			callExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(15);
		}
		return callExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCallExp_Source()
  {
        return (EReference)getCallExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallOperationAction()
	{
		if (callOperationActionEClass == null)
		{
			callOperationActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(16);
		}
		return callOperationActionEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Operation()
	{
        return (EReference)getCallOperationAction().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableImplementation()
	{
		if (callableImplementationEClass == null)
		{
			callableImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(17);
		}
		return callableImplementationEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallableImplementation__Evaluate__EvaluationContext_OclExpression()
	{
        return getCallableImplementation().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOclExpression()
  {
		if (oclExpressionEClass == null)
		{
			oclExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(64);
		}
		return oclExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOclExpression__Evaluate__EvaluationContext()
	{
        return getOclExpression().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBagType()
  {
		if (bagTypeEClass == null)
		{
			bagTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(13);
		}
		return bagTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCollectionType()
  {
		if (collectionTypeEClass == null)
		{
			collectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(23);
		}
		return collectionTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCollectionType_ElementType()
  {
        return (EReference)getCollectionType().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDataType()
  {
		if (dataTypeEClass == null)
		{
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(31);
		}
		return dataTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetail()
	{
		if (detailEClass == null)
		{
			detailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(32);
		}
		return detailEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetail_Value()
	{
        return (EAttribute)getDetail().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBooleanLiteralExp()
  {
		if (booleanLiteralExpEClass == null)
		{
			booleanLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(14);
		}
		return booleanLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getBooleanLiteralExp_BooleanSymbol()
  {
        return (EAttribute)getBooleanLiteralExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPrimitiveLiteralExp()
  {
		if (primitiveLiteralExpEClass == null)
		{
			primitiveLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(77);
		}
		return primitiveLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLiteralExp()
  {
		if (literalExpEClass == null)
		{
			literalExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(52);
		}
		return literalExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCollectionItem()
  {
		if (collectionItemEClass == null)
		{
			collectionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(19);
		}
		return collectionItemEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCollectionItem_Item()
  {
        return (EReference)getCollectionItem().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCollectionLiteralPart()
  {
		if (collectionLiteralPartEClass == null)
		{
			collectionLiteralPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(21);
		}
		return collectionLiteralPartEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCollectionLiteralExp()
  {
		if (collectionLiteralExpEClass == null)
		{
			collectionLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(20);
		}
		return collectionLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getCollectionLiteralExp_Kind()
  {
        return (EAttribute)getCollectionLiteralExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCollectionLiteralExp_Part()
  {
        return (EReference)getCollectionLiteralExp().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCollectionRange()
  {
		if (collectionRangeEClass == null)
		{
			collectionRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(22);
		}
		return collectionRangeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCollectionRange_First()
  {
        return (EReference)getCollectionRange().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCollectionRange_Last()
  {
        return (EReference)getCollectionRange().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnumLiteralExp()
  {
		if (enumLiteralExpEClass == null)
		{
			enumLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(34);
		}
		return enumLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumLiteralExp_ReferredEnumLiteral()
  {
        return (EReference)getEnumLiteralExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnumerationLiteral()
  {
		if (enumerationLiteralEClass == null)
		{
			enumerationLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(36);
		}
		return enumerationLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumerationLiteral_Enumeration()
  {
        return (EReference)getEnumerationLiteral().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationContext()
	{
		if (evaluationContextEClass == null)
		{
			evaluationContextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(37);
		}
		return evaluationContextEClass;
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnumeration()
  {
		if (enumerationEClass == null)
		{
			enumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(35);
		}
		return enumerationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnumeration_OwnedLiteral()
  {
        return (EReference)getEnumeration().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getExpressionInOcl()
  {
		if (expressionInOclEClass == null)
		{
			expressionInOclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(38);
		}
		return expressionInOclEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExpressionInOcl_BodyExpression()
  {
        return (EReference)getExpressionInOcl().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExpressionInOcl_ContextVariable()
  {
        return (EReference)getExpressionInOcl().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExpressionInOcl_ResultVariable()
  {
        return (EReference)getExpressionInOcl().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getExpressionInOcl_ParameterVariable()
  {
        return (EReference)getExpressionInOcl().getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOpaqueExpression()
  {
		if (opaqueExpressionEClass == null)
		{
			opaqueExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(67);
		}
		return opaqueExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body()
	{
        return (EAttribute)getOpaqueExpression().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language()
	{
        return (EAttribute)getOpaqueExpression().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__ValidateLanguageBodySize__DiagnosticChain_Map()
	{
        return getOpaqueExpression().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariable()
  {
		if (variableEClass == null)
		{
			variableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(106);
		}
		return variableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariable_InitExpression()
  {
        return (EReference)getVariable().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariable_RepresentedParameter()
  {
        return (EReference)getVariable().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__Evaluate__EvaluationContext()
	{
        return getVariable().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration()
	{
		if (variableDeclarationEClass == null)
		{
			variableDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(107);
		}
		return variableDeclarationEClass;
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIfExp()
  {
		if (ifExpEClass == null)
		{
			ifExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(42);
		}
		return ifExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfExp_Condition()
  {
        return (EReference)getIfExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfExp_ThenExpression()
  {
        return (EReference)getIfExp().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIfExp_ElseExpression()
  {
        return (EReference)getIfExp().getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIntegerLiteralExp()
  {
		if (integerLiteralExpEClass == null)
		{
			integerLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(44);
		}
		return integerLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getIntegerLiteralExp_IntegerSymbol()
  {
        return (EAttribute)getIntegerLiteralExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNumericLiteralExp()
  {
		if (numericLiteralExpEClass == null)
		{
			numericLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(62);
		}
		return numericLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInvalidLiteralExp()
  {
		if (invalidLiteralExpEClass == null)
		{
			invalidLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(45);
		}
		return invalidLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInvalidType()
  {
		if (invalidTypeEClass == null)
		{
			invalidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(46);
		}
		return invalidTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterate()
	{
		if (iterateEClass == null)
		{
			iterateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(47);
		}
		return iterateEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterate_OwnedAccumulator()
	{
        return (EReference)getIterate().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIterateExp()
  {
		if (iterateExpEClass == null)
		{
			iterateExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(48);
		}
		return iterateExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getIterateExp_Result()
  {
        return (EReference)getIterateExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterateExp_ReferredIterate()
	{
        return (EReference)getIterateExp().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterator()
	{
		if (iteratorEClass == null)
		{
			iteratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(49);
		}
		return iteratorEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterator_OwnedIterator()
	{
        return (EReference)getIterator().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLoopExp()
  {
		if (loopExpEClass == null)
		{
			loopExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(53);
		}
		return loopExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLoopExp_Body()
  {
        return (EReference)getLoopExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLoopExp_Iterator()
  {
        return (EReference)getLoopExp().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getIteratorExp()
  {
		if (iteratorExpEClass == null)
		{
			iteratorExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(50);
		}
		return iteratorExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorExp_ReferredIterator()
	{
        return (EReference)getIteratorExp().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLetExp()
  {
		if (letExpEClass == null)
		{
			letExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(51);
		}
		return letExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLetExp_In()
  {
        return (EReference)getLetExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLetExp_Variable()
  {
        return (EReference)getLetExp().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMessageExp()
  {
		if (messageExpEClass == null)
		{
			messageExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(54);
		}
		return messageExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageExp_Target()
	{
        return (EReference)getMessageExp().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageExp_Argument()
	{
        return (EReference)getMessageExp().getEStructuralFeatures().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageExp_CalledOperation()
	{
        return (EReference)getMessageExp().getEStructuralFeatures().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageExp_SentSignal()
	{
        return (EReference)getMessageExp().getEStructuralFeatures().get(3);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMessageType()
  {
		if (messageTypeEClass == null)
		{
			messageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(55);
		}
		return messageTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMessageType_ReferredSignal()
  {
        return (EReference)getMessageType().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMessageType_ReferredOperation()
  {
        return (EReference)getMessageType().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonikeredElement()
	{
		if (monikeredElementEClass == null)
		{
			monikeredElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(56);
		}
		return monikeredElementEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonikeredElement_Moniker()
	{
        return (EAttribute)getMonikeredElement().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMonikeredElement__HasMoniker()
	{
        return getMonikeredElement().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSignal()
  {
		if (signalEClass == null)
		{
			signalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(85);
		}
		return signalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNullLiteralExp()
  {
		if (nullLiteralExpEClass == null)
		{
			nullLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(61);
		}
		return nullLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOclInvalid()
  {
		if (oclInvalidEClass == null)
		{
			oclInvalidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(65);
		}
		return oclInvalidEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOclVoid()
  {
		if (oclVoidEClass == null)
		{
			oclVoidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(66);
		}
		return oclVoidEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationCallExp()
  {
		if (operationCallExpEClass == null)
		{
			operationCallExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(69);
		}
		return operationCallExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCallExp_Argument()
  {
        return (EReference)getOperationCallExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCallExp_ReferredOperation()
  {
        return (EReference)getOperationCallExp().getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOrderedSetType()
  {
		if (orderedSetTypeEClass == null)
		{
			orderedSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(71);
		}
		return orderedSetTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPackageableElement()
  {
		if (packageableElementEClass == null)
		{
			packageableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(73);
		}
		return packageableElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPrimitiveType()
  {
		if (primitiveTypeEClass == null)
		{
			primitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(78);
		}
		return primitiveTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPropertyCallExp()
  {
		if (propertyCallExpEClass == null)
		{
			propertyCallExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(80);
		}
		return propertyCallExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getPropertyCallExp_ReferredProperty()
  {
        return (EReference)getPropertyCallExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRealLiteralExp()
  {
		if (realLiteralExpEClass == null)
		{
			realLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(81);
		}
		return realLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRealLiteralExp_RealSymbol()
  {
        return (EAttribute)getRealLiteralExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction()
	{
		if (sendSignalActionEClass == null)
		{
			sendSignalActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(82);
		}
		return sendSignalActionEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Signal()
	{
        return (EReference)getSendSignalAction().getEStructuralFeatures().get(0);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSequenceType()
  {
		if (sequenceTypeEClass == null)
		{
			sequenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(83);
		}
		return sequenceTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSetType()
  {
		if (setTypeEClass == null)
		{
			setTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(84);
		}
		return setTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getState()
  {
		if (stateEClass == null)
		{
			stateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(86);
		}
		return stateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStateExp()
  {
		if (stateExpEClass == null)
		{
			stateExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(87);
		}
		return stateExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getStateExp_ReferredState()
  {
        return (EReference)getStateExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStringLiteralExp()
  {
		if (stringLiteralExpEClass == null)
		{
			stringLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(88);
		}
		return stringLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStringLiteralExp_StringSymbol()
  {
        return (EAttribute)getStringLiteralExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTemplateParameterType()
  {
		if (templateParameterTypeEClass == null)
		{
			templateParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(92);
		}
		return templateParameterTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTemplateParameterType_Specification()
  {
        return (EAttribute)getTemplateParameterType().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTupleLiteralExp()
  {
		if (tupleLiteralExpEClass == null)
		{
			tupleLiteralExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(95);
		}
		return tupleLiteralExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTupleLiteralExp_Part()
  {
        return (EReference)getTupleLiteralExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTupleLiteralPart()
  {
		if (tupleLiteralPartEClass == null)
		{
			tupleLiteralPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(96);
		}
		return tupleLiteralPartEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTupleLiteralPart_Attribute()
  {
        return (EReference)getTupleLiteralPart().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTupleType()
  {
		if (tupleTypeEClass == null)
		{
			tupleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(97);
		}
		return tupleTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeExp()
  {
		if (typeExpEClass == null)
		{
			typeExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(99);
		}
		return typeExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeExp_ReferredType()
  {
        return (EReference)getTypeExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getUnspecifiedValueExp()
  {
		if (unspecifiedValueExpEClass == null)
		{
			unspecifiedValueExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(104);
		}
		return unspecifiedValueExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValueSpecification()
  {
		if (valueSpecificationEClass == null)
		{
			valueSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(105);
		}
		return valueSpecificationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsComputable()
	{
        return getValueSpecification().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IntegerValue()
	{
        return getValueSpecification().getEOperations().get(1);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__BooleanValue()
	{
        return getValueSpecification().getEOperations().get(2);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__StringValue()
	{
        return getValueSpecification().getEOperations().get(3);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__UnlimitedValue()
	{
        return getValueSpecification().getEOperations().get(4);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsNull()
	{
        return getValueSpecification().getEOperations().get(5);
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariableExp()
  {
		if (variableExpEClass == null)
		{
			variableExpEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(108);
		}
		return variableExpEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableExp_ReferredVariable()
  {
        return (EReference)getVariableExp().getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitable()
	{
		if (visitableEClass == null)
		{
			visitableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(109);
		}
		return visitableEClass;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitable__Accept__Visitor()
	{
        return getVisitable().getEOperations().get(0);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitor()
	{
		if (visitorEClass == null)
		{
			visitorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(110);
		}
		return visitorEClass;
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVoidType()
  {
		if (voidTypeEClass == null)
		{
			voidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(111);
		}
		return voidTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociativityKind()
	{
		if (associativityKindEEnum == null)
		{
			associativityKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(7);
		}
		return associativityKindEEnum;
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getCollectionKind()
  {
		if (collectionKindEEnum == null)
		{
			collectionKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(8);
		}
		return collectionKindEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getBoolean()
  {
		if (booleanEDataType == null)
		{
			booleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(0);
		}
		return booleanEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt()
	{
		if (intEDataType == null)
		{
			intEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(1);
		}
		return intEDataType;
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getInteger()
  {
		if (integerEDataType == null)
		{
			integerEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(2);
		}
		return integerEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject()
	{
		if (objectEDataType == null)
		{
			objectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(3);
		}
		return objectEDataType;
	}

/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getReal()
  {
		if (realEDataType == null)
		{
			realEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(4);
		}
		return realEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getString()
  {
		if (stringEDataType == null)
		{
			stringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(5);
		}
		return stringEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getUnlimitedNatural()
  {
		if (unlimitedNaturalEDataType == null)
		{
			unlimitedNaturalEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PivotPackage.eNS_URI).getEClassifiers().get(6);
		}
		return unlimitedNaturalEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PivotFactory getPivotFactory()
  {
		return (PivotFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isLoaded = false;

  /**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void loadPackage()
  {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null)
		{
			throw new RuntimeException("Missing serialized package: " + packageFilename); //$NON-NLS-1$
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try
		{
			resource.load(null);
		}
		catch (IOException exception)
		{
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isFixed = false;

  /**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void fixPackageContents()
  {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

  /**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
		if (eClassifier.getInstanceClassName() == null)
		{
			eClassifier.setInstanceClassName("org.eclipse.ocl.examples.pivot." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} //PivotPackageImpl