/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: OCLinEcoreStandaloneSetup.java,v 1.4 2011/03/01 08:46:34 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.oclinecore;

import org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot.OCLinEcoreCS2Pivot;
import org.eclipse.ocl.examples.xtext.oclinecore.pivot2cs.OCLinEcorePivot2CS;
import org.eclipse.ocl.examples.xtext.oclinecore.utilities.OCLinEcoreCS2MonikerVisitor;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OCLinEcoreStandaloneSetup extends OCLinEcoreStandaloneSetupGenerated
{
	private static Injector injector = null;
	
	public static void doSetup() {
		init();
		if (injector == null) {
			injector = new OCLinEcoreStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
	}

	public static void init() {
		OCLinEcoreCS2MonikerVisitor.FACTORY.getClass();
		OCLinEcoreCS2Pivot.FACTORY.getClass();
		OCLinEcorePivot2CS.FACTORY.getClass();
	}
	
	/**
	 * Return the Injector for this plugin.
	 */
	public static final Injector getInjector() {
		if (injector == null) {
			doSetup();
		}
		return injector;
	}
}

