--/**
-- * <copyright>
-- *
-- * Copyright (c) 2008, 2009 Eclipse.org and others.
-- * All rights reserved.   This program and the accompanying materials
-- * are made available under the terms of the Eclipse Public License v1.0
-- * which accompanies this distribution, and is available at
-- * http://www.eclipse.org/legal/epl-v10.html
-- *
-- * Contributors:
-- *   E.D.Willink - Initial API and implementation
-- *   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - LPG v 2.0.17 adoption (242153)
-- *
-- * </copyright>
-- *
-- * $Id: EssentialOCLErrors.gi,v 1.1.2.1 2009/09/12 18:11:36 asanchez Exp $
-- */
--
-- Additional ERROR_TOKEN rules for The EssentialOCL Backtracking Parser
--

%Rules
	ERROR_Colon ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_COLON);
		  $EndCode
		./
	ERROR_Empty ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.EXTRA_TOKENS);
		  $EndCode
		./
	ERROR_IsMarkedPreCS ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_AT_PRE);
					$setResult(null);
		  $EndCode
		./

	ERROR_PathNameCS ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_PATH_NAME);
					CSTNode result = createPathNameCS(createSimpleNameCS(SimpleTypeEnum.IDENTIFIER_LITERAL, getTokenText($getToken(1))));
					setOffsets(result, getIToken($getToken(1)));
					$setResult(result);
		  $EndCode
		./
		
	ERROR_SimpleNameCS ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_SIMPLE_NAME);
					SimpleNameCS result = createSimpleNameCS(
							SimpleTypeEnum.IDENTIFIER_LITERAL,
							getTokenText($getToken(1))
						);
					setOffsets(result, getIToken($getToken(1)));
					$setResult(result);
		  $EndCode
		./

	attrOrNavCallExpCS ::= simpleNameCS '[' argumentsCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(4), OCLParserErrors.MISSING_RBRACK);
					CSTNode result = createFeatureCallExpCS(
							(SimpleNameCS)$getSym(1),
							(EList)$getSym(3),
							null
						);
					setOffsets(result, (CSTNode)$getSym(1), getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./
		
	collectionTypeCS ::= collectionTypeIdentifierCS '(' typeCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(4), OCLParserErrors.MISSING_RPAREN);
					Object[] objs = (Object[])$getSym(1);
					CSTNode result = createCollectionTypeCS(
							(CollectionTypeIdentifierEnum)objs[1],
							(TypeCS)$getSym(3)
						);
					setOffsets(result, (IToken)objs[0], getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./
	collectionTypeCS ::= collectionTypeIdentifierCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(2), OCLParserErrors.MISSING_LPAREN);
					Object[] objs = (Object[])$getSym(1);
					CSTNode result = createCollectionTypeCS(
							(CollectionTypeIdentifierEnum)objs[1],
							null
						);
					setOffsets(result, (IToken)objs[0], getIToken($getToken(2)));
					$setResult(result);
		  $EndCode
		./

	dotArrowExpCS ::=  pathNameCS '::' ERROR_SimpleNameCS '(' argumentsCSopt ')'
		/.$BeginCode
					OperationCallExpCS result = createOperationCallExpCS(
							(PathNameCS)$getSym(1),
							(SimpleNameCS)$getSym(3),
							(EList)$getSym(5)
						);
					setOffsets(result, (CSTNode)$getSym(1), getIToken($getToken(6)));
					result.setAccessor(DotOrArrowEnum.DOT_LITERAL);
					$setResult(result);
		  $EndCode
		./
