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
 * $Id: Visitable.java,v 1.1.2.1 2010/10/05 17:38:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.utilities;


/**
 */
public interface Visitable
{
	<T> T accept(Visitor<T> visitor);
} // Visitable
