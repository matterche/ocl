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
 * $Id: CS2Pivot.java,v 1.1.2.1 2010/10/01 14:13:00 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Annotation;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.internal.impl.MonikeredElementImpl;
import org.eclipse.ocl.examples.pivot.utilities.AbstractConversion;
import org.eclipse.ocl.examples.pivot.utilities.AliasAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.AbstractPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterizedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.impl.MonikeredElementCSImpl;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.pivot.AbstractScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Pivot.Switch.Pass;

/**
 * BaseCST2Pivot provides an extensible conversion from CS models to the pivot model.
 * <p>
 * Conversion/update occurs in five passes.
 * <p>
 * Pass 1: updateDeclarers()
 * <br>the package/class/property/template parameter CS composition hierarchy is replicated in the pivot hierarchy
 * <br>requests for unreferable declarations are accumulated in <tt>queuedDefiners</tt>. 
 * <br>requests for specialization are accumulated in <tt>queuedBindings</tt>. 
 * <br>requests for references are accumulated in <tt>queuedReferencers</tt>. 
 * <br>all unspecialized pivot elements have correct attributes and composed children
 * <br>all unspecialized pivot nameable elements appear in moniker2pivotMap.
 * <p>
 * Pass 2: updateDefiners()
 * <br>the feature/annotation/detail CS composition hierarchy is replicated in the pivot hierarchy
 * <br>requests for specialization are accumulated in <tt>queuedBindings</tt>. 
 * <br>requests for references are accumulated in <tt>queuedReferencers</tt>. 
 * <br>all unspecialized pivot elements have correct attributes and composed children
 * <br>all unspecialized pivot nameable elements appear in moniker2pivotMap.
 * <p>
 * Pass 3: updateReferencers()
 * <br>the expression CS composition hierarchy is replicated in the pivot hierarchy
 * <br>requests for resolvers are accumulated in <tt>queuedResolvers</tt>. 
 * <p>
 * Pass 4: updateSpecializations()
 * <br>a unique pivot specialization is created/updated from each distinct CS specialization. 
 * <br>further requests for references are accumulated in <tt>queuedReferencers</tt>. 
 * <br>all pivot elements have correct attributes and composed children
 * <br>all pivot nameable elements appear in moniker2pivotMap.
 * <br>all specialized elements have correct signature, formal references
 * <p>
 * Pass 5: updateResolvers()
 * <br>cross-tree references are resolved in the pivot model.
 * <br>- pivot specialization actual arguments
 * <br>- TypedElementCS.type, TypedTypeRefCS.type, ...
 * <p>
 * Correlation between the CS and pivot is achieved by monikers which are unique for all
 * NameableElements. The old pivot model's monikers initialize the moniker2PivotMap so
 * the the subsequent refresh can discover a pre-existing pivot element for each
 * required CS element. The moniker2PivotMap is updated as pivot elements are created.
 * pivot monikers are not used during conversion since it may not be possible to
 * create the correct moniker for a partially converted specialization.
 */
public class CS2Pivot extends AbstractConversion
{	
	private static final Logger logger = Logger.getLogger(CS2Pivot.class);

	public static interface Factory {
		Switch create(CS2Pivot converter);
		EPackage getEPackage();
	}
		
	public static interface Switch
	{
		public static interface Pass
		{
			Element doInPackageSwitch(EObject theEObject);
			Element doSwitch(EObject object);
		}
		Pass getDeclarationPass();		
		Pass getDefinitionPass();		
		Pass getReferencePass();
		Pass getResolutionPass();
	}

	public class NullSwitch implements Switch, Switch.Pass
	{
		private Element nullElement = PivotFactory.eINSTANCE.createComment();
		
		public Element doInPackageSwitch(EObject theEObject) {
			return doSwitch(theEObject);
		}
		
		public Element doSwitch(EObject theEObject) {
			if (theEObject == null) {
				logger.warn("No converter support found for <null>"); //$NON-NLS-1$
			}
			else {
				logger.warn("No converter support found for " + theEObject.eClass().getName()); //$NON-NLS-1$
			}
			return nullElement;
		}

		public Pass getDeclarationPass() {
			return this;
		}

		public Pass getDefinitionPass() {
			return this;
		}

		public Pass getReferencePass() {
			return this;
		}

