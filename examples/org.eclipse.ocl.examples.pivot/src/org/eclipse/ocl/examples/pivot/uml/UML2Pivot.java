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
 * $Id: UML2Pivot.java,v 1.9 2011/05/20 15:27:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.uml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.ocl.common.OCLCommon;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.delegate.SettingBehavior;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.AliasAdapter;
import org.eclipse.ocl.examples.pivot.utilities.External2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.PivotObjectImpl;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

public class UML2Pivot extends AbstractConversion implements External2Pivot, PivotConstants
{
	private static final Logger logger = Logger.getLogger(UML2Pivot.class);

	// FIXME this is a prehistoric value
	private static final String OCL_STANDARD_LIBRARY_NS_URI = "http://www.eclipse.org/ocl/1.1.0/oclstdlib.uml"; //$NON-NLS-1$

	public static UML2Pivot getAdapter(Resource resource, MetaModelManager metaModelManager) {
		if (resource == null) {
			return null;
		}
		List<Adapter> eAdapters = resource.eAdapters();
		UML2Pivot adapter = PivotUtil.getAdapter(UML2Pivot.class, resource);
		if (adapter != null) {
			return adapter;
		}
		adapter = new UML2Pivot(resource, metaModelManager);
		eAdapters.add(adapter);
		return adapter;
	}

	/**
	 * Convert an (annotated) Ecore resource to a Pivot Model.
	 * @param alias 
	 * 
	 * @param ecoreResource the annotated Ecore resource
	 * 
	 * @return the Pivot root package
	 */
	public static org.eclipse.ocl.examples.pivot.Package importFromUML(MetaModelManager metaModelManager, String alias, Resource ecoreResource) {
		if (ecoreResource == null) {
			return null;
		}
		UML2Pivot conversion = getAdapter(ecoreResource, metaModelManager);
		return conversion.getPivotRoot();
	}

	/**
	 * Initialize registries to support OCL and UML usage. This method is
	 * intended for initialization of standalone behaviors for which plugin extension
	 * registrations have not been applied.
	 *<p> 
	 * A null resourceSet may be provided to initialize the global package registry
	 * and global URI mapping registry.
	 *<p> 
	 * A non-null resourceSet may be provided to identify specific package
	 * and global URI mapping registries.
	 *<p> 
	 * The locations of the org.eclipse.ocl.uml and org.eclipse.uml2.uml.resources
	 * plugins must be identified by the correspondingly named Java properties.
	 * A standalone application command line might do this by incorporating
	 * 
	 * <p><tt>-Dorg.eclipse.ocl.uml=C:/Eclipse/plugins/org.eclipse.ocl.uml</tt>
	 * <br><tt>-Dorg.eclipse.uml2.uml.resources=C:/Eclipse/plugins/org.eclipse.uml2.uml.resources</tt>
	 * <p>
	 * This method is used to configure the ResourceSet used to load the OCL Standard Library.

	 * @param resourceSet to be initialized or null for global initialization
	 * @return a failure reason, null if successful
	 * 
	 * @since 3.0
	 */
	public static String initialize(ResourceSet resourceSet) {
		UMLResourcesUtil.init(resourceSet);
		String oclLocation = System.getProperty("org.eclipse.ocl.uml"); //$NON-NLS-1$
		if (oclLocation == null)
			return "'org.eclipse.ocl.uml' property not defined; use the launch configuration to define it"; //$NON-NLS-1$
		String resourcesLocation = System.getProperty("org.eclipse.uml2.uml.resources"); //$NON-NLS-1$
		if (resourcesLocation == null)
			return "'org.eclipse.uml2.uml.resources' property not defined; use the launch configuration to define it"; //$NON-NLS-1$
		Map<URI, URI> uriMap = resourceSet != null
			? resourceSet.getURIConverter().getURIMap()
			: URIConverter.URI_MAP;		
		uriMap.put(URI.createURI(OCL_STANDARD_LIBRARY_NS_URI), URI.createFileURI(oclLocation + "/model/oclstdlib.uml")); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), URI.createFileURI(resourcesLocation + "/profiles/")); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.createFileURI(resourcesLocation + "/metamodels/")); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), URI.createFileURI(resourcesLocation + "/libraries/")); //$NON-NLS-1$
		return null;
	}

