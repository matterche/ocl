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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Type;

/**
 * A PackageClient adapts a secondary Package to coordinate the coherent behaviour of a primary and one or more
 * secondary Packages as required for Complete OCL package extension.
 */
class PackageClient extends PackageTracker
{
	static PackageClient install(PackageServer packageServer, org.eclipse.ocl.examples.pivot.Package secondaryPackage) {
		Adapter tracker = EcoreUtil.getAdapter(secondaryPackage.eAdapters(), packageServer.getTypeCaches());
		if (tracker != null) {
			return (PackageClient)tracker;
		}
		else {
			return new PackageClient(packageServer, secondaryPackage);
		}
	}
	
	protected final PackageServer packageServer;
	
	private PackageClient(PackageServer packageServer, org.eclipse.ocl.examples.pivot.Package target) {
		super(packageServer.getTypeCaches(), target);
		assert packageServer != null;
		this.packageServer = packageServer;
		initContents(packageServer);
	}

	@Override
	public void dispose() {
		packageServer.removedClient(this);
		super.dispose();
	}

	@Override
	TypeTracker getTypeTracker(Type pivotType) {
		return getPackageServer().getTypeTracker(pivotType);
	}
	
	@Override
	PackageServer getPackageServer() {
		return packageServer.getPackageServer();
	}
}