		public Pass getResolutionPass() {
			return this;
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
	
	protected final PivotManager pivotManager;
	
	/**
	 * Mapping of each CS resource to its corresponding pivot Resource.
	 */
	protected final Map<? extends Resource, ? extends Resource> cs2pivotResourceMap;
	
	/**
	 * The pivot element for CS monikers
	 */
	protected final Map<String, MonikeredElement> moniker2PivotMap;
	
	/**
	 * The new pivot element to alias map.
	 */
	protected final Map<EObject, String> aliasMap = new HashMap<EObject, String>();
	
	/**
	 * The CS elements for which a DefinitionPass is needed.
	 */
	private final Set<ModelElementCS> queuedDefiners = new HashSet<ModelElementCS>();

	private final Set<TemplateBindingCS> queuedBindings = new HashSet<TemplateBindingCS>();
	
	/**
	 * A CS parameterization for each CS specialization moniker that needs to exist.
	 */
//	private final Map<String, TemplateBindableElementCS> queuedSpecializations = new HashMap<String, TemplateBindableElementCS>();
	
	/**
	 * The CS elements for which a ReferencePass is needed.
	 */
	private final Set<ModelElementCS> queuedReferencers = new HashSet<ModelElementCS>();
	
	/**
	 * The CS elements for which a ResolutionPass is needed.
	 */
	private final Set<ModelElementCS> queuedResolvers = new LinkedHashSet<ModelElementCS>();

	public CS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, PivotManager pivotManager) {
		this.cs2pivotResourceMap = cs2pivotResourceMap;
		this.pivotManager = pivotManager;
		moniker2PivotMap = PivotManager.computeMoniker2PivotMap(getPivotResources());
	}
	
	public CS2Pivot(CS2Pivot aConverter) {
		this.cs2pivotResourceMap = aConverter.cs2pivotResourceMap;
		this.pivotManager = aConverter.pivotManager;
		moniker2PivotMap = PivotManager.computeMoniker2PivotMap(getPivotResources());
	}

	public Map<String, MonikeredElementCS> computeMoniker2CSMap(Collection<? extends Resource> csResources) {
		Map<String, MonikeredElementCS> map = new HashMap<String, MonikeredElementCS>();
		for (Resource csResource : csResources) {
			for (Iterator<EObject> it = csResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof MonikeredElementCS) {
					MonikeredElementCS nameableElement = (MonikeredElementCS) eObject;
					String moniker = nameableElement.getMoniker();
					assert moniker != null;
					map.put(moniker, nameableElement);
				}
			}
		}
		return map;
	}	

	public void declareAlias(Namespace pivotElement, AbstractPackageCS csElement) {
		aliasMap.put(pivotElement, AliasAdapter.getAlias(csElement));
	}

	public Element declareElement(EObject csElement) {
		EPackage ePackage = csElement.eClass().getEPackage();
		Pass declarationPass = getSwitch(ePackage).getDeclarationPass();
		return declarationPass.doInPackageSwitch(csElement);
	}

