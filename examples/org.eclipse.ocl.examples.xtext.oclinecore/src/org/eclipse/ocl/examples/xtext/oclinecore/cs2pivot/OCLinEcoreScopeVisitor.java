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
 * $Id: OCLinEcoreScopeVisitor.java,v 1.5 2011/05/14 06:55:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot;

import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLScopeVisitor;
import org.eclipse.ocl.examples.xtext.oclinecore.util.AbstractExtendingDelegatingOCLinEcoreCSVisitor;

public class OCLinEcoreScopeVisitor
	extends AbstractExtendingDelegatingOCLinEcoreCSVisitor<CSScopeAdapter, Object, EssentialOCLScopeVisitor>
{
	public OCLinEcoreScopeVisitor() {
		super(new EssentialOCLScopeVisitor(), null);
	}
}