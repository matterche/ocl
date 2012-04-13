/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: Ecore2PivotDeclarationSwitch.java,v 1.15 2011/05/20 19:06:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.ecore;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.ocl.common.OCLCommon;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.delegate.SettingBehavior;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.AliasAdapter;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;

public class Ecore2PivotDeclarationSwitch extends EcoreSwitch<Object>
{
	protected final Ecore2Pivot converter;
	
	public Ecore2PivotDeclarationSwitch(Ecore2Pivot converter) {
		this.converter = converter;
	}
	
	@Override
	public Annotation caseEAnnotation(EAnnotation eObject) {
		String source = eObject.getSource();
		EMap<String, String> details = eObject.getDetails();
		Annotation pivotElement = PivotFactory.eINSTANCE.createAnnotation();
		pivotElement.setName(source);
		converter.addMapping(eObject, pivotElement);
		doSwitchAll(pivotElement.getOwnedContent(), eObject.getContents());
		for (Map.Entry<String, String> entry : details) {
			String key = entry.getKey();
			if (!key.equals("documentation") || !GenModelPackage.eNS_URI.equals(source)) {
				Detail pivotDetail = PivotFactory.eINSTANCE.createDetail();
				pivotDetail.setName(key);
				pivotDetail.getValue().add(entry.getValue());
				pivotElement.getOwnedDetail().add(pivotDetail);	// FIXME refreshList
			}
		}
		if (!eObject.getReferences().isEmpty()) {
			converter.queueReference(eObject);
		}
		return pivotElement;
	}

