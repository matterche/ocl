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

public class ExecutorSpecializedType implements ExecutorTypeArgument
{
	protected final String name;
	
	public ExecutorSpecializedType(String name, ExecutorTypeArgument... typeArguments) {
		this.name = name;
	}

	public final String getName() {
		return name;
	}
}