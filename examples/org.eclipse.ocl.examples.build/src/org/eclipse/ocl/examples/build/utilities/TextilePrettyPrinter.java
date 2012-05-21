/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D. Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.build.utilities;

import java.util.Set;

import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintOptions;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrinter;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.xtext.markup.Markup;
import org.eclipse.ocl.examples.xtext.markup.MarkupUtils;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

/**
 * TextilePrettyPrinter provides the static class interfaces to the PrettyPrinter for use
 * as Acceleo queries.
 */
public class TextilePrettyPrinter
{
	public static class Expr
	{
		public Expr() {}

		public String prettyPrint(Visitable element, Namespace scope) {
			return prettyPrint((Element)element, scope);
		}
		public String prettyPrint(Element element, Namespace scope) {
			PrettyPrintOptions options = createOptions(scope);
//			PrettyPrintExprVisitor visitor = new PrettyPrintExprVisitor(options);
			PrettyPrinter printer = PrettyPrinter.createPrinter(element, options);
			try {
				printer.appendElement(element);
				String string = printer.toString(options.getIndentStep(), options.getLinelength());
				//				System.out.println("Expr-prettyPrint : " + element.eClass().getName() + "/" + element.eClass().getName() + " => " + string);
				return string;
			}
			catch (Exception e) {
				e.printStackTrace();
				return printer.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
			}
		}
	}
	
	public static class Name
	{
		public Name() {}
		
		public String prettyPrint(Visitable element, Namespace scope) {
			return prettyPrint((Element)element, scope);
		}
		public String prettyPrint(Element element, Namespace scope) {
			PrettyPrintOptions options = createOptions(scope);
			PrettyPrinter printer = PrettyPrinter.createNamePrinter(element, options);
			try {
				printer.appendElement(element);
				String string = printer.toString(options.getIndentStep(), options.getLinelength());
//				System.out.println("Name-prettyPrint : " + element.eClass().getName() + "/" + element.eClass().getName() + " => " + string);
				return string;
			}
			catch (Exception e) {
				e.printStackTrace();
				return printer.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
			}
		}
		public Markup decode(Comment comment, Namespace scope) {
			IParseResult parseResult = MarkupUtils.decode(comment.getBody());
			Markup markup = (Markup) parseResult.getRootASTElement();
			for (INode parseError : parseResult.getSyntaxErrors()) {
				System.out.println(parseError);
			}
			return markup;
		}
	}

	public static PrettyPrintOptions.Global createOptions(Namespace scope) {
		PrettyPrintOptions.Global options = new PrettyPrintOptions.Global(scope)
		{
			@Override
			public Set<String> getReservedNames() {
				return null;
			}

			@Override
			public Set<String> getRestrictedNames() {
				return null;
			}			
		};
//		options.setUseParentheses(false);
//		options.setUseParentheses(false);
		return options;
	}
}