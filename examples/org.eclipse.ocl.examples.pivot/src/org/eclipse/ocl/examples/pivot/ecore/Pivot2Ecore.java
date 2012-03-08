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
 * $Id: Pivot2Ecore.java,v 1.6 2011/05/20 19:06:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.ecore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.ocl.common.CommonConstants;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.delegate.InvocationBehavior;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.delegate.SettingBehavior;
import org.eclipse.ocl.examples.pivot.delegate.ValidationBehavior;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintExprVisitor;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintOptions;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintTypeVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class Pivot2Ecore extends AbstractConversion
{
	public static final Logger logger = Logger.getLogger(Pivot2Ecore.class);
	
	/**
	 * String-valued URI prefix of a package defining the primitive types. Proxy references to
	 * e.g. OCL's String rather than Ecore's EString are constructed by just appending 'String' to
	 * the prefix.
	 */
	public static final String PRIMITIVE_TYPES_URI_PREFIX = "PRIMITIVE_TYPES_URI_PREFIX";

	public static void copyComments(EModelElement eModelElement, Element pivotElement) {
		for (Comment comment : pivotElement.getOwnedComment()) {
			EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(GenModelPackage.eNS_URI);
			String body = comment.getBody();
			eAnnotation.getDetails().put("documentation", body);
			eModelElement.getEAnnotations().add(eAnnotation);
		}
	}

	public static EOperation createConstraintEOperation(Constraint pivotConstraint, String operationName) {
		EOperation eOperation = EcoreFactory.eINSTANCE.createEOperation();
		eOperation.setName(operationName != null ? operationName : "");
		eOperation.setEType(EcorePackage.Literals.EBOOLEAN);
		EParameter firstParameter = EcoreFactory.eINSTANCE.createEParameter();
		firstParameter.setName("diagnostics");
		firstParameter.setEType(EcorePackage.Literals.EDIAGNOSTIC_CHAIN);
		eOperation.getEParameters().add(firstParameter);
		EParameter secondParameter = EcoreFactory.eINSTANCE.createEParameter();
		secondParameter.setName("context");
		EGenericType eGenericType = EcoreFactory.eINSTANCE.createEGenericType();
		eGenericType.setEClassifier(EcorePackage.Literals.EMAP);
		EGenericType firstTypeArgument = EcoreFactory.eINSTANCE.createEGenericType();
		firstTypeArgument.setEClassifier(EcorePackage.Literals.EJAVA_OBJECT);
		eGenericType.getETypeArguments().add(firstTypeArgument);
		EGenericType secondTypeArgument = EcoreFactory.eINSTANCE.createEGenericType();
		secondTypeArgument.setEClassifier(EcorePackage.Literals.EJAVA_OBJECT);
		eGenericType.getETypeArguments().add(secondTypeArgument);
		secondParameter.setEGenericType(eGenericType);
		eOperation.getEParameters().add(secondParameter);
		ValueSpecification specification = pivotConstraint.getSpecification();
		if (specification instanceof OpaqueExpression) {
			String body = PivotUtil.getBody((OpaqueExpression) specification);
			if (body != null) {
				EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				eAnnotation.setSource(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
				eAnnotation.getDetails().put("body", body);
				eOperation.getEAnnotations().add(eAnnotation);
			}
		}
		copyComments(eOperation, pivotConstraint);
		return eOperation;
	}

	public static XMLResource createResource(MetaModelManager metaModelManager, Resource pivotResource, URI ecoreURI, Map<String,Object> options) {
		ResourceSet resourceSet = metaModelManager.getExternalResourceSet();
		XMLResource ecoreResource = (XMLResource) resourceSet.createResource(ecoreURI);
		List<EObject> contents = ecoreResource.getContents();
		List<EObject> pivotRoots = pivotResource.getContents();
		Pivot2Ecore converter = new Pivot2Ecore(metaModelManager, ecoreURI, options);
		List<? extends EObject> outputObjects = converter.convertAll(pivotRoots);
		for (EObject eObject : outputObjects) {
			if ((eObject instanceof EPackage) && !PivotConstants.ORPHANAGE_NAME.equals(((EPackage)eObject).getName())) {
				List<EPackage> eSubpackages = ((EPackage)eObject).getESubpackages();
				contents.addAll(eSubpackages);
				eSubpackages.clear();
			}
		}
		return ecoreResource;
	}
	
	public static Boolean getBoolean(Map<String, Object> options, String key) {
		if (options == null) {
			return false;
		}
		Object value = options.get(key);
		if (value instanceof Boolean) {
			return (Boolean) value;
		}
		logger.error("Non-Boolean '" + key + "'");
		return false;
	}
	
	public static String getString(Map<String, Object> options, String key) {
		if (options == null) {
			return null;
		}
		Object value = options.get(key);
		if (value instanceof String) {
			return (String) value;
		}
		logger.error("Non-String '" + key + "'");
		return null;
	}
	
	public static boolean installDelegate(EModelElement eModelElement, Constraint pivotConstraint, URI ecoreURI) {
		ValueSpecification specification = pivotConstraint.getSpecification();
		if (!(specification instanceof OpaqueExpression)) {
			return false;
		}
		String exprString = PivotUtil.getBody((OpaqueExpression) specification);
		Namespace namespace = PrettyPrintExprVisitor.getNamespace(specification);
		PrettyPrintOptions.Global options = PrettyPrintTypeVisitor.createOptions(namespace);
		options.setBaseURI(ecoreURI);
		if ((exprString == null) && (specification instanceof ExpressionInOcl)) {
			exprString = PrettyPrintExprVisitor.prettyPrint(((ExpressionInOcl)specification).getBodyExpression(), options);
		}
		if (exprString == null) {
			return false;
		}
		List<EAnnotation> eAnnotations = eModelElement.getEAnnotations();
		EAnnotation oclAnnotation = eModelElement.getEAnnotation(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
		if (oclAnnotation == null) {
			oclAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			oclAnnotation.setSource(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
			eAnnotations.add(oclAnnotation);
		}
		String stereotype = pivotConstraint.getStereotype();
		String name = pivotConstraint.getName();
		if (UMLReflection.INVARIANT.equals(stereotype)) {
			if (eModelElement instanceof EOperation) {
				oclAnnotation.getDetails().put("body", exprString);
			}
			else {
				oclAnnotation.getDetails().put(name, exprString);
				String messageString = PivotUtil.getMessage((OpaqueExpression) specification);
				if ((messageString == null) && (specification instanceof ExpressionInOcl)) {
					messageString = PrettyPrintExprVisitor.prettyPrint(((ExpressionInOcl)specification).getMessageExpression(), options);
				}
				if ((messageString != null) && (messageString.length() > 0)) {
					oclAnnotation.getDetails().put(name + PivotConstants.MESSAGE_ANNOTATION_DETAIL_SUFFIX, messageString);
				}
			}
		}
		else if (UMLReflection.DERIVATION.equals(stereotype)) {
			oclAnnotation.getDetails().put(SettingBehavior.DERIVATION_CONSTRAINT_KEY, exprString);
		}
		else if (UMLReflection.INITIAL.equals(stereotype)) {
			oclAnnotation.getDetails().put(SettingBehavior.INITIAL_CONSTRAINT_KEY, exprString);
		}
		else if (UMLReflection.BODY.equals(stereotype)) {
			String key = name != null ? "body_" + name : InvocationBehavior.BODY_CONSTRAINT_KEY;
			oclAnnotation.getDetails().put(key, exprString);
		}
		else if (UMLReflection.PRECONDITION.equals(stereotype)) {
			oclAnnotation.getDetails().put("pre_" + name, exprString);
		}
		else if (UMLReflection.POSTCONDITION.equals(stereotype)) {
			oclAnnotation.getDetails().put("post_" + name, exprString);
		}
		else {
//			error("Unsupported " + pivotConstraint);
		}
		oclAnnotation = eModelElement.getEAnnotation(CommonConstants.OCL_DELEGATE_URI);
		if (oclAnnotation != null) {
			eAnnotations.remove(oclAnnotation);
		}
		oclAnnotation = eModelElement.getEAnnotation(CommonConstants.OCL_DELEGATE_URI_LPG);
		if (oclAnnotation != null) {
			eAnnotations.remove(oclAnnotation);
		}
		oclAnnotation = eModelElement.getEAnnotation(UML2GenModelUtil.UML2_GEN_MODEL_PACKAGE_1_1_NS_URI);
		if (oclAnnotation != null) {
			eAnnotations.remove(oclAnnotation);
		}
		return true;
	}

	public static void installDelegate(MetaModelManager metaModelManager, EOperation eOperation) {
		List<EAnnotation> eAnnotations = eOperation.getEAnnotations();
		EAnnotation oclAnnotation = eOperation.getEAnnotation(UML2GenModelUtil.UML2_GEN_MODEL_PACKAGE_1_1_NS_URI);
		if (oclAnnotation != null) {
			eAnnotations.remove(oclAnnotation);
			oclAnnotation.setSource(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
			eAnnotations.add(oclAnnotation);
		}
	}

	public static void installDelegate(MetaModelManager metaModelManager, EStructuralFeature eFeature) {
		List<EAnnotation> eAnnotations = eFeature.getEAnnotations();
		EAnnotation oclAnnotation = eFeature.getEAnnotation(UML2GenModelUtil.UML2_GEN_MODEL_PACKAGE_1_1_NS_URI);
		if (oclAnnotation != null) {
			eAnnotations.remove(oclAnnotation);
			oclAnnotation.setSource(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
			eAnnotations.add(oclAnnotation);
		}
	}
	
	public static void installDelegates(MetaModelManager metaModelManager, EClassifier eClassifier, Type pivotType) {
		StringBuilder s = null;
		for (Constraint pivotConstraint : metaModelManager.getLocalConstraints(pivotType)) {
			String constraintName = pivotConstraint.getName();
			if (!pivotConstraint.isCallable() && (constraintName != null)) {
				if (s == null) {
					s = new StringBuilder();
				}
				else {
					s.append(" ");
				}
				s.append(constraintName);
			}
		}
		EAnnotation eAnnotation = eClassifier.getEAnnotation(EcorePackage.eNS_URI);
		if (s != null) {
			if (eAnnotation == null) {
				eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
				eAnnotation.setSource(EcorePackage.eNS_URI);
				eClassifier.getEAnnotations().add(0, eAnnotation);
			}
			eAnnotation.getDetails().put("constraints", s.toString());
		}
		else {
			eClassifier.getEAnnotations().remove(eAnnotation);
		}
	}

	public static void installDelegates(EPackage ePackage) {
		EAnnotation packageAnnotation = ePackage.getEAnnotation(EcorePackage.eNS_URI);
		if (packageAnnotation == null) {
			packageAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			packageAnnotation.setSource(EcorePackage.eNS_URI);
			ePackage.getEAnnotations().add(packageAnnotation);
		}
		EMap<String, String> details = packageAnnotation.getDetails();
		details.put(InvocationBehavior.NAME, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
		details.put(SettingBehavior.NAME, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
		details.put(ValidationBehavior.NAME, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
	}

	/**
	 * Mapping of pivot elements to the resulting E elements.
	 */
	private Map<Element, EModelElement> createMap = new HashMap<Element, EModelElement>();

	/**
	 * Mapping of all E elements created during pass 1 that require further work
	 * with respect to the corresponding CS element in pass 2.
	 */
	Set<Element> deferMap = new HashSet<Element>();
	
	private List<Resource.Diagnostic> errors = null;
	
	
	protected final MetaModelManager metaModelManager;
	protected final Pivot2EcoreDeclarationVisitor pass1;	
	protected final Pivot2EcoreReferenceVisitor pass2;
	protected final URI ecoreURI;
	protected final Map<String,Object> options;
	protected final String primitiveTypesUriPrefix;
	
	public Pivot2Ecore(MetaModelManager metaModelManager, URI ecoreURI, Map<String,Object> options) {
		this.metaModelManager = metaModelManager;
		this.pass1 = new Pivot2EcoreDeclarationVisitor(this);	
		this.pass2 = new Pivot2EcoreReferenceVisitor(this);
		this.ecoreURI = ecoreURI;
		this.options = options;
		this.primitiveTypesUriPrefix = getString(options, PRIMITIVE_TYPES_URI_PREFIX);
	}

	protected EObject convert(Element pivotObject) {
		EObject eObject = pass1.safeVisit(pivotObject);
		for (Element eKey : deferMap) {
			pass2.safeVisit(eKey);
		}
		return eObject;
	}

	protected List<EObject> convertAll(List<? extends EObject> pivotObjects) {
		List<EObject> eObjects = new ArrayList<EObject>();
		for (EObject pivotObject : pivotObjects) {
			if (pivotObject instanceof Element) {
				eObjects.add(pass1.safeVisit((Visitable) pivotObject));
			}
		}
		for (Element eKey : deferMap) {
			pass2.safeVisit(eKey);
		}
		return eObjects;
	}

	public void defer(Element pivotElement) {
		deferMap.add(pivotElement);
	}

	protected void error(String message) {
		if (errors == null) {
			errors = new ArrayList<Resource.Diagnostic>();
		}
		errors.add(new XMIException(message));
	}

	public <T extends EObject> T getCreated(Class<T> requiredClass, Element pivotElement) {
		EModelElement eModelElement = createMap.get(pivotElement);
//		System.out.println("Get " + PivotUtil.debugSimpleName(pivotElement) + " " + PivotUtil.debugSimpleName(eModelElement));
		if (eModelElement == null) {
			Element primaryElement = metaModelManager.getPrimaryElement(pivotElement);
			if (pivotElement != primaryElement) {
				eModelElement = createMap.get(primaryElement);
			}
		}
		if (eModelElement == null) {
			return null;
		}
		if (!requiredClass.isAssignableFrom(eModelElement.getClass())) {
			logger.error("Ecore " + eModelElement.getClass().getName() + "' element is not a '" + requiredClass.getName() + "'"); //$NON-NLS-1$
			return null;
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) eModelElement;
		return castElement;
	}

	public final URI getEcoreURI() {
		return ecoreURI;
	}
	
	public final MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public Map<String, Object> getOptions() {
		return options;
	}

	public String getPrimitiveTypesUriPrefix() {
		return primitiveTypesUriPrefix;
	}

	public void putCreated(Element pivotElement, EModelElement eModelElement) {
		Element primaryElement = metaModelManager.getPrimaryElement(pivotElement);
//		System.out.println("Put1 " + PivotUtil.debugSimpleName(pivotElement) + " " + PivotUtil.debugSimpleName(eModelElement));
		EModelElement oldPivot = createMap.put(pivotElement, eModelElement);
		assert oldPivot == null;
		if (pivotElement != primaryElement) {
//			System.out.println("Put2 " + PivotUtil.debugSimpleName(pivotElement) + " " + PivotUtil.debugSimpleName(eModelElement));
			EModelElement oldPrimary = createMap.put(primaryElement, eModelElement);
			assert oldPrimary == null;
		}
	}
}
