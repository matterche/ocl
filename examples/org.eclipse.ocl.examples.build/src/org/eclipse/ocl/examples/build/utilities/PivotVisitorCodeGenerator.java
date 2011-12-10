/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: PivotVisitorCodeGenerator.java,v 1.4 2011/03/17 20:01:45 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.ocl.examples.build.acceleo.GeneratePivotVisitors;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.IProjectDescriptor;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup;

/**
 * Generates the javaFolder/'javaPackageName'/javaClassName.java file providing
 * a static Java-creation of the libraryFile OCL standard library definition.
 */
public class PivotVisitorCodeGenerator extends AbstractWorkflowComponent
{
	private Logger log = Logger.getLogger(getClass());	
	private ResourceSet resourceSet = null;	
	protected String projectName;
	protected String javaClassName;
	protected String javaFolder;
	protected String javaPackageName;
	protected String ecoreFile;

	public PivotVisitorCodeGenerator() {
		OCLstdlibStandaloneSetup.doSetup();
	}

	public void checkConfiguration(Issues issues) {
		if (projectName == null) {
			issues.addError(this, "projectName not specified.");
		}
		if (javaClassName == null) {
			issues.addError(this, "javaClassName not specified.");
		}
		if (javaPackageName == null) {
			issues.addError(this, "javaPackageName not specified.");
		}
		if (ecoreFile == null) {
			issues.addError(this, "libraryFile not specified.");
		}
	}

	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor arg1, Issues issues) {
		ResourceSet resourceSet = getResourceSet();
		StandaloneProjectMap projectMap = StandaloneProjectMap.getAdapter(resourceSet);
		IProjectDescriptor projectDescriptor = projectMap.getProjectDescriptor(projectName);
		URI inputURI = projectDescriptor.getPlatformResourceURI(ecoreFile);
		File outputFolder = projectDescriptor.getLocationFile(javaFolder + '/' + javaPackageName.replace('.', '/') + "/util");
		log.info("Loading Pivot Model '" + inputURI);
		try {
			resourceSet.getPackageRegistry().put(PivotPackage.eNS_URI, PivotPackage.eINSTANCE);
			Resource ecoreResource = resourceSet.getResource(inputURI, true);
			List<Object> arguments = new ArrayList<Object>();
			arguments.add(javaPackageName);
			arguments.add(javaClassName);
			arguments.add(ecoreFile);
			EObject ecoreModel = ecoreResource.getContents().get(0);
			GeneratePivotVisitors acceleo = new GeneratePivotVisitors(ecoreModel, outputFolder, arguments);
			log.info("Generating to ' " + outputFolder + "'");
			acceleo.generate(null);
		} catch (IOException e) {
			throw new RuntimeException("Problems running " + getClass().getSimpleName(), e);
		}
	}

	public void setJavaClassName(String javaClassName) {
		this.javaClassName = javaClassName;
	}

	public void setJavaFolder(String javaFolder) {
		this.javaFolder = javaFolder;
	}

	public void setJavaPackageName(String javaPackageName) {
		this.javaPackageName = javaPackageName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setEcoreFile(String ecoreFile) {
		this.ecoreFile = ecoreFile;
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
}
