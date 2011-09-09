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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.LambdaType;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

/**
 * A PackageServer adapts the primary Package to coordinate the coherent behaviour of a primary and one or more
 * secondary Packages as required for Complete OCL package extension.
 */
class PackageServer extends PackageTracker
{
	public static Function<PackageTracker, org.eclipse.ocl.examples.pivot.Package> tracker2package = new Function<PackageTracker, org.eclipse.ocl.examples.pivot.Package>()
	{
		public org.eclipse.ocl.examples.pivot.Package apply(PackageTracker packageTracker) {
			return packageTracker.getTarget();
		}
	};
	
	public static PackageServer install(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Package primaryPackage) {
		Adapter tracker = EcoreUtil.getAdapter(primaryPackage.eAdapters(), metaModelManager);
		if (tracker != null) {
			return (PackageServer)tracker;
		}
		else {
			return new PackageServer(metaModelManager, primaryPackage);
		}
	}
	
	/**
	 * List of all package extensions including this.
	 */
	private final List<PackageTracker> trackers = new ArrayList<PackageTracker>();
	
	/**
	 * Map of nested class-name to multi-class server.
	 */
	private Map<String, TypeServer> typeServers = null;
	
	/**
	 * Map of nested package-name to multi-package server.
	 */
	private Map<String, PackageServer> nestedPackageServers = null;
	
	private PackageServer(MetaModelManager metaModelManager, org.eclipse.ocl.examples.pivot.Package primaryPackage) {
		super(metaModelManager, primaryPackage);
		trackers.add(this);
		initContents(this);
	}

	public void addNestedPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		if (nestedPackageServers == null) {
			nestedPackageServers = new HashMap<String, PackageServer>();
		}
		String packageName = pivotPackage.getName();
		PackageServer packageServer = nestedPackageServers.get(packageName);
		if (packageServer == null) {
			packageServer = PackageServer.install(metaModelManager, pivotPackage);
			nestedPackageServers.put(packageName, packageServer);
			metaModelManager.addedPrimaryPackage(pivotPackage);
		}
		else {
			packageServer.addSecondaryPackage(pivotPackage);
		}
	}
	
	public void addSecondaryPackage(org.eclipse.ocl.examples.pivot.Package secondaryPackage) {
		PackageClient packageClient = PackageClient.install(this, secondaryPackage);
		if (!trackers.contains(packageClient)) {
			trackers.add(packageClient);
		}
	}
	
	void addType(Type pivotType) {
		if ((pivotType instanceof LambdaType) || (pivotType instanceof TupleType)) {	// FIXME parent not necessarily in place
			return;
		}
		if (typeServers == null) {
			typeServers = new HashMap<String, TypeServer>();
		}
		String className = pivotType.getName();
		TypeServer typeServer = typeServers.get(className);
		if (typeServer == null) {
			typeServer = TypeServer.install(metaModelManager, pivotType);
			if (pivotType.getUnspecializedElement() == null) {
				typeServers.put(className, typeServer);
			}
		}
		else {
			typeServer.addSecondaryType(pivotType);
		}
	}

	void addedNestedPackage(Object nestedObject) {
		if (nestedObject instanceof org.eclipse.ocl.examples.pivot.Package) {
			org.eclipse.ocl.examples.pivot.Package nestedPackage = (org.eclipse.ocl.examples.pivot.Package)nestedObject;
			addNestedPackage(nestedPackage);
		}
	}

	@Override
	public void dispose() {
		Collection<PackageTracker> packageTrackers = trackers;
		trackers.clear();
		for (PackageTracker packageTracker : packageTrackers) {
			if (packageTracker instanceof PackageClient) {
				packageTracker.dispose();
			}
		}
		if (typeServers != null) {
			Collection<TypeServer> savedTypeServers = typeServers.values();
			typeServers.clear();
			for (TypeServer typeServer : savedTypeServers) {
				typeServer.dispose();
			}
			typeServers = null;
		}
		if (nestedPackageServers != null) {
			Collection<PackageServer> savedPackageServers = nestedPackageServers.values();
			nestedPackageServers.clear();
			for (PackageServer packageServer : savedPackageServers) {
				packageServer.dispose();
			}
			nestedPackageServers = null;
		}
		super.dispose();
	}

	public org.eclipse.ocl.examples.pivot.Package getNestedPackage(String nestedPackageName) {
		PackageServer nestedPackageServer = nestedPackageServers.get(nestedPackageName);
		return nestedPackageServer != null ? nestedPackageServer.getTarget() : null;
	}
	
	@Override
	PackageServer getPackageServer() {
		return this;
	}

	public Iterable<org.eclipse.ocl.examples.pivot.Package> getPackages() {
		return Iterables.transform(trackers, tracker2package);
	}

	public Type getType(String typeName) {
		TypeServer typeServer = typeServers.get(typeName);
		return typeServer != null ? typeServer.getTarget() : null;
	}

	@Override
	TypeTracker getTypeTracker(Type pivotType) {
		if (typeServers == null) {
			typeServers = new HashMap<String, TypeServer>();
		}
		String className = pivotType.getName();
		TypeServer typeServer = typeServers.get(className);
		if (typeServer == null) {
			typeServer = TypeServer.install(metaModelManager, pivotType);
			typeServers.put(className, typeServer);
		}
		return typeServer.getTypeTracker(pivotType);
	}

	
	void removedClient(PackageClient packageClient) {
		trackers.remove(packageClient);
	}

	void removedNestedPackage(Object nestedObject) {
		if (nestedObject instanceof org.eclipse.ocl.examples.pivot.Package) {
			org.eclipse.ocl.examples.pivot.Package nestedPackage = (org.eclipse.ocl.examples.pivot.Package)nestedObject;
			PackageServer packageServer = nestedPackageServers.get(nestedPackage.getName());
			packageServer.removedPackage(nestedPackage);
		}
	}

	void removedPackage(org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		PackageTracker packageTracker = metaModelManager.getPackageTracker(pivotPackage);
		if (packageTracker == this) {
			dispose();
		}
		else {
			trackers.remove(packageTracker);
		}
	}
}