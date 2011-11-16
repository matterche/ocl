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

import org.eclipse.ocl.examples.pivot.NamedElement;

public class EmitQueries
{
	public static class Default implements ImportEmitter
	{
		public static class Factory implements ImportEmitter.Factory
		{	
			public ImportEmitter createNew(String imports) {
				return new Default(imports);
			}
		}
		
		/**
		 * Map of full external name to short internal name. The short internal name is the full name if
		 * there is any ambiguity.
		 */
		private Map<String, String> external2internal = new HashMap<String, String>();
		/**
		 * Map of short internal name to full external name or null if there is an ambiguity.
		 */
		private Map<String, String> internal2external = new HashMap<String, String>();
		
		public Default(String imports) {
			external2internal.put("", null);		// blank import 'already emitted'
			for (String anImport : imports.split("\\n")) {
				String candidate = anImport.trim();
				if (!external2internal.containsKey(candidate)) {
					String lastSegment = candidate.substring(candidate.lastIndexOf(".")+1);
					if (!internal2external.containsKey(lastSegment)) {
						internal2external.put(lastSegment, candidate);
						external2internal.put(candidate, lastSegment);
					}
					else {
						String oldExternal = internal2external.get(lastSegment);
						if (oldExternal != null) {
							external2internal.put(oldExternal, oldExternal);
							internal2external.put(lastSegment, null);
						}
						external2internal.put(candidate, candidate);
					}
				}
			}
		}
		
		public String emitImport(String aPath) {
			String path = external2internal.get(aPath);
			return path != null ? path : ("<<" + aPath + ">>");
		}
		
		public String emitImports() {
			List<String> allValues = new ArrayList<String>(internal2external.values());
			Collections.sort(allValues);
			StringBuffer s = new StringBuffer();
			String prefix = "";
			for (String externalPath : allValues) {
				s.append(prefix);
				s.append("import ");
				s.append(externalPath);
				s.append(";");
				prefix = "\n";
			}
			return s.toString();
		}
	}
	
	public static class Jet implements ImportEmitter
	{
		public static class Factory implements ImportEmitter.Factory
		{	
			public ImportEmitter createNew(String imports) {
				return INSTANCE;
			}
		}
		
		public static ImportEmitter INSTANCE = new Jet();
		
		public String emitImport(String aPath) {
			return "<%" + aPath + "%>";
		}
		
		public String emitImports() {
			return "";
		}
	}
	
	private static ImportEmitter.Factory EMITTER_FACTORY = null;	
	private static Map<NamedElement, ImportEmitter> importers = new HashMap<NamedElement, ImportEmitter>();
	
	public static void setFactory(ImportEmitter.Factory factory) {
		EMITTER_FACTORY = factory;
		importers.clear();
	}
	
	
	public String debug(Object element) {
		return null;
	}	
	
	/**
	 * Return the potential brief name by which aPath may be referenced with the scope of an importer.
	 */
	public String emitImport(NamedElement importer, String aPath) {
		ImportEmitter importEmitter = importers.get(importer);
		if (importEmitter == null) {
			if (EMITTER_FACTORY != null) {
				importEmitter = EMITTER_FACTORY.createNew("");
			}
			else {
				importEmitter = new Default("");
			}
			importers.put(importer, importEmitter);
		}
		return importEmitter.emitImport(aPath);
	}	
	
	/**
	 * Return the set of all new-line separated imports for importer as an ordered set of import declarations,
	 * caching any full to brief name for subsequent use by emitImport().
	 */
	public String emitImports(NamedElement importer, String imports) {
		ImportEmitter importEmitter = importers.get(importer);
		if (importEmitter == null) {
			if (EMITTER_FACTORY != null) {
				importEmitter = EMITTER_FACTORY.createNew(imports);
			}
			else {
				importEmitter = new Default(imports);
			}
			importers.put(importer, importEmitter);
		}
		return importEmitter.emitImports();
	}	

	/**
	 * Replace all embedded {%xxx%} embedded import paths by shorter names and
	 * corresponding import full name prefixes.
	 */
	public String prefixImports(NamedElement importer, String markedUpDocument) {
		String[] splits = markedUpDocument.split("(\\<%)|(%\\>)");	
		/**
		 * Map of full external name to short internal name. The short internal name is the full name if
		 * there is any ambiguity.
		 */
		Map<String, String> external2internal = new HashMap<String, String>();
		/**
		 * Map of short internal name to full external name or null if there is an ambiguity.
		 */
		Map<String, String> internal2external = new HashMap<String, String>();
		
		for (int i = 1; i < splits.length; i += 2) {
			String candidate = splits[i].trim();
			if (!external2internal.containsKey(candidate)) {
				String lastSegment = candidate.substring(candidate.lastIndexOf(".")+1);
				if (!internal2external.containsKey(lastSegment)) {
					internal2external.put(lastSegment, candidate);
					external2internal.put(candidate, lastSegment);
				}
				else {
					String oldExternal = internal2external.get(lastSegment);
					if (oldExternal != null) {
						external2internal.put(oldExternal, oldExternal);
						internal2external.put(lastSegment, null);
					}
					external2internal.put(candidate, candidate);
				}
			}
		}
		
		List<String> allValues = new ArrayList<String>(internal2external.values());
		Collections.sort(allValues);
		StringBuffer s = new StringBuffer();
		for (String externalPath : allValues) {
			s.append("import ");
			s.append(externalPath);
			s.append(";\n");
		}
		s.append("\n");
		for (int i = 0; i < splits.length; i += 2) {
			s.append(splits[i]);
			if (i+1 < splits.length) {
				String candidate = splits[i+1].trim();
				s.append(external2internal.get(candidate));
			}
		}		
		return s.toString();
	}	
}
