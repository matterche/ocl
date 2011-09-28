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
package org.eclipse.ocl.examples.codegen.ecore;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.delegate.InvocationBehavior;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;

public class OCLGeneratorAdapterFactory extends AbstractGeneratorAdapterFactory
{
	/**
	 * A descriptor for this adapter factory, which can be used to
	 * programatically
	 * {@link org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor.Registry#addDescriptor(String, org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor)
	 * register} it.
	 * 
	 * @see org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor.Registry
	 */
	public static final GeneratorAdapterFactory.Descriptor DESCRIPTOR = new GeneratorAdapterFactory.Descriptor() {
		public GeneratorAdapterFactory createAdapterFactory() {
			return new OCLGeneratorAdapterFactory();
		}
	};

	public static void install() {
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, DESCRIPTOR);
	}
	
	public OCLGeneratorAdapterFactory() {
		super();
	}

	@Override
	protected Adapter createAdapter(Notifier target) {
		return null;
	}

	@Override
	public void dispose() {}
	
	@Override
	public void initialize(Object input) {	// FIXME gets invoked twice
		GenModel genModel = (GenModel) input;
		Resource genResource = genModel.eResource();
		MetaModelManagerResourceSetAdapter adapter = MetaModelManagerResourceSetAdapter.findAdapter(genResource.getResourceSet());
		MetaModelManager metaModelManager = adapter.getMetaModelManager();
	    Map<String, String> results = new HashMap<String, String>();
	  	try {
            File folder = new File("/");       
            List<String> arguments = new ArrayList<String>();
			Ocl2java4genmodel generator = new Ocl2java4genmodel(genModel, folder, arguments);
	        Map<String, String> result = generator.generate(new BasicMonitor());
	        for (String key : result.keySet()) {
	        	String key2 = "/" + key.replace('\\', '/');		// BUG 359139
				String value = result.get(key);
				results.put(key2, value);
//	        	System.out.println(key2 + " ==> " + value);
	        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<GenPackage> genPackages = genModel.getAllGenPackagesWithClassifiers();
		for (GenPackage genPackage : genPackages) {
			EPackage ecorePackage = genPackage.getEcorePackage();
			Ecore2Pivot ecore2pivot = Ecore2Pivot.getAdapter(ecorePackage.eResource(), metaModelManager);
			for (EClassifier eClassifier : ecorePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					for (EOperation eOperation : ((EClass)eClassifier).getEOperations()) {
						Operation pOperation = ecore2pivot.getCreated(Operation.class, eOperation);
						String fragmentURI = EcoreUtil.getURI(pOperation).fragment().toString();
						String body = EcoreUtil.getAnnotation(eOperation, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT, InvocationBehavior.BODY_CONSTRAINT_KEY);
						if (body != null) {
							EcoreUtil.setAnnotation(eOperation, GenModelPackage.eNS_URI, "body", results.get(fragmentURI));
						}
					}
				}
			}
		}
		super.initialize(input);
	}
}
