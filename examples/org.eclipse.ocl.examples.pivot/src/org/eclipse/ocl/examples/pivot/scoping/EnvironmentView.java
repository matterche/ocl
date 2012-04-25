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
 * $Id: EnvironmentView.java,v 1.19 2011/05/20 15:27:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.scoping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Model;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.util.Nameable;
import org.eclipse.ocl.examples.pivot.utilities.IllegalLibraryException;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * An EnvironmentView provides a selective view of the environment visible at
 * some CST node.
 * 
 * The selection corresponds to an Environment lookup method as defined by the
 * OCL specification computed in accordance with the the Inherited Attributes.
 * 
 * The selective view is normally for just the single name required by the
 * lookUp, but may be for all names when a Completion Assist is required.
 * 
 * The EnvironmentView is computed on demand, rather than cached, since only
 * small parts of the overall environment are needed and caches may not remain
 * valid for long given the rapid recreation of CST nodes that occurs while
 * editing.
 */
public class EnvironmentView
{
	private static final Logger logger = Logger.getLogger(EnvironmentView.class);

	protected final MetaModelManager metaModelManager;
	protected final EStructuralFeature reference;
	private EClassifier requiredType;
	protected final String name;

	private final Map<String, Object> contentsByName = new HashMap<String, Object>(); // Single
																						// EObject
																						// or
																						// List<EObject>
	private Map<EObject, Map<TemplateParameter, ParameterableElement>> templateBindings = null;

	private int contentsSize = 0; // Deep size of contentsByName;

	private List<ScopeFilter> matchers = null;	// Prevailing filters for matching
	private Set<ScopeFilter> resolvers = null;	// Successful filters for resolving

	public EnvironmentView(MetaModelManager metaModelManager, EStructuralFeature reference, String name) {
		this.metaModelManager = metaModelManager;
		this.reference = reference;
		this.requiredType = reference != null ? reference.getEType() : null;
		this.name = name;
	}

	public boolean accepts(EClass eClass) {
		return PivotUtil.conformsTo(requiredType, eClass);
	}

	public void addAllContents(Type forType, ScopeView scopeView, Type pivotClass, Boolean selectStatic, Set<Type> alreadyVisited) {
		addNamedElements(forType, metaModelManager.getLocalOperations(pivotClass, selectStatic));
		addNamedElements(forType, metaModelManager.getLocalProperties(pivotClass, selectStatic));
		alreadyVisited.add(pivotClass);
		for (Type superClass : metaModelManager.getSuperClasses(pivotClass)) {
			if (!alreadyVisited.contains(superClass)) {
				addAllContents(forType, scopeView, superClass, selectStatic, alreadyVisited);
			}
		}
	}

	public void addAllProperties(Type type, Boolean selectStatic) {
		addAllProperties(type, type, selectStatic, new HashSet<Type>());
	}

	protected void addAllProperties(Type forType, Type pivotClass, Boolean selectStatic, Set<Type> alreadyVisited) {
		addNamedElements(metaModelManager.getLocalProperties(pivotClass, selectStatic));
		alreadyVisited.add(pivotClass);
		for (Type superClass : metaModelManager.getSuperClasses(pivotClass)) {
			if (!alreadyVisited.contains(superClass)) {
				addAllProperties(forType, superClass, selectStatic, alreadyVisited);
			}
		}
	}

	/**
	 * Add an element with an elementName to the view
	 * 
	 * @param elementName
	 *            name of element
	 * @param element
	 *            the element
	 * @return the number of elements added; 1 if added, 0 if not
	 */
	public int addElement(String elementName, EObject element) {
		return addElement(elementName, null, element);
	}
	public int addElement(String elementName, Type forType, EObject element) {
		if (element == null) {
			return 0;
		}
		if (elementName == null) {
			return 0;
		}
		element = metaModelManager.getPrimaryElement(element);
		if ((name != null) && !name.equals(elementName)) {
			return 0;
		}
		if ((name != null) && (matchers != null)) {
			for (ScopeFilter filter : matchers) {
				if (!filter.matches(this, forType, element)) {
					return 0;
				}
			}
		}
		if (requiredType != null) {
			if (!requiredType.isInstance(element)) {
				return 0;
			}
		}
		if (matchers != null) {
			if (resolvers == null) {
				resolvers = new HashSet<ScopeFilter>();
			}
			resolvers.addAll(matchers);
		}
		Object value = contentsByName.get(elementName);
		if (value == element) {
			;	// Already present
		} else if (value == null) {
			contentsByName.put(elementName, element);
			contentsSize++;
		} else {
			List<EObject> values;
			if (value instanceof EObject) {
				values = new ArrayList<EObject>();
				values.add((EObject) value);
				contentsByName.put(elementName, values);
			} else {
				@SuppressWarnings("unchecked")
				List<EObject> castValue = (List<EObject>) value;
				values = castValue;
			}
			if (!values.contains(element)) {
				values.add(element);
				contentsSize++;
			}
		}
		return 1;
	}

