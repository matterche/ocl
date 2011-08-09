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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.markup.util.MarkupSwitch;

/**
 * MarkupToTree gives a printable one line string presentation of the markup for
 * debugging purposes. New lines are replaced by printables.
 */
public class MarkupToString extends MarkupSwitch<StringBuffer>
{
	public static String toString(MarkupElement element) {
		MarkupToString toString = new MarkupToString();
		return toString.doSwitch(element).toString();
	}

	public static String toString(List<MarkupElement> elements) {
		MarkupToString toString = new MarkupToString();
		for (MarkupElement element : elements) {
			toString.doSwitch(element);
		}
		return toString.toString();
	}
	
	protected final StringBuffer s = new StringBuffer();
	
	@Override
	public StringBuffer caseCompoundElement(CompoundElement object) {
		for (MarkupElement element : object.getElements()) {
			doSwitch(element);
		}
		return s;
	}

	@Override
	public StringBuffer caseFontElement(FontElement object) {
		s.append(object.getFont());
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseNewLineElement(NewLineElement object) {
		s.append(object.getText());
		return s;
	}

	@Override
	public StringBuffer caseNullElement(NullElement object) {
		s.append("[");
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseOclElement(OclElement object) {
		s.append("ocl[");
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseTextElement(TextElement object) {
		for (String text : object.getText()) {
			s.append(text);
		}
		return s;
	}

	@Override
	public StringBuffer defaultCase(EObject object) {
		s.append("<Unsupported ");
		s.append(object.eClass().getName());
		s.append(">");
		return s;
	}

	@Override
	public String toString() {
		return s.toString();
	}
}

