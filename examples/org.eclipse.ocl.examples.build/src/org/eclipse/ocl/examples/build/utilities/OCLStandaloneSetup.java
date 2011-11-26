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

import org.apache.log4j.Logger;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;

/**
 * Initializes OCL support.
 */
public class OCLStandaloneSetup
{
	private Logger log = Logger.getLogger(getClass());

	public OCLStandaloneSetup() {
		log.info("Registering OCL Resources");
		OCLstdlib.install();
	}
}