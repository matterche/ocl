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
 * $Id: Continuation.java,v 1.1.2.3 2011/01/07 12:13:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.util.List;


public interface Continuation<T>
{
	void addTo(List<BasicContinuation<?>> simpleContinuations);
//	boolean canExecute();
//	BasicContinuation<?> execute();
}