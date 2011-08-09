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
package org.eclipse.ocl.examples.pivot.utilities;

/**
 * A StringBuffer that assists in production of valid HTML.
 */
public class HTMLBuffer
{
	protected final StringBuffer s = new StringBuffer();

	public void append(String string) {
		for (int i = 0; i < string.length(); i++) {
			appendChar(string.charAt(i));
		}		
	}
	
	public void appendChar(char c) {
		switch (c) {
		case '&': s.append("&amp;"); break;
		case '<': s.append("&lt;"); break;
		case '>': s.append("&gt;"); break;
		default: s.append(c); break;
		}
	}

	public void appendTag(String tag) {
		s.append("<");
		s.append(tag);
		s.append(">");
	}

	public void appendUntag(String tag) {
		s.append("</");
		s.append(tag);
		s.append(">");
	}
	
	@Override
	public String toString() {
		return s.toString();
	}
}