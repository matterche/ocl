/**
 * <copyright>
 * 
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.ocl.ecore.tests;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.options.EvaluationOptions;

/**
 * Tests for the name overload and override resolution.
 */
@SuppressWarnings("nls")
public class NamesTest extends AbstractTestSuite
{
	protected static final String NAMES_TEST_XMI = "/model/NamesTest.xmi";
	
	public EClass level0Class;
	public EObject container;
	public EObject level0;
	public EObject level1;
	public EObject level2a;
	public EObject level2b;
	public EObject level3;
	public EObject level4;
	//
	// Test framework
	//
	@Override
	protected void setUp() {
		super.setUp();
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi", new EcoreResourceFactoryImpl());		
		}
	}

	protected void initModel() {
		URI uri = getTestModelURI(NAMES_TEST_XMI);
		Resource testResource = resourceSet.getResource(uri, true);
		container = testResource.getContents().get(0);
		EClass containerClass = container.eClass();
		EPackage namesTestPackage = containerClass.getEPackage();
		level0Class = (EClass) namesTestPackage.getEClassifier("Level0");
//		EFactory namesTestFactory = namesTestPackage.getEFactoryInstance();
		EStructuralFeature level0Name = level0Class.getEStructuralFeature("name");
		level0 = getObject(container, level0Name, "level0");
		level1 = getObject(container, level0Name, "level1");
		level2a = getObject(container, level0Name, "level2a");
		level2b = getObject(container, level0Name, "level2b");
		level3 = getObject(container, level0Name, "level3");
		level4 = getObject(container, level0Name, "level4");
	}

	private EObject getObject(EObject eContainer, EStructuralFeature eFeature, Object values) {
		for (EObject eObject : eContainer.eContents()) {
			if (values.equals(eObject.eGet(eFeature))) {
				return eObject;
			}
		}
		return null;
	}

	public void test_overrides() {
		initModel();
		helper.setContext(level0Class);
		assertQueryEquals(level0, "Level0::overridden", "self.overridden()");
		assertQueryEquals(level3, "Level0::overridden", "self.overridden()");
        EvaluationOptions.setOption(helper.getOCL().getEvaluationEnvironment(), EvaluationOptions.DYNAMIC_DISPATCH, true);
		assertQueryEquals(level3, "Level3::overridden", "self.overridden()");
		EvaluationOptions.setOption(helper.getOCL().getEvaluationEnvironment(), EvaluationOptions.DYNAMIC_DISPATCH, false);
	}
}
