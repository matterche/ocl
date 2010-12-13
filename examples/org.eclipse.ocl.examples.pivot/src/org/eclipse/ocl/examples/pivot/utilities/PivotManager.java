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
 * $Id: PivotManager.java,v 1.1.2.6 2010/12/13 08:14:55 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.examples.pivot.CompleteClass;
import org.eclipse.ocl.examples.pivot.CompletePackage;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeUtil;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;
import org.eclipse.ocl.examples.pivot.values.Bag;

/**
 * A PivotManager adapts a ResourceSet to provide facilities for the pivot
 * model.
 * <p>
 * An PivotURI entry is maintained for each non-null EPackage.nsURI to
 * facilitate lookup, detect duplicates, and domain (Ecore/UML - Pivot - CS)
 * mappings.
 * <p>
 * An PivotPrefix entry is maintained for each non-null EPackage.nsPrefix to
 * facilitate alias generation for monikers.
 */
public class PivotManager extends PivotStandardLibrary implements Adapter
{
	/**
	 * A PivotManager.NoDefaultLibrary should be used when the OCL standard
	 * library is loaded as a pivot resource. This may be achieved by associating
	 * it with the ResourceSet used to load Ecore/UML/Concrete Syntax models
	 * before any such models are accessed via a PivotManager.
	 * <pre>
	 * 	PivotManager pivotManager =  new PivotManager.NoDefaultLibrary();
	 *	CS2PivotResourceSetAdapter.getAdapter(resourceSet, pivotManager);
	 * </pre>
	 */
	public static class NoDefaultLibrary extends PivotManager
	{
		public NoDefaultLibrary() {
			StandardLibraryContribution.REGISTRY.put(DEFAULT_OCL_STDLIB_URI, StandardLibraryContribution.NULL);
		}
	}

	private static final Logger logger = Logger.getLogger(PivotManager.class);

	// public static final String OMG_OCL_LANG1 = "omg.ocl.lang";
	// public static final String OMG_OCL_STDLIB1 = "omg.ocl.stdlib";

