package org.eclipse.ocl.examples.xtext.oclinecore.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.oclinecore.services.OCLinEcoreGrammarAccess;
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
public class AbstractOCLinEcoreSyntacticSequencer extends AbstractSyntacticSequencer {

	protected OCLinEcoreGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AttributeCS_CommaKeyword_5_1_1_q;
	protected AbstractElementAlias match_AttributeCS_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__;
	protected AbstractElementAlias match_ClassCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__;
	protected AbstractElementAlias match_DataTypeCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	protected AbstractElementAlias match_DataTypeCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_EnumerationCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	protected AbstractElementAlias match_EnumerationCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_EnumerationLiteralCS_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__;
	protected AbstractElementAlias match_InvariantConstraintCS_ColonKeyword_3_0_q;
	protected AbstractElementAlias match_OperationCS_CommaKeyword_9_1_1_q;
	protected AbstractElementAlias match_OperationCS_SemicolonKeyword_10_1_or___LeftCurlyBracketKeyword_10_0_0_RightCurlyBracketKeyword_10_0_2__;
	protected AbstractElementAlias match_PackageCS_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__;
	protected AbstractElementAlias match_ParameterCS_CommaKeyword_2_1_1_q;
	protected AbstractElementAlias match_ParameterCS___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_ReferenceCS_CommaKeyword_6_1_1_q;
	protected AbstractElementAlias match_ReferenceCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__;
	protected AbstractElementAlias match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OCLinEcoreGrammarAccess) access;
		match_AttributeCS_CommaKeyword_5_1_1_q = new TokenAlias(false, true, grammarAccess.getAttributeCSAccess().getCommaKeyword_5_1_1());
		match_AttributeCS_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAttributeCSAccess().getLeftCurlyBracketKeyword_6_0_0()), new TokenAlias(false, false, grammarAccess.getAttributeCSAccess().getRightCurlyBracketKeyword_6_0_2())), new TokenAlias(false, false, grammarAccess.getAttributeCSAccess().getSemicolonKeyword_6_1()));
		match_ClassCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getClassCSAccess().getLeftCurlyBracketKeyword_7_0_0()), new TokenAlias(false, false, grammarAccess.getClassCSAccess().getRightCurlyBracketKeyword_7_0_2())), new TokenAlias(false, false, grammarAccess.getClassCSAccess().getSemicolonKeyword_7_1()));
		match_DataTypeCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDataTypeCSAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getDataTypeCSAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getDataTypeCSAccess().getSemicolonKeyword_5_1()));
		match_DataTypeCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDataTypeCSAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getDataTypeCSAccess().getRightCurlyBracketKeyword_4_2()));
		match_EnumerationCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEnumerationCSAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getEnumerationCSAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getEnumerationCSAccess().getSemicolonKeyword_5_1()));
		match_EnumerationCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEnumerationCSAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getEnumerationCSAccess().getRightCurlyBracketKeyword_4_2()));
		match_EnumerationLiteralCS_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEnumerationLiteralCSAccess().getLeftCurlyBracketKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getEnumerationLiteralCSAccess().getRightCurlyBracketKeyword_2_0_2())), new TokenAlias(false, false, grammarAccess.getEnumerationLiteralCSAccess().getSemicolonKeyword_2_1()));
		match_InvariantConstraintCS_ColonKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getInvariantConstraintCSAccess().getColonKeyword_3_0());
		match_OperationCS_CommaKeyword_9_1_1_q = new TokenAlias(false, true, grammarAccess.getOperationCSAccess().getCommaKeyword_9_1_1());
		match_OperationCS_SemicolonKeyword_10_1_or___LeftCurlyBracketKeyword_10_0_0_RightCurlyBracketKeyword_10_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperationCSAccess().getLeftCurlyBracketKeyword_10_0_0()), new TokenAlias(false, false, grammarAccess.getOperationCSAccess().getRightCurlyBracketKeyword_10_0_2())), new TokenAlias(false, false, grammarAccess.getOperationCSAccess().getSemicolonKeyword_10_1()));
		match_PackageCS_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPackageCSAccess().getLeftCurlyBracketKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getPackageCSAccess().getRightCurlyBracketKeyword_4_0_2())), new TokenAlias(false, false, grammarAccess.getPackageCSAccess().getSemicolonKeyword_4_1()));
		match_ParameterCS_CommaKeyword_2_1_1_q = new TokenAlias(false, true, grammarAccess.getParameterCSAccess().getCommaKeyword_2_1_1());
		match_ParameterCS___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getParameterCSAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getParameterCSAccess().getRightCurlyBracketKeyword_3_2()));
		match_ReferenceCS_CommaKeyword_6_1_1_q = new TokenAlias(false, true, grammarAccess.getReferenceCSAccess().getCommaKeyword_6_1_1());
		match_ReferenceCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getReferenceCSAccess().getLeftCurlyBracketKeyword_7_0_0()), new TokenAlias(false, false, grammarAccess.getReferenceCSAccess().getRightCurlyBracketKeyword_7_0_2())), new TokenAlias(false, false, grammarAccess.getReferenceCSAccess().getSemicolonKeyword_7_1()));
		match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2()));
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
			if(match_AttributeCS_CommaKeyword_5_1_1_q.equals(syntax))
				emit_AttributeCS_CommaKeyword_5_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AttributeCS_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__.equals(syntax))
				emit_AttributeCS_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClassCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__.equals(syntax))
				emit_ClassCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DataTypeCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_DataTypeCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DataTypeCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_DataTypeCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumerationCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_EnumerationCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumerationCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_EnumerationCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumerationLiteralCS_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__.equals(syntax))
				emit_EnumerationLiteralCS_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InvariantConstraintCS_ColonKeyword_3_0_q.equals(syntax))
				emit_InvariantConstraintCS_ColonKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperationCS_CommaKeyword_9_1_1_q.equals(syntax))
				emit_OperationCS_CommaKeyword_9_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperationCS_SemicolonKeyword_10_1_or___LeftCurlyBracketKeyword_10_0_0_RightCurlyBracketKeyword_10_0_2__.equals(syntax))
				emit_OperationCS_SemicolonKeyword_10_1_or___LeftCurlyBracketKeyword_10_0_0_RightCurlyBracketKeyword_10_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PackageCS_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__.equals(syntax))
				emit_PackageCS_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterCS_CommaKeyword_2_1_1_q.equals(syntax))
				emit_ParameterCS_CommaKeyword_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterCS___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_ParameterCS___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferenceCS_CommaKeyword_6_1_1_q.equals(syntax))
				emit_ReferenceCS_CommaKeyword_6_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReferenceCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__.equals(syntax))
				emit_ReferenceCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q.equals(syntax))
				emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_AttributeCS_CommaKeyword_5_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_AttributeCS_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ClassCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_DataTypeCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_DataTypeCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_EnumerationCS_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_EnumerationCS___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_EnumerationLiteralCS_SemicolonKeyword_2_1_or___LeftCurlyBracketKeyword_2_0_0_RightCurlyBracketKeyword_2_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_InvariantConstraintCS_ColonKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_OperationCS_CommaKeyword_9_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_OperationCS_SemicolonKeyword_10_1_or___LeftCurlyBracketKeyword_10_0_0_RightCurlyBracketKeyword_10_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_PackageCS_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ParameterCS_CommaKeyword_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_ParameterCS___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ReferenceCS_CommaKeyword_6_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_ReferenceCS_SemicolonKeyword_7_1_or___LeftCurlyBracketKeyword_7_0_0_RightCurlyBracketKeyword_7_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_TupleTypeCS___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
