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
 * $Id: EssentialOCLUiModule.java,v 1.7 2011/05/15 20:22:16 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class EssentialOCLUiModule extends org.eclipse.ocl.examples.xtext.essentialocl.ui.AbstractEssentialOCLUiModule
{
	public static final String EDITOR_ID = "org.eclipse.ocl.examples.xtext.essentialocl.EssentialOCL";

	public EssentialOCLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
}
