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
 * $Id: EssentialOCLPreOrderVisitor.java,v 1.1.2.4 2011/01/20 19:49:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasePreOrderVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.SingleContinuation;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;

public class EssentialOCLPreOrderVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<Continuation<?>, CS2PivotConversion, BasePreOrderVisitor>
{
	protected static class NameExpContinuation extends SingleContinuation<NameExpCS>
	{
		public NameExpContinuation(CS2PivotConversion context, NameExpCS csElement) {
			super(context, null, null, csElement, context.getPackagesHaveTypesInterDependency());
		}

		@Override
		public BasicContinuation<?> execute() {
			for (Namespace namespace : csElement.getNamespace()) {
				@SuppressWarnings("unused")
				Namespace dummy = namespace;	// Resolves the proxies from the outside.
			}
			return null;
		}
	}

	protected static class TypeNameExpContinuation extends SingleContinuation<TypeNameExpCS>
	{
		public TypeNameExpContinuation(CS2PivotConversion context, TypeNameExpCS csElement) {
			super(context, null, null, csElement, context.getPackagesHaveTypesInterDependency());
		}

		@Override
		public BasicContinuation<?> execute() {
			for (Namespace namespace : csElement.getNamespace()) {
				@SuppressWarnings("unused")
				Namespace dummy = namespace;	// Resolves the proxies from the outside.
			}
			Type element = csElement.getElement();
			if ((element == null) || element.eIsProxy()) {
				context.addBadExpressionError(csElement, OCLMessages.ErrorUnresolvedTypeName, csElement.toString());
				element = context.getPivotManager().getOclInvalidType();	// FIXME with reason
			}
			context.installPivotElement(csElement, element);
			return null;
		}
	}

	public EssentialOCLPreOrderVisitor(CS2PivotConversion context) {
		super(new BasePreOrderVisitor(context), context);
	}

	@Override
	public Continuation<?> visitContextCS(ContextCS csContext) {
		return null;
	}

	@Override
	public Continuation<?> visitExpCS(ExpCS csExp) {
		return null;
	}

	@Override
	public Continuation<?> visitNameExpCS(NameExpCS csNameExp) {
		if (csNameExp.getNamespace().isEmpty()) {
			return null;
		}
		else {
			return new NameExpContinuation(context, csNameExp);
		}
	}

	@Override
	public Continuation<?> visitNavigatingArgCS(NavigatingArgCS csNavigatingArg) {
		return null;
	}

	@Override
	public Continuation<?> visitOperatorCS(OperatorCS object) {
		return null;
	}

	@Override
	public Continuation<?> visitTypeNameExpCS(TypeNameExpCS csTypeNameExp) {
		return new TypeNameExpContinuation(context, csTypeNameExp);
	}

	@Override
	public Continuation<?> visitVariableCS(VariableCS csVariable) {
		return null;
	}
}