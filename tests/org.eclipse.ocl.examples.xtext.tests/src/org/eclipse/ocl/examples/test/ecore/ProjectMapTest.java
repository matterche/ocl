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
import org.eclipse.ocl.examples.pivot.PivotPackage;

/**
 */
public class ProjectMapTest extends TestCase
{

	protected void doTestProjectMap(EPackage modelPackage, String modelPath) {
		URI nsURI = URI.createURI(modelPackage.getNsURI());
		URI pluginURI = URI.createPlatformPluginURI(modelPath, true);
		URI resourceURI = URI.createPlatformResourceURI(modelPath, true);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		new ProjectMap().initializeResourceSet(resourceSet);
		Resource registeredResource = resourceSet.getResource(nsURI, true);
		Resource pluginResource = resourceSet.getResource(pluginURI, true);
		Resource projectResource = resourceSet.getResource(resourceURI, true);
		assertEquals(registeredResource, pluginResource);
		assertEquals(registeredResource, projectResource);
	}
	
	public void testProjectMap_CompareDiff() {				// Usually just a plugin; always a plugin on Hudson
		String modelPath = "org.eclipse.emf.compare.diff/model/diff.ecore";
		doTestProjectMap(DiffPackage.eINSTANCE, modelPath);
	}
	
	public void testProjectMap_Ecore() {					// Often just a plugin; always a plugin on Hudson
		String modelPath = "org.eclipse.emf.ecore/model/Ecore.ecore";
		doTestProjectMap(EcorePackage.eINSTANCE, modelPath);
	}
	
	public void testProjectMap_JavaVMTypes() {				// Usually just a plugin; always a plugin on Hudson
		String modelPath = "org.eclipse.xtext.common.types/model/JavaVMTypes.ecore";
		doTestProjectMap(org.eclipse.xtext.common.types.TypesPackage.eINSTANCE, modelPath);
	}
	
	public void testProjectMap_Pivot() {					// Almost certainly a workspace project; always a project on Hudson
		String modelPath = PivotPackage.class.getPackage().getName() + "/model/pivot.ecore";
		doTestProjectMap(PivotPackage.eINSTANCE, modelPath);
	}
}
