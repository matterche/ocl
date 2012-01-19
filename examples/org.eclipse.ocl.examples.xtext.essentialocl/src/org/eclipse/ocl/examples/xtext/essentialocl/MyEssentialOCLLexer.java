package org.eclipse.ocl.examples.xtext.essentialocl;

import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lpg.runtime.IPrsStream;
import lpg.runtime.IToken;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.eclipse.ocl.AbstractEnvironment;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.LookupException;
import org.eclipse.ocl.SemanticException;
import org.eclipse.ocl.TypeResolver;
import org.eclipse.ocl.examples.xtext.essentialocl.parser.OCLLexer;
import org.eclipse.ocl.examples.xtext.essentialocl.parser.OCLParserprs;
import org.eclipse.ocl.examples.xtext.essentialocl.parser.OCLParsersym;
import org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.internal.InternalEssentialOCLParser;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.internal.l10n.OCLMessages;
import org.eclipse.ocl.lpg.DerivedLexStream;
import org.eclipse.ocl.lpg.DerivedPrsStream;
import org.eclipse.ocl.lpg.ProblemHandler;
import org.eclipse.ocl.lpg.ProblemHandler.Severity;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.utilities.OCLFactory;
import org.eclipse.ocl.utilities.UMLReflection;


public class MyEssentialOCLLexer extends org.eclipse.ocl.examples.xtext.essentialocl.parser.antlr.internal.InternalEssentialOCLLexer
{
	public static class LPG2ANTLRTokenMap
	{
		private Map<String, Integer> kindToType = new HashMap<String, Integer>();
		private Integer type_RULE_ML_COMMENT;
		private Integer type_RULE_WS;
		private int kind_EOF_TOKEN;
		
		public LPG2ANTLRTokenMap(String[] lpgOrderedTerminalSymbols, String[] antlrTokenNames) {
			Map<String, Integer> nameToType = new HashMap<String, Integer>();
			for (int i = 0; i < antlrTokenNames.length; i++) {
				nameToType.put(antlrTokenNames[i], i);
			}
			type_RULE_ML_COMMENT = nameToType.get("RULE_ML_COMMENT");
			type_RULE_WS = nameToType.get("RULE_WS");
			for (int kind = 0; kind < lpgOrderedTerminalSymbols.length; kind++) {
				String key = lpgOrderedTerminalSymbols[kind];
				if ("EOF_TOKEN".equals(key)) {
					kind_EOF_TOKEN = kind;
					continue;
				}
				Integer type = nameToType.get("'" + key + "'");
				if (type == null) {
					if ("COLON".equals(key)) type = nameToType.get("':'");
//					else if ("QUOTED_IDENTIFIER".equals(key)) type = nameToType.get(":");
		            else if ("IDENTIFIER".equals(key)) type = nameToType.get("RULE_SIMPLE_ID");
		            else if ("LPAREN".equals(key)) type = nameToType.get("'('");
		            else if ("RPAREN".equals(key)) type = nameToType.get("')'");
		            else if ("COMMA".equals(key)) type = nameToType.get("','");
		            else if ("EQUAL".equals(key)) type = nameToType.get("'='");
		            else if ("STRING_LITERAL".equals(key)) type = nameToType.get("RULE_SINGLE_QUOTED_STRING");
		            else if ("MINUS".equals(key)) type = nameToType.get("'-'");
		            else if ("MULTIPLY".equals(key)) type = nameToType.get("'*'");
		            else if ("INTEGER_LITERAL".equals(key)) type = nameToType.get("RULE_INT");
		            else if ("REAL_LITERAL".equals(key)) type = nameToType.get("RULE_REAL");
		            else if ("BAR".equals(key)) type = nameToType.get("'|'");
		            else if ("COLONCOLON".equals(key)) type = nameToType.get("'::'");
		            else if ("QUESTIONMARK".equals(key)) type = nameToType.get("'?'");
		            else if ("LBRACE".equals(key)) type = nameToType.get("'{'");
		            else if ("RBRACE".equals(key)) type = nameToType.get("'}'");
		            else if ("LBRACKET".equals(key)) type = nameToType.get("'['");
		            else if ("RBRACKET".equals(key)) type = nameToType.get("']'");
		            else if ("PLUS".equals(key)) type = nameToType.get("'+'");
		            else if ("DIVIDE".equals(key)) type = nameToType.get("'/'");
		            else if ("GREATER".equals(key)) type = nameToType.get("'>'");
		            else if ("LESS".equals(key)) type = nameToType.get("'<'");
		            else if ("GREATER_EQUAL".equals(key)) type = nameToType.get("'>='");
		            else if ("LESS_EQUAL".equals(key)) type = nameToType.get("'<='");
		            else if ("NOT_EQUAL".equals(key)) type = nameToType.get("'<>'");
		            else if ("ARROW".equals(key)) type = nameToType.get("'->'");
		            else if ("SEMICOLON".equals(key)) type = nameToType.get("';'");
		            else if ("DOT".equals(key)) type = nameToType.get("'.'");
		            else if ("DOTDOT".equals(key)) type = nameToType.get("'..'");
		            else if ("AT".equals(key)) type = nameToType.get("'@'");
//		            else if ("CARET".equals(key)) type = nameToType.get("<UP>");
//		            else if ("CARETCARET".equals(key)) type = nameToType.get("<UP><UP>");
//		            else if ("EOF_TOKEN".equals(key)) type = nameToType.get(":");
		            else if ("SINGLE_LINE_COMMENT".equals(key)) type = nameToType.get("RULE_SL_COMMENT");
		            else if ("MULTI_LINE_COMMENT".equals(key)) type = nameToType.get("RULE_ML_COMMENT");
//		            else if ("ERROR_TOKEN".equals(key)) type = nameToType.get(":");
		            else {
		            	System.out.println("No ANTLR type for LPG '" + key + "'");
		            	type = nameToType.get("RULE_ANY_OTHER");
		            }
				}
				if (type != null) {
					kindToType.put(key, type);
				}
				else {
	            	System.out.println("Null ANTLR type for LPG '" + key + "'");
					kindToType.put(key, type);
				}
			}
		}

