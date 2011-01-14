/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AbstractFeature.java,v 1.1.2.7 2011/01/14 14:54:33 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;

/**
 * @since 3.1
 */
public abstract class AbstractFeature implements LibraryFeature
{
	public Diagnostic validate(PivotManager pivotManager, CallExp callExp) {
		return null;
	}
}
