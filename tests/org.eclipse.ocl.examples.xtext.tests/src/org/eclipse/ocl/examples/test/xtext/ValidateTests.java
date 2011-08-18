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
package org.eclipse.ocl.examples.test.xtext;

import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.QueryDelegate;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLQueryDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.pivot.utilities.TypeManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.values.Bag;
import org.eclipse.ocl.examples.pivot.values.impl.BagImpl;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.oclinecore.validation.OCLinEcoreEObjectValidator;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;
import org.eclipse.osgi.util.NLS;

/**
 * Tests that OCL for model validation works.
 */
public class ValidateTests extends XtextTestCase
{	
	protected TypeManager typeManager = null;

	public static void checkValidationDiagnostics(EObject testInstance, int severity, String... expectedMessage) {
		Bag<String> expectedMessages = new BagImpl<String>();
		for (String message : expectedMessage) {
			expectedMessages.add(message);
		}
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(testInstance);
		Bag<String> actualMessages = new BagImpl<String>();
		for (Diagnostic diagnostic : diagnostics.getChildren()) {
			assertEquals(severity, diagnostic.getSeverity());
			actualMessages.add(diagnostic.getMessage());
		}
		String s = formatMessageDifferences(expectedMessages, actualMessages);
		if (s != null) {
			fail("Inconsistent validation: (expected/actual) message" + s);
		}
	}	

	public Resource doLoadOCLinEcore(String stem, String extension) throws IOException {
		String inputName = stem + "." + extension;
		String ecoreName = inputName + ".ecore";
		URI inputURI = getProjectFileURI(inputName);
		URI ecoreURI = getProjectFileURI(ecoreName);
		CS2PivotResourceAdapter adapter = null;
		try {
			typeManager = new TypeManager();
			BaseCSResource xtextResource = (BaseCSResource) resourceSet.getResource(inputURI, true);
			assertNoResourceErrors("Load failed", xtextResource);
			adapter = CS2PivotResourceAdapter.getAdapter(xtextResource, typeManager);
			Resource pivotResource = adapter.getPivotResource(xtextResource);
			assertNoUnresolvedProxies("Unresolved proxies", xtextResource);
			assertNoValidationErrors("Pivot validation errors", pivotResource.getContents().get(0));
			Resource ecoreResource = savePivotAsEcore(typeManager, pivotResource, ecoreURI, true);
			return ecoreResource;
		}
		finally {
			if (adapter != null) {
				adapter.dispose();
				adapter.getTypeManager().dispose();
			}
		}
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
			oclDelegateURI, new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
			.put(oclDelegateURI, new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
			new OCLValidationDelegateFactory.Global());
		QueryDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLQueryDelegateFactory.Global());
	}

	@Override
	protected void tearDown() throws Exception {
		unloadCS(resourceSet);
		TypeManagerResourceSetAdapter adapter = TypeManagerResourceSetAdapter.findAdapter(resourceSet);
		if (adapter != null) {
			TypeManager typeManager = adapter.getTypeManager();
			if (typeManager != null) {
				typeManager.dispose();
			}
		}
		if (typeManager != null) {
			typeManager.dispose();
			typeManager = null;
		}
		super.tearDown();
	}

	public void testValidate_Validate_oclinecore() throws IOException, InterruptedException {
		//
		//	Create model and dynamic accessors
		//
		Resource ecoreResource = doLoadOCLinEcore("Validate", "oclinecore");
		EPackage validatePackage = (EPackage) ecoreResource.getContents().get(0);
		EClass validateL1 = (EClass) validatePackage.getEClassifier("Level1");
		EClass validateL2a = (EClass) validatePackage.getEClassifier("Level2a");
		EClass validateL2b = (EClass) validatePackage.getEClassifier("Level2b");
		EClass validateL3 = (EClass) validatePackage.getEClassifier("Level3");
		EAttribute validate_ref = (EAttribute) validateL1.getEStructuralFeature("ref");
		EAttribute validate_l1 = (EAttribute) validateL1.getEStructuralFeature("l1");
		EAttribute validate_l2a = (EAttribute) validateL2a.getEStructuralFeature("l2a");
		EAttribute validate_l2b = (EAttribute) validateL2b.getEStructuralFeature("l2b");
		EAttribute validate_l3 = (EAttribute) validateL3.getEStructuralFeature("l3");
		EFactory validateFactory = validatePackage.getEFactoryInstance();
		//
		//	Create trivial test instance
		//
		EObject testInstance = validateFactory.create(validateL3);
		testInstance.eSet(validate_ref, "ref");
		testInstance.eSet(validate_l1, "l1");
		testInstance.eSet(validate_l2a, "l2a");
		testInstance.eSet(validate_l2b, "l2b");
		testInstance.eSet(validate_l3, "l3");
		String objectLabel = EObjectValidator.getObjectLabel(testInstance, null);
		//
		//	Check EObjectValidator errors
		//
		EValidator.Registry.INSTANCE.put(validatePackage, EObjectValidator.INSTANCE);
		String template = EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic");
		checkValidationDiagnostics(testInstance, Diagnostic.ERROR,
			NLS.bind(template,  "L1", objectLabel),
			NLS.bind(template,  "L2a", objectLabel),
//EcoreFeature		NLS.bind(template,  "L2b", objectLabel),
			NLS.bind(template,  "L3", objectLabel));
		//
		//	Check OCLinEcoreEObjectValidator warnings and distinct message
		//
		EValidator.Registry.INSTANCE.put(validatePackage, new OCLinEcoreEObjectValidator());
		template = OCLMessages.ValidationConstraintIsNotSatisfied_ERROR_;
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING,
			NLS.bind(template,  "L1", objectLabel),
			NLS.bind(template,  "L2a", objectLabel),
//EcoreFeature		NLS.bind(template,  "L2b", objectLabel),
			NLS.bind(template,  "L3", objectLabel));
		//
		//	No errors
		//
		testInstance.eSet(validate_ref, "ok");
		testInstance.eSet(validate_l1, "ok");
		testInstance.eSet(validate_l2a, "ok");
		testInstance.eSet(validate_l2b, "ok");
		testInstance.eSet(validate_l3, "ok");
		objectLabel = EObjectValidator.getObjectLabel(testInstance, null);
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING);
		//
		//	Just one error
		//
		testInstance.eSet(validate_ref, "ok");
		testInstance.eSet(validate_l1, "bad");
		testInstance.eSet(validate_l2a, "ok");
		testInstance.eSet(validate_l2b, "ok");
		testInstance.eSet(validate_l3, "ok");
		objectLabel = EObjectValidator.getObjectLabel(testInstance, null);
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING,
			NLS.bind(template,  "L1", objectLabel));
	}
}
