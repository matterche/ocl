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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.uml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLResource;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.profile.l2.L2Package;
import org.eclipse.uml2.uml.profile.l3.L3Package;
import org.eclipse.uml2.uml.resource.CMOF202UMLResource;
import org.eclipse.uml2.uml.resource.CMOF2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.UML212UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML212UMLResource;
import org.eclipse.uml2.uml.resource.UML22UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML22UMLResource;
import org.eclipse.uml2.uml.resource.UML302UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.UML302UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resource.XMI212UMLResource;
import org.eclipse.uml2.uml.resource.XMI222UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLExtendedMetaData;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;

public class UMLUtils	// FIXME This should be in MDT/UML2
{		
	private static final String CMOF_CONTENT_TYPE_IDENTIFIER = UMLUtils.class.getName() + ".cmof";
	private static final String UML_CONTENT_TYPE_IDENTIFIER = UMLUtils.class.getName() + ".uml";
	private static final String XMI_CONTENT_TYPE_IDENTIFIER = UMLUtils.class.getName() + ".xmi";

	private static final String[] CMOF_EXTENSIONS = new String[] { "cmof", "xmi", "xml" };
	private static final String[] UML_EXTENSIONS = new String[] { "uml", "xmi", "xml" };

//	private static final RootXMLContentHandlerImpl UML2_4_0_0 = new RootXMLContentHandlerImpl("org.eclipse.uml2.uml_4_0_0", new String[]{ "xmi" },
//		RootXMLContentHandlerImpl.XMI_KIND, "http://www.eclipse.org/uml2/4.0.0/UML", null);
	private static final RootXMLContentHandlerImpl CMOF_DEFAULT = new RootXMLContentHandlerImpl(CMOF_CONTENT_TYPE_IDENTIFIER, new String[]{ "cmof" },
		RootXMLContentHandlerImpl.XMI_KIND, "", null);
	private static final RootXMLContentHandlerImpl UML_DEFAULT = new RootXMLContentHandlerImpl(UML_CONTENT_TYPE_IDENTIFIER, new String[]{ "uml" },
		RootXMLContentHandlerImpl.XMI_KIND, "", null);
	private static final RootXMLContentHandlerImpl XMI_DEFAULT = new RootXMLContentHandlerImpl(XMI_CONTENT_TYPE_IDENTIFIER, new String[]{ "xmi", "xml" },
		RootXMLContentHandlerImpl.XMI_KIND, "", null);
	private static final RootXMLContentHandlerImpl ORG_OMG_CMOF_2_0 = new RootXMLContentHandlerImpl(CMOF2UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER, CMOF_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, CMOF2UMLResource.CMOF_2_0_METAMODEL_NS_URI/*http://schema.omg.org/spec/MOF/2.0/cmof.xml*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_CMOF_2_4 = new RootXMLContentHandlerImpl(CMOF2UMLResource.CMOF_2_4_CONTENT_TYPE_IDENTIFIER, CMOF_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, CMOF2UMLResource.CMOF_2_4_METAMODEL_NS_URI/*http://www.omg.org/spec/MOF/20100901*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_CMOF_2_4_1 = new RootXMLContentHandlerImpl(CMOF2UMLResource.CMOF_2_4_1_CONTENT_TYPE_IDENTIFIER, CMOF_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, CMOF2UMLResource.CMOF_2_4_1_METAMODEL_NS_URI/*http://www.omg.org/spec/MOF/20110701*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_1 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER, UML_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_1_NS_URI/*http://schema.omg.org/spec/UML/2.1*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_1_1 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER, UML_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI/*http://schema.omg.org/spec/UML/2.1.1*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_2 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER, UML_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_2_NS_URI/*http://schema.omg.org/spec/UML/2.2*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_4 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER, UML_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_4_NS_URI/*http://www.omg.org/spec/UML/20100901*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_4_1 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_4_1_CONTENT_TYPE_IDENTIFIER, UML_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_4_1_NS_URI/*http://www.omg.org/spec/UML/20110701*/, null);

	/**
	 * Set true once UML contents have been installed globally.
	 */
	private static boolean initializedGlobalContents = false;

	protected static void initializeContentHandler(List<ContentHandler> contentHandlers, ContentHandler contentHandler) {
		if (!contentHandlers.contains(contentHandler)) {
			contentHandlers.add(contentHandler);		
		}
	}

