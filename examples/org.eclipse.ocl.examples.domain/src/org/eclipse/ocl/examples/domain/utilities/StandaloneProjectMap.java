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
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.notify.impl.SingletonAdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * StandaloneProjectMap and {@link ProjectMap} provides facilities to assist in preparing the {@link URIConverter} and
 * the {@link EPackage.Registry} of a {@link ResourceSet} and the global 
 *  and {@link EcorePlugin#getPlatformResourceMap()} and {@link EcorePlugin#getEPackageNsURIToGenModelLocationMap}
 *  to support arbitrary and compatible use of
 * <tt>platform:/plugin</tt>, <tt>platform:/resource</tt> and registered URIs in both plugin and standalone environments.
 *<p>
 * StandaloneProjectMap supports only standalone usage and so is free of dependencies on the Eclipse platform.
 * ProjectMap extends StandaloneProjectMap to provide polymorphic standalone and plugin environments.
 *<p>
 * As a result, when the current file context is my.project/model/MyModel.ecore, and when the classpath
 * contains only the JAR version of Ecore, referencing a resource as any or all of
 * <ul>
 * <li>http://www.eclipse.org/emf/2002/Ecore</li>
 * <li>platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore</li>
 * <li>platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore</li>
 * <li>../../org.eclipse.emf.ecore/model/Ecore.ecore</li>
 * </ul>
 * results in the same Resource being returned by {@link ResourceSet.getResource()}.
 *<p>
 * If the classpath contains distinct imported project and JAR versions of Ecore, referencing
 * <ul>
 * <li>http://www.eclipse.org/emf/2002/Ecore</li>
 * </ul>
 * returns the JAR plugin version while referencing
 * <ul>
 * <li>platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore</li>
 * <li>platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore</li>
 * <li>../../org.eclipse.emf.ecore/model/Ecore.ecore</li>
 * </ul>
 * returns the imported project version.
 *<p> 
 * A ProjectMap consists of a map from a project or bundle name to a location that is
 * resolvable by the conventional Platform URL stream opening capabilities. Utility methods
 * support export of the map to initialize the URIMap in a {@link URIConverter} and/or the
 * {@link EcorePlugin#getPlatformResourceMap()}.
 * <p>
 * Minimal usage to configure <tt>aResourceSet</tt> is just
 * <br><tt>new ProjectMap().initializeResourceSet(aResourceSet);</tt>
 * <br> or <tt>ProjectMap.getAdapter(aResourceSet);</tt>
 * <br>Thereafter EMF accesses to projects and bundles should just work.
 * 
 *<h4>Standalone Environment</h4>
 *
 * A resolvable location is a physical location such as
 * <ul>
 * <li><tt>archive:file:/C:/Tools/Eclipse/3.7.1/plugins/org.antlr.runtime_3.2.0.v201101311130.jar!/</tt></li>
 * <li><tt>file:/C:/GIT/org.eclipse.ocl/examples/org.eclipse.ocl.examples.common/</tt></li>
 * </ul>
 * <p>
 * {@link #getProjectMap()} returns a map of project names and bundle names to a physical location
 * which is established by searching the classpath for folders and JARs containing .project files.
 * If a manifest is also found, the search has found a bundle and the Bundle-SymbolicName is read
 * from the manifest.
 * <p>
 * {@link #initializePackageRegistry(ResourceSet)} populates a trio of registrations for each
 * <tt>genPackages.ecorePackage</tt> referenced from a <tt>genmodel</tt> referenced
 * from a <tt>org.eclipse.emf.ecore.generated_package</tt>
 * defined in any <tt>plugin.xml</tt> found on the classpath. The three declarations ensure that
 * when appropriate, each of the namespace URI (e.g. <tt>http://www.eclipse.org/emf/2002/Ecore</tt>),
 * the project URI (e.g. <tt>platform:/resource/org.eclipse.emf.ecore/model/Ecore.ecore</tt>) and the plugin URI
 * (e.g. <tt>platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore</tt>)
 * resolve to the same Resource eliminating most opportunities for meta-model schizophrenia.
 * <p>
 * {@link #initializePlatformResourceMap()} populates {@link EcorePlugin#getPlatformResourceMap()}
 * with a <i>project</i> to <tt>platform:/resource/<i>project</i></tt> entry for each project
 * and a <i>bundle</i> to <tt>platform:/plugin/<i>bundle</i></tt> entry for each bundle.
 * <p>
 * {@link #initializeGenModelLocationMap(ResourceSet)} exploits the classpath scan for plugins and projects
 * to identify all plugin.xml files and populate the {@link EcorePlugin#getEPackageNsURIToGenModelLocationMap()}
 * from the <tt>org.eclipse.emf.ecore.generated_package</tt> extension points in the same way as occurs
 * automatically in a plugin environment.
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
 * if not already invoked and to install the ProjectMap as a ResourceSet adapter allowing an invocation of
 * {@link #findAdapter(ResourceSet)} to find it for subsequent re-use.
 */
public class StandaloneProjectMap extends SingletonAdapterImpl
{	
	/**
	 * An IPackageDescriptor describes the modeling capabilities of a known model package and may be installed under
	 * av variety of synonyms in an EPackage.Registry to map multiple URIs to a single EPackage.
	 */
	public static interface IPackageDescriptor extends EPackage.Descriptor
	{		
		public static interface Internal extends IPackageDescriptor
		{
			/**
			 * Internal callback from Ecore model pre-parse to register the Ecore Package URI.
			 */
			void addEcorePackage(String ecorePackage);
			/**
			 * Internal preparation for Ecore model pre-parse.
			 */
			GenModelEcorePackageHandler createGenModelEcorePackageHandler();
			/**
			 * Internal partial configuration.
			 */
			void setClassName(String className);
		}
		/**
		 * Return the project relative Ecore Model URI.
		 */
		URI getEcoreModelURI();
		/**
		 * Return the project relative Gen Model URI.
		 */
		URI getGenModelURI();
		/**
		 * Return the Package NS URI.
		 */
		URI getNsURI();
		/**
		 * Return the Project Descriptor containing this package.
		 */
		IProjectDescriptor getProjectDescriptor();
		/**
		 * Configure the package registry to load the Ecore Model rather than the Java Class.
		 */
		void setUseModel(boolean useModel, EPackage.Registry packageRegistry);
		/**
		 * Configure the package registry to load the Java Class for the package URI, and the Ecore model
		 * for the platform:/* accesses.
		 */
		void setUseModelAndPackage(final EPackage ePackage, EPackage.Registry packageRegistry);
		/**
		 * Configure the package registry to use the provided EPackage rather than the Java Class.
		 */
		void setUsePackage(EPackage ePackage, EPackage.Registry packageRegistry);
		/**
		 * Unload the package registry to force a reload.
		 */
		void unload(EPackage.Registry packageRegistry);		
	}

	/**
	 * An IProjectDescriptor describes the capabilities of a project.
	 */
	public static interface IProjectDescriptor
	{
		public static interface Internal extends IProjectDescriptor
		{
			/**
			 * Internal callback from Ecore model pre-parse to register the Ecore Package URI.
			 */
			IPackageDescriptor.Internal createPackageDescriptor(URI nsURI, URI deresolve);
		}
		/**
		 * Return the physical location of this project.
		 */
		URI getLocationURI();
		/**
		 * Return the physical location of a projectRelativeFileName as a URI.
		 */
		URI getLocationURI(String projectRelativeFileName);
		/**
		 * Return the physical location of a projectRelativeFileName as a File.
		 */
		File getLocationFile(String projectRelativeFileName);
		/**
		 * Return the location of this project as a platform:/plugin URI.
		 */
		URI getPlatformPluginURI();
		/**
		 * Return the location of a projectRelativeFileName as a platform:/resource URI.
		 */
		URI getPlatformPluginURI(String projectRelativeFileName);
		/**
		 * Return the location of this project as a platform:/resource URI.
		 */
		URI getPlatformResourceURI();
		/**
		 * Return the location of a projectRelativeFileName as a platform:/resource URI.
		 */
		URI getPlatformResourceURI(String projectRelativeFileName);
		/**
		 * Return the package descriptor for the package with a given nsURI or null if none known in the project.
		 */
		IPackageDescriptor getPackageDescriptor(URI nsURI);
		/**
		 * Return all package descriptor in the project.
		 */
		Collection<IPackageDescriptor> getPackageDescriptors();
		void initializeGenModelLocationMap();
		void initializePackageRegistration(EPackage.Registry packageRegistry, IPackageDescriptor packageDescriptor);
		void initializePlatformResourceMap();
		void initializeURIMap(Map<URI, URI> uriMap);
		public void useModelsAndPackages(Resource ecoreResource);
		/**
		 * Treat any top level packages in ecoreResource as preloaded packages for use by corresponding URIs
		 * in this project.
		 */
		public void usePackages(Resource ecoreResource);
	}
	
	/**
	 * PackageDescriptor supports lazy class loading and initialization of a compiled Ecore package. Class loading
	 * occurs in the context of the ProjectMap, which performs classpath scans, so it is assumed that everything is
	 * visible. Re-use in a larger context may require a new ProjectMap to be created.
	 * 
	 * If a PackageDescriptor is installed under multiple URIs, the resource created by the first load is shared by
	 * all subsequent resolutions.
	 * 
	 * If a PackageDescriptor is set to useModel, the *.ecore file is loaded to provide the EPackage, rather than
	 * the Java className.
	 */
	public static final class PackageDescriptor implements IPackageDescriptor.Internal
	{
		protected final IProjectDescriptor projectDescriptor;
		protected final URI nsURI;
		protected final URI genModelURI;
		protected String className = null;
		private URI ecorePackageURI = null;
		private boolean useModel = false;
		private EPackage ePackage = null;

		public PackageDescriptor(IProjectDescriptor projectDescriptor, URI nsURI, URI genModelURI) {
			this.projectDescriptor = projectDescriptor;
			this.nsURI = nsURI;
			this.genModelURI = genModelURI;
		}

		public void addEcorePackage(String ecorePackage) {
			URI uri = URI.createURI(ecorePackage);
			URI locationURI = projectDescriptor.getLocationURI();
			URI absoluteGenModelURI = genModelURI.resolve(locationURI);
			URI absolutePackageURI = uri.resolve(absoluteGenModelURI);
			ecorePackageURI = absolutePackageURI.deresolve(locationURI, true, true, true);
//			System.out.println(nsURI + " = " + ecorePackage + " : " + className);
		}

		public GenModelEcorePackageHandler createGenModelEcorePackageHandler() {
			return new GenModelEcorePackageHandler(this);
		}

		public EFactory getEFactory() {
			return null;
		}

		public EPackage getEPackage() {
			if (ePackage == null) {
				if (useModel) {
					URI uri = ecorePackageURI.resolve(projectDescriptor.getLocationURI());
					ResourceSet resourceSet = new ResourceSetImpl();
					ePackage = (EPackage) resourceSet.getEObject(uri, true);
					EcoreUtil.resolveAll(resourceSet);
					resourceSet.getResources().clear();
				}
				else if (className != null) {
					try {
						Class<?> javaClass = Class.forName(className);
						Field field = javaClass.getField("eINSTANCE");
						ePackage = (EPackage) field.get(null);
					} catch (ClassNotFoundException e) {
						throw new WrappedException(e);
					} catch (IllegalAccessException e) {
						throw new WrappedException(e);
					} catch (NoSuchFieldException e) {
						throw new WrappedException(e);
					}
				}
				else {
					Object object = EPackage.Registry.INSTANCE.get(nsURI.toString());
					if (object instanceof EPackage) {
						ePackage = (EPackage) object;
					}
					else if (object instanceof EPackage.Descriptor) {
						ePackage = ((EPackage.Descriptor) object).getEPackage();
					}
				}
			}
//	    	System.out.println("GetEPackage " + nsURI);
//			System.out.println(DomainUtil.debugSimpleName(this) + " " + nsURI + " " + DomainUtil.debugSimpleName(ePackage));
			return ePackage;
		}

		public URI getEcoreModelURI() {
			return ecorePackageURI != null ? ecorePackageURI.trimFragment() : null;
		}

		public URI getGenModelURI() {
			return genModelURI;
		}

		public URI getNsURI() {
			return nsURI;
		}

		public IProjectDescriptor getProjectDescriptor() {
			return projectDescriptor;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public void setUseModel(boolean useModel, EPackage.Registry packageRegistry) {
			if (packageRegistry == null) {
				packageRegistry = getPackageRegistry(null);
//				System.out.println(DomainUtil.debugSimpleName(this) + " Use model " + useModel + " for " + nsURI + " in global " + DomainUtil.debugSimpleName(packageRegistry));
			}
//			else {
//				System.out.println(DomainUtil.debugSimpleName(this) + " Use model " + useModel + " for " + nsURI + " in " + DomainUtil.debugSimpleName(packageRegistry));
//			}
			this.useModel = useModel;
			String nsURIString = nsURI.toString();
			if (packageRegistry.get(nsURIString) != this) {
				packageRegistry.put(nsURIString, this);
			}
			URI resourceURI = projectDescriptor.getPlatformResourceURI();
			URI pluginURI = projectDescriptor.getPlatformPluginURI();
			URI ecoreURI = ecorePackageURI.trimFragment();
			String ecorePackageResourceURIString = ecoreURI.resolve(resourceURI).toString();
			String ecorePackagePluginURIString = ecoreURI.resolve(pluginURI).toString();
			if (packageRegistry.get(ecorePackageResourceURIString) != this) {
				packageRegistry.put(ecorePackageResourceURIString, this);
			}
			if (packageRegistry.get(ecorePackagePluginURIString) != this) {
				packageRegistry.put(ecorePackagePluginURIString, this);
			}
		}

		public void setUseModelAndPackage(final EPackage ePackage, EPackage.Registry packageRegistry) {
			if (packageRegistry == null) {
				packageRegistry = getPackageRegistry(null);
//				System.out.println(DomainUtil.debugSimpleName(this) + " Use distinct model and package for " + nsURI + " in global " + DomainUtil.debugSimpleName(packageRegistry));
			}
//			else {
//				System.out.println(DomainUtil.debugSimpleName(this) + " Use distinct model and package for " + nsURI + " in " + DomainUtil.debugSimpleName(packageRegistry));
//			}
			this.ePackage = null;
			this.useModel = true;
			String nsURIString = nsURI.toString();
			packageRegistry.put(nsURIString, new EPackage.Descriptor()
			{
				public EPackage getEPackage() {
//					System.out.println(DomainUtil.debugSimpleName(this) + " " + nsURI + " " + DomainUtil.debugSimpleName(ePackage));
					return ePackage;
				}

				public EFactory getEFactory() {
					return null;
				}
			});
			URI resourceURI = projectDescriptor.getPlatformResourceURI();
			URI pluginURI = projectDescriptor.getPlatformPluginURI();
			URI ecoreURI = ecorePackageURI.trimFragment();
			String ecorePackageResourceURIString = ecoreURI.resolve(resourceURI).toString();
			String ecorePackagePluginURIString = ecoreURI.resolve(pluginURI).toString();
			if (packageRegistry.get(ecorePackageResourceURIString) != this) {
				packageRegistry.put(ecorePackageResourceURIString, this);
			}
			if (packageRegistry.get(ecorePackagePluginURIString) != this) {
				packageRegistry.put(ecorePackagePluginURIString, this);
			}
		}

		public void setUsePackage(EPackage ePackage, EPackage.Registry packageRegistry) {
			if (packageRegistry == null) {
				packageRegistry = getPackageRegistry(null);
//				System.out.println(DomainUtil.debugSimpleName(this) + " Use package for " + nsURI + " in global " + DomainUtil.debugSimpleName(packageRegistry));
			}
//			else {
//				System.out.println(DomainUtil.debugSimpleName(this) + " Use package for " + nsURI + " in " + DomainUtil.debugSimpleName(packageRegistry));
//			}
			this.ePackage = ePackage;
			this.useModel = false;
			String nsURIString = nsURI.toString();
			if (packageRegistry.get(nsURIString) != this) {
				packageRegistry.put(nsURIString, this);
			}
			URI resourceURI = projectDescriptor.getPlatformResourceURI();
			URI pluginURI = projectDescriptor.getPlatformPluginURI();
			URI ecoreURI = ecorePackageURI.trimFragment();
			String ecorePackageResourceURIString = ecoreURI.resolve(resourceURI).toString();
			String ecorePackagePluginURIString = ecoreURI.resolve(pluginURI).toString();
			if (packageRegistry.get(ecorePackageResourceURIString) != this) {
				packageRegistry.put(ecorePackageResourceURIString, this);
			}
			if (packageRegistry.get(ecorePackagePluginURIString) != this) {
				packageRegistry.put(ecorePackagePluginURIString, this);
			}
		}

		@Override
		public String toString() {
			StringBuilder s = new StringBuilder();
			s.append(nsURI);
			s.append(" => ");
			s.append(className);
			if (genModelURI != null) {
				s.append(", ");
				s.append(genModelURI);
			}
			if (ecorePackageURI != null) {
				s.append(", ");
				s.append(ecorePackageURI);
			}
			return s.toString();
		}

		public void unload(EPackage.Registry packageRegistry) {
			ePackage = null;
			packageRegistry.put(nsURI.toString(), this);
			URI resourceURI = projectDescriptor.getPlatformResourceURI();
			URI pluginURI = projectDescriptor.getPlatformPluginURI();
			URI ecoreURI = ecorePackageURI.trimFragment();
			packageRegistry.put(ecoreURI.resolve(resourceURI).toString(), this);
			packageRegistry.put(ecoreURI.resolve(pluginURI).toString(), this);
		}
	}

	/**
	 * PluginGenModelHandler provides the SAX callbacks to support reading the org.eclipse.emf.ecore.generated_package
	 * extension point in a plugin.xml file and activating the GenModelEcorePackageHandler to process the ecorePackage
	 * locations and invoking {@link addGenModel()} for each encounter.
	 */
	protected class PluginGenModelHandler extends DefaultHandler
	{
		public static final String pluginTag = "plugin";
		public static final String extensionTag = "extension";
		public static final String pointTag = "point";
		public static final String packageTag = "package";
		
		public static final String extensionPointAttribute = "org.eclipse.emf.ecore.generated_package";
		public static final String uriAttribute = "uri";
		public static final String classAttribute = "class";
		public static final String genModelAttribute = "genModel";
		
		protected final JarFile jarFile;
		protected final IProjectDescriptor.Internal projectDescriptor;
		private int pluginCount = 0;
		private int extensionCount = 0;
		private boolean inPoint = false;
		private int packageCount = 0;
		private Map<String, GenModelEcorePackageHandler> genModelEcorePackageHandlers = new HashMap<String, GenModelEcorePackageHandler>();
		
		public PluginGenModelHandler(IProjectDescriptor.Internal projectDescriptor) {
			this.jarFile = null;
			this.projectDescriptor = projectDescriptor;
		}

		public PluginGenModelHandler(JarFile jarFile, IProjectDescriptor.Internal projectDescriptor) {
			this.jarFile = jarFile;
			this.projectDescriptor = projectDescriptor;
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			if (pluginCount == 1) {
				if (pluginTag.equals(qName)) {
					pluginCount--;
				}
				if (extensionCount == 1) {
					if (extensionTag.equals(qName)) {
						extensionCount--;
					}
					if (packageCount == 1) {
						if (packageTag.equals(qName)) {
							packageCount--;
						}
					}
				}
			}
		}

		public void scanContents(SAXParser saxParser) throws SAXParseException {
			for (String genModel : genModelEcorePackageHandlers.keySet()) {
				GenModelEcorePackageHandler genModelEcorePackageHandler = genModelEcorePackageHandlers.get(genModel);
				URI locationURI = projectDescriptor.getLocationURI();
				URI genModelURI = URI.createURI(genModel).resolve(locationURI);
				InputStream inputStream = null;
				try {
					if (jarFile != null) {
						ZipEntry entry = jarFile.getEntry(genModel);
						if (entry != null) {
							inputStream = jarFile.getInputStream(entry);
						}
					}
					else {
						inputStream = new FileInputStream(genModelURI.toString().substring(5));		// Lose file:
					}
					if (inputStream != null) {
						saxParser.parse(inputStream, genModelEcorePackageHandler);
					}
				} catch (Exception e) {
					throw new SAXParseException("Failed to parse " + locationURI, null, e);
				} finally {
					try {
						if (inputStream != null) {
							inputStream.close();
						}
					} catch (IOException e) {}
				}
			}
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) {
			if (pluginCount == 0) {
				if (pluginTag.equals(qName)) {
					pluginCount++;
				}
			}
			else if (pluginCount == 1) {
				if ((extensionCount == 0) && extensionTag.equals(qName)) {
					extensionCount++;
					inPoint = extensionPointAttribute.equals(attributes.getValue(pointTag));
				}
				else if ((extensionCount == 1) && inPoint) {
					if ((packageCount == 0) && packageTag.equals(qName)) {
						packageCount++;
						String className = attributes.getValue(classAttribute);
						URI nsURI = URI.createURI(attributes.getValue(uriAttribute));
						String genModel = attributes.getValue(genModelAttribute);
						if (genModel != null) {
							URI locationURI = projectDescriptor.getLocationURI();
							URI absoluteGenModelURI = URI.createURI(genModel).resolve(locationURI);
							URI projectGenModelURI = absoluteGenModelURI.deresolve(locationURI, true, true, true);
							IPackageDescriptor.Internal packageDescriptor = (IPackageDescriptor.Internal) projectDescriptor.getPackageDescriptor(nsURI);
							if (packageDescriptor == null) {
								packageDescriptor = projectDescriptor.createPackageDescriptor(nsURI, projectGenModelURI);
							}
							packageDescriptor.setClassName(className);
							GenModelEcorePackageHandler genModelEcorePackageHandler = packageDescriptor.createGenModelEcorePackageHandler();
							genModelEcorePackageHandlers.put(genModel, genModelEcorePackageHandler);
						}
					}
				}
			}
		}
	}
	
	/**
	 * GenModelEcorePackageHandler provides the SAX callbacks to support reading the genPackages element in a
	 * genmodel file and invoking {@link addEcorePackage()} for each encounter.
	 */
	protected static class GenModelEcorePackageHandler extends DefaultHandler
	{
		public static final String genmodelTag = "genmodel:GenModel";
		public static final String genPackagesTag = "genPackages";
		public static final String ecorePackageTag = "ecorePackage";		
		public static final String ecorePackageAttribute = "ecorePackage";
		public static final String hrefAttribute = "href";
		
		protected final IPackageDescriptor.Internal packageDescriptor;
		private int genmodelCount = 0;
		private int genPackagesCount = 0;
		private int ecorePackageCount = 0;

		public GenModelEcorePackageHandler(IPackageDescriptor.Internal packageDescriptor) {
			this.packageDescriptor = packageDescriptor;
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			if (genmodelCount == 1) {
				if (genmodelTag.equals(qName)) {
					genmodelCount--;
				}
				if (genPackagesCount == 1) {
					if (genPackagesTag.equals(qName)) {
						genPackagesCount--;
					}
					if (ecorePackageCount == 1) {
						if (ecorePackageTag.equals(qName)) {
							ecorePackageCount--;
						}
					}
				}
			}
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			if (genmodelCount == 0) {
				if (genmodelTag.equals(qName)) {
					genmodelCount++;
				}
			}
			else if (genmodelCount == 1) {
				if ((genPackagesCount == 0) && genPackagesTag.equals(qName)) {
					genPackagesCount++;
					String ecorePackage = attributes.getValue(ecorePackageAttribute);
					if (ecorePackage != null) {
						packageDescriptor.addEcorePackage(ecorePackage);
					}
				}
				else if ((genPackagesCount == 1) && ecorePackageTag.equals(qName)) {
					ecorePackageCount++;
					String ecorePackage = attributes.getValue(hrefAttribute);
					packageDescriptor.addEcorePackage(ecorePackage);
				}
			}
		}
	}

	public static class ProjectDescriptor implements IProjectDescriptor.Internal
	{
		/**
		 * The project/bundle/plugin name; e.g. "org.eclipse.emf.ecore"
		 */
		protected final String name;

		/**
		 * The resolveable location.
		 */
		protected final URI locationURI;
		
		/**
		 * Map from local Model URI to lazy EPackageDescriptor. e.g. from "model/Ecore.ecore".
		 */
		private Map<URI, IPackageDescriptor> nsURI2packageDescriptor = null;

		public ProjectDescriptor(String name, URI locationURI) {
			this.name = name;
			this.locationURI = locationURI;
		}

		public IPackageDescriptor.Internal createPackageDescriptor(URI nsURI, URI genModelURI) {
			IPackageDescriptor.Internal packageDescriptor = new PackageDescriptor(this, nsURI, genModelURI);
			if (nsURI2packageDescriptor == null) {
				nsURI2packageDescriptor = new HashMap<URI, IPackageDescriptor>();
			}
			nsURI2packageDescriptor.put(nsURI, packageDescriptor);
			return packageDescriptor;
		}

		public URI getLocationURI() {
				return locationURI;
		}

		public URI getLocationURI(String projectRelativeFileName) {
			return URI.createURI(projectRelativeFileName).resolve(locationURI);
		}

		public File getLocationFile(String projectRelativeFileName) {
			return new File(getLocationURI(projectRelativeFileName).toFileString());
		}

		public String getName() {
				return name;
		}

		public IPackageDescriptor getPackageDescriptor(URI nsURI) {
			return nsURI2packageDescriptor != null ? nsURI2packageDescriptor.get(nsURI) : null;
		}

		public Collection<IPackageDescriptor> getPackageDescriptors() {
			return nsURI2packageDescriptor != null ? nsURI2packageDescriptor.values() : null;
		}

		public URI getPlatformPluginURI() {
			return URI.createPlatformPluginURI("/" + name + "/", true);
		}

		public URI getPlatformPluginURI(String projectRelativeFileName) {
			return URI.createURI(projectRelativeFileName).resolve(getPlatformPluginURI());
		}

		public URI getPlatformResourceURI() {
			return URI.createPlatformResourceURI("/" + name + "/", true);
		}

		public URI getPlatformResourceURI(String projectRelativeFileName) {
			return URI.createURI(projectRelativeFileName).resolve(getPlatformResourceURI());
		}

		public void installEcoreModel(ResourceSet resourceSet, URI nsURI) {
			IPackageDescriptor packageDescriptor = getPackageDescriptor(nsURI);
			if (packageDescriptor != null) {
				EPackage.Registry packageRegistry = getPackageRegistry(resourceSet);
				URI ecoreModelURI = packageDescriptor.getEcoreModelURI();
				URI resourceURI = getPlatformResourceURI();
				URI pluginURI = getPlatformPluginURI();
				URI ecorePackageResourceURI = ecoreModelURI.resolve(resourceURI);
				URI ecorePackagePluginURI = ecoreModelURI.resolve(pluginURI);
				packageRegistry.remove(ecorePackageResourceURI.toString());
				packageRegistry.remove(ecorePackagePluginURI.toString());
				packageRegistry.remove(nsURI.toString());
				URI modelURI = ecoreModelURI.resolve(locationURI);
				Map<URI, URI> uriMap = getURIMap(resourceSet);
				uriMap.put(resourceURI, modelURI);
				uriMap.put(pluginURI, modelURI);
				uriMap.put(nsURI, modelURI);
			}
		}

		public void initializeGenModelLocationMap() {
			Collection<IPackageDescriptor> packageDescriptors = getPackageDescriptors();
			if (packageDescriptors != null) {
				Map<String, URI> ePackageNsURIToGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();
				for (IPackageDescriptor packageDescriptor : packageDescriptors) {
					URI nsURI = packageDescriptor.getNsURI();
					URI genModelURI = packageDescriptor.getGenModelURI();
					ePackageNsURIToGenModelLocationMap.put(nsURI.toString(), genModelURI.resolve(locationURI));
				}
			}
		}

		public void initializePackageRegistration(EPackage.Registry packageRegistry, IPackageDescriptor packageDescriptor) {
			URI ecoreModelURI = packageDescriptor.getEcoreModelURI();
			if (ecoreModelURI != null) {
				URI resourceURI = getPlatformResourceURI();
				URI pluginURI = getPlatformPluginURI();
				URI ecorePackageResourceURI = ecoreModelURI.resolve(resourceURI);
				URI ecorePackagePluginURI = ecoreModelURI.resolve(pluginURI);
				packageRegistry.put(ecorePackageResourceURI.toString(), packageDescriptor);
				packageRegistry.put(ecorePackagePluginURI.toString(), packageDescriptor);
			}
		}

		public void initializePlatformResourceMap() {
			Map<String, URI> platformResourceMap = EcorePlugin.getPlatformResourceMap();
			platformResourceMap.put(name, locationURI);
		}

		public void initializeURIMap(Map<URI, URI> uriMap) {
			URI resourceURI = getPlatformResourceURI();
			URI pluginURI = getPlatformPluginURI();
			uriMap.put(resourceURI, locationURI);
			uriMap.put(pluginURI, locationURI);
		}
		
		@Override
		public String toString() {
			return name + " => " + locationURI.toString();
		}

		public void useModelsAndPackages(Resource ecoreResource) {
			for (EObject eObject : ecoreResource.getContents()) {
				if (eObject instanceof EPackage) {
					EPackage ePackage = (EPackage)eObject;
					IPackageDescriptor packageDescriptor = getPackageDescriptor(URI.createURI(ePackage.getNsURI()));
					if (packageDescriptor != null) {
						packageDescriptor.setUseModelAndPackage(ePackage, null);
					}
				}
			}
		}

		public void usePackages(Resource ecoreResource) {
			for (EObject eObject : ecoreResource.getContents()) {
				if (eObject instanceof EPackage) {
					EPackage ePackage = (EPackage)eObject;
					IPackageDescriptor packageDescriptor = getPackageDescriptor(URI.createURI(ePackage.getNsURI()));
					if (packageDescriptor != null) {
						packageDescriptor.setUsePackage(ePackage, null);
					}
				}
			}
		}
	}
	
	/**
	 * Return any StandaloneProjectMap already installed as an adapter on a <tt>resourceSet</tt>.
	 * Returns null if there is no such adapter. 
	 */
	public static StandaloneProjectMap findAdapter(ResourceSet resourceSet) {
		return (StandaloneProjectMap) EcoreUtil.getAdapter(resourceSet.eAdapters(), StandaloneProjectMap.class);
	}

	/**
	 * Return the StandaloneProjectMap already installed as an adapter on a <tt>resourceSet</tt>
	 * if one exists, else creates, installs, initializes and returns a new StandaloneProjectMap.  
	 */
	public static StandaloneProjectMap getAdapter(ResourceSet resourceSet) {
		StandaloneProjectMap adapter = findAdapter(resourceSet);
		if (adapter == null) {
			adapter = new StandaloneProjectMap();
			resourceSet.eAdapters().add(adapter);
			adapter.initializeResourceSet(resourceSet);
		}
		return adapter;
	}

	/**
	 * Return the EPackage.Registry for a resourceSet or the Global {@link EPackage.Registry.INSTANCE} if resourceSet is null.
	 */
	public static EPackage.Registry getPackageRegistry(ResourceSet resourceSet) {
		return resourceSet != null ? resourceSet.getPackageRegistry() : EPackage.Registry.INSTANCE;
	}

	/**
	 * Return the Resource.Factory.Registry for a resourceSet or the Global {@link Resource.Factory.Registry.INSTANCE} if resourceSet is null.
	 */
	public static Resource.Factory.Registry getResourceFactoryRegistry(ResourceSet resourceSet) {
		return resourceSet != null ? resourceSet.getResourceFactoryRegistry() : Resource.Factory.Registry.INSTANCE;
	}

	/**
	 * Return the URIConverter for a resourceSet or the Global {@link URIConverter.INSTANCE} if resourceSet is null.
	 */
	public static URIConverter getURIConverter(ResourceSet resourceSet) {
		return resourceSet != null ? resourceSet.getURIConverter() : URIConverter.INSTANCE;
	}

	/**
	 * Return the URI Map for a resourceSet or the Global {@link URIConverter.URI_MAP} if resourceSet is null.
	 */
	public static Map<URI, URI> getURIMap(ResourceSet resourceSet) {
		return resourceSet != null ? resourceSet.getURIConverter().getURIMap() : URIConverter.URI_MAP;
	}

	/**
	 * Activate any ResourceSetImpl.uriResourceMap so that repeated lookups use a hash rather than linear search.
	 */
	public static void initializeURIResourceMap(ResourceSet resourceSet) {
		if (resourceSet instanceof ResourceSetImpl) {
			ResourceSetImpl resourceSetImpl = (ResourceSetImpl) resourceSet;
			Map<URI, Resource> uriResourceMap = resourceSetImpl.getURIResourceMap();
			if (uriResourceMap == null) {
				resourceSetImpl.setURIResourceMap(new HashMap<URI, Resource>());
			}
		}
	}
	
	public StandaloneProjectMap() {
		super();
	}

	/**
	 * Exceptions encountered during processing as a map from File to Exception.
	 */
	private Map<File, Exception> exceptionMap = null;

	/**
	 * The map of bundle/project name to project descriptor.
	 */
	private Map<String, IProjectDescriptor.Internal> project2descriptor = null;
	
    protected boolean initializedGenModelLocationMap = false;
    protected boolean initializedPlatformResourceMap = false;

	protected IProjectDescriptor.Internal createProjectDescriptor(String projectName, URI locationURI) {
		return new ProjectDescriptor(projectName, locationURI);
	}
	
	/**
	 * Return the IProjectDescriptor for a given project or bundle name.
	 */
	public IProjectDescriptor getProjectDescriptor(String projectName) {
		return getProjectDescriptors().get(projectName);
	}

	protected IProjectDescriptor.Internal getProjectDescriptorInternal(URI platformURI) {
		String projectName = platformURI.segment(1);
		getProjectDescriptors();
		IProjectDescriptor.Internal projectDescriptor = project2descriptor.get(projectName);
		if (projectDescriptor == null) {
			URI locationURI = platformURI.trimSegments(platformURI.segmentCount()-2).appendSegment("");
			projectDescriptor = createProjectDescriptor(projectName, locationURI);
			project2descriptor.put(projectName, projectDescriptor);
		}
		return projectDescriptor;
	}

	/**
	 * Return the mapping of problem files to exceptions, or null if not yet computed
	 * or if no exceptions thrown.
	 */
	public Map<File, Exception> getExceptionMap() {
		return exceptionMap;
	}
	
	/**
	 * Return the resolveable URI for a given project or bundle name.
	 */
	public URI getLocation(String projectName) {
		IProjectDescriptor projectDescriptor = getProjectDescriptors().get(projectName);
		if (projectDescriptor == null) {
			return null;
		}
		return projectDescriptor.getLocationURI();
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
	 * accessible using {@link #getExceptionMap()}. An overall problem may be attributed to the null file.
	 */
	protected Map<String, ? extends IProjectDescriptor> getProjectDescriptors() {
		if (project2descriptor == null) {
			project2descriptor = new HashMap<String, IProjectDescriptor.Internal>();
			SAXParserFactory factory = SAXParserFactory.newInstance();
			try {
				scanClassPath(project2descriptor, factory.newSAXParser());
			} catch (Exception e) {
				logException(null, e);
				return null;
			}
		}
		return project2descriptor;
	}
	
	/**
	 * Initialize the {@link EcorePlugin#getEPackageNsURIToGenModelLocationMap()} so that in a standalone environment
	 * the locations of all genmodels are available.
	 * <p>
	 * Initialization is only necessary once and for a standalone environment. If <tt>force</tt> is true a
	 * re-initialization or plugin initialization may be forced.
	 */
	public void initializeGenModelLocationMap(boolean force) {
		if (force || !initializedGenModelLocationMap) {
			initializedGenModelLocationMap = true;
			getProjectDescriptors();
			for (IProjectDescriptor projectDescriptor : project2descriptor.values()) {
				projectDescriptor.initializeGenModelLocationMap();
			}
		}
	}
	
	/**
	 * Install lazy IPackageDescriptors in the EPackage.Registry for all registered packages and their
	 * platform:/plugin and platform:/resource synonyms, which are determined by examining the genPackages.ecorePackage
	 * attribute in all genModels.
	 */
	public void initializePackageRegistry(ResourceSet resourceSet) {
		EPackage.Registry packageRegistry = getPackageRegistry(resourceSet);
		getProjectDescriptors();
		for (IProjectDescriptor projectDescriptor : project2descriptor.values()) {
			Collection<IPackageDescriptor> packageDescriptors = projectDescriptor.getPackageDescriptors();
			if (packageDescriptors != null) {
				for (IPackageDescriptor packageDescriptor : packageDescriptors) {
					projectDescriptor.initializePackageRegistration(packageRegistry, packageDescriptor);
				}
			}
		}
	}
	
	/**
	 * Initialize the {@link EcorePlugin#getPlatformResourceMap()} so that in a standalone environment and in
	 * conjunction with {@link initializeURIMap(URIConverter)} URIs such as <tt>platform:/resource/<i>project</i></tt>
	 * and <tt>platform:/plugin/<i>project</i></tt> are useable.
	 * <p>
	 * Initialization is only necessary once and for a standalone environment. If <tt>force</tt> is true a
	 * re-initialization or plugin initialization may be forced.
	 */
	public void initializePlatformResourceMap(boolean force) {
		if (force || !initializedPlatformResourceMap) {
			initializedPlatformResourceMap = true;
			getProjectDescriptors();
			for (IProjectDescriptor projectDescriptor : project2descriptor.values()) {
				projectDescriptor.initializePlatformResourceMap();
			}
		}
	}
	
	/**
	 * Ensure that both the {@link EcorePlugin#getPlatformResourceMap()} and {@link ResourceSet#getURIConverter()}
 	 * are initialized so that <tt>platform:/resource/<i>project</i></tt>
	 * and <tt>platform:/plugin/<i>project</i></tt> are useable..
	 * 
	 * A null ResourceSet may be used to provoke initialization of the global EPackage.Registry.INSTANCE
	 * and URIConverter.URI_MAP.
	 */
	public void initializeResourceSet(ResourceSet resourceSet) {
		initializeURIResourceMap(resourceSet);
		initializePlatformResourceMap(false);
		initializeURIMap(resourceSet);
		initializeGenModelLocationMap(false);
		initializePackageRegistry(resourceSet);
	}

	/**
	 * Initialize the uriMap of a uriConverter so that each of <tt>platform:/resource/<i>project</i></tt>
	 * and <tt>platform:/plugin/<i>project</i></tt> resolve the workspace project resource else the
	 * plugin bundle for use in either standalone or plugin environment.
	 * <p>
	 * Note that in a plugin environment, a single <tt>platform:/resource/</tt> to <tt>platform:/plugin/</tt>
	 * mapping is sufficient since <tt>platform:/plugin/</tt> is directly resolveable by the Eclipse Platform.
	 */
	public void initializeURIMap(ResourceSet resourceSet) {
		getProjectDescriptors();
		Map<URI, URI> uriMap = getURIMap(resourceSet);
		for (String project : project2descriptor.keySet()) {
			IProjectDescriptor projectDescriptor = project2descriptor.get(project);
			projectDescriptor.initializeURIMap(uriMap);
		}
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return (type instanceof Class<?>) && ((Class<?>)type).isAssignableFrom(StandaloneProjectMap.class);
	}

	protected void logException(File file, Exception e) {
		if (exceptionMap == null) {
			exceptionMap = new HashMap<File, Exception>();
		}
		exceptionMap.put(file, e);
	}

	protected IProjectDescriptor registerBundle(File file, SAXParser saxParser) {
		try {
			JarFile jarFile = new JarFile(file);
			Manifest manifest = jarFile.getManifest();
			if (manifest == null) {
				return null;
			}
			String project = manifest.getMainAttributes().getValue("Bundle-SymbolicName");
			if (project != null) {
				final int indexOf = project.indexOf(';');
				if (indexOf > 0) {
					project = project.substring(0, indexOf);
				}
				IProjectDescriptor.Internal projectDescriptor = project2descriptor.get(project);
				if (projectDescriptor != null)
					return projectDescriptor;
				String path = "archive:"+file.toURI() + "!/";
				URI locationURI = URI.createURI(path);
				projectDescriptor = createProjectDescriptor(project, locationURI);
				project2descriptor.put(project, projectDescriptor);
				ZipEntry entry = jarFile.getEntry("plugin.xml");
				if (entry != null) {
					InputStream inputStream = jarFile.getInputStream(entry);
					try {
						PluginGenModelHandler pluginGenModelHandler = new PluginGenModelHandler(jarFile, projectDescriptor);
						saxParser.parse(inputStream, pluginGenModelHandler);
						pluginGenModelHandler.scanContents(saxParser);
					} finally {
						inputStream.close();
					}
				}
				return projectDescriptor;
			}	
		}
		catch (ZipException e) {
			logException(file, new WrappedException("Could not open Jar file "+file.getAbsolutePath()+".", e));
		}
		catch (Exception e) {
			logException(file, e);
		}
		return null;
	}

	protected IProjectDescriptor.Internal registerProject(File file) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
			String project = document.getDocumentElement().getElementsByTagName("name").item(0).getTextContent();
			URI locationURI = URI.createFileURI(file.getParentFile().getCanonicalPath() + File.separator);
			IProjectDescriptor.Internal projectDescriptor = createProjectDescriptor(project, locationURI);
			project2descriptor.put(project, projectDescriptor);
			return projectDescriptor;
		}
		catch (Exception e) {
			logException(file, new WrappedException("Couldn't read " + file, e));
			return null;
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {}
			}
		}
	}

	protected void scanClassPath(Map<String, IProjectDescriptor.Internal> projectDescriptors, SAXParser saxParser) {
		String property = System.getProperty("java.class.path");
		String separator = System.getProperty("path.separator");
		if (property!=null) {
			String[] entries = property.split(separator);
			for (String entry : entries) {
				File fileEntry = new File(entry);
				try {
					File f = fileEntry.getCanonicalFile();
					if (f.getPath().endsWith(".jar")) {
						registerBundle(f, saxParser);
					} else if (!scanFolder(f, saxParser, new HashSet<String>(), 0)) {
						// eclipse bin folder?
						File parentFile = f.getParentFile();
						File dotProject = new File(parentFile, ".project");
						if (dotProject.exists()) {
							IProjectDescriptor.Internal projectDescriptor = registerProject(dotProject);
							if (projectDescriptor != null) {
								File plugIn = new File(parentFile, "plugin.xml");
								if (plugIn.exists()) {
									PluginGenModelHandler pluginGenModelHandler = new PluginGenModelHandler(projectDescriptor);
									saxParser.parse(plugIn, pluginGenModelHandler);
									pluginGenModelHandler.scanContents(saxParser);
								}
							}
						}
					}
				}
				catch (Exception e) {
					logException(fileEntry, e);
				}
			}
		}
	}

	protected boolean scanFolder(File f, SAXParser saxParser, Set<String> alreadyVisited, int depth) {
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
				if (file.exists() && file.isDirectory() && (depth < 2) && !file.getName().startsWith(".")) {
					containsProject |= scanFolder(file, saxParser, alreadyVisited, depth+1);
				} else if (".project".equals(file.getName())) {
					dotProject = file;
				} else if (file.getName().endsWith(".jar")) {
					registerBundle(file, saxParser);
				}
			}
		}
		if (!containsProject && dotProject != null)
			registerProject(dotProject);
		return containsProject || dotProject != null;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (project2descriptor != null) {
			List<String> projectNames = new ArrayList<String>(project2descriptor.keySet());
			Collections.sort(projectNames);
			for (String projectName : projectNames) {
				if (s.length() > 0) {
					s.append("\n");
				}
				s.append(projectName);
				s.append(" => ");
				s.append(project2descriptor.get(projectName).getLocationURI());
			}
		}
		return s.toString();
	}
}
