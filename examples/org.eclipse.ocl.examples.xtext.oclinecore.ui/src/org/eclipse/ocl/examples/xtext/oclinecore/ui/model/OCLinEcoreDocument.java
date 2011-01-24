/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: OCLinEcoreDocument.java,v 1.5.6.7 2011/01/24 08:27:06 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.ui.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.ocl.examples.common.plugin.OCLExamplesCommonPlugin;
import org.eclipse.ocl.examples.pivot.ecore.Pivot2Ecore;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.ui.model.BaseDocument;
import org.eclipse.xtext.ui.editor.model.DocumentTokenSource;
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer;

import com.google.inject.Inject;

/**
 * An OCLinEcoreDocument refines a document to support generation of an alternate (XMI) content
 * for use during save in place of its normal textual content.
 */
public class OCLinEcoreDocument extends BaseDocument
{
	@Inject
	public OCLinEcoreDocument(DocumentTokenSource tokenSource, ITextEditComposer composer) {
		super(tokenSource, composer);
	}

	protected void checkForErrors(Resource resource) throws CoreException {
		List<Resource.Diagnostic> errors = resource.getErrors();
		if (errors.size() > 0) {
			StringBuffer s = new StringBuffer();
			for (Resource.Diagnostic diagnostic : errors) {
				s.append("\n");
				s.append(diagnostic.toString());
			}
			throw new CoreException(new Status(IStatus.ERROR, OCLExamplesCommonPlugin.PLUGIN_ID, s.toString()));
		}
	}

	protected XMLResource getPivotResouce() throws CoreException {
		CS2PivotResourceAdapter adapter = CS2PivotResourceAdapter.findAdapter(resource2);
		XMLResource pivotResource = (XMLResource) adapter.getPivotResource(resource2);
		checkForErrors(pivotResource);
		return pivotResource;
	}

	/**
	 * Fill outputStream with the XMI representation of the Ecore to be saved.
	 */
	public void saveAsEcore(Writer writer) throws IOException, CoreException {
		XMLResource pivotResource = getPivotResouce();
		CS2PivotResourceAdapter adapter = CS2PivotResourceAdapter.findAdapter(resource2);
		List<EObject> ecoreContents = Pivot2Ecore.createResource(adapter.getPivotManager(), pivotResource);
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		URI ecoreURI = URI.createURI("internal.ecore");
		XMLResource ecoreResource = (XMLResource) resourceSet.createResource(ecoreURI);
		ecoreResource.getContents().addAll(ecoreContents);
		checkForErrors(ecoreResource);
		ecoreResource.save(writer, null);
	}

	public void saveAsPivot(StringWriter writer) throws CoreException, IOException {
		XMLResource pivotResource = getPivotResouce();
		pivotResource.save(writer, null);
	}

}
