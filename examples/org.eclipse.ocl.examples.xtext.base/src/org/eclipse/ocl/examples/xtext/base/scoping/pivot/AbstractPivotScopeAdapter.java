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
 * $Id: AbstractPivotScopeAdapter.java,v 1.2 2011/01/24 21:00:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.Element;

/**
 * An AbstractPivotScopeAdapter provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * pivot elements.
 *
 * @param <T>
 */
public abstract class AbstractPivotScopeAdapter<T extends Element> extends AbstractScopeAdapter<T> implements PivotScopeAdapter
{	
	public boolean isAdapterForType(Object type) {
		return type == PivotScopeAdapter.class;
	}
}