/*	public static Ecore2Pivot createConverter(MetaModelManager metaModelManager, Resource ecoreResource) {
		EList<Adapter> eAdapters = ecoreResource.eAdapters();
		Ecore2Pivot conversion = (Ecore2Pivot) EcoreUtil.getAdapter(eAdapters, Ecore2Pivot.class);
		if (conversion == null) {
			conversion = new Ecore2Pivot(metaModelManager);
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
	public static Element importFromUML(MetaModelManager metaModelManager, String alias, EObject eObject) {
		if (eObject == null) {
			return null;
		}
		Resource ecoreResource = eObject.eResource();
		UML2Pivot conversion = getAdapter(ecoreResource, metaModelManager);
		org.eclipse.ocl.examples.pivot.Package pivotRoot = conversion.getPivotRoot();
		if (pivotRoot == null) {
			return null;
		}
		return conversion.createMap.get(eObject);
	}

	/**
	 * Mapping of source Ecore objects to their resulting pivot element.
	 */
	private Map<EModelElement, Element> createMap = new HashMap<EModelElement, Element>();

	/**
	 * Set of all Ecore objects requiring further work during the reference pass.
	 */
	private Set<EModelElement> referencers = new HashSet<EModelElement>();
	
	/**
	 * Set of all converters used during session.
	 */
	private Set<UML2Pivot> allConverters = new HashSet<UML2Pivot>();
	
	/**
	 * List of all generic types.
	 */
//	private List<EGenericType> genericTypes = new ArrayList<EGenericType>();
	
	/**
	 * List of all specializations for each specializable type.
	 */
//	private Map<TemplateableElement, List<TemplateableElement>> specializations = new HashMap<TemplateableElement, List<TemplateableElement>>();
	
	private List<Resource.Diagnostic> errors = null;
	
	protected final MetaModelManager metaModelManager;
	protected final Resource umlResource;					// Set via eAdapters.add()
	
	protected org.eclipse.ocl.examples.pivot.Package pivotRoot = null;	// Set by importResource
	protected final UML2PivotDeclarationSwitch declarationPass = new UML2PivotDeclarationSwitch(this);	
	protected final UML2PivotReferenceSwitch referencePass = new UML2PivotReferenceSwitch(this);
	
	public UML2Pivot(Resource umlResource, MetaModelManager metaModelManager) {
		this.umlResource = umlResource;
		this.metaModelManager = metaModelManager;
		metaModelManager.addExternalResource(this);
		metaModelManager.addListener(this);
	}
	
	public void addCreated(EModelElement umlElement, Element pivotElement) {
		createMap.put(umlElement, pivotElement);
	}

	protected void copyAnnotatedElement(NamedElement pivotElement,
			EModelElement umlElement, List<EAnnotation> excludedAnnotations) {
		List<Annotation> pivotAnnotations = pivotElement.getOwnedAnnotation();
		for (EAnnotation eAnnotation : umlElement.getEAnnotations()) {
			if ((excludedAnnotations == null) || !excludedAnnotations.contains(eAnnotation)) {
				Annotation pivotAnnotation = (Annotation) declarationPass.doSwitch(eAnnotation);
				pivotAnnotations.add(pivotAnnotation);
			}
		}
	}

	protected void copyModelElement(Element pivotElement, EModelElement umlElement) {
		setOriginalMapping(pivotElement, umlElement);
	}

	protected void copyMultiplicityElement(TypedMultiplicityElement pivotElement, org.eclipse.uml2.uml.MultiplicityElement umlMultiplicityElement) {
		int lower = umlMultiplicityElement.getLower();
		int upper = umlMultiplicityElement.getUpper();
		pivotElement.setLower(BigInteger.valueOf(lower));
		pivotElement.setUpper(BigInteger.valueOf(upper));
		pivotElement.setIsOrdered(umlMultiplicityElement.isOrdered());			
		pivotElement.setIsUnique(umlMultiplicityElement.isUnique());			
	}

	protected void copyNamedElement(NamedElement pivotElement, org.eclipse.uml2.uml.NamedElement umlNamedElement) {
		copyModelElement(pivotElement, umlNamedElement);
		String name = umlNamedElement.getName();
		pivotElement.setName(name);
	}

	protected void copyProperty(Property pivotElement, org.eclipse.uml2.uml.Property umlProperty, List<EAnnotation> excludedAnnotations) {
		EAnnotation oclAnnotation = OCLCommon.getDelegateAnnotation(umlProperty);
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
				else
				{
					error("Unsupported feature constraint " + key);
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
				}
			}				
		}
		copyTypedElement(pivotElement, umlProperty, excludedAnnotations);
		copyMultiplicityElement(pivotElement, umlProperty);
		pivotElement.setIsReadOnly(umlProperty.isReadOnly());			
		pivotElement.setIsDerived(umlProperty.isDerived());			