	public <T extends Element> T declareElement(Class<T> pivotClass, EObject csElement) {
		Element element = declareElement(csElement);
		if (!pivotClass.isAssignableFrom(element.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) element;
		return castElement;
	}

	public void declareElements(List<? extends EObject> csElements) {
		for (EObject csElement : csElements) {
			declareElement(csElement);
		}
	}

	public <T extends Element> void declareElements(Class<T> pivotClass, List<? super T> pivotElements,
			List<? extends EObject> csElements) {
		if (pivotElements.isEmpty() && csElements.isEmpty()) {
			return;
		}
		List<T> newPivotElements = new ArrayList<T>();
		for (EObject csElement : csElements) {
			newPivotElements.add(declareElement(pivotClass, csElement));
		}
		refreshList(pivotElements, newPivotElements);
	}

	public Element defineElement(EObject csElement) {
		EPackage ePackage = csElement.eClass().getEPackage();
		Pass definitionPass = getSwitch(ePackage).getDefinitionPass();
		Element element = definitionPass.doInPackageSwitch(csElement);
		if ((element == null) && !(csElement instanceof TypeRefCS)) {		// FIXME redundant pivot in refs
			logger.warn("Null pivot element for " + csElement.eClass().getName());
		}
		return element;
	}

	public <T extends Element> T defineElement(Class<T> pivotClass, EObject csElement) {
		Element element = defineElement(csElement);
		if (!pivotClass.isAssignableFrom(element.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) element;
		return castElement;
	}

	public void defineElements(List<? extends EObject> csElements) {
		for (EObject csElement : csElements) {
			defineElement(csElement);
		}
	}

	public <T extends Element> void defineElements(Class<T> pivotClass, List<? super T> pivotElements,
			List<? extends EObject> csElements) {
		if (pivotElements.isEmpty() && csElements.isEmpty()) {
			return;
		}
		List<T> newPivotElements = new ArrayList<T>();
		for (EObject csElement : csElements) {
			newPivotElements.add(defineElement(pivotClass, csElement));
		}
		refreshList(pivotElements, newPivotElements);
	}

	public <T extends NamedElement> T defineNamedElement(Class<T> pivotClass,
			EClass pivotEClass, NamedElementCS csElement) {
		T pivotElement = refreshMonikeredElement(pivotClass, pivotEClass, csElement.getMoniker());
		installPivotElement(csElement, pivotElement);
		refreshName(pivotElement, csElement.getName());
		return pivotElement;
	}

	public <T extends Operation> T defineOperation(Class<T> pivotClass,
			EClass pivotEClass, OperationCS csElement) {
		T pivotElement = defineNamedElement(pivotClass, pivotEClass, csElement);
		refreshTemplateSignature(pivotElement, csElement, false);
//		defineElements(Parameter.class, pivotElement.getOwnedIterators(), csElement.getOwnedIterator());
		defineElements(Parameter.class, pivotElement.getOwnedParameters(), csElement.getOwnedParameter());
		defineTemplateBinding(csElement);
		defineElement(csElement.getOwnedType());
		defineElements(Constraint.class, pivotElement.getOwnedRules(), csElement.getOwnedConstraint());
		defineElements(Annotation.class, pivotElement.getOwnedAnnotations(), csElement.getOwnedAnnotation());
		queueReferencer(csElement);	// For type
//		queueReferencers(csElement.getOwnedParameter());	// For type
		return pivotElement;
	}

	public void defineTemplateBinding(TemplateBindableElementCS csElement) {
		TemplateBindingCS csTemplateBinding = csElement.getOwnedTemplateBinding();
		if (csTemplateBinding != null) {
			String moniker = csElement.getMoniker();
			logger.trace("Queuing Specialization " + moniker); //$NON-NLS-1$
			queuedBindings.add(csTemplateBinding);
			for (TemplateParameterSubstitutionCS csParameterSubstitution : csTemplateBinding.getOwnedParameterSubstitution()) {
				ParameterableElementCS actualParameter = csParameterSubstitution.getOwnedActualParameter();
				defineElement(actualParameter);
			}
		}
	}

	public <T extends TypedElement> T defineTypedElement1(Class<T> pivotClass,
			EClass pivotEClass, TypedElementCS csElement) {
		T pivotElement = defineNamedElement(pivotClass, pivotEClass, csElement);
		queueReferencer(csElement);	// For type
		return pivotElement;
	}

	public Collection<? extends Resource> getCSResources() {
		return cs2pivotResourceMap.keySet();
	}

	public Set<String> getMonikers() {
		return moniker2PivotMap.keySet();
	}
	
	public MonikeredElement getPivotElement(String moniker) {
		return moniker2PivotMap.get(moniker);
	}

	public <T extends Element> T getPivotElement(Class<T> pivotClass, String moniker) {
		MonikeredElement nameableElement = getPivotElement(moniker);
		if (nameableElement == null) {
			return null;
		}
		if (!pivotClass.isAssignableFrom(nameableElement.getClass())) {
			logger.error("Pivot element for " + moniker + " is not a " + pivotClass.getName()); //$NON-NLS-1$ //$NON-NLS-2$
			return null;
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) nameableElement;
		return castElement;
	}

	public <T extends Element> T getPivotElement(Class<T> pivotClass, ModelElementCS csElement) {
		Element pivotElement = csElement.getPivot();
		if (pivotElement == null) {
			return null;
		}
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			logger.error("Pivot '" + pivotElement.getClass().getName() + "' element is not a '" + pivotClass.getName() + "'"); //$NON-NLS-1$
			return null;
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
		return castElement;
	}

	public PivotManager getPivotManager() {
		return pivotManager;
	}

	public Resource getPivotResource(Resource csResource) {
		return cs2pivotResourceMap.get(csResource);
	}

	public Collection<? extends Resource> getPivotResources() {
		return cs2pivotResourceMap.values();
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

	protected List<TemplateBindingCS> getTemplateBindings(ElementCS csElement) {
		List<TemplateBindingCS> csTemplateBindings;
//		EObject container = csElement.eContainer();
//		if (container instanceof ElementCS) {			
//			csTemplateBindings = getTemplateBindings((ElementCS) container);
//		}
//		else {
			csTemplateBindings = new ArrayList<TemplateBindingCS>();
//		}
		if (csElement instanceof TemplateBindableElementCS) {
			TemplateBindableElementCS csTemplateableElement = (TemplateBindableElementCS)csElement;
			TemplateBindingCS csTemplateBinding = csTemplateableElement.getOwnedTemplateBinding();
			if (csTemplateBinding != null) {
				csTemplateBindings.add(csTemplateBinding);
			}
		}
		return csTemplateBindings;
	}
	
	protected List<TemplateSignature> getTemplateSignatures(Element pivotElement) {
		List<TemplateSignature> pivotTemplateSignatures;
		EObject container = pivotElement.eContainer();
		if (container instanceof Element) {			
			pivotTemplateSignatures = getTemplateSignatures((Element) container);
		}
		else {
			pivotTemplateSignatures = new ArrayList<TemplateSignature>();
		}
		if (pivotElement instanceof TemplateableElement) {
			TemplateableElement templateableElement = (TemplateableElement)pivotElement;
			TemplateSignature templateSignature = templateableElement.getOwnedTemplateSignature();
			if (templateSignature != null) {
				pivotTemplateSignatures.add(templateSignature);
			}
		}
		return pivotTemplateSignatures;
	}

/*	protected List<TemplateSignatureCS> getTemplateSignatures(ElementCS csElement) {
		List<TemplateSignatureCS> csTemplateSignatures;
		EObject container = csElement.eContainer();
		if (container instanceof ElementCS) {			
			csTemplateSignatures = getTemplateSignatures((ElementCS) container);
		}
		else {
			csTemplateSignatures = new ArrayList<TemplateSignatureCS>();
		}
		if (csElement instanceof TemplateableElementCS) {
			TemplateableElementCS csTemplateableElement = (TemplateableElementCS)csElement;
			TemplateSignatureCS csTemplateSignature = csTemplateableElement.getOwnedTemplateSignature();
			if (csTemplateSignature != null) {
				csTemplateSignatures.add(csTemplateSignature);
			}
		}
		return csTemplateSignatures;
	} */

	public void installPivotElement(ModelElementCS csElement, Element newPivotElement) {
		logger.trace("Installing " + csElement.getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
		EObject oldPivotElement = csElement.getPivot();
		if (newPivotElement == null) {
			if (!(csElement instanceof TemplateBindingCS)) {
				logger.warn("Missing new pivot element for " + csElement.getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
			}
		} else if (oldPivotElement == null) {
			csElement.setPivot(newPivotElement);
		} else if (oldPivotElement != newPivotElement) {
			if (oldPivotElement.eResource() != null) {
				logger.warn("Conflicting pivot element for " + csElement.getDescription()); //$NON-NLS-1$ //$NON-NLS-2$
			}
			else {
				csElement.setPivot(newPivotElement);
			}
		} else {
//			logger.info("Duplicate pivot element for " + csClassName + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * Queue a referencer for application of its Reference Pass during resolveReferences().
	 * @param csElement the referencer.
	 */
	public void queueDefiner(NamedElementCS csElement) {
		logger.trace("Queuing Definer " + csElement.eClass().getName() + " : " + csElement.getMoniker()); //$NON-NLS-1$ //$NON-NLS-2$
		if (queuedDefiners.contains(csElement)) {
			logger.info("Duplicate definer for " + csElement.eClass().getName() + " : " + csElement.getMoniker()); //$NON-NLS-1$ //$NON-NLS-2$
		}
		queuedDefiners.add(csElement);
	}

	/**
	 * Queue a referencer for application of its Reference Pass during resolveReferences().
	 * @param csElement the referencer.
	 */
	public void queueReferencer(ModelElementCS csElement) {
		logger.trace("Queuing Referencer " + csElement.getDescription()); //$NON-NLS-1$
		if (queuedReferencers.contains(csElement)) {
			logger.info("Duplicate unresolved referencer for " + csElement.getDescription()); //$NON-NLS-1$
		}
		queuedReferencers.add(csElement);
	}

	public void queueReferencers(List<? extends ModelElementCS> csElements) {
		for (ModelElementCS csElement : csElements) {
			queueReferencer(csElement);
		}
	}

	/**
	 * Queue a resolver for application of its Reference Pass during resolveReferences().
	 * @param csElement the referencer.
	 */
	public void queueResolver(ModelElementCS csElement) {
		logger.trace("Queuing Resolver " + csElement.getDescription()); //$NON-NLS-1$
		if (queuedResolvers.contains(csElement)) {
			logger.info("Duplicate unresolved resolver for " + csElement.getDescription()); //$NON-NLS-1$
		}
		queuedResolvers.add(csElement);
	}

	public Element referenceElement(EObject csElement) {
		EPackage ePackage = csElement.eClass().getEPackage();
		Pass referencePass = getSwitch(ePackage).getReferencePass();
		return referencePass.doInPackageSwitch(csElement);
	}

	public <T extends Element> T referenceElement(Class<T> pivotClass, EObject csElement) {
		Element element = referenceElement(csElement);
		if (!pivotClass.isAssignableFrom(element.getClass())) {
			throw new ClassCastException();
		}
		@SuppressWarnings("unchecked")
		T castElement = (T) element;
		return castElement;
	}

	public void referenceElements(List<? extends ElementCS> csElements) {
		if (csElements == null) {
			return;
		}
		for (ElementCS csElement : csElements) {
			referenceElement(csElement);
		}
	}

	public <T extends Element> void refreshList(Class<T> pivotClass, List<T> pivotElements, List<? extends MonikeredElementCS> csElements) {
		if (!pivotElements.isEmpty() ||!csElements.isEmpty()) {
			List<T> newPivotElements = new ArrayList<T>();
			for (MonikeredElementCS csElement : csElements) {
				String moniker = csElement.getMoniker();
				T pivotElement = getPivotElement(pivotClass, moniker);
				if (pivotElement != null) {
					newPivotElements.add(pivotElement);
				}
			}
			refreshList(pivotElements, newPivotElements);
		}
	}

	/**
	 * Return a pivotEClass instance cast to pivotClass registered for csElement.getMoniker().
	 * <p>An existing moniker element is re-used else an new instance is created.
	 * <p>The pivot element is installed as the original object of csElement. 
	 * @param <T>
	 * @param pivotClass
	 * @param pivotEClass
	 * @param csElement
	 * @return
	 */
	public <T extends MonikeredElement> T refreshMonikeredElement(Class<T> pivotClass, EClass pivotEClass, String moniker) {
		assert pivotClass == pivotEClass.getInstanceClass();
		assert moniker != null;
		MonikeredElement pivotElement = moniker2PivotMap.get(moniker);
		if (pivotElement == null) {
			logger.trace("Creating " + pivotEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
			pivotElement = (MonikeredElement) PivotFactory.eINSTANCE.create(pivotEClass);
			moniker2PivotMap.put(moniker, pivotElement);
		}
		else {
			assert !pivotElement.hasMoniker() || moniker.equals(pivotElement.getMoniker());
			logger.trace("Reusing " + pivotEClass.getName() + " : " + moniker); //$NON-NLS-1$ //$NON-NLS-2$
		}
		if (!pivotClass.isAssignableFrom(pivotElement.getClass())) {
			throw new ClassCastException();
		}
//		installPivotElement(csElement, pivotElement);
		@SuppressWarnings("unchecked")
		T castElement = (T) pivotElement;
//		refreshTemplateSignature1(castElement, csElement, true);
		return castElement;
	}

	public void refreshName(NamedElement pivotNamedElement, String newName) {
		String oldName = pivotNamedElement.getName();
		if ((newName != oldName) && ((newName == null) || !newName.equals(oldName))) {
			pivotNamedElement.setName(newName);
		}
	}
	
	public void refreshTemplateSignature(TemplateableElement pivotElement, TemplateableElementCS csElement, boolean isType) {		
		TemplateSignatureCS csTemplateSignature = csElement.getOwnedTemplateSignature();	
		TemplateSignature pivotTemplateSignature = pivotElement.getOwnedTemplateSignature();
		if (csTemplateSignature == null) {
			if (pivotTemplateSignature != null) {
				pivotElement.setOwnedTemplateSignature(null);			
			}
		}
		else {
			if (pivotTemplateSignature == null) {
//				pivotTemplateSignature = PivotFactory.eINSTANCE.createTemplateSignature();
				pivotTemplateSignature = refreshMonikeredElement(TemplateSignature.class, PivotPackage.Literals.TEMPLATE_SIGNATURE, csTemplateSignature.getMoniker());
				installPivotElement(csTemplateSignature, pivotTemplateSignature);
				pivotElement.setOwnedTemplateSignature(pivotTemplateSignature);			
			}
			if (isType) {
				declareElements(TemplateParameter.class, pivotTemplateSignature.getOwnedParameters(), csTemplateSignature.getOwnedTemplateParameter());
			}
			else {
				defineElements(TemplateParameter.class, pivotTemplateSignature.getOwnedParameters(), csTemplateSignature.getOwnedTemplateParameter());
			}
			queueReferencers(csTemplateSignature.getOwnedTemplateParameter());	// For type
		}
	}

//	@Deprecated
//	protected void registerPivotElement(NameableElementCS csElement, NameableElement newPivotElement) {
//		String moniker = csElement.getMoniker();
//		if (!registerPivotElement(moniker, newPivotElement)) {
//			logger.warn("Conflicting pivot registration for " + csElement.getDescription()); //$NON-NLS-1$
//		}
//	}

//	@Deprecated
//	protected boolean registerPivotElement(String moniker, NameableElement newPivotElement) {
//		NameableElement oldPivotElement = moniker2PivotMap.get(moniker);
//		if ((oldPivotElement != null) && (oldPivotElement != newPivotElement)) {
//			return false;
//		}
//		moniker2PivotMap.put(moniker, newPivotElement);
//		return true;
//	}

	/**
	 * Reset all the CS monikers for test purposes.
	 */
	public void resetCSMonikers() {
		for (Resource pivotResource : getCSResources()) {
			for (Iterator<EObject> it = pivotResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof MonikeredElementCSImpl) {
					((MonikeredElementCSImpl)eObject).resetMoniker();
				}
			}
		}
	}

	/**
	 * Reset all the pivot monikers for test purposes.
	 */
	public void resetPivotMonikers() {
		for (Resource pivotResource : getPivotResources()) {
			for (Iterator<EObject> it = pivotResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof MonikeredElementImpl) {
					((MonikeredElementImpl)eObject).resetMoniker();
				}
			}
		}
	}

	public void resolveActualParameter(TemplateParameterSubstitutionCS csElement) {
		TemplateBindingCS csTemplateBinding = csElement.getOwningTemplateBinding();
		int index = csTemplateBinding.getOwnedParameterSubstitution().indexOf(csElement);
		TemplateBindableElementCS csTemplateBindableElement = csTemplateBinding.getOwningTemplateBindableElement();
		TemplateableElement templateableElement = getPivotElement(TemplateableElement.class, csTemplateBindableElement);
		if (templateableElement != null) {
			TemplateSignature templateSignature = templateableElement.getOwnedTemplateSignature();
			if (templateSignature != null) {
				List<TemplateParameter> templateParameters = templateSignature.getOwnedParameters();
				if ((0 <= index) && (index < templateParameters.size())) {
					TemplateParameter templateParameter = templateParameters.get(index);
					installPivotElement(csElement, templateParameter);
		//			csElement.setActual(templateParameter);
			//		pivotElement.setActual(pivotActual);
							
			//		if (templateParameterSubstitution.getFormal() == csElement.get)
				}
			}
	/*		String moniker = csElement.getMoniker();
			TemplateParameterSubstitution pivotElement = getPivotElement(TemplateParameterSubstitution.class, moniker);
			if (pivotElement != null) {
				String actualArgumentMoniker = csElement.getOwnedActualParameter().getMoniker();
				ParameterableElement pivotActual = getPivotElement(ParameterableElement.class, actualArgumentMoniker);
				if (pivotActual != pivotElement.getActual()) {
					pivotElement.setActual(pivotActual);
				}
			} */
		}
		resolveElement(csElement.getOwnedActualParameter());
	}

	public Element resolveElement(ElementCS csElement) {
		if (csElement == null) {
			return null;
		}
		EPackage ePackage = csElement.eClass().getEPackage();
		Pass resolutionPass = getSwitch(ePackage).getResolutionPass();
		return resolutionPass.doInPackageSwitch(csElement);
	}

	public void resolveElements(List<? extends ElementCS> csElements) {
		if (csElements == null) {
			return;
		}
		for (ElementCS csElement : csElements) {
			resolveElement(csElement);
		}
	}

	/**
	 * Ensure that a OperationCS.parameters has a value.
	 * @param csElement
	 */
	public <T extends Operation> T resolveOperation(Class<T> pivotClass, OperationCS csElement) {
		for (ParameterCS csParameter : csElement.getOwnedIterator()) {
			resolveTypedElementType(csParameter);
		}
		for (ParameterCS csParameter : csElement.getOwnedAccumulator()) {
			resolveTypedElementType(csParameter);
		}
		for (ParameterCS csParameter : csElement.getOwnedParameter()) {
			resolveTypedElementType(csParameter);
		}
		T pivotElement = getPivotElement(pivotClass, csElement);
//		if (pivotElement != null) {
//			for (Parameter parameter : pivotElement.getOwnedParameters()) {
//				parameter.getType();
//			}
//		}
		return pivotElement;
	}

	public void resolveOperationCall(OperationCallExp pivotElement) {
		OclExpression sourceExpression = pivotElement.getSource();
		if (sourceExpression instanceof OperationCallExp) {
			resolveOperationCall((OperationCallExp) sourceExpression);		// FIXME not a special case
		}
		Type sourceType = resolveType(sourceExpression);
		String operator = pivotElement.getName();
		Operation pivotOperation;
		List<OclExpression> arguments = pivotElement.getArguments();
		if (arguments.isEmpty()) {
			pivotOperation = pivotManager.resolveOperation(sourceType, operator);
		}
		else {
			OclExpression argumentExpression = arguments.get(0);
			if (argumentExpression instanceof OperationCallExp) {
				resolveOperationCall((OperationCallExp) argumentExpression);
			}
			Type rightType = resolveType(argumentExpression);
			pivotOperation = pivotManager.resolveOperation(sourceType, operator, rightType);
		}
		if (pivotOperation == null) {
			logger.warn("Unresolved operation for '" + operator + "'");
		}
		pivotElement.setReferredOperation(pivotOperation);
		resolveType(pivotElement);
	}

	public void resolvePivotElement(MonikeredElementCS csElement) {
		logger.trace("Resolving " + csElement.getDescription()); //$NON-NLS-1$
		String moniker = csElement.getMoniker();
		MonikeredElement newPivotElement = getPivotElement(moniker);
		if (newPivotElement == null) {
			for (Resource resource : pivotManager.getExternalResources()) {
				Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(resource, pivotManager);
				newPivotElement = ecore2Pivot.getMoniker(moniker);
			}
		}
		if (newPivotElement == null) {
			logger.warn("No pivot element to resolve " + csElement.getDescription()); //$NON-NLS-1$
		}
		else {
			installPivotElement(csElement, newPivotElement);
		}
	}

	/**
	 * Ensure that a TypedElementCS.type has a value.
	 * @param csElement
	 */
	public TypedElement resolveTypedElementType(TypedElementCS csElement) {
		TypedElement pivotElement = getPivotElement(TypedElement.class, csElement);
		if (pivotElement == null) {
			String moniker = csElement.getMoniker();
			pivotElement = getPivotElement(TypedElement.class, moniker);
		}
		if (pivotElement == null) {
			return null;
		}
		TypedRefCS csTypedRef = csElement.getOwnedType();
		Type pivotType = getPivotElement(Type.class, csTypedRef);
		if (pivotType == null) {
			String typeMoniker = csTypedRef.getMoniker();
			pivotType = getPivotElement(Type.class, typeMoniker);
		}
		if (pivotType != pivotElement.getType()) {
			pivotElement.setType(pivotType);
		}
		resolveElement(csTypedRef);
		return pivotElement;
	}

	public Type resolveType(OclExpression expression) {
		ScopeAdapter scopeAdapter = AbstractScopeAdapter.getScopeAdapter(expression);
		Type type = scopeAdapter.getSynthesizedType();
		expression.setType(type);
		return type;
	}

	/**
	 * Update a list of TemplateBinding to match a list of TemplateSignature
	 * by moving/adding/removing existing entries. Once matched each TemplateBinding.signature
	 * references the corresponding TemplateSignature, and each TemplateBinding.parameterSubstitution.formal
	 * references the corresponding TemplateSignature.ownedParameter.
	 * 
	 * @param templateBindings
	 * @param templateSignatures
	 */
	protected void specializeTemplateBindings(List<TemplateBinding> templateBindings, List<TemplateSignature> templateSignatures, List<TemplateBindingCS> csTemplateBindings) {
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
//					installPivotElement(csTemplateBinding, templateBinding);
					break;
				}
			}
			if (templateBinding == null) {
//				templateBinding = refreshMonikeredElement(TemplateBinding.class, PivotPackage.Literals.TEMPLATE_BINDING, csTemplateBinding);
				templateBinding = PivotFactory.eINSTANCE.createTemplateBinding();
				templateBinding.setSignature(templateSignature);
				if (i < oldMax) {
					templateBindings.add(i, templateBinding);
				}
				else {
					templateBindings.add(templateBinding);					
				}
			}
			specializeTemplateParameterSubstitutions(templateBinding.getParameterSubstitutions(), templateSignature.getOwnedParameters(), csTemplateBinding.getOwnedParameterSubstitution());
			assert templateSignatures.get(i) == templateBindings.get(i).getSignature();
		}
		for (int k = templateBindings.size(); k > newMax; ) {
			templateBindings.remove(--k);
		}
		assert templateSignatures.size() == templateBindings.size();
	}

	/**
	 * Update a list of TemplateParameterSubstitution to match a list of TemplateParameter
	 * by moving/adding/removing existing entries. Once matched each TemplateParameterSubstitution.formal
	 * references the corresponding TemplateParameter.
	 * @param eList 
	 * 
	 * @param templateSignature
	 * @param templateBinding
	 */
	protected void specializeTemplateParameterSubstitutions(List<TemplateParameterSubstitution> templateParameterSubstitutions,
			List<TemplateParameter> templateParameters, List<TemplateParameterSubstitutionCS> csTemplateParameterSubstitutions) {
		int csIMax = csTemplateParameterSubstitutions.size();
		int pivotIMax = templateParameters.size();
		if (csIMax != pivotIMax) {
			logger.warn("Inconsistent template parameter substitutions size"); // FIXME + csTemplateParameterSubstitutions.get(0).getOwningTemplateBinding().getMoniker()); //$NON-NLS-1$
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
//				templateParameterSubstitution = refreshMonikeredElement(TemplateParameterSubstitution.class, PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION, csTemplateParameterSubstitution);
				templateParameterSubstitution = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
				templateParameterSubstitution.setFormal(templateParameter);
				if (i < oldMax) {
					templateParameterSubstitutions.add(i, templateParameterSubstitution);
				}
				else {
					templateParameterSubstitutions.add(templateParameterSubstitution);
				}
			}
//			queueResolver(csTemplateParameterSubstitution);		// To resolve actuals
			assert templateParameters.get(i) == templateParameterSubstitutions.get(i).getFormal();
		}
		for (int k = templateParameterSubstitutions.size(); k > newMax; ) {
			templateParameterSubstitutions.remove(--k);
		}
		assert templateParameters.size() == templateParameterSubstitutions.size();
	}

	protected void specializeTemplates(Map<TemplateableElement, Set<TemplateableElement>> specializations, TemplateBindableElementCS csElement) {
		TemplateBindingCS ownedTemplateBinding = csElement.getOwnedTemplateBinding();
		assert ownedTemplateBinding != null;
		TemplateableElement unspecializedPivotElement = ((ParameterizedTypeRefCS)csElement).getType();		// FIXME cast
		String moniker = csElement.getMoniker();
		logger.trace("Specializing " + moniker); //$NON-NLS-1$
//		TemplateableElement unspecializedPivotElement = getPivotElement(TemplateableElement.class, csTemplateableElement.getMoniker());
		if (unspecializedPivotElement == null) {
			logger.error("Nothing to specialize as " + moniker); //$NON-NLS-1$
			return;
		}
		//
		//	Refresh the pivot specialization root
		//
		TemplateableElement specializedPivotElement = getPivotElement(TemplateableElement.class, moniker);
		if (specializedPivotElement == null) {
//			if (csTemplateableElement instanceof ClassCS) {
			if (unspecializedPivotElement instanceof Type) {
//				ClassCS csClass = (ClassCS) csTemplateableElement;
				org.eclipse.ocl.examples.pivot.Class pivotClass = refreshMonikeredElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, csElement.getMoniker());
				installPivotElement(csElement, pivotClass);
				refreshName(pivotClass, ((Type)unspecializedPivotElement).getName());
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
		List<TemplateBindingCS> csTemplateBindings = getTemplateBindings(csElement);
		specializeTemplateBindings(templateBindings, templateSignatures, csTemplateBindings);
		//
		//	Cache the pivot specialization
		//
		Set<TemplateableElement> specializationList = specializations.get(unspecializedPivotElement);
		if (specializationList == null) {
			specializationList = new HashSet<TemplateableElement>();
			specializations.put(unspecializedPivotElement, specializationList);
		}
		specializationList.add(specializedPivotElement);
	}

	/**
	 * Sequence the update passes to make the pivot match the CS.
	 */
	public void update() {
		System.out.println("----------------------------------Declarers------------------------------");
		updateDeclarers();
		System.out.println("----------------------------------Definers------------------------------");
		updateDefiners();
		System.out.println("----------------------------------Referencers------------------------------");
		updateReferencers();
		System.out.println("----------------------------------Specializations------------------------------");
		updateSpecializations();
		// Need to resolve all 'definition' references before other references
		System.out.println("----------------------------------Resolvers------------------------------");
		updateResolvers();
		System.out.println("----------------------------------------------------------------");
		
		for (Resource csResource : getCSResources()) {
			Resource pivotResource = cs2pivotResourceMap.get(csResource);
			PivotManager.setMonikerAsID(Collections.singletonList(pivotResource));	// FIXME purge
		}
		
/*		Map<String, MonikeredElementCS> moniker2CSMap = computeMoniker2CSMap(getCSResources());
		Set<String> allMonikers = new HashSet<String>(moniker2PivotMap.keySet());
		allMonikers.addAll(moniker2CSMap.keySet());
		List<String> sortedMonikers = new ArrayList<String>(allMonikers);
		Collections.sort(sortedMonikers);
		for (String moniker : sortedMonikers) {
			MonikeredElementCS csElement = moniker2CSMap.get(moniker);
			MonikeredElement element = moniker2PivotMap.get(moniker);
			StringBuffer s = new StringBuffer();
			s.append(moniker);
			s.append(" <==> ");
			if (csElement != null) {
				s.append(csElement.eClass().getName());
				s.append("@");
				s.append(csElement.hashCode());
			}
			else {
				s.append("<<null>>");
			}
			s.append(" <==> ");
			if (element != null) {
				s.append(element.eClass().getName());
				s.append("@");
				s.append(element.hashCode());
			}
			else {
				s.append("<<null>>");
			}
			System.out.println(s.toString());
		} */	
	}

	public void updateDeclarers() {
		for (Resource csResource : getCSResources()) {
			aliasMap.clear();
			Resource pivotResource = cs2pivotResourceMap.get(csResource);
			List<? super Element> pivotContents = pivotResource.getContents();
			List<? extends EObject> csContents = csResource.getContents();
			declareElements(Element.class, pivotContents, csContents);
			AliasAdapter.getAdapter(pivotResource).refreshMap(aliasMap);
		}
	}

	public void updateDefiners() {
		for (ModelElementCS csElement : queuedDefiners) {
			logger.trace("Defining " + csElement.getDescription());  //$NON-NLS-1$
			defineElement(csElement);
		}
		queuedDefiners.clear();
	}

	public void updateReferencers() {
		for (ModelElementCS csElement : queuedReferencers) {
			logger.trace("Referencing " + csElement.getDescription());  //$NON-NLS-1$
			referenceElement(csElement);
		}
		queuedReferencers.clear();
	}

	/**
	 * Apply the Reference Pass to all queuedReferencers. 
	 */
	public void updateResolvers() {
		for (ModelElementCS csElement : queuedResolvers) {
			logger.trace("Resolving " + csElement.getDescription());  //$NON-NLS-1$//$NON-NLS-2$
			resolveElement(csElement);
		}	
		queuedResolvers.clear();
	}

	/**
	 * Build the map of required specializations per templateable element and then update
	 * each templateableElement to have these specializations.
	 */
	public void updateSpecializations() {
		Map<TemplateableElement, Set<TemplateableElement>> specializations = new HashMap<TemplateableElement, Set<TemplateableElement>>();
//		for (TemplateBindableElementCS specialization : queuedSpecializations.values()) {
//			specializeTemplates(specializations, specialization);
//		}
		for (TemplateBindingCS csTemplateBinding : queuedBindings) {
//		specializeTemplates(specializations, specialization);
			TemplateBindableElementCS specialization = csTemplateBinding.getOwningTemplateBindableElement();
			String moniker = specialization.getMoniker();
//			logger.trace("Queuing Specialization " + moniker); //$NON-NLS-1$
//			queuedSpecializations.put(moniker, csElement);
			specializeTemplates(specializations, specialization);
			
		}
		queuedBindings.clear();
//		queuedSpecializations.clear();
		for (TemplateableElement csElement : specializations.keySet()) {
			TemplateableElement pivotElement = getPivotElement(TemplateableElement.class, csElement.getMoniker());
			List<TemplateableElement> pivotElements = pivotElement.getOwnedSpecializations();
			Set<TemplateableElement> newPivotElements = specializations.get(csElement);
			refreshSet(pivotElements, newPivotElements);
		}
	}
}