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

public class EmitQueries implements ImportEmitter
{
	public static class Default implements ImportEmitter
	{
		public static ImportEmitter INSTANCE = new Default();
		
		public String formatImport(String aPath) {
			return aPath;
		}	
	}
	
	public static class Jet implements ImportEmitter
	{
		public static ImportEmitter INSTANCE = new Jet();
		
		public String formatImport(String aPath) {
			return "<%" + aPath + "%>";
		}	
	}
	
	public static ImportEmitter EMITTER = null;
	
	public String formatImport(String aPath) {
		ImportEmitter importEmitter = EMITTER;
		if (importEmitter == null) {
			importEmitter = Default.INSTANCE;
		}
		return importEmitter.formatImport(aPath);
	}	
}
