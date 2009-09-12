--/**
-- * <copyright>
-- *
-- * Copyright (c) 2005, 2009 IBM Corporation, Open Canarias S.L. and others.
-- * All rights reserved.   This program and the accompanying materials
-- * are made available under the terms of the Eclipse Public License v1.0
-- * which accompanies this distribution, and is available at
-- * http://www.eclipse.org/legal/epl-v10.html
-- *
-- * Contributors:
-- *   IBM - Initial API and implementation
-- *   E.D. Willink - Elimination of some shift-reduce conflicts
-- *      - Bug 259818
-- *   E.D.Willink - Bug 285633 static definitions
-- *   Adolfo Sanchez- Barbudo Herrera - LPG v 2.0.17 adoption
-- *
-- * </copyright>
-- *
-- * $Id: OCLParser.g,v 1.5.2.1 2009/09/12 18:11:36 asanchez Exp $
-- */
--
-- The OCL Parser
--

%options escape=$
%options la=2
%options table=java
%options fp=OCLParser,prefix=TK_
%options error-maps
%options scopes
%options margin=4
%options noserialize
%options package=org.eclipse.ocl.parser
%options import_terminals=OCLLexer.gi
%options ast_type=CSTNode
%options programming_language=java
%options action-block=("*.java", "/.", "./")
%options ParseTable=lpg.runtime.ParseTable
%options include_directory=".;../lpg"

%Start
	goal
%End

%Import
	EssentialOCL.gi
%End

%Define
    $environment_class /.Environment<?,?,?,?,?,?,?,?,?,?,?,?>./
	$lex_stream_class /.OCLLexer./
%End

%Globals
	/.
	import org.eclipse.ocl.Environment;
	import org.eclipse.ocl.cst.DefCS;
	import org.eclipse.ocl.cst.DefExpressionCS;
	import org.eclipse.ocl.cst.InitOrDerValueCS;
	import org.eclipse.ocl.cst.InvOrDefCS;
	import org.eclipse.ocl.cst.OperationCS;
	import org.eclipse.ocl.cst.PackageDeclarationCS;
	import org.eclipse.ocl.cst.PrePostOrBodyEnum;
	./
%End

%KeyWords
	context
	package
	
	--
	-- the following are not used in the OCL concrete syntax, but
	-- are defined as reserved words in the OCL 2.0 Spec 7.4.9
	-- and were removed in the OCL 2.1 RTF 09-05-02. 
	--
	attr
	oper
%End

