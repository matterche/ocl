package org.eclipse.ocl.examples.xtext.essentialocl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLGrammarAccess;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractEssentialOCLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EssentialOCLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EssentialOCLGrammarAccess) access;
		match_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q = new AlternativeAlias(false, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLessThanSignKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getGreaterThanSignKeyword_1_1_2())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q.equals(syntax))
				emit_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (('<' '>') | ('(' ')'))?
	 */
	protected void emit_TupleTypeCS_____LeftParenthesisKeyword_1_0_0_RightParenthesisKeyword_1_0_2___or___LessThanSignKeyword_1_1_0_GreaterThanSignKeyword_1_1_2____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