	public int addElements(Iterable<? extends EObject> elements) {
		return addElements(null, elements);
	}

	public int addElements(Type forType, Iterable<? extends EObject> elements) {
		int additions = 0;
		if (elements != null) {
			for (EObject element : elements) {
				if (element instanceof Nameable) {
					Nameable namedElement = (Nameable) element;
					additions += addElement(namedElement.getName(), forType, namedElement);
				}
			}
		}
		return additions;
	}

	public void addElementsOfScope(Element element, ScopeView scopeView) {
		if (element != null) {
			element = PivotUtil.getLowerBound(element);
			Attribution attribution = PivotUtil.getAttribution(element);
			if (attribution != null) {
				attribution.computeLookup(element, this, scopeView);
			}
		}
	}

	public void addFilter(ScopeFilter filter) {
		if (matchers == null) {
			matchers = new ArrayList<ScopeFilter>();
		}
		matchers.add(filter);
	}

	public void addImportedElement(URI baseURI) {
		if (baseURI != null) {
	    	if (PivotUtil.isPivotURI(baseURI)) {
	    		baseURI = PivotUtil.getNonPivotURI(baseURI);
	    	}
	    	if (baseURI != null) {
	    		String name = getName();
				if (name != null) {
					URI uri = URI.createURI(name).resolve(baseURI);
					try {
						Element importedElement = metaModelManager.loadResource(uri, null, null);				
						addElement(name, importedElement);
					} catch (Exception e) {
						// if it doesn't load just treat it as unresolved
					}
				}
	    	}
		}
	}

	public void addInheritedContents(org.eclipse.ocl.examples.pivot.Class target, ScopeView scopeView) {
		List<Type> superClasses = target.getSuperClass();
		if (superClasses.size() > 0) {
			for (Type superClass : superClasses) {
					addElementsOfScope(superClass, scopeView);
			}
		}
		else {
			Type libType = metaModelManager.getAnyClassifierType();
			addLibContents(libType, scopeView);
		}
	}

	public void addLibContents(Type libType, ScopeView scopeView) {
		if (libType == null) {
			return;
		}
		addElementsOfScope(libType, scopeView);
		for (Type superClass : libType.getSuperClass()) {
			addLibContents(superClass, scopeView);
		}
	}

	public int addNamedElement(Nameable namedElement) {
		return addNamedElement(null, namedElement);
	}

	public int addNamedElement(Type forType, Nameable namedElement) {
		if (namedElement != null) {
			return addElement(namedElement.getName(), forType, namedElement);
		}
		return 0;
	}

	public int addNamedElements(Iterable<? extends Nameable> namedElements) {
		return addNamedElements(null, namedElements);
	}

	public int addNamedElements(Type forType, Iterable<? extends Nameable> namedElements) {
		int additions = 0;
		if (namedElements != null) {
			for (Nameable namedElement : namedElements) {
				additions += addElement(namedElement.getName(), forType, namedElement);
			}
		}
		return additions;
	}

	public void addRootPackages() {
		for (org.eclipse.ocl.examples.pivot.Package pPackage : metaModelManager.getPackageManager().getAllPackages()) {
			if (pPackage instanceof Model) {
				addElements(pPackage.getNestedPackage());
			}
			else {
				String nsURI = pPackage.getNsURI();
				if (nsURI != null) {
					addElement(nsURI, pPackage);
				}
			}
		}
	}

	public int computeLookups(Element target, EObject child, EStructuralFeature containmentFeature, EReference targetReference) {
		Attribution attribution = PivotUtil.getAttribution(target);
		ScopeView pivotScopeView = new PivotScopeView(metaModelManager, target, attribution, child, containmentFeature, targetReference);
		return computeLookups(pivotScopeView);
	}
	
