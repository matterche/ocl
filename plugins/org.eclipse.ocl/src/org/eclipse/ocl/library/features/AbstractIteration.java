/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
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
 * $Id: AbstractIteration.java,v 1.1.2.1 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library.features;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.ocl.library.LibraryIteration;

/**
 * AbstractIteration realises shared characteristics of library iterations.
 * 
 * @since 3.0
 */
public abstract class AbstractIteration extends AbstractFeature implements LibraryIteration
{
	private static AtomicInteger tempCounter = new AtomicInteger();

	protected static synchronized String generateName() {
		return "__result__" + tempCounter.getAndIncrement();	//$NON-NLS-1$
	}
}
