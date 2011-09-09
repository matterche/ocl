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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.Package;

/**
 * PackageManager encapsulates the knowledge about known packages and their nsURIs.
 */
public class PackageManager
{
	protected final MetaModelManager metaModelManager;

	/**
	 * Map from package URI to primary package. 
	 */
	private final Map<String, org.eclipse.ocl.examples.pivot.Package> uri2package = new HashMap<String, org.eclipse.ocl.examples.pivot.Package>();
	
	/**
	 * Map from package name to package URIs, used solely to support merge of an nsURI-less package such as an OCL stdlib enhancement
	 * into an nsURI-full package without knowledge of a particular nsURI version.
	 */
	private final Map<String, List<String>> name2uris = new HashMap<String, List<String>>();

	/**
	 * Map from each merged package to the PackageTracker that supervises its merge. 
	 */
	private final Map<org.eclipse.ocl.examples.pivot.Package, PackageTracker> package2tracker = new HashMap<org.eclipse.ocl.examples.pivot.Package, PackageTracker>();
	
	protected PackageManager(MetaModelManager metaModelManager) {
		this.metaModelManager = metaModelManager;
	}

	void addTracker(org.eclipse.ocl.examples.pivot.Package pivotPackage, PackageTracker packageTracker) {
		assert package2tracker.put(pivotPackage, packageTracker) == null;
	}

	public void dispose() {
		Collection<PackageTracker> packageTrackers = package2tracker.values();
		package2tracker.clear();
		for (PackageTracker packageTracker : packageTrackers) {
			if (packageTracker instanceof PackageServer) {
				packageTracker.dispose();
			}
		}
		uri2package.clear();
		name2uris.clear();
	}

	public Package get(String nsURI) {
		return uri2package.get(nsURI);
	}

	public Iterable<org.eclipse.ocl.examples.pivot.Package> getAllPackages() {
		return uri2package.values();
	}

	public Package getByName(String name) {
		List<String> uriList = name2uris.get(name);
		if ((uriList == null) || uriList.isEmpty()) {
			return null;
		}
		else if (uriList.size() == 1) {
			return get(uriList.get(0));
		}
		else {
			throw new IllegalArgumentException("Ambiguous package name '" + name + "'");
		}
	}

	PackageTracker getTracker(Package pivotPackage) {
		return package2tracker.get(pivotPackage);
	}

	public void put(String nsURI, Package pivotPackage) {
		uri2package.put(nsURI, pivotPackage);
		String name = pivotPackage.getName();
		if (name != null) {
			List<String> uriList = name2uris.get(name);
			if (uriList == null) {
				uriList = new ArrayList<String>();
				name2uris.put(name, uriList);
			}
			if (!uriList.contains(nsURI)) {
				uriList.add(nsURI);
			}
		}
	}

	void removeTracker(PackageTracker packageTracker) {
		package2tracker.remove(packageTracker.getTarget());
	}
}