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
 * $Id: OCLinEcoreStandaloneSetup.java,v 1.1.6.1 2010/10/01 14:48:53 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.oclinecore;

import org.eclipse.ocl.examples.xtext.base.utilities.Pivot2BaseCSSwitch;
import org.eclipse.ocl.examples.xtext.oclinecore.scoping.OCLinEcoreCSScopeProvider;
import org.eclipse.ocl.examples.xtext.oclinecore.utilities.OCLinEcore2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.oclinecore.utilities.OCLinEcoreCS2PivotSwitch;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OCLinEcoreStandaloneSetup extends OCLinEcoreStandaloneSetupGenerated{

	public static void doSetup() {
		init();
		new OCLinEcoreStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public static void init() {
		OCLinEcoreCSScopeProvider.FACTORY.getClass();
		OCLinEcore2MonikerSwitch.FACTORY.getClass();
		OCLinEcoreCS2PivotSwitch.FACTORY.getClass();
		Pivot2BaseCSSwitch.FACTORY.getClass();
	}
}

