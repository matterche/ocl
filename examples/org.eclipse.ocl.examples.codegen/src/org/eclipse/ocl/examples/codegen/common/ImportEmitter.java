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
	/**
	 * Declare the need for the import of aPath.
	 * @param aPath
	 * @return
	 */
	String declareImport(String aPath);

	/**
	 * Return the internal reference to an imported aPath.
	 */
	String emitImport(String aPath);

	/**
	 * Return the formatted list odf all import declarations.
	 */
	String emitImports();
}
