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
 * $Id: EmptyCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;

/**
 * Scopes that are intentionally empty.
 */
public class EmptyCSScopeAdapter extends ElementCSScopeAdapter<ElementCS>
{
	public EmptyCSScopeAdapter(ElementCS csElement) {
		super(csElement);
	}
}
