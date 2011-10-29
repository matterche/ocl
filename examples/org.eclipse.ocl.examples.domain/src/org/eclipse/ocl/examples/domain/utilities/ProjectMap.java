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
 * The standalone functionality is heavily influenced by org.eclipse.emf.mwe.utils.StandaloneSetup.
 * 
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.domain.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipException;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.notify.impl.SingletonAdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Document;

/**
 * ProjectMap provides facilities to assist in preparing the {@link URIConverter} of 
 * a {@link ResourceSet} and the
 * {@link EcorePlugin#getPlatformResourceMap()} to support arbitrary and compatible use of
 * <tt>platform:/plugin</tt>
 * and <tt>platform:/resource</tt> URIs in both plugin and standalone environments.
 *<p> 
 * A ProjectMap consists of a map from a project or bundle name to a location that is
 * resolvable by the conventional Platform URL stream opening capabilities. Utility methods
 * support export of the map to initialize the URIMap in a {@link URIConverter} and/or the
 * {@link EcorePlugin#getPlatformResourceMap()}.
 * <p>
 * Minimal usage to configure <tt>aResourceSet</tt> is just
 * <br><tt>new ProjectMap().initializeResourceSet(aResourceSet);</tt>
 * <br>Thereafter EMF accesses to projects and bundles should just work.
 * 
 *<h4>Plugin Environment</h4>
 *
 * A resolvable location is perhaps <tt>platform:/plugin/org.antlr.runtime/</tt> for a bundle or
 * <tt>platform:/resource/org.eclipse.ocl.examples.common/</tt> for an open project.
 * <p>
 * {@link #getProjectMap()} returns a map of project names, but not bundle names, to resolvable location.
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
 * 
 *<h4>Standalone Environment</h4>
 *
 * A resolvable location is a physical location such as
 * <tt>archive:file:/C:/Tools/Eclipse/3.7.1/plugins/org.antlr.runtime_3.2.0.v201101311130.jar!/</tt>
 * or <tt>file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.common/</tt>.
 * <p>
 * {@link #getProjectMap()} returns a map of project names and bundle names to a physical location
 * which is established by searching the classpath for folders and JARs containing .project files.
 * If a manifest is also found, the search has found a bundle and the Bundle-SymbolicName is read
 * from the manifest.
 * <p>
 * {@link #initializePlatformResourceMap()} populates {@link EcorePlugin#getPlatformResourceMap()}
 * with a <i>project</i> to <tt>platform:/resource/<i>project</i></tt> entry for each project
 * and a <i>bundle</i> to <tt>platform:/plugin/<i>bundle</i></tt> entry for each bundle.
 * <p>
 * {@link #initializeURIMap(URIConverter)} installs a <tt>platform:/plugin/<i>project</i></tt>
 * to <tt>platform:/resource/<i>project</i></tt> URI mapping for each project and a
 * <tt>platform:/resource/<i>bundle</i></tt> to <tt>platform:/plugin/<i>bundle</i></tt> URI mapping
 * for each bundle.
 * 
 * <h4>Static Instances and Re-Use</h4>
 * 
 * No static <tt>INSTANCE</tt> is provided because different class loaders or dynamic class path changes
 * may result in stale content. Standalone applications are strongly advised to create their own static
 * instance in a stable context and so avoid repeating the significant costs of a full class path search.
 * <p>
 * The {@link #getAdapter(ResourceSet)} method may be used to invoke {@link #initializeResourceSet(ResourceSet)}
 * if not already invoked and to install the Projectmap as a ResourceSet adapter allowing an invocation of
 * {@link #findAdapter(ResourceSet)} to find it for subsequent re-use.
 */
public class ProjectMap extends SingletonAdapterImpl
{	
	/**
	 * Return any ProjectMap already installed as an adapter on a <tt>resourceSet</tt>.
	 * Returns null if there is no such adapter. 
	 */
	public static ProjectMap findAdapter(ResourceSet resourceSet) {
		return (ProjectMap) EcoreUtil.getAdapter(resourceSet.eAdapters(), ProjectMap.class);
	}

	/**
	 * Return the ProjectMap already installed as an adapter on a <tt>resourceSet</tt>
	 * if one exists, else creates, installs, initializes and returns a new ProjectMap.  
	 */
	public static ProjectMap getAdapter(ResourceSet resourceSet) {
		ProjectMap adapter = findAdapter(resourceSet);
		if (adapter == null) {
			adapter = new ProjectMap();
			resourceSet.eAdapters().add(adapter);
			adapter.initializeResourceSet(resourceSet);
		}
		return adapter;
	}