	@Override
	public Property caseEAttribute(EAttribute eObject) {
		Property pivotElement = converter.refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, eObject);
		copyStructuralFeature(pivotElement, eObject, null);
		pivotElement.setIsID(eObject.isID());			
		return pivotElement;
	}

	@Override
	public org.eclipse.ocl.examples.pivot.Class caseEClass(EClass eObject) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = converter.refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, eObject);
		copyClassifier(pivotElement, eObject);
		pivotElement.setIsAbstract(eObject.isAbstract());			
		pivotElement.setIsInterface(eObject.isInterface());			
		doSwitchAll(eObject.getEGenericSuperTypes());
		List<Operation> pivotOperations = pivotElement.getOwnedOperation();
		List<Constraint> pivotConstraints = pivotElement.getOwnedRule();
		for (EOperation eOperation : eObject.getEOperations()) {
			if (EcoreUtil.isInvariant(eOperation)) {
				Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
				constraint.setStereotype(UMLReflection.INVARIANT);
				constraint.setName(eOperation.getName());
				constraint.setIsCallable(true);
				String value = null;
				String commentBody = EcoreUtil.getAnnotation(eOperation, GenModelPackage.eNS_URI, "documentation");
				if (commentBody != null) {
					Comment pivotComment = PivotFactory.eINSTANCE.createComment();
					pivotComment.setBody(commentBody.replaceAll("\\r", ""));
					constraint.getOwnedComment().add(pivotComment);
				}				
				EAnnotation eAnnotation = OCLCommon.getDelegateAnnotation(eOperation);
				if (eAnnotation == null) {
					eAnnotation = eOperation.getEAnnotation(org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage.eNS_URI);
				}
				if (eAnnotation == null) {
					eAnnotation = eOperation.getEAnnotation("http://www.eclipse.org/uml2/1.1.0/GenModel");
				}
				if (eAnnotation != null) {
					value = eAnnotation.getDetails().get("body");
				}
				OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();	// FIXME ExpressionInOcl
				specification.getBody().add(value);
				specification.getLanguage().add(PivotConstants.OCL_LANGUAGE);
				constraint.setSpecification(specification);
				pivotConstraints.add(constraint);
				converter.addMapping(eOperation, constraint);
			}
			else {
				Object pivotObject = doSwitch(eOperation);
				pivotOperations.add((Operation) pivotObject);
			}
		}
		doSwitchAll(pivotElement.getOwnedAttribute(), eObject.getEStructuralFeatures());
		converter.queueReference(eObject);				// For superclasses
		return pivotElement;
	}

	@Override
	public DataType caseEDataType(EDataType eObject) {
		DataType pivotElement = converter.refreshNamedElement(DataType.class, PivotPackage.Literals.DATA_TYPE, eObject);
		copyDataTypeOrEnum(pivotElement, eObject);
		Class<?> instanceClass = eObject.getInstanceClass();
		if (instanceClass != null) {
			try {
				MetaModelManager metaModelManager = converter.getMetaModelManager();
				if (instanceClass == boolean.class) {
					pivotElement.setBehavioralType(metaModelManager.getBooleanType());
				}
				else if (instanceClass == byte.class) {
					pivotElement.setBehavioralType(metaModelManager.getIntegerType());
				}
				else if (instanceClass == char.class) {
					pivotElement.setBehavioralType(metaModelManager.getIntegerType());
				}
				else if (instanceClass == double.class) {
					pivotElement.setBehavioralType(metaModelManager.getRealType());
				}
				else if (instanceClass == float.class) {
					pivotElement.setBehavioralType(metaModelManager.getRealType());
				}
				else if (instanceClass == int.class) {
					pivotElement.setBehavioralType(metaModelManager.getIntegerType());
				}
				else if (instanceClass == long.class) {
					pivotElement.setBehavioralType(metaModelManager.getIntegerType());
				}
				else if (instanceClass == short.class) {
					pivotElement.setBehavioralType(metaModelManager.getIntegerType());
				}
				else {
					if (instanceClass == BigDecimal.class) {
						pivotElement.setBehavioralType(metaModelManager.getRealType());
					}
					else if (instanceClass == BigInteger.class) {
						pivotElement.setBehavioralType(metaModelManager.getIntegerType());
					}
					else if (instanceClass == Boolean.class) {
						pivotElement.setBehavioralType(metaModelManager.getBooleanType());
					}
					else if (instanceClass == Byte.class) {
						pivotElement.setBehavioralType(metaModelManager.getIntegerType());
					}
					else if (instanceClass == Character.class) {
						pivotElement.setBehavioralType(metaModelManager.getIntegerType());
					}
					else if (instanceClass == Double.class) {
						pivotElement.setBehavioralType(metaModelManager.getRealType());
					}
					else if (instanceClass == Float.class) {
						pivotElement.setBehavioralType(metaModelManager.getRealType());
					}
					else if (instanceClass == Integer.class) {
						pivotElement.setBehavioralType(metaModelManager.getIntegerType());
					}
					else if (instanceClass == Long.class) {
						pivotElement.setBehavioralType(metaModelManager.getIntegerType());
					}
					else if (instanceClass == Short.class) {
						pivotElement.setBehavioralType(metaModelManager.getIntegerType());
					}
					else if (instanceClass == String.class) {
						pivotElement.setBehavioralType(metaModelManager.getStringType());
					}
					else {
						instanceClass.getDeclaredMethod("compareTo", instanceClass);
						converter.queueReference(eObject);			// Defer synthesis till supertypes resolved
					}
				}
			} catch (Exception e) {
			}
		}
		return pivotElement;
	}

	@Override
	public Enumeration caseEEnum(EEnum eObject) {
		Enumeration pivotElement = converter.refreshNamedElement(Enumeration.class, PivotPackage.Literals.ENUMERATION, eObject);
		copyDataTypeOrEnum(pivotElement, eObject);
		doSwitchAll(pivotElement.getOwnedLiteral(), eObject.getELiterals());
		return pivotElement;
	}

	@Override
	public EnumerationLiteral caseEEnumLiteral(EEnumLiteral eEnumLiteral) {
		EnumerationLiteral pivotElement = converter.refreshNamedElement(EnumerationLiteral.class,
			PivotPackage.Literals.ENUMERATION_LITERAL, eEnumLiteral);
		copyNamedElement(pivotElement, eEnumLiteral);
		copyAnnotatedElement(pivotElement, eEnumLiteral, null);
		if (eEnumLiteral.eIsSet(EcorePackage.Literals.EENUM_LITERAL__VALUE)) {
			pivotElement.setValue(BigInteger.valueOf(eEnumLiteral.getValue()));
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.ENUMERATION_LITERAL__VALUE);
		}
