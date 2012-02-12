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
 * $Id: EssentialOCLProposalProvider.java,v 1.1 2010/04/13 06:33:11 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class EssentialOCLProposalProvider extends AbstractEssentialOCLProposalProvider
{
	protected static Image collectionTypeImage = null;
	private static Image primitiveTypeImage = null;

	@Override
	public void complete_CollectionTypeIdentifier(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (collectionTypeImage == null) {
			collectionTypeImage = getImage(PivotFactory.eINSTANCE.createCollectionType());
		}
		proposeKeywordAlternatives(ruleCall, context, acceptor, collectionTypeImage);
		super.complete_CollectionTypeIdentifier(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_PrefixOperator(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeKeywordAlternatives(ruleCall, context, acceptor, null);
		super.complete_PrefixOperator(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_InfixOperator(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeKeywordAlternatives(ruleCall, context, acceptor, null);
		super.complete_InfixOperator(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_NavigationOperator(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeKeywordAlternatives(ruleCall, context, acceptor, null);
		super.complete_NavigationOperator(model, ruleCall, context, acceptor);
	}

	@Override
	public void complete_PrimitiveTypeIdentifier(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		proposeKeywordAlternatives(ruleCall, context, acceptor, getPrimitiveTypeImage());
	}

	protected Image getPrimitiveTypeImage() {
		if (primitiveTypeImage == null) {
			primitiveTypeImage = getImage(PivotFactory.eINSTANCE.createPrimitiveType());
		}
		return primitiveTypeImage;
	}

	protected void proposeKeywordAlternatives(RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor, Image image) {
		AbstractElement alternatives = ruleCall.getRule().getAlternatives();
		if (alternatives instanceof Alternatives) {
			for (AbstractElement alternative : ((Alternatives)alternatives).getElements()) {
				if (alternative instanceof Keyword) {
					Keyword keyword = (Keyword)alternative;
					String name = keyword.getValue();
					acceptor.accept(createCompletionProposal(name, name, image, context));
				}
			}
		}
		else if (alternatives instanceof RuleCall) {
			proposeKeywordAlternatives((RuleCall)alternatives, context, acceptor, image);
		}
	}
}
