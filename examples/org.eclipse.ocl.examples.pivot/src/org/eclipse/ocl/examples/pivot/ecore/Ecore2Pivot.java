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
 * $Id: Ecore2Pivot.java,v 1.1.2.3 2010/12/11 10:44:59 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.ecore;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Detail;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.EnumerationLiteral;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeTemplateParameter;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.util.PivotSwitch;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.AliasAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotObjectImpl;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

public class Ecore2Pivot extends AbstractConversion implements Adapter, PivotConstants
{
	private static final Logger logger = Logger.getLogger(Ecore2Pivot.class);

	public static Ecore2Pivot getAdapter(Resource resource, PivotManager pivotManager) {
		if (resource == null) {
			return null;
		}
		List<Adapter> eAdapters = resource.eAdapters();
		Ecore2Pivot adapter = PivotUtil.getAdapter(Ecore2Pivot.class, resource);
		if (adapter != null) {
			return adapter;
		}
		adapter = new Ecore2Pivot(resource, pivotManager);
		eAdapters.add(adapter);
		return adapter;
	}

	private final class EcorePass1 extends EcoreSwitch<Object>
	{

		@Override
		public Annotation caseEAnnotation(EAnnotation eObject) {
			Annotation pivotElement = PivotFactory.eINSTANCE.createAnnotation();
			pivotElement.setName(eObject.getSource());
			doSwitchAll(pivotElement.getOwnedContents(), eObject.getContents());
			EMap<String, String> details = eObject.getDetails();
			for (String key : details.keySet()) {
				Detail pivotDetail = PivotFactory.eINSTANCE.createDetail();
				pivotDetail.setName(key);
				pivotDetail.getValues().add(details.get(key));
				pivotElement.getOwnedDetails().add(pivotDetail);	// FIXME refreshSet
			}
			return pivotElement;
		}

		@Override
		public Property caseEAttribute(EAttribute eObject) {
			Property pivotElement = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, eObject);
			copyStructuralFeature(pivotElement, eObject, null);
			if (eObject.eIsSet(EcorePackage.Literals.EATTRIBUTE__ID)) {
				refreshAnnotation(pivotElement, PIVOT_EATTRIBUTE__ID, Boolean.toString(eObject.isID()));			
			}
			return pivotElement;
		}

