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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.manager;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.DataType;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidType;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.LambdaType;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.TemplateBinding;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.TemplateParameterSubstitution;
import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.TemplateableElement;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.pivot.TypedMultiplicityElement;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.UnspecifiedType;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.VoidType;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.evaluation.CallableImplementation;
import org.eclipse.ocl.examples.pivot.library.ConstrainedOperation;
import org.eclipse.ocl.examples.pivot.library.ConstrainedProperty;
import org.eclipse.ocl.examples.pivot.library.ExplicitNavigationProperty;
import org.eclipse.ocl.examples.pivot.library.ImplicitCompositionProperty;
import org.eclipse.ocl.examples.pivot.library.ImplicitNonCompositionProperty;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;
import org.eclipse.ocl.examples.pivot.library.TuplePartProperty;
import org.eclipse.ocl.examples.pivot.library.UnimplementedOperation;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.model.OclMetaModel;
import org.eclipse.ocl.examples.pivot.uml.UML2Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.util.Nameable;
import org.eclipse.ocl.examples.pivot.utilities.CompleteElementIterable;
import org.eclipse.ocl.examples.pivot.utilities.External2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.IllegalLibraryException;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.pivot.utilities.PivotResource;
import org.eclipse.ocl.examples.pivot.utilities.PivotResourceFactoryImpl;
import org.eclipse.ocl.examples.pivot.utilities.PivotStandardLibrary;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.osgi.util.NLS;

public class MetaModelManager extends PivotStandardLibrary implements Adapter.Internal
{		
	public class CompleteTypeOperationsIterable extends CompleteElementIterable<Type, Operation>
	{
		protected final Boolean selectStatic;	// null for static/non-static, true for static, false for non-static
		
		public CompleteTypeOperationsIterable(Iterable<Type> types, Boolean selectStatic) {
			super(types);
			this.selectStatic = selectStatic;
		}

		@Override
		protected Iterable<Operation> getInnerIterable(Type model) {
			return ((org.eclipse.ocl.examples.pivot.Class)model).getOwnedOperations();
		}

		@Override
		protected Operation getInnerValue(Operation element) {
			if (selectStatic != null) {
				if (element.isStatic() != selectStatic.booleanValue()) {
					return null;
				}
			}
			return element;
		}
	}
	
	public class CompleteClassPropertiesIterable extends CompleteElementIterable<Type, Property>
	{
		protected final Boolean selectStatic;	// null for static/non-static, true for static, false for non-static
		
		public CompleteClassPropertiesIterable(Iterable<Type> types, Boolean selectStatic) {
			super(types);
			this.selectStatic = selectStatic;
		}

		@Override
		protected Iterable<Property> getInnerIterable(Type model) {
			return ((org.eclipse.ocl.examples.pivot.Class)model).getOwnedAttributes();
		}

		@Override
		protected Property getInnerValue(Property element) {
			if (selectStatic != null) {
				if (element.isStatic() != selectStatic.booleanValue()) {
					return null;
				}
			}
			return element;
		}
	}
	
	public class CompleteClassSuperClassesIterable
			extends CompleteElementIterable<Type, org.eclipse.ocl.examples.pivot.Class> {

		public CompleteClassSuperClassesIterable(Iterable<Type> types) {
			super(types);
		}

		@Override
		protected Iterable<org.eclipse.ocl.examples.pivot.Class> getInnerIterable(Type model) {
			return ((org.eclipse.ocl.examples.pivot.Class)model).getSuperClasses();
		}
	}

	public class CompleteElementConstraintsIterable
			extends CompleteElementIterable<NamedElement, Constraint> {

		public CompleteElementConstraintsIterable(Iterable<? extends NamedElement> models) {
			super(models);
		}

		@Override
		protected Iterable<Constraint> getInnerIterable(NamedElement model) {
			return model.getOwnedRules();
		}
	}

	public class CompletePackagePackagesIterable
		extends CompleteElementIterable<org.eclipse.ocl.examples.pivot.Package, org.eclipse.ocl.examples.pivot.Package> {
		
		public CompletePackagePackagesIterable(Iterable<org.eclipse.ocl.examples.pivot.Package> packages) {
			super(packages);
		}
		
		@Override
		protected Iterable<org.eclipse.ocl.examples.pivot.Package> getInnerIterable(org.eclipse.ocl.examples.pivot.Package model) {
			return model.getNestedPackages();
		}
	}
	
	public class CompletePackageTypesIterable
		extends CompleteElementIterable<org.eclipse.ocl.examples.pivot.Package, Type> {
		
		public CompletePackageTypesIterable(Iterable<org.eclipse.ocl.examples.pivot.Package> packages) {
			super(packages);
		}
		
		@Override
		protected Iterable<Type> getInnerIterable(org.eclipse.ocl.examples.pivot.Package model) {
			return model.getOwnedTypes();
		}
	}

	/**
	 * An OrphanServer maintains the set of OrphanClients identifying active references to an orphan element.
	 * When the final reference is removed the orphan is killed off.
	 *
	public static class OrphanServer
	{
		protected final Element element;
		private Set<OrphanClient> clients = null;
		
		public OrphanServer(Element element) {
			this.element = element;
		}

		public void addClient(OrphanClient client) {
			if (client != null) {
				if (clients == null) {
					clients = new HashSet<OrphanClient>();
				}
				clients.add(client);
			}			
		}

//		public Element getElement() {
//			return element;
//		}

		public void removeClient(OrphanClient client) {
			if (client != null) {
				if (clients != null) {
					clients.remove(client);
					if (clients.isEmpty()) {
						clients = null;
						element.eSet(element.eContainmentFeature(), null);
					}
				}
			}			
		}
		
		@Override
		public String toString() {
			return "<orphan-node> " + element;
		}
	} */
	
	/**
	 * An OrphanClient adapts an EObject with an eReference to an OrphanServer within the domina of a TypeCache.
	 * 
	 * Changes to eContainer and eReference cause the eReference to be activated and deactivated accordingly so that
	 * the OrphanServer is aware of how many active clients there are.
	 *
	public static class OrphanClient implements Adapter
	{
		protected final TypeCaches typeCache;
		protected final EObject target;
		protected final EReference eReference;
		private OrphanServer orphanServer;
		
		public OrphanClient(TypeCaches typeCache, EObject target, EReference eReference) {
			this.typeCache = typeCache;
			this.target = target;
			this.eReference = eReference;
			this.orphanServer = null;
			target.eAdapters().add(this);
		}

		protected void activate(NamedElement pivotElement) {
			orphanServer = null; // W I P typeCache.getOrphanServer(pivotElement);
			if (orphanServer != null) {
				orphanServer.addClient(this);
			}
		}

		protected void deActivate() {
			if (orphanServer != null) {
				orphanServer.removeClient(this);
				orphanServer = null;
			}
		}
		
		public Notifier getTarget() {
			return target;
		}

		public boolean isAdapterForType(Object type) {
			return type == OrphanClient.class;
		}

		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() == target) {
				int eventType = notification.getEventType();
				switch (eventType) {
					case Notification.SET: {
						Object oldValue = notification.getOldValue();
						Object newValue = notification.getNewValue();
						if (newValue != oldValue) {
							Object feature = notification.getFeature();
							if (feature == eReference) {
								if (oldValue != null) {
									deActivate();
								}
								if (newValue instanceof NamedElement) {
									activate((NamedElement) newValue);
								}
							}
							else if (feature == target.eContainmentFeature()) {
								if (oldValue != null) {
									deActivate();
								}
								if (newValue != null) {
									assert target == newValue;
									Object orphan = target.eGet(eReference);
									if (orphan instanceof NamedElement) {
										activate((NamedElement) orphan);
									}
								}
							}
						}
					}
				}
			}			
		}

		public void setTarget(Notifier newTarget) {
			assert (newTarget == null) || (newTarget == target);
		}		
	} */
	
	public static interface Factory	// FIXME Support this via an extension point
	{
		/**
		 * Return true if this factory can handle creatio of a Pivot resource from the
		 * available resource.
		 */
		boolean canHandle(Resource resource);
		
		/**
		 * Configure the MetaModelManager's external ResourceSet. Implementations may install
		 * any required extension or content to factory mappinmgs in the resource factory registry.
		 * @param resourceSet
		 */
		void configure(ResourceSet resourceSet);
		
		/**
		 * Return the root element in the Pivot resource resulting from import of the available
		 * resource. 
		 * @param uriFragment 
		 */
		Element importFromResource(MetaModelManager metaModelManager, Resource resource, String uriFragment);
	}
	
	private static Set<Factory> factoryMap = new HashSet<Factory>();
	
	public static void addFactory(Factory factory) {
		factoryMap.add(factory);
	}
	
	static {
		Ecore2Pivot.FACTORY.getClass();
		UML2Ecore2Pivot.FACTORY.getClass();
	}
	
	private static final Logger logger = Logger.getLogger(MetaModelManager.class);
	
//	private static WeakHashMap<MetaModelManager,Object> liveMetaModelManagers = new WeakHashMap<MetaModelManager,Object>();

	// public static final String OMG_OCL_LANG1 = "omg.ocl.lang";
	// public static final String OMG_OCL_STDLIB1 = "omg.ocl.stdlib";
/*	public static void disposeNotifier(Notifier notifier) {
		List<Adapter> adapters = notifier.eAdapters();
		for (int i = adapters.size(); i-- > 0; ) {
			Adapter adapter = adapters.get(i);
			if (adapter instanceof MetaModelManagedAdapter) {
				adapters.remove(adapter);
				((MetaModelManagedAdapter) adapter).dispose();
//					metaModelManager.debugRemoveAdapter(adapter);
			}
		}
	}

	public static void disposeResource(Resource resource) {
//		CacheAdapter.INSTANCE.clear(resource);
		for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			disposeNotifier(eObject);
		}
		disposeNotifier(resource);
	}

	public static void disposeResourceSet(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			disposeResource(resource);
		}
		disposeNotifier(resourceSet);
	} */

