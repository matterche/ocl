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
package org.eclipse.ocl.examples.xtext.base.services;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;

/**
 * PivotResourceServiceProvider extends the DefaultResourceServiceProvider to ensure that
 * pivot: scheme URIs are handled by the primary language support rather than delegated
 * to one determined by the file extension.
 * 
 * This was originally provided to make hover text work for pivot references.
 */
public class PivotResourceServiceProvider extends DefaultResourceServiceProvider
{
	@Override
	public boolean canHandle(URI uri) {
		if (PivotUtil.SCHEME_PIVOT.equals(uri.scheme())) {
			return true;
		}
		else {
			return super.canHandle(uri);
		}
	}
}