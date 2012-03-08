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
package org.eclipse.ocl.examples.build.utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ocl.examples.pivot.utilities.PivotResource;

public class QvtoWorkflowComponent extends AbstractWorkflowComponent
{
	private static final Logger logger = Logger.getLogger(QvtoWorkflowComponent.class);
	
	private ResourceSet resourceSet = null;	
	private String uri = null;	
	private List<String> ins = new ArrayList<String>();
	private String out = null;	
	private String trace = null;	
	
	public void addIn(String fileName) {
		ins.add(fileName);
	}

	public void checkConfiguration(Issues issues) {
		if (uri == null) {
			issues.addError(this, "uri not specified.");
		}
	}

	public String getOut() {
		return out;
	}

	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	public String getTrace() {
		return trace;
	}

	public String getUri() {
		return uri;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		URI txURI = URI.createPlatformResourceURI(uri, true);
		logger.info("Loading '" + txURI + "'");
		TransformationExecutor transformationExecutor = new TransformationExecutor(txURI);
		Diagnostic diagnostic = transformationExecutor.loadTransformation();
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			StringBuilder s = new StringBuilder();
			s.append("Failed to load ");
			s.append(txURI);
			for (Diagnostic child : diagnostic.getChildren()) {
				s.append("\n  " + child.getMessage());
			}
			issues.addError(this, s.toString(), txURI, null, null);
			return;
		}
		ModelExtent[] modelExtents = new ModelExtent[ins.size()+1];
		for (int i = 0; i < ins.size(); i++) {
			String in = ins.get(i);
			URI inURI = URI.createPlatformResourceURI(in, true);
			logger.info("Loading '" + inURI + "'");
			Resource inResource = resourceSet.getResource(inURI, true);
			if (inResource.getErrors().size() > 0) {
				issues.addError(this, "Failed to load", inURI, null, null);
				return;
			}
			modelExtents[i] = new BasicModelExtent(inResource.getContents());
		}		
			
		modelExtents[modelExtents.length-1] = new BasicModelExtent();

//		String traceUri = trace != null ? URI.createPlatformResourceURI(trace, true).toString() : null;
		
		URI outURI = URI.createPlatformResourceURI(out, true);
		try {
			logger.info("Transforming to '" + outURI + "'");
			ExecutionContextImpl executionContext = new ExecutionContextImpl();
//			executionContext.setMonitor();
			ExecutionDiagnostic executionDiagnostic = transformationExecutor.execute(executionContext, modelExtents);
			if (executionDiagnostic.getSeverity() != Diagnostic.OK) {
				StringBuilder s = new StringBuilder();
				s.append("Failed to execute ");
				s.append(txURI);
				for (Diagnostic child : diagnostic.getChildren()) {
					s.append("\n  " + child.getMessage());
				}
				issues.addError(this, s.toString(), txURI, null, null);
				return;
			}
		} catch (Exception e) {
			issues.addError(this, "Failed to launch transformation", txURI, e, null);
			return;
		}
		try {
			logger.info("Creating '" + outURI + "'");
			XMLResource outResource = (XMLResource) resourceSet.createResource(outURI, null);
			outResource.getContents().addAll(modelExtents[modelExtents.length-1].getContents());
			outResource.setEncoding(PivotResource.DEFAULT_ENCODING);
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
			options.put(XMLResource.OPTION_LINE_WIDTH, 80);
			options.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
			options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			outResource.save(options);
		} catch (IOException e) {
			issues.addError(this, "Failed to save ", outURI, e, null);
			return;
		}
	}

	public void setOut(String out) {
		this.out = out;
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
