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
 * $Id: EssentialOCLPreOrderVisitor.java,v 1.1.2.1 2010/12/06 18:03:09 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasePreOrderVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;

public class EssentialOCLPreOrderVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<Continuation<?>, CS2PivotConversion, BasePreOrderVisitor>
{
	public EssentialOCLPreOrderVisitor(CS2PivotConversion context) {
		super(new BasePreOrderVisitor(context), context);
	}

	@Override
	public Continuation<?> visitContextCS(ContextCS csContext) {
		return Continuation.TERMINATE;
	}

	@Override
	public Continuation<?> visitExpCS(ExpCS csExp) {
		return Continuation.TERMINATE;
	}

	@Override
	public Continuation<?> visitOperatorCS(OperatorCS object) {
		return Continuation.TERMINATE;
	}

	@Override
	public Continuation<?> visitNavigatingArgCS(NavigatingArgCS csNavigatingArg) {
		return Continuation.TERMINATE;
	}

	@Override
	public Continuation<?> visitVariableCS(VariableCS csVariable) {
		return Continuation.TERMINATE;
	}
}