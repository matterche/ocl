/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: OCLstdlibStandaloneSetup.java,v 1.1.6.3 2010/12/11 10:45:46 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.oclstdlib;

import org.eclipse.ocl.examples.xtext.oclstdlib.cs2pivot.OCLstdlibCS2Pivot;
import org.eclipse.ocl.examples.xtext.oclstdlib.utilities.MonikerOCLstdlibCSVisitor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OCLstdlibStandaloneSetup extends OCLstdlibStandaloneSetupGenerated{

	public static void doSetup() {
		init();
		new OCLstdlibStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public static void init() {
//		OCLstdlibScopeProvider.FACTORY.getClass();
		MonikerOCLstdlibCSVisitor.FACTORY.getClass();
		OCLstdlibCS2Pivot.FACTORY.getClass();
//		Pivot2BaseCSSwitch.FACTORY.getClass();
	}
}

