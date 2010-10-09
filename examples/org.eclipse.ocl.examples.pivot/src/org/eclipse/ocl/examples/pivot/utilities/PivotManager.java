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
 * $Id: PivotManager.java,v 1.1.2.3 2010/10/09 20:09:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.examples.pivot.CompleteClass;
import org.eclipse.ocl.examples.pivot.CompletePackage;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeUtil;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;

/**
 * A PivotManager adapts a ResourceSet to provide facilities for the pivot model.
 * <p>
 * An PivotURI entry is maintained for each non-null EPackage.nsURI to facilitate
 * lookup, detect duplicates, and domain (Ecore/UML - Pivot - CS) mappings. 
 * <p>
 * An PivotPrefix entry is maintained for each non-null EPackage.nsPrefix to facilitate
 * alias generation for monikers. 
 */
public class PivotManager implements Adapter, StandardLibrary
{
	/**
	 * 'Highest' precedence first
	 */
	public static class PrecedenceComparator implements Comparator<Precedence>
	{
		public static final PrecedenceComparator INSTANCE = new PrecedenceComparator();

		public int compare(Precedence o1, Precedence o2) {
			return o2.getOrder().compareTo(o1.getOrder());	// NB least positive is hioghest precedence
		}
	}

	private static final Logger logger = Logger.getLogger(PivotManager.class);

//	public static final String OMG_OCL_LANG1 = "omg.ocl.lang";
//	public static final String OMG_OCL_STDLIB1 = "omg.ocl.stdlib";
	/**
	 * The URI used by default for the MDT/OCL Standard Library.
	 * NB. This constant is repeated in GenersateOCLstdlibModel.mwe2 an
	 * in org.eclipse.ocl.examples.library/plugin.xml.
	 */
	public static final String DEFAULT_OCL_STDLIB_URI = "http://www.eclipse.org/ocl/3.1.0/OCL.oclstdlib";

	public static Map<String, MonikeredElement> computeMoniker2PivotMap(Collection<? extends Resource> pivotResources) {
		Map<String, MonikeredElement> map = new HashMap<String, MonikeredElement>();
		for (Resource pivotResource : pivotResources) {
			for (Iterator<EObject> it = pivotResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof MonikeredElement) {
					MonikeredElement nameableElement = (MonikeredElement) eObject;
					String moniker = nameableElement.getMoniker();
					assert moniker != null;
					map.put(moniker, nameableElement);
				}
			}
		}
		return map;
	}	
	
	public static PivotManager findAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		List<Adapter> eAdapters = resourceSet.eAdapters();
		return (PivotManager) EcoreUtil.getAdapter(eAdapters, PivotManager.class);
	}

	public static PivotManager getAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		List<Adapter> eAdapters = resourceSet.eAdapters();
		PivotManager adapter = (PivotManager) EcoreUtil.getAdapter(eAdapters, PivotManager.class);
		if (adapter != null) {
			return adapter;
		}
		adapter = new PivotManager(resourceSet);
		eAdapters.add(adapter);
		return adapter;
	}

	/**
	 * Install the moniker of each nameable pivot element as its xmi:id.
	 * @param pivotResources
	 */
	public static void setMonikerAsID(Collection<? extends Resource> resources) {
		for (Resource resource : resources) {
			if (resource instanceof XMLResource) {
				XMLResource xmlResource = (XMLResource) resource;
				for (Iterator<EObject> it = resource.getAllContents(); it.hasNext(); ) {
					EObject eObject = it.next();
					if (eObject instanceof MonikeredElement) {
						String moniker = ((MonikeredElement)eObject).getMoniker();
						String id = moniker.replaceAll("<", "&lt;");	// Workaround for Bug 322704 //$NON-NLS-1$ //$NON-NLS-2$
						xmlResource.setID(eObject, id);
					}
					else if (eObject instanceof TemplateParameter) {
						String moniker = ((TemplateParameter)eObject).getParameteredElement().getMoniker() + ".";
						String id = moniker.replaceAll("<", "&lt;");	// Workaround for Bug 322704 //$NON-NLS-1$ //$NON-NLS-2$
						xmlResource.setID(eObject, id);
					}
				}
			}
			else {
				logger.warn("Resource '" + resource.getURI() + "' is not an XMLResource");  //$NON-NLS-1$//$NON-NLS-2$
			}
		}
	}

	/**
	 * The URI to provide the default Standard Library. This value may be reassigned
	 * pior to any OCL analysis or evaluation to select a different default. Alternatively
	 * the need for default may be bypassed by explicitly invoking loadLibrary().
	 */
	protected String defaultStandardLibraryURI = DEFAULT_OCL_STDLIB_URI;

	protected final ResourceSet pivotResourceSet;
	protected final CompleteEnvironmentManager completeEnvironmentManager = new CompleteEnvironmentManager(this);

	protected Map<URI,Resource> externalResources = null;
	protected ResourceSet externalResourceSet = null;
