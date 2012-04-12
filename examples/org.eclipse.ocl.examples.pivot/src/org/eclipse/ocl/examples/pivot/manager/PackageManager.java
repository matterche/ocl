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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.Model;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * PackageManager encapsulates the knowledge about known packages and their nsURIs.
 */
public class PackageManager
{
	/**
	 * The MetaModelManager for which this PackageManager manages the packages.
	 */
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
	 * Map from each merged package to the PackageTracker that supervises its merge. PackageTrackers are only
	 * created for merged packages, so a missing entry just denotes an unmerged package. 
	 */
	private final Map<org.eclipse.ocl.examples.pivot.Package, PackageTracker> package2tracker = new HashMap<org.eclipse.ocl.examples.pivot.Package, PackageTracker>();

	/**
	 * Map from each merged type to the TypeTracker that supervises its merge. TypeTrackers are only
	 * created for merged types, so a missing entry just denotes an unmerged type. 
	 */
	private final Map<Type, TypeTracker> type2tracker = new HashMap<Type, TypeTracker>();
	
	protected PackageManager(MetaModelManager metaModelManager) {
		this.metaModelManager = metaModelManager;
	}

	public void addPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		String nsURI = pivotPackage.getNsURI();
		org.eclipse.ocl.examples.pivot.Package primaryPackage = null;
		if (nsURI != null) {										// Explicit nsURI for explicit package (merge)
			primaryPackage = getPackageByURI(nsURI);
		}
		else {
			String name = pivotPackage.getName();
			if (name != null) {										// Null nsURI can merge into same named package
				primaryPackage = getPackageByName(name);
			}
			if (primaryPackage == null) {							// Null URI distinct package, so invent a default nsURI
				nsURI = PivotUtil.getNsURI(pivotPackage);
				primaryPackage = getPackageByURI(nsURI);
			}
		}
		if (primaryPackage != pivotPackage) {						// Skip recursive call
			if (primaryPackage != null) {
				PackageTracker packageTracker = getPackageTracker(primaryPackage);
				packageTracker.getPackageServer().addSecondaryPackage(pivotPackage);
			}
			else {
				putPackage(nsURI, pivotPackage);
			}
		}
	}

	void addPackageTracker(org.eclipse.ocl.examples.pivot.Package pivotPackage, PackageTracker packageTracker) {
		PackageTracker oldTracker = package2tracker.put(pivotPackage, packageTracker);
		assert oldTracker == null;
	}

	void addTypeTracker(Type pivotType, TypeTracker typeTracker) {
		TypeTracker oldTracker = type2tracker.put(pivotType, typeTracker);
		assert oldTracker == null;
	}

	void addedNestedPrimaryPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		String nsURI = PivotUtil.getNsURI(pivotPackage);
		org.eclipse.ocl.examples.pivot.Package primaryPackage = getPackageByURI(nsURI);
		if (primaryPackage == pivotPackage) {
			// Recursive call
		}
		else if (primaryPackage != null) {
			throw new IllegalArgumentException("Duplicate nsURI '" + nsURI + "'");
		}
		else {
			putPackage(nsURI, pivotPackage);
		}
	}

	public void dispose() {
		if (!package2tracker.isEmpty()) {
			Collection<PackageTracker> savedPackageTrackers = new ArrayList<PackageTracker>(package2tracker.values());
			package2tracker.clear();
			for (PackageTracker packageTracker : savedPackageTrackers) {
				if (packageTracker instanceof PackageServer) {
					packageTracker.dispose();
				}
			}
		}
		if (!type2tracker.isEmpty()) {
			Collection<TypeTracker> savedTypeTrackers = new ArrayList<TypeTracker>(type2tracker.values());
			type2tracker.clear();
			for (TypeTracker typeTracker : savedTypeTrackers) {
				typeTracker.dispose();
			}
		}
		uri2package.clear();
		name2uris.clear();
	}

	public PackageTracker findPackageTracker(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		return package2tracker.get(pivotPackage);
	}
	
	public TypeTracker findTypeTracker(Type pivotType) {
		return type2tracker.get(pivotType);
	}

	public Iterable<org.eclipse.ocl.examples.pivot.Package> getAllPackages() {
		return uri2package.values();
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	public org.eclipse.ocl.examples.pivot.Package getPackageByName(String name) {
		List<String> uriList = name2uris.get(name);
		if ((uriList == null) || uriList.isEmpty()) {
			return null;
		}
		org.eclipse.ocl.examples.pivot.Package selectedPackage = getPackageByURI(uriList.get(0));
		for (int i = 1; i < uriList.size(); i++) {
			org.eclipse.ocl.examples.pivot.Package anotherPackage = getPackageByURI(uriList.get(i));
			if (anotherPackage != selectedPackage) {
				throw new IllegalArgumentException("Ambiguous package name '" + name + "'");
			}
		}
		return selectedPackage;
	}

	public org.eclipse.ocl.examples.pivot.Package getPackageByURI(String nsURI) {
		return uri2package.get(nsURI);
	}

	public PackageTracker getPackageTracker(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		PackageTracker packageTracker = findPackageTracker(pivotPackage);
		if (packageTracker == null) {
			packageTracker = (PackageTracker) EcoreUtil.getAdapter(pivotPackage.eAdapters(), this);
			if (packageTracker == null) {
				packageTracker = new PackageServer(this, pivotPackage);
			}
		}
		return packageTracker;
	}

	protected void putPackage(String nsURI, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		uri2package.put(nsURI, pivotPackage);
		String name = pivotPackage.getName();
		if ((name != null) && ((pivotPackage instanceof Library) || !(pivotPackage instanceof Model))) { // BUG 376596
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

	void removePackageTracker(PackageTracker packageTracker) {
		package2tracker.remove(packageTracker.getTarget());
	}

	void removeTypeTracker(TypeTracker typeTracker) {
		type2tracker.remove(typeTracker.getTarget());
	}
}