	public static MetaModelManager findAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		return PivotUtil.getAdapter(MetaModelManager.class, resourceSet);
	}

	public static MetaModelManager getAdapter(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return null;
		}
		List<Adapter> eAdapters = resourceSet.eAdapters();
		MetaModelManager adapter = PivotUtil.getAdapter(MetaModelManager.class, eAdapters);
		if (adapter == null) {
			adapter = new MetaModelManager(resourceSet);
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
	 * The known packages.
	 */
	private final PackageManager packageManager = createPackageManager();
	
	/**
	 * The known precedences.
	 */
	private PrecedenceManager precedenceManager = null;			// Lazily created
	
	/**
	 * The known tuple types.
	 */
	private TupleTypeManager tupleManager = null;			// Lazily created
	
	/**
	 * The known tuple types.
	 */
	private LambdaTypeManager lambdaManager = null;			// Lazily created

	/**
	 * Map from each merged type to the TypeTracker that supervises its merge (and its specializations). TypeTrackers are only
	 * created for merged or specialized types, so a missing entry just denotes a simple self-standing type. 
	 */
	private final Map<Type, TypeTracker> type2tracker = new HashMap<Type, TypeTracker>();
		
	private Resource orphanage = null;

	protected org.eclipse.ocl.examples.pivot.Package pivotMetaModel = null;

	private boolean libraryLoadInProgress = false;

	protected final ResourceSet pivotResourceSet;
	
	/**
	 * All Library packages imported into the current type managed domain. All libraries
	 * share the same URI, which for supplementary libraries may be null.
	 */
	protected final List<Library> pivotLibraries = new ArrayList<Library>();	

	/**
	 * The resource of the first of the pivotLibraries. Set once actually loaded.
	 */
	protected Resource pivotLibraryResource = null;

	protected ResourceSetImpl externalResourceSet = null;
	
	private final Map<String, Namespace> globalNamespaces = new HashMap<String, Namespace>();
	private final Set<Type> globalTypes = new HashSet<Type>();

	private int unspecifiedTypeCount = 0;
	
	/**
	 * Map of URI to external resource converter.
	 */
	private final Map<URI, External2Pivot> external2PivotMap = new HashMap<URI, External2Pivot>();
	
	/**
	 * Map of arbitrary user context to the associated URI used for the concrete syntax
	 * of an expression. The map is used by getResourceIdentifier to cache URIs for contexts
	 * that are not Elements. Any object may be used, possibly the OCL string itself,
	 * provided the object has exactly one associated OCL expression.
	 */
	private Map<Object,URI> uriMap = null;

	/**
	 * Elements protected from garbage collection
	 */
	private EAnnotation lockingAnnotation = null;
	
	/**
	 * ClassLoaders that may be able to load a library implementation.
	 */
	private List<ClassLoader> classLoaders = null;
	
	/**
	 * MetaModelManagerListener instances to be notified of significant state changes; most notably disposal.
	 */
	private List<MetaModelManagerListener> listeners = null;
	
	public MetaModelManager() {
		this(new ResourceSetImpl());
		initializePivotResourceSet(pivotResourceSet);
	}

	public MetaModelManager(ResourceSet pivotResourceSet) {
//		System.out.println("ctor " + this);
		this.pivotResourceSet = pivotResourceSet;
		pivotResourceSet.eAdapters().add(this);
//		liveMetaModelManagers.put(this, null);
//		System.out.println(Thread.currentThread().getName() + " Create " + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode())
//			+ " " + pivotResourceSet.getClass().getSimpleName() + "@" + Integer.toHexString(pivotResourceSet.hashCode()));		
	}

	public void addClassLoader(ClassLoader classLoader) {
		if (classLoaders == null) {
			classLoaders = new ArrayList<ClassLoader>();
		}
		if (!classLoaders.contains(classLoader)) {
			classLoaders.add(classLoader);
		}
	}

	public void addExternalResource(External2Pivot external2Pivot) {
		external2PivotMap.put(external2Pivot.getURI(), external2Pivot);
	}

	public Namespace addGlobalNamespace(String name, Namespace namespace) {
		return globalNamespaces.put(name, namespace);
	}

	public boolean addGlobalTypes(Collection<Type> types) {
		return globalTypes.addAll(types);
	}

	public void addListener(MetaModelManagerListener listener) {
		if (listeners == null) {
			listeners = new ArrayList<MetaModelManagerListener>();
		}
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void addLockedElement(Object lockedElement) {
		if (lockedElement instanceof EObject) {
			if (lockingAnnotation == null) {
				lockingAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			}
			List<EObject> lockingReferences = lockingAnnotation.getReferences();
			if (!lockingReferences.contains(lockedElement)) {
				lockingReferences.add((EObject) lockedElement);
			}
		}
	}
	
	public void addOrphanClass(Type pivotElement) {
		if (pivotElement.getUnspecializedElement() != null) {
			assert pivotElement.getUnspecializedElement().getUnspecializedElement() == null;
		}
		else {
			assert (pivotElement instanceof LambdaType)
				|| (pivotElement instanceof TupleType)
				|| (pivotElement instanceof UnspecifiedType);
		}
		getOrphanResource().getContents().add(pivotElement);
	}

	public void addPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		String nsURI = pivotPackage.getNsURI();
		org.eclipse.ocl.examples.pivot.Package primaryPackage = null;
		if (nsURI != null) {										// Explicit nsURI for explicit package (merge)
			primaryPackage = packageManager.get(nsURI);
		}
		else {
			String name = pivotPackage.getName();
			if (name != null) {										// Null nsURI can merge into same named package
				primaryPackage = packageManager.getByName(name);
			}
			if (primaryPackage == null) {							// Null URI distinct package, so invent a default nsURI
				nsURI = PivotUtil.getNsURI(pivotPackage);
				primaryPackage = packageManager.get(nsURI);
			}
		}
		if (primaryPackage != pivotPackage) {						// Skip recursive call
			if (primaryPackage != null) {
				PackageTracker packageTracker = getPackageTracker(primaryPackage);
				packageTracker.getPackageServer().addSecondaryPackage(pivotPackage);
			}
			else {
				packageManager.put(nsURI, pivotPackage);
			}
		}
	}

	void addPackageTracker(org.eclipse.ocl.examples.pivot.Package pivotPackage, PackageTracker packageTracker) {
		packageManager.addTracker(pivotPackage, packageTracker);
	}

	void addedPrimaryPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		String nsURI = PivotUtil.getNsURI(pivotPackage);
		org.eclipse.ocl.examples.pivot.Package primaryPackage = packageManager.get(nsURI);
		if (primaryPackage == pivotPackage) {
			// Recursive call
		}
		else if (primaryPackage != null) {
			throw new IllegalArgumentException("Duplicate nsURI '" + nsURI + "'");
		}
		else {
			packageManager.put(nsURI, pivotPackage);
		}
	}

	void addTypeTracker(Type pivotType, TypeTracker typeTracker) {
		assert type2tracker.put(pivotType, typeTracker) == null;
	}

	/**
	 * Return -ve if match1 is inferior to match2, +ve if match2 is inferior to match1, or
	 * zero if both matches are of equal validity.
	 */
	public int compareOperationMatches(Operation reference, Map<TemplateParameter, ParameterableElement> referenceBindings,
			Operation candidate, Map<TemplateParameter, ParameterableElement> candidateBindings) {
		if ((reference instanceof Iteration) && (candidate instanceof Iteration)) {
			int iteratorCountDelta = ((Iteration)candidate).getOwnedIterators().size() - ((Iteration)reference).getOwnedIterators().size();
			if (iteratorCountDelta != 0) {
				return iteratorCountDelta;
			}
			org.eclipse.ocl.examples.pivot.Class referenceType = PivotUtil.getFeaturingClass((Iteration)reference);
			org.eclipse.ocl.examples.pivot.Class candidateType = PivotUtil.getFeaturingClass((Iteration)candidate);
			Type specializedReferenceType = getSpecializedType(referenceType, referenceBindings);
			Type specializedCandidateType = getSpecializedType(candidateType, candidateBindings);
			if (referenceType != candidateType) {
				if (conformsTo(specializedReferenceType, specializedCandidateType, null)) {
					return 1;
				}
				else if (conformsTo(specializedCandidateType, specializedReferenceType, null)) {
					return -1;
				}
			}
		}
		return 0;
	}

	@Deprecated
	public boolean conformsTo(Type firstType, Type secondType) {
		return conformsTo(firstType, secondType, null);
	}

	public boolean conformsTo(Type firstType, Type secondType, Map<TemplateParameter, ParameterableElement> bindings) {
		if ((firstType == null) || (secondType == null)) {
			return false;
		}
		if (bindings != null) {
			TemplateParameter firstTemplateParameter = firstType.getOwningTemplateParameter();
			if (firstTemplateParameter != null) {
				ParameterableElement parameterableElement = bindings.get(firstTemplateParameter);
				if (parameterableElement instanceof Type) {
					firstType = (Type) parameterableElement;
				}
			}
			TemplateParameter secondTemplateParameter = secondType.getOwningTemplateParameter();
			if (secondTemplateParameter != null) {
				ParameterableElement parameterableElement = bindings.get(secondTemplateParameter);
				if (parameterableElement instanceof Type) {
					secondType = (Type) parameterableElement;
				}
				else if ((parameterableElement == null) && bindings.containsKey(secondTemplateParameter)) {
					bindings.put(secondTemplateParameter, firstType);
					return true;
				}
			}
		}
		if (firstType == secondType) {
			return true;
		}
//		firstType = getModelType(firstType);
//		secondType = getModelType(secondType);
		firstType = getPrimaryType(firstType);
		secondType = getPrimaryType(secondType);
		if (firstType == secondType) {
			return true;
		}
		if (secondType instanceof AnyType) {			// FIXME Shouldn't the library model definitions apply here too
			return true;
		}
		else if (firstType instanceof AnyType) {
			return false;
		}
		else if (firstType instanceof InvalidType) {
			return true;
		}
		else if (secondType instanceof InvalidType) {
			return false;
		}
		else if (firstType instanceof VoidType) {
			return true;
		}
		else if (secondType instanceof VoidType) {
			return false;
		}
		else if (firstType instanceof ClassifierType) {
			if (secondType instanceof ClassifierType) {
				return conformsToClassifierType((ClassifierType)firstType, (ClassifierType)secondType, bindings);
			}
			return false;
		}
		else if (firstType instanceof CollectionType) {
			if (secondType instanceof CollectionType) {
				return conformsToCollectionType((CollectionType)firstType, (CollectionType)secondType, bindings);
			}
			return false;
		}
		else if (firstType instanceof LambdaType) {
			if (secondType instanceof LambdaType) {
				return conformsToLambdaType((LambdaType)firstType, (LambdaType)secondType, bindings);
			}
			return false;
		}
		else if (firstType instanceof TupleType) {
			if (secondType instanceof TupleType) {
				return conformsToTupleType((TupleType)firstType, (TupleType)secondType, bindings);
			}
			return false;
		}
		else if (firstType instanceof org.eclipse.ocl.examples.pivot.Class) {
			if (secondType instanceof org.eclipse.ocl.examples.pivot.Class) {
				org.eclipse.ocl.examples.pivot.Class firstClass = (org.eclipse.ocl.examples.pivot.Class)firstType;
				org.eclipse.ocl.examples.pivot.Class secondClass = (org.eclipse.ocl.examples.pivot.Class)secondType;
				for (org.eclipse.ocl.examples.pivot.Class superClass : firstClass.getSuperClasses()) {
					if (conformsTo(superClass, secondClass, bindings)) {
						return true;
					}
				}
//				List<TemplateBinding> templateBindings = actualType.getTemplateBindings();
//				if (templateBindings.size() > 0) {
//					TemplateableElement template = PivotUtil.getUnspecializedTemplateableElement(actualType);
//					return conformsToClass((org.eclipse.ocl.examples.pivot.Class)template, requiredType);
//				}
			}
			return false;
		}
		else {
			return false;
		}
	}

	protected boolean conformsToClassifierType(ClassifierType firstType, ClassifierType secondType,
			Map<TemplateParameter, ParameterableElement> bindings) {
		Type firstElementType = firstType.getInstanceType();
		Type secondElementType = secondType.getInstanceType();
		if (bindings != null) {
			TemplateParameter firstTemplateParameter = firstElementType.getOwningTemplateParameter();
			if (firstTemplateParameter != null) {
				ParameterableElement parameterableElement = bindings.get(firstTemplateParameter);
				if (parameterableElement instanceof Type) {
					firstElementType = (Type) parameterableElement;
				}
			}
			TemplateParameter secondTemplateParameter = secondElementType.getOwningTemplateParameter();
			if (secondTemplateParameter != null) {
				ParameterableElement parameterableElement = bindings.get(secondTemplateParameter);
				if (parameterableElement instanceof Type) {
					secondElementType = (Type) parameterableElement;
				}
				else if ((parameterableElement == null) && bindings.containsKey(secondTemplateParameter)) {
					bindings.put(secondTemplateParameter, firstElementType);
					return true;
				}
			}
		}
		if (firstElementType instanceof UnspecifiedType) {
			Type lowerBound = ((UnspecifiedType)firstElementType).getLowerBound();
			if (conformsTo(secondElementType, lowerBound, bindings)) {
				((UnspecifiedType)firstElementType).setLowerBound(secondElementType);
				return true;
			}
			else {
				return false;
			}
		}
		else if (secondElementType instanceof UnspecifiedType) {
			Type upperBound = ((UnspecifiedType)secondElementType).getUpperBound();
			if (conformsTo(upperBound, firstElementType, bindings)) {
				((UnspecifiedType)secondElementType).setUpperBound(firstElementType);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return conformsTo(firstElementType, secondElementType, bindings);
		}
	}

	protected CallableImplementation computeOperationImplementation(Operation operation) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		CallableImplementation implementation = operation.getImplementation();
		String implementationClassName = operation.getImplementationClass();
		if (implementationClassName != null) {
			if ((implementation == null) || !implementation.getClass().getName().equals(implementationClassName)) {
				Class<?> theClass = Class.forName(implementationClassName);
				Field field = theClass.getField("INSTANCE");
				return (CallableImplementation) field.get(null);
			}
		}
		for (Constraint constraint : getLocalConstraints(operation)) {
			if (UMLReflection.BODY.equals(constraint.getStereotype())) {
				ValueSpecification specification = constraint.getSpecification();
				if (specification instanceof ExpressionInOcl) {
					return new ConstrainedOperation((ExpressionInOcl) specification);
				}
			}
		}
		return UnimplementedOperation.INSTANCE;
	}

	public Collection<org.eclipse.ocl.examples.pivot.Package> computePivotRootPackages() {
		Set<org.eclipse.ocl.examples.pivot.Package> rootPackages =
			new HashSet<org.eclipse.ocl.examples.pivot.Package>();
		if (pivotLibraryResource != null) {
			for (EObject eObject : pivotLibraryResource.getContents()) {
				if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
					rootPackages.add((org.eclipse.ocl.examples.pivot.Package) eObject);
				}
			}
		}
		for (Resource pivotResource : pivotResourceSet.getResources()) {
			for (EObject eObject : pivotResource.getContents()) {
				if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
					rootPackages.add((org.eclipse.ocl.examples.pivot.Package) eObject);
				}
			}
		}
		return rootPackages;
	}

	protected CallableImplementation computePropertyImplementation(Property property) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		CallableImplementation implementation = property.getImplementation();
		String implementationClassName = property.getImplementationClass();
		if (implementationClassName != null) {
			if ((implementation == null) || !implementation.getClass().getName().equals(implementationClassName)) {
				Class<?> theClass = Class.forName(implementationClassName);
				Field field = theClass.getField("INSTANCE");
				return (CallableImplementation) field.get(null);
			}
		}
		for (Constraint constraint : getLocalConstraints(property)) {
			if (UMLReflection.BODY.equals(constraint.getStereotype())) {
				ValueSpecification specification = constraint.getSpecification();
				if (specification instanceof ExpressionInOcl) {
					return new ConstrainedProperty((ExpressionInOcl) specification);
				}
			}
		}
		if (property.isImplicit()) {
			Property opposite = property.getOpposite();
			if (opposite.isComposite()) {
				return ImplicitCompositionProperty.INSTANCE;
			}
			else {
				return ImplicitNonCompositionProperty.INSTANCE;
			}
		}
		else if (property.getClass_() instanceof TupleType){
			return TuplePartProperty.INSTANCE;
		}
		else {
			return ExplicitNavigationProperty.INSTANCE;
		}
	}

	protected boolean conformsToLambdaType(LambdaType firstType, LambdaType secondType,
			Map<TemplateParameter, ParameterableElement> bindings) {
		throw new UnsupportedOperationException();
	}

	protected boolean conformsToCollectionType(CollectionType firstType, CollectionType secondType,
			Map<TemplateParameter, ParameterableElement> bindings) {
		CollectionType unspecializedFirstType = PivotUtil.getUnspecializedTemplateableElement(firstType);
		CollectionType unspecializedSecondType = PivotUtil.getUnspecializedTemplateableElement(secondType);
		if (!isSuperClassOf(unspecializedSecondType, unspecializedFirstType)) {
			return false;
		}
		Type firstElementType = firstType.getElementType();
		Type secondElementType = secondType.getElementType();
		if (bindings != null) {
			if (firstElementType != null) {
				TemplateParameter firstTemplateParameter = firstElementType.getOwningTemplateParameter();
				if (firstTemplateParameter != null) {
					ParameterableElement parameterableElement = bindings.get(firstTemplateParameter);
					if (parameterableElement instanceof Type) {
						firstElementType = (Type) parameterableElement;
					}
				}
			}
			if (secondElementType != null) {
				TemplateParameter secondTemplateParameter = secondElementType.getOwningTemplateParameter();
				if (secondTemplateParameter != null) {
					ParameterableElement parameterableElement = bindings.get(secondTemplateParameter);
					if (parameterableElement instanceof Type) {
						secondElementType = (Type) parameterableElement;
					}
					else if ((parameterableElement == null) && bindings.containsKey(secondTemplateParameter)) {
						bindings.put(secondTemplateParameter, firstElementType);
						return true;
					}
				}
			}
		}
		if (firstElementType instanceof UnspecifiedType) {
			Type lowerBound = ((UnspecifiedType)firstElementType).getLowerBound();
			if (conformsTo(secondElementType, lowerBound, bindings)) {
				((UnspecifiedType)firstElementType).setLowerBound(secondElementType);
				return true;
			}
			else {
				return false;
			}
		}
		else if (secondElementType instanceof UnspecifiedType) {
			Type upperBound = ((UnspecifiedType)secondElementType).getUpperBound();
			if (conformsTo(upperBound, firstElementType, bindings)) {
				((UnspecifiedType)secondElementType).setUpperBound(firstElementType);
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return conformsTo(firstElementType, secondElementType, bindings);
		}
	}

	protected boolean conformsToTupleType(TupleType actualType, TupleType requiredType,
			Map<TemplateParameter, ParameterableElement> bindings) {
		List<Property> actualProperties = actualType.getOwnedAttributes();
		List<Property> requiredProperties = requiredType.getOwnedAttributes();
		if (actualProperties.size() != requiredProperties.size()) {
			return false;
		}
		for (Property actualProperty : actualProperties) {
			Property requiredProperty = PivotUtil.getNamedElement(requiredProperties, actualProperty.getName());
			if (requiredProperty == null) {
				return false;
			}
			if (!conformsTo(actualProperty.getType(), requiredProperty.getType(), bindings)) {
				return false;
			}
		}
		return true;
	}

	public InvalidLiteralExp createInvalidExpression(/*Object object, String boundMessage, Throwable e*/) {
		InvalidLiteralExp invalidLiteralExp = PivotFactory.eINSTANCE.createInvalidLiteralExp();
		invalidLiteralExp.setType(getOclInvalidType());
//		invalidLiteralExp.setObject(object);
//		invalidLiteralExp.setReason(boundMessage);
//		invalidLiteralExp.setThrowable(e);
		return invalidLiteralExp;
	}

	protected LambdaTypeManager createLambdaManager() {
		return new LambdaTypeManager(this);
	}

	protected Resource createOrphanage(URI uri) {
		return pivotResourceSet.createResource(uri);
	}

	public org.eclipse.ocl.examples.pivot.Package createPackage(String string, String nsURI) {
		return createPackage(org.eclipse.ocl.examples.pivot.Package.class, PivotPackage.Literals.PACKAGE, string, nsURI);
	}

	public <T extends org.eclipse.ocl.examples.pivot.Package> T createPackage(Class<T> pivotClass,
			EClass pivotEClass, String name, String nsURI) {
		@SuppressWarnings("unchecked")
		T pivotPackage = (T) PivotFactory.eINSTANCE.create(pivotEClass);
		pivotPackage.setName(name);
		pivotPackage.setNsURI(nsURI);
		addPackage(pivotPackage);
//		installPackage(pivotPackage);
		return pivotPackage;
	}

	protected PackageManager createPackageManager() {
		return new PackageManager(this);
	}

	protected PrecedenceManager createPrecedenceManager() {
		PrecedenceManager precedenceManager = new PrecedenceManager();
		Collection<org.eclipse.ocl.examples.pivot.Package> rootPackages = computePivotRootPackages();
		List<String> errors = precedenceManager.compilePrecedences(rootPackages);
		for (String error : errors) {
			logger.error(error);
		}
		return precedenceManager;
	}

	public Resource createResource(URI uri, String contentType) {
		return pivotResourceSet.createResource(uri, contentType);
	}
	
	protected TupleTypeManager createTupleManager() {
		return new TupleTypeManager(this);
	}

	public UnspecifiedType createUnspecifiedType() {
		String value = "<unspecified:" + unspecifiedTypeCount++ + ">";
		UnspecifiedType unspecifiedType = PivotFactory.eINSTANCE.createUnspecifiedType();
		unspecifiedType.setName(value);
		unspecifiedType.setLowerBound(getOclAnyType());
		unspecifiedType.setUpperBound(getOclVoidType());
		addOrphanClass(unspecifiedType);
		return unspecifiedType;
	}

	@Override
	public void dispose() {
		if (listeners != null) {
			List<MetaModelManagerListener> savedListeners = listeners;
			listeners = null;
			for (MetaModelManagerListener listener : savedListeners) {
				listener.metaModelManagerDisposed(this);
			}
		}
		pivotResourceSet.eAdapters().remove(this);
		pivotResourceSet.getPackageRegistry().clear();
		pivotResourceSet.getResources().clear();
		pivotLibraries.clear();	
		pivotLibraryResource = null;
		externalResourceSet = null;
		globalNamespaces.clear();
		globalTypes.clear();
		external2PivotMap.clear();
		uriMap = null;
		lockingAnnotation = null;
		classLoaders = null;
		packageManager.dispose();
		if (tupleManager != null) {
			tupleManager.dispose();
			tupleManager = null;
		}
		if (lambdaManager != null) {
			lambdaManager.dispose();
			lambdaManager = null;
		}
		if (precedenceManager != null) {
			precedenceManager.dispose();
			precedenceManager = null;
		}
		type2tracker.clear();
		orphanage = null;
		pivotMetaModel = null;
		super.dispose();
	}

/*	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize " + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()));		
		super.finalize();
		Set<MetaModelManager> keySet = liveMetaModelManagers.keySet();
		if (!keySet.isEmpty()) {
			StringBuffer s = new StringBuffer();
			s.append(" live");
			for (MetaModelManager metaModelManager : keySet) {
				s.append(" @" + Integer.toHexString(metaModelManager.hashCode()));		
			}
			System.out.println(s);		
		}
	} */
	
	private Set<Iteration> findModelIterationsOrNull(Type type,
			String operationName, List<Type> staticCompleteIteratorTypes,
			List<Type> staticCompleteAccumulatorTypes, List<Type> staticCompleteParameterTypes) {
		Map<TemplateParameter, ParameterableElement> bindings = PivotUtil.getAllTemplateParameterSubstitutions(null, type);
		int staticIteratorsSize = staticCompleteIteratorTypes.size();
		Set<Iteration> list = null;
		for (Iteration modelIteration : getLocalModelIterations(type, operationName)) {
//			Map<TemplateParameter, ParameterableElement> templateParameterSubstitutions2 = PivotUtil.getAllTemplateParameterSubstitutions(null, dynamicIteration.getModel());
			List<Parameter> modelIterators = modelIteration.getOwnedIterators();
			if (staticIteratorsSize == modelIterators.size()) {
				boolean gotIt = true;
				for (int i = 0; i < staticIteratorsSize; i++) {
					Type staticCompleteIteratorType = staticCompleteIteratorTypes.get(i);
					Parameter modelIterator = modelIterators.get(i);
					Type dynamicCompleteIteratorType = getSpecializedType(modelIterator.getType(), bindings);
					if (!conformsTo(dynamicCompleteIteratorType, staticCompleteIteratorType, null)) {
						gotIt = false;
					}
				}
				if (gotIt) {
					if (list == null) {
						list = new HashSet<Iteration>();
					}
					list.add(modelIteration);
				}
			}
		}
		if (list == null) {
			for (Type completeSuperType : getSuperClasses(type)) {
				Set<Iteration> superIterations = findModelIterationsOrNull(
					completeSuperType, operationName, staticCompleteIteratorTypes,
					staticCompleteAccumulatorTypes, staticCompleteParameterTypes);
				if (superIterations != null) {
					if (list == null) {
						list = superIterations;
					} else {
						list.addAll(superIterations);
					}
				}
			}
		}
		return list;
	}

	private Set<Operation> findModelOperationsOrNull(Type type,
			String operationName, List<Type> staticCompleteTypes, Map<TemplateParameter, ParameterableElement> templateParameterSubstitutions) {
		int staticParametersSize = staticCompleteTypes.size();
		Set<Operation> list = null;
		for (Operation modelOperation : getLocalModelOperations(type, operationName)) {
			Map<TemplateParameter, ParameterableElement> bindings = null; //PivotUtil.getAllTemplateParametersAsBindings(modelOperation);
			List<Parameter> modelParameters = modelOperation.getOwnedParameters();
			if (staticParametersSize == modelParameters.size()) {
				boolean gotIt = true;
				for (int i = 0; i < staticParametersSize; i++) {
					Type staticCompleteType = staticCompleteTypes.get(i);
					Parameter modelParameter = modelParameters.get(i);
					Type dynamicCompleteType = getSpecializedType(modelParameter.getType(), templateParameterSubstitutions);
					if (!conformsTo(dynamicCompleteType, staticCompleteType, bindings)) {
						gotIt = false;
					}
				}
				if (gotIt) {
					if (list == null) {
						list = new HashSet<Operation>();
					}
					list.add(modelOperation);
				}
			}
		}
		if (list == null) {
			for (Type completeSuperType : getSuperClasses(type)) {
				Set<Operation> superOperations = findModelOperationsOrNull(
					completeSuperType, operationName, staticCompleteTypes, templateParameterSubstitutions);
				if (superOperations != null) {
					if (list == null) {
						list = superOperations;
					} else {
						list.addAll(superOperations);
					}
				}
			}
		}
		return list;
	}

/*	public <T extends Type> T findOrphanClass(Class<T> unspecializedType, String moniker) {		
		List<Type> ownedSpecializations = getOrphanPackage().getOwnedTypes();
		for (Type ownedSpecialization : ownedSpecializations) {
			if (Pivot2Moniker.toString(ownedSpecialization).equals(moniker)) {
				@SuppressWarnings("unchecked")
				T castSpecialization = (T)ownedSpecialization;	// FIXME validate
				return castSpecialization;
			}
		}
		return null;
	} */

/*	protected <T extends Operation> T findOrphanOperation(Class<T> unspecializedOperation, String moniker) {
		List<Operation> ownedSpecializations = getOrphanClass().getOwnedOperations();
		for (Operation ownedSpecialization : ownedSpecializations) {
			if (Pivot2Moniker.toString(ownedSpecialization).equals(moniker)) {
				@SuppressWarnings("unchecked")
				T castSpecialization = (T)ownedSpecialization;	// FIXME validate
				return castSpecialization;
			}
		}
		return null;
	} */
	
	public PackageTracker findPackageTracker(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		return packageManager.getTracker(pivotPackage);
	}
	
	public TypeTracker findTypeTracker(Type pivotType) {
		return type2tracker.get(pivotType);
	}

	/**
	 * Return all constraints applicable to a type and its superclasses.
	 */
	public Iterable<Constraint> getAllConstraints(Type pivotType) {
		if (pivotType == null) {
			return Collections.emptyList();
		}
		Set<Constraint> allConstraints = getAllConstraints(pivotType, null);
		if (allConstraints != null) {
			return allConstraints;
		}
		else {
			return Collections.emptyList();
		}
	}

	protected Set<Constraint> getAllConstraints(Type type, Set<Constraint> knownConstraints) {
		for (Constraint constraint : getLocalConstraints(type)) {
			if (knownConstraints == null) {
				knownConstraints = new HashSet<Constraint>();
				knownConstraints.add(constraint);
			}
			else if (!knownConstraints.add(constraint)) {	// Already contained implies multiple inheritance second visit
				return knownConstraints;
			}
		}
		for (Type superType : getSuperClasses(type)) {
			knownConstraints = getAllConstraints(superType, knownConstraints);
		}
		return knownConstraints;
	}

	public Iterable<Operation> getAllOperations(Operation pivotOperation) {
		if (pivotOperation == null) {
			return Collections.emptyList();
		}
		org.eclipse.ocl.examples.pivot.Class pivotClass = pivotOperation.getClass_();
		TypeTracker typeTracker = type2tracker.get(pivotClass);
		if (typeTracker != null) {
			return typeTracker.getTypeServer().getOperations(pivotOperation);
		}
		else {
			return Collections.singletonList(pivotOperation);
		}
	}

	public Iterable<org.eclipse.ocl.examples.pivot.Package> getAllPackages() {
		if (!libraryLoadInProgress && (pivotMetaModel == null))  {
			lazyLoadPivotMetaModel();
		}
		return packageManager.getAllPackages();
	}

	public Iterable<org.eclipse.ocl.examples.pivot.Package> getAllPackages(org.eclipse.ocl.examples.pivot.Package pkg, boolean loadPivotMetaModelFirst) {
		if (!libraryLoadInProgress && loadPivotMetaModelFirst && (pivotMetaModel == null)) {
			lazyLoadPivotMetaModel();
		}
		PackageTracker packageTracker = packageManager.getTracker(pkg);
		if (packageTracker != null) {
			return packageTracker.getPackageServer().getPackages();
		}
		else {
			return Collections.singletonList(pkg);
		}
	}

	public Iterable<Property> getAllProperties(Property pivotProperty) {
		if (pivotProperty == null) {
			return Collections.emptyList();
		}
		org.eclipse.ocl.examples.pivot.Class pivotClass = pivotProperty.getClass_();
		TypeTracker typeTracker = type2tracker.get(pivotClass);
		if (typeTracker != null) {
			return typeTracker.getTypeServer().getProperties(pivotProperty);
		}
		else {
			return Collections.singletonList(pivotProperty);
		}
	}

	public Iterable<Type> getAllTypes(Type pivotType) {
		if (pivotType == null) {
			return Collections.emptyList();
		}
		TypeTracker typeTracker = type2tracker.get(pivotType);
		if (typeTracker != null) {
			return typeTracker.getTypeServer().getTypes();
		}
		else  {
			return Collections.singletonList(pivotType);
		}
	}

	public ClassifierType getClassifierType(Type type) {
		ClassifierType classifierType;
 		List<Type> templateArguments = new ArrayList<Type>();
 		templateArguments.add((Type) type);
		if (type instanceof org.eclipse.ocl.examples.pivot.Enumeration) {
 			classifierType = getEnumerationClassifierType();
 		}
 		else if (type instanceof CollectionType) {
 			classifierType = getCollectionClassifierType();
 	 		templateArguments.add(((CollectionType) type).getElementType());
		}
 		else {
 			classifierType =  getClassClassifierType();
  		}
		return getLibraryType(classifierType, templateArguments);
	}

	public CollectionType getCollectionType(boolean isOrdered, boolean isUnique) {
		if (isOrdered) {
			if (isUnique) {
				return getOrderedSetType();
			}
			else {
				return getSequenceType();
			}
		}
		else {
			if (isUnique) {
				return getSetType();
			}
			else {
				return getBagType();
			}
		}
	}

	public CollectionType getCollectionType(boolean isOrdered, boolean isUnique, Type elementType) {
		return getLibraryType(getCollectionType(isOrdered, isUnique), Collections.singletonList(elementType));
	}

	public Type getCollectionType(String collectionTypeName, Type elementType) {
		if ((elementType == null) || elementType.eIsProxy()) {
			return getOclInvalidType();
		}
		return getLibraryType(collectionTypeName, Collections.singletonList(elementType));
	}
	
	public List<org.eclipse.ocl.examples.pivot.Class> getCommonClasses(org.eclipse.ocl.examples.pivot.Class leftClass,
		org.eclipse.ocl.examples.pivot.Class rightClass) {
		List<org.eclipse.ocl.examples.pivot.Class> commonClasses = null;
		if (conformsTo(rightClass, leftClass, null)) {
			commonClasses = new ArrayList<org.eclipse.ocl.examples.pivot.Class>();
			commonClasses.add(leftClass);
		}
		for (org.eclipse.ocl.examples.pivot.Class superClass : leftClass.getSuperClasses()) {
			List<org.eclipse.ocl.examples.pivot.Class> commonSuperClasses = getCommonClasses(superClass, rightClass);
			if (commonSuperClasses != null) {
				if (commonClasses == null) {
					commonClasses = commonSuperClasses;
				}
				else {
					commonClasses.addAll(commonSuperClasses);
				}
			}
		}
		return commonClasses;
	}

    @Deprecated
	public Type getCommonType(Type leftType, Type rightType) {
		return getCommonType(leftType, rightType, null);
	}
	
	public Type getCommonType(Type leftType, Type rightType, Map<TemplateParameter, ParameterableElement> templateParameterSubstitutions) {
		if (leftType instanceof UnspecifiedType) {
			((UnspecifiedType)leftType).setUpperBound(rightType);
			return rightType;
		}
		if (rightType instanceof UnspecifiedType) {
			((UnspecifiedType)rightType).setUpperBound(leftType);
			return leftType;
		}
		if ((leftType instanceof TupleType) && (rightType instanceof TupleType)) {
			TupleTypeManager tupleManager = getTupleManager();
			return tupleManager.getCommonType((TupleType)leftType, (TupleType)rightType, templateParameterSubstitutions);
		}
		if (conformsTo(leftType, rightType, templateParameterSubstitutions)) {
			return rightType;
		}
		if (conformsTo(rightType, leftType, templateParameterSubstitutions)) {
			return leftType;
		}
		if (!(leftType instanceof org.eclipse.ocl.examples.pivot.Class)
		 || !(rightType instanceof org.eclipse.ocl.examples.pivot.Class)) {
			return null;
		}
		List<org.eclipse.ocl.examples.pivot.Class> commonClasses = getCommonClasses((org.eclipse.ocl.examples.pivot.Class)leftType, (org.eclipse.ocl.examples.pivot.Class)rightType);
		if (commonClasses == null) {
			return null;
		}
		// FIXME If there are two different common types neither is inherently better
		org.eclipse.ocl.examples.pivot.Class mostConformant = null;
		for (org.eclipse.ocl.examples.pivot.Class commonClass : commonClasses) {
			if (mostConformant == null) {
				mostConformant = commonClass;
			}
			else if (conformsTo(commonClass, mostConformant, templateParameterSubstitutions)) {
				mostConformant = commonClass;
			}
		}
		return mostConformant;
	}

	public String getDefaultStandardLibraryURI() {
		return defaultStandardLibraryURI;
	}

	public Operation getDynamicOperation(Type dynamicType, Operation staticOperation) {
		if (staticOperation instanceof Iteration) {
			return getDynamicOperationForIteration(dynamicType, (Iteration) staticOperation);
		}
		else {
			return getDynamicOperationForOperation(dynamicType, staticOperation);
		}
	}
	
	private Iteration getDynamicOperationForIteration(Type dynamicType, Iteration staticModelIteration)
	{
		Map<TemplateParameter, ParameterableElement> bindings = PivotUtil.getAllTemplateParameterSubstitutions(null, dynamicType);
//		Map<TemplateParameter, ParameterableElement> templateParameterSubstitutions2 = PivotUtil.getAllTemplateParameterSubstitutions(null, staticIteration.getModel());
		List<Type> staticCompleteIteratorTypes = new ArrayList<Type>();
		for (Parameter staticIterator : staticModelIteration.getOwnedIterators()) {
			staticCompleteIteratorTypes.add(getSpecializedType(staticIterator.getType(), bindings));
		}
		List<Type> staticCompleteAccumulatorTypes = new ArrayList<Type>();
		for (Parameter staticAccumulator : staticModelIteration.getOwnedAccumulators()) {
			staticCompleteAccumulatorTypes.add(getSpecializedType(staticAccumulator.getType(), bindings));
		}
		List<Type> staticCompleteParameterTypes = new ArrayList<Type>();
		for (Parameter staticParameter : staticModelIteration.getOwnedParameters()) {
			staticCompleteParameterTypes.add(getSpecializedType(staticParameter.getType(), bindings));
		}
		Iteration dynamicIteration = null;
		Set<Iteration> modelIterations = findModelIterationsOrNull(dynamicType, staticModelIteration.getName(),
			staticCompleteIteratorTypes, staticCompleteAccumulatorTypes, staticCompleteParameterTypes);
		if (modelIterations != null) {
			if (modelIterations.size() == 1) {
				dynamicIteration = modelIterations.iterator().next();
			}
			else if (modelIterations.size() > 1) {
				Iteration conformantIteration = null;
				boolean ok = true;
				for (Iteration completeIteration : modelIterations) {
					if (conformantIteration == null) {
						conformantIteration = completeIteration;
					}
					else {
						org.eclipse.ocl.examples.pivot.Class completeClass = PivotUtil.getFeaturingClass(completeIteration);
						org.eclipse.ocl.examples.pivot.Class conformantClass = PivotUtil.getFeaturingClass(conformantIteration);
						if (conformsTo(completeClass, conformantClass, bindings)) {
							conformantIteration = completeIteration;
						}
						else if (!conformsTo(conformantClass, completeClass, bindings)) {
							ok = false;
						}
					}
				}
				if (ok) {
					dynamicIteration = conformantIteration;
				}
			}
		}
		return dynamicIteration;
	}

	private Operation getDynamicOperationForOperation(Type dynamicType, Operation staticModelOperation) {
		Map<TemplateParameter, ParameterableElement> bindings = PivotUtil.getAllTemplateParameterSubstitutions(null, dynamicType);
		PivotUtil.getAllTemplateParameterSubstitutions(bindings, staticModelOperation);
		List<Type> staticCompleteTypes = new ArrayList<Type>();
		for (Parameter staticParameter : staticModelOperation.getOwnedParameters()) {
			staticCompleteTypes.add(getSpecializedType(staticParameter.getType(), bindings));
		}
		Operation dynamicModelOperation = null;
		String name = staticModelOperation.getName();
		Set<Operation> modelOperations = findModelOperationsOrNull(dynamicType, name, staticCompleteTypes, bindings);
		if ((modelOperations != null) && (modelOperations.size() == 1)) {
			dynamicModelOperation = modelOperations.iterator().next();
		}
		return dynamicModelOperation;
	}

	public ResourceSet getExternalResourceSet() {
		if (externalResourceSet == null) {
			externalResourceSet = new ResourceSetImpl();
			MetaModelManagerResourceSetAdapter.getAdapter(externalResourceSet, this);
			for (Factory factory : factoryMap) {
				factory.configure(externalResourceSet);
			}
		}
		return externalResourceSet;
	}

	public Set<Map.Entry<String, Namespace>> getGlobalNamespaces() {
		return globalNamespaces.entrySet();
	}

	public Iterable<Type> getGlobalTypes() {
		return globalTypes;
	}

	/**
	 * Return the implementation of a feature.
	 * 
	 * @param feature to be implemented.
	 * @return the implementation, or null if the feature has no implementation
	 * as is the case for a normal model feature
	 * @throws ClassNotFoundException if the implementation class realising
	 * the implementation is not loadable 
	 * @throws NoSuchFieldException if the implementation class realising
	 * the implementation does not provide a static INSTANCE field
	 * @throws SecurityException if the implementation class is not accessible
	 * @throws IllegalAccessException if the implementation class is not accessible
	 * @throws IllegalArgumentException if the implementation class is not accessible
	 */
	public CallableImplementation getImplementation(Feature feature) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		CallableImplementation implementation = feature.getImplementation();
		if (implementation == null) {
			String implementationClassName = feature.getImplementationClass();
			if (implementationClassName != null) {
				Class<?> theClass = null;
				if (classLoaders == null) {
					ClassLoader classLoader = feature.getClass().getClassLoader();
					theClass = classLoader.loadClass(implementationClassName);
				}
				else {
					ClassNotFoundException e = null;
					for (ClassLoader classLoader : classLoaders) {
						try {
							theClass = classLoader.loadClass(implementationClassName);
							break;
						} catch (ClassNotFoundException e1) {
							if (e == null) {
								e = e1;
							}
						}						
					}
					if (e != null) {
						throw e;
					}
				}
				@SuppressWarnings("null")
				Field field = theClass.getField("INSTANCE");
				implementation = (CallableImplementation) field.get(null);
			}
		}
		return implementation;
	}
	public CallableImplementation getImplementation(Operation operation) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		CallableImplementation implementation = operation.getImplementation();
		if (implementation == null) {
			implementation = computeOperationImplementation(operation);
			operation.setImplementation(implementation);
		}
		return implementation;
	}
	public CallableImplementation getImplementation(Property property) throws ClassNotFoundException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		CallableImplementation implementation = property.getImplementation();
		if (implementation == null) {
			implementation = computePropertyImplementation(property);
			property.setImplementation(implementation);
		}
		return implementation;
	}
	
	public Precedence getInfixPrecedence(String operatorName) {
		PrecedenceManager precedenceManager = getPrecedenceManager();
		return precedenceManager.getInfixPrecedence(operatorName);
	}

	public LambdaTypeManager getLambdaManager() {
		if (lambdaManager == null) {
			lambdaManager = createLambdaManager();
		}
		return lambdaManager;
	}
	   
	public LambdaType getLambdaType(String typeName, Type contextType, List<? extends Type> parameterTypes, Type resultType,
			Map<TemplateParameter, ParameterableElement> bindings) {
		LambdaTypeManager lambdaManager = getLambdaManager();
		return lambdaManager.getLambdaType(typeName, contextType, parameterTypes, resultType, bindings);
	}
	
	public List<Library> getLibraries() { return pivotLibraries; }
	public Resource getLibraryResource() { return pivotLibraryResource; }

	public Type getLibraryType(String string, List<? extends ParameterableElement> templateArguments) {
		Type libraryType = getRequiredLibraryType(string);
		if (libraryType == null) {
			return null;
		}
		return getLibraryType(libraryType, templateArguments);
	}

	public <T extends Type> T getLibraryType(T libraryType, List<? extends ParameterableElement> templateArguments) {
		assert libraryType == PivotUtil.getUnspecializedTemplateableElement(libraryType);
		if ((libraryType == getClassifierType()) && (templateArguments != null) && (templateArguments.size() == 1) && (templateArguments.get(0) == libraryType)) {
			return libraryType;
		}
		TemplateSignature templateSignature = libraryType.getOwnedTemplateSignature();
		List<TemplateParameter> templateParameters = templateSignature != null ? templateSignature.getParameters() : Collections.<TemplateParameter>emptyList();
		if (templateParameters.isEmpty()) {
			return libraryType;
		}
		if ((templateArguments == null) || (templateArguments.size() != templateParameters.size())) {
			throw new IllegalArgumentException(
				"Incorrect template bindings for template type");
		}
		boolean isUnspecialized = isUnspecialized(templateParameters, templateArguments);
		if (isUnspecialized) {
			return libraryType;	
		}
		return getSpecializedTypeServer(libraryType, templateArguments);
	}

	public Iterable<Type> getLocalClasses(org.eclipse.ocl.examples.pivot.Package pkg) {
		return new CompletePackageTypesIterable(getAllPackages(pkg, true));
	}

	public Iterable<Constraint> getLocalConstraints(Operation operation) {
		if (operation.getOwningTemplateParameter() != null) {
			return Collections.emptyList();
		}
		else {
			return new CompleteElementConstraintsIterable(getAllOperations(operation));
		}
	}

	public Iterable<Constraint> getLocalConstraints(Property property) {
		if (property.getOwningTemplateParameter() != null) {
			return Collections.emptyList();
		}
		else {
			return new CompleteElementConstraintsIterable(getAllProperties(property));
		}
	}

	public Iterable<Constraint> getLocalConstraints(Type type) {
		if ((type == null) || (type.getOwningTemplateParameter() != null)) {
			return Collections.emptyList();
		}
		else {
			return new CompleteElementConstraintsIterable(getAllTypes(type));
		}
	}

	private Iterable<Iteration> getLocalModelIterations(Type aType, String name) {
		List<Iteration> iterations = new ArrayList<Iteration>();
		Type type = getPrimaryType(aType);
//		if (type.getTemplateBindings().size() > 0) {
			type = PivotUtil.getUnspecializedTemplateableElement(type);
//		}
		for (Operation anOperation : getLocalOperations(type, null)) {
			if ((anOperation instanceof Iteration) && name.equals(anOperation.getName())) {
				Operation iteration = getPrimaryOperation(anOperation);
				if (!iterations.contains(iteration)) {
					iterations.add((Iteration) iteration);
				}
			}
		}
		return iterations;
	}

	private Iterable<Operation> getLocalModelOperations(Type aType, String name) {	// FIXME return an iterator
		List<Operation> operations = new ArrayList<Operation>();
		Type type = getPrimaryType(aType);
//		if (type.getTemplateBindings().size() > 0) {
			type = PivotUtil.getUnspecializedTemplateableElement(type);
//		}
		for (Operation anOperation : getLocalOperations(type, null)) {
			if (!(anOperation instanceof Iteration) && name.equals(anOperation.getName())) {
				Operation operation = getPrimaryOperation(anOperation);
				if (!operations.contains(operation)) {
					operations.add(operation);
				}
			}
		}
		return operations;
	}

	public Iterable<Operation> getLocalOperations(Type type, Boolean selectStatic) {
		if ((type == null) || (type.getOwningTemplateParameter() != null)) {
			return Collections.emptyList();
		}
		else {
//			if (type.getTemplateBindings().size() > 0) {		// FIXME need lazy specialization
				type = PivotUtil.getUnspecializedTemplateableElement(type);
//			}
			return new CompleteTypeOperationsIterable(getAllTypes(type), selectStatic);
		}
	}

	public Iterable<org.eclipse.ocl.examples.pivot.Package> getLocalPackages(org.eclipse.ocl.examples.pivot.Package pkg) {
		return new CompletePackagePackagesIterable(getAllPackages(pkg, true));
	}

	public Iterable<Property> getLocalProperties(Type type, Boolean selectStatic) {
		if ((type == null) || (type.getOwningTemplateParameter() != null)) {
			return Collections.emptyList();
		}
		else {
//			if (type.getTemplateBindings().size() > 0) {		// FIXME need lazy specialization
				type = PivotUtil.getUnspecializedTemplateableElement(type);
//			}
			return new CompleteClassPropertiesIterable(getAllTypes(type), selectStatic);
		}
	}

	public EObject getLockingObject() {
		return lockingAnnotation;
	}

	private Resource getOrphanResource() {
		if (orphanage == null) {
			URI uri = URI.createURI(PivotConstants.ORPHANAGE_URI);
			orphanage = createOrphanage(uri);
//			installResource(orphanage);
		}
		return orphanage;
	}
	
	public PackageTracker getPackageTracker(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		PackageTracker packageTracker = packageManager.getTracker(pivotPackage);
		if (packageTracker == null) {
			packageTracker = PackageServer.install(this, pivotPackage);
		}
		return packageTracker;
	}
	
	public org.eclipse.ocl.examples.pivot.Package getPivotMetaModel() {	// WIP duplication
		if (pivotMetaModel == null) {
			AnyType oclAnyType = getOclAnyType();
			if (oclAnyType != null) {
				org.eclipse.ocl.examples.pivot.Package stdlibPackage = oclAnyType.getPackage();
				OclMetaModel metaModelResource = new OclMetaModel(this, stdlibPackage.getName(), stdlibPackage.getNsURI());	// FIXME duplication of TypeCaches.loadPivotMetaModel
				pivotMetaModel = (org.eclipse.ocl.examples.pivot.Package)metaModelResource.getContents().get(0);
				addPackage(pivotMetaModel);
			}
		}
		return pivotMetaModel;
	}

	public <T extends NamedElement> T getPivotOfEcore(Class<T> pivotClass, EObject eObject) {
		Resource metaModel = eObject.eResource();
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(metaModel, this);
		return ecore2Pivot.getCreated(pivotClass, eObject);
	}

	public ResourceSet getPivotResourceSet() {
		return pivotResourceSet;
	}

	/**
	 * Return the pivot model class for className with the Pivot Model.
	 */
	public Type getPivotType(String className) {
		org.eclipse.ocl.examples.pivot.Package pivotMetaModel = getPivotMetaModel();
		if (pivotMetaModel == null) {
			return null;
		}
		return PivotUtil.getNamedElement(pivotMetaModel.getOwnedTypes(), className);
	}	

	protected PrecedenceManager getPrecedenceManager() {
		if (precedenceManager == null) {
			precedenceManager = createPrecedenceManager();
		}
		return precedenceManager;
	}

	public Iterable<? extends Nameable> getPrecedences(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		return pivotPackage.getOwnedPrecedences(); // FIXME make package independent
	}
	
	public Precedence getPrefixPrecedence(String operatorName) {
		PrecedenceManager precedenceManager = getPrecedenceManager();
		return precedenceManager.getPrefixPrecedence(operatorName);
	}

	public EObject getPrimaryElement(EObject element) {
		if (element instanceof Operation) {
			return getPrimaryOperation((Operation)element);
		}
		else if (element instanceof org.eclipse.ocl.examples.pivot.Package) {
			return getPrimaryPackage((org.eclipse.ocl.examples.pivot.Package)element);
		}
		else if (element instanceof Property) {
			return getPrimaryProperty((Property)element);
		}
		else if (element instanceof Type) {
			return getPrimaryType((Type)element);
		} 
		return element;
	}

	public Operation getPrimaryOperation(Operation pivotOperation) {
		org.eclipse.ocl.examples.pivot.Class pivotClass = pivotOperation.getClass_();
		TypeTracker typeTracker = type2tracker.get(pivotClass);
		if (typeTracker != null) {
			return typeTracker.getTypeServer().getOperation(pivotOperation);
		}
		else {
			return pivotOperation;
		}
	}

	/**
	 * Lookup a primary package by its URI and optionally a sub-package path.
	 */
	public org.eclipse.ocl.examples.pivot.Package getPrimaryPackage(String nsURI, String... subPackagePath) {
		org.eclipse.ocl.examples.pivot.Package pivotPackage = packageManager.get(nsURI);
		if (pivotPackage == null) {
			return null;
		}
		if (subPackagePath != null) {
			for (String subPackageName : subPackagePath) {
				pivotPackage = getPrimaryPackage(pivotPackage, subPackageName);
				if (pivotPackage == null) {
					return null;
				}
			}
		}
		return pivotPackage;
	}

	/**
	 * Lookup a primary sub-package.
	 */
	public org.eclipse.ocl.examples.pivot.Package getPrimaryPackage(org.eclipse.ocl.examples.pivot.Package parentPackage, String subPackageName) {
		PackageTracker packageTracker = packageManager.getTracker(parentPackage);
		if (packageTracker != null) {
			return packageTracker.getPackageServer().getNestedPackage(subPackageName);
		}
		else {
			return PivotUtil.getNamedElement(parentPackage.getNestedPackages(), subPackageName);
		}
	}

	public org.eclipse.ocl.examples.pivot.Package getPrimaryPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		PackageTracker packageTracker = packageManager.getTracker(pivotPackage);
		if (packageTracker != null) {
			return packageTracker.getPrimaryPackage();
		}
		else {
			return pivotPackage;
		}
	}

	public Property getPrimaryProperty(Property pivotProperty) {
		org.eclipse.ocl.examples.pivot.Class pivotClass = pivotProperty.getClass_();
		TypeTracker typeTracker = type2tracker.get(pivotClass);
		if (typeTracker != null) {
			return typeTracker.getTypeServer().getProperty(pivotProperty.getName());
		}
		else {
			return pivotProperty;
		}
	}

	public Type getPrimaryType(Type pivotType) {
		TypeTracker typeTracker = type2tracker.get(pivotType);
		if (typeTracker != null) {
			return typeTracker.getPrimaryType();
		}
		else {
			return pivotType;
		}
	}

	public org.eclipse.ocl.examples.pivot.Type getPrimaryType(String nsURI, String path, String... extraPath) {
		org.eclipse.ocl.examples.pivot.Package pivotPackage = packageManager.get(nsURI);
		if (pivotPackage == null) {
			return null;
		}
		if ((extraPath == null) || (extraPath.length == 0)) {
			return getPrimaryType(pivotPackage, path);
		}
		else {
			pivotPackage = getPrimaryPackage(pivotPackage, path);
			if (pivotPackage == null) {
				return null;
			}
			int iMax = extraPath.length-1;
			for (int i = 0; i < iMax; i++) {
				pivotPackage = getPrimaryPackage(pivotPackage, extraPath[i]);
				if (pivotPackage == null) {
					return null;
				}
			}
			return getPrimaryType(pivotPackage, extraPath[iMax]);
		}
	}

	/**
	 * Lookup a primary type.
	 */
	public Type getPrimaryType(org.eclipse.ocl.examples.pivot.Package parentPackage, String typeName) {
		PackageTracker packageTracker = packageManager.getTracker(parentPackage);
		if (packageTracker != null) {
			return packageTracker.getPackageServer().getType(typeName);
		}
		else {
			return PivotUtil.getNamedElement(parentPackage.getOwnedTypes(), typeName);
		}
	}
	
	/**
	 * Return the URI to be used for a concrete syntax resource for an expression associated
	 * with a uniqueContext. If uniqueContext is an Element the moniker is used as
	 * part of the URI, otherwise a unique value is created and cached for reuse.
	 */
	public URI getResourceIdentifier(Object uniqueContext, String subContext) {
		if (subContext == null) {
			subContext = "";
		}
		URI uri;
		if (uniqueContext instanceof Element) {
			uri = URI.createURI(Pivot2Moniker.toString((Element) uniqueContext) + subContext + ".essentialocl");
		}
		else {
			if (uriMap == null) {
				uriMap = new HashMap<Object,URI>();
			}
			uri = uriMap.get(uniqueContext);
			if (uri == null) {
				uri = URI.createURI(EcoreUtil.generateUUID() + subContext + ".essentialocl");
				uriMap.put(uniqueContext, uri);
			}
		}
		return uri;
	}

	public CollectionType getSetType(Type elementType) {
		return getLibraryType(getSetType(), Collections.singletonList(elementType));
	}

	protected Type getSpecializedLambdaType(LambdaType type, Map<TemplateParameter, ParameterableElement> usageBindings) {
		LambdaType specializedLambdaType = getLambdaType(type.getName(), type.getContextType(), type.getParameterTypes(), type.getResultType(), usageBindings);
		return specializedLambdaType;
	}

	public Type getSpecializedType(Type type, Map<TemplateParameter, ParameterableElement> usageBindings) {
		TemplateParameter owningTemplateParameter = type.getOwningTemplateParameter();
		if (owningTemplateParameter != null) {
			if (usageBindings == null) {
				return type;
			}
			ParameterableElement parameterableElement = usageBindings.get(owningTemplateParameter);
			return parameterableElement instanceof Type ? (Type) parameterableElement : type;
		}
		else if (usageBindings == null) {
			return type;
		}
		else if (type instanceof TupleType) {
			return getTupleType((TupleType) type, usageBindings);
		}
		else if (type instanceof LambdaType) {
			return getSpecializedLambdaType((LambdaType)type, usageBindings);
		}
		else {
			//
			//	Get the bindings of the type.
			//
			Type unspecializedType = PivotUtil.getUnspecializedTemplateableElement(type);
	//		List<TemplateParameter> templateParameters = PivotUtil.getAllTemplateParameters(type);
			Map<TemplateParameter, ParameterableElement> typeBindings = PivotUtil.getAllTemplateParametersAsBindings(type);
			PivotUtil.getAllTemplateParameterSubstitutions(typeBindings, type);
			if ((typeBindings != null) && !typeBindings.isEmpty()) {
				//
				//	Re-bind the type bindings to use those of the usage.
				//
				for (TemplateParameter templateParameter : typeBindings.keySet()) {
					ParameterableElement parameterableElement = typeBindings.get(templateParameter);
					if (parameterableElement != null) {
						TemplateParameter aTemplateParameter = parameterableElement.getOwningTemplateParameter();
						if (aTemplateParameter != null) {
							ParameterableElement aParameterableElement = usageBindings.get(aTemplateParameter);
							if (aParameterableElement != null) {
								typeBindings.put(templateParameter, aParameterableElement);
							}
						}
						else if (parameterableElement instanceof SelfType) {
							ParameterableElement aParameterableElement = usageBindings.get(null);
							if (aParameterableElement != null) {
								typeBindings.put(templateParameter, aParameterableElement);
							}
						}
					}
				}
				//
				//	Prepare the template argument list, one template argument per template parameter.
				//
//				Set<TemplateParameter> templateParameters = typeBindings1.keySet();
				List<TemplateParameter> templateParameters = PivotUtil.getAllTemplateParameters(unspecializedType);
				List<ParameterableElement> templateArguments = new ArrayList<ParameterableElement>(templateParameters.size());
//				boolean isSubstituted = false;
				for (TemplateParameter templateParameter : templateParameters) {
					ParameterableElement templateArgument = typeBindings.get(templateParameter);
					if (templateArgument != null) {
//						isSubstituted = true;
					}
					else {
						templateArgument = templateParameter.getParameteredElement();
					}
					if (templateArgument instanceof Type) {
						templateArgument = getSpecializedType((Type)templateArgument, usageBindings);
//						isSubstituted = true;
					}
					templateArguments.add(templateArgument);
				}
//				if (!isSubstituted) {
//					return type;
//				}
				return getLibraryType(unspecializedType, templateArguments);
			}
		}
		return type;
	}
	
	protected <T extends Type> T getSpecializedTypeServer(T unspecializedType, List<? extends ParameterableElement> templateArguments) {
		SpecializeableTypeServer typeServer = (SpecializeableTypeServer) getTypeTracker(unspecializedType).getTypeServer();
		SpecializedTypeServer specializedTypeServer = typeServer.getSpecializedTypeServer(templateArguments);
		Type target = specializedTypeServer.getTarget();
		return (T) target;
	}
	
	
	public Iterable<org.eclipse.ocl.examples.pivot.Class> getSuperClasses(Type pivotType) {
		if ((pivotType == null) || (pivotType.getOwningTemplateParameter() != null)) {
			return Collections.<org.eclipse.ocl.examples.pivot.Class>singletonList(getOclAnyType());	// FIXME lower bound
		}
		else {
//			if (type.getTemplateBindings().size() > 0) {		// FIXME need lazy specialization
//			pivotType = PivotUtil.getUnspecializedTemplateableElement(pivotType);
//			}
			if ((pivotMetaModel == null) && (pivotType == getClassType()))  {
				lazyLoadPivotMetaModel();
			}
			return new CompleteClassSuperClassesIterable(getAllTypes(pivotType));
		}
	}
	
