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
 * $Id: CompleteOCLStandaloneSetup.java,v 1.1.6.1 2010/10/01 15:03:01 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.completeocl;

import org.eclipse.ocl.examples.xtext.completeocl.scoping.CompleteOCLScopeProvider;
import org.eclipse.ocl.examples.xtext.completeocl.utilities.CompleteOCL2MonikerSwitch;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CompleteOCLStandaloneSetup extends CompleteOCLStandaloneSetupGenerated{

	public static void doSetup() {
		CompleteOCLScopeProvider.FACTORY.getClass();
		CompleteOCL2MonikerSwitch.FACTORY.getClass();
		new CompleteOCLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

