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
 * $Id: ResourceReader.java,v 1.2 2011/01/24 20:54:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.build.utilities;

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.ocl.examples.pivot.delegate.PivotInstaller;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2PivotResourceAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;

/**
 * Merges a specified <tt>uri</tt> into a designated <tt>modelSlot</tt>.
 */
public class ConstraintMerger extends WorkflowComponentWithModelSlot
{
	private Logger log = Logger.getLogger(getClass());	
	private ResourceSet resourceSet = null;	
	protected String uri;	

	public ResourceSet getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}

	public String getUri() {
		return uri;
	}

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor arg1, Issues arg2) {
		OCLstdlib.install();
		CompleteOCLStandaloneSetup.doSetup();
		ResourceSet resourceSet = getResourceSet();
		MetaModelManager metaModelManager = MetaModelManager.findAdapter(resourceSet);
		if (metaModelManager == null) {
			metaModelManager = new MetaModelManager();
			resourceSet.eAdapters().add(metaModelManager);
		}
		Resource ecoreResource = (Resource) ctx.get(getModelSlot());
		Ecore2Pivot ecore2pivot = Ecore2Pivot.getAdapter(ecoreResource, metaModelManager);
		org.eclipse.ocl.examples.pivot.Package pivotRoot = ecore2pivot.getPivotRoot();
		Resource pivotResource = pivotRoot.eResource();
//		diagnoseErrors(pivotResource);
		URI fileURI = URI.createPlatformResourceURI(uri, true);
		log.info("Merging '" + fileURI + "'");
		InputStream inputStream = null;
		try {
			inputStream = resourceSet.getURIConverter().createInputStream(fileURI);
			EssentialOCLCSResource xtextResource = (EssentialOCLCSResource) resourceSet.createResource(fileURI, null);
			MetaModelManagerResourceAdapter.getAdapter(xtextResource, metaModelManager);
			xtextResource.load(inputStream, null);
			CS2PivotResourceAdapter cs2pivot = CS2PivotResourceAdapter.getAdapter(xtextResource, metaModelManager);
			Resource oclResource = cs2pivot.getPivotResource(xtextResource);
			for (TreeIterator<EObject> tit = oclResource.getAllContents(); tit.hasNext(); ) {
				EObject eObject = tit.next();
				if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
					PivotInstaller.installDelegates(metaModelManager, (org.eclipse.ocl.examples.pivot.Package)eObject);
					tit.prune();
				}
			}
//			EcoreUtil.resolveAll(resourceSet);
//			ResourceUtils.checkResourceSet(resourceSet);
//			ctx.set(getModelSlot(), resource);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {}
		}
	}
	
	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}
