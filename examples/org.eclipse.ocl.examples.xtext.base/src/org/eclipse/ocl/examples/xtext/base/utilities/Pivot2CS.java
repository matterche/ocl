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
 * $Id: Pivot2CS.java,v 1.1.2.1 2010/10/01 14:13:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTFactory;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.QualifiedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;

public class Pivot2CS extends AbstractConversion
{	
	private static final Logger logger = Logger.getLogger(Pivot2CS.class);

	public static interface Factory {
		Switch create(Pivot2CS converter);
		EPackage getEPackage();
	}
		
	public static interface Switch
	{
		ElementCS doInPackageSwitch(EObject theEObject);
		ElementCS doSwitch(EObject object);
	}

	public class NullSwitch implements Switch
	{
		private ElementCS nullElement = BaseCSTFactory.eINSTANCE.createEnumerationLiteralCS();
		
		public ElementCS doInPackageSwitch(EObject theEObject) {
			return doSwitch(theEObject);
		}
		
		public ElementCS doSwitch(EObject theEObject) {
			if (theEObject == null) {
				logger.warn("No converter support found for <null>"); //$NON-NLS-1$
			}
			else {
				logger.warn("No converter support found for " + theEObject.eClass().getName()); //$NON-NLS-1$
			}
			return nullElement;
		}
	}
		
	private static Map<EPackage, Factory> factoryMap = new HashMap<EPackage, Factory>();
	
	public static void addFactory(Factory factory) {
		factoryMap.put(factory.getEPackage(), factory);
	}
	
	/**
	 * The per-package Switches
	 */
	private final Map<EPackage, Switch> switchMap = new HashMap<EPackage, Switch>();
	
	/**
	 * Mapping of each pivot resource to its corresponding CS Resource.
	 */
	protected final Map<? extends Resource, ? extends Resource> pivot2csResourceMap;
	
	/**
	 * The CS element for pivot monikers
	 */
	protected final Map<String, NamedElementCS> moniker2CSMap;

	public Pivot2CS(Map<? extends Resource, ? extends Resource> pivot2csResourceMap) {
		this.pivot2csResourceMap = pivot2csResourceMap;
		moniker2CSMap = computeMoniker2CSMap(getCSResources());
	}