-- FIXME	dotArrowExpCS ::= NUMERIC_OPERATION ERROR_SimpleNameCS

	enumLiteralExpCS ::= pathNameCS '::' ERROR_SimpleNameCS
		/.$BeginCode
					PathNameCS pathNameCS = (PathNameCS)$getSym(1);
					SimpleNameCS simpleNameCS = (SimpleNameCS)$getSym(3);
					CSTNode result = createEnumLiteralExpCS(
							pathNameCS,
							simpleNameCS
						);
					setOffsets(result, pathNameCS, simpleNameCS);
					$setResult(result);
		  $EndCode
		./
		
	featureCallExpCS ::= unaryName ERROR_IsMarkedPreCS '(' argumentsCSopt ')'
		/.$NewCase./
	keywordOperationCallExpCS ::= keywordAsName ERROR_IsMarkedPreCS '(' argumentsCSopt ')'
		/.$NewCase./
	operationCallExpCS ::= binaryName ERROR_IsMarkedPreCS '(' argumentsCSopt ')'
		/.$BeginCode
					SimpleNameCS simpleNameCS = (SimpleNameCS)$getSym(1);
					CSTNode result = createOperationCallExpCS(
							simpleNameCS,
							(IsMarkedPreCS)$getSym(2),
							(EList)$getSym(4)
						);
					setOffsets(result, simpleNameCS, getIToken($getToken(5)));
					$setResult(result);
		  $EndCode
		./
	operationCallExpCS ::= oclIsInStateName ERROR_IsMarkedPreCS '(' stateExpCS ')'
		/.$BeginCode
					SimpleNameCS simpleNameCS = (SimpleNameCS)$getSym(1);
					CSTNode result = createOperationCallExpCS(
							simpleNameCS,
							(IsMarkedPreCS)$getSym(2),
							(StateExpCS)$getSym(4)
						);
					setOffsets(result, simpleNameCS, getIToken($getToken(5)));
					$setResult(result);
		  $EndCode
		./

	ifExpCS ::= if oclExpressionCS then oclExpressionCS else oclExpressionCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(7), OCLParserErrors.MISSING_ENDIF);
					CSTNode result = createIfExpCS(
							(OCLExpressionCS)$getSym(2),
							(OCLExpressionCS)$getSym(4),
							(OCLExpressionCS)$getSym(6)
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(7)));
					$setResult(result);
		  $EndCode
		./
	ifExpCS ::= if oclExpressionCS then oclExpressionCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(5), OCLParserErrors.MISSING_ELSE_ENDIF);
					CSTNode result = createIfExpCS(
							(OCLExpressionCS)$getSym(2),
							(OCLExpressionCS)$getSym(4),
							createInvalidLiteralExpCS(getTokenText($getToken(5)))
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(5)));
					$setResult(result);
		  $EndCode
		./
	ifExpCS ::= if oclExpressionCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(3), OCLParserErrors.MISSING_THEN_ELSE_ENDIF);
					CSTNode result = createIfExpCS(
							(OCLExpressionCS)$getSym(2),
							createInvalidLiteralExpCS(getTokenText($getToken(3))),
							createInvalidLiteralExpCS(getTokenText($getToken(3)))
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
	ifExpCS ::= if ERROR_TOKEN endif
		/.$BeginCode
					reportErrorTokenMessage($getToken(3), OCLParserErrors.MISSING_THEN_ELSE);
					CSTNode result = createIfExpCS(
							createInvalidLiteralExpCS(getTokenText($getToken(2))),
							createInvalidLiteralExpCS(getTokenText($getToken(2))),
							createInvalidLiteralExpCS(getTokenText($getToken(2)))
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
		
	messageExpCS ::= '^' simpleNameCS ERROR_TOKEN
		/.$NewCase./
	messageExpCS ::= '^^' simpleNameCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_MESSAGE_ARGUMENTS);
					CSTNode result = createMessageExpCS(
							getIToken($getToken(1)).getKind() == $sym_type.TK_CARET,
							(SimpleNameCS)$getSym(2),
							new BasicEList<OCLMessageArgCS>()
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
	messageExpCS ::= '^' ERROR_SimpleNameCS
		/.$NewCase./
	messageExpCS ::= '^^' ERROR_SimpleNameCS
		/.$BeginCode
					SimpleNameCS simpleNameCS = (SimpleNameCS)$getSym(2);
					CSTNode result = createMessageExpCS(
							getIToken($getToken(1)).getKind() == $sym_type.TK_CARET,
							simpleNameCS,
							new BasicEList<OCLMessageArgCS>()
						);
					setOffsets(result, getIToken($getToken(1)), simpleNameCS);
					$setResult(result);
		  $EndCode
		./

	oclExpCS ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_EXPR);
					CSTNode result = createInvalidLiteralExpCS(getTokenText($getToken(1)));
					setOffsets(result, getIToken($getToken(1)));
					$setResult(result);
		  $EndCode
		./
	oclExpCS ::= '(' oclExpressionCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(3), OCLParserErrors.MISSING_RPAREN);
					CSTNode result = (CSTNode)$getSym(2);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./

	operationCS1 ::= IDENTIFIER '(' parametersCSopt ')' ERROR_Colon
		/.$BeginCode
					CSTNode result = createOperationCS(
							getTokenText($getToken(1)),
							(EList)$getSym(3),
							null
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(5)));
					$setResult(result);
		  $EndCode
		./
	operationCS1 ::= IDENTIFIER '(' parametersCSopt ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(4), OCLParserErrors.MISSING_RPAREN);
					CSTNode result = createOperationCS(
							getTokenText($getToken(1)),
							(EList)$getSym(3),
							null
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./
	operationCS1 ::= IDENTIFIER ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(2), OCLParserErrors.MISSING_LPAREN);
					CSTNode result = createOperationCS(
							getTokenText($getToken(1)),
							new BasicEList(),
							null
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(2)));
					$setResult(result);
		  $EndCode
		./
	operationCS1 ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_IDENTIFIER);
					CSTNode result = createOperationCS(
							getTokenText($getToken(1)),
							new BasicEList(),
							null
						);
					setOffsets(result, getIToken($getToken(1)));
					$setResult(result);
		  $EndCode
		./
	operationCS2 ::= pathNameCS '::' simpleNameCS '(' parametersCSopt ')' ERROR_Colon
		/.$BeginCode
					PathNameCS pathNameCS = (PathNameCS)$getSym(1);
					CSTNode result = createOperationCS(
							pathNameCS,
							(SimpleNameCS)$getSym(3),
							(EList)$getSym(5),
							(TypeCS)$getSym(8)
						);
					setOffsets(result, pathNameCS, getIToken($getToken(7)));
					$setResult(result);
		  $EndCode
		./
	operationCS2 ::= pathNameCS '::' simpleNameCS '(' parametersCSopt ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(6), OCLParserErrors.MISSING_RPAREN);
					PathNameCS pathNameCS = (PathNameCS)$getSym(1);
					CSTNode result = createOperationCS(
							pathNameCS,
							(SimpleNameCS)$getSym(3),
							(EList)$getSym(5),
							null
						);
					setOffsets(result, pathNameCS, getIToken($getToken(7)));
					$setResult(result);
		  $EndCode
		./
	operationCS2 ::= pathNameCS '::' simpleNameCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(4), OCLParserErrors.MISSING_LPAREN);
					PathNameCS pathNameCS = (PathNameCS)$getSym(1);
					CSTNode result = createOperationCS(
							pathNameCS,
							(SimpleNameCS)$getSym(3),
							new BasicEList(),
							null
						);
					setOffsets(result, pathNameCS, getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./
	operationCS2 ::= pathNameCS '::' ERROR_SimpleNameCS
		/.$BeginCode
					PathNameCS pathNameCS = (PathNameCS)$getSym(1);
					SimpleNameCS simpleNameCS = (SimpleNameCS)$getSym(3);
					CSTNode result = createOperationCS(
							pathNameCS,
							simpleNameCS,
							new BasicEList(),
							null
						);
					setOffsets(result, pathNameCS, simpleNameCS);
					$setResult(result);
		  $EndCode
		./

	parametersCS ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_PARAMETERS);
					EList result = new BasicEList();
					$setResult(result);
		  $EndCode
		./
	parametersCS ::= parametersCS ',' ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(3), OCLParserErrors.MISSING_PARAMETER);
		  $EndCode
		./

	pathNameCS -> ERROR_PathNameCS
		
	simpleNameCSopt -> ERROR_SimpleNameCS

	tupleLiteralExpCS ::= Tuple ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(7), OCLParserErrors.MISSING_LBRACE);
					CSTNode result = createTupleLiteralExpCS((EList)$getSym(3));
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./

	variableCS ::= IDENTIFIER ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(2), OCLParserErrors.MISSING_VARIABLE_TYPE);
					CSTNode result = createVariableCS(
							getTokenText($getToken(1)),
							null,
							null
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(2)));
					$setResult(result);
		  $EndCode
		./

	variableExpCS ::= simpleNameCS '[' argumentsCS ERROR_TOKEN
		/.$NewCase./
	variableExpCS ::= keywordAsName1 '[' argumentsCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(4), OCLParserErrors.MISSING_RBRACK);
					CSTNode result = createVariableExpCS(
							(SimpleNameCS)$getSym(1),
							(EList)$getSym(3),
							null
						);
					setOffsets(result, (CSTNode)$getSym(1), getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./

	variableListCS ::= ERROR_TOKEN
		/.$NewCase./
	variableListCS2 ::= ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(1), OCLParserErrors.MISSING_VARIABLES);
					EList result = new BasicEList();
					$setResult(result);
		  $EndCode
		./

%End
