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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.delegate.InvocationBehavior;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.delegate.SettingBehavior;
import org.eclipse.ocl.examples.pivot.delegate.ValidationBehavior;
import org.eclipse.ocl.examples.pivot.internal.impl.PackageImpl;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintExprVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;

public class Pivot2Ecore extends AbstractConversion
{
	public static final Logger logger = Logger.getLogger(Pivot2Ecore.class);

	public static List<EObject> createResource(TypeManager typeManager, Resource pivotResource) {
		List<EObject> pivotRoots = pivotResource.getContents();
		Pivot2Ecore converter = new Pivot2Ecore(typeManager);
		return converter.convertAll(pivotRoots);
	}
	
	public static XMLResource createResource(TypeManager typeManager, Resource pivotResource, URI ecoreURI) {
		ResourceSet resourceSet = new ResourceSetImpl();
		XMLResource ecoreResource = (XMLResource) resourceSet.createResource(ecoreURI);
		List<EObject> pivotRoots = pivotResource.getContents();
		Pivot2Ecore converter = new Pivot2Ecore(typeManager);
		List<? extends EObject> outputObjects = new ArrayList<EObject>(converter.convertAll(pivotRoots));
		for (EObject eObject : outputObjects) {
			EPackage ePackage = (EPackage)eObject;
			if ((eObject instanceof EPackage) && !PivotConstants.ORPHANAGE_NAME.equals(ePackage.getName())) {
				ecoreResource.getContents().addAll(ePackage.getESubpackages());
			}
		}
		for (EObject eObject1 : pivotResource.getContents()) {
			if (eObject1 instanceof PackageImpl) {
				for (EObject eObject2 : eObject1.eContents()) {
					if (eObject2 instanceof org.eclipse.ocl.examples.pivot.Package) {
						org.eclipse.ocl.examples.pivot.Package pivotPackage = (org.eclipse.ocl.examples.pivot.Package)eObject2;
						EObject target = converter.getCreated(EPackage.class, pivotPackage);
						if (target instanceof EPackage) {
							installImports(typeManager, pivotPackage, (EPackage) target);
						}
					}
				}
			}
		}
		return ecoreResource;
	}
	
