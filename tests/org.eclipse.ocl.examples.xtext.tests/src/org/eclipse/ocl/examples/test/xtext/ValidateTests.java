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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.pivot.values.Bag;
import org.eclipse.ocl.examples.pivot.values.impl.BagImpl;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator;
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

	protected EObject eCreate(EPackage ePackage, String className) {
		EClass eClass = (EClass) ePackage.getEClassifier(className);
		EFactory eFactoryInstance = ePackage.getEFactoryInstance();
		return eFactoryInstance.create(eClass);
	}

	protected void eSet(EObject eObject, String eFeatureName, Object value) {
		EClass eClass = eObject.eClass();
		EStructuralFeature eFeature = eClass.getEStructuralFeature(eFeatureName);
		assert eFeature != null;
		eObject.eSet(eFeature, value);
	}

	/**
	 * Return the difference between expectedMessages and actualMessages, or null if no differences.
	 * 
	 * The return is formatted one message per line with a leading new-line followed by
	 * an expected/actual count in parentheses followed by the messages 
	 */
	public static String formatMessageDifferences(Bag<String> expectedMessages, Bag<String> actualMessages) {
		Set<String> allMessages = new HashSet<String>(expectedMessages);
		allMessages.addAll(actualMessages);
		StringBuffer s = null;
		for (String message : allMessages) {
			int actualCount = actualMessages.count(message);
			int expectedCount = expectedMessages.count(message);
			if (actualCount != expectedCount) {
				if (s == null) {
					s = new StringBuffer();
				}
				s.append("\n  (" + expectedCount + "/" + actualCount + ") " + message);
			}
		}
		return s != null ? s.toString() : null;
	}

	public void testValidate_Validate_completeocl() throws IOException, InterruptedException {
		//
		//	Create model
		//
		Resource ecoreResource = doLoadOCLinEcore("Validate", "oclinecore");
		EPackage validatePackage = (EPackage) ecoreResource.getContents().get(0);
		URI oclURI = getProjectFileURI("Validate.ocl");
		CompleteOCLEObjectValidator completeOCLEObjectValidator = new CompleteOCLEObjectValidator(validatePackage, oclURI);
		EValidator.Registry.INSTANCE.put(validatePackage, completeOCLEObjectValidator);
		EObject testInstance = eCreate(validatePackage, "Level3");
		String template = OCLMessages.ValidationConstraintIsNotSatisfied_ERROR_;
		//
		//	No errors
		//
		eSet(testInstance, "ref", "xx");
		eSet(testInstance, "l1", "xx");
		eSet(testInstance, "l2a", "xx");
		eSet(testInstance, "l2b", "xx");
		eSet(testInstance, "l3", "xx");
		String objectLabel = EObjectValidator.getObjectLabel(testInstance, null);
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING);
		//
		//	CompleteOCL errors all round
		//
		eSet(testInstance, "ref", "xxx");
		eSet(testInstance, "l1", "xxx");
		eSet(testInstance, "l2a", "xxx");
		eSet(testInstance, "l2b", "xxx");
		eSet(testInstance, "l3", "xxx");
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING,
			NLS.bind(template,  "V1", objectLabel),
			NLS.bind(template,  "V2a", objectLabel),
			NLS.bind(template,  "V2b", objectLabel),
			NLS.bind(template,  "V3", objectLabel));
		//
		//	One CompleteOCl and one OCLinEcore
		//
		eSet(testInstance, "ref", "ok");
		eSet(testInstance, "l1", "ok");
		eSet(testInstance, "l2a", "bad");
		eSet(testInstance, "l2b", "ok");
		eSet(testInstance, "l3", "ok");
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING,
			NLS.bind(template,  "L2a", objectLabel),
			NLS.bind(template,  "V2a", objectLabel));
	}

	public void testValidate_Validate_oclinecore() throws IOException, InterruptedException {
		//
		//	Create model
		//
		Resource ecoreResource = doLoadOCLinEcore("Validate", "oclinecore");
		EPackage validatePackage = (EPackage) ecoreResource.getContents().get(0);
		EObject testInstance = eCreate(validatePackage, "Level3");
		eSet(testInstance, "ref", "ref");
		eSet(testInstance, "l1", "l1");
		eSet(testInstance, "l2a", "l2a");
		eSet(testInstance, "l2b", "l2b");
		eSet(testInstance, "l3", "l3");
		String objectLabel = EObjectValidator.getObjectLabel(testInstance, null);
		//
		//	Check EObjectValidator errors
		//
		EValidator.Registry.INSTANCE.put(validatePackage, EObjectValidator.INSTANCE);
		String template = EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic");
		checkValidationDiagnostics(testInstance, Diagnostic.ERROR,
			NLS.bind(template,  "L1", objectLabel),
			NLS.bind(template,  "L2a", objectLabel),
//BUG355184		NLS.bind(template,  "L2b", objectLabel),
			NLS.bind(template,  "L3", objectLabel));
		//
		//	Check OCLinEcoreEObjectValidator warnings and distinct message
		//
		EValidator.Registry.INSTANCE.put(validatePackage, new OCLinEcoreEObjectValidator());
		template = OCLMessages.ValidationConstraintIsNotSatisfied_ERROR_;
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING,
			NLS.bind(template,  "L1", objectLabel),
			NLS.bind(template,  "L2a", objectLabel),
//BUG355184		NLS.bind(template,  "L2b", objectLabel),
			NLS.bind(template,  "L3", objectLabel));
		//
		//	No errors
		//
		eSet(testInstance, "ref", "ok");
		eSet(testInstance, "l1", "ok");
		eSet(testInstance, "l2a", "ok");
		eSet(testInstance, "l2b", "ok");
		eSet(testInstance, "l3", "ok");
		objectLabel = EObjectValidator.getObjectLabel(testInstance, null);
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING);
		//
		//	Just one error
		//
		eSet(testInstance, "ref", "ok");
		eSet(testInstance, "l1", "bad");
		eSet(testInstance, "l2a", "ok");
		eSet(testInstance, "l2b", "ok");
		eSet(testInstance, "l3", "ok");
		objectLabel = EObjectValidator.getObjectLabel(testInstance, null);
		checkValidationDiagnostics(testInstance, Diagnostic.WARNING,
			NLS.bind(template,  "L1", objectLabel));
	}
}
