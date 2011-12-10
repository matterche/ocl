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
package org.eclipse.ocl.examples.domain.utilities;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.parsers.SAXParser;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * ProjectMap extends {@link StandaloneProjectMap} to support polymorphic access in either plugin or standalone environments
 * to EMF resources and EPackages.
 * 
 *<h4>Plugin Environment</h4>
 *
 * A resolvable location is perhaps <tt>platform:/plugin/org.antlr.runtime/</tt> for a bundle or
 * <tt>platform:/resource/org.eclipse.ocl.examples.common/</tt> for an open project.
 * <p>
 * {@link #getProjectMap()} returns a map of project names, but not bundle names, to resolvable location.
 * <p>
 * {@link #initializePackageRegistry(ResourceSet)} augments the default EMF startup in a plugin environment
 * whereby the global package registry acquires a registration for each namespace URI
 * (e.g. <tt>http://www.eclipse.org/emf/2002/Ecore</tt>) defined by the
 * <tt>org.eclipse.emf.ecore.generated_package</tt> extension point in plugins.
 * The standard reguistration is auugmented where appropriate, by two further registrations for
 * the project URI (e.g. <tt>platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore</tt>) and the plugin URI
 * (e.g. <tt>platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore</tt>). These extra registrations
 * derived from the <tt>genPackages.ecorePackage</tt> referenced by the <tt>genmodel</tt>
 * <tt>org.eclipse.emf.ecore.generated_package</tt> declarations ensure that all three URIs resolve to
 * the same Resource eliminating most opportunities for meta-model schizophrenia.
 * <p>
 * {@link #initializePlatformResourceMap()} does nothing since the standard EMF Platform URI Handler
 * can open platform resources directly.
 * <p>
 * {@link #initializeGenModelLocationMap(ResourceSet)} does nothing, since the standard EMF startup in a
 * plugin environment populates the {@link EcorePlugin#getEPackageNsURIToGenModelLocationMap()}.
 * <p>
 * {@link #initializeURIMap(URIConverter)} installs explicit URI mappings into the {@link URIConverter}
 * so that for each project so that both <tt>platform:/resource/project</tt> and
 * <tt>platform:/plugin/<i>project</i></tt> reference <tt>platform:/resource/<i>project</i></tt>. An additional
 * backstop URI mapping redirects <tt>platform:/resource</tt> to <tt>platform:/plugin</tt>.
 * <p>
 * The explicit mapping ensures that projects are accessible as either
 * <tt>platform:/resource/<i>project</i></tt> or <tt>platform:/plugin/<i>project</i></tt>.
 * The backstop mapping ensures that plugins, that are not occluded by projects, are
 * accessible as <tt>platform:/plugin/<i>project</i></tt> or
 * <tt>platform:/resource/<i>project</i></tt>, without needing to create an
 * explicit URI map entry for each of the many hundreds of bundles in typical use.
 */
public class ProjectMap extends StandaloneProjectMap
{	
	public static class ProjectDescriptor extends StandaloneProjectMap.ProjectDescriptor
	{
		public ProjectDescriptor(String name, URI locationURI) {
			super(name, locationURI);
		}

		@Override
		public void initializeURIMap(Map<URI, URI> uriMap) {
			if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
				super.initializeURIMap(uriMap);
			}
			else {
				if (locationURI.isPlatformResource()) {
					URI resourceURI = locationURI;
					URI pluginURI = getPlatformPluginURI();
					uriMap.put(resourceURI, resourceURI);
					uriMap.put(pluginURI, resourceURI);
				}
			}
		}
	}

	public static ProjectMap findAdapter(ResourceSet resourceSet) {
		return (ProjectMap) EcoreUtil.getAdapter(resourceSet.eAdapters(), ProjectMap.class);
	}

	public static ProjectMap getAdapter(ResourceSet resourceSet) {
		ProjectMap adapter = findAdapter(resourceSet);
		if (adapter == null) {
			adapter = new ProjectMap();
			resourceSet.eAdapters().add(adapter);
			adapter.initializeResourceSet(resourceSet);
		}
		return adapter;
	}

	@Override
	protected IProjectDescriptor.Internal createProjectDescriptor(String projectName, URI locationURI) {
		return new ProjectDescriptor(projectName, locationURI);
	}
	
	@Override
	public URI getLocation(String projectName) {
		URI uri = super.getLocation(projectName);
		if ((uri == null) && EMFPlugin.IS_ECLIPSE_RUNNING) {
			uri = URI.createPlatformPluginURI("/" + projectName + "/", true);
		}
		return uri;
	}
	
	@Override
	public void initializeGenModelLocationMap(boolean force) {
		if (force || (!initializedGenModelLocationMap && !EMFPlugin.IS_ECLIPSE_RUNNING)) {
			super.initializeGenModelLocationMap(force);
		}
	}
	
	@Override
	public void initializePackageRegistry(ResourceSet resourceSet) {
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			super.initializePackageRegistry(resourceSet);
		}
		else {
			EPackage.Registry packageRegistry = getPackageRegistry(resourceSet);
			Map<String, URI> ePackageNsURIToGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
			for (String ePackageNsURI : ePackageNsURIToGenModelLocationMap.keySet()) {
				URI genModelURI = ePackageNsURIToGenModelLocationMap.get(ePackageNsURI);
				if (genModelURI.isPlatformPlugin()) {
					IProjectDescriptor.Internal projectDescriptor = getProjectDescriptorInternal(genModelURI);
					Object ePackageDescriptor = EPackage.Registry.INSTANCE.get(ePackageNsURI);
					packageRegistry.put(ePackageNsURI, ePackageDescriptor);
					IPackageDescriptor packageDescriptor = projectDescriptor.getPackageDescriptor(URI.createURI(ePackageNsURI));
//					System.out.println(key + " ==> ");
					URI localModelURI = packageDescriptor.getEcoreModelURI();
					if (localModelURI != null) {
						URI ecorePackageResourceURI = localModelURI.resolve(projectDescriptor.getPlatformResourceURI());
						URI ecorePackagePluginURI = localModelURI.resolve(projectDescriptor.getPlatformPluginURI());
						packageRegistry.put(ecorePackageResourceURI.toString(), packageDescriptor);
						packageRegistry.put(ecorePackagePluginURI.toString(), packageDescriptor);
//						System.out.println(ecorePackageResourceURI + " ==> ");
//						System.out.println(ecorePackagePluginURI + " ==> ");
					}
				}
			}
		}
	}
	
	@Override
	public void initializePlatformResourceMap(boolean force) {
		if (force || (!initializedPlatformResourceMap && !EMFPlugin.IS_ECLIPSE_RUNNING)) {
			super.initializePlatformResourceMap(force);
		}
	}

	@Override
	public void initializeURIMap(ResourceSet resourceSet) {
		super.initializeURIMap(resourceSet);
		if (EMFPlugin.IS_ECLIPSE_RUNNING) {
			Map<URI, URI> uriMap = getURIMap(resourceSet);
			URI resourceURI = URI.createPlatformResourceURI("/", true);
			URI pluginURI = URI.createPlatformPluginURI("/", true);
			uriMap.put(resourceURI, pluginURI);
		}
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return (type instanceof Class<?>) && ((Class<?>)type).isAssignableFrom(ProjectMap.class);
	}

	@Override
	protected void scanClassPath(Map<String, IProjectDescriptor.Internal> projectDescriptors, SAXParser saxParser) {
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			super.scanClassPath(projectDescriptors, saxParser);
		}
		else {
//			scanBundles();  -- no need to scan hundreds of bundles when a single URI map entry will handle them all. 
			scanProjects(projectDescriptors);
			scanGenModels(saxParser);
		}
	}

/*	protected void scanBundles() {
		for (IBundleGroupProvider bundleGroupProvider : Platform.getBundleGroupProviders()) {
			for (IBundleGroup bundleGroup : bundleGroupProvider.getBundleGroups()) {
				for (Bundle bundle : bundleGroup.getBundles()) {
					String bundleName = bundle.getSymbolicName();
					String projectKey = "/" + bundleName + "/";
					project2location.put(bundleName, URI.createPlatformPluginURI(projectKey, true));
				}				
			}
		}
	} */

	protected void scanGenModels(SAXParser saxParser) {
		URIConverter uriConverter = new ExtensibleURIConverterImpl();
		Map<String, URI> ePackageNsURIToGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
		for (String ePackageNsURI : ePackageNsURIToGenModelLocationMap.keySet()) {
			URI genModelURI = ePackageNsURIToGenModelLocationMap.get(ePackageNsURI);
//			System.out.println(ePackageNsURI + " -> " + genModelURI);
			if (genModelURI.isPlatformPlugin()) {
				IProjectDescriptor.Internal projectDescriptor = getProjectDescriptorInternal(genModelURI);
				URI nsURI = URI.createURI(ePackageNsURI);
				IPackageDescriptor.Internal packageDescriptor = (IPackageDescriptor.Internal) projectDescriptor.getPackageDescriptor(nsURI);
				if (packageDescriptor == null) {
					packageDescriptor = projectDescriptor.createPackageDescriptor(nsURI, genModelURI.deresolve(projectDescriptor.getLocationURI(), true, true, true));
				}
				GenModelEcorePackageHandler genModelEcorePackageHandler = packageDescriptor.createGenModelEcorePackageHandler();
		        InputStream inputStream = null;
		        try {
		        	inputStream = uriConverter.createInputStream(genModelURI);
		        	saxParser.parse(inputStream, genModelEcorePackageHandler);
				} catch (Exception e) {
					logException(new File(genModelURI.toString()), e);
				} finally {
					try {
						if (inputStream != null) {
							inputStream.close();
						}
					} catch (IOException e) {}
		        }
			}
		}
	}

	protected void scanProjects(Map<String, IProjectDescriptor.Internal> projectDescriptors) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IProject project : root.getProjects()) {
			String projectName = project.getName();
			String projectKey = "/" + projectName + "/";
			projectDescriptors.put(projectName, createProjectDescriptor(projectName, URI.createPlatformResourceURI(projectKey, true)));
		}
	}
}