	public static boolean installDelegate(EModelElement eModelElement, Constraint pivotConstraint) {
		ValueSpecification specification = pivotConstraint.getSpecification();
		if (!(specification instanceof OpaqueExpression)) {
			return false;
		}
		String exprString = PivotUtil.getBody((OpaqueExpression) specification);
		if ((exprString == null) && (specification instanceof ExpressionInOcl)) {
			exprString = PrettyPrintExprVisitor.prettyPrint(((ExpressionInOcl)specification).getBodyExpression(), PrettyPrintExprVisitor.getNamespace(specification));
		}
		if (exprString == null) {
			return false;
		}
		EAnnotation oclAnnotation = eModelElement.getEAnnotation(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
		if (oclAnnotation == null) {
			oclAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			oclAnnotation.setSource(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
			eModelElement.getEAnnotations().add(oclAnnotation);
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
					messageString = PrettyPrintExprVisitor.prettyPrint(((ExpressionInOcl)specification).getMessageExpression(), PrettyPrintExprVisitor.getNamespace(specification));
				}
				if ((messageString != null) && (messageString.length() > 0)) {
					oclAnnotation.getDetails().put(name + "$message", messageString);
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
		return true;
	}
	
	public static void installDelegates(TypeManager typeManager, EClassifier eClassifier, Type pivotType) {
		StringBuffer s = null;
		for (Constraint pivotConstraint : typeManager.getLocalConstraints((org.eclipse.ocl.examples.pivot.Class) pivotType)) {
			String constraintName = pivotConstraint.getName();
			if (!pivotConstraint.isCallable() && (constraintName != null)) {
				if (s == null) {
					s = new StringBuffer();
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

	public static void installImports(TypeManager typeManager, org.eclipse.ocl.examples.pivot.Package pivotPackage, EPackage ePackage) {
		HashSet<org.eclipse.ocl.examples.pivot.Package> externalRoots = null;
		Resource pivotResource = pivotPackage.eResource();
		List<Library> libraries = typeManager.getLibraries();
		org.eclipse.ocl.examples.pivot.Package mmPackage = typeManager.getPivotMetaModel();
		org.eclipse.ocl.examples.pivot.Package orphanage = typeManager.getOrphanPackage();
		Map<EObject, Collection<Setting>> externalCrossReferences = EcoreUtil.ExternalCrossReferencer.find(pivotPackage);
		for (EObject externalCrossReference : externalCrossReferences.keySet()) {
			if (externalCrossReference instanceof Operation) {
				externalCrossReference = ((Operation)externalCrossReference).getClass_();
			}
			else if (externalCrossReference instanceof Property) {
				externalCrossReference = ((Property)externalCrossReference).getClass_();
			}
			if (externalCrossReference instanceof org.eclipse.ocl.examples.pivot.Class) {
				externalCrossReference = ((org.eclipse.ocl.examples.pivot.Class)externalCrossReference).getPackage();
			}
			while (externalCrossReference instanceof org.eclipse.ocl.examples.pivot.Package) {
				org.eclipse.ocl.examples.pivot.Package nestingPackage = ((org.eclipse.ocl.examples.pivot.Package)externalCrossReference).getNestingPackage();
				if (nestingPackage == null) {
					break;
				}
				externalCrossReference = nestingPackage;
			}
			Resource resource = externalCrossReference.eResource();
			if (resource == pivotResource) {
				System.out.println("non-xref to " + externalCrossReference);
			}
			else if (libraries.contains(externalCrossReference)) {
				System.out.println("lib-xref to " + externalCrossReference);
			}
			else if (externalCrossReference == mmPackage) {
				System.out.println("mm-xref to " + externalCrossReference);
			}
			else if (externalCrossReference == orphanage) {
				System.out.println("orphan-xref to " + externalCrossReference);
			}
			else if (externalCrossReference instanceof org.eclipse.ocl.examples.pivot.Package) {
				System.out.println("xref to " + externalCrossReference + " in " + resource);
				if (externalRoots == null) {
					externalRoots = new HashSet<org.eclipse.ocl.examples.pivot.Package>();
				}
				externalRoots.add((org.eclipse.ocl.examples.pivot.Package)externalCrossReference);
			}
		}
		if (externalRoots != null) {
			URI targetURI = ePackage.eResource().getURI();
			URIConverter uriConverter = typeManager.getExternalResourceSet().getURIConverter();
			for (org.eclipse.ocl.examples.pivot.Package externalRoot : externalRoots) {
				URI uri = externalRoot.eResource().getURI();
				URI normalizedURI = uriConverter.normalize(uri);
				URI deresolvedURI = normalizedURI.deresolve(targetURI);
			    EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			    eAnnotation.setSource(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
			    eAnnotation.getDetails().put("alias", externalRoot.getName());
			    eAnnotation.getDetails().put("uri", deresolvedURI.toString());
			    ePackage.getEAnnotations().add(eAnnotation);
			}
		}
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
	
	protected final Pivot2EcoreDeclarationVisitor pass1 = new Pivot2EcoreDeclarationVisitor(this);	
	protected final Pivot2EcoreReferenceVisitor pass2 = new Pivot2EcoreReferenceVisitor(this);
	
	protected final TypeManager typeManager;
//	protected final ResourceSet resourceSet;
//	protected final Resource csResource;
//	protected final XMLResource eResource;
	

	public Pivot2Ecore(TypeManager typeManager/*ResourceSet resourceSet, Resource csResource, URI ecoreURI*/) {
		this.typeManager = typeManager;
//		this.resourceSet = resourceSet;
//		this.csResource = csResource;
//		this.eResource = (XMLResource) new EcoreResourceFactoryImpl().createResource(ecoreURI);
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

	protected void error(String message) {
		if (errors == null) {
			errors = new ArrayList<Resource.Diagnostic>();
		}
		errors.add(new XMIException(message));
	}

/*	public XMLResource exportToEcore() {
		OCLinEcoreDocumentCS document = (OCLinEcoreDocumentCS) csResource.getContents().get(0);
		Collection<? extends EObject> ecoreContents = convertAll(document.getPackages());
		eResource.getContents().addAll(ecoreContents);
		if (errors != null) {
			eResource.getErrors().addAll(errors);
		}
		return eResource;
	} */

	public void defer(Element pivotElement) {
		deferMap.add(pivotElement);
	}

	public <T extends EObject> T getCreated(Class<T> requiredClass, Element pivotElement) {
		EModelElement eModelElement = createMap.get(pivotElement);
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
	
	public TypeManager getTypeManager() {
		return typeManager;
	}

	public void putCreated(Element pivotElement, EModelElement eModelElement) {
		EModelElement old = createMap.put(pivotElement, eModelElement);
		assert old == null;
	}
}