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
 * $Id: TemplateSignatureCSScopeAdapter.java,v 1.1.2.4 2011/01/22 19:09:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.pivot.TemplateSignature;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateSignatureCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class TemplateSignatureCSScopeAdapter extends MonikeredElementCSScopeAdapter<TemplateSignatureCS, TemplateSignature>
{
	public TemplateSignatureCSScopeAdapter(PivotManager pivotManager, TemplateSignatureCS csElement) {
		super(pivotManager, csElement, TemplateSignature.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		TemplateSignature pivot = getPivot();
		if (pivot != null) {
			environmentView.addElements(pivot.getOwnedParameters());
		}
		return scopeView.getOuterScope();
	}
}
