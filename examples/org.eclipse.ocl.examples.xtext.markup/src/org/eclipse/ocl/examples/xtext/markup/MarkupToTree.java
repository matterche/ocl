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
package org.eclipse.ocl.examples.xtext.markup;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.markup.util.MarkupSwitch;

/**
 * MarkupToTree gives an indented textual tree presentation of the markup for
 * debugging purposes. Each line starts with a class name followed by attributes.
 */
public class MarkupToTree extends MarkupSwitch<StringBuffer>
{
	public static String toString(MarkupElement element) {
		MarkupToTree toString = new MarkupToTree();
		return toString.doSwitch(element).toString();
	}
	
	protected final StringBuffer s = new StringBuffer();
	private int depth = 0;

	protected void appendClass(EObject object) {
		for (int i = 0; i < depth; i++) {
			s.append("  ");
		}
		s.append(object.eClass().getName());
		s.append(": ");
	}

	protected void appendIndented(MarkupElement object) {
		s.append("\n");
		depth++;
		doSwitch(object);
		depth--;
	}

	protected void appendIndented(Iterable<MarkupElement> objects) {
		s.append("\n");
		depth++;
		for (MarkupElement element : objects) {
			doSwitch(element);
		}
		depth--;
	}
	
	@Override
	public StringBuffer caseCompoundElement(CompoundElement object) {
		appendClass(object);
		appendIndented(object.getElements());
		return s;
	}

	@Override
	public StringBuffer caseFontElement(FontElement object) {
		String font = object.getFont();
		appendClass(object);
		s.append(font);
		appendIndented(object.getElements());
		return s;
	}

	@Override
	public StringBuffer caseNewLineElement(NewLineElement object) {
		appendClass(object);
		s.append(object.getText().replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"));
		s.append("\n");
		return s;
	}

	@Override
	public StringBuffer caseTextElement(TextElement object) {
		appendClass(object);
		for (String text : object.getText()) {
			s.append(text.replace("\t", "\\t"));
		}
		s.append("\n");
		return s;
	}

	@Override
	public StringBuffer defaultCase(EObject object) {
		appendClass(object);
		s.append("\n");
		return s;
	}

	@Override
	public String toString() {
		return s.toString();
	}
}

