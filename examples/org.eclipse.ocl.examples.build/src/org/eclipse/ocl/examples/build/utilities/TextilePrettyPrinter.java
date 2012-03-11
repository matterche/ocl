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

import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintExprVisitor;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintNameVisitor;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintOptions;
import org.eclipse.ocl.examples.pivot.util.Visitable;

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
			PrettyPrintOptions options = createOptions(scope);
			PrettyPrintExprVisitor visitor = new PrettyPrintExprVisitor(options);
			try {
				visitor.safeVisit(element);
				String string = visitor.toString(options.getIndentStep(), options.getLinelength());
				//				System.out.println("Expr-prettyPrint : " + element.eClass().getName() + "/" + element.eClass().getName() + " => " + string);
				return string;
			}
			catch (Exception e) {
				e.printStackTrace();
				return visitor.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
			}
		}
	}
	
	public static class Name
	{
		public Name() {}
		
		public String prettyPrint(Visitable element, Namespace scope) {
			PrettyPrintOptions options = createOptions(scope);
			PrettyPrintNameVisitor visitor = new PrettyPrintNameVisitor(options);
			try {
				visitor.safeVisit(element);
				String string = visitor.toString(options.getIndentStep(), options.getLinelength());
//				System.out.println("Name-prettyPrint : " + element.eClass().getName() + "/" + element.eClass().getName() + " => " + string);
				return string;
			}
			catch (Exception e) {
				e.printStackTrace();
				return visitor.toString() + " ... " + e.getClass().getName() + " - " + e.getLocalizedMessage();
			}
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