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
 * $Id: BaseSourceViewerConfiguration.java,v 1.1.2.1 2011/01/17 08:11:48 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.model;

import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.hover.AbstractHover;

public class BaseSourceViewerConfiguration extends XtextSourceViewerConfiguration
{
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		ITextHover textHover = super.getTextHover(sourceViewer, contentType);
		return new BaseHover(sourceViewer, (AbstractHover) textHover);
	}		
}