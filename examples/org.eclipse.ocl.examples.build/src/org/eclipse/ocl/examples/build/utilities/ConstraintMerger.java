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

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.IProjectDescriptor;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Library;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.ecore.Pivot2Ecore;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.manager.TypeServer;
import org.eclipse.ocl.examples.pivot.manager.TypeTracker;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCSResource;

/**
 * Merges a specified <tt>uri</tt> into a designated <tt>modelSlot</tt>.
 */
public class ConstraintMerger extends AbstractProjectComponent
{
	private Logger log = Logger.getLogger(getClass());	
	protected String uri;	

	public ConstraintMerger() {
		OCLstdlib.install();
		CompleteOCLStandaloneSetup.doSetup();
	}

	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		if (uri == null) {
			issues.addError(this, "uri not specified.");
		}
	}

	public String getUri() {
		return uri;
	}

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor arg1, Issues arg2) {
		IProjectDescriptor projectDescriptor = getProjectDescriptor();
		URI inputURI = projectDescriptor.getPlatformResourceURI(uri);
		log.info("Merging '" + inputURI + "'");
		Resource ecoreResource = (Resource) ctx.get(getModelSlot());
		EPackage ecorePivotPackage = (EPackage) ecoreResource.getContents().get(0);
		final String pivotNsURI = ecorePivotPackage.getNsURI();
//		IPackageDescriptor packageDescriptor = projectDescriptor.getPackageDescriptor(URI.createURI(pivotNsURI));
		ResourceSet resourceSet = new ResourceSetImpl();
//		packageDescriptor.setUseModel(true, null);				// Hide packages installed by CompleteOCLStandaloneSetup
			
		MetaModelManager metaModelManager = MetaModelManager.getAdapter(resourceSet);
		metaModelManager.getExternalResourceSet().getResources().add(ecoreResource);		// Don't load another copy
		metaModelManager.setDefaultStandardLibraryURI(pivotNsURI);
		StandardLibraryContribution.REGISTRY.put(pivotNsURI, new OCLstdlib.Loader()
		{
			@Override
			public Resource getResource() {
				Resource resource = super.getResource();
				Library library = (Library) resource.getContents().get(0);
				library.setNsURI(pivotNsURI);
//				library.setName(ecorePivotPackage.getName());
				return resource;
			}			
		});
//		metaModelManager.getBooleanType();
		Ecore2Pivot ecore2pivot = Ecore2Pivot.getAdapter(ecoreResource, metaModelManager);
		org.eclipse.ocl.examples.pivot.Package pivotRoot = ecore2pivot.getPivotRoot();
		Resource pivotResource = pivotRoot.eResource();
//FIXME		diagnoseErrors(pivotResource);
//		URI fileURI = URI.createPlatformResourceURI(uri, true);
		try {
			EssentialOCLCSResource xtextResource = (EssentialOCLCSResource) metaModelManager.getExternalResourceSet().createResource(inputURI, null);
			MetaModelManagerResourceAdapter.getAdapter(xtextResource, metaModelManager);
			xtextResource.load(null);
			ResourceUtils.checkResourceSet(resourceSet);
//			CS2PivotResourceAdapter cs2pivot = CS2PivotResourceAdapter.getAdapter(xtextResource, metaModelManager);
//			Resource oclResource = cs2pivot.getPivotResource(xtextResource);
//			Set<Resource> primaryPivotResources = new HashSet<Resource>();
//			Set<Resource> libraryPivotResources = new HashSet<Resource>();
//			Iterable<org.eclipse.ocl.examples.pivot.Package> somePackages = metaModelManager.getPackageManager().getAllPackages();
//			identifyResources(metaModelManager, somePackages, primaryPivotResources, libraryPivotResources);
//			Set<Resource> secondaryPivotResources = new HashSet<Resource>(metaModelManager.getPivotResourceSet().getResources());
//			secondaryPivotResources.removeAll(primaryPivotResources);
//			secondaryPivotResources.removeAll(libraryPivotResources);
//			primaryPivotResources.removeAll(libraryPivotResources);
//			for (Resource secondaryPivotResource : secondaryPivotResources) {
			for (Resource resource : metaModelManager.getPivotResourceSet().getResources()) {
				if (resource == pivotResource) {
					continue;
				}
				for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
					EObject eObject = tit.next();
					if (eObject instanceof Library) {
						tit.prune();
						continue;
					}
					if (eObject instanceof NamedElement) {
						NamedElement pivotNamedElement = (NamedElement)eObject;
						NamedElement primaryNamedElement = metaModelManager.getPrimaryElement(pivotNamedElement);
						for (Constraint constraint : pivotNamedElement.getOwnedRule()) {
							constraint.setIsCallable(true);
						}
						primaryNamedElement.getOwnedRule().addAll(pivotNamedElement.getOwnedRule());
	//					tit.prune();
					}
					if (eObject instanceof Type) {
						Type pivotType = (Type)eObject;
						TypeServer typeServer = metaModelManager.getTypeServer(pivotType);
						for (TypeTracker typeTracker : typeServer.getTypeTrackers()) {
							Type pType = typeTracker.getTarget();
							if (pType.eResource() == pivotResource) {
								pType.getOwnedAttribute().addAll(pivotType.getOwnedAttribute());
								pType.getOwnedOperation().addAll(pivotType.getOwnedOperation());
								break;
							}
						}
						tit.prune();
					}
				}
			}
//			List<Resource> resources = resourceSet.getResources();
			URI ecoreURI = ecoreResource.getURI();
//			for (int i = resources.size() - 1; i >= 0; --i) {
//				Resource resource = resources.get(i);
//				if (ecoreURI.equals(resource.getURI())) {
//					resources.remove(resource);
//				}
//			}
//				System.out.println("Pivot2Ecore " + pivotResource.getURI());
			Resource ecoreResource2 = Pivot2Ecore.createResource(metaModelManager, pivotResource, ecoreURI, null);
			ctx.set(getModelSlot(), ecoreResource2);
			projectDescriptor.useModelsAndPackages(ecoreResource2);
			
//			for (EObject eObject : oclResource.getContents()) {
//				if (eObject instanceof org.eclipse.ocl.examples.pivot.Package) {
//					org.eclipse.ocl.examples.pivot.Package pivotPackage = (org.eclipse.ocl.examples.pivot.Package)eObject;
//					PackageTracker packageTracker = metaModelManager.getPackageTracker(pivotPackage);
//					PackageServer packageServer = packageTracker.getPackageServer();
//					packageServer.removePackage(pivotPackage);
//				}
//			}
//			EcoreUtil.resolveAll(resourceSet);
//			ResourceUtils.checkResourceSet(resourceSet);
//			ctx.set(getModelSlot(), resource);
		} catch (IOException e) {
			throw new RuntimeException("Problems running " + getClass().getSimpleName(), e);
		}
	}

/*	public void identifyResources(MetaModelManager metaModelManager, Iterable<org.eclipse.ocl.examples.pivot.Package> somePackages,
			Set<Resource> primaryPivotResources, Set<Resource> libraryPivotResources) {
		for (org.eclipse.ocl.examples.pivot.Package pPackage : somePackages) {
			if (pPackage instanceof Library) {
				libraryPivotResources.add(pPackage.eResource());
			}
			else {
				for (Type pType : pPackage.getOwnedType()) {
					TypeTracker typeTracker = metaModelManager.getTypeTracker(pType);
					if (typeTracker instanceof TypeServer) {
						primaryPivotResources.add(pPackage.eResource());
						break;
					}
				}
				identifyResources(metaModelManager, pPackage.getNestedPackage(),  primaryPivotResources, libraryPivotResources);
			}
		}
	} */

	public void setUri(String uri) {
		this.uri = uri;
	}
}
