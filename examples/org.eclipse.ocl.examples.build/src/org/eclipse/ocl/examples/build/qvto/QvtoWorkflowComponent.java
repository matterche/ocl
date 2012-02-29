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
package org.eclipse.ocl.examples.build.qvto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.common.launch.TargetUriData;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ModelContent;
import org.eclipse.m2m.internal.qvt.oml.library.Context;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchUtil;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtValidator;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtInterpretedTransformation;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation;
import org.eclipse.m2m.qvt.oml.util.Log;

@SuppressWarnings("restriction")
public class QvtoWorkflowComponent extends AbstractWorkflowComponent
{	// This class inpired by org.eclipse.m2m.internal.qvt.oml.runtime.ant.QvtoAntTransformationTask
	private static final Logger logger = Logger.getLogger(QvtoWorkflowComponent.class);
	
	private ResourceSet resourceSet = null;	
	private String uri = null;	
	private List<String> ins = new ArrayList<String>();
	private String out = null;	
	private String trace = null;	
	private final Map<String, Object> myConfigProperties = new LinkedHashMap<String, Object>(3);
	
	public void addIn(String fileName) {
		ins.add(fileName);
	}

	public void checkConfiguration(Issues issues) {
		if (uri == null) {
			issues.addError(this, "uri not specified.");
		}
	}

	private Log createQVTLog() {
		return new Log() {

			public void log(int level, String message, Object param) {
				log(message, param);
			}

			public void log(int level, String message) {
				log(message);
			}

			public void log(String message, Object param) {
				logger.info(message + " , data:" + String.valueOf(param)); //$NON-NLS-1$
			}

			public void log(String message) {
				logger.info(message);					
			}
		};
	}    
	
	private Map<String, Object> getConfiguration() {
	    return myConfigProperties;
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
		StandaloneQvtModule qvtModule = new StandaloneQvtModule(txURI);
		QvtTransformation transformation = new QvtInterpretedTransformation(qvtModule);
		logger.info("Loading '" + txURI + "'");
		try {
			qvtModule.getModule();
		} catch (MdaException e) {
			issues.addError(this, "Failed to load", txURI, e, null);
			return;
		}

		List<ModelContent> inObjects = new ArrayList<ModelContent>();
		for (String in : ins) {
//			Resource inResource = resourceSet.getResource(URI.createPlatformResourceURI(in, true), true);
//			inObjects.add(new ModelContent(inResource.getContents()));
			URI inURI = URI.createPlatformResourceURI(in, true);
			try {
				logger.info("Loading '" + inURI + "'");
				ModelContent inModel = transformation.loadInput(inURI);
		        inObjects.add(inModel);
			} catch (MdaException e) {
				issues.addError(this, "Failed to load", inURI, e, null);
				return;
			}                    
		}		
			
		List<TargetUriData> targetData = new ArrayList<TargetUriData>(); 
		URI outURI = URI.createPlatformResourceURI(out, true);
		targetData.add(new TargetUriData(outURI.toString()));
//		loadTransformationParams(transformation, inObjects, targetData);

		String traceUri = trace != null ? URI.createPlatformResourceURI(trace, true).toString() : null;
		
 		try {
			logger.info("Validating '" + txURI + "'");
			IStatus status = QvtValidator.validateTransformation(transformation, inObjects, traceUri);
	        if (status.getSeverity() > IStatus.WARNING) {
				issues.addWarning(this, "Failed to validate transformation: " + status.getMessage(), txURI, null,
						status.getException() != null ? Collections.<Object>singletonList(status.getException()) : null);
				return;
	        }      	
		} catch (MdaException e) {
			issues.addError(this, "Failed to validate transformation", txURI, e, null);
			return;
		}                    
		
		Context createContext = QvtLaunchUtil.createContext(getConfiguration());
		createContext.setLog(createQVTLog());
		
		try {
			logger.info("Transforming to '" + outURI + "'");
			QvtoStandaloneLaunchConfigurationDelegate.doLaunch(transformation, inObjects, targetData, traceUri, createContext);
		} catch (Exception e) {
			issues.addError(this, "Failed to launch transformation", txURI, e, null);
			return;
		}
		
		try {
			transformation.cleanup();
		} catch (MdaException e) {
			issues.addError(this, "Failed to cleanup transformation", txURI, e, null);
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
