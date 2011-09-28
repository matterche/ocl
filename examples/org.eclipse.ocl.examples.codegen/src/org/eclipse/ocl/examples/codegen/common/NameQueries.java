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
package org.eclipse.ocl.examples.codegen.common;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;

public class NameQueries
{
	private static Map<String, Integer> counters = new HashMap<String, Integer>();
	private static Map<Object, String> definedSymbols = new HashMap<Object, String>();

	public static String defineSymbolName(Object elem, String symbol) {
		definedSymbols.put(elem, symbol);
		return symbol;
	}
	
	public static String encodeName(NamedElement element) {
		String rawEncodeName = rawEncodeName(element);
		if (element instanceof Operation) {
			int sameNames = 0;
			int myIndex = 0;
			for (Operation operation : ((Operation)element).getOwningType().getOwnedOperations()) {
				String rawName = rawEncodeName(operation);
				if (rawName.equals(rawEncodeName)) {
					if (operation == element) {
						myIndex = sameNames;
					}
					sameNames++;
				}
			}
			if (sameNames > 1) {
				return myIndex + "_" + rawEncodeName;
			}
		}
		return rawEncodeName;
	}
	
	/**
	 * Return a symbol name for an eObject. This method is invoked from an
	 * Acceleo script and so there is only one call per distinct object. Acceleo
	 * maintains the cache that returns the symbol for old objects.
	 * 
	 * @param eObject the object in question
	 * @return the symbol name
	 */
	public static String getSymbolName(Object elem) {
		return getPrefixedSymbolName("symbol_", elem);
	}

	public static String getPrefixedSymbolName(String prefix, Object elem) {
		String symbol = definedSymbols.get(elem);
		if (symbol == null) {
			Integer count = counters.get(prefix);
			Integer newCount = count != null ? count+1 : 0;
			counters.put(prefix, newCount);
			symbol = prefix + newCount.toString();
			definedSymbols.put(elem, symbol);
		}
		return symbol;
	}

	protected static String rawEncodeName(NamedElement element) {
		StringBuffer s = new StringBuffer();
		String name = element.getName();
//		boolean prevCharIsLower = true;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
//			boolean charIsLowerCase = Character.isLowerCase(ch);
			/*if (charIsLowerCase) {
				s.append(Character.toUpperCase(ch));
			}
			else if (Character.isUpperCase(ch)) {
				if (prevCharIsLower) {
					s.append('_');
				}
				s.append(ch);
			}
			else if (Character.isJavaIdentifierPart(ch)) {
				s.append(ch);
			}
			else*/ if (ch == '<') {
				s.append("_lt_");
			}
			else if (ch == '>') {
				s.append("_gt_");
			}
			else if (ch == '=') {
				s.append("_eq_");
			}
			else if (ch == '+') {
				s.append("_add_");
			}
			else if (ch == '-') {
				s.append("_sub_");
			}
			else if (ch == '*') {
				s.append("_mul_");
			}
			else if (ch == '/') {
				s.append("_div_");
			}
			else {
				s.append(ch);
			}
//			if ((''))
//			prevCharIsLower = charIsLowerCase;
		}
		return s.toString();
	}
}
