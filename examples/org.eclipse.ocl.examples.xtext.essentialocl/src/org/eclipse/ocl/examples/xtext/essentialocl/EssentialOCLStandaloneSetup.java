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
 * $Id: EssentialOCLStandaloneSetup.java,v 1.1.6.1 2010/10/01 14:30:28 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.essentialocl;

import org.eclipse.ocl.examples.xtext.base.utilities.Pivot2BaseCSSwitch;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.EssentialOCLCSScopeProvider;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCS2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCS2PivotSwitch;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EssentialOCLStandaloneSetup extends EssentialOCLStandaloneSetupGenerated{

	public static void doSetup() {
		init();
		new EssentialOCLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public static void init() {
		EssentialOCLCSScopeProvider.FACTORY.getClass();
		EssentialOCLCS2MonikerSwitch.FACTORY.getClass();
		EssentialOCLCS2PivotSwitch.FACTORY.getClass();
		Pivot2BaseCSSwitch.FACTORY.getClass();
	}
}

