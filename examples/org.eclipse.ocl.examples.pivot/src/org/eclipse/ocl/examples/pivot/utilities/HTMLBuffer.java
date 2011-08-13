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
	private boolean inPara = false;

	public void append(String string) {
		for (int i = 0; i < string.length(); i++) {
			append(string.charAt(i));
		}		
	}
	
	public void append(char c) {
		switch (c) {
		case '&': s.append("&amp;"); break;
		case '<': s.append("&lt;"); break;
		case '>': s.append("&gt;"); break;
		default: s.append(c); break;
		}
	}

	protected void appendTag(String tag) {
		s.append("<");
		s.append(tag);
		s.append(">");
	}

	protected void appendUntag(String tag) {
		s.append("</");
		s.append(tag);
		s.append(">");
	}
	
	/**
	 * End a colored font by emitting a </font> tag.
	 */
	public void endFontColor() {
		appendUntag("font"); 
	}
	
	/**
	 * End a tagged font by emitting a </fontName> tag.
	 */
	public void endFontName(String fontName) {
		appendUntag(fontName); 
	}
	
	/**
	 * End a paragraph by emitting a </p> tag, unless no paragraph is active.
	 */
	public void endParagraph() {
		if (inPara) {
			appendUntag("p");
			inPara = false;
		}
	}

	/**
	 * End underlining by emitting a </u> tag.
	 */
	public void endUnderline() {
		appendUntag("u");
	}
	
	/**
	 * Start a colored font by emitting a <font color="colorName"> tag.
	 */
	public void startFontColor(String colorName) {
		appendTag("font color=\"" + colorName + "\""); 
	}
	
	/**
	 * Start a tagged font by emitting a <fontName> tag.
	 */
	public void startFontName(String fontName) {
		appendTag(fontName); 
	}
	
	/**
	 * Start a paragraph by emitting a <p> tag, unless a paragraph is already active.
	 */
	public void startParagraph() {
		if (!inPara) {
			appendTag("p");
			inPara = true;
		}
	}

	/**
	 * Start underlining by emitting a <u> tag.
	 */
	public void startUnderline() {
		appendTag("u");
	}
	
	@Override
	public String toString() {
		return s.toString();
	}
}