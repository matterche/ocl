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
package org.eclipse.ocl.examples.pivot.multi;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A ClassClient adapts a secondary Class to coordinate the coherent behaviour of a primary and one or more
 * secondary Classes as required for Complete OCL class extension.
 */
class ClassClient extends ClassTracker
{
	static ClassClient install(ClassServer classServer, org.eclipse.ocl.examples.pivot.Class secondaryClass) {
		Adapter tracker = EcoreUtil.getAdapter(secondaryClass.eAdapters(), classServer.getTypeCaches());
		if (tracker != null) {
			return (ClassClient)tracker;
		}
		else {
			return new ClassClient(classServer, secondaryClass);
		}
	}
	
	protected ClassServer classServer;		// Only null after dispose().
	
	private ClassClient(ClassServer classServer, org.eclipse.ocl.examples.pivot.Class target) {
		super(classServer.getTypeCaches(), target);
		this.classServer = classServer;
	}

	@Override
	public void dispose() {
		if (classServer != null) {
			classServer.removeClassClient(this);
			classServer = null;
		}
		super.dispose();
	}

	@Override
	org.eclipse.ocl.examples.pivot.Class getPrimaryClass() {
		return classServer != null ? classServer.getTarget() : null;
	}
}