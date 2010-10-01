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
 * $Id: NestedExpCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:30:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;

public class NestedExpCSScopeAdapter extends ExpCSScopeAdapter<NestedExpCS, OclExpression>
{
	public NestedExpCSScopeAdapter(NestedExpCS csElement) {
		super(csElement, OclExpression.class);
	}

	@Override
	public Type getSynthesizedType() {
		ExpCS source = getTarget().getSource();
		return getScopeAdapter(source).getSynthesizedType();
	}
}
