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
package org.eclipse.ocl.examples.codegen.tests.interactive;

import java.io.InputStream;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;
import org.eclipse.ocl.examples.codegen.tests.utils.StandaloneASTFacadeHelper;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;

/**
 * Invokes genmodel with an OCL2Java adapter for debug purposes.
 */
public class TestGen extends TestCase
{
	public void testOcl2Java() throws Exception {
		assert EMFPlugin.IS_ECLIPSE_RUNNING;		// Needed while using dynamic templates
//		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor
//	     (GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);
//		OCLGeneratorAdapterFactory.install();
		BasicMonitor.Printing monitor = new BasicMonitor.Printing(System.out);
		ResourceSet resourceSet = new ResourceSetImpl();
		String projectName = "play";
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		project.create(null);
		project.open(null);
		IFolder metaInfFolder = project.getFolder("META-INF");
		metaInfFolder.create(true, false, null);
		IFolder modelFolder = project.getFolder("model");
		modelFolder.create(true, false, null);
		IFolder templatesFolder = project.getFolder("templates");
		templatesFolder.create(true, false, null);
		IFolder templatesModelFolder = templatesFolder.getFolder("model");
		templatesModelFolder.create(true, false, null);
		ProjectMap projectMap = new ProjectMap();
		projectMap.initializeResourceSet(resourceSet);
		URIConverter uriConverter = resourceSet.getURIConverter();
		copyFile(uriConverter, project, ".classpath", "/org.eclipse.ocl.examples.codegen.tests/play/.classpath");
		copyFile(uriConverter, project, "plugin.properties", "/org.eclipse.ocl.examples.codegen.tests/play/plugin.properties");
		copyFile(uriConverter, metaInfFolder, "MANIFEST.MF", "/org.eclipse.ocl.examples.codegen.tests/play/META-INF/MANIFEST.MF");
		copyFile(uriConverter, modelFolder, "Company.ecore", "/org.eclipse.ocl.examples.codegen.tests/play/model/Company.ecore");
		copyFile(uriConverter, modelFolder, "CodeGenCompany.genmodel", "/org.eclipse.ocl.examples.codegen.tests/play/model/CodeGenCompany.genmodel");
		copyFile(uriConverter, templatesModelFolder, "Class.javajet", "/org.eclipse.ocl.examples.codegen/templates/model/Class.javajet");
		MetaModelManager metaModelManager = new MetaModelManager();
		MetaModelManagerResourceSetAdapter.getAdapter(resourceSet, metaModelManager);
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new EcoreResourceFactoryImpl());
		URI fileURI = URI.createPlatformResourceURI("/play/model/CodeGenCompany.genmodel", true);
		