	public static PivotManager findAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		return PivotUtil.getAdapter(PivotManager.class, resourceSet);
	}

	public static PivotManager getAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		List<Adapter> eAdapters = resourceSet.eAdapters();
		PivotManager adapter = PivotUtil.getAdapter(PivotManager.class, eAdapters);
		if (adapter == null) {
			adapter = new PivotManager(resourceSet);
			eAdapters.add(adapter);
		}
		return adapter;
	}

	public static void initializePivotResourceSet(ResourceSet pivotResourceSet) {
		Registry resourceFactoryRegistry = pivotResourceSet.getResourceFactoryRegistry();
		Map<String, Object> contentTypeToFactoryMap = resourceFactoryRegistry.getContentTypeToFactoryMap();
		contentTypeToFactoryMap.put(PivotResource.CONTENT_TYPE, new PivotResourceFactoryImpl()); //$NON-NLS-1$
		Map<String, Object> extensionToFactoryMap = resourceFactoryRegistry.getExtensionToFactoryMap();
		extensionToFactoryMap.put("*", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		extensionToFactoryMap.put(PivotResource.FILE_EXTENSION, new PivotResourceFactoryImpl()); //$NON-NLS-1$
		org.eclipse.emf.ecore.EPackage.Registry packageRegistry = pivotResourceSet.getPackageRegistry();
		packageRegistry.put(PivotPackage.eNS_URI, PivotPackage.eINSTANCE);
	}

	/**
	 * Install the moniker of each nameable pivot element as its xmi:id.
	 * 
	 * @param pivotResources
	 */
	public static void setMonikerAsID(Collection<? extends Resource> resources) {
		for (Resource resource : resources) {
			if (resource instanceof XMLResource) {
				XMLResource xmlResource = (XMLResource) resource;
				for (Iterator<EObject> it = resource.getAllContents(); it.hasNext();) {
					EObject eObject = it.next();
					if (eObject instanceof MonikeredElement) {
						String moniker = ((MonikeredElement) eObject).getMoniker();
						String id = moniker.replaceAll("<", "&lt;"); // Workaround for Bug 322704 //$NON-NLS-1$ //$NON-NLS-2$
						xmlResource.setID(eObject, id);
					} else if (eObject instanceof TemplateParameter) {
						String moniker = ((TemplateParameter) eObject).getParameteredElement().getMoniker() + ".";
						String id = moniker.replaceAll("<", "&lt;"); // Workaround for Bug 322704 //$NON-NLS-1$ //$NON-NLS-2$
						xmlResource.setID(eObject, id);
					}
				}
			} else {
				logger.warn("Resource '" + resource.getURI() + "' is not an XMLResource"); //$NON-NLS-1$//$NON-NLS-2$
			}
		}
	}

	protected final ResourceSet pivotResourceSet;
	protected org.eclipse.ocl.examples.pivot.Package pivotOrphans = null;

	protected final CompleteEnvironmentManager completeEnvironmentManager = new CompleteEnvironmentManager(this);

	protected Map<URI, Resource> externalResources = null;

	protected ResourceSet externalResourceSet = null;

	/**
	 * Map of precedence name to precedence objects. Multiple precedence objects
	 * may be associated with a single name since alternate controbutions
	 * provide independent lists that must be successfully interleaved so that
	 * all same-named precedence objects get the same compiled ordering.
	 * <p>
	 * e.g. <tt> precedence A B D</tt> and <tt>precedence B C D</tt> merge to
	 * <tt>A B C D</tt> with duplicate precedence objects for B and D.
	 */
	private Map<String, List<Precedence>> nameToPrecedencesMap = null;

	private Map<String, String> infixToPrecedenceNameMap = null;

	private Map<String, String> prefixToPrecedenceNameMap = null;

	public PivotManager() {
		this(new ResourceSetImpl());
		initializePivotResourceSet(pivotResourceSet);
	}

	public PivotManager(ResourceSet pivotResourceSet) {
		this.pivotResourceSet = pivotResourceSet;
		pivotResourceSet.eAdapters().add(this);
	}

	public void addOrphanType(Type pivotElement) {
		org.eclipse.ocl.examples.pivot.Package orphans = getOrphanPackage();
		orphans.getOwnedTypes().add(pivotElement);
	}

	protected void compileLibraryOperation(Operation operation) {
		Precedence precedence = operation.getPrecedence();
		if (precedence != null) {
			List<Parameter> parameters = operation.getOwnedParameters();
			if (parameters.size() == 0) {
				String newName = precedence.getName();
				String operatorName = operation.getName();
				String oldName = prefixToPrecedenceNameMap.put(operatorName,
					newName);
				if ((oldName != null) && !oldName.equals(newName)) {
					logger
						.warn("Conflicting precedences for prefix operation '"
							+ operatorName + "'");
				}
			} else if (parameters.size() == 1) {
				String newName = precedence.getName();
				String operatorName = operation.getName();
				String oldName = infixToPrecedenceNameMap.put(operatorName,
					newName);
				if ((oldName != null) && !oldName.equals(newName)) {
					logger.warn("Conflicting precedences for infix operation '"
						+ operatorName + "'");
				}
			}
		}
	}

	protected void compileLibraryPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : pivotPackage.getNestedPackages()) {
			compileLibraryPackage(nestedPackage);
		}
		for (Type type : pivotPackage.getOwnedTypes()) {
			if (type.getTemplateBindings().isEmpty()) {
				compileLibraryType(type);
			}
		}
	}

	protected void compileLibraryType(Type pivotType) {
		defineLibraryType(pivotType);
		if (pivotType instanceof org.eclipse.ocl.examples.pivot.Class) {
			for (Operation operation : ((org.eclipse.ocl.examples.pivot.Class) pivotType)
				.getOwnedOperations()) {
				compileLibraryOperation(operation);
			}
		}
	}

	/**
	 * Interleave the ownedPrecedences of the rootPackages to establish a merged
	 * ordering and assign the index in that ordering to each
	 * rootPackages.ownedPrecedences. Any inconsistent ordering and
	 * associativity is diagnosed.
	 */
	public List<String> compilePrecedences(
			Collection<? extends org.eclipse.ocl.examples.pivot.Package> rootPackages) {
		List<String> errors = new ArrayList<String>();
		List<String> orderedPrecedences = new ArrayList<String>();
		nameToPrecedencesMap = new HashMap<String, List<Precedence>>();
		infixToPrecedenceNameMap = new HashMap<String, String>();
		prefixToPrecedenceNameMap = new HashMap<String, String>();
		for (org.eclipse.ocl.examples.pivot.Package rootPackage : rootPackages) {
			List<Precedence> precedences = rootPackage.getOwnedPrecedences();
			if (precedences.size() > 0) {
				compileLibraryPackage(rootPackage);
				int prevIndex = -1;
				List<Precedence> list = null;
				String name = null;
				for (Precedence precedence : precedences) {
					name = precedence.getName();
					int index = orderedPrecedences.indexOf(name);
					if (index < 0) {
						index = prevIndex < 0
							? orderedPrecedences.size()
							: prevIndex + 1;
						orderedPrecedences.add(index, name);
						list = new ArrayList<Precedence>();
						nameToPrecedencesMap.put(name, list);
					} else {
						list = nameToPrecedencesMap.get(name);
						if (index <= prevIndex) {
							errors.add("Inconsistent precedence ordering for '"
								+ name + "'");
						} else if ((prevIndex >= 0) && (index != prevIndex + 1)) {
							errors.add("Ambiguous precedence ordering for '"
								+ name + "'");
						}
						if (precedence.getAssociativity() != list.get(0)
							.getAssociativity()) {
							errors
								.add("Inconsistent precedence associativity for '"
									+ name + "'");
						}
					}
					prevIndex = index;
					list.add(precedence);
				}
				if ((list != null) && (list.size() == 1)
					&& (prevIndex != orderedPrecedences.size() - 1)) {
					errors.add("Ambiguous precedence ordering for '" + name
						+ "' at tail");
				}
			}
		}
		for (int i = 0; i < orderedPrecedences.size(); i++) {
			String name = orderedPrecedences.get(i);
			BigInteger order = BigInteger.valueOf(i);
			for (Precedence precedence : nameToPrecedencesMap.get(name)) {
				precedence.setOrder(order);
			}
		}
		return errors;
	}

	public Map<String, MonikeredElement> computeMoniker2PivotMap(
			Collection<? extends Resource> pivotResources) {
		Map<String, MonikeredElement> map = new HashMap<String, MonikeredElement>();
		for (Resource pivotResource : pivotResources) {
			for (Iterator<EObject> it = pivotResource.getAllContents(); it.hasNext();) {
				EObject eObject = it.next();
				if ((eObject instanceof MonikeredElement) && (eObject != pivotOrphans)) {
					MonikeredElement newElement = (MonikeredElement) eObject;
					String moniker = newElement.getMoniker();
					assert moniker != null;
					MonikeredElement oldElement = map.get(moniker);
					if (oldElement == null) {
						map.put(moniker, newElement);
					}
					else {
						boolean newIsInOrphanage = isInOrphanage(newElement);
						boolean oldIsInOrphanage = isInOrphanage(oldElement);
						assert oldIsInOrphanage != newIsInOrphanage;
						if (newIsInOrphanage) {
							map.put(moniker, newElement);
						}
					}
				}
			}
		}
		return map;
	}

	public Collection<org.eclipse.ocl.examples.pivot.Package> computePivotRootPackages() {
		List<org.eclipse.ocl.examples.pivot.Package> rootPackages =
			new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		for (Resource pivotResource : pivotResourceSet.getResources()) {
			for (EObject eObject : pivotResource.getContents()) {
				if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
					rootPackages.add((org.eclipse.ocl.examples.pivot.Package) eObject);
				}
			}
		}
		return rootPackages;
	}

	public boolean conformsTo(Type firstType, Type secondType) {
		return TypeUtil.conformsToType(firstType, secondType);
	}

	public Resource createResource(URI uri, String contentType) {
		// FIXME Convert URI to absolute
		URI pivotURI = uri.appendFileExtension(PivotResource.FILE_EXTENSION);
		Resource pivotResource = pivotResourceSet.createResource(pivotURI, contentType);
// Putting this in URIMap redirects save to the mapped URI.
//		pivotResourceSet.getURIConverter().getURIMap().put(pivotURI, uri);
		return pivotResource;
	}

	public Type getCollectionType(Type collectionType, Type elementType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Type getCommonSuperType(Type firstType, Type secondType) {
		return TypeUtil.getCommonSuperType(firstType, secondType);
	}

	public CompleteClass getCompleteClass(
			org.eclipse.ocl.examples.pivot.Class type) {
		return completeEnvironmentManager.getCompleteClass(type);
	}

	public CompleteEnvironmentManager getCompleteEnvironmentManager() {
		return completeEnvironmentManager;
	}

	public CompletePackage getCompletePackage(
			org.eclipse.ocl.examples.pivot.Package type) {
		return completeEnvironmentManager.getCompletePackage(type);
	}

	public ResourceSet getExternalResourceSet() {
		if (externalResourceSet == null) {
			externalResourceSet = new ResourceSetImpl();
		}
		return externalResourceSet;
	}

	public String getDefaultStandardLibraryURI() {
		return defaultStandardLibraryURI;
	}

	public Collection<Resource> getExternalResources() {
		return externalResources != null
			? externalResources.values()
			: Collections.<Resource> emptySet();
	}

	public Precedence getInfixPrecedence(String operatorName) {
		if (infixToPrecedenceNameMap == null) {
			compilePrecedences(computePivotRootPackages());
		}
		String precedenceName = infixToPrecedenceNameMap.get(operatorName);
		if (precedenceName == null) {
			return null;
		}
		List<Precedence> precedences = nameToPrecedencesMap.get(precedenceName);
		if (precedences == null) {
			return null;
		}
		return precedences.get(0);
	}

	public Type getLibraryType(String string, List<? extends ParameterableElement> templateArguments) {
		Type libraryType = getRequiredLibraryType(string);
		if (libraryType == null) {
			return null;
		}
		TemplateSignature templateSignature = libraryType.getOwnedTemplateSignature();
		List<TemplateParameter> templateParameters = templateSignature != null ? templateSignature.getParameters() : Collections.<TemplateParameter>emptyList();
		if (templateParameters.isEmpty()) {
			if ((templateArguments == null) || templateArguments.isEmpty()) {
				return libraryType;
			}
			throw new IllegalArgumentException(
				"Template bindings for non-template type");
		}
		int iMax = templateParameters.size();
		if ((templateArguments == null) || (templateArguments.size() != iMax)) {
			throw new IllegalArgumentException(
				"Incorrect template bindings for template type");
		}
		Pivot2Moniker s = new Pivot2Moniker(null);
		s.appendElement((Element) libraryType.eContainer());
		s.append(PivotConstants.SCOPE_SEPARATOR);
		s.append(libraryType.getName());
		s.appendTemplateArguments(templateArguments);
		String moniker = s.toString();
		List<Type> ownedSpecializations = getOrphanPackage().getOwnedTypes();
		for (Type ownedSpecialization : ownedSpecializations) {
			if (ownedSpecialization.getMoniker().equals(moniker)) {
				return ownedSpecialization;
			}
		}
		Type specialization = PivotFactory.eINSTANCE.createClass();
		specialization.setName(string);
		TemplateBinding templateBinding = PivotFactory.eINSTANCE.createTemplateBinding();
		templateBinding.setSignature(templateSignature);
		for (int i = 0; i < iMax; i++) {
			TemplateParameterSubstitution templateParameterSubstitution = PivotFactory.eINSTANCE.createTemplateParameterSubstitution();
			templateParameterSubstitution.setFormal(templateParameters.get(i));
			templateParameterSubstitution.setActual(templateArguments.get(i));
			templateBinding.getParameterSubstitutions().add(templateParameterSubstitution);
		}
		specialization.getTemplateBindings().add(templateBinding);
		ownedSpecializations.add(specialization);
		String specializedMoniker = specialization.getMoniker();
		assert moniker.equals(specializedMoniker);
		return specialization;
	}

	public org.eclipse.ocl.examples.pivot.Package getOrphanPackage() {
		if (pivotOrphans == null) {
			pivotOrphans = PivotFactory.eINSTANCE.createPackage();
			pivotOrphans.setName(PivotConstants.ORPHANAGE_NAME);
			URI uri = URI.createURI(PivotConstants.ORPHANAGE_URI);
			Resource orphanage = pivotResourceSet.createResource(uri);
			orphanage.getContents().add(pivotOrphans);
		}
		return pivotOrphans;
	}

	public ResourceSet getPivotResourceSet() {
		return pivotResourceSet;
	}

	public Precedence getPrefixPrecedence(String operatorName) {
		if (prefixToPrecedenceNameMap == null) {
			compilePrecedences(computePivotRootPackages());
		}
		String precedenceName = prefixToPrecedenceNameMap.get(operatorName);
		if (precedenceName == null) {
			return null;
		}
		List<Precedence> precedences = nameToPrecedencesMap.get(precedenceName);
		if (precedences == null) {
			return null;
		}
		return precedences.get(0);
	}

	// public String getPrefixPrecedenceName(String operatorName) {
	// return prefixToPrecedenceNameMap.get(operatorName);
	// }

	public ResourceSet getTarget() {
		return pivotResourceSet;
	}

	public Type getTypeOfType(Object type) {
		// TODO Auto-generated method stub
		return null;
	}

	public Type getTypeOfValue(Object value, Type type) {
		if (value instanceof OclExpression) {
			return ((OclExpression) value).getType();
		}
		if (value instanceof Boolean) {
			return getBooleanType();
		}
		if (value instanceof String) {
			return getStringType();
		}
		if (value instanceof BigDecimal) {
			return getRealType();
		}
		if (value instanceof BigInteger) {
			return ((BigInteger) value).signum() >= 0
				? getUnlimitedNaturalType()
				: getIntegerType();
		}
		if (value instanceof Collection) {
			if (value instanceof Bag<?>) {
				return getBagType();
			}
			if (value instanceof LinkedHashSet<?>) {
				return getOrderedSetType();
			}
			if (value instanceof List<?>) {
				return getSequenceType();
			}
			if (value instanceof Set<?>) {
				return getSetType();
			}
			return getCollectionType();
		}
		return type;
	}

	public Object getValueOfValue(Object value) {
		if ((value instanceof Integer) || (value instanceof Long)
			|| (value instanceof Short)) {
			return BigInteger.valueOf(((Number) value).longValue());
		}
		if ((value instanceof Float) || (value instanceof Double)) {
			return new BigDecimal(((Number) value).doubleValue());
		}
		return value;
	}

	public boolean isAdapterForType(Object type) {
		return type == PivotManager.class;
	}

	protected boolean isInOrphanage(EObject eObject) {
		for (EObject eContainer = eObject; eContainer != null; eContainer = eContainer.eContainer()) {
			if (eContainer == pivotOrphans) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Resource loadDefaultLibrary(String uri) {
		if (uri == null) {
			return null;
		}
		StandardLibraryContribution contribution = StandardLibraryContribution.REGISTRY.get(uri);
		if (contribution == null) {
			return null;
		}
		Resource resource = contribution.getResource();
//		if (resource == null) {
//			return null;
//		}
		loadLibrary(resource);
		return resource;
	}

	public void loadLibrary(Resource pivotResource) {
		if (pivotResource != null) {
			pivotResourceSet.getResources().add(pivotResource);
		}
		compilePrecedences(computePivotRootPackages());
	}

	public Element loadResource(URI uri, String alias) {
		// if (EPackage.Registry.INSTANCE.containsKey(resourceOrNsURI))
		// return EPackage.Registry.INSTANCE.getEPackage(resourceOrNsURI);
		try {
			Resource resource;
			URI resourceURI = uri.trimFragment();
			String resourceURIstring = resourceURI.toString();
			if (resourceURIstring.equals(defaultStandardLibraryURI)) {
				resource = loadDefaultLibrary(resourceURIstring);
			}
			else {
				StandardLibraryContribution contribution = StandardLibraryContribution.REGISTRY.get(resourceURIstring);
				if (contribution != null) {
					resource = contribution.getResource();
				}
				else {
					ResourceSet resourceSet = getExternalResourceSet();
					resource = resourceSet.getResource(resourceURI, true);
					if (resource != null) {
						if (externalResources == null) {
							externalResources = new HashMap<URI, Resource>();
						}
						externalResources.put(uri, resource);
					}
				}
			}
			if (resource != null) {
				String fragment = uri.fragment();
				if (fragment == null) {
					// return null;
					return Ecore2Pivot.importFromEcore(this, alias, resource);
				} else {
					EObject eObject = resource.getEObject(fragment);
					if (eObject instanceof Element) {
						return (Element) eObject;
					}
					// return null;
					return Ecore2Pivot.importFromEcore(this, alias, eObject);
				}
			}
			logger.warn("Cannot load package with URI '" + uri + "'");
			return null;
		} catch (RuntimeException ex) {
			logger.error("Cannot load package with URI '" + uri + "'", ex);
			return null;
		}
	}

	public void notifyChanged(Notification msg) {
		// Do nothing.
	}

	public Operation resolveOperation(Type leftType, String operationName,
			Type... rightTypes) {
		if (!(leftType instanceof org.eclipse.ocl.examples.pivot.Class)) {
			return null;
		}
		List<Operation> candidateOperations = resolveOperations(
			(org.eclipse.ocl.examples.pivot.Class) leftType, operationName,
			rightTypes);
		if (candidateOperations == null) {
			return null;
		}
		if (candidateOperations.size() > 1) {
			logger.warn("Ambiguous operation '" + operationName + "'");
		}
		return candidateOperations.get(0);
	}

	public List<Operation> resolveOperations(
			org.eclipse.ocl.examples.pivot.Class pivotClass,
			String operationName, Type... pivotArguments) {
		List<Operation> pivotOperations = null;
		for (Operation pivotOperation : pivotClass.getOwnedOperations()) {
			if (operationName.equals(pivotOperation.getName())) {
				List<Parameter> pivotParameters = pivotOperation
					.getOwnedParameters();
				if (pivotArguments.length == pivotParameters.size()) {
					boolean typesConform = true;
					for (int i = 0; i < pivotArguments.length; i++) {
						Type argumentType = pivotArguments[i];
						Parameter pivotParameter = pivotParameters.get(i);
						Type parameterType = pivotParameter.getType();
						if (!TypeUtil.conformsToType(argumentType,
							parameterType)) {
							typesConform = false;
							break;
						}
					}
					if (typesConform) {
						if (pivotOperations == null) {
							pivotOperations = new ArrayList<Operation>();
						}
						pivotOperations.add(pivotOperation);
					}
				}
			}
		}
		if (pivotOperations == null) {
			for (org.eclipse.ocl.examples.pivot.Class superClass : pivotClass
				.getSuperClasses()) {
				List<Operation> superOperations = resolveOperations(superClass,
					operationName, pivotArguments);
				if (superOperations != null) {
					if (pivotOperations == null) {
						pivotOperations = superOperations;
					} else {
						pivotOperations.addAll(superOperations);
					}
				}
			}
		}
		return pivotOperations;
	}

	public void setDefaultStandardLibraryURI(String defaultStandardLibraryURI) {
		this.defaultStandardLibraryURI = defaultStandardLibraryURI;
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == pivotResourceSet;
	}
}