		@Override
		public org.eclipse.ocl.examples.pivot.Class caseEClass(EClass eObject) {
			org.eclipse.ocl.examples.pivot.Class pivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, eObject);
			copyClassifier(pivotElement, eObject);
			if (eObject.eIsSet(EcorePackage.Literals.ECLASS__ABSTRACT)) {
				pivotElement.setIsAbstract(eObject.isAbstract());			
			}
			if (eObject.eIsSet(EcorePackage.Literals.ECLASS__INTERFACE)) {
				refreshAnnotation(pivotElement, PIVOT_ECLASS__INTERFACE, Boolean.toString(eObject.isInterface()));			
			}
			doSwitchAll(eObject.getEGenericSuperTypes());
			doSwitchAll(pivotElement.getOwnedOperations(), eObject.getEOperations());
			doSwitchAll(pivotElement.getOwnedAttributes(), eObject.getEStructuralFeatures());
			referencers.put(pivotElement, eObject);				// For superclasses
			return pivotElement;
		}

		@Override
		public DataType caseEDataType(EDataType eObject) {
			DataType pivotElement = refreshNamedElement(DataType.class, PivotPackage.Literals.DATA_TYPE, eObject);
			copyDataTypeOrEnum(pivotElement, eObject);
			return pivotElement;
		}

		@Override
		public Enumeration caseEEnum(EEnum eObject) {
			Enumeration pivotElement = refreshNamedElement(Enumeration.class, PivotPackage.Literals.ENUMERATION, eObject);
			copyDataTypeOrEnum(pivotElement, eObject);
			doSwitchAll(pivotElement.getOwnedLiterals(), eObject.getELiterals());
			return pivotElement;
		}

		@Override
		public EnumerationLiteral caseEEnumLiteral(EEnumLiteral eObject) {
			EnumerationLiteral pivotElement = refreshNamedElement(EnumerationLiteral.class, PivotPackage.Literals.ENUMERATION_LITERAL, eObject);
			copyNamedElement(pivotElement, eObject);
			copyAnnotatedElement(pivotElement, eObject, null);
//			pivotElement.setValue(eObject.getValue());
			String literal = basicGet(eObject, EcorePackage.Literals.EENUM_LITERAL__LITERAL, String.class);
//			Enumerator instance = eEnumLiteral.getInstance();
			if (literal != null) {
/*				AnnotationCS csAnnotation = PivotFactory.eINSTANCE.createAnnotationCS();
				csAnnotation.setIdSource(EcorePackage.eNS_URI);
				DetailCS csDetail = PivotFactory.eINSTANCE.createDetailCS();
				csDetail.setIdName("literal");
				copyDetailLines(csDetail.getValue(), literal);
				csAnnotation.getDetails().add(csDetail);
				pivotElement.getAnnotations().add(csAnnotation); */
			}
			return pivotElement;
		}

		@Override
		public Object caseEGenericType(EGenericType eObject) {
			doSwitchAll(eObject.getETypeArguments());
			genericTypes.add(eObject);		// Wait till all unspecialized types converted
			return true;
		}

		@Override
		public Operation caseEOperation(EOperation eObject) {
			Operation pivotElement = refreshNamedElement(Operation.class, PivotPackage.Literals.OPERATION, eObject);
			List<EAnnotation> excludedAnnotations =  null;
			EAnnotation oclAnnotation = eObject.getEAnnotation(OCLDelegateDomain.OCL_DELEGATE_URI);
			if (oclAnnotation != null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
				excludedAnnotations.add(oclAnnotation);
				List<Constraint> constraints = pivotElement.getOwnedRules();
				for (Map.Entry<String,String> entry : oclAnnotation.getDetails().entrySet()) {
					Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
					String key = entry.getKey();
					if (key.equals("body")) {
						constraint.setStereotype("body");
					}
					else if (key.startsWith("body_")) {
						constraint.setStereotype("body");
						constraint.setName(key.substring(5));
					}
					else if (key.equals("pre")) {
						constraint.setStereotype("precondition");
					}
					else if (key.startsWith("pre_")) {
						constraint.setStereotype("precondition");
						constraint.setName(key.substring(4));
					}
					else if (key.equals("post")) {
						constraint.setStereotype("postcondition");
					}
					else if (key.startsWith("post_")) {
						constraint.setStereotype("postcondition");
						constraint.setName(key.substring(5));
					}
					else
					{
						error("Unsupported operation constraint " + key);
						constraint = null;
					}
					if (constraint != null) {
						String value = entry.getValue();
						OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();	// FIXME ExpressionInOcl
						specification.getBodies().add(value);
						constraint.setSpecification(specification);
//						constraint.setExprString(entry.getValue());
						constraints.add(constraint);
					}
				}				
			}
			copyTypedMultiplicityElement(pivotElement, eObject, excludedAnnotations);
			doSwitchAll(pivotElement.getOwnedParameters(), eObject.getEParameters());
			copyTemplateSignature(pivotElement, eObject.getETypeParameters());
			doSwitchAll(eObject.getEGenericExceptions());
			referencers.put(pivotElement, eObject);				// For superclasses
			return pivotElement;
		}

		@Override
		public org.eclipse.ocl.examples.pivot.Package caseEPackage(EPackage eObject) {
			org.eclipse.ocl.examples.pivot.Package pivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Package.class, PivotPackage.Literals.PACKAGE, eObject);
			EAnnotation eAnnotation = eObject.getEAnnotation(EcorePackage.eNS_URI);
			List<EAnnotation> exclusions = eAnnotation == null ? Collections.<EAnnotation>emptyList() : Collections.singletonList(eAnnotation);
			copyNamedElement(pivotElement, eObject);
			copyAnnotatedElement(pivotElement, eObject, exclusions);
			if (eObject.eIsSet(EcorePackage.Literals.EPACKAGE__NS_PREFIX)) {
				pivotElement.setNsPrefix(eObject.getNsPrefix());
//				refreshAnnotation(pivotElement, PIVOT_EPACKAGE__NS_PREFIX, eObject.getNsPrefix());			
			}
			if (eObject.eIsSet(EcorePackage.Literals.EPACKAGE__NS_URI)) {
				pivotElement.setNsURI(eObject.getNsURI());
//				refreshAnnotation(pivotElement, PIVOT_EPACKAGE__NS_URI, eObject.getNsURI());			
			}
			doSwitchAll(pivotElement.getNestedPackages(), eObject.getESubpackages());
			doSwitchAll(pivotElement.getOwnedTypes(), eObject.getEClassifiers());
			return pivotElement;
		}

		@Override
		public Parameter caseEParameter(EParameter eObject) {
			Parameter pivotElement = refreshNamedElement(Parameter.class, PivotPackage.Literals.PARAMETER, eObject);
			copyTypedMultiplicityElement(pivotElement, eObject, null);
			return pivotElement;
		}

		@Override
		public Property caseEReference(EReference eObject) {
			Property pivotElement = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, eObject);
			EAnnotation oppositeRole = null; // FIXME eReference.getEAnnotation(EMOFExtendedMetaData.EMOF_PROPERTY_OPPOSITE_ROLE_NAME_ANNOTATION_SOURCE);
			List<EAnnotation> excludedAnnotations = oppositeRole != null ? Collections.singletonList(oppositeRole) : null;
			copyStructuralFeature(pivotElement, eObject, excludedAnnotations);
			if ((eObject.getEOpposite() != null) || (excludedAnnotations != null) || !eObject.getEKeys().isEmpty()) {
				referencers.put(pivotElement, eObject);	// Defer
			}
			if (eObject.eIsSet(EcorePackage.Literals.EREFERENCE__CONTAINMENT)) {
				pivotElement.setIsComposite(eObject.isContainment());			
			}
			if (eObject.eIsSet(EcorePackage.Literals.EREFERENCE__RESOLVE_PROXIES)) {
				refreshAnnotation(pivotElement, PIVOT_EREFERENCE__RESOLVE_PROXIES, Boolean.toString(eObject.isResolveProxies()));			
			}
			return pivotElement;
		}

		@Override
		public Element caseETypeParameter(ETypeParameter eObject) {
			org.eclipse.ocl.examples.pivot.Class pivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, eObject);
			String name = eObject.getName();
			pivotElement.setName(name);