/*	public Iterable<org.eclipse.ocl.examples.pivot.Class> getSuperTypes(Type type)
	{
		if (completeSuperTypes == null)
		{
			completeSuperTypes = new EObjectResolvingEList<CompleteType>(CompleteType.class, this, PivotPackage.COMPLETE_TYPE__COMPLETE_SUPER_TYPE);
//			for (Type superType : getSuperClasses()) {
//				completeSuperTypes.add(completeEnvironment.getCompleteType(superType));
//			}
			for (Type model : models) {
				if (model instanceof org.eclipse.ocl.examples.pivot.Class) {
					org.eclipse.ocl.examples.pivot.Class thisModelClass = (org.eclipse.ocl.examples.pivot.Class)model;
					if (thisModelClass.getTemplateBindings().size() > 0) {
	//					thisModelClass = PivotUtil.getUnspecializedTemplateableElement((org.eclipse.ocl.examples.pivot.Class)model);
					}
					for (Type superType : thisModelClass.getSuperClasses()) {
						completeSuperTypes.add(completeEnvironment.getCompleteType(superType));
					}
				}
			}
		}
		return completeSuperTypes;
	} */

	public ResourceSet getTarget() {
		return pivotResourceSet;
	}

	public TupleTypeManager getTupleManager() {
		if (tupleManager == null) {
			tupleManager = createTupleManager();
		}
		return tupleManager;
	}
	
	public TupleType getTupleType(String typeName, Collection<? extends TypedElement> parts,
			Map<TemplateParameter, ParameterableElement> bindings) {
		TupleTypeManager tupleManager = getTupleManager();
		return tupleManager.getTupleType(typeName, parts, bindings);
	}
	
	public TupleType getTupleType(TupleType tupleType, Map<TemplateParameter, ParameterableElement> bindings) {
		TupleTypeManager tupleManager = getTupleManager();
		return tupleManager.getTupleType(tupleType, bindings);
	}
	
	public TypeTracker getTypeTracker(Type pivotType) {
		TypeTracker typeTracker = type2tracker.get(pivotType);
		if (typeTracker == null) {
			PackageTracker packageTracker = getPackageTracker(pivotType.getPackage());
			typeTracker = packageTracker.getTypeTracker(pivotType);
		}
		return typeTracker;
	}

	public Type getTypeWithMultiplicity(TypedMultiplicityElement element) {
		Type elementType = PivotUtil.getBehavioralType(element.getType());
		int upperBound = element.getUpper().intValue();
		boolean isMany = (upperBound < 0) || (1 < upperBound);
		if (!isMany) {
			return elementType;
		}
		boolean isOrdered = element.isOrdered();
		boolean isUnique = element.isUnique();
		Type collectionType;
		if (isOrdered) {
			if (isUnique) {
				collectionType = getOrderedSetType();
			}
			else {
				collectionType = getSequenceType();
			}
		}
		else {
			if (isUnique) {
				collectionType = getSetType();
			}
			else {
				collectionType = getBagType();
			}
		}
		return getLibraryType(collectionType, Collections.singletonList(elementType));
	}

	public ValueFactory getValueFactory() {
		return ValueFactory.INSTANCE;
	}

	protected void installLibrary(Library pivotLibrary) {
		String uri = pivotLibrary.getNsURI();
		if (pivotLibraries.isEmpty()) {
			if (uri == null) {
				throw new IllegalLibraryException(OCLMessages.MissingLibraryURI_ERROR_);
			}
			setDefaultStandardLibraryURI(uri);
			pivotLibraries.add(pivotLibrary);
		}
		else if (!pivotLibraries.contains(pivotLibrary)) {
			String libraryURI = getDefaultStandardLibraryURI();
			if ((uri != null) && !uri.equals(libraryURI)) {
				throw new IllegalLibraryException(NLS.bind(OCLMessages.ImportedLibraryURI_ERROR_, uri , libraryURI));
			}
			pivotLibraries.add(pivotLibrary);
		}
	}

	public void installPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		if (pivotPackage instanceof Library) {
			installLibrary((Library)pivotPackage);
		}
		addPackage(pivotPackage);
	}
	
	/**
	 * Create implicit an opposite property if there is no explicit opposite.
	 */
	public void installPropertyDeclaration(Property thisProperty) {
		if (thisProperty.isTransient() || thisProperty.isVolatile() || thisProperty.isDerived()) {
			return;
		}
		Property opposite = thisProperty.getOpposite();
		if (opposite != null) {
			return;
		}
		org.eclipse.ocl.examples.pivot.Class thatType = (org.eclipse.ocl.examples.pivot.Class)thisProperty.getType();
		if ((thatType == null) || (thatType instanceof DataType)) {
			return;
		}
		org.eclipse.ocl.examples.pivot.Class thisType = thisProperty.getClass_();
		String name = thisType.getName();
		// If there is an explicit property with the implicit name do nothing.
		for (Property thatProperty : thatType.getOwnedAttributes()) {
			if (name.equals(thatProperty.getName())) {
				if (!thatProperty.isImplicit()) {
					return;
				}
				opposite = thatProperty;
			}
		}
		// If there is an implicit property with the implicit name, set its opposite null
		//   and do no more; result one name with no opposites
		if (opposite != null) {
			opposite.setOpposite(null);
			thisProperty.setOpposite(null);
			opposite.setUpper(BigInteger.valueOf(-1));
			return;
		}
		// If there is no implicit property with the implicit name, create one
		//   result a pair of mutual opposites		
		opposite = PivotFactory.eINSTANCE.createProperty();
		opposite.setImplicit(true);
		opposite.setName(name);
		opposite.setType(thisType);
		opposite.setLower(BigInteger.valueOf(0));
		if (thisProperty.isComposite()) {
			opposite.setUpper(BigInteger.valueOf(1));
		}
		else {
			opposite.setUpper(BigInteger.valueOf(-1));
		}
		thatType.getOwnedAttributes().add(opposite);		// WIP moved for debugging
		opposite.setOpposite(thisProperty);
		thisProperty.setOpposite(opposite);
	}

	public void installResource(Resource pivotResource) {
		for (EObject eObject : pivotResource.getContents()) {
			if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
				org.eclipse.ocl.examples.pivot.Package pivotPackage = (org.eclipse.ocl.examples.pivot.Package)eObject;
				installPackage(pivotPackage);
//				installPackageContent(pivotPackage);
			}
		}
	}

	public boolean isAdapterFor(MetaModelManager metaModelManager) {
		return this == metaModelManager;
	}

	protected boolean isUnspecialized(List<TemplateParameter> templateParameters,
			List<? extends ParameterableElement> templateArguments) {
		int iMax = templateParameters.size();
		assert templateArguments.size() == iMax;
		boolean isUnspecialized = true;
		for (int i = 0; i < iMax; i++) {
			if (templateArguments.get(i) != templateParameters.get(i).getParameteredElement()) {
				isUnspecialized = false;
			}
		}
		return isUnspecialized;
	}

	protected void lazyLoadPivotMetaModel() {
		if (!pivotLibraries.isEmpty()) {
			loadPivotMetaModel(pivotLibraries.get(0));
		}
	}

	public boolean isAdapterForType(Object type) {
		return type == MetaModelManager.class;
	}

	public boolean isSuperClassOf(Type unspecializedFirstType, org.eclipse.ocl.examples.pivot.Class secondType) {
		Type unspecializedSecondType = PivotUtil.getUnspecializedTemplateableElement(secondType);
		if (unspecializedFirstType == unspecializedSecondType) {
			return true;
		}
		for (org.eclipse.ocl.examples.pivot.Class superClass : getSuperClasses(unspecializedSecondType)) {
			if (isSuperClassOf(unspecializedFirstType, superClass)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Retyurn true if this type involves an UnspecifiedType.
	 */
	public boolean isUnderspecified(ParameterableElement type) {
		if (type == null) {
			return false;
		}
		if (type instanceof TemplateableElement) {
			for (TemplateBinding templateBinding : ((TemplateableElement)type).getTemplateBindings()) {
				for (TemplateParameterSubstitution templateParameterSubstitution : templateBinding.getParameterSubstitutions()) {
					if (isUnderspecified((Type) templateParameterSubstitution.getActual())) {
						return true;
					}
				}
			}
		}
		if (type instanceof UnspecifiedType) {
			return true;
		}
		if (type instanceof CollectionType) {
			return isUnderspecified(((CollectionType)type).getElementType());
		}
		if (type instanceof TupleType) {
			for (Property part : ((TupleType)type).getOwnedAttributes()) {
				if (isUnderspecified(part.getType())) {
					return true;
				}
			}
		}
		if (type instanceof LambdaType) {
			LambdaType lambdaType = (LambdaType)type;
			if (isUnderspecified(lambdaType.getContextType())) {
				return true;
			}
			for (Type parameterType : lambdaType.getParameterTypes()) {
				if (isUnderspecified(parameterType)) {
					return true;
				}
			}
			if (isUnderspecified(lambdaType.getResultType())) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Resource loadDefaultLibrary(String uri) {
		if (!pivotLibraries.isEmpty() && (pivotLibraryResource == null)) {
			loadLibrary(pivotLibraries.get(0).eResource());
			return pivotLibraryResource;
		}
		if (uri == null) {
			return null;
		}
		StandardLibraryContribution contribution = StandardLibraryContribution.REGISTRY.get(uri);
		if (contribution == null) {
			return null;
		}
		Resource resource = contribution.getResource();
		loadLibrary(resource);
		return resource;
	}

	public void loadLibrary(Resource pivotResource) {
		assert (pivotLibraryResource == null) || (pivotLibraryResource == pivotResource);
		if (pivotResource != null) {
			pivotLibraryResource = pivotResource;
			installResource(pivotResource);
		}
		for (org.eclipse.ocl.examples.pivot.Package rootPackage : computePivotRootPackages()) {
			if (rootPackage instanceof Library) {
				if (!pivotLibraries.contains(rootPackage)) {
					pivotLibraries.add((Library) rootPackage);
				}
				loadLibraryPackage(rootPackage);
			}
		}
	}

	protected void loadLibraryPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : pivotPackage.getNestedPackages()) {
			loadLibraryPackage(nestedPackage);
		}
		for (Type type : pivotPackage.getOwnedTypes()) {
			if (PivotUtil.isLibraryType(type)) {
				defineLibraryType(type);
			}
		}
	}

	protected void loadPivotMetaModel(Library pivotLibrary) {
//		PackageTracker libraryTracker = package2tracker.get(pivotLibrary);
		for (org.eclipse.ocl.examples.pivot.Package libPackage : getAllPackages(pivotLibrary, false)) {
			if (PivotUtil.getNamedElement(libPackage.getOwnedTypes(), PivotPackage.Literals.ELEMENT.getName()) != null) {
				pivotMetaModel = libPackage;	// Custom meta-model
				return;
			}
		}
		OclMetaModel metaModelResource = new OclMetaModel(this, pivotLibrary.getName(), pivotLibrary.getNsURI());		// Standard meta-model
		pivotMetaModel = (org.eclipse.ocl.examples.pivot.Package)metaModelResource.getContents().get(0);
		addPackage(pivotMetaModel);
	}

	public Element loadResource(URI uri, String alias) {
		// if (EPackage.Registry.INSTANCE.containsKey(resourceOrNsURI))
		// return EPackage.Registry.INSTANCE.getEPackage(resourceOrNsURI);
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
				External2Pivot external2Pivot = external2PivotMap.get(uri);
				if (external2Pivot != null) {
					resource = external2Pivot.getResource();
				}
				else {
					ResourceSet resourceSet = getExternalResourceSet();
					try {
						resource = resourceSet.getResource(resourceURI, true);
					}
					catch (RuntimeException e) {
						resource = resourceSet.getResource(resourceURI, false);
						if (resource != null) {
							resourceSet.getResources().remove(resource);
							resource = null;
						}
						throw e;
					}
//					if (resource != null) {
//						if (externalResources == null) {
//							externalResources = new HashMap<URI, Resource>();
//						}
//						externalResources.put(uri, resource);
//					}
					//
					//	If this resource already loaded under its internal URI reuse old one
					//
					if (resource != null) { 
						List<EObject> contents = resource.getContents();
						if (contents.size() > 0) {
							EObject firstContent = contents.get(0);
							if (firstContent instanceof EPackage) {
								String firstURI = ((EPackage)firstContent).getNsURI();
								if (firstURI != null) {
									External2Pivot external2Pivot2 = external2PivotMap.get(URI.createURI(firstURI));
									if (external2Pivot2 != null) {
										resource = external2Pivot2.getResource();
									}
								}
							}
						}
					}
				}
			}
		}
		if (resource != null) {
			for (Factory factory : factoryMap) {
				if (factory.canHandle(resource)) {
					return factory.importFromResource(this, resource, uri.fragment());
				}
			}
			throw new IllegalArgumentException("Cannot ccreate pivot from '" + uri + "'");
//			logger.warn("Cannot convert to pivot for package with URI '" + uri + "'");
		}
		logger.warn("Cannot load package with URI '" + uri + "'");
		return null;
	}

	public void notifyChanged(Notification notification) {
	}

	public void removeExternalResource(External2Pivot external2Pivot) {
		external2PivotMap.remove(external2Pivot.getURI());
	}

	public void removeListener(MetaModelManagerListener listener) {
		if (listeners != null) {
			listeners.remove(listener);
		}
	}

	void removeTypeTracker(TypeTracker typeTracker) {
		if (type2tracker != null) {
			type2tracker.remove(typeTracker.getTarget());
		}
	}

	void removePackageTracker(PackageTracker packageTracker) {
		packageManager.removeTracker(packageTracker);
	}

	/**
	 * Return all matching operations.
	 */
	protected void resolveAllOperations(Set<Operation> allOperations, Type forType, Boolean selectStatic, String operationName, List<Parameter> parameters, Set<Type> alreadyVisited) {
		if (alreadyVisited.add(forType)) {
			int iMax = parameters.size();
			for (Operation candidateOperation : getLocalOperations(forType, selectStatic)) {
				if (operationName.equals(candidateOperation.getName())) {
					List<Parameter> candidateParameters = candidateOperation.getOwnedParameters();
					if (candidateParameters.size() == iMax) {
						int i = 0;
						for ( ; i < iMax; i++) {
							Type type = parameters.get(i).getType();
							Type candidateType = candidateParameters.get(i).getType();
							if (type != candidateType) {		// FIXME behavioural equivalence
								break;
							}
						}
						if (i >= iMax) {
							allOperations.add(candidateOperation);
						}
					}
				}
			}
			for (Type superType : getSuperClasses(forType)) {
				resolveAllOperations(allOperations, superType, selectStatic, operationName, parameters, alreadyVisited);
			}
		}
	}

	/**
	 * Return the un-overloaded operation.
	 */
	public Operation resolveBaseOperation(Operation operation) {
		Set<Operation> allOperations = new HashSet<Operation>();
		resolveAllOperations(allOperations, operation.getClass_(), operation.isStatic(), operation.getName(), operation.getOwnedParameters(), new HashSet<Type>());
		Operation baseOperation = operation;
		for (Operation candidateOperation : allOperations) {
			if (candidateOperation != operation) {
				Type baseType = baseOperation.getClass_();
				Type candidateType = candidateOperation.getClass_();
				if (conformsTo(baseType, candidateType, null)) {
					baseOperation = candidateOperation;
				}
			}
		}
		return baseOperation;
	}

	public Set<Operation> resolveLocalOperation(org.eclipse.ocl.examples.pivot.Class pivotClass,
			String operationName, Type... pivotArguments) {
		Map<TemplateParameter, ParameterableElement> templateParameterSubstitutions = null; 	// FIXME
		Set<Operation> pivotOperations = null;
		for (Operation pivotOperation : pivotClass.getOwnedOperations()) {
			if (operationName.equals(pivotOperation.getName())) {
				List<Parameter> pivotParameters = pivotOperation.getOwnedParameters();
				if (pivotArguments.length == pivotParameters.size()) {
					boolean typesConform = true;
					for (int i = 0; i < pivotArguments.length; i++) {
						Type argumentType = pivotArguments[i];
						Parameter pivotParameter = pivotParameters.get(i);
						Type parameterType = getTypeWithMultiplicity(pivotParameter);
						if (parameterType instanceof SelfType) {
							parameterType = pivotOperation.getClass_();
						}
						if (!conformsTo(argumentType, parameterType, templateParameterSubstitutions)) {
							typesConform = false;
							break;
						}
					}
					if (typesConform) {
						if (pivotOperations == null) {
							pivotOperations = new HashSet<Operation>();
						}
						pivotOperations.add(pivotOperation);
					}
				}
			}
		}
		return pivotOperations;
	}

	public Operation resolveOperation(Type leftType, String operationName, Type... rightTypes) {
		if (!(leftType instanceof org.eclipse.ocl.examples.pivot.Class)) {
			return null;
		}
		Set<Operation> candidateOperations = resolveOperations(
			(org.eclipse.ocl.examples.pivot.Class) leftType, operationName,
			rightTypes);
		if (candidateOperations == null) {
			return null;
		}
		if (candidateOperations.size() > 1) {
			logger.warn("Ambiguous operation '" + operationName + "'");
		}
		return candidateOperations.iterator().next();
	}

	public Set<Operation> resolveOperations(org.eclipse.ocl.examples.pivot.Class pivotClass,
			String operationName, Type... pivotArguments) {
		@SuppressWarnings("unused")
		Map<TemplateParameter, ParameterableElement> templateParameterSubstitutions = PivotUtil.getAllTemplateParameterSubstitutions(null, pivotClass);
		Set<Operation> pivotOperations = resolveLocalOperation(pivotClass, operationName, pivotArguments);
		for (TemplateBinding templateBinding : pivotClass.getTemplateBindings()) {
			TemplateSignature signature = templateBinding.getSignature();
			TemplateableElement template = signature.getTemplate();
			if (template instanceof org.eclipse.ocl.examples.pivot.Class) {
				Set<Operation> morePivotOperations = resolveLocalOperation((org.eclipse.ocl.examples.pivot.Class) template,
					operationName, pivotArguments);
				if (morePivotOperations != null) {
					if (pivotOperations == null) {
						pivotOperations = morePivotOperations;
					}
					else {
						pivotOperations.addAll(morePivotOperations);
					}
				}
			}
		}
		if (pivotOperations == null) {
			List<org.eclipse.ocl.examples.pivot.Class> superClasses = pivotClass.getSuperClasses();
			if (!superClasses.isEmpty()) {
				for (org.eclipse.ocl.examples.pivot.Class superClass : superClasses) {
					Set<Operation> superOperations = resolveOperations(superClass,
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
			else {
				AnyType oclAnyType = getOclAnyType();
				if (pivotClass != oclAnyType) {		// Typically a template parameter type
					pivotOperations = resolveOperations(oclAnyType, operationName, pivotArguments);
				}
			}
		}
		return pivotOperations;
	}

	public void setDefaultStandardLibraryURI(String defaultStandardLibraryURI) {
		this.defaultStandardLibraryURI = defaultStandardLibraryURI;
	}

	public void setLibraryLoadInProgress(boolean libraryLoadInProgress) {
		this.libraryLoadInProgress  = libraryLoadInProgress;	
	}

	public void setTarget(Notifier newTarget) {
		assert newTarget == pivotResourceSet;
	}

	public void unsetTarget(Notifier oldTarget) {
		assert oldTarget == pivotResourceSet;
	}
}