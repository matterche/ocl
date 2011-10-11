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
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.ocl.examples.codegen.tables.Model2tables;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * Generates the javaFolder/'javaPackageName'Tables.java file defining
 * the static dispatch tables for the OCL executor.
 */
public class Model2tablesGenerator extends AbstractWorkflowComponent
{
	private Logger log = Logger.getLogger(getClass());	
	private ResourceSet resourceSet = null;	
	protected String genModelFile;

	public void checkConfiguration(Issues issues) {
		if (genModelFile == null) {
			issues.addError(this, "genModel not specified.");
		}
	}

	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor arg1, Issues issues) {
		URI genModelURI = URI.createPlatformResourceURI(genModelFile, true);
		log.info("Loading Gen Model '" + genModelURI);
		try {
			ResourceSet resourceSet = getResourceSet();
			ProjectMap projectMap = new ProjectMap();
			projectMap.initializeResourceSet(resourceSet);
			resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
			Resource genModelResource = resourceSet.getResource(genModelURI, true);
			String errorsString = PivotUtil.formatResourceDiagnostics(genModelResource.getErrors(), "Loading " + genModelURI, "\n");
			if (errorsString != null) {
				issues.addError(this, errorsString, null, null, null);
				return;
			}
			GenModel genModel = (GenModel) genModelResource.getContents().get(0);
			String modelDirectory = genModel.getModelDirectory();
			String modelProjectDirectory = genModel.getModelProjectDirectory();
			List<Object> arguments = new ArrayList<Object>();
			String modelProject = modelProjectDirectory.substring(1);
			String folderPath = modelDirectory.substring(modelProjectDirectory.length());
			URI projectURI = projectMap.get(modelProject);
			URL url = new URL(projectURI.toString());
			java.net.URI uri = url.toURI();
			File targetFolder = new File(uri.getRawPath() + folderPath);
			Model2tables acceleo = new Model2tables(genModel, targetFolder, arguments);
			log.info("Generating to ' " + targetFolder + "'");
			acceleo.generate(null);
		} catch (Exception e) {
			issues.addError(this, "genModel failed.", null, e, null);
		}
	}

	public void setGenModelFile(String genModelFile) {
		this.genModelFile = genModelFile;
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
}