//			allNames.add(name);
			TypeTemplateParameter typeTemplateParameter = (TypeTemplateParameter) pivotElement.eContainer();
			if (typeTemplateParameter == null) {
				typeTemplateParameter = PivotFactory.eINSTANCE.createTypeTemplateParameter();
				typeTemplateParameter.setOwnedParameteredElement(pivotElement);
			}
			doSwitchAll(eObject.getEBounds());
			return typeTemplateParameter;
		}

		protected void copyClassifier(org.eclipse.ocl.examples.pivot.Class pivotElement, EClassifier eClassifier) {
			List<EAnnotation> excludedAnnotations =  null;
			EMap<String, String> oclAnnotationDetails = null;
			EAnnotation oclAnnotation = eClassifier.getEAnnotation(OCLDelegateDomain.OCL_DELEGATE_URI);
			if (oclAnnotation != null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
				excludedAnnotations.add(oclAnnotation);
				List<Constraint> constraints = pivotElement.getOwnedRules();
				oclAnnotationDetails = oclAnnotation.getDetails();
				for (Map.Entry<String,String> entry : oclAnnotationDetails.entrySet()) {
					Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
					constraint.setStereotype("invariant");
					constraint.setName(entry.getKey());
					String value = entry.getValue();
					OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();	// FIXME ExpressionInOcl
					specification.getBodies().add(value);
					constraint.setSpecification(specification);
					constraints.add(constraint);
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
					List<Constraint> constraints = pivotElement.getOwnedRules();
					String[] constraintNames = constraintNameList.split(" ");
					for (String constraintName : constraintNames) {
						if ((oclAnnotationDetails == null) || (oclAnnotationDetails.get(constraintName) == null)) {
							Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
							constraint.setStereotype("invariant");
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
			pivotElement.setInstanceClassName(eClassifier.getInstanceClassName());
			copyTemplateSignature(pivotElement, eClassifier.getETypeParameters());
		}

		protected void copyDataTypeOrEnum(DataType pivotElement, EDataType eDataType) {
			copyClassifier(pivotElement, eDataType);
			if (eDataType.eIsSet(EcorePackage.Literals.EDATA_TYPE__SERIALIZABLE)) {
				refreshAnnotation(pivotElement, PIVOT_EDATA_TYPE__SERIALIZABLE, Boolean.toString(eDataType.isSerializable()));			
			}
		}

/*		public void copyDetailLines(List<String> lines, String value) {
			String[] splitLines = value.split("\n");
			for (int i = 0; i < splitLines.length-1; i++) {
				lines.add(splitLines[i] + '\n');
			}
			if (splitLines.length > 0) {
				lines.add(splitLines[splitLines.length-1]);
			}
		} */

		protected void copyModelElement(Element pivotElement, EModelElement eModelElement) {
			setOriginalMapping(pivotElement, eModelElement);
		}

		protected void copyTemplateSignature(TemplateableElement pivotElement, List<ETypeParameter> eTypeParameters) {
			if (!eTypeParameters.isEmpty()) {
				TemplateSignature pivotTemplateSignature = PivotFactory.eINSTANCE.createTemplateSignature();
				pivotElement.setOwnedTemplateSignature(pivotTemplateSignature);
				doSwitchAll(pivotTemplateSignature.getOwnedParameters(), eTypeParameters);
			}
		}

		protected void copyAnnotatedElement(NamedElement pivotElement,
				EModelElement eModelElement, List<EAnnotation> excludedAnnotations) {
			List<Annotation> pivotAnnotations = pivotElement.getOwnedAnnotations();
			for (EAnnotation eAnnotation : eModelElement.getEAnnotations()) {
				if ((excludedAnnotations == null) || !excludedAnnotations.contains(eAnnotation)) {
					Annotation pivotAnnotation = (Annotation) doSwitch(eAnnotation);
					pivotAnnotations.add(pivotAnnotation);
				}
			}
		}

		protected void copyNamedElement(NamedElement pivotElement, ENamedElement eNamedElement) {
			copyModelElement(pivotElement, eNamedElement);
			String name = eNamedElement.getName();
			pivotElement.setName(name);
//			allNames.add(name);
		}

		protected void copyStructuralFeature(Property pivotElement, EStructuralFeature eObject, List<EAnnotation> excludedAnnotations) {
			EAnnotation oclAnnotation = eObject.getEAnnotation(OCLDelegateDomain.OCL_DELEGATE_URI);
			if (oclAnnotation != null) {
				excludedAnnotations = new ArrayList<EAnnotation>();
				excludedAnnotations.add(oclAnnotation);
				List<Constraint> constraints = pivotElement.getOwnedRules();
				for (Map.Entry<String,String> entry : oclAnnotation.getDetails().entrySet()) {
					Constraint constraint = PivotFactory.eINSTANCE.createConstraint();
					String key = entry.getKey();
					if (key.equals("derivation")) {
						constraint.setStereotype("derivation");
					}
					else if (key.equals("initial")) {
						constraint.setStereotype("initial");
					}
					else
					{
						error("Unsupported feature constraint " + key);
						constraint = null;
					}
					if (constraint != null) {
						String value = entry.getValue();
						OpaqueExpression specification = PivotFactory.eINSTANCE.createOpaqueExpression();	// FIXME ExpressionInOcl
						specification.getBodies().add(value);
						constraint.setSpecification(specification);
//						constraint.setExprString(entry.getValue());
						constraints.add(constraint);
					}
				}				
			}
			copyTypedMultiplicityElement(pivotElement, eObject, excludedAnnotations);
			if (eObject.eIsSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__CHANGEABLE)) {
				pivotElement.setIsReadOnly(!eObject.isChangeable());			
			}
			if (eObject.eIsSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__DERIVED)) {
				pivotElement.setIsDerived(eObject.isDerived());			
			}
			if (eObject.eIsSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__TRANSIENT)) {
				refreshAnnotation(pivotElement, PIVOT_ESTRUCTURAL_FEATURE__TRANSIENT, Boolean.toString(eObject.isTransient()));			
			}
			if (eObject.eIsSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__UNSETTABLE)) {
				refreshAnnotation(pivotElement, PIVOT_ESTRUCTURAL_FEATURE__UNSETTABLE, Boolean.toString(eObject.isUnsettable()));			
			}
			if (eObject.eIsSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__VOLATILE)) {
				refreshAnnotation(pivotElement, PIVOT_ESTRUCTURAL_FEATURE__VOLATILE, Boolean.toString(eObject.isVolatile()));			
			}
			String defaultValueLiteral = basicGet(eObject, EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, String.class);
			if (defaultValueLiteral != null) {
				refreshAnnotation(pivotElement, PIVOT_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL, eObject.getDefaultValueLiteral());			
			}
		}

		protected void copyTypedMultiplicityElement(TypedMultiplicityElement pivotElement, ETypedElement eTypedElement, List<EAnnotation> excludedAnnotations) {
			copyNamedElement(pivotElement, eTypedElement);
			copyAnnotatedElement(pivotElement, eTypedElement, excludedAnnotations);
			int lower = eTypedElement.getLowerBound();
			int upper = eTypedElement.getUpperBound();
			pivotElement.setLower(BigInteger.valueOf(lower));
			pivotElement.setUpper(BigInteger.valueOf(upper));
			if (eTypedElement.eIsSet(EcorePackage.Literals.ETYPED_ELEMENT__ORDERED)) {
				pivotElement.setIsOrdered(eTypedElement.isOrdered());			
			}
			if (eTypedElement.eIsSet(EcorePackage.Literals.ETYPED_ELEMENT__UNIQUE)) {
				pivotElement.setIsUnique(eTypedElement.isUnique());			
			}
			EGenericType eGenericType = eTypedElement.getEGenericType();
			if (eGenericType != null) {
				doInPackageSwitch(eGenericType);
//				EClassifier eClassifier = eGenericType.getEClassifier();
//				if (eClassifier != null) {
//					allEClassifiers.add(eClassifier);
//				}
//				Element csType = doSwitch(eGenericType);
//				pivotElement.setType((TypedRefCS) csType);
				referencers.put(pivotElement, eTypedElement);
			}
		}

		@Override
		public Element defaultCase(EObject object) {
			error("Unsupported " + object + " in pass1");
			return null;
		}

		public Object doInPackageSwitch(EObject eObject) {
			int classifierID = eObject.eClass().getClassifierID();
			return doSwitch(classifierID, eObject);
		}

		public <T extends Element> void doSwitchAll(Collection<T> csObjects, List<? extends EObject> eObjects) {
			for (EObject eObject : eObjects) {
				@SuppressWarnings("unchecked")
				T csObject = (T) doSwitch(eObject);
				csObjects.add(csObject);
			}
		}

		public <T extends Element> void doSwitchAll(List<? extends EObject> eObjects) {
			for (EObject eObject : eObjects) {
				doSwitch(eObject);
			}
		}

		protected void setOriginalMapping(Element pivotElement, EObject eObject) {
			((PivotObjectImpl)pivotElement).setTarget(eObject);
/*			csModelElement.setOriginalObject(eModelElement);
			if (ecoreResource instanceof XMLResource) {
				String xmiId = ((XMLResource)ecoreResource).getID(eModelElement);
				if (xmiId != null) {
					csModelElement.setOriginalXmiId(xmiId);
				}
			} */
			createMap.put(eObject, pivotElement);
//			pivot2ecoreMap.put(pivotElement, eObject);
		}
	}

	private final class Pass2 extends PivotSwitch<Object>
	{				
		@Override
		public Object caseClass(org.eclipse.ocl.examples.pivot.Class pivotElement) {
			EClass eObject = (EClass) referencers.get(pivotElement);
			doSwitchAll(org.eclipse.ocl.examples.pivot.Class.class, pivotElement.getSuperClasses(), eObject.getEGenericSuperTypes());
			return null;
		}

		@Override
		public Object caseOperation(Operation pivotElement) {
			EOperation eObject = (EOperation) referencers.get(pivotElement);
			doSwitchAll(Type.class, pivotElement.getRaisedExceptions(), eObject.getEGenericExceptions());
			return null;
		}

		@Override
		public EObject caseTypedElement(TypedElement pivotElement) {
			ETypedElement eObject = (ETypedElement) referencers.get(pivotElement);
			EGenericType eType = eObject.getEGenericType();
			if (eType != null) {
				Type pivotType = getPivot(eType, Type.class);
				pivotElement.setType(pivotType);
			}
			else {
				// FIXME Void ???
			}
	/*		EClassifier eClassifier = eGenericType.getEClassifier();
			if (eClassifier != null) {
				allEClassifiers.add(eClassifier);
				ClassifierCS csClassifier = getCS(eClassifier, ClassifierCS.class);
				csTypeRef.setType(csClassifier);
			}
			else {
				ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
				if (eTypeParameter != null) {
					TypeParameterCS csTypeParameter = (TypeParameterCS) createMap.get(eTypeParameter);
					csTypeRef.setType(csTypeParameter);
				}
//				else {
//					error("Unresolved " + eGenericType + " in pass2");
//				}
			} */
			return null;
		}

		public Object doInPackageSwitch(Element pivotElement) {
			int classifierID = pivotElement.eClass().getClassifierID();
			return doSwitch(classifierID, pivotElement);
		}

		public <T extends Element> void doSwitchAll(Class<T> pivotClass, Collection<T> pivotElements, List<? extends EObject> eObjects) {
			for (EObject eObject : eObjects) {
				T pivotElement = getPivot(eObject, pivotClass);
				pivotElements.add(pivotElement);
			}
		}
	}

	/**
	 * Convert an (annotated) Ecore resource to a Pivot Model.
	 * @param alias 
	 * 
	 * @param ecoreResource the annotated Ecore resource
	 * 
	 * @return the Pivot root package
	 */
	public static org.eclipse.ocl.examples.pivot.Package importFromEcore(PivotManager pivotManager, String alias, Resource ecoreResource) {
		if (ecoreResource == null) {
			return null;
		}
		Ecore2Pivot conversion = getAdapter(ecoreResource, pivotManager);
		return conversion.getPivotRoot();
	}

