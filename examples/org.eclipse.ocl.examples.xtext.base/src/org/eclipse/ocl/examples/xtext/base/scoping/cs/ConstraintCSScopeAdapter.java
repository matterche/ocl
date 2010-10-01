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
 * $Id: ConstraintCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:13:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.FeatureCS;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;

public class ConstraintCSScopeAdapter extends BaseCSScopeAdapter<ConstraintCS, Constraint>
{
	public ConstraintCSScopeAdapter(ConstraintCS csElement) {
		super(csElement, Constraint.class);
	}

	@Override
	public ScopeAdapter getSourceScope(EStructuralFeature containmentFeature) {
		ConstraintCS target = getTarget();
		EObject eContainer = target.eContainer();
		if (eContainer instanceof FeatureCS) {
			eContainer = eContainer.eContainer();
		}
		return getScopeAdapter(eContainer);
	}
}
