/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: Nameable.java,v 1.1.2.1 2010/12/06 17:20:45 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.util;

import org.eclipse.ocl.examples.pivot.utilities.PivotObject;

public interface Nameable extends PivotObject
{
	String getName();
}
