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
 * $Id: UMLStandaloneSetup.java,v 1.3 2011/02/02 18:50:54 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.utilities;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.xmi.impl.RootXMLContentHandlerImpl;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.uml2.uml.resource.CMOF2UMLResource;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.resources.util.ResourcesUtil;

/**
 * Initializes UML support.
 */
public class UMLStandaloneSetup extends StandaloneSetup
{
	private Logger log = Logger.getLogger(getClass());
	private static final String CMOF_CONTENT_TYPE_IDENTIFIER = UMLStandaloneSetup.class.getName() + ".cmof";
	private static final String UML_CONTENT_TYPE_IDENTIFIER = UMLStandaloneSetup.class.getName() + ".uml";
	private static final String XMI_CONTENT_TYPE_IDENTIFIER = UMLStandaloneSetup.class.getName() + ".xmi";

	private static final String[] CMOF_EXTENSIONS = new String[] { "cmof", "xmi", "xml" };
	private static final String[] UML_EXTENSIONS = new String[] { "uml", "xmi", "xml" };

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
	private static final RootXMLContentHandlerImpl ORG_OMG_UML_2_4_1 = new RootXMLContentHandlerImpl(XMI2UMLResource.UML_2_4_1_CONTENT_TYPE_IDENTIFIER, UML_EXTENSIONS,
		RootXMLContentHandlerImpl.XMI_KIND, XMI2UMLResource.UML_METAMODEL_2_4_1_NS_URI/*http://www.omg.org/spec/UML/20110701*/, null);

	protected static void initializeContentHandler(List<ContentHandler> contentHandlers, ContentHandler contentHandler) {
		if (!contentHandlers.contains(contentHandler)) {
			contentHandlers.add(contentHandler);		
		}
	}

	public UMLStandaloneSetup() {
		log.info("Registering UML Resources");
		Ecore2XMLPackage.eINSTANCE.eClass();		

		List<ContentHandler> contentHandlers = ContentHandler.Registry.INSTANCE.get(ContentHandler.Registry.NORMAL_PRIORITY);
			if (contentHandlers == null) {
				contentHandlers = new ArrayList<ContentHandler>();
				ContentHandler.Registry.INSTANCE.put(ContentHandler.Registry.NORMAL_PRIORITY, contentHandlers);
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
		initializeContentHandler(contentHandlers, ORG_OMG_UML_2_4_1);		
		ResourcesUtil.init(null);
	}
}