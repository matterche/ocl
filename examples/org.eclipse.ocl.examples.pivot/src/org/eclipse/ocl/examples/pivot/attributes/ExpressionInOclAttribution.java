/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id: ExpressionInOclAttribution.java,v 1.3 2011/04/20 19:02:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;

public class ExpressionInOclAttribution extends AbstractAttribution
{
	public static final ExpressionInOclAttribution INSTANCE = new ExpressionInOclAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		ExpressionInOcl targetExpression = (ExpressionInOcl) target;
		Variable contextVariable = targetExpression.getContextVariable();
		if (contextVariable != null) {
			environmentView.addNamedElement(contextVariable);
			Type type = contextVariable.getType();
			environmentView.addElementsOfScope(type, scopeView);
		}
		Variable resultVariable = targetExpression.getResultVariable();
		if (resultVariable != null) {
			environmentView.addNamedElement(resultVariable);
		}
		return scopeView.getParent();
	}
}
