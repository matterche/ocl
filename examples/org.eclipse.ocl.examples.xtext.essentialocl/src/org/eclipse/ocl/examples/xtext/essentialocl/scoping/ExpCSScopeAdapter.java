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
 * $Id: ExpCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:30:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;

public abstract class ExpCSScopeAdapter<CS extends ExpCS, P extends OclExpression> extends EssentialOCLCSScopeAdapter<CS, P>
{
	public ExpCSScopeAdapter(CS csElement, Class<P> pivotClass) {
		super(csElement, pivotClass);
	}

	protected ScopeAdapter getParentSourceScope() {
		return getParent().getSourceScope(getTarget().eContainingFeature());
	}

	@Override
	public ScopeAdapter getSourceScope(EStructuralFeature containmentFeature) {
		return getParentSourceScope();
	}

	@Override
	public abstract Type getSynthesizedType();
}