//		pivotElement.setIsTransient(umlProperty.isTransient());			
//		pivotElement.setIsUnsettable(umlProperty.isUnsettable());			
//		pivotElement.setIsVolatile(umlProperty.isVolatile());			
//		if (umlProperty.eIsSet(EcorePackage.Literals.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL)) {
//			pivotElement.setDefault(eObject.getDefaultValueLiteral());
//		}
//		else {
//			pivotElement.eUnset(PivotPackage.Literals.PROPERTY__DEFAULT);
//		}
	}

	protected void copyTypedElement(TypedMultiplicityElement pivotElement, org.eclipse.uml2.uml.TypedElement umlTypedElement, List<EAnnotation> excludedAnnotations) {
		copyNamedElement(pivotElement, umlTypedElement);
		copyAnnotatedElement(pivotElement, umlTypedElement, excludedAnnotations);
		org.eclipse.uml2.uml.Type umlType = umlTypedElement.getType();
		if (umlType != null) {
//			doInPackageSwitch(umlType);
			queueReference(umlTypedElement);
		}
	}

	public void dispose() {
		metaModelManager.removeExternalResource(this);
		getTarget().eAdapters().remove(this);
	}

	protected void error(String message) {
		if (errors == null) {
			errors = new ArrayList<Resource.Diagnostic>();
		}
		errors.add(new XMIException(message));
	}

	public <T extends Element> T getCreated(Class<T> requiredClass, EObject eObject) {
		Element element = createMap.get(eObject);
		if (element == null) {
			return null;
		}
		if (!requiredClass.isAssignableFrom(element.getClass())) {
			logger.error("Ecore " + element.getClass().getName() + "' element is not a '" + requiredClass.getName() + "'"); //$NON-NLS-1$
			return null;
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) element;
		return castElement;
	}
	
	protected MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}
	
	public Type getPivotType(EObject eObject) {
		Element pivotElement = createMap.get(eObject);
		if (pivotElement == null) {
			Resource resource = eObject.eResource();
			if ((resource != umlResource) && (resource != null)) {
				UML2Pivot converter = getAdapter(resource, metaModelManager);
				if (allConverters.add(converter)) {
					converter.getPivotRoot();
//					allEClassifiers.addAll(converter.allEClassifiers);
//					allNames.addAll(converter.allNames);
					for (Map.Entry<EModelElement, Element> entry : converter.createMap.entrySet()) {
						createMap.put(entry.getKey(), entry.getValue());
					}
				}
			}
			pivotElement = createMap.get(eObject);
		}
		if (pivotElement == null) {
			error("Unresolved " + eObject);
		}
		else if (!(pivotElement instanceof Type)) {
			error("Incompatible " + eObject);
		}
		else {
			return (Type) pivotElement;
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
			Resource pivotResource = importObjects(umlResource.getContents(), umlResource.getURI());
			AliasAdapter ecoreAdapter = AliasAdapter.findAdapter(umlResource);
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
			metaModelManager.installResource(pivotResource);
		}
		return pivotRoot;
	}

	public Resource getResource() {
		return umlResource;
	}

	public Notifier getTarget() {
		return umlResource;
	}

	public URI getURI() {
		return umlResource.getURI();
	}

	public Resource importObjects(Collection<EObject> ecoreContents, URI ecoreURI) {
		Resource pivotResource = metaModelManager.createResource(ecoreURI, PivotPackage.eCONTENT_TYPE);
		pivotRoot = metaModelManager.createModel(ecoreURI.lastSegment(), null);
		pivotResource.getContents().add(pivotRoot);
		List<org.eclipse.ocl.examples.pivot.Package> packages = pivotRoot.getNestedPackage();
		for (EObject eObject : ecoreContents) {
			Object pivotElement = declarationPass.doInPackageSwitch(eObject);
			if (pivotElement instanceof org.eclipse.ocl.examples.pivot.Package) {
				packages.add((org.eclipse.ocl.examples.pivot.Package) pivotElement);
			}
			else {
				error("Bad ecore content");
			}
		}
//		Map<String, Type> resolvedSpecializations = new HashMap<String, Type>();
//		for (EGenericType eGenericType : genericTypes) {
//			Type pivotType = resolveType(resolvedSpecializations, eGenericType);
//			createMap.put(eGenericType, pivotType);
//		}
//		for (List<TemplateableElement> pivotElements : specializations.values()) {
//			for (TemplateableElement pivotElement : pivotElements) {
//				metaModelManager.addOrphanType((Type)pivotElement);
//			}
//		}
		for (EObject eObject : referencers) {
			referencePass.doInPackageSwitch(eObject);
		}
		if (errors != null) {
			pivotResource.getErrors().addAll(errors);
		}
		return pivotResource;
	}

	public boolean isAdapterFor(MetaModelManager metaModelManager) {
		return this.metaModelManager == metaModelManager;
	}

	public boolean isAdapterForType(Object type) {
		return type == UML2Pivot.class;
	}

	public void metaModelManagerDisposed(MetaModelManager metaModelManager) {
		dispose();
	}

	public void notifyChanged(Notification notification) {}

	public void queueReference(EModelElement umlElement) {
		referencers.add(umlElement);
	}

