/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: UML2Ecore2Pivot.java,v 1.4 2011/05/20 15:27:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.uml;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;

public class UML2Ecore2Pivot extends Ecore2Pivot
{
	private static final class Factory implements MetaModelManager.Factory
	{
		private Factory() {
			UMLPackage.eINSTANCE.getClass();
			MetaModelManager.addFactory(this);
		}

		public boolean canHandle(Resource resource) {
			return isUML(resource);
		}

		public void configure(ResourceSet resourceSet) {
			UML2Ecore2Pivot.initialize(resourceSet);
		}

		public URI getPackageURI(EObject eObject) {
			if (eObject instanceof org.eclipse.uml2.uml.Package) {
				String uri = ((org.eclipse.uml2.uml.Package)eObject).getURI();
				if (uri != null) {
					return URI.createURI(uri);
				}
			}
			return null;
		}

		public Element importFromResource(MetaModelManager metaModelManager, Resource umlResource, String uriFragment) {
			if (umlResource == null) {
				return null;
			}
			UML2Ecore2Pivot conversion = findAdapter(umlResource, metaModelManager);
			if ((conversion == null) && (umlResource.getContents().size() > 0)) {
				EObject firstContent = umlResource.getContents().get(0);
				for (EObject eContainer = firstContent.eContainer(); eContainer != null; eContainer = eContainer.eContainer()) {
					conversion = findAdapter(eContainer.eResource(), metaModelManager);
					if (conversion != null) {
						break;
					}
				}
			}
			if (conversion == null) {
				conversion = getAdapter(umlResource, metaModelManager);
			}
			org.eclipse.ocl.examples.pivot.Package pivotRoot = conversion.getPivotRoot();
			if (uriFragment == null) {
				return pivotRoot;
			}
			else {
				EObject umlObject = umlResource.getEObject(uriFragment);
				if (umlObject == null) {
					return null;
				}
				return conversion.getPivotOfUML(Element.class, umlObject);
			}
		}
	}

	protected static class UML2EcoreConverterWithReverseMap extends UML2EcoreConverter
	{
		private Map<EModelElement, org.eclipse.uml2.uml.Element> reverseMap = null;
		
		public org.eclipse.uml2.uml.Element getSource(EModelElement eObject) {
			if (reverseMap == null) {
				reverseMap = new HashMap<EModelElement, org.eclipse.uml2.uml.Element>();
				for (Map.Entry<org.eclipse.uml2.uml.Element, EModelElement> entry : elementToEModelElementMap.entrySet()) {
					reverseMap.put(entry.getValue(), entry.getKey());
				}
			}
			return reverseMap.get(eObject);
		}

		@Override
		public Object casePackage(org.eclipse.uml2.uml.Package package_) {
			EPackage ePackage = (EPackage) super.casePackage(package_);
			ePackage.setNsPrefix(null);
			return ePackage;
		}
	}


	public static MetaModelManager.Factory FACTORY = new Factory();
//	private static final Logger logger = Logger.getLogger(UML2Ecore2Pivot.class);

	// FIXME this is a prehistoric value
//	private static final String OCL_STANDARD_LIBRARY_NS_URI = "http://www.eclipse.org/ocl/1.1.0/oclstdlib.uml"; //$NON-NLS-1$

	public static UML2Ecore2Pivot findAdapter(Resource resource, MetaModelManager metaModelManager) {
		assert metaModelManager != null;
		if (resource == null) {
			return null;
		}
		for (Adapter adapter : resource.eAdapters()) {
			if (adapter instanceof UML2Ecore2Pivot) {
				UML2Ecore2Pivot ecore2Pivot = (UML2Ecore2Pivot)adapter;
				if (ecore2Pivot.getMetaModelManager() == metaModelManager) {
					return ecore2Pivot;
				}
			}
		}
		return null;
	}

