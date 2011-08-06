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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.utilities;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * A PathElement represents a segment in a qualified name.
 * <br>
 * A pair of Lists of PathElement can have their common prefix skipped by @link{getCommonLength}
 * to provide a scope dependent qualified name.
 */
public class PathElement
{
	public static int getCommonLength(List<PathElement> firstPath, List<PathElement> secondPath) {
		int iMax = Math.min(firstPath.size(), secondPath.size());
		for (int i = 0; i < iMax; i++) {
			EObject objectElement = firstPath.get(i).element;
			EObject contextElement = secondPath.get(i).element;
			if (!objectElement.equals(contextElement)) {
				return i;
			}
		}
		return iMax;
	}

	protected final String name;
	protected final EObject element;
	
	public PathElement(String name, EObject element) {
		super();
		this.name = name;
		this.element = element;
	}

	public final EObject getElement() {
		return element;
	}

	public final String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}