	/**
	 * Install the UML content handlers in the resourceSet's URIConverter, using the
	 * global URIConverter if resourceSet null.
	 */
	public static void initializeContentHandlers(ResourceSet resourceSet) {
		List<ContentHandler> contentHandlers;
		if (resourceSet != null) {
			contentHandlers = resourceSet.getURIConverter().getContentHandlers();
		}
		else {
			contentHandlers = ContentHandler.Registry.INSTANCE.get(ContentHandler.Registry.NORMAL_PRIORITY);
			if (contentHandlers == null) {
				contentHandlers = new ArrayList<ContentHandler>();
				ContentHandler.Registry.INSTANCE.put(ContentHandler.Registry.NORMAL_PRIORITY, contentHandlers);
			}
		}
		//
		//	Defaults first for use for extension only matches.
		//
		initializeContentHandler(contentHandlers, CMOF_DEFAULT);		
		initializeContentHandler(contentHandlers, UML_DEFAULT);		
		initializeContentHandler(contentHandlers, XMI_DEFAULT);		
		//
		//	Explicit NS URIs later for use for exact matches.
		//
		initializeContentHandler(contentHandlers, ORG_OMG_CMOF_2_0);		
		initializeContentHandler(contentHandlers, ORG_OMG_CMOF_2_4);		
		initializeContentHandler(contentHandlers, ORG_OMG_CMOF_2_4_1);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_1);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_1_1);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_2);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_4);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_4_1);		
	}

	/**
	 * Install the UML Contents registrations globally, with synchronization to ensure that
	 * registration only occurs once.
	 */
	public static void initializeContents() {
		if (!initializedGlobalContents) {
			synchronized (UMLUtils.class) {
				if (!initializedGlobalContents) {
					initializedGlobalContents = true;
					initializeContents(null);
				}
			}
		}
	}

	/**
	 * Install the UML Contents registrations in the resourceSet registries and maps.
	 * This should generally be called twice. Once with a null ResourceSet so that appropriate
	 * registrations such as ecore2xml are accessible from the transient ResourceSets used
	 * by the UML support. And again for any ResourceSet in which a 'UML' file will be opened
	 * to ensure that the content type handlers are in place to resolve UML dialects.
	 */
	public static void initializeContents(ResourceSet resourceSet) {
//	    if (resourceSet != null) {
//	    	System.out.println(Thread.currentThread().getName() + " init " + resourceSet.getClass().getName() + "@" + Integer.toHexString(resourceSet.hashCode()));
//	    }
		Resource.Factory.Registry resourceFactoryRegistry = resourceSet != null ? resourceSet.getResourceFactoryRegistry() : Resource.Factory.Registry.INSTANCE;

		Map<String, Object> extensionToFactoryMap = resourceFactoryRegistry.getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl()); //$NON-NLS-1$
		extensionToFactoryMap.put(Ecore2XMLResource.FILE_EXTENSION, Ecore2XMLResource.Factory.INSTANCE);
		//
		//	Remove extensions handled by content type
		//
		extensionToFactoryMap.remove(CMOF2UMLResource.FILE_EXTENSION);
		extensionToFactoryMap.remove(UMLResource.FILE_EXTENSION);
		extensionToFactoryMap.remove("xmi");
		extensionToFactoryMap.remove("xml");

		Map<String, Object> contentTypeToFactoryMap = resourceFactoryRegistry.getContentTypeToFactoryMap();
		contentTypeToFactoryMap.put(CMOF_CONTENT_TYPE_IDENTIFIER, CMOF2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(UML_CONTENT_TYPE_IDENTIFIER, UML302UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI_CONTENT_TYPE_IDENTIFIER, new XMIResourceFactoryImpl());
//		contentTypeToFactoryMap.put(UML212UMLResource.UML_2_0_0_CONTENT_TYPE_IDENTIFIER, UML212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(UML212UMLResource.UML_2_1_0_CONTENT_TYPE_IDENTIFIER, UML212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(UML302UMLResource.UML_3_0_0_CONTENT_TYPE_IDENTIFIER, UML302UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(UML302UMLResource.UML_4_0_0_CONTENT_TYPE_IDENTIFIER, UML302UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(UML22UMLResource.UML2_CONTENT_TYPE_IDENTIFIER, UML22UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI212UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER, XMI212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI212UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER, XMI212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI222UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER, XMI222UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI2UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER, XMI2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI2UMLResource.UML_2_4_1_CONTENT_TYPE_IDENTIFIER, XMI2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(CMOF202UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER, CMOF202UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(CMOF2UMLResource.CMOF_2_4_CONTENT_TYPE_IDENTIFIER, CMOF2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(CMOF2UMLResource.CMOF_2_4_1_CONTENT_TYPE_IDENTIFIER, CMOF2UMLResource.Factory.INSTANCE);
		
		Map<URI, URI> uriMap = resourceSet != null ? resourceSet.getURIConverter().getURIMap() : URIConverter.URI_MAP;
		uriMap.putAll(UML302UMLExtendedMetaData.getURIMap());
		uriMap.putAll(UML212UMLExtendedMetaData.getURIMap());
		uriMap.putAll(UML22UMLExtendedMetaData.getURIMap());
		uriMap.putAll(XMI2UMLExtendedMetaData.getURIMap());
		uriMap.putAll(CMOF2UMLExtendedMetaData.getURIMap());
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/profiles/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/metamodels/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/libraries/", true)); //$NON-NLS-1$

		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();
		L3Package.eINSTANCE.eClass();
		L2Package.eINSTANCE.eClass();
		Ecore2XMLPackage.eINSTANCE.eClass();		
		
		EPackage.Registry packageRegistry = resourceSet != null ? resourceSet.getPackageRegistry() : EPackage.Registry.INSTANCE;
		packageRegistry.put(XMI2UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_2_4_URI, TypesPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_1_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_2_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_4_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_4_1_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(UML302UMLResource.UML_METAMODEL_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);

		packageRegistry.put(CMOF2UMLResource.CMOF_2_0_METAMODEL_URI, UMLPackage.eINSTANCE);

		initializeContentHandlers(resourceSet);
	}
}
