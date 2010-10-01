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
 * $Id: DefaultScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;

/**
 * Scopes that are accidentally empty; a debugging aid.
 */
public class DefaultScopeAdapter extends ModelElementCSScopeAdapter<ModelElementCS, Element>
{
	public DefaultScopeAdapter(ModelElementCS csElement) {
		super(csElement, Element.class);
	}
}
