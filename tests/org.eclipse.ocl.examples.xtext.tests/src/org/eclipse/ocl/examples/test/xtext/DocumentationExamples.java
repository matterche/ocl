/**
 * <copyright>
 * 
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.test.xtext;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.examples.domain.validation.DomainSubstitutionLabelProvider;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.OCL.Query;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.helper.OCLHelper;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.pivot.tests.PivotTestCase;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.xtext.essentialocl.EssentialOCLStandaloneSetup;

/**
 * Tests for the OCLinEcore tutorial using LPG or Pivot delegate URIs on LPG or Pivot evaluator.
 */
@SuppressWarnings("nls")
public class DocumentationExamples extends PivotTestCase
{
	public void testOCLinEcoreTutorialUsingLPGForLPG() throws Exception {
		org.eclipse.ocl.ecore.OCL.initialize(resourceSet);
		org.eclipse.ocl.ecore.delegate.OCLDelegateDomain.initialize(resourceSet);			
		doTestOCLinEcoreTutorialUsingLPG(getTestModelURI("/model/OCLinEcoreTutorialForLPG.xmi"));
	}
	public void testOCLinEcoreTutorialUsingLPGForPivot() throws Exception {
		org.eclipse.ocl.ecore.OCL.initialize(resourceSet);
		OCLDelegateDomain.initialize(resourceSet, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);			
		doTestOCLinEcoreTutorialUsingLPG(getTestModelURI("/model/OCLinEcoreTutorialForPivot.xmi"));
	}
	public void testOCLinEcoreTutorialUsingPivotForLPG() throws Exception {
		OCL.initialize(resourceSet);
		org.eclipse.ocl.ecore.delegate.OCLDelegateDomain.initialize(resourceSet);			
		doTestOCLinEcoreTutorialUsingPivot(getTestModelURI("/model/OCLinEcoreTutorialForLPG.xmi"));
	}
	public void testOCLinEcoreTutorialUsingPivotForPivot() throws Exception {
		OCL.initialize(resourceSet);
		OCLDelegateDomain.initialize(resourceSet, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);			
		doTestOCLinEcoreTutorialUsingPivot(getTestModelURI("/model/OCLinEcoreTutorialForPivot.xmi"));
	}
	
	protected void doTestOCLinEcoreTutorialUsingLPG(URI testModelURI) throws Exception {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
//		resourceSet.getURIConverter().getURIMap().put(URI.createURI("http://www.eclipse.org/ocl/1.1.0/oclstdlib.ecore"), URI.createPlatformPluginURI("/org.eclipse.ocl.ecore/model/oclstdlib.ecore", true));
		URIConverter.URI_MAP.put(URI.createURI(EcoreEnvironment.OCL_STANDARD_LIBRARY_NS_URI), URI.createPlatformPluginURI("/org.eclipse.ocl.ecore/model/oclstdlib.ecore", true));
		Resource xmiResource = resourceSet.getResource(testModelURI, true);
		EObject xmiLibrary = xmiResource.getContents().get(0);
		EClass ecoreLibrary = xmiLibrary.eClass();
		EStructuralFeature ecoreBooks = ecoreLibrary.getEStructuralFeature("books");
		EClass ecoreBook = (EClass) ecoreBooks.getEType();
		EStructuralFeature bookName = ecoreBook.getEStructuralFeature("name");
		EStructuralFeature bookCopies = ecoreBook.getEStructuralFeature("copies");
		@SuppressWarnings("unchecked")
		List<EObject> xmiBooks = (List<EObject>) xmiLibrary.eGet(ecoreBooks);
		EObject b2Book = null;
		for (EObject xmiBook : xmiBooks) {
			if (xmiBook.eGet(bookName).equals("b2")) {
				b2Book = xmiBook;
			}
		}
		if (b2Book == null) {
			fail();
			return;
		}
		org.eclipse.ocl.ecore.EcoreEnvironmentFactory environmentFactory = new org.eclipse.ocl.ecore.EcoreEnvironmentFactory(resourceSet.getPackageRegistry());
		org.eclipse.ocl.ecore.OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance(environmentFactory);
		org.eclipse.ocl.ecore.OCL.Helper helper = ocl.createOCLHelper();

		helper.setContext(b2Book.eClass());
		org.eclipse.ocl.ecore.OCLExpression query = helper.createQuery("isAvailable()");
		org.eclipse.ocl.ecore.OCL.Query queryEval = ocl.createQuery(query);
		Object b2Available = queryEval.evaluate(b2Book);
	    assertFalse((Boolean)b2Available);
	    
		Map<Object, Object> validationContext = DomainSubstitutionLabelProvider.createDefaultContext(Diagnostician.INSTANCE);
	    Diagnostic diagnostics = Diagnostician.INSTANCE.validate(xmiLibrary, validationContext);
	    assertEquals(3, diagnostics.getChildren().size());
	    
	    b2Book.eSet(bookCopies, BigInteger.valueOf(4));
		b2Available = queryEval.evaluate(b2Book);
	    assertTrue((Boolean)b2Available);
	    
	    diagnostics = Diagnostician.INSTANCE.validate(xmiLibrary, validationContext);
	    assertEquals(2, diagnostics.getChildren().size());
	    
	    b2Book.eSet(bookCopies, BigInteger.valueOf(3));
		b2Available = queryEval.evaluate(b2Book);
	    assertFalse((Boolean)b2Available);
	    
	    ocl.dispose();
	}
	
