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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A ClassServer adapts the primary Class to coordinate the coherent behaviour of a primary and one or more
 * secondary Classes as required for Complete OCL class extension.
 */
class ClassServer extends ClassTracker
{
	public static ClassServer install(TypeCaches typeCaches, org.eclipse.ocl.examples.pivot.Class primaryClass) {
		Adapter tracker = EcoreUtil.getAdapter(primaryClass.eAdapters(), typeCaches);
		if (tracker != null) {
			return (ClassServer)tracker;
		}
		else {
			return new ClassServer(typeCaches, primaryClass);
		}
	}
	
	private List<ClassTracker> trackers;		// Only null after dispose().
	
	private ClassServer(TypeCaches typeCaches, org.eclipse.ocl.examples.pivot.Class primaryClass) {
		super(typeCaches, primaryClass);
		trackers = new ArrayList<ClassTracker>();
		trackers.add(this);
	}
	
	public void addSecondaryClass(org.eclipse.ocl.examples.pivot.Class secondaryClass) {
		ClassClient classClient = ClassClient.install(this, secondaryClass);
		if (!trackers.contains(classClient)) {
			trackers.add(classClient);
		}
	}

	@Override
	public void dispose() {
		Collection<ClassTracker> classTrackers = trackers;
		trackers.clear();
		trackers = null;
		for (ClassTracker classTracker : classTrackers) {
			if (classTracker instanceof ClassClient) {
				classTracker.dispose();
			}
		}
		super.dispose();
	}

	@Override
	org.eclipse.ocl.examples.pivot.Class getPrimaryClass() {
		return trackers != null ? target : null;
	}
	
	public void removeClassClient(ClassClient classClient) {
		if (trackers != null) {
			trackers.remove(classClient);
		}
	}
}