	private Map<String, URI> projectMap = null;
	private Map<File, Exception> exceptionMap = null;
	private boolean initializedPlatformResourceMap = false;

	/**
	 * Return the resolveable URI for a given project or bundle name.
	 */
	public URI get(String projectName) {
		URI uri = getProjectMap().get(projectName);
		if ((uri == null) && EMFPlugin.IS_ECLIPSE_RUNNING) {
			uri = URI.createPlatformPluginURI("/" + projectName + "/", true);
		}
		return uri;
	}

	/**
	 * Return the mapping of problem files to exceptions, or null if not yet computed
	 * or if no exceptions thrown.
	 */
	public Map<File, Exception> getExceptionMap() {
		return exceptionMap;
	}
	
	/**
	 * Return the mapping of project name or bundle name, as defined in a manifest file to
	 * the location of that project as determined by scanning the classpath.
	 * <p>
	 * e.g. entries such as
	 * <br>org.antlr.runtime => archive:file:/C:/Tools/Eclipse/3.7.1/plugins/org.antlr.runtime_3.2.0.v201101311130.jar!/
	 * <br>org.eclipse.ocl.examples.common => file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.common/
	 * <p>
	 * Any problems arising while creating the project map are gathered into the exception map
	 * accessible using {@link #getExceptionMap()}.
	 */
	public Map<String, URI> getProjectMap() {
		if (projectMap == null) {
			projectMap = new HashMap<String, URI>();
			if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
				scanClassPath();
//				Map<String, URI> platformResourceMap = EcorePlugin.getPlatformResourceMap();
//				for (String key : getProjectMap().keySet()) {
//					URI value = projectMap.get(key);
//					platformResourceMap.put(key, value);
//				}
			}
			else {
//				scanBundles();  -- no need to scan hundreds of bundles when a single URI map entry will dandle them all. 
				scanProjects();
			}
//			System.out.println(toString());
		}
		return projectMap;
	}
	
	/**
	 * Initialize the {@link EcorePlugin#getPlatformResourceMap()} so that in a standalone environment and in
	 * conjunction with {@link initializeURIMap(URIConverter)} URIs such as <tt>platform:/resource/<i>project</i></tt>
	 * and <tt>platform:/plugin/<i>project</i></tt> are useable.
	 * <p>
	 * Initialization is only necessary once and for a standalone environment. If <tt>force</tt> is true a
	 * re-initialization or plugin initialization may be forced.
	 */
	public Map<String, URI> initializePlatformResourceMap(boolean force) {
		if (force || (!initializedPlatformResourceMap && !EMFPlugin.IS_ECLIPSE_RUNNING)) {
			initializedPlatformResourceMap = true;
			Map<String, URI> platformResourceMap = EcorePlugin.getPlatformResourceMap();
			Map<String, URI> projectMap = getProjectMap();
			for (String key : projectMap.keySet()) {
				URI value = projectMap.get(key);
				platformResourceMap.put(key, value);
			}
		}
		return projectMap;
	}
	
	/**
	 * Ensure that both the {@link EcorePlugin#getPlatformResourceMap()} and {@link ResourceSet#getURIConverter()}
 	 * are initialized so that <tt>platform:/resource/<i>project</i></tt>
	 * and <tt>platform:/plugin/<i>project</i></tt> are useable..
	 */
	public void initializeResourceSet(ResourceSet resourceSet) {
		initializePlatformResourceMap(false);
		initializeURIMap(resourceSet.getURIConverter());
	}

	/**
	 * Initialize the uriMap of a uriConverter so that each of <tt>platform:/resource/<i>project</i></tt>
	 * and <tt>platform:/plugin/<i>project</i></tt> resolve the workspace project resource else the
	 * plugin bundle for use in either standalone or plugin environment.
	 * <p>
	 * Note that in a plugin environment, a single <tt>platform:/resource/</tt> to <tt>platform:/plugin/</tt>
	 * mapping is sufficient since <tt>platform:/plugin/</tt> is directly resolveable by the Eclipse Platform.
	 */
	public void initializeURIMap(URIConverter uriConverter) {
		Map<String, URI> projectMap = getProjectMap();
		Map<URI, URI> uriMap = uriConverter.getURIMap();
		for (String key : projectMap.keySet()) {
			URI value = projectMap.get(key);
			String projectKey = "/" + key + "/";
			if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
				URI resourceURI = URI.createPlatformResourceURI(projectKey, true);
				URI pluginURI = URI.createPlatformPluginURI(projectKey, true);
				if (value.toString().endsWith("jar!/")) {
					uriMap.put(resourceURI, pluginURI);
				}
				else {
					uriMap.put(pluginURI, resourceURI);
				}
			}
			else {
				if (value.isPlatformResource()) {
					URI resourceURI = value;
					URI pluginURI = URI.createPlatformPluginURI(projectKey, true);
					uriMap.put(resourceURI, resourceURI);
					uriMap.put(pluginURI, resourceURI);
				}
			}
		}
		if (EMFPlugin.IS_ECLIPSE_RUNNING) {
			URI resourceURI = URI.createPlatformResourceURI("/", true);
			URI pluginURI = URI.createPlatformPluginURI("/", true);
			uriMap.put(resourceURI, pluginURI);
		}
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == ProjectMap.class;
	}

	protected void logException(File file, Exception e) {
		if (exceptionMap == null) {
			exceptionMap = new HashMap<File, Exception>();
		}
		exceptionMap.put(file, e);
	}

	protected void registerBundle(File file) {
		try {
			JarFile jarFile = new JarFile(file);
			Manifest manifest = jarFile.getManifest();
			if (manifest==null)
				return;
			String name = manifest.getMainAttributes().getValue("Bundle-SymbolicName");
			if (name != null) {
				final int indexOf = name.indexOf(';');
				if (indexOf>0) 
					name = name.substring(0, indexOf);
				if (projectMap.containsKey(name))
					return;
				String path = "archive:"+file.toURI() + "!/";
				URI uri = URI.createURI(path);
				projectMap.put(name, uri);
			}
		}
		catch (ZipException e) {
			logException(file, new WrappedException("Could not open Jar file "+file.getAbsolutePath()+".", e));
		}
		catch (Exception e) {
			logException(file, e);
		}

	}

	protected void registerProject(File file) {
		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
					.parse(new FileInputStream(file));
			String name = document.getDocumentElement().getElementsByTagName("name").item(0).getTextContent();

			URI uri = URI.createFileURI(file.getParentFile().getCanonicalPath() + File.separator);
			projectMap.put(name, uri);
		}
		catch (Exception e) {
			logException(file, new WrappedException("Couldn't read " + file, e));
		}
	}