/*	public static Ecore2Pivot createConverter(PivotManager pivotManager, Resource ecoreResource) {
		EList<Adapter> eAdapters = ecoreResource.eAdapters();
		Ecore2Pivot conversion = (Ecore2Pivot) EcoreUtil.getAdapter(eAdapters, Ecore2Pivot.class);
		if (conversion == null) {
			conversion = new Ecore2Pivot(pivotManager);
			eAdapters.add(conversion);
		}
		return conversion;
	} */

	/**
	 * Convert an (annotated) Ecore object to a pivot element. 
	 * 
	 * @param eObject the annotated Ecore object
	 * 
	 * @return the pivot element
	 */
	public static Element importFromEcore(PivotManager pivotManager, String alias, EObject eObject) {
		if (eObject == null) {
			return null;
		}
		Resource ecoreResource = eObject.eResource();
		Ecore2Pivot conversion = getAdapter(ecoreResource, pivotManager);
		org.eclipse.ocl.examples.pivot.Package pivotRoot = conversion.getPivotRoot();
		if (pivotRoot == null) {
			return null;
		}
		return conversion.createMap.get(eObject);
	}

	/**
	 * Mapping of all created E elements to the resulting pivot elements.
	 */
	private Map<EObject, Element> createMap = new HashMap<EObject, Element>();

	/**
	 * Mapping of all created pivot elements to their original elements.
	 */
