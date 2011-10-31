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
package org.eclipse.ocl.examples.codegen.common;

public interface ImportEmitter
{
	public static interface Factory {
		/**
		 * Create a new emitter scope for a set of new-line separated inputs.
		 */
		ImportEmitter createNew(String imports);
	}
	
	/**
	 * Return the internal reference to an imported aPath.
	 */
	String emitImport(String aPath);

	/**
	 * Return the formatted list of all import declarations.
	 */
	String emitImports();
}
