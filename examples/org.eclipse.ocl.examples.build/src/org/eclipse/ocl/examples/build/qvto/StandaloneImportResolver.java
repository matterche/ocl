/*******************************************************************************
 * Copyright (c) 2007,2012 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     E.D.Willink - revision to support Standalone usage
 *******************************************************************************/
package org.eclipse.ocl.examples.build.qvto;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.internal.qvt.oml.common.io.CFile;
import org.eclipse.m2m.internal.qvt.oml.common.io.CFolder;
import org.eclipse.m2m.internal.qvt.oml.common.io.eclipse.BundleFile;
import org.eclipse.m2m.internal.qvt.oml.common.io.eclipse.BundleModuleRegistry;
import org.eclipse.m2m.internal.qvt.oml.compiler.BlackboxUnitResolver;
import org.eclipse.m2m.internal.qvt.oml.compiler.DelegatingUnitResolver;
import org.eclipse.m2m.internal.qvt.oml.compiler.LegacyResolverSupport;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitContents;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProvider;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolver;

@SuppressWarnings("restriction")
public class StandaloneImportResolver extends DelegatingUnitResolver implements LegacyResolverSupport
{		
	
/**
 * A single instance registry including all bundles with registered QVT
 * modules in the platform.
 */
public static StandaloneImportResolver INSTANCE = new StandaloneImportResolver(createModulesRegistry());
	
private List<BundleModuleRegistry> bundleModules;

/**
 * Constructs resolver based on the given list of bundle registries.
 * 
 * @param bundleRegistryList
 *            a list registries of QVT module files per installed bundle
 */
protected StandaloneImportResolver(List<BundleModuleRegistry> bundleRegistryList) {
	if(bundleRegistryList == null) {
		throw new IllegalArgumentException();
	}
	bundleModules = bundleRegistryList;
	setParent(BlackboxUnitResolver.DEFAULT);
}

protected List<BundleModuleRegistry> getBundleModules() {
	return bundleModules;
}

public String getPackageName(CFolder folder) {
	if(folder == null) {
		return ""; //$NON-NLS-1$
	}
	return folder.getFullPath().replace('\\', '/').replace('/', '.');
}

public CFile resolveImport(String importedUnitName) {
	if(importedUnitName == null || importedUnitName.length() == 0) {
		return null;
	}
	
	IPath fullPath = new Path(importedUnitName.replace('.', '/') + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT);
	
	for (BundleModuleRegistry nextRegistry : bundleModules) {
		if (importedUnitName.indexOf(nextRegistry.getBundleSymbolicName()) == 1) {
			fullPath = new Path(importedUnitName.substring(nextRegistry.getBundleSymbolicName().length()+2));
		}
		else if (importedUnitName.startsWith("/")) { //$NON-NLS-1$
			fullPath = new Path(importedUnitName.substring(1).replace('.', '/') + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT);
		}
		if (nextRegistry.fileExists(fullPath)) {
			return new BundleFile(fullPath, nextRegistry);
		}
	}

	return resolveResourcePluginPath(importedUnitName);
}

public CFile resolveImport(CFile parentFile, String importedUnitName) {
	if (parentFile == null) {
		return resolveImport(importedUnitName);
	}
	String importedFileName = importedUnitName.replace('.', '/') + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT;
	URI uri = URI.createURI(parentFile.toString()).trimFileExtension().trimSegments(1);
	CFile resolvedFile = null;
	while (resolvedFile == null) {
		String resolvedImportName = uri.toPlatformString(true) + '/' + importedFileName;
		resolvedFile = resolveImport(resolvedImportName);
		if (resolvedFile != null) {
			InputStream contents = null;
			try {
				contents = resolvedFile.getContents();
				if (contents.available() == 0) {
					resolvedFile = null;
				}
			} catch (Exception e) {
				resolvedFile = null;
			}
		}
		if (resolvedFile == null) {
			if (uri.segmentCount() > 1) {
				uri = uri.trimSegments(1);
			}
			else {
				break;
			}
		}
	}
	return resolvedFile;
}

private CFile resolveResourcePluginPath(String importedUnitName) {
	try {
		URI uri = URI.createURI(importedUnitName);
		String[] segments = uri.segments();
		if (segments.length > 0 
				&& Platform.getBundle(segments[0]) != null 
				&& MDAConstants.QVTO_FILE_EXTENSION.equals(uri.fileExtension())) {
			URI pathUri = URI.createURI(""); //$NON-NLS-1$
			for (int i = 1; i < segments.length; ++i) {
				pathUri = pathUri.appendSegment(segments[i]);
			}
			IPath ipath = new Path(pathUri.toFileString());
			BundleModuleRegistry newBundle = new BundleModuleRegistry(segments[0], Collections.singletonList(ipath));
			bundleModules.add(newBundle);
			return new BundleFile(ipath, newBundle);
		}
	}
	catch (Exception e) {
	}
	return null;
}

private static List<BundleModuleRegistry> createModulesRegistry() {
	// collect transformation plugins
    final Map<String, List<IPath>> allQvtFilesMap = new HashMap<String, List<IPath>>();
	
    List<BundleModuleRegistry> registryEntries = new ArrayList<BundleModuleRegistry>();
    for (String nextID : allQvtFilesMap.keySet()) {
		List<IPath> qvtFiles = allQvtFilesMap.get(nextID);
		registryEntries.add(new BundleModuleRegistry(nextID, qvtFiles));
	}
    return registryEntries;
}

// Unit resolver interface
public void acceptVisitor(UnitProvider.UnitVisitor visitor, String scopeQualifiedName, int depth, boolean includeExternal) {
	throw new UnsupportedOperationException();		
}

@Override
protected UnitProxy doResolveUnit(String qualifiedName) {
	CFile resolved = resolveImport(qualifiedName);
	if(resolved == null) {
		return null;
	}
	
	BundleFile bundleFile = (BundleFile) resolved;
	return createUnit(qualifiedName, createBundFileURI(bundleFile));
}

public UnitProxy resolveDeployedUnitOnly(String qualifiedName) {
	return doResolveUnit(qualifiedName);
}

/**
 * Legacy support for imports from deployed transformations
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=240192
 * <p>
 * The logic has been taken from {@link #resolveImport(CFile, String)}
 */
public UnitProxy resolveUnit(UnitProxy fromUnit, String qualifiedName) {
	ExtensibleURIConverterImpl uriConverter = new ExtensibleURIConverterImpl();		
	URI parentURI = fromUnit.getURI().trimSegments(1);
	
	IPath path = new Path(parentURI.toPlatformString(true)).append(qualifiedName.replace('.', '/'));
	URI uri = URI.createPlatformPluginURI(path.toString(), false).appendFileExtension(MDAConstants.QVTO_FILE_EXTENSION);
	
	while (uri.segmentCount() > 1) {
		if(!uriConverter.exists(uri, Collections.emptyMap())) {
			if (uri.segmentCount() > 1) {
				uri = uri.trimSegments(1);
			} else {
				break;
			}
		} else {
			return createUnit(qualifiedName, uri);
		}
	}
	
	return null;
}

private static URI createBundFileURI(BundleFile bundleFile) {
	return URI.createPlatformPluginURI(bundleFile.getBundleSymbolicName() + "/" + //$NON-NLS-1$ 
			bundleFile.getFullPath(), false);
}

public UnitProxy createUnit(final String qualifiedName, final URI uri) { 
	String name = uri.trimFileExtension().lastSegment();
	String namespace = null;

	if(qualifiedName.length() > name.length()) {
		namespace = qualifiedName.substring(0, qualifiedName.length() - name.length() - 1);
	}
	
	return new UnitProxy(namespace, name, uri) {
		@Override
		public int getContentType() {				
			return UnitProxy.TYPE_CST_STREAM;
		}
		
		@Override
		public UnitResolver getResolver() {
			return StandaloneImportResolver.this;
		}
		
		@Override
		public UnitContents getContents() throws IOException {				
			return new UnitContents.CSTContents() {					
				public Reader getContents() throws IOException {
					return new InputStreamReader(new ExtensibleURIConverterImpl()
						.createInputStream(uri), ResourcesPlugin.getEncoding());
				}
			};
		}
	};
}

}
