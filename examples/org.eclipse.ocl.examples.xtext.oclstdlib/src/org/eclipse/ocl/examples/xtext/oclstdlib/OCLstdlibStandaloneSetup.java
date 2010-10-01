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
 * $Id: OCLstdlibStandaloneSetup.java,v 1.1.6.1 2010/10/01 14:34:04 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.oclstdlib;

import org.eclipse.ocl.examples.xtext.base.utilities.Pivot2BaseCSSwitch;
import org.eclipse.ocl.examples.xtext.oclstdlib.scoping.OCLstdlibScopeProvider;
import org.eclipse.ocl.examples.xtext.oclstdlib.utilities.OCLstdlibCS2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.oclstdlib.utilities.OCLstdlibCS2PivotSwitch;

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
		OCLstdlibScopeProvider.FACTORY.getClass();
		OCLstdlibCS2MonikerSwitch.FACTORY.getClass();
		OCLstdlibCS2PivotSwitch.FACTORY.getClass();
		Pivot2BaseCSSwitch.FACTORY.getClass();
	}
}

