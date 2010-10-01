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
 * $Id: MonikerTests.java,v 1.1.2.1 2010/10/01 15:33:24 ewillink Exp $
 */
package org.eclipse.ocl.examples.test.xtext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Moniker;
import org.eclipse.ocl.examples.pivot.ecore.EcoreAliasCreator;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.BaseScopeProvider;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;

/**
 * Tests.
 */
public class MonikerTests extends XtextTestCase
{
	/**
	 * Check that all CS elements that should have monikers do, and that
	 * there are no duplicates. Return a map of moniker to CS.
	 */
	public Map<String, MonikeredElementCS> checkCSMonikers(Resource csResource) {
		Map<String, MonikeredElementCS> monikerMap = new HashMap<String, MonikeredElementCS>();
		for (TreeIterator<EObject> tit = csResource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if ((eObject instanceof NamedElementCS) || (eObject instanceof TemplateSignatureCS)) {
				MonikeredElementCS csElement = (MonikeredElementCS) eObject;
				String moniker = csElement.getMoniker();
				ElementCS oldElement = monikerMap.get(moniker);
				if (oldElement != null) {
					fail("Duplicate moniker " + moniker + " for " + csElement.eClass().getName());
				}
				monikerMap.put(moniker, csElement);
				System.out.println(eObject.eClass().getName() + " : " + moniker);
//				String signature = Ecore2Moniker.toSignature(eElement);
//				System.out.println(eObject.eClass().getName() + " : " + signature);
			}
		}
		return monikerMap;
	}

	/**
	 * Check that ever monikered CS element references the same pivoty element as
	 * the CS element that defines the moniker.
	 */
	public void checkCShasPivots(Resource csResource, Map<String, MonikeredElementCS> csMonikerMap) {
		for (TreeIterator<EObject> tit = csResource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if (eObject instanceof MonikeredElementCS) {
				MonikeredElementCS csElement = (MonikeredElementCS) eObject;
				String moniker = csElement.getMoniker();
				MonikeredElementCS oldElement = csMonikerMap.get(moniker);
				Element oldPivot = oldElement != null ? oldElement.getPivot() : null;
				Element newPivot = csElement.getPivot();
				assertEquals("Inconsistent pivot for " + moniker, newPivot, oldPivot);
			}
		}
	}

	/**
	 * Check that the pivot moniker for the pivot of every monikered CS element
	 * is the same as the CS moniker.
	 */
	public void checkCSandPivotMonikers(Map<String, MonikeredElementCS> csMonikerMap) {
		List<String> csMonikers = new ArrayList<String>(csMonikerMap.keySet());
		Collections.sort(csMonikers);
		for (String csMoniker : csMonikers) {
			MonikeredElementCS elementCS = csMonikerMap.get(csMoniker);
			System.out.println(elementCS.eClass().getName() + " : " + csMoniker);
			MonikeredElement pivot = (MonikeredElement) elementCS.getPivot();
			String pivotMoniker = pivot.getMoniker();
			assertEquals(csMoniker, pivotMoniker);
		}
	}
	/**
	 * Check that all pivot elements that should have monikers do, and that
	 * there are no duplicates. Return a map of moniker to pivot.
	 */
	public Map<String, MonikeredElement> checkPivotMonikers(Resource pivotResource) {
		Map<String, MonikeredElement> monikerMap = new HashMap<String, MonikeredElement>();
		for (TreeIterator<EObject> tit = pivotResource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if (eObject instanceof MonikeredElement) {
				MonikeredElement pivotElement = (MonikeredElement) eObject;
				String moniker = pivotElement.getMoniker();
				MonikeredElement oldElement = monikerMap.get(moniker);
				if (oldElement != null) {
					fail("Duplicate moniker " + moniker + " for " + pivotElement.eClass().getName());
				}
				monikerMap.put(moniker, pivotElement);
				System.out.println(eObject.eClass().getName() + " : " + moniker);
//				String signature = Ecore2Moniker.toSignature(eElement);
//				System.out.println(eObject.eClass().getName() + " : " + signature);
			}
		}
		return monikerMap;
	}