	public int computeLookups(ScopeView aScope) {
		try {
			while ((aScope != null) && !hasFinalResult()) {
				Attribution aAttribution = aScope.getAttribution();
				if (aAttribution == null) {
					break;					// The NULLSCOPEVIEW
				}
				EObject aTarget = aScope.getTarget();
				aScope = aAttribution.computeLookup(aTarget, this, aScope);
			}
		}
		catch (IllegalLibraryException e) {
			throw e;
		}
		catch (Exception e) {
			logger.warn("Lookup of '" + name + "' failed", e);
		}
		return resolveDuplicates();
	}

	public EObject getContent() {
		if (contentsSize == 0) {
			return null;
		}
		if (contentsSize != 1) {
			logger.warn("Unhandled ambiguous content for '" + name + "'");
		}
		for (Map.Entry<String, Object> entry : contentsByName.entrySet()) {
			Object value = entry.getValue();
			if (value instanceof List<?>) {
				List<?> values = (List<?>) value;
				value = values.get(values.size() - 1);
			}
			if (value instanceof EObject) {
				return (EObject) value;
			}
		}
		return null;
	}

	public Set<Map.Entry<String, Object>> getEntries() {
		return contentsByName.entrySet();
	}

	public String getName() {
		return name;
	}

	public EStructuralFeature getReference() {
		return reference;
	}

	public EClassifier getRequiredType() {
		return requiredType;
	}

	public int getSize() {
		return contentsSize;
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	/**
	 * Return true once the EnvironmentView has accumulated sufficient results
	 * to satisfy the lookup criterion for which it was created. i.e. any result
	 * for a non-null name, all results for a null name.
	 */
	public boolean hasFinalResult() {
		if (contentsSize == 0) {
			return false; // Not thing found is not a final result
		}
		if (getName() == null) {
			return false; // No name means search full hierarchy
		}
		return true;
	}

	public void removeFilter(ScopeFilter filter) {
		if (matchers != null) {
			matchers.remove(filter);
		}
	}

	public int resolveDuplicates() {
		if ((contentsSize > 1) && (resolvers != null) && (getName() != null)) {
			int newSize = 0;
			for (Map.Entry<String, Object> entry : contentsByName.entrySet()) {
				Object value = entry.getValue();
				if (value instanceof List<?>) {
					@SuppressWarnings("unchecked")
					List<EObject> values = (List<EObject>) value;
					for (ScopeFilter filter : resolvers) {
						for (int i = 0; i < values.size()-1;) {
							EObject reference = values.get(i);
							Map<TemplateParameter, ParameterableElement> referenceBindings = templateBindings != null ? templateBindings.get(reference) : null;
							for (int j = i + 1; j < values.size();) {
								EObject candidate = values.get(j);
								Map<TemplateParameter, ParameterableElement> candidateBindings = templateBindings != null ? templateBindings.get(candidate) : null;
								int verdict = filter.compareMatches(reference, referenceBindings, candidate, candidateBindings);
								if (verdict == 0) {
									j++;
								} else if (verdict < 0) {
									values.remove(i);
									reference = null;
									break;
								} else {
									values.remove(j);
									candidate = null;
								}
							}
							if (reference != null) {
								i++;
							}
						}
					}
					newSize += values.size();
				} else {
					newSize++;
				}
			}
			contentsSize = newSize;
		}
		return getSize();
	}

	public void setBindings(EObject eObject, Map<TemplateParameter, ParameterableElement> bindings) {
		if (templateBindings == null) {
			templateBindings = new HashMap<EObject, Map<TemplateParameter, ParameterableElement>>();
		}
		templateBindings.put(eObject, bindings);
	}

	public void setRequiredType(EClassifier requiredType) {
		assert PivotUtil.conformsTo(reference.getEType(), requiredType);
		this.requiredType = requiredType;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (reference != null) {
			s.append(reference.getName());
			s.append(" : "); //$NON-NLS-1$
//			s.append(reference.getEType().getName());
		}
		if (requiredType != null) {
			s.append(requiredType.getName());
		}
		s.append(" \""); //$NON-NLS-1$
		if (name != null) {
			s.append(name);
		}
		s.append("\" {"); //$NON-NLS-1$
		String prefix = ""; //$NON-NLS-1$
		for (String contentName : contentsByName.keySet()) {
			s.append(prefix);
			s.append(contentName);
			Object content = contentsByName.get(contentName);
			if (content instanceof List<?>) {
				s.append("*");
				s.append(((List<?>) content).size());
			}
			prefix = ","; //$NON-NLS-1$
		}
		s.append("}"); //$NON-NLS-1$
		return s.toString();
	}
}