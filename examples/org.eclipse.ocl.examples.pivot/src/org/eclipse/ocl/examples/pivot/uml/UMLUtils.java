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
	private static final String[] EXTENSIONS = new String[] { "uml", "xmi", "xml" };
//	private static final RootXMLContentHandlerImpl UML2_4_0_0 = new RootXMLContentHandlerImpl("org.eclipse.uml2.uml_4_0_0", new String[]{ "xmi" },
//		RootXMLContentHandlerImpl.XMI_KIND, "http://www.eclipse.org/uml2/4.0.0/UML", null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_1 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER, EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_1_NS_URI/*http://schema.omg.org/spec/UML/2.1*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_1_1 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER, EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI/*http://schema.omg.org/spec/UML/2.1.1*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_2 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER, EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_2_NS_URI/*http://schema.omg.org/spec/UML/2.2*/, null);
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_4 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER, EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_4_NS_URI/*http://www.omg.org/spec/UML/20100901*/, null);

	/**
	 * Set true once UML contents have been installed globally.
	 */
	private static boolean initializedGlobalContents = false;

	protected static void initializeContentHandler(List<ContentHandler> contentHandlers, ContentHandler contentHandler) {
		if (!contentHandlers.contains(contentHandler)) {
			contentHandlers.add(contentHandler);		
		}
	}

	public static void initializeContentHandlers(ResourceSet resourceSet) {
		URIConverter uriConverter = resourceSet != null ? resourceSet.getURIConverter() : URIConverter.INSTANCE;;
		List<ContentHandler> contentHandlers = uriConverter.getContentHandlers();
//		initializeContentHandler(contentHandlers, UML2_4_0_0);
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_1);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_1_1);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_2);		
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_4);		
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
	 */
	public static void initializeContents(ResourceSet resourceSet) {
//	    if (resourceSet != null) {
//	    	System.out.println(Thread.currentThread().getName() + " init " + resourceSet.getClass().getName() + "@" + Integer.toHexString(resourceSet.hashCode()));
//	    }
		Resource.Factory.Registry resourceFactoryRegistry = resourceSet != null ? resourceSet.getResourceFactoryRegistry() : Resource.Factory.Registry.INSTANCE;

		Map<String, Object> extensionToFactoryMap = resourceFactoryRegistry.getExtensionToFactoryMap();
		extensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl()); //$NON-NLS-1$
		extensionToFactoryMap.put(Ecore2XMLResource.FILE_EXTENSION, Ecore2XMLResource.Factory.INSTANCE);
		extensionToFactoryMap.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		extensionToFactoryMap.put(CMOF202UMLResource.FILE_EXTENSION, CMOF202UMLResource.Factory.INSTANCE);

		Map<String, Object> contentTypeToFactoryMap = resourceFactoryRegistry.getContentTypeToFactoryMap();
		contentTypeToFactoryMap.put(UML302UMLResource.UML_3_0_0_CONTENT_TYPE_IDENTIFIER, UML302UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(UML212UMLResource.UML_2_1_0_CONTENT_TYPE_IDENTIFIER, UML212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(UML22UMLResource.UML2_CONTENT_TYPE_IDENTIFIER, UML22UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI2UMLResource.UML_2_4_CONTENT_TYPE_IDENTIFIER, XMI2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI222UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER, XMI222UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI212UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER, XMI212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(XMI212UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER, XMI212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(CMOF2UMLResource.CMOF_2_4_CONTENT_TYPE_IDENTIFIER, CMOF2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(CMOF202UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER, CMOF202UMLResource.Factory.INSTANCE);

		Map<URI, URI> uriMap = resourceSet != null ? resourceSet.getURIConverter().getURIMap() : URIConverter.URI_MAP;;
		uriMap.putAll(UML302UMLExtendedMetaData.getURIMap());
		uriMap.putAll(UML212UMLExtendedMetaData.getURIMap());
		uriMap.putAll(UML22UMLExtendedMetaData.getURIMap());
		uriMap.putAll(XMI2UMLExtendedMetaData.getURIMap());
		uriMap.putAll(CMOF2UMLExtendedMetaData.getURIMap());
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/profiles/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/metamodels/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/libraries/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI("http://schema.omg.org/spec/XMI/2.1"), URI.createURI("http://www.omg.org/XMI", true)); //$NON-NLS-1$

		L2Package.eINSTANCE.eClass();
		L3Package.eINSTANCE.eClass();
		Ecore2XMLPackage.eINSTANCE.eClass();

		
		
		EPackage.Registry packageRegistry = resourceSet != null ? resourceSet.getPackageRegistry() : EPackage.Registry.INSTANCE;
		packageRegistry.put("http://www.omg.org/spec/UML/20100901/PrimitiveTypes.xmi", TypesPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_1_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_1_1_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_2_NS_URI, UMLPackage.eINSTANCE);
		packageRegistry.put(XMI2UMLResource.UML_METAMODEL_2_4_NS_URI, UMLPackage.eINSTANCE);

		packageRegistry.put(UML302UMLResource.UML_METAMODEL_NS_URI, UMLPackage.eINSTANCE);

		packageRegistry.put(CMOF2UMLResource.CMOF_2_0_METAMODEL_URI, UMLPackage.eINSTANCE);

		initializeContentHandlers(resourceSet);
	}
}
