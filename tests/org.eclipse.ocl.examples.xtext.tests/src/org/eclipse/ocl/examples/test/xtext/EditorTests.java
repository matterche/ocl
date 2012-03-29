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
package org.eclipse.ocl.examples.test.xtext;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.xtext.completeocl.ui.CompleteOCLUiModule;
import org.eclipse.ocl.examples.xtext.essentialocl.ui.EssentialOCLUiModule;
import org.eclipse.ocl.examples.xtext.oclinecore.ui.OCLinEcoreUiModule;
import org.eclipse.ocl.examples.xtext.oclstdlib.ui.OCLstdlibUiModule;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

/**
 * Tests that load a model and verify that there are no unresolved proxies as a result.
 */
public class EditorTests extends XtextTestCase
{	

	public void doTestEditor(String editorId, String testFile, String testContent) throws Exception {
		InputStream inputStream = new ByteArrayInputStream(testContent.getBytes());
		String content = doTestEditor(editorId, testFile, inputStream);
		assertEquals(testContent, content);
	}

	private String doTestEditor(String editorId, String testFile, InputStream inputStream) throws CoreException, PartInitException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject("test");
		if (!project.exists()) {
			project.create(null);
		}
		project.open(null);
		IFile file = project.getFile(testFile);
		file.create(inputStream, true, null);
		IEditorInput input = new FileEditorInput(file);
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow activeWorkbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = activeWorkbenchWindow.getActivePage();
		XtextEditor editor = (XtextEditor) IDE.openEditor(page, input, editorId, true);
		String languageName = editor.getLanguageName();
		assertEquals(editorId, languageName);
		IXtextDocument document = editor.getDocument();
		String content = document.get();
		return content;
	}	
	
	public void testEditor_OpenCompleteOCLEditor() throws Exception {
		doTestEditor(CompleteOCLUiModule.EDITOR_ID, "test.ocl", "test");
	}	
	
	public void testEditor_OpenEssentialOCLEditor() throws Exception {
		doTestEditor(EssentialOCLUiModule.EDITOR_ID, "test.essentialocl", "test");
	}	
	
	public void testEditor_OpenOCLinEcoreEditor() throws Exception {
		doTestEditor(OCLinEcoreUiModule.EDITOR_ID, "test.oclinecore", "test");
	}	
	
	public void testEditor_OpenOCLinEcoreEditor4Ecore() throws Exception {
		doTestEditor(OCLinEcoreUiModule.EDITOR_ID, "test.ecore", "test");
	}	
	
	public void testEditor_OpenOCLStdLibEditor() throws Exception {
		doTestEditor(OCLstdlibUiModule.EDITOR_ID, "test.oclstdlib", "test");
	}	
	
	public void testEditor_OpenOCLinEcoreEditor4Pivot_Ecore() throws Exception {
		URI uri = URI.createPlatformPluginURI(PivotConstants.PIVOT_ECORE, true);
		InputStream inputStream = URIConverter.INSTANCE.createInputStream(uri);
		String documentText = doTestEditor(OCLinEcoreUiModule.EDITOR_ID, "Pivot.ecore", inputStream);
		assertTrue(documentText.contains("abstract class Visitable : 'org.eclipse.ocl.examples.pivot.util.Visitable' { interface };"));
	}	
}
