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
package org.eclipse.ocl.examples.build.utilities;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
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

/**
 * Reads a specified <tt>uri</tt> into a designated <tt>modelSlot</tt>.
 */
public class XMI2UMLResourceReader extends WorkflowComponentWithModelSlot
{
	private Logger log = Logger.getLogger(getClass());	
	private ResourceSet resourceSet = null;	
	protected String uri;	

	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	public String getUri() {
		return uri;
	}

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor arg1, Issues arg2) {
		URI fileURI = URI.createPlatformResourceURI(uri, true);
		log.info("Reading '" + fileURI + "'");
		try {
			ResourceSet resourceSet = getResourceSet();
			Resource resource = resourceSet.createResource(fileURI, XMI2UMLResource.UML_CONTENT_TYPE_IDENTIFIER);
			resource.load(null);
			EcoreUtil.resolveAll(resourceSet);
			ResourceUtils.checkResourceSet(resourceSet);
			ctx.set(getModelSlot(), resource);
		} catch (IOException e) {
			throw new RuntimeException("Problems running " + getClass().getSimpleName(), e);
		}
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		Map<String, Object> contentTypeToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getContentTypeToFactoryMap();

		contentTypeToFactoryMap.put(
			UML302UMLResource.UML_3_0_0_CONTENT_TYPE_IDENTIFIER,
			UML302UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			UML212UMLResource.UML_2_1_0_CONTENT_TYPE_IDENTIFIER,
			UML212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			UML22UMLResource.UML2_CONTENT_TYPE_IDENTIFIER,
			UML22UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			XMI2UMLResource.UML_CONTENT_TYPE_IDENTIFIER,
			XMI2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			XMI222UMLResource.UML_2_2_CONTENT_TYPE_IDENTIFIER,
			XMI222UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			XMI212UMLResource.UML_2_1_1_CONTENT_TYPE_IDENTIFIER,
			XMI212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			XMI212UMLResource.UML_2_1_CONTENT_TYPE_IDENTIFIER,
			XMI212UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			CMOF2UMLResource.CMOF_CONTENT_TYPE_IDENTIFIER,
			CMOF2UMLResource.Factory.INSTANCE);
		contentTypeToFactoryMap.put(
			CMOF202UMLResource.CMOF_2_0_CONTENT_TYPE_IDENTIFIER,
			CMOF202UMLResource.Factory.INSTANCE);

		Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();

		uriMap.putAll(UML302UMLExtendedMetaData.getURIMap());
		uriMap.putAll(UML212UMLExtendedMetaData.getURIMap());
		uriMap.putAll(UML22UMLExtendedMetaData.getURIMap());
		uriMap.putAll(XMI2UMLExtendedMetaData.getURIMap());
		uriMap.putAll(CMOF2UMLExtendedMetaData.getURIMap());

		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/profiles/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/metamodels/", true)); //$NON-NLS-1$
		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), URI.createPlatformPluginURI("/org.eclipse.uml2.uml.resources/libraries/", true)); //$NON-NLS-1$

		L2Package.eINSTANCE.eClass();
		L3Package.eINSTANCE.eClass();

		Registry packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put("http://www.omg.org/spec/UML/20100901/PrimitiveTypes.xmi", TypesPackage.eINSTANCE);
		packageRegistry.put("http://www.omg.org/spec/UML/20100901", UMLPackage.eINSTANCE);
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
