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
 * $Id: CompleteOCLStandaloneSetup.java,v 1.1.6.4 2010/12/19 18:33:51 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.completeocl;

import org.eclipse.ocl.examples.xtext.completeocl.cs2pivot.CompleteOCLCS2Pivot;
import org.eclipse.ocl.examples.xtext.completeocl.utilities.CompleteOCLCS2MonikerVisitor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CompleteOCLStandaloneSetup extends CompleteOCLStandaloneSetupGenerated{

	public static void doSetup() {
		CompleteOCLCS2MonikerVisitor.FACTORY.getClass();
		CompleteOCLCS2Pivot.FACTORY.getClass();
		new CompleteOCLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

