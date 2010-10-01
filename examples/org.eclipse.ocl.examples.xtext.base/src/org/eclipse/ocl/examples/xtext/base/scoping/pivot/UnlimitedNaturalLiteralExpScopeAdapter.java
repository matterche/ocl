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
 * $Id: UnlimitedNaturalLiteralExpScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.pivot;

import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;

public class UnlimitedNaturalLiteralExpScopeAdapter extends ExpressionScopeAdapter<UnlimitedNaturalLiteralExp>
{
	public UnlimitedNaturalLiteralExpScopeAdapter(UnlimitedNaturalLiteralExp pivotElement) {
		super(pivotElement);
	}
	
	@Override
	public Type getSynthesizedType() {
		return getLibraryUnlimitedNaturalType();
	}
}