%Rules
	-- opt = optional
	-- m = multiple
	
	goal -> packageDeclarationCS1
	goal -> packageDeclarationCSm
	goal -> invOrDefCS
	goal -> prePostOrBodyDeclCS
	goal -> initOrDerValueCS
	goal -> variableCS
	goal -> %empty	

	packageDeclarationCSm -> packageDeclarationCS
	packageDeclarationCSm ::= packageDeclarationCSm packageDeclarationCS
		/.$BeginCode
					PackageDeclarationCS result = (PackageDeclarationCS)$getSym(2);
					result.setPackageDeclarationCS((PackageDeclarationCS) $getSym(1));
					$setResult(result);
		  $EndCode
		./
	packageDeclarationCS ::= package pathNameCS contextDeclCSmopt endpackage
		/.$BeginCode
					CSTNode result = createPackageDeclarationCS(
							(PathNameCS)$getSym(2),
							(EList)$getSym(3)
						);
					setOffsets(result, getIToken($getToken(1)), getIToken($getToken(4)));
					$setResult(result);
		  $EndCode
		./
	
	packageDeclarationCS1 ::= contextDeclCSm
		/.$BeginCode
					EList contextDecls = (EList)$getSym(1);
					CSTNode result = createPackageDeclarationCS(null, contextDecls);
					if (!contextDecls.isEmpty()) {
						setOffsets(result, (CSTNode)contextDecls.get(0), (CSTNode)contextDecls.get(contextDecls.size()-1));
					}
					$setResult(result);
		  $EndCode
		./


	contextDeclCSmopt ::= %empty
		/.$EmptyListAction./
	contextDeclCSmopt -> contextDeclCSm

	contextDeclCSm ::= contextDeclCS
		/.$BeginCode
					EList result = new BasicEList();
					result.add($getSym(1));
					$setResult(result);
		  $EndCode
		./
	contextDeclCSm ::= contextDeclCSm contextDeclCS
		/.$BeginCode
					EList result = (EList)$getSym(1);
					result.add($getSym(2));
					$setResult(result);
		  $EndCode
		./

	contextDeclCS -> classifierContextDeclCS
	contextDeclCS -> operationContextDeclCS
	contextDeclCS -> propertyContextCS

	propertyContextCS ::= context pathNameCS '::' simpleNameCS ':' typeCS initOrDerValueCSm
		/.$BeginCode
					EList<InitOrDerValueCS> list = (EList<InitOrDerValueCS>)$getSym(7);
					CSTNode result = createPropertyContextCS(
							(PathNameCS)$getSym(2),
							(SimpleNameCS)$getSym(4),
							(TypeCS)$getSym(6),
							list
						);
					setOffsets(result, getIToken($getToken(1)), list.get(list.size()-1));
					$setResult(result);
		  $EndCode
		./

	initOrDerValueCSm ::= initOrDerValueCS
		/.$BeginCode
					EList<InitOrDerValueCS> result = new BasicEList<InitOrDerValueCS>();
					result.add((InitOrDerValueCS)$getSym(1));
					$setResult(result);
		  $EndCode
		./
	initOrDerValueCSm ::= initOrDerValueCSm initOrDerValueCS
		/.$BeginCode
					EList<InitOrDerValueCS> result = (EList<InitOrDerValueCS>)$getSym(1);
					result.add((InitOrDerValueCS)$getSym(2));
					$setResult(result);
		  $EndCode
		./
	initOrDerValueCS ::= init ':' oclExpressionCS
		/.$BeginCode
					CSTNode result = createInitValueCS((OCLExpressionCS)$getSym(3));
					setOffsets(result, getIToken($getToken(1)), (CSTNode)$getSym(3));
					$setResult(result);
		  $EndCode
		./

	initOrDerValueCS ::= derive ':' oclExpressionCS
		/.$BeginCode
					CSTNode result = createDerValueCS((OCLExpressionCS)$getSym(3));
					setOffsets(result, getIToken($getToken(1)), (CSTNode)$getSym(3));
					$setResult(result);
		  $EndCode
		./

	classifierContextDeclCS ::= context pathNameCS invOrDefCSm
		/.$BeginCode
					EList<InvOrDefCS> list = (EList<InvOrDefCS>)$getSym(3);
					CSTNode result = createClassifierContextDeclCS(
							(PathNameCS)$getSym(2),
							list
						);
					setOffsets(result, getIToken($getToken(1)), list.get(list.size()-1));
					$setResult(result);
		  $EndCode
		./

	invOrDefCSm ::= invOrDefCS
		/.$BeginCode
					EList<InvOrDefCS> result = new BasicEList<InvOrDefCS>();
					result.add((InvOrDefCS)$getSym(1));
					$setResult(result);
		  $EndCode
		./
	invOrDefCSm ::= invOrDefCSm invOrDefCS
		/.$BeginCode
					EList<InvOrDefCS> result = (EList<InvOrDefCS>)$getSym(1);
					result.add((InvOrDefCS)$getSym(2));
					$setResult(result);
		  $EndCode
		./
	invOrDefCS ::= inv simpleNameCSopt ':' oclExpressionCS
		/.$BeginCode
					CSTNode result = createInvCS(
							(SimpleNameCS)$getSym(2),
							(OCLExpressionCS)$getSym(4)
						);
					setOffsets(result, getIToken($getToken(1)), (CSTNode)$getSym(4));
					$setResult(result);
		  $EndCode
		./
	
	defCS ::= def simpleNameCSopt ':' defExpressionCS
		/.$BeginCode
					DefCS result = createDefCS(
							(SimpleNameCS)$getSym(2),
							(DefExpressionCS)$getSym(4)
						);
					setOffsets(result, getIToken($getToken(1)), (CSTNode)$getSym(4));
					$setResult(result);
		  $EndCode
		./
	invOrDefCS -> defCS
	invOrDefCS ::= static defCS
		/.$BeginCode
					DefCS result = (DefCS)$getSym(2);
					result.setStatic(true);
					setOffsets(result, getIToken($getToken(1)), result);
					$setResult(result);
		  $EndCode
		./

	defExpressionCS ::= typedVariableCS '=' oclExpressionCS
		/.$BeginCode
					VariableCS variableCS = (VariableCS)$getSym(1);
					OCLExpressionCS expressionCS = (OCLExpressionCS)$getSym(3);
					CSTNode result = createDefExpressionCS(
							variableCS,
							null,
							expressionCS
						);
					setOffsets(result, variableCS, expressionCS);
					$setResult(result);
		  $EndCode
		./
	defExpressionCS ::= operationCS1 '=' oclExpressionCS
		/.$BeginCode
					CSTNode result = createDefExpressionCS(
							null,
							(OperationCS)$getSym(1),
							(OCLExpressionCS)$getSym(3)
						);
					setOffsets(result, (CSTNode)$getSym(1), (CSTNode)$getSym(3));
					$setResult(result);
		  $EndCode
		./

	operationContextDeclCS ::= context operationCS2 prePostOrBodyDeclCSm
		/.$BeginCode
					EList prePostOrBodyDecls = (EList)$getSym(3);
					CSTNode result = createOperationContextDeclCS(
							(OperationCS)$getSym(2),
							prePostOrBodyDecls
						);
					setOffsets(result, getIToken($getToken(1)), (CSTNode)prePostOrBodyDecls.get(prePostOrBodyDecls.size()-1));
					$setResult(result);
		  $EndCode
		./

	prePostOrBodyDeclCSm ::= prePostOrBodyDeclCS
		/.$BeginCode
					EList result = new BasicEList();
					result.add($getSym(1));
					$setResult(result);
		  $EndCode
		./
	prePostOrBodyDeclCSm ::= prePostOrBodyDeclCSm prePostOrBodyDeclCS
		/.$BeginCode
					EList result = (EList)$getSym(1);
					result.add($getSym(2));
					$setResult(result);
		  $EndCode
		./

	prePostOrBodyDeclCS ::= pre simpleNameCSopt ':' oclExpressionCS
		/.$BeginCode
					CSTNode result = createPrePostOrBodyDeclCS(
							PrePostOrBodyEnum.PRE_LITERAL,
							(SimpleNameCS)$getSym(2),
							(OCLExpressionCS)$getSym(4)
						);
					setOffsets(result, getIToken($getToken(1)), (CSTNode)$getSym(4));
					$setResult(result);
		  $EndCode
		./
	prePostOrBodyDeclCS ::= post simpleNameCSopt ':' oclExpressionCS
		/.$BeginCode
					CSTNode result = createPrePostOrBodyDeclCS(
							PrePostOrBodyEnum.POST_LITERAL,
							(SimpleNameCS)$getSym(2),
							(OCLExpressionCS)$getSym(4)
						);
					setOffsets(result, getIToken($getToken(1)), (CSTNode)$getSym(4));
					$setResult(result);
		  $EndCode
		./
	prePostOrBodyDeclCS ::= body simpleNameCSopt ':' oclExpressionCS
		/.$BeginCode
					CSTNode result = createPrePostOrBodyDeclCS(
							PrePostOrBodyEnum.BODY_LITERAL,
							(SimpleNameCS)$getSym(2),
							(OCLExpressionCS)$getSym(4)
						);
					setOffsets(result, getIToken($getToken(1)), (CSTNode)$getSym(4));
					$setResult(result);
		  $EndCode
		./
%End
