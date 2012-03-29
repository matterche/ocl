/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;

/**
 * The CSI2PivotMapping maintains the mapping between CS elements or rather their CSIs
 * that remain stable after recreation and the Pivot elements. This mapping may be used
 * repeatedly while editing (CS2Pivot conversions) to associate changing CS elements with
 * stable Pivot elements.
 * The mapping may also be created during a Pivot2CS conversion to allow subsequent CS2Pivot
 * conversions to reuse the original Pivot elements.  
 */
public class CSI2PivotMapping
{
	/**
	 * Mapping of each CS resource's URI to a short alias used in URI maps.
	 */
	private Map<String, String> csURI2aliasMap = new HashMap<String, String>();

	/**
	 * The map from CS element (identified by URI) to pivot element at the end of the last update. This map enables
	 * the next update from a potentially different CS Resource and elements but the same URIs to re-use the pivot elements
	 * and to kill off the obsolete elements. 
	 */
	private Map<String, Element> csi2pivot = new HashMap<String, Element>();

	public CSI2PivotMapping(Collection<? extends Resource> csResources) {
		List<String> uris = new ArrayList<String>(csResources.size());
		for (Resource csResource : csResources) {
			String uri = csResource.getURI().toString();
			uris.add(uri);
		}
		Collections.sort(uris);			// Increase debug repeatability.
		int i = 0;
		for (String uri : uris) {
			csURI2aliasMap.put(uri, Integer.toString(i++));
		}
	}

	public CSI2PivotMapping(CSI2PivotMapping cs2PivotMapping) {
		for (Map.Entry<String, Element> entry : cs2PivotMapping.csi2pivot.entrySet()) {
			csi2pivot.put(entry.getKey(), entry.getValue());
		}
		for (Map.Entry<String, String> entry : cs2PivotMapping.csURI2aliasMap.entrySet()) {
			csURI2aliasMap.put(entry.getKey(), entry.getValue());
		}
	}

	public void clear() {
		csURI2aliasMap.clear();
		csi2pivot.clear();
	}
	
	public Set<String> computeCSIs(Collection<? extends Resource> csResources) {
		Set<String> map = new HashSet<String>();
		for (Resource csResource : csResources) {
			for (Iterator<EObject> it = csResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof ModelElementCS) {
					ModelElementCS csElement = (ModelElementCS)eObject;
					String csURI = getCSI(csElement);
					map.add(csURI);
				}
			}
		}
		return map;
	}

	/**
	 * Return the Pivot element corresponding to a given CS element.
	 */
	public Element get(ModelElementCS csElement) {
		String csi = getCSI(csElement);
		return csi2pivot.get(csi);
	}

	/**
	 * Get the Concrete Syntax Identifier for a CS element. This is a form of URI. It is significantly compacted to
	 * save on memory.
	 * @param csResource2aliasMap 
	 */
	private String getCSI(ModelElementCS csElement) {
		String csi = csElement.getCsi();
		if (csi == null) {
			Resource csResource = csElement.eResource();
			String csResourceURI = csResource.getURI().toString();
			String fragment = csResource.getURIFragment(csElement);
			csi = csURI2aliasMap.get(csResourceURI) + '#' + fragment;
			csElement.setCsi(csi);
		}
		return csi;
	}

	public Map<String, Element> getMapping() {
		return csi2pivot;
	}

	/**
	 * Install the Pivot element corresponding to a given CS element.
	 */
	public void put(ModelElementCS csElement, Element pivotElement) {
		String csi = getCSI(csElement);
		csi2pivot.put(csi, pivotElement);
	}

	/**
	 * Update the mapping to cache the Pivot elements for all CS elements in csResources.
	 */
	public void update(Collection<? extends Resource> csResources) {
		csi2pivot.clear();
		for (Resource csResource : csResources) {
			for (Iterator<EObject> it = csResource.getAllContents(); it.hasNext(); ) {
				EObject eObject = it.next();
				if (eObject instanceof ModelElementCS) {
					ModelElementCS csElement = (ModelElementCS)eObject;
					Element pivotElement = csElement.getPivot();
					put(csElement, pivotElement);
				}
			}
		}
	}
}
