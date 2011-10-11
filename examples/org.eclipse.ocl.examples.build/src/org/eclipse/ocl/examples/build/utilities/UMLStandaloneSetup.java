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

import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.utils.Mapping;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.profile.l2.L2Package;
import org.eclipse.uml2.uml.profile.l3.L3Package;
import org.eclipse.uml2.uml.resource.CMOF202UMLResource;
import org.eclipse.uml2.uml.resource.UML302UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * Initializes UML support.
 */
public class UMLStandaloneSetup extends StandaloneSetup
{
	private Logger log = Logger.getLogger(getClass());

	public UMLStandaloneSetup() {
		log.info("Registering UML Resources");
		L2Package.eINSTANCE.eClass();
		L3Package.eINSTANCE.eClass();
		ResourceSet targetResourceSet = null;
		Resource.Factory.Registry resourceFactoryRegistry = Resource.Factory.Registry.INSTANCE;
		resourceFactoryRegistry.getExtensionToFactoryMap().put(
				UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		resourceFactoryRegistry.getExtensionToFactoryMap().put(
				CMOF202UMLResource.FILE_EXTENSION, CMOF202UMLResource.Factory.INSTANCE);
		Map<URI, URI> uriMap = targetResourceSet != null
			? targetResourceSet.getURIConverter().getURIMap()
			: URIConverter.URI_MAP;		
//	uriMap.put(URI.createURI(UMLEnvironment.OCL_STANDARD_LIBRARY_NS_URI), URI.createFileURI(oclLocation + "/model/oclstdlib.uml")); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/profiles/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/metamodels/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/libraries/", true)); //$NON-NLS-1$
		EPackage.Registry registry2 = registry;		// Workaround JDT invisible class anomally
		registry2.put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE);
		registry2.put(UML302UMLResource.UML_METAMODEL_NS_URI, UMLPackage.eINSTANCE);
//		UMLPlugin.getEPackageNsURIToProfileLocationMap().put("http://www.eclipse.org/uml2/schemas/Ecore/5", URI.createURI("pathmap://UML_PROFILES/Ecore.profile.uml#_0"));
//		UMLPlugin.getEPackageNsURIToProfileLocationMap().put("http://www.eclipse.org/uml2/schemas/Standard/1", URI.createURI("pathmap://UML_PROFILES/Standard.profile.uml#_0"));
		UMLPlugin.getEPackageNsURIToProfileLocationMap().put("http://www.eclipse.org/uml2/schemas/Ecore/5", URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/UML_PROFILES/Ecore.profile.uml#_0", true));
		UMLPlugin.getEPackageNsURIToProfileLocationMap().put("http://www.eclipse.org/uml2/schemas/Standard/1", URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/UML_PROFILES/Standard.profile.uml#_0", true));
	}
	
	/**
	 * Adds an <tt>org.eclipse.uml2.uml.dynamic_package</tt> extension
	 * 
	 * @param m the mapping
	 * <br><tt>from</tt>: The absolute or relative URI of the UML profile represented by the dynamic Ecore package,
	 * <br><tt>to</tt>: A namespace URI that uniquely identifies a dynamic Ecore package
	 * @throws ConfigurationException
	 *             <ul>
	 *             <li>No known reason
	 *             </ul>
	 */
	public void addRegisterDynamicPackage(final Mapping m) throws ConfigurationException {
		log.info("Adding Dynamic UML mapping from '" + m.getFrom() + "' to '" + m.getTo() + "'");
		try {
			URI ecoreURI = URI.createURI(m.getTo());
			UMLPlugin.getEPackageNsURIToProfileLocationMap().put(m.getFrom(), ecoreURI);
		}
		catch (final Exception e) {
			throw new ConfigurationException(e);
		}
	}
}