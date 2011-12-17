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
 * $Id: CompleteOCLUiModule.java,v 1.8 2011/05/15 20:22:20 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.ui;

import org.eclipse.ocl.examples.xtext.completeocl.ui.internal.CompleteOCLActivator;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CompleteOCLUiModule extends AbstractCompleteOCLUiModule
{
	public static final String EDITOR_ID = CompleteOCLActivator.ORG_ECLIPSE_OCL_EXAMPLES_XTEXT_COMPLETEOCL_COMPLETEOCL;

	public CompleteOCLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
}
