/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.test.xtext;

import java.util.List;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.xtext.markup.Markup;
import org.eclipse.ocl.examples.xtext.markup.MarkupElement;
import org.eclipse.ocl.examples.xtext.markup.MarkupPackage;
import org.eclipse.ocl.examples.xtext.markup.MarkupToHTML;
import org.eclipse.ocl.examples.xtext.markup.MarkupToString;
import org.eclipse.ocl.examples.xtext.markup.MarkupToTree;
import org.eclipse.ocl.examples.xtext.markup.MarkupUtils;
import org.eclipse.ocl.examples.xtext.markup.NewLineElement;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;

public class MarkupTests extends XtextTestCase
{	
	protected TypeManager typeManager = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		MarkupPackage.eINSTANCE.eClass();
	}

	protected Markup doDecode(String testString) {
		IParseResult parseResult = MarkupUtils.decode(testString);
		Markup markup = (Markup) parseResult.getRootASTElement();
		Iterable<INode> parseErrors = parseResult.getSyntaxErrors();
		StringBuffer s = null;
		for (INode parseError : parseErrors) {
			if (s == null) {
				 s = new StringBuffer("Testing '" + toPrintable(testString) + "'");
			}
			SyntaxErrorMessage syntaxErrorMessage = parseError.getSyntaxErrorMessage();
			s.append("\n  " + syntaxErrorMessage.getMessage());
		}
		if (s != null) {
			if (markup != null) {
				System.out.println(MarkupToTree.toString(markup));
			}
			fail(s.toString());
		}
		return markup;
	}

	protected void doHtmlTest(Object context, String expected, String testString) throws Exception {
		Markup markup = doDecode(testString);
		String testResult = MarkupToHTML.toString(null, context, markup);
		assertEquals(toPrintable(testString), expected, testResult);
	}

	protected void doNewlineCountTest(int expectedCount, String testString) {
		Markup markup = doDecode(testString);		
		List<MarkupElement> elements = markup.getElements();
		assert elements.size() == 1;
		NewLineElement newLineElement = (NewLineElement) elements.get(0);
		int actualCount = MarkupUtils.getNewlineCount(newLineElement);
		if (expectedCount != actualCount) {
			assertEquals(toPrintable(testString), expectedCount, actualCount);
		}
	}

	protected void doStringTest(String testString) {
		Markup markup = doDecode(testString);
		String testResult = MarkupToString.toString(markup);
		if (!testString.equals(testResult)) {
			String context = "Testing '" + toPrintable(testString) + "'\n";
			System.out.println(context + MarkupToTree.toString(markup));
			assertEquals(context, testString, testResult);
		}
	}

	protected String toPrintable(String testString) {
		return testString.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
	}

	public void testFonts() throws Exception {
		doHtmlTest(null, "a <b>c</b> d", "a b[c] d");
		doHtmlTest(null, "<b><i> g </i></b>", "b[e[ g ]]");
	}

	public void testNewlines() {
		doNewlineCountTest(1, "\r");
		doNewlineCountTest(1, "\n");
		doNewlineCountTest(1, "\n\r");
		doNewlineCountTest(1, "\r\n");
		doNewlineCountTest(2, "\n\t\r");
		doNewlineCountTest(2, "\r\t\n");
		doNewlineCountTest(2, "\n\r\n");
		doNewlineCountTest(2, "\r\n\r");
		doNewlineCountTest(2, "\n\r\n");
		doNewlineCountTest(2, "\r\n\r");
		doNewlineCountTest(2, "\n\r\n\r");
		doNewlineCountTest(2, "\r\n\r\n");
		doNewlineCountTest(2, "\n\r\n\r");
		doNewlineCountTest(2, "\r\n\r\n");
		doNewlineCountTest(2, "\n\r \n\r");
		doNewlineCountTest(2, "\r\n \r\n");
		doNewlineCountTest(2, "\n\r \n\r");
		doNewlineCountTest(2, "\r\n \r\n");
		doNewlineCountTest(3, "\n\r\n \r");
		doNewlineCountTest(3, "\r\n\r \n");
		doNewlineCountTest(3, "\n\r\n \r");
		doNewlineCountTest(3, "\r\n\r \n");
	}

	public void testOCL() throws Exception {
//		doHtmlTest(null, "45", "ocl[5a9]");
		doHtmlTest(null, "45", "ocl[5*9]");
		doHtmlTest(EcorePackage.Literals.EBIG_DECIMAL, "EBigDecimal", "ocl[self.name]");
	}

	public void testStrings() {
		doStringTest("a b[c] d");
		doStringTest("a\rb\n\rc\t\nd");
		doStringTest("ocl[a.c[4]]");
		doStringTest("ocl[a.b[4]]");
	}
}
