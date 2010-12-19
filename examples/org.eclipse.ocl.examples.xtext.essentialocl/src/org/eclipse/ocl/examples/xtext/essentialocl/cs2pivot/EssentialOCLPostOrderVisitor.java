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
 * $Id: EssentialOCLPostOrderVisitor.java,v 1.1.2.5 2010/12/19 15:54:34 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.apache.log4j.Logger;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasePostOrderVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.SingleContinuation;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BinaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.BooleanLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.IndexExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvalidLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.LetVariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NestedExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NullLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NumberLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.PrefixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SelfExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnaryOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.UnlimitedNaturalLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;

public class EssentialOCLPostOrderVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<Continuation<?>, CS2PivotConversion, BasePostOrderVisitor>
{
	static final Logger logger = Logger.getLogger(EssentialOCLPostOrderVisitor.class);

	protected static class ContextCSCompletion extends SingleContinuation<ContextCS>
	{
		public ContextCSCompletion(CS2PivotConversion context, ContextCS csElement) {
			super(context, null, null, csElement);
		}

		@Override
		public BasicContinuation<?> execute() {
			context.visitLeft2Right(csElement);
			return null;
		}
	}
	
	public EssentialOCLPostOrderVisitor(CS2PivotConversion context) {
		super(new BasePostOrderVisitor(context), context);
	}
	  
	@Override
	public Continuation<?> visitBinaryOperatorCS(BinaryOperatorCS csBinaryOperator) {
		return null;
	}

	@Override
	public Continuation<?> visitBooleanLiteralExpCS(BooleanLiteralExpCS csBooleanLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitCollectionLiteralExpCS(CollectionLiteralExpCS csCollectionLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitCollectionLiteralPartCS(CollectionLiteralPartCS csCollectionLiteralPart) {
		return null;
	}

	@Override
	public Continuation<?> visitCollectionTypeCS(CollectionTypeCS csCollectionType) {
		return null;
	}

	@Override
	public Continuation<?> visitContextCS(ContextCS csContext) {
		ExpCS ownedExpression = csContext.getOwnedExpression();
		if (ownedExpression != null) {
			return new ContextCSCompletion(context, csContext);
		}
		else {
			return null;
		}
	}

	@Override
	public Continuation<?> visitExpCS(ExpCS object) {
		return super.visiting(object);
	}

/*	@Override
	public Continuation<?> visitExpConstraintCS(ExpConstraintCS csLibConstraint) {
		Continuation<?> continuation = super.visitExpConstraintCS(csLibConstraint);
		ExpCS ownedExpression = csLibConstraint.getOwnedExpression();
		if (ownedExpression == null) {
			return continuation;
		}
		return Continuations.combine(continuation, new ExpConstraintCSCompletion(context, csLibConstraint));
	} */

	@Override
	public Continuation<?> visitIfExpCS(IfExpCS csIfExp) {
		return null;
	}

	@Override
	public Continuation<?> visitIndexExpCS(IndexExpCS csIndexExp) {
		return null;
	}

	@Override
	public Continuation<?> visitInfixExpCS(InfixExpCS csInfixExp) {
		return null;
	}

	@Override
	public Continuation<?> visitInvalidLiteralExpCS(InvalidLiteralExpCS csInvalidLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitLetExpCS(LetExpCS csLetExp) {
		return null;
	}

	@Override
	public Continuation<?> visitLetVariableCS(LetVariableCS csLetVariable) {
		return null;
	}

	@Override
	public Continuation<?> visitNameExpCS(NameExpCS csNameExp) {
		return null;
	}

	@Override
	public Continuation<?> visitNavigatingArgCS(NavigatingArgCS csNavigatingArg) {
		return null;
	}

	@Override
	public Continuation<?> visitNavigatingExpCS(NavigatingExpCS csNavigatingExp) {
		return null;
	}

	@Override
	public Continuation<?> visitNavigationOperatorCS(NavigationOperatorCS csNavigationOperator) {
		return null;
	}

	@Override
	public Continuation<?> visitNestedExpCS(NestedExpCS csNestedExp) {
		return null;
	}

	@Override
	public Continuation<?> visitNullLiteralExpCS(NullLiteralExpCS csNullLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitNumberLiteralExpCS(NumberLiteralExpCS csNumberLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitPrefixExpCS(PrefixExpCS csPrefixExp) {
		return null;
	}

	@Override
	public Continuation<?> visitSelfExpCS(SelfExpCS csSelfExp) {
		return null;
	}

	@Override
	public Continuation<?> visitStringLiteralExpCS(StringLiteralExpCS csStringLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitTypeLiteralExpCS(TypeLiteralExpCS csTypeLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitTypeNameExpCS(TypeNameExpCS csTypeNameExp) {
		context.installPivotElement(csTypeNameExp, csTypeNameExp.getElement());
		return null;
	}

	@Override
	public Continuation<?> visitUnaryOperatorCS(UnaryOperatorCS csUnaryOperator) {
		return null;
	}

	@Override
	public Continuation<?> visitUnlimitedNaturalLiteralExpCS(UnlimitedNaturalLiteralExpCS csUnlimitedNaturalLiteralExp) {
		return null;
	}

	@Override
	public Continuation<?> visitVariableCS(VariableCS csVariable) {
		return null;
	}	
}