/*	protected void scanBundles() {
		for (IBundleGroupProvider bundleGroupProvider : Platform.getBundleGroupProviders()) {
			for (IBundleGroup bundleGroup : bundleGroupProvider.getBundleGroups()) {
				for (Bundle bundle : bundleGroup.getBundles()) {
					String bundleName = bundle.getSymbolicName();
					String projectKey = "/" + bundleName + "/";
					projectMap.put(bundleName, URI.createPlatformPluginURI(projectKey, true));
				}				
			}
		}
	} */

	protected void scanClassPath() {
		String property = System.getProperty("java.class.path");
		String separator = System.getProperty("path.separator");
		if (property!=null) {
			String[] entries = property.split(separator);
			for (String entry : entries) {
				File fileEntry = new File(entry);
				try {
					File f = fileEntry.getCanonicalFile();
					if (f.getPath().endsWith(".jar")) {
						registerBundle(f);
					} else if (!scanFolder(f, new HashSet<String>())) {
						// eclipse bin folder?
						File dotProject = new File(f.getParentFile(), ".project");
						if (dotProject.exists())
							registerProject(dotProject);
					}
				}
				catch (Exception e) {
					logException(fileEntry, e);
				}
			}
		}
	}

	protected boolean scanFolder(File f, Set<String> alreadyVisited) {
		try {
			if (!alreadyVisited.add(f.getCanonicalPath()))
				return true;
		} catch (Exception e) {
			logException(f, e);
			return true;
		}
		File[] files = f.listFiles();
		boolean containsProject = false;
		File dotProject = null;
		if (files != null) {
			for (File file : files) {
				if (file.exists() && file.isDirectory() && !file.getName().startsWith(".")) {
					containsProject |= scanFolder(file, alreadyVisited);
				} else if (".project".equals(file.getName())) {
					dotProject = file;
				} else if (file.getName().endsWith(".jar")) {
					registerBundle(file);
				}
			}
		}
		if (!containsProject && dotProject != null)
			registerProject(dotProject);
		return containsProject || dotProject != null;
	}

	protected void scanProjects() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IProject project : root.getProjects()) {
			String projectName = project.getName();
			String projectKey = "/" + projectName + "/";
			projectMap.put(projectName, URI.createPlatformResourceURI(projectKey, true));
		}
	}
	
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		if (projectMap != null) {
			List<String> keys = new ArrayList<String>(projectMap.keySet());
			Collections.sort(keys);
			for (String key : keys) {
				if (s.length() > 0) {
					s.append("\n");
				}
				s.append(key);
				s.append(" => ");
				s.append(projectMap.get(key));
			}
		}
		return s.toString();
	}
}