	public static UML2Ecore2Pivot getAdapter(Resource resource, MetaModelManager metaModelManager) {
		if (resource == null) {
			return null;
		}
		List<Adapter> eAdapters = resource.eAdapters();
		UML2Ecore2Pivot adapter = PivotUtil.getAdapter(UML2Ecore2Pivot.class, resource);
		if (adapter != null) {
			return adapter;
		}
		adapter = new UML2Ecore2Pivot(resource, metaModelManager);
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
	public static org.eclipse.ocl.examples.pivot.Package importFromUML(MetaModelManager metaModelManager, String alias, Resource umlResource) {
		if (umlResource == null) {
			return null;
		}
		UML2Ecore2Pivot conversion = getAdapter(umlResource, metaModelManager);
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
	 * <p>
	 * This method is used to configure the ResourceSet used to load the OCL Standard Library.

	 * @param resourceSet to be initialized or null for global initialization
	 * @return a failure reason, null if successful
	 */
	public static String initialize(ResourceSet resourceSet) {
		final String resourcesPluginId = "org.eclipse.uml2.uml.resources"; //$NON-NLS-1$
		String resourcesLocation = null;
		StandaloneProjectMap projectMap = StandaloneProjectMap.findAdapter(resourceSet);
		if (projectMap != null) {
			URI locationURI = projectMap.getLocation(resourcesPluginId);
			if (locationURI != null) {
				resourcesLocation = locationURI.toString();
				while (resourcesLocation.endsWith("/")) {
					resourcesLocation = resourcesLocation.substring(0, resourcesLocation.length()-1);
				}
			}
		}
		if (resourcesLocation == null)
			return "'" + resourcesPluginId + "' not found on class-path"; //$NON-NLS-1$
		Resource.Factory.Registry resourceFactoryRegistry = resourceSet != null
			? resourceSet.getResourceFactoryRegistry()
			: Resource.Factory.Registry.INSTANCE;
		resourceFactoryRegistry.getExtensionToFactoryMap().put(
			UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Map<URI, URI> uriMap = resourceSet != null
			? resourceSet.getURIConverter().getURIMap()
			: URIConverter.URI_MAP;		
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), URI.createURI(resourcesLocation + "/profiles/")); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.createURI(resourcesLocation + "/metamodels/")); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), URI.createURI(resourcesLocation + "/libraries/")); //$NON-NLS-1$
		return null;
	}

	public static boolean isUML(Resource resource) {
		List<EObject> contents = resource.getContents();
		for (EObject content : contents) {
			if (content instanceof org.eclipse.uml2.uml.Package) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Convert an (annotated) Ecore object to a pivot element. 
	 * 
	 * @param eObject the annotated Ecore object
	 * 
	 * @return the pivot element
	 *
	public static Element importFromUML(MetaModelManager metaModelManager, String alias, EObject eObject) {
		if (eObject == null) {
			return null;
		}
		Resource ecoreResource = eObject.eResource();
		UML2Ecore2Pivot conversion = getAdapter(ecoreResource, metaModelManager);
		org.eclipse.ocl.examples.pivot.Package pivotRoot = conversion.getPivotRoot();
		if (pivotRoot == null) {
			return null;
		}
		return conversion.createMap.get(eObject);
	} */
	
	protected final Resource umlResource;					// Set via eAdapters.add()
	private UML2EcoreConverterWithReverseMap uml2EcoreConverter = null;
	private Map<String, String> options = null;

	public UML2Ecore2Pivot(Resource umlResource, MetaModelManager metaModelManager) {
		super(metaModelManager.getExternalResourceSet().createResource(umlResource.getURI().appendFileExtension("ecore")), metaModelManager);
		this.umlResource = umlResource;
	}

	@Override
	public void addMapping(EObject eObject, Element pivotElement) {
		if ((uml2EcoreConverter != null) && (eObject instanceof EModelElement)) {
			org.eclipse.uml2.uml.Element umlElement = uml2EcoreConverter.getSource((EModelElement)eObject);
			super.addMapping(umlElement, pivotElement);
			addCreated(eObject, pivotElement);
		}
		else {
			super.addMapping(eObject, pivotElement);
		}
	}

	@Override
	protected URI createPivotURI() {
		return PivotUtil.getPivotURI(umlResource.getURI());
	}

	@Override
	public void dispose() {
		super.dispose();
//		CacheAdapter.INSTANCE.clear(umlResource);
	}

	@Override
	public <T extends Element> T getCreated(Class<T> requiredClass, EObject eObject) {
		EObject ecoreObject = (EObject) uml2EcoreConverter.doSwitch(eObject);
		if (ecoreObject == null) {
			ecoreObject = eObject;
		}
		return super.getCreated(requiredClass, ecoreObject);
	}

	public <T extends Element> T getPivotOfUML(Class<T> requiredClass, EObject eObject) {
		EObject ecoreObject = (EObject) uml2EcoreConverter.doSwitch(eObject);
		return getPivotOfEcore(requiredClass, ecoreObject);
	}

	@Override
	public Package getPivotRoot() {
		if (pivotRoot == null) {
			List<EObject> contents = umlResource.getContents();
			if (options == null) {
				options = new HashMap<String, String>();
				options.put(UML2EcoreConverter.OPTION__ECORE_TAGGED_VALUES, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__REDEFINING_OPERATIONS, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__REDEFINING_PROPERTIES, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__SUBSETTING_PROPERTIES, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__UNION_PROPERTIES, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__DERIVED_FEATURES, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATIONS, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__DUPLICATE_OPERATION_INHERITANCE, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURES, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__DUPLICATE_FEATURE_INHERITANCE, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__SUPER_CLASS_ORDER, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__ANNOTATION_DETAILS, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__INVARIANT_CONSTRAINTS, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__OPERATION_BODIES, UMLUtil.OPTION__PROCESS);
				options.put(UML2EcoreConverter.OPTION__COMMENTS,  UMLUtil.OPTION__PROCESS);
			}
			if (uml2EcoreConverter == null) {
				uml2EcoreConverter = new UML2EcoreConverterWithReverseMap();
			}
			Collection<? extends EObject> ecoreContents = uml2EcoreConverter.convert(contents, options, null, null);
			ecoreResource.getContents().addAll(ecoreContents);
		}
		return super.getPivotRoot();
	}

	@Override
	public Resource getResource() {
		return umlResource;
	}

	@Override
	public Notifier getTarget() {
		return umlResource;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == UML2Ecore2Pivot.class;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		assert (newTarget == null) || (newTarget == umlResource);
	}

	@Override
	public void unsetTarget(Notifier oldTarget) {
		assert (oldTarget == umlResource);
	}
}