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
import org.eclipse.emf.compare.diff.metamodel.DiffPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.IPackageDescriptor;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.IProjectDescriptor;
import org.eclipse.ocl.examples.pivot.PivotPackage;

/**
 */
public class ProjectMapTest extends TestCase
{

	protected void doTestProjectMapRegistered(EPackage modelPackage, String modelPath) {
		URI nsURI = URI.createURI(modelPackage.getNsURI());
		URI pluginURI = URI.createPlatformPluginURI(modelPath, true);
		URI resourceURI = URI.createPlatformResourceURI(modelPath, true);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		new ProjectMap().initializeResourceSet(resourceSet);
		Resource registeredResource = resourceSet.getResource(nsURI, true);
		assertNull(registeredResource.getResourceSet());		// Registered packages have a private shared resource
		assertEquals(registeredResource.getURI(), nsURI);
		Resource pluginResource = resourceSet.getResource(pluginURI, true);
		Resource projectResource = resourceSet.getResource(resourceURI, true);
		assertEquals(registeredResource, pluginResource);
		assertEquals(registeredResource, projectResource);
		assertNull(registeredResource.getResourceSet());
	}

	protected void doTestProjectMapLocal(EPackage ePackage, String project, String modelPath) {
		ProjectMap.getResourceFactoryRegistry(null).getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		URI nsURI = URI.createURI(ePackage.getNsURI());
		URI pluginURI = URI.createPlatformPluginURI(modelPath, true);
		URI resourceURI = URI.createPlatformResourceURI(modelPath, true);
		ResourceSet resourceSet = new ResourceSetImpl();
		ProjectMap projectMap = new ProjectMap();
		projectMap.initializeResourceSet(resourceSet);
		IProjectDescriptor projectDescriptor = projectMap.getProjectDescriptor(project);
		IPackageDescriptor packageDescriptor = projectDescriptor.getPackageDescriptor(URI.createURI(ePackage.getNsURI()));
		packageDescriptor.setUseModel(true, resourceSet.getPackageRegistry());
		Resource registeredResource = resourceSet.getResource(nsURI, true);
		assertNull(registeredResource.getResourceSet());		// Registered packages have a private shared resource
		assertEquals(registeredResource.getURI(), packageDescriptor.getEcoreModelURI().resolve(projectDescriptor.getLocationURI()));
		Resource pluginResource = resourceSet.getResource(pluginURI, true);
		Resource projectResource = resourceSet.getResource(resourceURI, true);
		assertEquals(registeredResource, pluginResource);
		assertEquals(registeredResource, projectResource);
	}
	
	public void testProjectMap_CompareDiff() {				// Usually just a plugin; always a plugin on Hudson
		String modelPath = "org.eclipse.emf.compare.diff/model/diff.ecore";
		doTestProjectMapRegistered(DiffPackage.eINSTANCE, modelPath);
	}
	
	public void testProjectMap_Ecore() {					// Often just a plugin; always a plugin on Hudson
		String modelPath = "org.eclipse.emf.ecore/model/Ecore.ecore";
		doTestProjectMapRegistered(EcorePackage.eINSTANCE, modelPath);
	}
	
	public void testProjectMap_JavaVMTypes() {				// Usually just a plugin; always a plugin on Hudson
		String modelPath = "org.eclipse.xtext.common.types/model/JavaVMTypes.ecore";
		doTestProjectMapRegistered(org.eclipse.xtext.common.types.TypesPackage.eINSTANCE, modelPath);
	}
	
	public void testProjectMap_Pivot() {					// Almost certainly a workspace project; always a project on Hudson
		String modelPath = PivotPackage.class.getPackage().getName() + "/model/Pivot.ecore";
		doTestProjectMapRegistered(PivotPackage.eINSTANCE, modelPath);
	}
	
	public void testProjectMap_Pivot_Local() {					// Almost certainly a workspace project; always a project on Hudson
		String project = PivotPackage.class.getPackage().getName();
		String modelPath = project + "/model/Pivot.ecore";
		doTestProjectMapLocal(PivotPackage.eINSTANCE, project, modelPath);
	}
}
