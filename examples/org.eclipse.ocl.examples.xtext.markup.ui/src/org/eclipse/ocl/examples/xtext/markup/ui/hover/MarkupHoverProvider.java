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
package org.eclipse.ocl.examples.xtext.markup.ui.hover;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintExprVisitor;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintNameVisitor;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintTypeVisitor;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.pivot.utilities.HTMLBuffer;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.markup.Markup;
import org.eclipse.ocl.examples.xtext.markup.MarkupUtils;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class MarkupHoverProvider extends DefaultEObjectHoverProvider
{
	@Override
	protected String getDocumentation(EObject o) {
		MetaModelManager metaModelManager = null;
		Resource resource = o.eResource();
		if (resource != null) {
			MetaModelManagerResourceAdapter adapter = MetaModelManagerResourceAdapter.findAdapter(resource);
			if (adapter != null) {
				metaModelManager = adapter.getMetaModelManager();
			}
		}
		String documentation = super.getDocumentation(o);
		IParseResult parseResult = MarkupUtils.decode(documentation);
		Markup markup = (Markup) parseResult.getRootASTElement();
		if (markup == null) {
			return null;
		}
		Iterable<INode> parseErrors = parseResult.getSyntaxErrors();
		Map<Integer, Integer> errorMap = getErrorMap(parseErrors);
		if (errorMap != null) {
			HTMLBuffer htmlBuffer = new HTMLBuffer();
			int i = 0;
			List<Integer> starts = new ArrayList<Integer>(errorMap.keySet());
			Collections.sort(starts);
			for (int start : starts) {
				int end = errorMap.get(start);
				while (i < start) {
					htmlBuffer.append(documentation.charAt(i++));
				}
				htmlBuffer.startFontColor("red"); 
				htmlBuffer.startUnderline();
				while (i < end) {
					htmlBuffer.append(documentation.charAt(i++));
				}
				htmlBuffer.endUnderline();
				htmlBuffer.endFontColor(); 
			}
			htmlBuffer.startFontColor("red"); 
			htmlBuffer.startParagraph();
			htmlBuffer.endParagraph();
			for (INode parseError :parseErrors) {
				htmlBuffer.startParagraph();
				htmlBuffer.append(parseError.getSyntaxErrorMessage().getMessage());
				htmlBuffer.endParagraph();
			}
			htmlBuffer.endFontColor(); 
			return htmlBuffer.toString();
		}
		if (o instanceof Pivotable) {
			o = ((Pivotable)o).getPivot();
		}
		try {
			return MarkupUtils.toHTML(metaModelManager, o, markup);
		} catch (Exception e) {
			StringWriter s = new StringWriter();
			e.printStackTrace(new PrintWriter(s));
			return s.toString().replace("\n", "\n<br>");
		}
	}

	protected Map<Integer, Integer> getErrorMap(Iterable<INode> parseErrors) {
		Map<Integer, Integer> errorMap = null;
		for (INode parseError : parseErrors) {
			if (errorMap == null) {
				errorMap = new HashMap<Integer, Integer>();
			}
			int start = parseError.getOffset();
			errorMap.put(start, start + parseError.getLength());
		}
		if (errorMap != null) {
			List<Integer> starts = new ArrayList<Integer>(errorMap.keySet());
			Collections.sort(starts);
			Integer currentStart = null;
			int currentEnd = 0;
			for (int i = 0; i < starts.size(); i++) {
				Integer start = starts.get(i);
				if (currentStart == null) {
					currentStart = start;
					currentEnd = errorMap.get(start);
				}
				else {
					currentEnd = errorMap.get(start);
					if (start > currentEnd) {
						currentStart = start;
					}
					else {
						errorMap.remove(start);
						errorMap.put(currentStart, currentEnd);
					}
				}
			}
		}
		return errorMap;
	}

	@Override
	protected String getFirstLine(EObject eObject) {
		String firstLine = super.getFirstLine(eObject);
		Element pivotElement = null;
		if (eObject instanceof Pivotable) {
			pivotElement = PivotUtil.getPivot(Element.class, (Pivotable)eObject);
		}
		else if (eObject instanceof Element) {
			pivotElement = (Element)eObject;
		}
		if (pivotElement != null) {
			Namespace namespace = PrettyPrintExprVisitor.getNamespace(pivotElement);
			String description;
			if (pivotElement instanceof CallExp) {
				description = PrettyPrintNameVisitor.prettyPrint(PivotUtil.getReferredFeature((CallExp)pivotElement), namespace);
			}
			else if (pivotElement instanceof OclExpression) {
				description = PrettyPrintTypeVisitor.prettyPrint(((OclExpression)pivotElement).getType(), namespace);
			}
			else {
				description = PrettyPrintExprVisitor.prettyPrint(pivotElement, namespace);
			}
			return firstLine + "\n<br>" + pivotElement.eClass().getName() + " <b>" + description + "</b>";
		}
		else {
			return firstLine + "\n<br>" + eObject.eClass().getName();		// FIXME do better					
		}
	}

	@Override
	protected boolean hasHover(EObject o) {
		if (o instanceof Element) {
			return true;
		}
		if (o instanceof ElementCS) {
			return true;
		}
		return super.hasHover(o);
	}
}