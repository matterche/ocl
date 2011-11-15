/**
 * <copyright>
 * 
 * Copyright (c) 2007,2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   E.D.Willink - Bug 283509, 296409
 *
 * </copyright>
 *
 * $Id: KeywordsTest.java,v 1.3 2011/02/19 12:03:51 ewillink Exp $
 */

package org.eclipse.ocl.examples.test.ecore;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;

/**
 */
public class ProjectMapTest extends TestCase
{
	public void testEcore() {
		EcorePackage.eINSTANCE.getClass();
		URI nsURI = URI.createURI(EcorePackage.eNS_URI);
		URI pluginURI = URI.createPlatformPluginURI("org.eclipse.emf.ecore/model/Ecore.ecore", true);
		URI resourceURI = URI.createPlatformResourceURI("org.eclipse.emf.ecore/model/Ecore.ecore", true);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		new ProjectMap().initializeResourceSet(resourceSet);
		Resource registeredResource = resourceSet.getResource(nsURI, true);
		Resource pluginResource = resourceSet.getResource(pluginURI, true);
		Resource projectResource = resourceSet.getResource(resourceURI, true);
		assertEquals(registeredResource, pluginResource);
		assertEquals(registeredResource, projectResource);
	}
}
