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
 * $Id: SelfExpCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:30:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SelfExpCSScopeAdapter extends ExpCSScopeAdapter<SelfExpCS, OclExpression>
{
	public SelfExpCSScopeAdapter(SelfExpCS csElement) {
		super(csElement, OclExpression.class);
	}

	@Override
	public Type getSynthesizedType() {
		IScope scope = getOuterScopeView(null);
		IEObjectDescription selfDescription = scope.getContentByName("self");
		if (selfDescription == null) {
			return null;
		}
		EObject selfObject = selfDescription.getEObjectOrProxy();
		ScopeAdapter selfScopeAdapter = getScopeAdapter(selfObject);
		if (selfScopeAdapter == null) {
			return null;
		}
		Type type = selfScopeAdapter.getSynthesizedType();
		if (type == null) {
			return null;
		}
		return type;
	}
}