//	private Map<Element, EObject> pivot2ecoreMap = new HashMap<Element, EObject>();

	/**
	 * Set of all CS elements created during pass 1 that require further work in pass 2.
	 */
	private Map<Element, EObject> referencers = new HashMap<Element, EObject>();
	
	/**
	 * Set of all converters used during session.
	 */
	private Set<Ecore2Pivot> allConverters = new HashSet<Ecore2Pivot>();
	
	/**
	 * Set of all targets for EClassifierRef during session.
	 */
//	private Set<EClassifier> allEClassifiers = new HashSet<EClassifier>();
	
	/**
	 * Set of all names during session.
	 */
//	private Set<String> allNames = new HashSet<String>();
	
	/**
	 * List of all generic types.
	 */
	private List<EGenericType> genericTypes = new ArrayList<EGenericType>();
	
	/**
	 * List of all generic types.
	 */
	private Map<TemplateableElement, List<TemplateableElement>> specializations = new HashMap<TemplateableElement, List<TemplateableElement>>();

	/**
	 * Set of all aliases.
	 */
//	private Map<String, EPackage> alias2ePackage = new HashMap<String, EPackage>();
//	private Map<EPackage, String> ePackage2alias = new HashMap<EPackage, String>();
	
	private List<Resource.Diagnostic> errors = null;
	
	protected final PivotManager pivotManager;
	protected final Resource ecoreResource;					// Set via eAdapters.add()
	
	protected org.eclipse.ocl.examples.pivot.Package pivotRoot = null;	// Set by importResource
	protected final EcorePass1 ecorePass1 = new EcorePass1();	
	protected final Pass2 pass2 = new Pass2();
	
