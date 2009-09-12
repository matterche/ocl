--/**
-- * <copyright>
-- *
-- * Copyright (c) 2008 Eclipse.org and others.
-- * All rights reserved.   This program and the accompanying materials
-- * are made available under the terms of the Eclipse Public License v1.0
-- * which accompanies this distribution, and is available at
-- * http://www.eclipse.org/legal/epl-v10.html
-- *
-- * Contributors:
-- *   E.D. Willink - Initial API and implementation
-- *   Adolfo Sanchez-Barbudo Herrera (Open Canarias) - LPG v 2.0.17 adoption (242153)
-- *
-- * </copyright>
-- *
-- * $Id: OCLParserErrors.gi,v 1.1.2.1 2009/09/12 18:11:36 asanchez Exp $
-- */
--
-- Additional ERROR_TOKEN rules for The OCL Parser
--

%Import
	OCLParser.g
%End

%Import
	EssentialOCLErrors.gi
%End

%Rules

	classifierContextDeclCS ::= context pathNameCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(3), OCLParserErrors.MISSING_INV_OR_DEF);
					CSTNode result = createClassifierContextDeclCS(
							(PathNameCS)$getSym(2),
							new BasicEList<InvOrDefCS>()
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
		
	defExpressionCS ::= typedVariableCS ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(2), OCLParserErrors.MISSING_EQUALS);
					VariableCS variableCS = (VariableCS)$getSym(1);
					CSTNode result = createDefExpressionCS(
							variableCS,
							null,
							null
						);
					setOffsets(result, variableCS, getIToken($getToken(2)));
					$setResult(result);
		  $EndCode
		./
	defExpressionCS ::= IDENTIFIER ERROR_Colon
		/.$BeginCode
					VariableCS variableCS = createVariableCS(
								getTokenText($getToken(1)),
								null,
								null
							);
					setOffsets(variableCS, getIToken($getToken(1)), getIToken($getToken(2)));
					CSTNode result = createDefExpressionCS(
							variableCS,
							null,
							null
						);
					setOffsets(result, variableCS, getIToken($getToken(2)));
					$setResult(result);
		  $EndCode
		./

	initOrDerValueCS ::= init ERROR_Colon
		/.$BeginCode
					CSTNode result = createInitValueCS(null);
					setOffsets(result, getIToken($getToken(2)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
	initOrDerValueCS ::= derive ERROR_Colon
		/.$BeginCode
					CSTNode result = createDerValueCS(null);
					setOffsets(result, getIToken($getToken(2)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
		
	invOrDefCS ::= inv simpleNameCS ERROR_Colon
		/.$BeginCode
					CSTNode result = createInvCS(
							(SimpleNameCS)$getSym(2),
							null
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./	
	invOrDefCS ::= def simpleNameCS ERROR_Colon
		/.$BeginCode
					CSTNode result = createDefCS(
							(SimpleNameCS)$getSym(2),
							null
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./

	packageDeclarationCS ::= package pathNameCS contextDeclCSmopt ERROR_Empty endpackage
		/.$BeginCode
					CSTNode result = createPackageDeclarationCS(
							(PathNameCS)$getSym(2),
							(EList)$getSym(3)
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(5)));
					$setResult(result);
		  $EndCode
		./
	packageDeclarationCS ::= package pathNameCS contextDeclCSmopt ERROR_TOKEN
		/.$BeginCode
					reportErrorTokenMessage($getToken(4), OCLParserErrors.MISSING_ENDPACKAGE);
					CSTNode result = createPackageDeclarationCS(
							(PathNameCS)$getSym(2),
							(EList)$getSym(3)
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./
	packageDeclarationCS ::= package ERROR_PathNameCS
		/.$BeginCode
					CSTNode result = createPackageDeclarationCS(
							(PathNameCS)$getSym(2),
							new BasicEList()
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(2)));
					$setResult(result);
		  $EndCode
		./
		
	prePostOrBodyDeclCS ::= pre simpleNameCS ERROR_Colon
		/.$BeginCode
					CSTNode result = createPrePostOrBodyDeclCS(
							PrePostOrBodyEnum.PRE_LITERAL,
							(SimpleNameCS)$getSym(2),
							createInvalidLiteralExpCS(getTokenText($getToken(3)))
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
	prePostOrBodyDeclCS ::= post simpleNameCS ERROR_Colon
		/.$BeginCode
					CSTNode result = createPrePostOrBodyDeclCS(
							PrePostOrBodyEnum.POST_LITERAL,
							(SimpleNameCS)$getSym(2),
							createInvalidLiteralExpCS(getTokenText($getToken(3)))
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
	prePostOrBodyDeclCS ::= body simpleNameCS ERROR_Colon
		/.$BeginCode
					CSTNode result = createPrePostOrBodyDeclCS(
							PrePostOrBodyEnum.BODY_LITERAL,
							(SimpleNameCS)$getSym(2),
							createInvalidLiteralExpCS(getTokenText($getToken(3)))
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(3)));
					$setResult(result);
		  $EndCode
		./
		
	propertyContextCS ::= context pathNameCS '::' ERROR_SimpleNameCS
		/.$BeginCode
					SimpleNameCS simpleNameCS = (SimpleNameCS)$getSym(4);
					CSTNode result = createPropertyContextCS(
							(PathNameCS)$getSym(2),
							simpleNameCS,
							null,
							null
						);
					setOffsets(result, getIToken($getToken(1)), simpleNameCS);
					$setResult(result);
		  $EndCode
		./
		
%End
