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
 * $Id: BaseHover.java,v 1.1.2.1 2011/01/17 08:11:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintNameVisitor;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hover.AbstractHover;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class BaseHover extends AbstractHover
{
	protected final AbstractHover delegateTextHover;
	
	public BaseHover(ISourceViewer sourceViewer, AbstractHover delegateTextHover) {
		super(sourceViewer);
		this.delegateTextHover = delegateTextHover;
	}

	@Override
	protected String getHoverInfoInternal(int lineNumber, int offset) {
		String delegateText = delegateTextHover.getHoverInfo(sourceViewer, offset);
		String localText = getHoverText(offset);
		if ((delegateText == null) || (delegateText.length() <= 0)) {
			return localText;
		}
		else if (localText == null) {
			return delegateText;
		}
		return delegateText + "\n-------\n" + localText;
	}

	protected String getHoverText(final int offset) {
		IDocument document = sourceViewer.getDocument();
		if (document instanceof BaseDocument) {
			BaseDocument baseDocument = (BaseDocument) document;
			String text = baseDocument.readOnly(new IUnitOfWork<String, XtextResource>()
			{
				public String exec(XtextResource state) throws Exception {
					List<EObject> contents = state.getContents();
					if (contents.size() > 0) {
						CompositeNode rootNode = NodeUtil.getRootNode(contents.get(0));
						AbstractNode leafNode = NodeUtil.findLeafNodeAtOffset(rootNode, offset);
						EObject csElement = NodeUtil.findASTElement(leafNode);
						if (csElement instanceof Pivotable) {
							Element pivotElement = PivotUtil.getPivot(Element.class, (Pivotable)csElement);
							if (pivotElement != null) {
								Namespace namespace = PrettyPrintNameVisitor.getNamespace(pivotElement);
								String description = PrettyPrintNameVisitor.prettyPrint(pivotElement, namespace);
								return pivotElement.eClass().getName() + " : " + description;
							}
						}
						return csElement.eClass().getName();		// FIXME do better					
					}
					return null;
				}});
			return text;
		}
		return null;
	}
}