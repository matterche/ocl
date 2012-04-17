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
 * $Id: AbstractAttribution.java,v 1.5 2011/04/25 09:50:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.scoping;

import org.eclipse.emf.ecore.EObject;

/**
 * Ann AbstractAttribution provides the basic behaviour for a family of derived
 * classes that provide additional scope/environment behaviour for corresponding
 * CS elements.
 *
 * @param <T>
 */
public abstract class AbstractAttribution implements Attribution
{	
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		return scopeView.getParent();
	}
}
