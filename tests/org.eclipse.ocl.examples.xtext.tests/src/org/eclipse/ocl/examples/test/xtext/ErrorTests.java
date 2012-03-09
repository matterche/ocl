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
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.test.xtext;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.pivot.tests.PivotTestCase;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;
import org.eclipse.osgi.util.NLS;

/**
 * Tests for OclAny operations.
 */
@SuppressWarnings("nls")
public class ErrorTests extends PivotTestCase
{

	@Override
    protected void setUp() throws Exception {
        super.setUp();
        OCLstdlib.install();
        OCLinEcoreStandaloneSetup.doSetup();
    }

	/**
	 * Test a bad operation for bad iterate arguments. Inspired by Bug 352386.
	 */
	public void test_BadIterate() throws IOException {
		MetaModelManager metaModelManager = new MetaModelManager();
		String metaModelText =
			"package test : tst = 'http://test'\n" +
			"{\n" +
			"	class Test\n" +
			"	{\n" +
			"		invariant set: Set{1, 2, 3}->size() = 3;\n" +
			"		invariant loop: Test.allInstances()->iterate(w, h; acc : String = '' | true);\n" +
			"	}\n" +
			"}\n";
		InputStream inputStream = new ByteArrayInputStream(metaModelText.getBytes());
		URI xtextURI = URI.createURI("test.oclinecore");
		ResourceSet resourceSet = new ResourceSetImpl();
		EssentialOCLCSResource xtextResource = (EssentialOCLCSResource) resourceSet.createResource(xtextURI, null);
		MetaModelManagerResourceAdapter.getAdapter(xtextResource, metaModelManager);
		xtextResource.load(inputStream, null);
		assertResourceErrors("Loading Xtext", xtextResource,
			NLS.bind(OCLMessages.UnresolvedOperation_ERROR_, "iterate", "Set<test.oclinecore::test::Test>' and 'w, h, String| true"));
        //
		metaModelManager.dispose();
	}
	
	/**
	 * Test a bad operation for bad iterate arguments. Inspired by Bug 352386.
	 */
	public void test_BadProperty() throws IOException {
		MetaModelManager metaModelManager = new MetaModelManager();
		String metaModelText =
			"package test : tst = 'http://test'\n" +
			"{\n" +
			"	class Test\n" +
			"	{\n" +
			"		invariant loop: Test.allInstances->iterate(w, h; acc : String = '' | true);\n" +
			"	}\n" +
			"}\n";
		InputStream inputStream = new ByteArrayInputStream(metaModelText.getBytes());
		URI xtextURI = URI.createURI("test.oclinecore");
		ResourceSet resourceSet = new ResourceSetImpl();
		EssentialOCLCSResource xtextResource = (EssentialOCLCSResource) resourceSet.createResource(xtextURI, null);
		MetaModelManagerResourceAdapter.getAdapter(xtextResource, metaModelManager);
		xtextResource.load(inputStream, null);
		assertResourceErrors("Loading Xtext", xtextResource,
			NLS.bind(OCLMessages.UnresolvedProperty_ERROR_, "allInstances", "ClassClassifier<test.oclinecore::test::Test>"),
			NLS.bind(OCLMessages.UnresolvedOperation_ERROR_, "iterate", "Set<OclInvalid>' and 'w, h, String| true"));
        //
		metaModelManager.dispose();
	}
}
