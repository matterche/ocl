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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.values.Bag;
import org.eclipse.ocl.examples.domain.values.impl.BagImpl;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotDiagnostician;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.ocl.examples.xtext.oclinecore.validation.OCLinEcoreEObjectValidator;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;
import org.eclipse.osgi.util.NLS;

import codegen.company.CodegencompanyPackage;

/**
 * Tests that OCL for model validation works.
 */
public class ValidateTests extends XtextTestCase
{	
	protected MetaModelManager metaModelManager;

	public static void checkValidationDiagnostics(EObject testInstance, int severity, String... expectedMessage) {
		Bag<String> expectedMessages = new BagImpl<String>();
		for (String message : expectedMessage) {
			expectedMessages.add(message);
		}
		Diagnostic diagnostics = PivotDiagnostician.INSTANCE.validate(testInstance);
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

	public Resource doLoadOCLinEcore(String stem) throws IOException {
		String inputName = stem + ".oclinecore";
		String ecoreName = stem + ".ecore";
		URI inputURI = getProjectFileURI(inputName);
		URI ecoreURI = getProjectFileURI(ecoreName);
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
//			ResourceSet resourceSet = new ResourceSetImpl();
			BaseCSResource xtextResource = (BaseCSResource) resourceSet.createResource(inputURI);
			MetaModelManagerResourceAdapter.getAdapter(xtextResource, metaModelManager);
			xtextResource.load(null);
			assertNoResourceErrors("Load failed", xtextResource);
			CS2PivotResourceAdapter adapter = CS2PivotResourceAdapter.getAdapter(xtextResource, metaModelManager);
			Resource pivotResource = adapter.getPivotResource(xtextResource);
			assertNoUnresolvedProxies("Unresolved proxies", xtextResource);
			assertNoValidationErrors("Pivot validation errors", pivotResource.getContents().get(0));
			Resource ecoreResource = savePivotAsEcore(metaModelManager, pivotResource, ecoreURI, true);
			return ecoreResource;
		}
		finally {
			metaModelManager.dispose();
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

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		if (metaModelManager != null) {
			metaModelManager.dispose();
			metaModelManager = null;
		}
		PivotEnvironmentFactory.disposeGlobalRegistryInstance();
		super.tearDown();
	}

	public void testValidate_Bug366229_oclinecore() throws IOException, InterruptedException {
		metaModelManager = new MetaModelManager();
		//
		//	Create model
		//
		Resource ecoreResource = doLoadOCLinEcore("Bug366229");
		MetaModelManagerResourceSetAdapter.getAdapter(ecoreResource.getResourceSet(), metaModelManager);
		EPackage overloadsPackage = (EPackage) ecoreResource.getContents().get(0);
		EObject testInstance = eCreate(overloadsPackage, "SubClass");
		//
		//	Check EObjectValidator errors
		//
		EValidator.Registry.INSTANCE.put(overloadsPackage, EObjectValidator.INSTANCE);
		checkValidationDiagnostics(testInstance, Diagnostic.ERROR);
	}

	public void testValidate_Validate_completeocl() throws IOException, InterruptedException {
		metaModelManager = new MetaModelManager();
		//
		//	Create model
		//
		Resource ecoreResource = doLoadOCLinEcore("Validate");
		EPackage validatePackage = (EPackage) ecoreResource.getContents().get(0);
		URI oclURI = getProjectFileURI("Validate.ocl");
		CompleteOCLEObjectValidator completeOCLEObjectValidator = new CompleteOCLEObjectValidator(validatePackage, oclURI, metaModelManager);
		EValidator.Registry.INSTANCE.put(validatePackage, completeOCLEObjectValidator);
		try {
			EObject testInstance = eCreate(validatePackage, "Level3");
			String template = EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_;
			//
			//	No errors
			//
			eSet(testInstance, "ref", "xx");
			eSet(testInstance, "l1", "xx");
			eSet(testInstance, "l2a", "xx");
			eSet(testInstance, "l2b", "xx");
			eSet(testInstance, "l3", "xx");
			String objectLabel = PivotDiagnostician.INSTANCE.getObjectLabel(testInstance);
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
		finally {
			EValidator.Registry.INSTANCE.remove(validatePackage);			
		}
	}

	public void testValidate_Validate_oclinecore() throws IOException, InterruptedException {
		metaModelManager = new MetaModelManager();
		//
		//	Create model
		//
		Resource ecoreResource = doLoadOCLinEcore("Validate");
		MetaModelManagerResourceSetAdapter.getAdapter(ecoreResource.getResourceSet(), metaModelManager);
		EPackage validatePackage = (EPackage) ecoreResource.getContents().get(0);
		EObject testInstance = eCreate(validatePackage, "Level3");
		eSet(testInstance, "ref", "ref");
		eSet(testInstance, "l1", "l1");
		eSet(testInstance, "l2a", "l2a");
		eSet(testInstance, "l2b", "l2b");
		eSet(testInstance, "l3", "l3");
		String objectLabel = PivotDiagnostician.INSTANCE.getObjectLabel(testInstance);
		//
		//	Check EObjectValidator errors
		//
		EValidator.Registry.INSTANCE.put(validatePackage, EObjectValidator.INSTANCE);
		try {
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
			template = EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_;
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
			objectLabel = PivotDiagnostician.INSTANCE.getObjectLabel(testInstance);
			checkValidationDiagnostics(testInstance, Diagnostic.WARNING);
			//
			//	Just one error
			//
			eSet(testInstance, "ref", "ok");
			eSet(testInstance, "l1", "bad");
			eSet(testInstance, "l2a", "ok");
			eSet(testInstance, "l2b", "ok");
			eSet(testInstance, "l3", "ok");
			objectLabel = PivotDiagnostician.INSTANCE.getObjectLabel(testInstance);
			checkValidationDiagnostics(testInstance, Diagnostic.WARNING,
				NLS.bind(template,  "L1", objectLabel));
		} finally {
			EValidator.Registry.INSTANCE.remove(validatePackage);
		}
	}

	public Resource testResource;
	public EPackage companyPackage;
	public EFactory companyFactory;
	public EClass companyClass;
	public EAttribute companyName;
	public EReference companyEmployees;
	public EAttribute companySize;
	public EClass employeeClass;
	public EAttribute employeeName;
	public EReference employeeManager;
	public EReference employeeDirectReports;
	public EReference employeeAllReports;
	public EOperation employeeReportsTo;
	public EEnum sizeKind;
	public Enumerator sizeSmall;
	public Enumerator sizeMedium;
	public Enumerator sizeLarge;
	public EObject acme;
	public Map<String, EObject> employees;
	public EClass badClassClass;
	public EReference companyDetritus;
	
	protected static final String COMPANY_XMI = "/model/Company.xmi";	
	public Map<Object, Object> context = new HashMap<Object, Object>();
	
	void add(EObject owner, EStructuralFeature feature, Object value) {
		this.<EList<Object>> get(owner, feature).add(value);
	}

	EObject create(EObject owner, EReference containment, EClass type,
			String name) {
		EObject result = companyFactory.create(type);

		if (containment.isMany()) {
			add(owner, containment, result);
		} else {
			set(owner, containment, result);
		}

		if (name != null) {
			set(result, type.getEStructuralFeature("name"), name);
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	<T> T get(EObject owner, EStructuralFeature feature) {
		Object result = owner.eGet(feature);
		return (T) result;
	}

	public EOperation getOperation(EClass eClass, String name) {
		for (EOperation eOperation : eClass.getEOperations()) {
			if (name.equals(eOperation.getName())) {
				return eOperation;
			}
		}
		fail("Expected to find operation: " + name);
		return null;
	}

	public void doTest_invariantValidation(String modelName, boolean hasInvariants, int severity) {
		initModel(modelName);
		EObject joe = create(acme, companyEmployees, employeeClass, "Joe");
		if (hasInvariants) {
			validateInvariantWithSeverity("noManagerImpliesDirectReports", severity, joe);
		}
		else {
			validateConstraintWithSeverity("noManagerImpliesDirectReports", severity, joe);
		}

		set(employee("Amy"), employeeManager, joe);
		validateWithoutError(joe);
	}

	EObject employee(String name) {
		EObject result = employees.get(name);

		if (result == null) {
			EList<EObject> emps = get(acme, companyEmployees);

			for (EObject next : emps) {

				if (name.equals(name(next))) {
					result = next;
					employees.put(name, result);
					break;
				}
			}
		}

		return result;
	}

	protected void initModel(String testModelName) {
		URI uri = getTestModelURI(testModelName);
		testResource = resourceSet.getResource(uri, true);
		
		acme = testResource.getContents().get(0);

		companyClass = acme.eClass();
		companyPackage = companyClass.getEPackage();
		companyFactory = companyPackage.getEFactoryInstance();

		companyName = (EAttribute) companyClass.getEStructuralFeature("name");
		companyEmployees = (EReference) companyClass
			.getEStructuralFeature("employees");
		companySize = (EAttribute) companyClass.getEStructuralFeature("size");

		employeeClass = companyEmployees.getEReferenceType();
		employeeName = (EAttribute) employeeClass.getEStructuralFeature("name");
		employeeManager = (EReference) employeeClass
			.getEStructuralFeature("manager");
		employeeDirectReports = (EReference) employeeClass
			.getEStructuralFeature("directReports");
		employeeAllReports = (EReference) employeeClass
			.getEStructuralFeature("allReports");
		employeeReportsTo = getOperation(employeeClass, "reportsTo");

		sizeKind = (EEnum) companySize.getEAttributeType();
		sizeSmall = sizeKind.getEEnumLiteral("small").getInstance();
		sizeMedium = sizeKind.getEEnumLiteral("medium").getInstance();
		sizeLarge = sizeKind.getEEnumLiteral("large").getInstance();

		employees = new java.util.HashMap<String, EObject>();
//		MetaModelManagerResourceAdapter.getAdapter(companyPackage.eResource(), metaModelManager);
	}

	String name(EObject employeeOrCompany) {
		EAttribute name = employeeClass.isInstance(employeeOrCompany)
			? employeeName
			: companyName;

		return get(employeeOrCompany, name);
	}

	void set(EObject owner, EStructuralFeature feature, Object value) {
		owner.eSet(feature, value);
	}

	public void testValidate_Company_Ecore() {
		resourceSet.getPackageRegistry().put(CodegencompanyPackage.eNS_URI, CodegencompanyPackage.eINSTANCE);
		doTest_invariantValidation(COMPANY_XMI, false, Diagnostic.WARNING);
	}

	protected void validateConstraintWithSeverity(String constraintName, int severity, EObject eObject) {
		Diagnostic validation = PivotDiagnostician.INSTANCE.validate(eObject, context);
		assertEquals("Validation of '" + constraintName + "' severity:", severity, validation.getSeverity());
		List<Diagnostic> diagnostics = validation.getChildren();
		assertEquals("Validation of '" + constraintName + "' child count:", 1, diagnostics.size());
		Diagnostic diagnostic = diagnostics.get(0);
		assertEquals("Validation of '" + constraintName + "' data count:", 1, diagnostic.getData().size());
		assertEquals("Validation of '" + constraintName + "' data object:", eObject, diagnostic.getData().get(0));
		Object objectLabel = PivotDiagnostician.INSTANCE.getObjectLabel(eObject);
		String message = NLS.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_, constraintName, objectLabel);
		assertEquals("Validation of '" + constraintName + "' message:", message, diagnostic.getMessage());
	}

	protected void validateInvariantWithSeverity(String constraintName, int severity, EObject eObject) {
		validateWithSeverity(constraintName, severity, eObject, EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic"), constraintName, PivotDiagnostician.INSTANCE.getObjectLabel(eObject));
	}

	protected void validateWithoutError(EObject eObject) {
		Diagnostic validation = PivotDiagnostician.INSTANCE.validate(eObject, context);
		if (validation.getSeverity() != Diagnostic.OK) {
			List<Diagnostic> diagnostics = validation.getChildren();
			if (!diagnostics.isEmpty()) {
				StringBuilder s = new StringBuilder();
				for (Diagnostic diagnostic : diagnostics) {
					s.append(diagnostic.getMessage());
					s.append("\n");
				}
				fail(s.toString());
			}
		}
		assertEquals("Validation severity:", Diagnostic.OK, validation.getSeverity());
		List<Diagnostic> diagnostics = validation.getChildren();
		assertEquals("Validation child count:", 0, diagnostics.size());
	}

	protected void validateWithSeverity(String constraintName, int severity, EObject eObject, String messageTemplate, Object... bindings) {
		Diagnostic validation = PivotDiagnostician.INSTANCE.validate(eObject, context);
		assertEquals("Validation of '" + constraintName + "' severity:", severity, validation.getSeverity());
		List<Diagnostic> diagnostics = validation.getChildren();
		assertEquals("Validation of '" + constraintName + "' child count:", 1, diagnostics.size());
		Diagnostic diagnostic = diagnostics.get(0);
		assertEquals("Validation of '" + constraintName + "' data count:", 1, diagnostic.getData().size());
		assertEquals("Validation of '" + constraintName + "' data object:", eObject, diagnostic.getData().get(0));
		String message = NLS.bind(messageTemplate, bindings);
		assertEquals("Validation of '" + constraintName + "' message:", message, diagnostic.getMessage());
	}
}
