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

import org.eclipse.ocl.examples.pivot.Type;

/**
 * A PackageClient adapts a secondary Package to coordinate the coherent behaviour of a primary and one or more
 * secondary Packages as required for Complete OCL package extension.
 */
public class PackageClient extends PackageTracker
{
	protected final PackageServer packageServer;
	
	protected PackageClient(PackageServer packageServer, org.eclipse.ocl.examples.pivot.Package target) {
		super(packageServer.getPackageManager(), target);
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
	public TypeTracker getTypeTracker(Type pivotType) {
		return packageServer.getTypeTracker(pivotType);
	}
	
	@Override
	public PackageServer getPackageServer() {
		return packageServer;
	}
}