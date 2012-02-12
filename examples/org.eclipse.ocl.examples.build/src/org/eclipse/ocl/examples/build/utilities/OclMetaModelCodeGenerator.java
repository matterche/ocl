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
 * $Id: OclMetaModelCodeGenerator.java,v 1.3 2011/05/20 15:27:03 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.ocl.examples.build.acceleo.GenerateOclMetaModel;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.IProjectDescriptor;
import org.eclipse.ocl.examples.pivot.Package;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup;

/**
 * Generates the javaFolder/'javaPackageName'/javaClassName.java file providing
 * a static Java-creation of the libraryFile OCL standard library definition.
 */
public class OclMetaModelCodeGenerator extends AbstractWorkflowComponent
{
	private Logger log = Logger.getLogger(getClass());	
	private ResourceSet resourceSet = null;	
	protected String projectName;
	protected String javaClassName;
	protected String javaFolder;
	protected String javaPackageName;
	protected String libraryFile;

	public OclMetaModelCodeGenerator() {
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
		if (libraryFile == null) {
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
		URI inputURI = projectDescriptor.getPlatformResourceURI(libraryFile);
		File outputFolder = projectDescriptor.getLocationFile(javaFolder + '/' + javaPackageName.replace('.', '/'));
		OCLstdlib.install();
		log.info("Loading Pivot Model '" + inputURI);
		try {
			MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
			Resource ecoreResource = resourceSet.getResource(inputURI, true);
			MetaModelManagerResourceAdapter.getAdapter(ecoreResource, metaModelManager);
			String ecoreErrorsString = PivotUtil.formatResourceDiagnostics(ecoreResource.getErrors(), "Loading " + inputURI, "\n");
			if (ecoreErrorsString != null) {
				issues.addError(this, ecoreErrorsString, null, null, null);
				return;
			}
			Ecore2Pivot ecore2Pivot = Ecore2Pivot.getAdapter(ecoreResource, metaModelManager);
			org.eclipse.ocl.examples.pivot.Package pivotRoot = ecore2Pivot.getPivotRoot();
			Package pivotPackage = pivotRoot.getNestedPackage().get(0);
			Resource pivotResource = pivotRoot.eResource();
			String pivotErrorsString = PivotUtil.formatResourceDiagnostics(pivotResource.getErrors(), "Converting " + inputURI, "\n");
			if (pivotErrorsString != null) {
				issues.addError(this, pivotErrorsString, null, null, null);
				return;
			}
			List<Object> arguments = new ArrayList<Object>();
			arguments.add(javaPackageName);
			arguments.add(javaClassName);
			arguments.add(libraryFile);
			arguments.add(pivotPackage.getNsURI());
//			PivotSaver saver = new PivotSaver(pivotResource);
//			org.eclipse.ocl.examples.pivot.Package orphanage = saver.localizeSpecializations();
//			if (orphanage != null) {
//				((org.eclipse.ocl.examples.pivot.Package)pivotModel).getNestedPackage().add(orphanage);
//			}
			GenerateOclMetaModel acceleo = new GenerateOclMetaModel(pivotPackage, outputFolder, arguments);
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

	public void setLibraryFile(String libraryFile) {
		this.libraryFile = libraryFile;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
}