/*	protected void refreshAnnotation(NamedElement pivotElement, String key, String value) {
		String source = PIVOT_URI;
		Annotation pivotAnnotation = null;
		for (Annotation annotation : pivotElement.getOwnedAnnotation()) {
			if (annotation.getName().equals(source)) {
				pivotAnnotation = annotation;
				break;
			}
		}
		if (pivotAnnotation == null) {
			pivotAnnotation = PivotFactory.eINSTANCE.createAnnotation();
			pivotAnnotation.setName(source);
			pivotElement.getOwnedAnnotation().add(pivotAnnotation);
		}
		Detail pivotDetail = PivotFactory.eINSTANCE.createDetail();
		pivotDetail.setName(key);
		pivotDetail.getValue().add(value);
		pivotAnnotation.getOwnedDetail().add(pivotDetail);
	} */

	protected <T extends Element> T refreshElement(Class<T> pivotClass,
			EClass pivotEClass, org.eclipse.uml2.uml.Element umlElement) {
		EFactory eFactoryInstance = pivotEClass.getEPackage().getEFactoryInstance();
		EObject pivotElement = eFactoryInstance.create(pivotEClass);
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		return castElement;
	}

	protected <T extends NamedElement> T refreshNamedElement(Class<T> pivotClass,
			EClass pivotEClass, org.eclipse.uml2.uml.NamedElement umlNamedElement) {
		EFactory eFactoryInstance = pivotEClass.getEPackage().getEFactoryInstance();
		EObject pivotElement = eFactoryInstance.create(pivotEClass);
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		castElement.setName(umlNamedElement.getName());
		return castElement;
	}
	
	protected Type resolveDataType(EGenericType eGenericType) {
		assert eGenericType.getETypeArguments().isEmpty();
		EDataType eClassifier = (EDataType) eGenericType.getEClassifier();
		Type pivotType = null;
		if (eClassifier.getEPackage() == EcorePackage.eINSTANCE) {
			if (eClassifier == EcorePackage.Literals.EBOOLEAN) {
				pivotType = metaModelManager.getBooleanType();
			}
			else if (eClassifier == EcorePackage.Literals.EBIG_INTEGER) {
				pivotType = metaModelManager.getIntegerType();
			}
			else if (eClassifier == EcorePackage.Literals.EBIG_DECIMAL) {
				pivotType = metaModelManager.getRealType();
			}
			else if (eClassifier == EcorePackage.Literals.ESTRING) {
				pivotType = metaModelManager.getStringType();
			}
//			if (primitiveTypeName != null) {
//				PrimitiveTypeRefCS csTypeRef = BaseCSTFactory.eINSTANCE.createPrimitiveTypeRefCS();
//				csTypeRef.setName(primitiveTypeName);
//				setOriginalMapping(csTypeRef, eObject);
//				return csTypeRef;
//			}
		}
		if (pivotType == null) {
			pivotType = getPivotType(eClassifier);
		}
		return pivotType;
	}

