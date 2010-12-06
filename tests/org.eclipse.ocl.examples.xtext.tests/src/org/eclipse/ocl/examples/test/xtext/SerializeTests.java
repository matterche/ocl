/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: SerializeTests.java,v 1.7.6.4 2010/12/06 18:47:46 ewillink Exp $
 */
package org.eclipse.ocl.examples.test.xtext;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CS;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreCSTPackage;
import org.eclipse.ocl.examples.xtext.oclinecore.pivot2cs.OCLinEcorePivot2CS;
import org.eclipse.xtext.resource.XtextResource;

/**
 * Tests that check that an Ecore model can be serialized to OCLinEcore.
 */
public class SerializeTests extends XtextTestCase
{
	public XtextResource doSerialize(String stem) throws IOException {
		String inputName = stem + ".ecore";
		String pivotName = stem + ".ecore.pivot";
		String outputName = stem + ".serialized.oclinecore";
		URI inputURI = getProjectFileURI(inputName);
		URI pivotURI = getProjectFileURI(pivotName);
		URI outputURI = getProjectFileURI(outputName);
		Resource ecoreResource = resourceSet.getResource(inputURI, true);
//		List<String> conversionErrors = new ArrayList<String>();
//		RootPackageCS documentCS = Ecore2OCLinEcore.importFromEcore(resourceSet, null, ecoreResource);
//		Resource eResource = documentCS.eResource();
		assertNoResourceErrors("Load failed", ecoreResource);
//		Resource xtextResource = resourceSet.createResource(outputURI, OCLinEcoreCSTPackage.eCONTENT_TYPE);
//		XtextResource xtextResource = (XtextResource) resourceSet.createResource(outputURI);
//		xtextResource.getContents().add(documentCS);

		
		PivotManager pivotManager = new PivotManager();
		Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(ecoreResource, pivotManager);
		org.eclipse.ocl.examples.pivot.Package pivotRoot = ecore2Pivot.getPivotRoot();
		Resource pivotResource = pivotRoot.eResource();
		assertNoResourceErrors("Normalisation failed", pivotResource);
		assertNoValidationErrors("Normalisation invalid", pivotResource);
//		
		ResourceSet csResourceSet = resourceSet; //new ResourceSetImpl();
//		csResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("cs", new EcoreResourceFactoryImpl());
//		csResourceSet.getPackageRegistry().put(PivotPackage.eNS_URI, PivotPackage.eINSTANCE);
//		Resource csResource = csResourceSet.createResource(uri);
//		URI oclinecoreURI = ecoreResource.getURI().appendFileExtension("oclinecore");
		XtextResource xtextResource = (XtextResource) resourceSet.createResource(outputURI, OCLinEcoreCSTPackage.eCONTENT_TYPE);
		Map<Resource, Resource> cs2PivotResourceMap = new HashMap<Resource, Resource>();
		cs2PivotResourceMap.put(xtextResource, pivotResource);
		Pivot2CS pivot2cs = new OCLinEcorePivot2CS(cs2PivotResourceMap, pivotManager);
		pivot2cs.update();
		assertNoResourceErrors("Conversion failed", xtextResource);
//		csResource.save(null);
		
		
		
//		pivotResource.setURI(pivotURI);
		pivotResource.save(null);
		
		
		assertNoDiagnosticErrors("Concrete Syntax validation failed", xtextResource);
		xtextResource.save(null);
		resourceSet.getResources().clear();
		XtextResource reloadedResource = (XtextResource) resourceSet.getResource(outputURI, true);
		assertNoResourceErrors("Reload failed", reloadedResource);
		assertNoUnresolvedProxies("unresolved reload proxies", reloadedResource);
		
		
		return xtextResource;
	}
	
	public void testBug320689Serialize() throws IOException, InterruptedException {
		doSerialize("Bug320689");
	}

	public void testCompanySerialize() throws IOException, InterruptedException {
//		Logger logger = Logger.getLogger(AbstractParseTreeConstructor.class);
//		logger.setLevel(Level.TRACE);
//		logger.addAppender(new ConsoleAppender(new SimpleLayout()));
//		BaseScopeProvider.LOOKUP.setState(true);
//		DocumentScopeAdapter.WORK.setState(true);
		doSerialize("Company");
	}

// FIXME fails due to Bug 286558
	public void testEcoreSerialize() throws IOException, InterruptedException {
		doSerialize("Ecore");
	}

	public void testImportsSerialize() throws IOException, InterruptedException {
		XtextResource xtextResource = doSerialize("Imports");
		RootPackageCS documentCS = (RootPackageCS) xtextResource.getContents().get(0);
		List<ImportCS> imports = documentCS.getOwnedImport();
		assertEquals("One import", 1, imports.size());
	}

//	public void testMarkupSerialize() throws IOException, InterruptedException {
//		doSerialize("Markup");
//	}

	public void testNamesSerialize() throws IOException, InterruptedException {
		doSerialize("Names");
	}

	public void testOCLinEcoreCSTSerialize() throws IOException, InterruptedException {
		doSerialize("OCLinEcoreCST");
	}

	public void testOCLstdlibSerialize() throws IOException, InterruptedException {
		doSerialize("OCLstdlib");
	}

	public void testOCLSerialize() throws IOException, InterruptedException {
		doSerialize("OCL");
	}

	public void testOCLCSTSerialize() throws IOException, InterruptedException {
		doSerialize("OCLCST");
	}

	public void testOCLEcoreSerialize() throws IOException, InterruptedException {
		doSerialize("OCLEcore");
	}

	public void testQVTSerialize() throws IOException, InterruptedException {
		doSerialize("QVT");
	}	

	public void testXMLNamespaceSerialize() throws IOException, InterruptedException {
		doSerialize("XMLNamespace");
	}	

	public void testXMLTypeSerialize() throws IOException, InterruptedException {
		doSerialize("XMLType");
	}

//	public void testTemp() throws IOException, InterruptedException {
//		doSerialize("temp");
//	}	
}
