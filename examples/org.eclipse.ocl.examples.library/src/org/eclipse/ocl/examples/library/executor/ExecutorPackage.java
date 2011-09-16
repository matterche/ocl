/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.library.executor;

public class ExecutorPackage
{
	protected final String name;
	protected final String nsURI;
	private ExecutorClass[] classes;

	public ExecutorPackage(String name, String nsURI, ExecutorClass[] classes) {
		this.name = name;
		this.nsURI = nsURI;
		this.classes = classes;
	}

	@Deprecated
	public ExecutorPackage(String name, ExecutorClass[] classes) {
		this.name = name;
		this.nsURI = null;
		this.classes = classes;
	}
	
	public void init(ExecutorClass[] classes) {
		assert this.classes == null;
		this.classes = classes;
	}
	
	public ExecutorClass lookupClass(int classIndex) {
		return classes[classIndex];
	}

	@Override
	public String toString() {
		return name;
	}
}