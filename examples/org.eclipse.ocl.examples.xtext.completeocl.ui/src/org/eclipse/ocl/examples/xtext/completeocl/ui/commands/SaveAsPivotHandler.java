/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.completeocl.ui.commands;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class SaveAsPivotHandler extends AbstractHandler
{
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		if (window == null) {
			return null;
		}
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (!(editor instanceof XtextEditor)) {
			return null;
		}
		final String file = "C:/Temp/test.xmi";
		final Map<?, ?> saveOptions = null;
		IDocumentProvider documentProvider = ((XtextEditor)editor).getDocumentProvider();
		XtextDocument editorDocument = (XtextDocument) documentProvider.getDocument(editor.getEditorInput());
		editorDocument.modify(new IUnitOfWork<Object, XtextResource>()
		{

			public Object exec(XtextResource resource) throws Exception {
				CS2PivotResourceAdapter csAdapter = CS2PivotResourceAdapter.getAdapter((BaseCSResource)resource, null);
				csAdapter.refreshPivotMappings(null);		// FIXME redundant
				Resource pivotResource = csAdapter.getPivotResource(resource);
				pivotResource.setURI(URI.createFileURI(file));
				pivotResource.save(saveOptions);
				return null;
			}
		});
		return null;
	}
}
