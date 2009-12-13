/**
 * <copyright>
 * 
 * Copyright (c) 2009 Eclipse Modeling Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ParserBacktrackingTest.java,v 1.1.4.1 2009/12/13 21:21:45 ewillink Exp $
 */

package org.eclipse.ocl.ecore.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.cst.CSTNode;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.lpg.AbstractBasicEnvironment;
import org.eclipse.ocl.lpg.AbstractParser;
import org.eclipse.ocl.lpg.AbstractProblemHandler;
import org.eclipse.ocl.parser.backtracking.OCLBacktrackingLexer;
import org.eclipse.ocl.parser.backtracking.OCLBacktrackingParser;

/**
 * Tests for error reports from the backtracking parser.
 */
@SuppressWarnings("nls")
public class ParserBacktrackingTest
    extends AbstractTestSuite {

	private final class MyProblemHandler extends AbstractProblemHandler
	{
		protected final String source;
		protected final List<String> failures = new ArrayList<String>();
		private int errors = 0;
		
		private MyProblemHandler(AbstractParser parser, String source, String... failures) {
			super(parser);
			this.source = source;
			if (failures != null)
				for (String failure : failures)
					this.failures.add(failure);
		}
		
		public int getErrors() {
			return errors;
		}

		@Override
		public void handleProblem(Severity problemSeverity, Phase processingPhase, String problemMessage,
				String processingContext, int startOffset, int endOffset) {
			if ((errors > failures.size()) || !failures.get(errors).equals(problemMessage))
				fail("Unexpected failure '" + problemMessage + "' in '" + source + "'");
			errors++;
		}
	}

	public void test_reservedKeywordAsIdentifier() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: package endpackage",
			"\"<simpleName>\" expected instead of \"package\"");
    }

	public void test_reservedKeywordAsPropertyName() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: self.endif endpackage",
			"\"<simpleName>\" expected instead of \"endif\"");
    }

	public void test_reservedKeywordAsOperationName() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: self.else() endpackage",
			"\"<simpleName>\" expected instead of \"else\"");
    }

	public void test_reservedKeywordAsPathNamePrefix() {
		checkDocumentWithParseFailure(
			"package ecore context if::xx inv: true endpackage",
			"\"<simpleName>\" expected instead of \"if\"");
    }

	public void test_reservedKeywordAsPathNameMidfix() {
		checkDocumentWithParseFailure(
			"package ecore context xx::if::yy inv: true endpackage",
			"\"<simpleName>\" expected instead of \"if\"");
    }

	public void test_reservedKeywordAsPathNameSuffix() {
		checkDocumentWithParseFailure(
			"package ecore context xx::if inv: true endpackage",
			"\"<simpleName>\" expected instead of \"if\"");
    }

	public void test_punctuationAsOperationName() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: self. .. () endpackage",
			"\"<simpleName>\" expected instead of \"..\"");
    }

	public void test_missingEndPackage() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: true",
			"\"endpackage\" expected after \"true\"");
    }

	public void test_ifMissingCondition() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: if then else false endif endpackage",
			"\"then <expr> else <expr>\" expected instead of \"endif\"");
    }

	public void test_ifMissingThen() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: if true true else false endif endpackage",
			"\"then <expr> else <expr> endif\" expected instead of \"true else false endif\"");
    }

	public void test_ifMissingThenExpression() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: if true then else false endif endpackage",
			"\"<simpleName>\" expected after \"then\"");
    }

	public void test_ifMissingElse() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: if true then true false endif endpackage",
			"\"else <expr> endif\" expected instead of \"false endif\"");
    }

	public void test_ifMissingElseExpression() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: if true then true else endif endpackage",
			"\"<simpleName>\" expected after \"else\"");
    }

	public void test_ifMissingEndif() {
		checkDocumentWithParseFailure(
			"package ecore context EClass inv: if true then true else false endpackage",
			"\"endif\" expected after \"false\"");
    }

	public void test_packageMissingEndPackage_277620() {
		checkDocumentWithParseFailure(
			"package context Xyzzy inv: 1 = 1 ",
			"\"<simpleName>\" expected after \"package\"",
			"\"endpackage\" expected after \"1\"");
    }

	public void test_packageMissingName_277620() {
		parseConstraint(
			"package /*name*/ context Xyzzy inv: 1 = 1 endpackage"
);
    }

	private void checkDocumentWithParseFailure(String oclText, String... failures) {
		Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> environment = ocl.getEnvironment();
		AbstractBasicEnvironment abstractBasicEnvironment = (AbstractBasicEnvironment)environment;
		OCLBacktrackingLexer lexer = new OCLBacktrackingLexer(environment, oclText.toCharArray());
		OCLBacktrackingParser parser = new OCLBacktrackingParser(lexer);
		parser.setDefaultRepairCount(10);
		MyProblemHandler problemHandler = new MyProblemHandler(parser, oclText, failures);
		abstractBasicEnvironment.setProblemHandler(problemHandler);
//		try {
			lexer.lexToTokens(parser);
			CSTNode cst = parser.parseTokensToCST();
			int expectedErrors = failures != null ? failures.length : 0;
			if (problemHandler.getErrors() < expectedErrors)
				fail("Expected failure '" + failures[problemHandler.getErrors()] + "' not found in '" + oclText + "'");
//			if (problemHandler.getErrors() < expectedErrors)
//				fail("Expected failure '" + failures[problemHandler.getErrors()] + "' not found in '" + oclText + "'");
			assertNotNull(cst);
//        } catch (Exception e) {
//            assertEquals(failure, e.getLocalizedMessage());
//        }
	}

	private void checkDocumentAfterParseFailure(String oclText, String... failures) {
		Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> environment = ocl.getEnvironment();
		AbstractBasicEnvironment abstractBasicEnvironment = (AbstractBasicEnvironment)environment;
		OCLBacktrackingLexer lexer = new OCLBacktrackingLexer(environment, oclText.toCharArray());
		OCLBacktrackingParser parser = new OCLBacktrackingParser(lexer);
		parser.setDefaultRepairCount(10);
		MyProblemHandler problemHandler = new MyProblemHandler(parser, oclText, failures);
		abstractBasicEnvironment.setProblemHandler(problemHandler);
//		try {
			lexer.lexToTokens(parser);
			CSTNode cst = parser.parseTokensToCST();
			int expectedErrors = failures != null ? failures.length : 0;
			if (problemHandler.getErrors() < expectedErrors)
				fail("Expected failure '" + failures[problemHandler.getErrors()] + "' not found in '" + oclText + "'");
//			if (problemHandler.getErrors() < expectedErrors)
//				fail("Expected failure '" + failures[problemHandler.getErrors()] + "' not found in '" + oclText + "'");
			assertNotNull(cst);
//        } catch (Exception e) {
//            assertEquals(failure, e.getLocalizedMessage());
//        }
	}
}
