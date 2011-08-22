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
	public StringBuffer caseBulletElement(BulletElement object) {
		s.append("bullet");
		String level = object.getLevel();
		if (level != null) {
			s.append(":");
			s.append(level);
		}
		s.append("[");
		caseCompoundElement(object);
		s.append("]");
		return s;
	}
	
	@Override
	public StringBuffer caseCompoundElement(CompoundElement object) {
		for (MarkupElement element : object.getElements()) {
			doSwitch(element);
		}
		return s;
	}

	@Override
	public StringBuffer caseFigureElement(FigureElement object) {
		s.append("figure");
		String def = object.getDef();
		if (def != null) {
			s.append("#");
			s.append(def);
		}
		s.append("[");
		s.append("\"");
		s.append(object.getSrc());
		s.append("\"");
		String alt = object.getAlt();
		if (alt != null) {
			s.append(",");
			s.append(alt);
			String width = object.getRequiredWidth();
			if (width != null) {
				s.append(",");
				s.append(width);
				String height = object.getRequiredHeight();
				if (height != null) {
					s.append(",");
					s.append(height);
				}
			}
		}
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseFigureRefElement(FigureRefElement object) {
		s.append("figure");
		s.append("[");
		s.append(object.getRef().getDef());
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseFontElement(FontElement object) {
		s.append(object.getFont());
		s.append("[");
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseFootnoteElement(FootnoteElement object) {
		s.append("footnote[");
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseHeadingElement(HeadingElement object) {
		s.append("heading");
		String level = object.getLevel();
		if (level != null) {
			s.append(":");
			s.append(level);
		}
		s.append("[");
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
	public StringBuffer caseOclCodeElement(OclCodeElement object) {
		s.append("oclCode[");
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseOclEvalElement(OclEvalElement object) {
		s.append("oclEval[");
		caseCompoundElement(object);
		s.append("]");
		return s;
	}

	@Override
	public StringBuffer caseOclTextElement(OclTextElement object) {
		s.append("oclText[");
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

