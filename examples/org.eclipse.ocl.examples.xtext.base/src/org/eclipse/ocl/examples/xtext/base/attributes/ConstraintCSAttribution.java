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
 * $Id: ConstraintCSAttribution.java,v 1.3 2011/04/20 19:02:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ConstraintCS;

public class ConstraintCSAttribution extends AbstractAttribution
{
	public static final ConstraintCSAttribution INSTANCE = new ConstraintCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		ConstraintCS targetElement = (ConstraintCS)target;
		Constraint pivot = PivotUtil.getPivot(Constraint.class, targetElement);
		if (pivot != null) {
			ValueSpecification specification = pivot.getSpecification();
			if (specification instanceof ExpressionInOcl) {
				Variable contextVariable = ((ExpressionInOcl)specification).getContextVariable();
				if (contextVariable != null) {
					environmentView.addNamedElement(contextVariable);
					Type type = contextVariable.getType();
					environmentView.addElementsOfScope(type, scopeView);
				}
				Variable resultVariable = ((ExpressionInOcl)specification).getResultVariable();
				if (resultVariable != null) {
					environmentView.addNamedElement(resultVariable);
				}
			}
		}
		return scopeView.getParent();
	}
}
