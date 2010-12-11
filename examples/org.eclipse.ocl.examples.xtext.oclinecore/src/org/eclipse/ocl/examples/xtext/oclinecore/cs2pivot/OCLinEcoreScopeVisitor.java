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
 * $Id: OCLinEcoreScopeVisitor.java,v 1.1.2.1 2010/12/11 10:44:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot;

import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLScopeVisitor;
import org.eclipse.ocl.examples.xtext.oclinecore.util.AbstractExtendingDelegatingOCLinEcoreCSVisitor;

public class OCLinEcoreScopeVisitor
	extends AbstractExtendingDelegatingOCLinEcoreCSVisitor<ScopeCSAdapter, PivotManager, EssentialOCLScopeVisitor>
{
	public OCLinEcoreScopeVisitor(PivotManager context) {
		super(new EssentialOCLScopeVisitor(context), context);
	}
}