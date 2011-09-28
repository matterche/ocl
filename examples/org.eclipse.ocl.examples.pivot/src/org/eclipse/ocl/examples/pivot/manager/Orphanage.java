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
package org.eclipse.ocl.examples.pivot.manager;

import java.util.WeakHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.ocl.examples.pivot.PivotConstants;

/**
 * An Orphanage provides a Resource that weakly contains elements such as type specializations that
 * should require a container for the purposes of validation, but which should be eligible for
 * garbage collection whenever no longer in use.
 */
public class Orphanage extends ResourceImpl
{
	/**
	 * WeakContentsEList is used in place of the conventional ContentsEList<EObject> to provide the
	 * weak references to the orphanage Resource.contents using a WeakHashMap.
	 */
	protected class WeakContentsEList extends ContentsEList<EObject>
	{
		private static final long serialVersionUID = 1L;
		
		private WeakHashMap<EObject, Object> weakContents = new WeakHashMap<EObject, Object>();

		@Override
		public boolean contains(Object object) {
			return weakContents.containsKey(object);
		}

		@Override
		protected void doAddUnique(EObject object) {
			weakContents.put(object, null);
		}
	}

	public static final URI ORPHANAGE_URI = URI.createURI(PivotConstants.ORPHANAGE_URI);
	public static final Orphanage INSTANCE = new Orphanage(ORPHANAGE_URI);

	/**
	 * Return the Orphanage for an eObject, which is the Orphanage resource in the same ResourceSet as
	 * the eObject, else the global Orphanage.
	 */
	public static Orphanage getOrphanage(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		Resource resource = eObject.eResource();
		if (resource == null) {
			return null;
		}
		ResourceSet resourceSet = resource.getResourceSet();
		return getOrphanage(resourceSet);
	}

	/**
	 * Return the Orphanage for an eObject, which is the Orphanage resource in the resourceSet
	 * if non-null, else the global Orphanage.
	 */
	public static Orphanage getOrphanage(ResourceSet resourceSet) {
		if (resourceSet == null) {
			return Orphanage.INSTANCE;
		}
		for (Resource aResource : resourceSet.getResources()) {
			if (aResource instanceof Orphanage) {
				return (Orphanage) aResource;
			}
		}
		Orphanage orphanage = new Orphanage(ORPHANAGE_URI);
		resourceSet.getResources().add(orphanage);
		return orphanage;
	}
	
	public Orphanage(URI uri) {
		super(uri);
	}

	public void add(EObject eObject) {
		getContents().add(eObject);
	}

	@Override
	public EList<EObject> getContents() {
	    if (contents == null)
	    {
	      contents = new WeakContentsEList();
	    }
	    return contents;
	}
}