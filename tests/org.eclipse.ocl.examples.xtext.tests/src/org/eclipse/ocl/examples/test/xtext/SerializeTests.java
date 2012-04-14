/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: SerializeTests.java,v 1.19 2011/05/14 11:18:40 ewillink Exp $
 */
package org.eclipse.ocl.examples.test.xtext;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.uml.UML2Ecore2Pivot;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.resource.XtextResource;

/**
 * Tests that check that an Ecore model can be serialized to OCLinEcore.
 */
public class SerializeTests extends XtextTestCase
{
	private static ProjectMap projectMap = null;
	public static ProjectMap getProjectMap() {
		if (projectMap == null) {
			projectMap = new ProjectMap();
		}
		return projectMap;
	}
	
	public XtextResource doSerialize(String stem) throws Exception {
		return doSerialize(stem, stem, null, true, true);
	}
	public XtextResource doSerialize(String stem, String referenceStem, Map<String, Object> options, boolean doCompare, boolean validateSaved) throws Exception {
		String inputName = stem + ".ecore";
		URI inputURI = getProjectFileURI(inputName);
		String referenceName = referenceStem + ".ecore";
		URI referenceURI = getProjectFileURI(referenceName);
		return doSerialize(inputURI, stem, referenceURI, options, doCompare, validateSaved);
	}
	public XtextResource doSerialize(URI inputURI, String stem, URI referenceURI, Map<String, Object> options, boolean doCompare, boolean validateSaved) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		getProjectMap().initializeResourceSet(resourceSet);
		String outputName = stem + ".serialized.oclinecore";
		URI outputURI = getProjectFileURI(outputName);
		//
		//	Load as Ecore
		//
		Resource ecoreResource = loadEcore(inputURI);
		//
		//	Ecore to Pivot
		//		
		MetaModelManager metaModelManager1 = new MetaModelManager();
		XtextResource xtextResource = null;
		try {
			Resource pivotResource = getPivotFromEcore(metaModelManager1, ecoreResource);
			//
			//	Pivot to CS
			//		
			xtextResource = savePivotAsCS(metaModelManager1, pivotResource, outputURI);
			resourceSet.getResources().clear();
		}
		finally {
			metaModelManager1.dispose();
			metaModelManager1 = null;
		}
		MetaModelManager metaModelManager2 = new MetaModelManager();
		try {
			BaseCSResource xtextResource2 = (BaseCSResource) resourceSet.createResource(outputURI);
			MetaModelManagerResourceAdapter.getAdapter(xtextResource2, metaModelManager2);
			xtextResource2.load(null);
			assertNoResourceErrors("Reload failed", xtextResource2);
			assertNoUnresolvedProxies("unresolved reload proxies", xtextResource2);
			//
			//	CS to Pivot
			//	
			String pivotName2 = stem + "2.ecore.pivot";
			URI pivotURI2 = getProjectFileURI(pivotName2);
			Resource pivotResource2 = savePivotFromCS(metaModelManager2, xtextResource2, pivotURI2);
			//
			//	Pivot to Ecore
			//		
			String inputName2 = stem + "2.ecore";
			URI ecoreURI2 = getProjectFileURI(inputName2);
			Resource ecoreResource2 = savePivotAsEcore(metaModelManager2, pivotResource2, ecoreURI2, options, validateSaved);
			//
			//
			//
	//		assertSameModel(pivotResource, pivotResource2);
			Resource referenceResource = loadEcore(referenceURI);
			if (doCompare) {	// Workaround for Bug 354621
				assertSameModel(referenceResource, ecoreResource2);		
			}
			return xtextResource;
		}
		finally {
			metaModelManager2.dispose();
			metaModelManager2 = null;
		}
	}
	
	public XtextResource doSerializeUML(String stem) throws Exception {
		UMLPackage.eINSTANCE.getClass();
		//
		//	Load as Ecore
		//
		String inputName = stem + ".uml";
		URI inputURI = getProjectFileURI(inputName);
		Resource umlResource = loadUML(inputURI);
		//
		//	Ecore to Pivot
		//		
		MetaModelManager metaModelManager = new MetaModelManager();
		Resource pivotResource = getPivotFromUML(metaModelManager, umlResource);
		//
		//	Pivot to CS
		//		
		String outputName = stem + ".serialized.oclinecore";
		URI outputURI = getProjectFileURI(outputName);
		XtextResource xtextResource = savePivotAsCS(metaModelManager, pivotResource, outputURI);
		resourceSet.getResources().clear();
		BaseCSResource xtextResource2 = (BaseCSResource) resourceSet.getResource(outputURI, true);
		assertNoResourceErrors("Reload failed", xtextResource2);
		assertNoUnresolvedProxies("unresolved reload proxies", xtextResource2);
		//
		//	CS to Pivot
		//	
		String pivotName2 = stem + "2.ecore.pivot";
		URI pivotURI2 = getProjectFileURI(pivotName2);
		Resource pivotResource2 = savePivotFromCS(metaModelManager, xtextResource2, pivotURI2);
		//
		//	Pivot to Ecore
		//		
		String inputName2 = stem + "2.ecore";
		URI ecoreURI2 = getProjectFileURI(inputName2);
		Resource ecoreResource2 = savePivotAsEcore(metaModelManager, pivotResource2, ecoreURI2, true);
		//
		//
		//
//		assertSameModel(pivotResource, pivotResource2);
		UML2Ecore2Pivot uml2Ecore2Pivot = UML2Ecore2Pivot.getAdapter(umlResource, metaModelManager);
		Resource ecoreResource = uml2Ecore2Pivot.getEcoreResource();
		assertSameModel(ecoreResource, ecoreResource2);		
		return xtextResource;
	}

	protected Resource getPivotFromUML(MetaModelManager metaModelManager, Resource umlResource) {
		UML2Ecore2Pivot uml2Ecore2Pivot = UML2Ecore2Pivot.getAdapter(umlResource, metaModelManager);
		org.eclipse.ocl.examples.pivot.Package pivotRoot = uml2Ecore2Pivot.getPivotRoot();
		Resource pivotResource = pivotRoot.eResource();
		assertNoResourceErrors("Normalisation failed", pivotResource);
		assertNoValidationErrors("Normalisation invalid", pivotResource);
		return pivotResource;
	}

	protected Resource loadUML(URI inputURI) {
//		ResourceSet resourceSet = metaModelManager.getExternalResourceSet();
		assertNull(UML2Ecore2Pivot.initialize(resourceSet));
		Resource umlResource = resourceSet.getResource(inputURI, true);
		mapOwnURI(umlResource);
//		List<String> conversionErrors = new ArrayList<String>();
//		RootPackageCS documentCS = Ecore2OCLinEcore.importFromEcore(resourceSet, null, ecoreResource);
//		Resource eResource = documentCS.eResource();
		assertNoResourceErrors("Load failed", umlResource);
//		Resource xtextResource = resourceSet.createResource(outputURI, OCLinEcoreCSTPackage.eCONTENT_TYPE);
//		XtextResource xtextResource = (XtextResource) resourceSet.createResource(outputURI);
//		xtextResource.getContents().add(documentCS);
		return umlResource;
	}
	
	public void testSerialize_Bug320689() throws Exception {
		doSerialize("Bug320689");
	}
	
	public void testSerialize_Bug323741() throws Exception {
		doSerialize("Bug323741");
	}
	
	public void testSerialize_Bug354336() throws Exception {
		doSerialize("Bug354336", "Bug354336", null, false, true);		// FIXME Model check suppressed because of Bug 354621
	}
	
	public void testSerialize_Bug362620() throws Exception {
		doSerialize("Bug362620");
	}
	
	public void testSerialize_Bug376488() throws Exception {
		doSerialize("Bug376488", "Bug376488", null, true, false);
	}

	public void testSerialize_Company() throws Exception {
//		Logger logger = Logger.getLogger(AbstractParseTreeConstructor.class);
//		logger.setLevel(Level.TRACE);
//		logger.addAppender(new ConsoleAppender(new SimpleLayout()));
//		BaseScopeProvider.LOOKUP.setState(true);
//		DocumentAttribution.WORK.setState(true);
//		CS2PivotConversion.CONTINUATION.setState(true);
//		Abstract2Moniker.TRACE_MONIKERS.setState(true);
		doSerialize("Company", "Company.reference", null, true, true);
	}

	public void testSerialize_ConstraintMessages() throws Exception {
		doSerialize("ConstraintMessages");
	}

	public void testSerialize_Ecore() throws Exception {
		doSerialize("Ecore");
	}

	public void testSerialize_Imports() throws Exception {
		XtextResource xtextResource = doSerialize("Imports");
		RootPackageCS documentCS = (RootPackageCS) xtextResource.getContents().get(0);
		List<ImportCS> imports = documentCS.getOwnedImport();
		assertEquals("One import", 1, imports.size());
	}

	public void testSerialize_Keys() throws Exception {
		doSerialize("Keys");
	}

	public void testSerialize_Names() throws Exception {
		doSerialize("Names");
	}

/*	
 * Requires support for lower bounds on generic types
 * and better resolution of EAnnotation.references
	public void testSerialize_OCL() throws Exception {
		doSerialize("OCL");
	} */

	public void testSerialize_OCLinEcoreCST() throws Exception {
		doSerialize("OCLinEcoreCST");
	}

	public void testSerialize_OCLstdlib() throws Exception {
		doSerialize("OCLstdlib");
	}

	public void testSerialize_OCLCST() throws Exception {
		doSerialize("OCLCST");
	}

	public void testSerialize_QVT() throws Exception {
		doSerialize("QVT");
	}	

	public void testSerialize_RoyalAndLoyal() throws Exception {
		doSerialize("RoyalAndLoyal");
	}	
	
	public void testSerialize_States() throws Exception {
		doSerialize("States");
	}	

	public void testSerialize_XMLNamespace() throws Exception {
		doSerialize("XMLNamespace");
	}	
}
