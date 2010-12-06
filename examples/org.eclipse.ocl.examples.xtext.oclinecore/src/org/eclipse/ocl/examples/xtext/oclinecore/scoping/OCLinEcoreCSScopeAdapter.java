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
 * $Id: OCLinEcoreCSScopeAdapter.java,v 1.1.2.2 2010/12/06 18:28:19 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.scoping;

import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.EssentialOCLCSScopeAdapter;

public class OCLinEcoreCSScopeAdapter<CS extends MonikeredElementCS, P extends MonikeredElement> extends EssentialOCLCSScopeAdapter<CS, P>
{
	public OCLinEcoreCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		super(csElement, pivotClass);
	}
	
}
