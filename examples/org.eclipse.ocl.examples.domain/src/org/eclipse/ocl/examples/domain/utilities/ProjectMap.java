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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.w3c.dom.Document;

/**
 * StandaloneUtil provides facilities to assist in using plugin resources
 * in a standalone environment.
 * 
 * Much of the functionality is copied rather than referenced from
 * org.eclipse.emf.mwe.utils.StandaloneSetup in order to avoid an MWE dependency.
 */
public class ProjectMap
{	
	private Map<String, URI> projectMap = null;
	private Map<File, Exception> exceptionMap = null;

	/**
	 * Return the mapping of problem files to exception, or null if not yet computed
	 * or if no exceptions thrown.
	 */
	public Map<File, Exception> getExceptionMap() {
		return exceptionMap;
	}
	
	/**
	 * Return the mapping of project name, as defined in a manifest file to
	 * the location of that project as determined by scanning the classpath.
	 * 
	 * e.g. entries such as
	 * org.antlr.runtime => archive:file:/C:/Tools/Eclipse/3.7.1/plugins/org.antlr.runtime_3.2.0.v201101311130.jar!/
	 * org.eclipse.ocl.examples.common => file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.common/
	 * 
	 * The returned map is suitable for installation in EcorePlugin.getPlatformResourceMap().
	 */
	public Map<String, URI> getProjectMap() {
		if (projectMap == null) {
			projectMap = new HashMap<String, URI>();
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
		return projectMap;
	}
	
	public void initializeResourceSet(ResourceSet resourceSet) {
		Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
		Map<String, URI> platformResourceMap = EcorePlugin.getPlatformResourceMap();
		for (String key : getProjectMap().keySet()) {
			URI value = projectMap.get(key);
			platformResourceMap.put(key, value);
			String projectKey = "/" + key + "/";
			URI resourceURI = URI.createPlatformResourceURI(projectKey, true);
			URI pluginURI = URI.createPlatformPluginURI(projectKey, true);
			if (value.toString().endsWith("jar!/")) {
				uriMap.put(resourceURI, pluginURI);
			}
			else {
				uriMap.put(pluginURI, resourceURI);
			}
		}
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