//	private Map<String, MonikeredElement> moniker2PivotMap = null;
	
	public Ecore2Pivot(Resource ecoreResource, PivotManager pivotManager) {
		this.ecoreResource = ecoreResource;
		this.pivotManager = pivotManager;
	}

	public Map<String, MonikeredElement> computeMoniker2PivotMap() {
		Map<String, MonikeredElement> map = new HashMap<String, MonikeredElement>();
		for (Iterator<EObject> it = ecoreResource.getAllContents(); it.hasNext(); ) {
			EObject eObject = it.next();
			if (eObject instanceof EModelElement) {
				Element pElement = createMap.get(eObject);
				if (pElement instanceof MonikeredElement) {
					String moniker = ((MonikeredElement)pElement).getMoniker();
					MonikeredElement oldElement = map.get(moniker);
					if (oldElement != null) {
						logger.warn("Duplicate moniker " + moniker + " for " + pElement.eClass().getName());
					}
					map.put(moniker, (MonikeredElement)pElement);
				}
			}
		}
		return map;
	}	

	protected void error(String message) {
		if (errors == null) {
			errors = new ArrayList<Resource.Diagnostic>();
		}
		errors.add(new XMIException(message));
	}

/*	public MonikeredElement getMoniker(String moniker) {
		if (moniker2PivotMap == null) {
			moniker2PivotMap = computeMoniker2PivotMap();
		}
		return moniker2PivotMap.get(moniker);
	}
	
	public Map<String, MonikeredElement> getMoniker2PivotMap() {
		if (moniker2PivotMap == null) {
			moniker2PivotMap = computeMoniker2PivotMap();
		}
		return moniker2PivotMap;
	} */
	
	public <T extends Element> T getPivot(EObject eObject, Class<T> pivotClass) {
		Element pivotElement = createMap.get(eObject);
		if (pivotElement == null) {
			Resource resource = eObject.eResource();
			if ((resource != ecoreResource) && (resource != null)) {
				Ecore2Pivot converter = getAdapter(resource, pivotManager);
				if (allConverters.add(converter)) {
					converter.getPivotRoot();
//					allEClassifiers.addAll(converter.allEClassifiers);
//					allNames.addAll(converter.allNames);
					for (Map.Entry<EObject, Element> entry : converter.createMap.entrySet()) {
						createMap.put(entry.getKey(), entry.getValue());
					}
				}
			}
			pivotElement = createMap.get(eObject);
		}
		if (pivotElement == null) {
			error("Unresolved " + eObject);
		}
		else if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			error("Incompatible " + eObject);
		}
		else {
			@SuppressWarnings("unchecked")
			T castPivotElement = (T) pivotElement;
			return castPivotElement;
		}
		return null;
	}
	
