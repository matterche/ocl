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
 * $Id: Dependency.java,v 1.1.2.1 2010/12/06 17:53:58 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

public abstract class Dependency<T>
{
	protected final T element;
	
	public Dependency(T element) {
		this.element = element;
		assert element != null;
	}

	public abstract boolean canExecute();

	public T getElement() {
		return element;
	}		
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + '(' + element + ')';
	}		
}