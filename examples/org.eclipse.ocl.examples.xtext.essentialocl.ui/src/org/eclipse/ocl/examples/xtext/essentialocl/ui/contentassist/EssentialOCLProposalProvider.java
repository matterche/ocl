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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Predicate;
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

/*	@Override
	public void createProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("createProposals: ");
		super.createProposals(context, acceptor);
	} */

	protected EObject getPathScope(EObject model, ContentAssistContext context) {
		int offset = context.getOffset();
		INode currentNode = context.getCurrentNode();
		INode offsetNode = NodeModelUtils.findLeafNodeAtOffset(currentNode, offset);
		EObject eObject = NodeModelUtils.findActualSemanticObjectFor(offsetNode);
		if (!(eObject instanceof PathElementCS)) {
			offsetNode = NodeModelUtils.findLeafNodeAtOffset(currentNode, offset-1);
			eObject = NodeModelUtils.findActualSemanticObjectFor(offsetNode);
		}
		if (eObject instanceof PathElementCS) {
			model = eObject;
		}
		return model;
	}

	protected Image getPrimitiveTypeImage() {
		if (primitiveTypeImage == null) {
			primitiveTypeImage = getImage(PivotFactory.eINSTANCE.createPrimitiveType());
		}
		return primitiveTypeImage;
	}

/*	@Override
	protected void invokeMethod(String methodName, ICompletionProposalAcceptor acceptor, Object... params) {
		System.out.println("  invokeMethod: " + methodName);
		super.invokeMethod(methodName, acceptor, params);
	} */

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
//		else if (currentModel instanceof SimpleNamedElementRefCS) {
//			currentModel = getPathScope(currentModel, contentAssistContext);
//		}
		else if (currentModel instanceof PathNameCS) {
			currentModel = getPathScope(currentModel, contentAssistContext);
		}
		String ruleName = null;
		if (crossReference.getTerminal() instanceof RuleCall) {
			ruleName = ((RuleCall) crossReference.getTerminal()).getRule().getName();
		}
		lookupCrossReference(currentModel, reference, acceptor, filter,
				getProposalFactory(ruleName, contentAssistContext));
	}

/*	@Override
	protected void lookupCrossReference(EObject model, EReference reference,
			ICompletionProposalAcceptor acceptor,
			Predicate<IEObjectDescription> filter,
			Function<IEObjectDescription, ICompletionProposal> proposalFactory) {
		System.out.println("    lookupCrossReference: " + reference.getEContainingClass().getName() + "::" + reference.getName());
		super.lookupCrossReference(model, reference, acceptor, filter, proposalFactory);
	} */

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
