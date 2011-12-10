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
package org.eclipse.ocl.examples.build.utilities;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.IProjectDescriptor;

public abstract class AbstractProjectComponent extends WorkflowComponentWithModelSlot
{
	private ResourceSet resourceSet = null;	
	private String projectName;

	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		if (projectName == null) {
			issues.addError(this, "projectName not specified.");
		}
	}

	protected IProjectDescriptor getProjectDescriptor() {
		ResourceSet resourceSet = getResourceSet();
		StandaloneProjectMap projectMap = StandaloneProjectMap.getAdapter(resourceSet);
		return projectMap.getProjectDescriptor(projectName);
	}

	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
}