	public void doMonikerTestEcore(String stem) throws IOException {
		//
		//	Load the Ecore resource and check for load failures and proxy resolution
		//
		String inputName = stem + ".ecore";
		URI inputURI = getProjectFileURI(inputName);
		Resource ecoreResource = resourceSet.getResource(inputURI, true);
		assertNoResourceErrors("Load failed", ecoreResource);
		assertNoUnresolvedProxies("Unresolved proxies", ecoreResource);
		//
		//	Create and check Ecore monikers for uniqueness
		//
		EcoreAliasCreator.refreshPackageAliases(ecoreResource);
		Map<String, EModelElement> monikerMap = new HashMap<String, EModelElement>();
		for (TreeIterator<EObject> tit = ecoreResource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if (eObject instanceof EModelElement) {
				EModelElement eElement = (EModelElement) eObject;
				String moniker = Ecore2Moniker.toString(eElement);
				EModelElement oldElement = monikerMap.get(moniker);
				if (oldElement != null) {
					fail("Duplicate moniker " + moniker + " for " + eElement.eClass().getName());
				}
				monikerMap.put(moniker, eElement);
//				System.out.println(eObject.eClass().getName() + " : " + moniker);
//				String signature = Ecore2Moniker.toSignature(eElement);
//				System.out.println(eObject.eClass().getName() + " : " + signature);
			}
		}
	}

	public void doMonikerTestOCLstdlib(String stem) throws IOException {
		//
		//	Load the CS resource and check for load failures
		//
		String inputName = stem + ".oclstdlib";
		URI inputURI = getProjectFileURI(inputName);
		Resource csResource = resourceSet.getResource(inputURI, true);
		assertNoResourceErrors("Load failed", csResource);
		assertNoUnresolvedProxies("Unresolved proxies", csResource);
		assertNoValidationErrors("CS validation problems", csResource);
		//
		//	Get the pivot resource and check for load failures
		//
		CS2PivotResourceAdapter adapter = CS2PivotResourceAdapter.getAdapter(csResource, null);
		Resource pivotResource = adapter.getPivotResource(csResource);		
		assertNoValidationErrors("Pivot validation problems", pivotResource);
		//
		//	Check CS-Pivot moniker consistency
		//
		Map<String, MonikeredElementCS> csMonikerMap = checkCSMonikers(csResource);
		checkCShasPivots(csResource, csMonikerMap);
		checkCSandPivotMonikers(csMonikerMap);
		Map<String, MonikeredElement> pivotMonikerMap = checkPivotMonikers(pivotResource);
		assertEquals(csMonikerMap.size(), pivotMonikerMap.size());
	}

	public void testMoniker_Ecore_ecore() throws IOException, InterruptedException {
		doMonikerTestEcore("Ecore");			// Diverse declarations
	}

	public void testMoniker_OCL_ecore() throws IOException, InterruptedException {
		doMonikerTestEcore("OCL");				// Diverse generics
	}

	public void testMoniker_OCLEcore_ecore() throws IOException, InterruptedException {
		doMonikerTestEcore("OCLEcore");
	}

	public void testMoniker_midi_oclstdlib() throws IOException, InterruptedException {
		BaseScopeProvider.LOOKUP.setState(true);
		doMonikerTestOCLstdlib("midi");
	}

	public void testMoniker_mini_oclstdlib() throws IOException, InterruptedException {
		BaseScopeProvider.LOOKUP.setState(true);
		doMonikerTestOCLstdlib("mini");
	}

	public void testMoniker_oclstdlib_oclstdlib() throws IOException, InterruptedException {
		BaseScopeProvider.LOOKUP.setState(true);
		doMonikerTestOCLstdlib("oclstdlib");
	}
}