	public Map<String, NamedElementCS> computeMoniker2CSMap(Collection<? extends Resource> csResources) {
		Map<String, NamedElementCS> map = new HashMap<String, NamedElementCS>();
		for (Resource csResource : csResources) {
			for (Iterator<EObject> it = csResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof NamedElementCS) {
					NamedElementCS nameableElement = (NamedElementCS) eObject;
					String moniker = nameableElement.getMoniker();
					map.put(moniker, nameableElement);
				}
			}
		}
		return map;
	}	

	public Map<String, MonikeredElement> computeMoniker2PivotMap(Collection<? extends Resource> pivotResources) {
		Map<String, MonikeredElement> map = new HashMap<String, MonikeredElement>();
		for (Resource pivotResource : pivotResources) {
			for (Iterator<EObject> it = pivotResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof MonikeredElement) {
					MonikeredElement nameableElement = (MonikeredElement) eObject;
					String moniker = nameableElement.getMoniker();
					map.put(moniker, nameableElement);
				}
			}
		}
		return map;
	}	

	public ElementCS convertCompositions(EObject pivotElement) {
		EPackage ePackage = pivotElement.eClass().getEPackage();
		Switch csSwitch = getSwitch(ePackage);
		return csSwitch.doInPackageSwitch(pivotElement);
	}

	public void convertCompositions(List<? extends EObject> pivotElements) {
		for (EObject pivotElement : pivotElements) {
			convertCompositions(pivotElement);
		}
	}

	public <T extends ElementCS> T convertCompositions(Class<T> csClass, EObject pivotElement) {
		ElementCS element = convertCompositions(pivotElement);
		if (!csClass.isAssignableFrom(element.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) element;
		return castElement;
	}
	
	public NamedElementCS getCSElement(String moniker) {
		return moniker2CSMap.get(moniker);
	}

	public Collection<? extends Resource> getCSResources() {
		return pivot2csResourceMap.values();
	}

	public Set<String> getMonikers() {
		return moniker2CSMap.keySet();
	}

	public <T> T  getCSElement(Class<T> csClass, String moniker) {
		NamedElementCS csNamedElement = getCSElement(moniker);
		if (csNamedElement == null) {
			return null;
		}
		if (!csClass.isAssignableFrom(csNamedElement.getClass())) {
			logger.error("Pivot element for " + moniker + " is not a " + csClass.getName()); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) csNamedElement;
		return castElement;
	}

	public Collection<? extends Resource> getPivotResources() {
		return pivot2csResourceMap.keySet();
	}
	
	protected Switch getSwitch(EPackage ePackage) {
		Switch converterSwitch = switchMap.get(ePackage);
		if (converterSwitch == null) {
			Factory factory = factoryMap.get(ePackage);
			if (factory != null) {
				converterSwitch = factory.create(this);
			}
			if (converterSwitch == null) {
				converterSwitch = switchMap.get(null);
				if (converterSwitch == null) {
					converterSwitch = new NullSwitch();
					switchMap.put(null, converterSwitch);
				}
			}
			switchMap.put(ePackage, converterSwitch);
		}
		return converterSwitch;
	}

	public Switch getSwitch(Factory factory) {
		EPackage ePackage = factory.getEPackage();
		return getSwitch(ePackage);
	}

	protected List<TemplateBindingCS> getTemplateBindings(ElementCS pivotElement) {
		List<TemplateBindingCS> csTemplateBindings;
//		EObject container = pivotElement.eContainer();
//		if (container instanceof ElementCS) {			
//			csTemplateBindings = getTemplateBindings((ElementCS) container);
//		}
//		else {
			csTemplateBindings = new ArrayList<TemplateBindingCS>();
//		}
		if (pivotElement instanceof TemplateBindableElementCS) {
			TemplateBindableElementCS csTemplateableElement = (TemplateBindableElementCS)pivotElement;
			TemplateBindingCS csTemplateBinding = csTemplateableElement.getOwnedTemplateBinding();
			if (csTemplateBinding != null) {
				csTemplateBindings.add(csTemplateBinding);
			}
		}
		return csTemplateBindings;
	}
	
	protected List<TemplateSignature> getTemplateSignatures(Element expivotElement) {
		List<TemplateSignature> pivotTemplateSignatures;
		EObject container = expivotElement.eContainer();
		if (container instanceof Element) {			
			pivotTemplateSignatures = getTemplateSignatures((Element) container);
		}
		else {
			pivotTemplateSignatures = new ArrayList<TemplateSignature>();
		}
		if (expivotElement instanceof TemplateableElement) {
			TemplateableElement templateableElement = (TemplateableElement)expivotElement;
			TemplateSignature templateSignature = templateableElement.getOwnedTemplateSignature();
			if (templateSignature != null) {
				pivotTemplateSignatures.add(templateSignature);
			}
		}
		return pivotTemplateSignatures;
	}

/*	protected List<TemplateSignatureCS> getTemplateSignatures(ElementCS pivotElement) {
		List<TemplateSignatureCS> csTemplateSignatures;
		EObject container = pivotElement.eContainer();
		if (container instanceof ElementCS) {			
			csTemplateSignatures = getTemplateSignatures((ElementCS) container);
		}
		else {
			csTemplateSignatures = new ArrayList<TemplateSignatureCS>();
		}
		if (pivotElement instanceof TemplateableElementCS) {
			TemplateableElementCS csTemplateableElement = (TemplateableElementCS)pivotElement;
			TemplateSignatureCS csTemplateSignature = csTemplateableElement.getOwnedTemplateSignature();
			if (csTemplateSignature != null) {
				csTemplateSignatures.add(csTemplateSignature);
			}
		}
		return csTemplateSignatures;
	} */

	public TypedRefCS getTypedRef(Type pivotType) {
		TypedRefCS csTypeRef;
//		if (csTypeRef == null) {
//			Class<? extends TypeRefCS> typeRefClass = getTypeRefClass(pivotType);
//		}
//		refreshTypeRef(ownedType, pivotType);
		
//		if () {
			TypedTypeRefCS csTypedTypeRef = BaseCSTFactory.eINSTANCE.createTypedTypeRefCS();
			csTypedTypeRef.setType(pivotType);
//			refreshTemplateBinding(csTypedTypeRef.getOwnedTemplateBinding(), pivotType.getTemplateBindings());
			org.eclipse.ocl.examples.pivot.Package pivotPackage = pivotType.getPackage();
			QualifiedTypeRefCS csQualifiedTypeRef = BaseCSTFactory.eINSTANCE.createQualifiedTypeRefCS();
			csQualifiedTypeRef.setNamespace(pivotPackage);
			csQualifiedTypeRef.setElement(csTypedTypeRef);
//			refreshTemplateBinding(csTypedTypeRef.getOwnedTemplateBinding(), pivotType.getTemplateBindings());
			csTypeRef = csQualifiedTypeRef;
//		}
//		else if () {
//			csTypeRef = BaseCSTFactory.eINSTANCE.createPrimitiveTypeRefCS();
//		}
//		else {
//			csTypeRef = BaseCSTFactory.eINSTANCE.createWildcardTypeRefCS();
//		}
		return csTypeRef;
	}

	public void installPivotElement(MonikeredElementCS csElement, MonikeredElement newPivotElement) {
		String moniker = csElement.getMoniker();
		String csClassName = csElement.eClass().getName();
		logger.trace("Installing " + csClassName + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
		EObject oldPivotElement = csElement.getPivot();
		if (newPivotElement == null) {
			if (!(csElement instanceof TemplateBindingCS)) {
				logger.warn("Missing new pivot element for " + csClassName + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			}
		} else if (oldPivotElement == null) {
			csElement.setPivot(newPivotElement);
		} else if (oldPivotElement != newPivotElement) {
			logger.warn("Conflicting pivot element for " + csClassName + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
		} else {
//			logger.info("Duplicate pivot element for " + csClassName + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	public <T> void refreshList(Class<T> pivotClass, List<T> expivotElements, List<? extends MonikeredElement> pivotElements) {
		if (!expivotElements.isEmpty() ||!pivotElements.isEmpty()) {
			List<T> newPivotElements = new ArrayList<T>();
			for (MonikeredElement pivotElement : pivotElements) {
				String moniker = pivotElement.getMoniker();
				T expivotElement = getCSElement(pivotClass, moniker);
				newPivotElements.add(expivotElement);
			}
			refreshList(expivotElements, newPivotElements);
		}
	}

	public void refreshName(NamedElementCS csNamedElement, NamedElement pivotNamedElement) {
		String newName = pivotNamedElement.getName();
		String oldName = csNamedElement.getName();
		if (!newName.equals(oldName)) {
			csNamedElement.setName(newName);
		}
	}
	
	/**
	 * Return a pivotEClass instance cast to pivotClass registered for pivotElement.getMoniker().
	 * <p>An existing moniker element is re-used else an new instance is created.
	 * <p>The pivot element is installed as the original object of pivotElement. 
	 * @param <T>
	 * @param pivotClass
	 * @param pivotEClass
	 * @param pivotElement
	 * @return
	 */
	public <T extends NamedElementCS> T refreshNamedElement(Class<T> csClass, EClass csEClass, NamedElement pivotElement) {
		assert csClass == csEClass.getInstanceClass();
		String moniker = pivotElement.getMoniker();
		NamedElementCS csElement = moniker2CSMap.get(moniker);
		if (csElement == null) {
			logger.trace("Creating " + csEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			csElement = (NamedElementCS) BaseCSTFactory.eINSTANCE.create(csEClass);
			moniker2CSMap.put(moniker, csElement);
		}
		else {
			logger.trace("Reusing " + csEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
		}
		if (!csClass.isAssignableFrom(csElement.getClass())) {
			throw new ClassCastException();
		}
		installPivotElement(csElement, pivotElement);
		@SuppressWarnings("unchecked")
		T castElement = (T) csElement;
		return castElement;
	}

	public <T extends ElementCS> void refreshOwnedList(Class<T> csClass, List<? super T> csElements,
			List<? extends EObject> pivotElements) {
		if (csElements.isEmpty() && pivotElements.isEmpty()) {
			return;
		}
		List<T> newPivotElements = new ArrayList<T>();
		for (EObject pivotElement : pivotElements) {
			newPivotElements.add(convertCompositions(csClass, pivotElement));
		}
		refreshList(csElements, newPivotElements);
	}

	public void refreshResourceComposition() {
		for (Resource pivotResource : getPivotResources()) {
			Resource csResource = pivot2csResourceMap.get(pivotResource);
			List<? super ElementCS> csContents = csResource.getContents();
			List<? extends EObject> pivotContents = pivotResource.getContents();
			refreshOwnedList(ElementCS.class, csContents, pivotContents);
		}
	}

	/**
	 * Update a list of TemplateBinding to match a list of TemplateSignature
	 * by moving/adding/removing existing entries. Once matched each TemplateBinding.signature
	 * references the corresponding TemplateSignature, and each TemplateBinding.parameterSubstitution.formal
	 * references the corresponding TemplateSignature.ownedParameter.
	 * 
	 * @param templateBindings
	 * @param templateSignatures
	 *
	protected void refreshTemplateBindings(List<TemplateBinding> templateBindings, List<TemplateSignature> templateSignatures, List<TemplateBindingCS> csTemplateBindings) {
		int csIMax = csTemplateBindings.size();
		int pivotIMax = templateSignatures.size();
		if (csIMax != pivotIMax) {
			logger.warn("Inconsistent template bindings size for " + csTemplateBindings.get(0).getOwningTemplateBindableElement().getMoniker()); //$NON-NLS-1$
		}
		int newMax = Math.min(csIMax, pivotIMax);
		for (int i = 0; i < newMax; i++) {					// Invariant: lists are equal up to index i
			TemplateBindingCS csTemplateBinding = csTemplateBindings.get(i);
			TemplateSignature templateSignature = templateSignatures.get(i);
			int oldMax = templateBindings.size();
			TemplateBinding templateBinding = null;;
			for (int j = i; j < oldMax; j++) {
				TemplateBinding oldTemplateBinding = templateBindings.get(j);
				if (oldTemplateBinding.getSignature() == templateSignature) {
					if (j != i) {
						templateBindings.add(i, templateBindings.remove(j));
					}
					templateBinding = oldTemplateBinding;
//					registerPivotElement(csTemplateBinding, templateBinding);
					installPivotElement(csTemplateBinding, templateBinding);
					break;
				}
			}
			if (templateBinding == null) {
				templateBinding = refreshNamedElement(TemplateBindingCS.class, BaseCSTPackage.Literals.TEMPLATE_BINDING_CS, csTemplateBinding);
				templateBinding.setSignature(templateSignature);
				if (i < oldMax) {
					templateBindings.add(i, templateBinding);
				}
				else {
					templateBindings.add(templateBinding);					
				}
			}
			refreshTemplateParameterSubstitutions(templateBinding.getParameterSubstitutions(), templateSignature.getOwnedParameters(), csTemplateBinding.getOwnedParameterSubstitution());
			assert templateSignatures.get(i) == templateBindings.get(i).getSignature();
		}
		for (int k = templateBindings.size(); k > newMax; ) {
			templateBindings.remove(--k);
		}
		assert templateSignatures.size() == templateBindings.size();
	} */

	/**
	 * Update a list of TemplateParameterSubstitution to match a list of TemplateParameter
	 * by moving/adding/removing existing entries. Once matched each TemplateParameterSubstitution.formal
	 * references the corresponding TemplateParameter.
	 * @param eList 
	 * 
	 * @param templateSignature
	 * @param templateBinding
	 *
	protected void refreshTemplateParameterSubstitutions(List<TemplateParameterSubstitution> templateParameterSubstitutions,
			List<TemplateParameter> templateParameters, List<TemplateParameterSubstitutionCS> csTemplateParameterSubstitutions) {
		int csIMax = csTemplateParameterSubstitutions.size();
		int pivotIMax = templateParameters.size();
		if (csIMax != pivotIMax) {
			logger.warn("Inconsistent template parameter substitutions size for " + csTemplateParameterSubstitutions.get(0).getOwningTemplateBinding().getMoniker()); //$NON-NLS-1$
		}
		int newMax = Math.min(csIMax, pivotIMax);
		for (int i = 0; i < newMax; i++) {					// Invariant: lists are equal up to index i
			TemplateParameterSubstitutionCS csTemplateParameterSubstitution = csTemplateParameterSubstitutions.get(i);
			TemplateParameter templateParameter = templateParameters.get(i);
			int oldMax = templateParameterSubstitutions.size();
			TemplateParameterSubstitution templateParameterSubstitution = null;
			for (int j = i; j < oldMax; j++) {
				TemplateParameterSubstitution oldTemplateParameterSubstitution = templateParameterSubstitutions.get(j);
				if (oldTemplateParameterSubstitution.getFormal() == templateParameter) {
					if (j != i) {
						templateParameterSubstitutions.add(i, templateParameterSubstitutions.remove(j));
					}
					templateParameterSubstitution = oldTemplateParameterSubstitution;
//					registerPivotElement(csTemplateParameterSubstitution, templateParameterSubstitution);
//					installPivotElement(csTemplateParameterSubstitution, templateParameterSubstitution);
					break;
				}
			}
			if (templateParameterSubstitution == null) {
				templateParameterSubstitution = refreshNameableElement(TemplateParameterSubstitution.class, PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION, csTemplateParameterSubstitution);
				templateParameterSubstitution.setFormal(templateParameter);
				if (i < oldMax) {
					templateParameterSubstitutions.add(i, templateParameterSubstitution);
				}
				else {
					templateParameterSubstitutions.add(templateParameterSubstitution);
				}
			}
			assert templateParameters.get(i) == templateParameterSubstitutions.get(i).getFormal();
		}
		for (int k = templateParameterSubstitutions.size(); k > newMax; ) {
			templateParameterSubstitutions.remove(--k);
		}
		assert templateParameters.size() == templateParameterSubstitutions.size();
	} */

	public void refreshTemplateSignature(TemplateableElementCS csElement, TemplateableElement pivotElement) {		
		TemplateSignature pivotTemplateSignature = pivotElement.getOwnedTemplateSignature();
		TemplateSignatureCS csTemplateSignature = csElement.getOwnedTemplateSignature();	
		if (pivotTemplateSignature == null) {
			if (csTemplateSignature != null) {
				pivotElement.setOwnedTemplateSignature(null);			
			}
		}
		else {
			if (csTemplateSignature == null) {
				csTemplateSignature = BaseCSTFactory.eINSTANCE.createTemplateSignatureCS();
				csElement.setOwnedTemplateSignature(csTemplateSignature);			
			}
			refreshOwnedList(TemplateParameterCS.class, csTemplateSignature.getOwnedTemplateParameter(), pivotTemplateSignature.getOwnedParameters());
		}
	}

	public void refreshTypeRefList(List<TypedRefCS> csElements, List<? extends Type> pivotElements) {
		if (csElements.isEmpty() && pivotElements.isEmpty()) {
			return;
		}
		List<TypedRefCS> newCSElements = new ArrayList<TypedRefCS>();
		for (Type pivotElement : pivotElements) {
			newCSElements.add(getTypedRef(pivotElement));
		}
		refreshList(csElements, newCSElements);
	}

	public <T extends TypedElementCS> T refreshTypedElement(Class<T> csClass,
			EClass csEClass, TypedElement pivotElement) {
		T csElement = refreshNamedElement(csClass, csEClass, pivotElement);
		refreshName(csElement, pivotElement);
		TypedRefCS csTypeRef = csElement.getOwnedType();
		Type pivotType = pivotElement.getType();
		if (pivotType != null) {
			csTypeRef = getTypedRef(pivotType);
			csElement.setOwnedType(csTypeRef);
		}
		return csElement;
	}

/*	public void resolveActualParameter(TemplateParameterSubstitutionCS pivotElement) {
		String moniker = pivotElement.getMoniker();
		TemplateParameterSubstitution expivotElement = getPivotElement(TemplateParameterSubstitution.class, moniker);
		if (expivotElement != null) {
			String actualArgumentMoniker = pivotElement.getOwnedActualParameter().getMoniker();
			ParameterableElement pivotActual = getPivotElement(ParameterableElement.class, actualArgumentMoniker);
			if (pivotActual != expivotElement.getActual()) {
				expivotElement.setActual(pivotActual);
			}
		}
	} */

/*	public void resolvePivotElement(NameableElementCS pivotElement) {
		String moniker = pivotElement.getMoniker();
		logger.trace("Resolving " + pivotElement.eClass().getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
		NameableElement newPivotElement = getPivotElement(moniker);
		installPivotElement(pivotElement, newPivotElement);
	} */

/*	protected void resolveSpecialization(Map<TemplateableElementCS, Set<TemplateableElement>> specializations, TemplateBindableElementCS pivotElement) {
		TemplateBindingCS ownedTemplateBinding = pivotElement.getOwnedTemplateBinding();
		assert ownedTemplateBinding != null;
		TemplateableElementCS csTemplateableElement = null; // FIXME pivotElement.getTemplateableElement();
		String moniker = pivotElement.getMoniker();
		logger.trace("Specializing " + moniker); //$NON-NLS-1$
		TemplateableElement unspecializedPivotElement = getPivotElement(TemplateableElement.class, csTemplateableElement.getMoniker());
		if (unspecializedPivotElement == null) {
			logger.error("Nothing to specialize as " + moniker); //$NON-NLS-1$
			return;
		}
		//
		//	Refresh the pivot specialization root
		//
		TemplateableElement specializedPivotElement = getPivotElement(TemplateableElement.class, moniker);
		if (specializedPivotElement == null) {
			if (csTemplateableElement instanceof ClassCS) {
				ClassCS csClass = (ClassCS) csTemplateableElement;
				org.eclipse.ocl.examples.pivot.Class pivotClass = refreshNameableElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, pivotElement);
				refreshName(csClass, pivotClass);
				specializedPivotElement = pivotClass;
			}
			else {							// FIXME Non-Type TemplateParameters
				logger.error("Missing support for non-type specialization " + moniker); //$NON-NLS-1$
				return;
			}
		}
		if (specializedPivotElement == unspecializedPivotElement) {
			return;
		}
		//
		//	Refresh the pivot specialization bindings and parameter substitutions
		//
		List<TemplateBinding> templateBindings = specializedPivotElement.getTemplateBindings();
		List<TemplateSignature> templateSignatures = getTemplateSignatures(unspecializedPivotElement);
		List<TemplateBindingCS> csTemplateBindings = getTemplateBindings(pivotElement);
		refreshTemplateBindings(templateBindings, templateSignatures, csTemplateBindings);
		//
		//	Cache the pivot specialization
		//
		Set<TemplateableElement> specializationList = specializations.get(csTemplateableElement);
		if (specializationList == null) {
			specializationList = new HashSet<TemplateableElement>();
			specializations.put(csTemplateableElement, specializationList);
		}
		specializationList.add(specializedPivotElement);
	} */

	/**
	 * Ensure that a TypedElementCS.type has a value.
	 * @param pivotElement
	 *
	public void resolveType(TypedElementCS pivotElement) {
		String moniker = pivotElement.getMoniker();
		TypedElement expivotElement = getPivotElement(TypedElement.class, moniker);
		if (expivotElement != null) {
			String typeMoniker = pivotElement.getOwnedType().getMoniker();
			Type pivotType = getPivotElement(Type.class, typeMoniker);
			if (pivotType != expivotElement.getType()) {
				expivotElement.setType(pivotType);
			}
		}
	} */

	/**
	 * Sequence the update passes to make the pivot match the CS.
	 */
	public void updateCS() {
		refreshResourceComposition();
//		installPackageAliases();
	}
}