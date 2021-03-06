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

/**
 * A MetaModelManagerListener reports MetaModelManager changes; most notably disposal.
 */
public interface MetaModelManagerListener
{
	/**
	 * Respond to disposal of the MetaModelManager by eliminating all further usage.
	 * 
	 * @param metaModelManager 
	 */
	void metaModelManagerDisposed(MetaModelManager metaModelManager);
}