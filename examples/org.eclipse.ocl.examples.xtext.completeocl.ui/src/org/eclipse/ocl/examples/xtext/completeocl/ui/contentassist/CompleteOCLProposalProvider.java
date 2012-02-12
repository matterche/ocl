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
 * $Id: CompleteOCLProposalProvider.java,v 1.1 2010/04/13 06:36:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Predicate;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class CompleteOCLProposalProvider extends AbstractCompleteOCLProposalProvider
{
	@Override
	public void complete_PrimitiveTypeIdentifier(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeKeywordAlternatives(ruleCall, context, acceptor, getPrimitiveTypeImage());
	}
	
//	@Override
//	public void createProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		System.out.println("createProposals: ");
//		super.createProposals(context, acceptor);
//	}

//	@Override
//	protected void invokeMethod(String methodName, ICompletionProposalAcceptor acceptor, Object... params) {
//		System.out.println("  invokeMethod: " + methodName);
//		super.invokeMethod(methodName, acceptor, params);
//	}

	@Override
	protected void lookupCrossReference(CrossReference crossReference,
			EReference reference, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor,
			Predicate<IEObjectDescription> filter) {
		EObject currentModel = contentAssistContext.getCurrentModel();
		if (currentModel instanceof InfixExpCS) {
			EObject previousModel = contentAssistContext.getPreviousModel();
			if (previousModel instanceof NavigationOperatorCS) {
				ExpCS argument = ((NavigationOperatorCS)previousModel).getArgument();
				if (argument != null) {
					currentModel = argument;
				}
			}
		}
//		super.lookupCrossReference(crossReference, reference, contentAssistContext,
//			acceptor, filter);
		String ruleName = null;
		if (crossReference.getTerminal() instanceof RuleCall) {
			ruleName = ((RuleCall) crossReference.getTerminal()).getRule().getName();
		}
		lookupCrossReference(currentModel, reference, acceptor, filter,
				getProposalFactory(ruleName, contentAssistContext));
	}

//	@Override
//	protected void lookupCrossReference(EObject model, EReference reference,
//			ICompletionProposalAcceptor acceptor,
//			Predicate<IEObjectDescription> filter,
//			Function<IEObjectDescription, ICompletionProposal> proposalFactory) {
//		System.out.println("    lookupCrossReference: " + reference.getEContainingClass().getName() + "::" + reference.getName());
//		super.lookupCrossReference(model, reference, acceptor, filter, proposalFactory);
//	}
}
