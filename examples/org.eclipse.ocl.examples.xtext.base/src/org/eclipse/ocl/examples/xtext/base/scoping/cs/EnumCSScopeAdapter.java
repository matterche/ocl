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
 * $Id: EnumCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;

public class EnumCSScopeAdapter extends BaseCSScopeAdapter<EnumerationCS, Enumeration>
{
	public EnumCSScopeAdapter(EnumerationCS csElement) {
		super(csElement, Enumeration.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		Enumeration pivot = getPivot();
		if (pivot != null) {
			environmentView.addNamedElements(PivotPackage.Literals.ENUMERATION_LITERAL, pivot.getOwnedLiterals());
			environmentView.addElements(PivotPackage.Literals.TEMPLATE_PARAMETER, ElementUtil.getTemplateParameters(pivot));
		}
		addLibContents(environmentView, getLibraryOclAnyType(), scopeView);
		return scopeView.getOuterScope();
	}
}
