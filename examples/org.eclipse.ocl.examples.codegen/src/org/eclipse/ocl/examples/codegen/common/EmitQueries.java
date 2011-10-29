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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmitQueries implements ImportEmitter
{
	public static class Default implements ImportEmitter
	{
		/**
		 * Map of full external name to short internal name. The short internal name is the full name if
		 * there is any ambiguity.
		 */
		private Map<String, String> external2internal = new HashMap<String, String>();
		/**
		 * Map of short internal name to full external name or null if there is an ambiguity.
		 */
		private Map<String, String> internal2external = new HashMap<String, String>();
		
		public Default() {
			super();
		}

		public String declareImport(String aPath) {
			String lastSegment = aPath.substring(aPath.lastIndexOf(".")+1);
			if (!internal2external.containsKey(lastSegment)) {
				internal2external.put(lastSegment, aPath);
				external2internal.put(aPath, lastSegment);
			}
			else {
				String oldExternal = internal2external.get(lastSegment);
				if (oldExternal != null) {
					external2internal.put(oldExternal, oldExternal);
					internal2external.put(lastSegment, null);
				}
				external2internal.put(aPath, aPath);
			}
			return null;
		}	
		
		public String emitImport(String aPath) {
			String path = external2internal.get(aPath);
			return path != null ? path : ("<<" + aPath + ">>");
		}
		
		public String emitImports() {
			List<String> allValues = new ArrayList<String>(internal2external.values());
			Collections.sort(allValues);
			StringBuffer s = new StringBuffer();
			for (String aValue : allValues) {
				s.append("import ");
				s.append(aValue);
				s.append(";\n");
			}
			return s.toString();
		}	
	}
	
	public static class Jet implements ImportEmitter
	{
		public static ImportEmitter INSTANCE = new Jet();

		public String declareImport(String aPath) {
			return null;
		}	
		
		public String emitImport(String aPath) {
			return "<%" + aPath + "%>";
		}
		
		public String emitImports() {
			return "";
		}	
	}
	
	public static ImportEmitter EMITTER = null;
	
	public String declareImport(String aPath) {
		ImportEmitter importEmitter = EMITTER;
		if (importEmitter == null) {
			importEmitter = new Default();
		}
		return importEmitter.declareImport(aPath);
	}	
	
	public String debug(Object element) {
		return null;
	}	
	
	public String emitImport(String aPath) {
		ImportEmitter importEmitter = EMITTER;
		if (importEmitter == null) {
			importEmitter = new Default();
		}
		return importEmitter.emitImport(aPath);
	}	
	
	public String emitImports() {
		ImportEmitter importEmitter = EMITTER;
		if (importEmitter == null) {
			importEmitter = new Default();
		}
		return importEmitter.emitImports();
	}	
}
