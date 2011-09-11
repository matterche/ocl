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
 * $Id: EssentialOCLCSScopeAdapter.java,v 1.5 2011/05/14 11:03:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.BaseCSScopeAdapter;

public abstract class EssentialOCLCSScopeAdapter<CS extends ModelElementCS, P extends Element> extends BaseCSScopeAdapter<CS, P>
{	
	protected EssentialOCLCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		super(csElement, pivotClass);
	}	

	protected EssentialOCLCSScopeAdapter(EObject eParent, CS csElement, Class<P> pivotClass) {
		super(eParent, csElement, pivotClass);
	}	
}