/*	protected Type resolveGenericType(Map<String, Type> resolvedSpecializations, EGenericType eGenericType) {
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		assert !eGenericType.getETypeArguments().isEmpty();
		EClassifier eClassifier = eGenericType.getEClassifier();
		List<ETypeParameter> eTypeParameters = eClassifier.getETypeParameters();
		assert eTypeParameters.size() == eTypeArguments.size();
		Type specializedPivotElement;
		Type unspecializedPivotType = getPivotType(eClassifier);
		if (unspecializedPivotType instanceof DataType) {
			specializedPivotElement = refreshNamedElement(DataType.class, PivotPackage.Literals.DATA_TYPE, null);
		}
		else {
			specializedPivotElement = refreshNamedElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, null);
		}
		specializedPivotElement.setName(unspecializedPivotType.getName());
		TemplateBinding templateBinding = PivotFactory.eINSTANCE.createTemplateBinding();
		TemplateSignature templateSignature = unspecializedPivotType.getOwnedTemplateSignature();
		templateBinding.setSignature(templateSignature);
		specializedPivotElement.getTemplateBinding().add(templateBinding);
		for (int i = 0; i < eTypeParameters.size(); i++) {
			TemplateParameterSubstitution templateParameterSubstitution = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
			templateParameterSubstitution.setFormal(templateSignature.getParameter().get(i));
			EGenericType eTypeArgument = eTypeArguments.get(i);
			Type typeArgument = resolveType(resolvedSpecializations, eTypeArgument);
			if (typeArgument.eContainer() == null) {
				templateParameterSubstitution.setOwnedActual(typeArgument);
			}
			else {
				templateParameterSubstitution.setActual(typeArgument);
			}
			templateBinding.getParameterSubstitution().add(templateParameterSubstitution);
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
	} */

	protected Type resolveSimpleType(EGenericType eGenericType) {
		assert eGenericType.getETypeArguments().isEmpty();
		EClassifier eClassifier = eGenericType.getEClassifier();
		Type pivotType = getPivotType(eClassifier);
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

	protected Type resolveType(org.eclipse.uml2.uml.Type umlType) {
		Type pivotType = getCreated(Type.class, umlType);
		if (pivotType != null) {
			return pivotType;
		}
/*		EClassifier eClassifier = eGenericType.getEClassifier();
		ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		if (eTypeParameter != null) {
			pivotType = resolveTypeParameter(eGenericType);
		}
		else if (eClassifier == null) {
			pivotType = resolveWildcardType(eGenericType);
		}
		else if (!eTypeArguments.isEmpty()) {
			String ecoreMoniker = UML2Moniker.toString(eGenericType);
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
		createMap.put(eGenericType, pivotType); */
		return pivotType;
	}

	protected Type resolveTypeParameter(EGenericType eGenericType) {
		EClassifier eClassifier = eGenericType.getEClassifier();
		ETypeParameter eTypeParameter = eGenericType.getETypeParameter();
		List<EGenericType> eTypeArguments = eGenericType.getETypeArguments();
		assert eClassifier == null;
		assert eTypeArguments.isEmpty();
		Type pivotType = getCreated(Type.class, eTypeParameter);
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
		org.eclipse.ocl.examples.pivot.Class pivotElement = PivotFactory.eINSTANCE.createClass();
		String name = PivotConstants.WILDCARD_NAME;
		EStructuralFeature eFeature = eGenericType.eContainmentFeature();
		if ((eFeature != null) && eFeature.isMany()) {
			EObject eContainer = eGenericType.eContainer();
			List<?> list = (List<?>)eContainer.eGet(eGenericType.eContainingFeature());
			int index = list.indexOf(eGenericType);
			if (index != 0) {
				name += index;
			}
		}
		pivotElement.setName(name);		
		return pivotElement;
	}

	protected void setOriginalMapping(Element pivotElement, EModelElement umlElement) {
		((PivotObjectImpl)pivotElement).setTarget(umlElement);
/*			csModelElement.setOriginalObject(eModelElement);
			if (ecoreResource instanceof XMLResource) {
				String xmiId = ((XMLResource)ecoreResource).getID(eModelElement);
				if (xmiId != null) {
					csModelElement.setOriginalXmiId(xmiId);
				}
			} */
		addCreated(umlElement, pivotElement);
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == umlResource;
	}

	public void unsetTarget(Notifier oldTarget) {
		assert (oldTarget == umlResource);
	}
}
