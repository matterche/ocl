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
 * $Id: BaseCSScopeAdapter.java,v 1.4 2011/05/11 19:50:49 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;

public abstract class BaseCSScopeAdapter<CS extends ModelElementCS, P extends Element> extends ModelElementCSScopeAdapter<CS, P>
{	
	protected BaseCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		super(csElement, pivotClass);
	}

	protected BaseCSScopeAdapter(EObject csDocumentElement, CS csElement, Class<P> pivotClass) {
		super(csDocumentElement, csElement, pivotClass);
	}
}