		System.out.println("Generating model '" + fileURI + "'");
		try {
//			ResourceSet resourceSet = getResourceSet();
			Resource resource = resourceSet.getResource(fileURI, true);
			// EcoreUtil.resolveAll(resourceSet); -- genModel can fail if
			// proxies resolved here
			// problem arises if genmodel has an obsolete feature for a feature
			// moved up the inheritance hierarchy
			// since the proxy seems to be successfully resolved giving a double
			// feature
//			ResourceUtils.checkResourceSet(resourceSet);
			EObject eObject = resource.getContents().get(0);
//			if (!(eObject instanceof GenModel)) {
//				throw new ConfigurationException("No GenModel found in '"
//						+ resource.getURI() + "'");
//			}
			GenModel genModel = (GenModel) eObject;
			genModel.reconcile();
//			ResourceUtils.checkResourceSet(resourceSet);
			genModel.setCanGenerate(true);
//			validate();
/*			genModel.reconcile();
//			ResourceUtils.checkResourceSet(resourceSet);
			// genModel.setCanGenerate(true);
			// validate();

			
			
			genModel.setValidateModel(true); // The more checks the better
//			genModel.setCodeFormatting(true); // Normalize layout
			genModel.setForceOverwrite(false); // Don't overwrite read-only
												// files
			genModel.setCanGenerate(true);
			// genModel.setFacadeHelperClass(null); // Non-null gives JDT
			// default NPEs
			genModel.setFacadeHelperClass(StandaloneASTFacadeHelper.class.getName()); // Bug 308069
//		    try {
//				Class<?> cls = Class.forName(genModel.getFacadeHelperClass());
//			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			// genModel.setValidateModel(true);
			genModel.setBundleManifest(false); // New manifests should be
												// generated manually
			genModel.setUpdateClasspath(false); // New class-paths should be
												// generated manually
			genModel.setComplianceLevel(GenJDKLevel.JDK50_LITERAL);
			// genModel.setRootExtendsClass("org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container");
			Diagnostic diagnostic = genModel.diagnose();
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				System.out.println(diagnostic);
			}

			/ *
			 * JavaModelManager.getJavaModelManager().initializePreferences();
			 * new
			 * JavaCorePreferenceInitializer().initializeDefaultPreferences();
			 * 
			 * GenJDKLevel genSDKcomplianceLevel =
			 * genModel.getComplianceLevel(); String complianceLevel =
			 * JavaCore.VERSION_1_5; switch (genSDKcomplianceLevel) { case
			 * JDK60_LITERAL: complianceLevel = JavaCore.VERSION_1_6; case
			 * JDK14_LITERAL: complianceLevel = JavaCore.VERSION_1_4; default:
			 * complianceLevel = JavaCore.VERSION_1_5; } // Hashtable<?,?>
			 * defaultOptions = JavaCore.getDefaultOptions(); //
			 * JavaCore.setComplianceOptions(complianceLevel, defaultOptions);
			 * // JavaCore.setOptions(defaultOptions);
			 * /

//			Generator generator = new Generator();
//			generator.setInput(genModel);
//			Generator generator = GenModelUtil.createGenerator(genModel);
			Generator generator = createGenerator(genModel);
//			generator.getJControlModel().initialize(new StandaloneASTFacadeHelper(), generator.getOptions().mergeRulesURI);
//			Monitor monitor = showProgress ? new LoggerMonitor(log)
//					: new BasicMonitor();
			diagnostic = generator.generate(genModel,
					GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, monitor);
			if (diagnostic.getSeverity() != Diagnostic.OK)
				System.out.println(diagnostic);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		} */
		Generator generator = GenModelUtil.createGenerator(genModel);
		ImportManager importManager = genModel.getImportManager();
		if (importManager == null) {
			genModel.setImportManager(new ImportManager("xyzzy"));		// This is only used for return type casts
		}

//		Monitor monitor = showProgress ? new LoggerMonitor(log)
//				: new BasicMonitor();
		Diagnostic diagnostic = generator.generate(genModel,
				GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, monitor);
		if (diagnostic.getSeverity() != Diagnostic.OK)
			System.out.println(diagnostic);
	} catch (RuntimeException e) {
		e.printStackTrace();
		throw e;
	}
	}

	protected void copyFile(URIConverter uriConverter, IContainer folder, String toFile, String fromFile) throws Exception {
		IFile iFile = (folder instanceof IProject) ? ((IProject)folder).getFile(toFile) : ((IFolder)folder).getFile(toFile);
		URI uri = URI.createPlatformPluginURI(fromFile, true);
		InputStream inputStream = uriConverter.createInputStream(uri);
		iFile.create(inputStream, true, null);
	}
	
	  public static Generator createGenerator(GenModel genModel)
	  {
	    Generator generator = new Generator()
	    {

			@Override
			public JControlModel getJControlModel() {
			    if (jControlModel == null)
			    {
			      jControlModel = new JControlModel();
			    }
			    String facadeHelperClass = options.mergerFacadeHelperClass;
			    if (!badFacadeHelperClasses.contains(facadeHelperClass) &&
			           (jControlModel.getFacadeHelper() == null || !jControlModel.getFacadeHelper().getClass().getName().equals(facadeHelperClass)))
			    {
//				  FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(facadeHelperClass); 
//			      if (facadeHelper == null)
//			      {
//			        badFacadeHelperClasses.add(facadeHelperClass);
//			      }
			      jControlModel.initialize(new StandaloneASTFacadeHelper(), options.mergeRulesURI);
			    }
				return jControlModel;
			}
	    	
	    };
	    generator.setInput(genModel);
	    JControlModel jControlModel = generator.getJControlModel();

	    if (genModel.isCodeFormatting())
	    {
	      jControlModel.setLeadingTabReplacement(null);
	      jControlModel.setConvertToStandardBraceStyle(false);
	    }
	    else
	    {
	      Map<?, ?> options = JavaCore.getOptions();
	      String tabSize = (String)options.get(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE);
	      String braceStyle = (String)options.get(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION);
	      String tabCharacter = (String)options.get(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR);
	      if (JavaCore.TAB.equals(tabCharacter))
	      {
	        jControlModel.setLeadingTabReplacement("\t");
	      }
	      else
	      {
	        String spaces = "";
	        for (int i = Integer.parseInt(tabSize); i > 0; --i)
	        {
	          spaces += " ";
	        }
	        jControlModel.setLeadingTabReplacement(spaces);
	      }
	      jControlModel.setConvertToStandardBraceStyle(DefaultCodeFormatterConstants.END_OF_LINE.equals(braceStyle));
	    }
	    return generator;
	  }  
}