	protected void doTestOCLinEcoreTutorialUsingPivot(URI testModelURI) throws Exception {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
		Resource xmiResource = resourceSet.getResource(testModelURI, true);
		EObject xmiLibrary = xmiResource.getContents().get(0);
		EClass ecoreLibrary = xmiLibrary.eClass();
		EStructuralFeature ecoreBooks = ecoreLibrary.getEStructuralFeature("books");
		EClass ecoreBook = (EClass) ecoreBooks.getEType();
		EStructuralFeature bookName = ecoreBook.getEStructuralFeature("name");
		EStructuralFeature bookCopies = ecoreBook.getEStructuralFeature("copies");
		@SuppressWarnings("unchecked")
		List<EObject> xmiBooks = (List<EObject>) xmiLibrary.eGet(ecoreBooks);
		EObject b2Book = null;
		for (EObject xmiBook : xmiBooks) {
			if (xmiBook.eGet(bookName).equals("b2")) {
				b2Book = xmiBook;
			}
		}
		if (b2Book == null) {
			fail();
			return;
		}
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			PivotEnvironmentFactory environmentFactory = new PivotEnvironmentFactory(resourceSet.getPackageRegistry(), metaModelManager);
			OCL ocl = OCL.newInstance(environmentFactory);
			OCLHelper helper = ocl.createOCLHelper();
	
			Ecore2Pivot ecore2pivot = Ecore2Pivot.getAdapter(b2Book.eClass().eResource(), metaModelManager);
			Type bookType = ecore2pivot.getCreated(Type.class, b2Book.eClass());
			helper.setContext(bookType);
			ExpressionInOcl query = helper.createQuery("isAvailable()");
			Query queryEval = ocl.createQuery(query);
			Value b2Available = queryEval.evaluate(b2Book);
		    assertFalse(b2Available.asBoolean());
		    
			Map<Object, Object> validationContext = DomainSubstitutionLabelProvider.createDefaultContext(Diagnostician.INSTANCE);
		    Diagnostic diagnostics = Diagnostician.INSTANCE.validate(xmiLibrary, validationContext);
		    assertEquals(3, diagnostics.getChildren().size());
		    
		    b2Book.eSet(bookCopies, BigInteger.valueOf(4));
			b2Available = queryEval.evaluate(b2Book);
		    assertTrue(b2Available.asBoolean());
		    
		    diagnostics = Diagnostician.INSTANCE.validate(xmiLibrary, validationContext);
		    assertEquals(2, diagnostics.getChildren().size());
		    
		    b2Book.eSet(bookCopies, BigInteger.valueOf(3));
			b2Available = queryEval.evaluate(b2Book);
		    assertFalse(b2Available.asBoolean());
		} finally {
			metaModelManager.dispose();
		}
	}
	
	private ResourceSet resourceSet;
	
	@Override
    protected void setUp() throws Exception {
		super.setUp();
		OCLstdlib.install();
		EssentialOCLStandaloneSetup.doSetup();
		resourceSet = new ResourceSetImpl();
	}
	
	@Override
	protected void tearDown() throws Exception {
		unloadResourceSet(resourceSet);
		resourceSet = null;
		super.tearDown();
	}
}