//			String literal = basicGet(eObject, EcorePackage.Literals.EENUM_LITERAL__LITERAL, String.class);
//			Enumerator instance = eEnumLiteral.getInstance();
//			if (literal != null) {
/*				AnnotationCS csAnnotation = PivotFactory.eINSTANCE.createAnnotationCS();
				csAnnotation.setIdSource(EcorePackage.eNS_URI);
				DetailCS csDetail = PivotFactory.eINSTANCE.createDetailCS();
				csDetail.setIdName("literal");
				copyDetailLines(csDetail.getValue(), literal);
				csAnnotation.getDetails().add(csDetail);
				pivotElement.getAnnotations().add(csAnnotation); */
//			}
		return pivotElement;
	}

	@Override
	public Object caseEGenericType(EGenericType eObject) {
		doSwitchAll(eObject.getETypeArguments());
		converter.addGenericType(eObject);		// Wait till all unspecialized types converted
		return true;
	}

	@Override
	public Operation caseEOperation(EOperation eObject) {
		Operation pivotElement = converter.refreshNamedElement(Operation.class, PivotPackage.Literals.OPERATION, eObject);
		List<EAnnotation> excludedAnnotations =  null;
		EAnnotation oclAnnotation = OCLCommon.getDelegateAnnotation(eObject);
		if (oclAnnotation == null) {
			oclAnnotation = eObject.getEAnnotation(org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage.eNS_URI);
		}
		if (oclAnnotation == null) {
			oclAnnotation = eObject.getEAnnotation("http://www.eclipse.org/uml2/1.1.0/GenModel");
		}
		if (oclAnnotation != null) {
			excludedAnnotations = new ArrayList<EAnnotation>();
			excludedAnnotations.add(oclAnnotation);
			List<Constraint> constraints = pivotElement.getOwnedRule();
			for (Map.Entry<String,String> entry : oclAnnotation.getDetails().entrySet()) {
				Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
				String key = entry.getKey();
				if (key.equals("body")) {
					constraint.setStereotype(UMLReflection.BODY);
				}
				else if (key.startsWith("body_")) {
					constraint.setStereotype(UMLReflection.BODY);
					constraint.setName(key.substring(5));
				}
				else if (key.equals("pre")) {
					constraint.setStereotype(UMLReflection.PRECONDITION);
				}
				else if (key.startsWith("pre_")) {
					constraint.setStereotype(UMLReflection.PRECONDITION);
					constraint.setName(key.substring(4));
				}
				else if (key.equals("post")) {
					constraint.setStereotype(UMLReflection.POSTCONDITION);
				}
				else if (key.startsWith("post_")) {
					constraint.setStereotype(UMLReflection.POSTCONDITION);
					constraint.setName(key.substring(5));
				}
				else
				{
					converter.error("Unsupported operation constraint " + key);
					constraint = null;
				}
				if (constraint != null) {
					String value = entry.getValue();
					OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();	// FIXME ExpressionInOcl
					specification.getBody().add(value);
					specification.getLanguage().add(PivotConstants.OCL_LANGUAGE);
					constraint.setSpecification(specification);
//						constraint.setExprString(entry.getValue());
					constraints.add(constraint);
					pivotElement.setImplementation(new EObjectOperation(eObject, specification));
				}
			}				
		}
		copyTypedMultiplicityElement(pivotElement, eObject, excludedAnnotations);
		doSwitchAll(pivotElement.getOwnedParameter(), eObject.getEParameters());
		copyTemplateSignature(pivotElement, eObject.getETypeParameters());
		doSwitchAll(eObject.getEGenericExceptions());
		converter.queueReference(eObject);				// For superclasses
		return pivotElement;
	}

	@Override
	public org.eclipse.ocl.examples.pivot.Package caseEPackage(EPackage eObject) {
		org.eclipse.ocl.examples.pivot.Package pivotElement = converter.refreshNamedElement(org.eclipse.ocl.examples.pivot.Package.class, PivotPackage.Literals.PACKAGE, eObject);
		if (eObject.eIsSet(EcorePackage.Literals.EPACKAGE__NS_URI)) {
			pivotElement.setNsURI(eObject.getNsURI());
		}
		if (eObject.eIsSet(EcorePackage.Literals.EPACKAGE__NS_PREFIX)) {
			pivotElement.setNsPrefix(eObject.getNsPrefix());
		}
		converter.getMetaModelManager().addPackage(pivotElement);
		String moniker = Pivot2Moniker.toString(pivotElement);
		AliasAdapter adapter = AliasAdapter.getAdapter(eObject.eResource());
		if (adapter != null) {
			adapter.getAliasMap().put(eObject, moniker);
		}
		EAnnotation eAnnotation = eObject.getEAnnotation(EcorePackage.eNS_URI);
		List<EAnnotation> exclusions = eAnnotation == null ? Collections.<EAnnotation>emptyList() : Collections.singletonList(eAnnotation);
		copyNamedElement(pivotElement, eObject);
		copyAnnotatedElement(pivotElement, eObject, exclusions);
		doSwitchAll(pivotElement.getNestedPackage(), eObject.getESubpackages());
		doSwitchAll(pivotElement.getOwnedType(), eObject.getEClassifiers());
		return pivotElement;
	}

	@Override
	public Parameter caseEParameter(EParameter eObject) {
		Parameter pivotElement = converter.refreshNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, eObject);
		copyTypedMultiplicityElement(pivotElement, eObject, null);
		return pivotElement;
	}

	@Override
	public Property caseEReference(EReference eObject) {
		Property pivotElement = converter.refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, eObject);	
		EAnnotation oppositeRole = eObject.getEAnnotation(EMOFExtendedMetaData.EMOF_PACKAGE_NS_URI_2_0);
		List<EAnnotation> excludedAnnotations = oppositeRole != null ? Collections.singletonList(oppositeRole) : null;
		copyStructuralFeature(pivotElement, eObject, excludedAnnotations);
		pivotElement.setIsComposite(eObject.isContainment());			
		pivotElement.setIsResolveProxies(eObject.isResolveProxies());			
		if ((eObject.getEOpposite() != null)
		 || (excludedAnnotations != null)
		 || (oppositeRole != null)
		 || !eObject.getEKeys().isEmpty()) {
			converter.queueReference(eObject);	// Defer
		}
		return pivotElement;
	}

	@Override
	public Element caseETypeParameter(ETypeParameter eObject) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = converter.refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, eObject);
		converter.addMapping(eObject, pivotElement);
		String name = eObject.getName();
		pivotElement.setName(name);
		TypeTemplateParameter typeTemplateParameter = (TypeTemplateParameter) pivotElement.getTemplateParameter();
		if (typeTemplateParameter == null) {
			typeTemplateParameter = PivotFactory.eINSTANCE.createTypeTemplateParameter();
			typeTemplateParameter.setOwnedParameteredElement(pivotElement);
		}
		List<EGenericType> eBounds = eObject.getEBounds();
		if (!eBounds.isEmpty()) {
			doSwitchAll(eBounds);
			converter.queueReference(eObject);
		}
		return typeTemplateParameter;
	}

	protected void copyClassifier(org.eclipse.ocl.examples.pivot.Class pivotElement, EClassifier eClassifier) {
		List<EAnnotation> excludedAnnotations =  null;
		EMap<String, String> oclAnnotationDetails = null;
		Map<String, Constraint> constraintMap = null;
		EAnnotation oclAnnotation = OCLCommon.getDelegateAnnotation(eClassifier);
		if (oclAnnotation != null) {
			excludedAnnotations = new ArrayList<EAnnotation>();
			excludedAnnotations.add(oclAnnotation);
			List<Constraint> constraints = pivotElement.getOwnedRule();
			oclAnnotationDetails = oclAnnotation.getDetails();
			int iMax = oclAnnotationDetails.size();
			for (int i = 0; i < iMax; i++) {
				Map.Entry<String,String> entry = oclAnnotationDetails.get(i);
				String constraintName = entry.getKey();
				if (constraintName == null) {
					constraintName = "";
				}
				if (!constraintName.endsWith(PivotConstants.MESSAGE_ANNOTATION_DETAIL_SUFFIX)) {
					Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
					constraint.setStereotype(UMLReflection.INVARIANT);
					constraint.setName(constraintName);
					String value = entry.getValue();
					OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();	// FIXME ExpressionInOcl
					specification.getBody().add(value);
					specification.getLanguage().add(PivotConstants.OCL_LANGUAGE);
					String message = oclAnnotationDetails.get(constraintName + PivotConstants.MESSAGE_ANNOTATION_DETAIL_SUFFIX);
					specification.getMessage().add(message != null ? message : "");
					constraint.setSpecification(specification);
					constraints.add(constraint);
					if (constraintMap == null) {
						constraintMap = new HashMap<String, Constraint>();
					}
					constraintMap.put(constraintName, constraint);
				}
			}				
		}
		EAnnotation ecoreAnnotation = eClassifier.getEAnnotation(EcorePackage.eNS_URI);
		if (ecoreAnnotation != null) {
			if (excludedAnnotations == null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
			}
			excludedAnnotations.add(ecoreAnnotation);
			String constraintNameList = ecoreAnnotation.getDetails().get("constraints");
			if (constraintNameList != null) {
				List<Constraint> constraints = pivotElement.getOwnedRule();
				String[] constraintNames = constraintNameList.split(" ");
				for (String constraintName : constraintNames) {
					if ((oclAnnotationDetails == null) || (oclAnnotationDetails.get(constraintName) == null)) {
						Constraint constraint = null;
						if (constraintMap != null) {
							constraint = constraintMap.get(constraintName);
						}
						if (constraint == null) {
							constraint = PivotFactory.eINSTANCE.createConstraint();
						}
						constraint.setStereotype(UMLReflection.INVARIANT);
						constraint.setName(constraintName);
						OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();
						constraint.setSpecification(specification);
						constraints.add(constraint);
					}
				}
			}
		}
		copyNamedElement(pivotElement, eClassifier);
		copyAnnotatedElement(pivotElement, eClassifier, excludedAnnotations);
		if (eClassifier.eIsSet(EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME)) {
			pivotElement.setInstanceClassName(eClassifier.getInstanceClassName());
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.TYPE__INSTANCE_CLASS_NAME);
		}
		copyTemplateSignature(pivotElement, eClassifier.getETypeParameters());
	}

	protected void copyDataTypeOrEnum(DataType pivotElement, EDataType eDataType) {
		copyClassifier(pivotElement, eDataType);
		pivotElement.setIsSerializable(eDataType.isSerializable());
	}

	protected void copyTemplateSignature(TemplateableElement pivotElement, List<ETypeParameter> eTypeParameters) {
		if (!eTypeParameters.isEmpty()) {
			TemplateSignature pivotTemplateSignature = PivotFactory.eINSTANCE.createTemplateSignature();
			pivotElement.setOwnedTemplateSignature(pivotTemplateSignature);
			doSwitchAll(pivotTemplateSignature.getOwnedParameter(), eTypeParameters);
		}
	}

	protected void copyAnnotatedElement(NamedElement pivotElement,
			EModelElement eModelElement, List<EAnnotation> excludedAnnotations) {
		List<Annotation> pivotAnnotations = pivotElement.getOwnedAnnotation();
		for (EAnnotation eAnnotation : eModelElement.getEAnnotations()) {
			if ((excludedAnnotations == null) || !excludedAnnotations.contains(eAnnotation)) {
				String source = eAnnotation.getSource();
				EMap<String, String> details = eAnnotation.getDetails();
				if (GenModelPackage.eNS_URI.equals(source)) {
					if (details.containsKey("documentation")) {
						Comment pivotComment = PivotFactory.eINSTANCE.createComment();
						pivotComment.setBody(details.get("documentation"));
						pivotElement.getOwnedComment().add(pivotComment);
					}
				}				
				if (!eAnnotation.getContents().isEmpty()
				 || !eAnnotation.getReferences().isEmpty()
				 || (details.size() > 1)
				 || ((details.size() == 1) && (!GenModelPackage.eNS_URI.equals(source) || !details.containsKey("documentation")))) {
					Annotation pivotAnnotation = (Annotation) doSwitch(eAnnotation);
					pivotAnnotations.add((Annotation) pivotAnnotation);
				}
			}
		}
	}

	protected void copyNamedElement(NamedElement pivotElement, ENamedElement eNamedElement) {
		converter.addMapping(eNamedElement, pivotElement);
		String name = eNamedElement.getName();
		pivotElement.setName(name);
	}

	protected void copyStructuralFeature(Property pivotElement, EStructuralFeature eObject, List<EAnnotation> excludedAnnotations) {
		EAnnotation oclAnnotation = OCLCommon.getDelegateAnnotation(eObject);
		if (oclAnnotation != null) {
			excludedAnnotations = new ArrayList<EAnnotation>();
			excludedAnnotations.add(oclAnnotation);
			List<Constraint> constraints = pivotElement.getOwnedRule();
			for (Map.Entry<String,String> entry : oclAnnotation.getDetails().entrySet()) {
				Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
				String key = entry.getKey();
				if (key.equals(SettingBehavior.DERIVATION_CONSTRAINT_KEY)) {
					constraint.setStereotype(UMLReflection.DERIVATION);
				}
				else if (key.equals(SettingBehavior.INITIAL_CONSTRAINT_KEY)) {
					constraint.setStereotype(UMLReflection.INITIAL);
				}
				else if (key.equals("get")) {
					constraint.setStereotype(UMLReflection.DERIVATION);
				}
				else
				{
					converter.error("Unsupported feature constraint " + key);
					constraint = null;
				}
				if (constraint != null) {
					String value = entry.getValue();
					OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();	// FIXME ExpressionInOcl
					specification.getBody().add(value);
					specification.getLanguage().add(PivotConstants.OCL_LANGUAGE);
					constraint.setSpecification(specification);
//						constraint.setExprString(entry.getValue());
					constraints.add(constraint);
					pivotElement.setImplementation(new EObjectProperty(eObject, specification));
				}
				else {
					pivotElement.setImplementation(new EObjectProperty(eObject, null));
				}
			}				
		}
		copyTypedMultiplicityElement(pivotElement, eObject, excludedAnnotations);
		pivotElement.setIsReadOnly(!eObject.isChangeable());			
		pivotElement.setIsDerived(eObject.isDerived());			
		pivotElement.setIsTransient(eObject.isTransient());			
		pivotElement.setIsUnsettable(eObject.isUnsettable());			
		pivotElement.setIsVolatile(eObject.isVolatile());			
		if (eObject.eIsSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL)) {
			pivotElement.setDefault(eObject.getDefaultValueLiteral());
		}
		else {
			pivotElement.eUnset(PivotPackage.Literals.PROPERTY__DEFAULT);
		}
	}

	protected void copyTypedMultiplicityElement(TypedMultiplicityElement pivotElement, ETypedElement eTypedElement, List<EAnnotation> excludedAnnotations) {
		copyNamedElement(pivotElement, eTypedElement);
		copyAnnotatedElement(pivotElement, eTypedElement, excludedAnnotations);
		int lower = eTypedElement.getLowerBound();
		int upper = eTypedElement.getUpperBound();
		pivotElement.setLower(BigInteger.valueOf(lower));
		pivotElement.setUpper(BigInteger.valueOf(upper));
		pivotElement.setIsOrdered(eTypedElement.isOrdered());			
		pivotElement.setIsUnique(eTypedElement.isUnique());			
		EGenericType eGenericType = eTypedElement.getEGenericType();
		if (eGenericType != null) {
			doInPackageSwitch(eGenericType);
//				EClassifier eClassifier = eGenericType.getEClassifier();
//				if (eClassifier != null) {
//					allEClassifiers.add(eClassifier);
//				}
//				Element csType = doSwitch(eGenericType);
//				pivotElement.setType((TypedRefCS) csType);
			converter.queueReference(eTypedElement);
		}
	}

	@Override
	public Element defaultCase(EObject object) {
		converter.error("Unsupported " + object.eClass().getName() + " for Ecore2PivotDeclarationSwitch");
		return null;
	}

	public Object doInPackageSwitch(EObject eObject) {		// FIXME Diagnose not in Ecore package better than a case tree CCE
		int classifierID = eObject.eClass().getClassifierID();
		return doSwitch(classifierID, eObject);
	}

	public <T extends Element> void doSwitchAll(Collection<T> pivotObjects, List<? extends EObject> eObjects) {
		for (EObject eObject : eObjects) {
			@SuppressWarnings("unchecked")
			T pivotObject = (T) doSwitch(eObject);
			pivotObjects.add(pivotObject);
		}
	}

	public <T extends Element> void doSwitchAll(List<? extends EObject> eObjects) {
		for (EObject eObject : eObjects) {
			doSwitch(eObject);
		}
	}
}
