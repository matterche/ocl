/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: NameQueries.java,v 1.2 2011/01/24 20:54:28 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.acceleo;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.utilities.Pivot2Moniker;

public class NameQueries
{
	public static final Logger logger = Logger.getLogger(NameQueries.class);	
	private static Map<String, Integer> counters = new HashMap<String, Integer>();
	private static Map<Object, String> definedSymbols = new HashMap<Object, String>();
	
	public static String getMoniker(Element element) {
		return Pivot2Moniker.toString(element);
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
		if (elem == null) {
			logger.error("getPrefixedSymbolName for '" + prefix + "'and null");
		}
		String symbol = definedSymbols.get(elem);
		if (symbol == null) {
			Integer count = counters.get(prefix);
			Integer newCount = count != null ? count+1 : 0;
			counters.put(prefix, newCount);
			symbol = count != null ? prefix + "_" + newCount.toString() : prefix;
			definedSymbols.put(elem, symbol);
		}
		return symbol;
	}
	
	public static void reset() {
		counters = new HashMap<String, Integer>();
		definedSymbols = new HashMap<Object, String>();
	}
}