/*	public Collection<EPackage> getReferencedEPackages() {
		Set<EPackage> ePackages = new HashSet<EPackage>();
		for (EClassifier eClassifier : allEClassifiers) {
			EPackage ePackage = eClassifier.getEPackage();
			if (ePackage != null)
				ePackages.add(ePackage);
		}
		return ePackages;
	} */
	
	public org.eclipse.ocl.examples.pivot.Package getPivotRoot() {
		if (pivotRoot == null) {
			EcoreAliasCreator.refreshPackageAliases(ecoreResource);			
			Resource pivotResource = importResource();
			AliasAdapter ecoreAdapter = AliasAdapter.findAdapter(ecoreResource);
			if (ecoreAdapter != null) {
				Map<EObject, String> ecoreAliasMap = ecoreAdapter.getAliasMap();
				AliasAdapter pivotAdapter = AliasAdapter.getAdapter(pivotResource);
				Map<EObject, String> pivotAliasMap = pivotAdapter.getAliasMap();
				for (EObject eObject : ecoreAliasMap.keySet()) {
					String alias = ecoreAliasMap.get(eObject);
					Element element = createMap.get(eObject);
					pivotAliasMap.put(element, alias);
				}
			}
		}
		return pivotRoot;
	}

	public Notifier getTarget() {
		return ecoreResource;
	}

	protected Resource importResource() {
		URI ecoreURI = ecoreResource.getURI();
		Resource pivotResource = pivotManager.createResource(ecoreURI, PivotPackage.eCONTENT_TYPE);
		pivotRoot = PivotFactory.eINSTANCE.createPackage();
		pivotRoot.setName(ecoreURI.lastSegment());
		pivotResource.getContents().add(pivotRoot);
		List<org.eclipse.ocl.examples.pivot.Package> packages = pivotRoot.getNestedPackages();
		for (EObject eObject : ecoreResource.getContents()) {
			Object pivotElement = ecorePass1.doInPackageSwitch(eObject);
			if (pivotElement instanceof org.eclipse.ocl.examples.pivot.Package) {
				packages.add((org.eclipse.ocl.examples.pivot.Package) pivotElement);
			}
			else {
				error("Bad ecore content");
			}
		}
		Map<String, Type> resolvedSpecializations = new HashMap<String, Type>();
		for (EGenericType eGenericType : genericTypes) {
			Type pivotType = resolveType(resolvedSpecializations, eGenericType);
			createMap.put(eGenericType, pivotType);
		}
		for (List<TemplateableElement> pivotElements : specializations.values()) {
			for (TemplateableElement pivotElement : pivotElements) {
				pivotManager.addOrphanType((Type)pivotElement);
			}
		}
		for (Element pivotElement : referencers.keySet()) {
			pass2.doInPackageSwitch(pivotElement);
		}
		if (errors != null) {
			pivotResource.getErrors().addAll(errors);
		}
		return pivotResource;
	}

	public boolean isAdapterForType(Object type) {
		return type == Ecore2Pivot.class;
	}

	public void notifyChanged(Notification notification) {}

	protected void refreshAnnotation(NamedElement pivotElement, String key, String value) {
		String source = PIVOT_URI;
		Annotation pivotAnnotation = null;
		for (Annotation annotation : pivotElement.getOwnedAnnotations()) {
			if (annotation.getName().equals(source)) {
				pivotAnnotation = annotation;
				break;
			}
		}
		if (pivotAnnotation == null) {
			pivotAnnotation = PivotFactory.eINSTANCE.createAnnotation();
			pivotAnnotation.setName(source);
			pivotElement.getOwnedAnnotations().add(pivotAnnotation);
		}
		Detail pivotDetail = PivotFactory.eINSTANCE.createDetail();
		pivotDetail.setName(key);
		pivotDetail.getValues().add(value);
		pivotAnnotation.getOwnedDetails().add(pivotDetail);
	}

	protected <T extends NamedElement> T refreshNamedElement(Class<T> pivotClass,
			EClass pivotEClass, ENamedElement eNamedElement) {
		EFactory eFactoryInstance = pivotEClass.getEPackage().getEFactoryInstance();
		EObject pivotElement = eFactoryInstance.create(pivotEClass);
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		return castElement;
	}
	
	protected Type resolveDataType(EGenericType eGenericType) {
		assert eGenericType.getETypeArguments().isEmpty();
		EDataType eClassifier = (EDataType) eGenericType.getEClassifier();
		Type pivotType = null;
		if (eClassifier.getEPackage() == EcorePackage.eINSTANCE) {
			if (eClassifier == EcorePackage.Literals.EBOOLEAN) {
				pivotType = pivotManager.getBooleanType();
			}
			else if (eClassifier == EcorePackage.Literals.EBIG_INTEGER) {
				pivotType = pivotManager.getIntegerType();
			}
			else if (eClassifier == EcorePackage.Literals.EBIG_DECIMAL) {
				pivotType = pivotManager.getRealType();
			}
			else if (eClassifier == EcorePackage.Literals.ESTRING) {
				pivotType = pivotManager.getStringType();
			}
//			if (primitiveTypeName != null) {
//				PrimitiveTypeRefCS csTypeRef = BaseCSTFactory.eINSTANCE.createPrimitiveTypeRefCS();
//				csTypeRef.setName(primitiveTypeName);
//				setOriginalMapping(csTypeRef, eObject);
//				return csTypeRef;
//			}
		}
		if (pivotType == null) {
			pivotType = getPivot(eClassifier, Type.class);
		}
		return pivotType;
	}

	protected Type resolveGenericType(Map<String, Type> resolvedSpecializations, EGenericType eGenericType) {
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		assert !eGenericType.getETypeArguments().isEmpty();
		EClassifier eClassifier = eGenericType.getEClassifier();
		EList<ETypeParameter> eTypeParameters = eClassifier.getETypeParameters();
		assert eTypeParameters.size() == eTypeArguments.size();
		Type unspecializedPivotType = getPivot(eClassifier, Type.class);
		org.eclipse.ocl.examples.pivot.Class specializedPivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, null);
		specializedPivotElement.setName(unspecializedPivotType.getName());
		TemplateBinding templateBinding = PivotFactory.eINSTANCE.createTemplateBinding();
		TemplateSignature templateSignature = unspecializedPivotType.getOwnedTemplateSignature();
		templateBinding.setSignature(templateSignature);
		specializedPivotElement.getTemplateBindings().add(templateBinding);
		for (int i = 0; i < eTypeParameters.size(); i++) {
			TemplateParameterSubstitution templateParameterSubstitution = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
			templateParameterSubstitution.setFormal(templateSignature.getParameters().get(i));
			EGenericType eTypeArgument = eTypeArguments.get(i);
			Type typeArgument = resolveType(resolvedSpecializations, eTypeArgument);
			templateParameterSubstitution.setActual(typeArgument);
			templateBinding.getParameterSubstitutions().add(templateParameterSubstitution);
		}
		//
		//	Cache the pivot specialization
		//
		List<TemplateableElement> specializationList = specializations.get(unspecializedPivotType);
		if (specializationList == null) {
			specializationList = new ArrayList<TemplateableElement>();
			specializations.put(unspecializedPivotType, specializationList);
		}
		specializationList.add(specializedPivotElement);
		return specializedPivotElement;
	}

	protected Type resolveSimpleType(EGenericType eGenericType) {
		assert eGenericType.getETypeArguments().isEmpty();
		EClassifier eClassifier = eGenericType.getEClassifier();
		Type pivotType = getPivot(eClassifier, Type.class);
		if (eClassifier != null) {
/*			TypedTypeRefCS csTypeRef = BaseCSTFactory.eINSTANCE.createTypedTypeRefCS();
			setOriginalMapping(csTypeRef, eObject);
			deferred.add(csTypeRef);		// defer eGenericType.getETypeParameter()
//			doSwitchAll(csTypeRef.getTypeArguments(), eGenericType.getETypeArguments());
			return csTypeRef;
		}
		else {
			ETypeParameter eTypeParameter = eObject.getETypeParameter();
			if (eTypeParameter != null) {
				TypedTypeRefCS csTypeRef = BaseCSTFactory.eINSTANCE.createTypedTypeRefCS();
				setOriginalMapping(csTypeRef, eObject);
				deferred.add(csTypeRef);		// defer eGenericType.getETypeParameter()
				return csTypeRef;				
			}
			else {
				WildcardTypeRefCS csTypeRef = BaseCSTFactory.eINSTANCE.createWildcardTypeRefCS();
				setOriginalMapping(csTypeRef, eObject);
//				csTypeRef.setExtends(doSwitchAll(eGenericType.getExtends()));
//				csTypeRef.setSuper(doSwitchAll(eGenericType.getSuper()));
				return csTypeRef;
			}*/
		}
		return pivotType;
	}

	protected Type resolveType(Map<String, Type> resolvedSpecializations, EGenericType eGenericType) {
		Type pivotType = null;
		EClassifier eClassifier = eGenericType.getEClassifier();
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		if (eClassifier == null) {
			pivotType = resolveWildcardType(eGenericType);
		}
		else if (!eTypeArguments.isEmpty()) {
			String ecoreMoniker = Ecore2Moniker.toString(eGenericType);
			pivotType = resolvedSpecializations.get(ecoreMoniker);
			if (pivotType == null) {
				pivotType = resolveGenericType(resolvedSpecializations, eGenericType);
				resolvedSpecializations.put(ecoreMoniker, pivotType);
			}
		}
		else if (eClassifier instanceof EDataType) {
			pivotType = resolveDataType(eGenericType);
		}
		else { 
			pivotType = resolveSimpleType(eGenericType);
		}
		return pivotType;
	}

	protected Type resolveWildcardType(EGenericType eGenericType) {
		assert eGenericType.getETypeArguments().isEmpty();
		assert eGenericType.getEClassifier() == null;
		EClassifier eClassifier = eGenericType.getERawType();
		assert eClassifier == EcorePackage.Literals.EJAVA_OBJECT;
/*			WildcardTypeRefCS csTypeRef = BaseCSTFactory.eINSTANCE.createWildcardTypeRefCS();
			setOriginalMapping(csTypeRef, eObject);
//			csTypeRef.setExtends(doSwitchAll(eGenericType.getExtends()));
//			csTypeRef.setSuper(doSwitchAll(eGenericType.getSuper()));
			return csTypeRef; */
		return null;
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == ecoreResource;
	}
}