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
 * $Id: BaseHover.java,v 1.1.2.2 2011/01/21 11:23:41 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.prettyprint.PrettyPrintNameVisitor;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.xtext.ui.editor.hover.AbstractEObjectHover;
import org.eclipse.xtext.ui.editor.hover.AbstractHover;

public class BaseHover extends AbstractEObjectHover
{
	protected final AbstractHover delegateTextHover;
	
	public BaseHover(ISourceViewer sourceViewer, AbstractHover delegateTextHover) {
		setSourceViewer(sourceViewer);
		this.delegateTextHover = delegateTextHover;
	}

	@Override
	public Object getHoverInfo2(ITextViewer textViewer, IRegion hoverRegion) {
		String delegateText = String.valueOf(delegateTextHover.getHoverInfo2(sourceViewer, hoverRegion));
		String localText = String.valueOf(getHoverInfo2(sourceViewer, hoverRegion));
		if ((delegateText == null) || (delegateText.length() <= 0)) {
			return localText;
		}
		else if (localText == null) {
			return delegateText;
		}
		return delegateText + "\n-------\n" + localText;
	}

	@Override
	public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
		if (eObject instanceof Pivotable) {
			Element pivotElement = PivotUtil.getPivot(Element.class, (Pivotable)eObject);
			if (pivotElement != null) {
				Namespace namespace = PrettyPrintNameVisitor.getNamespace(pivotElement);
				String description = PrettyPrintNameVisitor.prettyPrint(pivotElement, namespace);
				return pivotElement.eClass().getName() + " : " + description;
			}
		}
		return eObject.eClass().getName();		// FIXME do better					
	}
}