		public Integer get_RULE_ML_COMMENT() {
			return type_RULE_ML_COMMENT;
		}

		public int get_kind_EOF_TOKEN() {
			return kind_EOF_TOKEN;
		}

		public Integer get_RULE_WS() {
			return type_RULE_WS;
		}

		public Integer get(int kind) {
			return kindToType.get(kind);
		}
	}
	
	protected static class DummyEnvironment extends AbstractEnvironment
	{
		private CharStream charStream;
		protected final LPG2ANTLRTokenMap lpg2antlr;
		private int nextIndex = 0;
		private DerivedPrsStream prsStream;
		private enum State { BOF, PRECEDING_ADJUNCT, TOKEN, EOF };
		private State state = State.BOF;
		private IToken currentToken = null;
		private IToken[] precedingAdjuncts = null;
		private int adjunctIndex = 0;
		private int currentOffset = 0;
		private IToken currentAdjunct = null;
		
		public DummyEnvironment(CharStream charStream, LPG2ANTLRTokenMap lpg2antlr) {
			this.charStream = charStream;
			this.lpg2antlr = lpg2antlr;
			Reader reader = ((MyANTLRReaderStream)charStream).getReader();
			try {
//				reader.reset();
				OCLLexer lpgLexer = new OCLLexer(this, reader, "input");
				prsStream = new DerivedPrsStream(this, lpgLexer.getILexStream());
				lpgLexer.lexer(prsStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public Token nextToken() {
			Token token = null;
			while (token == null) {
				switch (state) {
					case BOF:
					{
						if (nextIndex < prsStream.getSize()) {
							currentToken = prsStream.getIToken(nextIndex++);
							precedingAdjuncts = null;
//							followingAdjuncts = currentToken.getFollowingAdjuncts();
							adjunctIndex = 0;
							currentAdjunct = null;
							state = State.PRECEDING_ADJUNCT;
						}
						else {
							token = Token.EOF_TOKEN;
							state = State.EOF;
						}
						break;
					}
					case PRECEDING_ADJUNCT:
					{
						if (currentToken == null) {
							if (nextIndex < prsStream.getSize()) {
								currentToken = prsStream.getIToken(nextIndex++);
								precedingAdjuncts = currentToken.getPrecedingAdjuncts();
//								followingAdjuncts = currentToken.getFollowingAdjuncts();
								adjunctIndex = 0;
								currentAdjunct = null;
							}
							else {
								token = Token.EOF_TOKEN;
								state = State.EOF;
							}
						}
						if ((currentToken != null) && (currentAdjunct == null)) {
							if ((precedingAdjuncts != null) && (adjunctIndex < precedingAdjuncts.length)) {
								currentAdjunct = precedingAdjuncts[adjunctIndex++];
							}
							else {
//								currentToken = null;
								currentAdjunct = null;
								adjunctIndex = 0;
								state = State.TOKEN;
							}
						}
						if (currentAdjunct != null) {
							int startOffset = currentAdjunct.getStartOffset();
							if (currentOffset < startOffset) {
								token = asWhite(currentOffset, currentAdjunct);
								currentOffset = startOffset;
							}
							else {
								token = asToken(currentAdjunct, lpg2antlr.get_RULE_ML_COMMENT());
								currentAdjunct = null;
							}
						}
						break;
					}					
					case TOKEN:
					{
						int startOffset = currentToken.getStartOffset();
						if (currentOffset < startOffset) {
							token = asWhite(currentOffset, currentToken);
							currentOffset = startOffset;
						}
						else if (startOffset <= currentToken.getEndOffset()) {
							int iKind = currentToken.getKind();
							if (iKind == lpg2antlr.get_kind_EOF_TOKEN()) {
								currentToken = null;
								currentAdjunct = null;
								adjunctIndex = 0;
								state = State.EOF;
							}
							else {
								Integer type = lpg2antlr.get(iKind);
								token = asToken(currentToken, type);
								currentToken = null;
								currentAdjunct = null;
								adjunctIndex = 0;
								state = State.PRECEDING_ADJUNCT;
							}
						}
						else {
							currentToken = null;
							currentAdjunct = null;
							adjunctIndex = 0;
							state = State.PRECEDING_ADJUNCT;
						}
						break;
					}					
/*					case FOLLOWING_ADJUNCT:
					{
						if (currentAdjunct == null) {
							if ((followingAdjuncts != null) && (adjunctIndex < followingAdjuncts.length)) {
								currentAdjunct = followingAdjuncts[adjunctIndex++];
							}
							else {
								currentToken = null;
								currentAdjunct = null;
								adjunctIndex = 0;
								state = State.PRECEDING_ADJUNCT;
							}
						}
						if (currentAdjunct != null) {
							int startOffset = currentAdjunct.getStartOffset();
							if (currentOffset < startOffset) {
								token = asWhite(currentOffset, currentAdjunct);
								currentOffset = startOffset;
							}
							else {
								token = asToken(currentAdjunct, "RULE_ML_COMMENT");
								currentAdjunct = null;
							}
						}
						break;
					} */				
					case EOF:
					{
						token = Token.EOF_TOKEN;
						break;
					}					
				}
			}
			return token;
		}

		protected Token asToken(IToken iToken, Integer type) {
			Token token = new CommonToken(charStream, type != null ? type : 0, Token.DEFAULT_CHANNEL, iToken.getStartOffset(), iToken.getEndOffset());
//				token.setText(iToken.toString());
			token.setLine(iToken.getLine());
			token.setCharPositionInLine(iToken.getColumn()-1);
			currentOffset = iToken.getEndOffset() + 1;
			return token;
		}

		protected Token asWhite(int startOffset, IToken iToken) {
			int endOffset = iToken.getStartOffset();
//			int iKind = iToken.getKind();
//			String iString = OCLParsersym.orderedTerminalSymbols[iKind];
			Integer type = lpg2antlr.get_RULE_WS();
			Token token = new CommonToken(charStream, type != null ? type : 0, Token.DEFAULT_CHANNEL, startOffset, endOffset-1);
//				token.setText(iToken.toString());
			token.setLine(iToken.getLine());
			token.setCharPositionInLine(iToken.getColumn()-(endOffset+1)+startOffset);
			currentOffset = endOffset;
			return token;
		}

		public EnvironmentFactory getFactory() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setParent(Environment env) {
			// TODO Auto-generated method stub
			
		}

		public OCLStandardLibrary getOCLStandardLibrary() {
			// TODO Auto-generated method stub
			return null;
		}

		public TypeResolver getTypeResolver() {
			// TODO Auto-generated method stub
			return null;
		}

		public Object lookupPackage(List names) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void lexerError(int errorCode, int startOffset, int endOffset) {
			ProblemHandler problemHandler = getProblemHandler();
			if (problemHandler != null) {
				String inputText = '"' + computeInputString(startOffset, endOffset) + '"';
		        int tokenIndex = prsStream.getTokenIndexAtCharacter(startOffset);
		        if (tokenIndex < 0) {
		        	tokenIndex = -tokenIndex;
		        }
				String locInfo = prsStream.getEndLineNumberOfTokenAt(tokenIndex)
					+ ":" + prsStream.getEndColumnOfTokenAt(tokenIndex); //$NON-NLS-1$
				String messageTemplate = ProblemHandler.ERROR_MESSAGES[errorCode];
				String message = OCLMessages.bind(messageTemplate, locInfo, inputText);
				problemHandler.lexerProblem(Severity.ERROR, message, null, startOffset, endOffset);
			}
		}
		public String computeInputString(int left, int right) {
			StringBuilder result = new StringBuilder(right - left + 1);
			char[] chars = prsStream.getInputChars();
			if (chars.length > 0) {
				for (int i = left; i <= right; i++) {
					if (chars[i] == '\t') {
						result.append(' ');
					} else if (chars[i] == '\n' || chars[i] == '\r'
						|| chars[i] == '\f') {
						if (i > 0) {
							if (!Character.isWhitespace(chars[i - 1])) {
								result.append(' ');
							}
						}
					} else {
						result.append(chars[i]);
					}

				}
			}
			return result.toString();
		}

		public Object lookupClassifier(List names) {
			// TODO Auto-generated method stub
			return null;
		}

		public List getStates(Object owner, List pathPrefix) {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isInPostcondition(OCLExpression exp) {
			// TODO Auto-generated method stub
			return false;
		}

		public Object defineAttribute(Object owner, Variable variable,
				Object constraint) {
			// TODO Auto-generated method stub
			return null;
		}

		public Object defineOperation(Object owner, String name,
				Object type, List params, Object constraint) {
			// TODO Auto-generated method stub
			return null;
		}

		public Object getDefinition(Object feature) {
			// TODO Auto-generated method stub
			return null;
		}

		public void undefine(Object feature) {
			// TODO Auto-generated method stub
			
		}

		public OCLFactory getOCLFactory() {
			// TODO Auto-generated method stub
			return null;
		}

		public UMLReflection getUMLReflection() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	private static final LPG2ANTLRTokenMap lpg2antlr = new LPG2ANTLRTokenMap(OCLParsersym.orderedTerminalSymbols, InternalEssentialOCLParser.tokenNames);

	private DummyEnvironment env = null;
	
	public MyEssentialOCLLexer() {
		super();
	}

	public MyEssentialOCLLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public MyEssentialOCLLexer(CharStream input) {
		super(input);
	}

	@Override
	public String getGrammarFileName() {
		String grammarFileName = super.getGrammarFileName();
		return grammarFileName;
	}

	@Override
	public void setCharStream(CharStream input) {
		env = new DummyEnvironment(input, lpg2antlr);
		super.setCharStream(input);
	}

	@Override
	public Token nextToken() {
		Token lpgToken = env.nextToken();
		String lpgString = lpgToken.toString();
		Token antlrToken = super.nextToken();
		String antlrString = antlrToken.toString();
		if (lpgString.equals(antlrString)) {
			System.out.println(lpgString);
		}
		else {
			System.out.println(lpgString + " <----> " + antlrString);
		}
		return antlrToken;
	}

	@Override
	public String getSourceName() {
		String sourceName = super.getSourceName();
		return sourceName;
	}

}