//	protected final Map<String, PivotURIEntry> uriMap = new HashMap<String, PivotURIEntry>();
//	protected final Map<String, PivotPrefixEntry> prefixMap = new HashMap<String, PivotPrefixEntry>();
	private Map<String, Type> nameToLibraryTypeMap = null;
	
	/**
	 * Map of precedence name to precedence objects. Multiple precedence objects may be associated
	 * with a single name since alternate controbutions provide independent lists that must be
	 * successfully interleaved so that all same-named precedence objects get the same compiled ordering.
	 * <p>
	 * e.g. <tt> precedence A B D</tt> and <tt>precedence B C D</tt> merge to <tt>A B C D</tt>
	 * with duplicate precedence objects for B and D.
	 */
	private Map<String, List<Precedence>> nameToPrecedencesMap = null;

	private Map<String, String> infixToPrecedenceNameMap = null;
	private Map<String, String> prefixToPrecedenceNameMap = null;
	
	private boolean allowExplanatoryInvalids = false;
	
	private Type booleanType = null;
	private Type classifierType = null;
	private Type integerType = null;
	private Type invalidType = null;
	private InvalidLiteralExp invalidValue = null;
	private Type nullType = null;
	private NullLiteralExp nullValue = null;
	private Type realType = null;
	private Type stringType = null;
	private Type tupleType = null;
	private Type unlimitedNaturalType = null;
	private UnlimitedNaturalLiteralExp unlimitedValue = null;
	
	public PivotManager() {
		this(new ResourceSetImpl());
		pivotResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl()); //$NON-NLS-1$
	}
	
	public PivotManager(ResourceSet pivotResourceSet) {
		this.pivotResourceSet = pivotResourceSet;
		pivotResourceSet.eAdapters().add(this);
	}

	protected void compileLibraryOperation(Operation operation) {
		Precedence precedence = operation.getPrecedence();
		if (precedence != null) {
			List<Parameter> parameters = operation.getOwnedParameters();
			if (parameters.size() == 0) {
				String newName = precedence.getName();
				String operatorName = operation.getName();
				String oldName = prefixToPrecedenceNameMap.put(operatorName, newName);
				if ((oldName != null) && !oldName.equals(newName)) {
					logger.warn("Conflicting precedences for prefix operation '" + operatorName + "'");
				}
			}
			else if (parameters.size() == 1) {
				String newName = precedence.getName();
				String operatorName = operation.getName();
				String oldName = infixToPrecedenceNameMap.put(operatorName, newName);
				if ((oldName != null) && !oldName.equals(newName)) {
					logger.warn("Conflicting precedences for infix operation '" + operatorName + "'");
				}
			}
		}
	}
	
	protected void compileLibraryPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : pivotPackage.getNestedPackages()) {
			compileLibraryPackage(nestedPackage);
		}
		for (Type type : pivotPackage.getOwnedTypes()) {
			compileLibraryType(type);
		}
	}

	protected void compileLibraryType(Type pivotType) {
		String name = pivotType.getName();
		Type oldType = nameToLibraryTypeMap.put(name, pivotType);
		if ((oldType != null) && (oldType != pivotType)) {
			logger.warn("Conflicting pivot type '" + name + "'");
		}
		if (pivotType instanceof org.eclipse.ocl.examples.pivot.Class) {
			for (Operation operation : ((org.eclipse.ocl.examples.pivot.Class)pivotType).getOwnedOperations()) {
				compileLibraryOperation(operation);
			}
		}
	}

	/**
	 * Interleave the ownedPrecedences of the rootPackages to establish a merged
	 * ordering and assign the index in that ordering to each rootPackages.ownedPrecedences.
	 * Any incinsistent ordering and associativity is diagnosed.
	 */
	public List<String> compilePrecedences(Collection<? extends org.eclipse.ocl.examples.pivot.Package> rootPackages) {
		List<String> errors = new ArrayList<String>();
		List<String> orderedPrecedences = new ArrayList<String>();
		nameToPrecedencesMap = new HashMap<String, List<Precedence>>();
		nameToLibraryTypeMap = new HashMap<String, Type>();
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
						index = prevIndex < 0 ? orderedPrecedences.size() : prevIndex+1;
						orderedPrecedences.add(index, name);
						list = new ArrayList<Precedence>();
						nameToPrecedencesMap.put(name, list);
					}
					else {
						list = nameToPrecedencesMap.get(name);
						if (index <= prevIndex) {
							errors.add("Inconsistent precedence ordering for '" + name + "'");
						}
						else if ((prevIndex >= 0) && (index != prevIndex+1)) {
							errors.add("Ambiguous precedence ordering for '" + name + "'");
						}
						if (precedence.getAssociativity() != list.get(0).getAssociativity()) {
							errors.add("Inconsistent precedence associativity for '" + name + "'");
						}
					}
					prevIndex = index;
					list.add(precedence);
				}
				if ((list != null) && (list.size() == 1) && (prevIndex != orderedPrecedences.size()-1)) {
					errors.add("Ambiguous precedence ordering for '" + name + "' at tail");
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

	public Collection<org.eclipse.ocl.examples.pivot.Package> computePivotRootPackages() {
		List<org.eclipse.ocl.examples.pivot.Package> rootPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		for (Resource pivotResource : pivotResourceSet.getResources()) {
			for (EObject eObject : pivotResource.getContents()) {
				if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
					rootPackages.add((org.eclipse.ocl.examples.pivot.Package)eObject);
				}
			}
		}
		return rootPackages;
	}


	public boolean conformsTo(Type firstType, Type secondType) {
		// TODO Auto-generated method stub
		return false;
	}

	public InvalidLiteralExp createInvalidValue(Object object, OclExpression expression, String reason, Throwable throwable) {
		if (!allowExplanatoryInvalids) {
			return getInvalidValue();
		}
		InvalidLiteralExp invalidValue = PivotFactory.eINSTANCE.createInvalidLiteralExp();
		invalidValue.setType(getInvalidType());
		invalidValue.setObject(object);
		invalidValue.setExpression(expression);
		invalidValue.setReason(reason);
		invalidValue.setThrowable(throwable);
		return invalidValue;
	}
	
	public Resource createResource(URI uri, String contentType) {
		// FIXME Convert URI to absolute
		return pivotResourceSet.createResource(uri, contentType);
	}

	public Type getBagType() {
		return getLibraryType("Bag", null);
	}

	public Type getBooleanType() {
		if (booleanType == null) {
			booleanType = getLibraryType("Boolean", null);
			if (booleanType == null) {
				logger.error("No Boolean type in OCL Standard Library");
			}
		}
		return booleanType;
	}
	
	public Type getClassifierType() {
		if (classifierType == null) {
			classifierType = getLibraryType("Classifier", null);
			if (classifierType == null) {
				logger.error("No Classifier type in OCL Standard Library");
			}
		}
		return classifierType;
	}
	
	public Type getCollectionType() {
		return getLibraryType("Collection", null);
	}

	public CompleteClass getCompleteClass(org.eclipse.ocl.examples.pivot.Class type) {
		return completeEnvironmentManager.getCompleteClass(type);
	}

	public CompleteEnvironmentManager getCompleteEnvironmentManager() {
		return completeEnvironmentManager;
	}

	public CompletePackage getCompletePackage(org.eclipse.ocl.examples.pivot.Package type) {
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
		return externalResources != null ? externalResources.values() : Collections.<Resource>emptySet();
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

	public Type getIntegerType() {
		if (integerType == null) {
			integerType = getLibraryType("Integer", null);
			if (integerType == null) {
				logger.error("No Integer type in OCL Standard Library");
			}
		}
		return integerType;
	}

	public Type getInvalidType() {
		if (invalidType == null) {
			invalidType = getLibraryType("OclInvalid", null);
			if (invalidType == null) {
				logger.error("No OclInvalid type in OCL Standard Library");
			}
		}
		return invalidType;
	}

	public InvalidLiteralExp getInvalidValue() {
		if (invalidValue == null) {
			invalidValue = PivotFactory.eINSTANCE.createInvalidLiteralExp();
			invalidValue.setType(getInvalidType());
		}
		return invalidValue;
	}

	public Type getLibraryType(String string, List<? extends TemplateableElement> templateBindings) {
		if (nameToLibraryTypeMap == null) {
			if (!loadDefaultLibrary(defaultStandardLibraryURI)) {
				nameToLibraryTypeMap = new HashMap<String, Type>();
			}
		}
		Type libraryType = nameToLibraryTypeMap.get(string);
		if (libraryType == null) {
			return null;
		}
		TemplateSignature templateSignature = libraryType.getOwnedTemplateSignature();
		if ((templateSignature == null) || templateSignature.getParameters().isEmpty()){
			if ((templateBindings == null) || templateBindings.isEmpty()) {
				return libraryType;
			}
			throw new IllegalArgumentException("Template bindings for non-template type");
		}
		if ((templateBindings == null) || (templateBindings.size() != templateSignature.getParameters().size())){
			throw new IllegalArgumentException("Incorrect template bindings for template type");
		}
		// FIXME find specialization
//		for (Resource resource : resourceSet.getResources()) {
//			URI uri = resource.getURI();
//		}
		return null;
	}

	public Type getNullType() {
		if (nullType == null) {
			nullType = getLibraryType("OclVoid", null);
			if (nullType == null) {
				logger.error("No OclVoid type in OCL Standard Library");
			}
		}
		return nullType;
	}

	public Object getNullValue() {
		if (nullValue  == null) {
			nullValue = PivotFactory.eINSTANCE.createNullLiteralExp();
			nullValue.setType(getNullType());
		}
		return nullValue;
	}

	public Type getOclAnyType() {
		return getLibraryType("OclAny", null);
	}

	public Type getOclMessageType() {
		return getLibraryType("OclMessage", null);
	}

	public Type getOrderedSetType() {
		return getLibraryType("OrderedSet", null);
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

	public String getPrefixPrecedenceName(String operatorName) {
		return prefixToPrecedenceNameMap.get(operatorName);
	}

	public Type getRealType() {
		if (realType == null) {
			realType = getLibraryType("Real", null);
			if (realType == null) {
				logger.error("No Real type in OCL Standard Library");
			}
		}
		return realType;
	}

	public Type getSequenceType() {
		return getLibraryType("Sequence", null);
	}

	public Type getSetType() {
		return getLibraryType("Set", null);
	}

	public Type getStringType() {
		if (stringType == null) {
			stringType = getLibraryType("String", null);
			if (stringType == null) {
				logger.error("No String type in OCL Standard Library");
			}
		}
		return stringType;
	}

	public Type getT() {
		throw new UnsupportedOperationException(getClass().getName() + ".getT");
	}

	public Type getT2() {
		throw new UnsupportedOperationException(getClass().getName() + ".getT2");
	}
	
	public ResourceSet getTarget() {
		return pivotResourceSet;
	}

	public Type getTupleType() {
		if (tupleType == null) {
			tupleType = getLibraryType("Tuple", null);
			if (tupleType == null) {
				logger.error("No Tuple type in OCL Standard Library");
			}
		}
		return tupleType;
	}

	public Type getTypeOfType(Object type) {
		// TODO Auto-generated method stub
		return null;
	}

	public Type getTypeOfValue(Object value, Type type) {
		if (value instanceof OclExpression) {
			return ((OclExpression)value).getType();
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
			return ((BigInteger)value).signum() >= 0 ? getUnlimitedNaturalType() : getIntegerType();
		}
		return getInvalidType();
	}

	public Type getUnlimitedNaturalType() {
		if (unlimitedNaturalType == null) {
			unlimitedNaturalType = getLibraryType("UnlimitedNatural", null);
			if (unlimitedNaturalType == null) {
				logger.error("No UnlimitedNatural type in OCL Standard Library");
			}
		}
		return unlimitedNaturalType;
	}

	public Object getUnlimitedValue() {
		if (unlimitedValue  == null) {
			unlimitedValue = PivotFactory.eINSTANCE.createUnlimitedNaturalLiteralExp();
		}
		return unlimitedValue;
	}

	public Object getValueOfValue(Object value) {
		if ((value instanceof Integer) || (value instanceof Long) || (value instanceof Short)) {
			return BigInteger.valueOf(((Number)value).longValue());
		}
		if ((value instanceof Float) || (value instanceof Double)) {
			return new BigDecimal(((Number)value).doubleValue());
		}
		return value;
	}
	
	public boolean isAdapterForType(Object type) {
		return type == PivotManager.class;
	}

	public boolean isAllowExplanatoryInvalids() {
		return allowExplanatoryInvalids;
	}

	protected boolean loadDefaultLibrary(String uri) {
		if (uri == null) {
			return false;
		}
		StandardLibraryContribution contribution = StandardLibraryContribution.REGISTRY.get(uri);
		if (contribution == null) {
			return false;
		}
		Resource resource = contribution.getResource();
		if (resource == null) {
			return false;
		}
		loadLibrary(resource);
		return true;
	}

	public void loadLibrary(Resource pivotResource) {
		pivotResourceSet.getResources().add(pivotResource);
		compilePrecedences(computePivotRootPackages());
	}

	public Element loadResource(URI uri, String alias) {
//		if (EPackage.Registry.INSTANCE.containsKey(resourceOrNsURI))
//			return EPackage.Registry.INSTANCE.getEPackage(resourceOrNsURI);
		try {
			ResourceSet resourceSet = getExternalResourceSet();
			Resource resource = resourceSet.getResource(uri.trimFragment(), true);
			if (resource != null) {
				if (externalResources == null) {
					externalResources = new HashMap<URI, Resource>();
				}
				externalResources.put(uri, resource);
				String fragment = uri.fragment();
				if (fragment == null) {
//					return null;				
					return Ecore2Pivot.importFromEcore(this, alias, resource);				
				}
				else {
					EObject eObject = resource.getEObject(fragment);			
					if (eObject instanceof Element) {
						return (Element) eObject;
					}
//					return null;				
					return Ecore2Pivot.importFromEcore(this, alias, eObject);
				}
			}
			logger.warn("Cannot load package with URI '" + uri + "'");
			return null;
		} catch(RuntimeException ex) {
			logger.error("Cannot load package with URI '" + uri + "'", ex);
			return null;
		}
	}

	public void notifyChanged(Notification msg) {
		// Do nothing.
	}
	
	public Operation resolveOperation(Type leftType, String operationName, Type... rightTypes) {
		if (!(leftType instanceof org.eclipse.ocl.examples.pivot.Class)) {
			return null;
		}
		List<Operation> candidateOperations = resolveOperations((org.eclipse.ocl.examples.pivot.Class)leftType, operationName, rightTypes);
		if (candidateOperations == null) {
			return null;
		}
		if (candidateOperations.size() > 1) {
			logger.warn("Ambiguous operation '" + operationName + "'");
		}
		return candidateOperations.get(0);
	}

	public List<Operation> resolveOperations(org.eclipse.ocl.examples.pivot.Class pivotClass,
			String operationName, Type... pivotArguments) {
		List<Operation> pivotOperations = null;
		for (Operation pivotOperation : pivotClass.getOwnedOperations()) {
			if (operationName.equals(pivotOperation.getName())) {
				List<Parameter> pivotParameters = pivotOperation.getOwnedParameters();
				if (pivotArguments.length == pivotParameters.size()) {
					boolean typesConform = true;
					for (int i = 0; i < pivotArguments.length; i++) {
						Type argumentType = pivotArguments[i];
						Parameter pivotParameter = pivotParameters.get(i);
						Type parameterType = pivotParameter.getType();
						if (!TypeUtil.conformsToType(argumentType, parameterType)) {
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
			for (org.eclipse.ocl.examples.pivot.Class superClass : pivotClass.getSuperClasses()) {
				List<Operation> superOperations = resolveOperations(superClass, operationName, pivotArguments);
				if (superOperations != null) {
					if (pivotOperations == null) {
						pivotOperations = superOperations;
					}
					else {
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

	public List<Precedence> getSortedPrecedences(Collection<Precedence> unsortedPrecedences) {
//		if (nameToPrecedencesMap == null) {
//			compilePrecedences(computePivotRootPackages());
//		}
		List<Precedence> precedences = new ArrayList<Precedence>(unsortedPrecedences);
/*		for (String operatorName : infixOperatorNames) {
			String precedenceName = infixToPrecedenceNameMap.get(operatorName);
			if (precedenceName == null) {
				logger.warn("No precedence for operator '" + operatorName + "'");
			}
			else {
				List<Precedence> precedence = nameToPrecedencesMap.get(precedenceName);
				if (precedence == null) {
					logger.warn("No precedence for precedence '" + precedenceName + "'");
				}
				else {
					precedences.add(precedence.get(0));
				}
			}
		} */
		Collections.sort(precedences, new PrecedenceComparator());
		return precedences;
	}

	public void setAllowExplanatoryInvalids(boolean allowExplanatoryInvalids) {
		this.allowExplanatoryInvalids = allowExplanatoryInvalids;
	}
}