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
 * $Id: ContextCSScopeAdapter.java,v 1.1.2.2 2010/12/11 10:45:57 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.AbstractRootCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;

public class ContextCSScopeAdapter extends AbstractRootCSScopeAdapter<ContextCS, ExpressionInOcl>
{
	public ContextCSScopeAdapter(PivotManager pivotManager, ContextCS csElement) {
		super(pivotManager, csElement, ExpressionInOcl.class);
	}
}
