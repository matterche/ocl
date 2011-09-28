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
package org.eclipse.ocl.examples.codegen.tests;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.ocl.examples.codegen.ecore.OCLGeneratorAdapterFactory;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;

public class TestGen
{
	public static void main(String[] args) {
		BasicMonitor.Printing monitor = new BasicMonitor.Printing(System.out);
		MetaModelManager metaModelManager = new MetaModelManager();
		ResourceSet resourceSet = new ResourceSetImpl();
		new ProjectMap().initializeResourceSet(resourceSet);
		MetaModelManagerResourceSetAdapter.getAdapter(resourceSet, metaModelManager);
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel", new EcoreResourceFactoryImpl());
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor
	     (GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);
		OCLGeneratorAdapterFactory.install();
		
//		URI fileURI = URI.createFileURI("C:/Development/OCL3.2.0/Workspace3.6/CodeGenTest/model/play.genmodel");
		Map<String, URI> platformResourceMap = EcorePlugin.getPlatformResourceMap();
//		String projectPath = URI.createPlatformResourceURI("/CodeGenTest", true).toString();
		URI projectURI = URI.createFileURI("C:/Development/OCL3.2.0/Workspace3.6/CodeGenTest/");
		platformResourceMap.put("CodeGenTest", projectURI);
		URI fileURI = URI.createPlatformResourceURI("/CodeGenTest/model/play.genmodel", true);
		
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

			/*
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
			 */

//			Generator generator = new Generator();
//			generator.setInput(genModel);
			Generator generator = GenModelUtil.createGenerator(genModel);
//			Monitor monitor = showProgress ? new LoggerMonitor(log)
//					: new BasicMonitor();
			diagnostic = generator.generate(genModel,
					GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, monitor);
			if (diagnostic.getSeverity() != Diagnostic.OK)
				System.out.println(diagnostic);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
