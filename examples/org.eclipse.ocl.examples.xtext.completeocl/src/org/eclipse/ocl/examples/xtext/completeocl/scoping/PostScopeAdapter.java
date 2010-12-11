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
 * $Id: PostScopeAdapter.java,v 1.4.6.3 2010/12/11 10:44:23 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.EssentialOCLCSScopeAdapter;

public class PostScopeAdapter extends EssentialOCLCSScopeAdapter<PostCS, Constraint>
{
	public PostScopeAdapter(PivotManager pivotManager, PostCS csElement) {
		super(pivotManager, csElement, Constraint.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.EXP_CONSTRAINT_CS__OWNED_EXPRESSION) {
			PostCS csPost = getTarget();
			OperationContextDeclCS csOperation = (OperationContextDeclCS) csPost.eContainer();
			environmentView.addNamedElement(csOperation.getResult());		
		}
		return scopeView.getOuterScope();
	}
}
