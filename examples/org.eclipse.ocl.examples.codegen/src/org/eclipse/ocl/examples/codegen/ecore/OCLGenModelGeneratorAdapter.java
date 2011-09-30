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
package org.eclipse.ocl.examples.codegen.ecore;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.delegate.InvocationBehavior;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.ecore.Ecore2Pivot;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;

public class OCLGenModelGeneratorAdapter extends GenModelGeneratorAdapter
	{
		public OCLGenModelGeneratorAdapter(OCLGeneratorAdapterFactory generatorAdapterFactory) {
			super(generatorAdapterFactory);
		}

		@Override
		protected Diagnostic doPreGenerate(Object object, Object projectType) {
			GenModel genModel = (GenModel) object;
			Resource genResource = genModel.eResource();
			MetaModelManagerResourceSetAdapter adapter = MetaModelManagerResourceSetAdapter.getAdapter(genResource.getResourceSet(), null);
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
//		        	System.out.println(key2 + " ==> " + value);
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
					EAnnotation eAnnotation = eClassifier.getEAnnotation(OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT);
					if (eAnnotation != null) {
						EMap<String, String> details = eAnnotation.getDetails();
						for (String key : details.keySet()) {
							installInvariant(ecore2pivot, eClassifier, key, results);
						}
					}
					eAnnotation = eClassifier.getEAnnotation(OCLDelegateDomain.OCL_DELEGATE_URI_LPG);
					if (eAnnotation != null) {
						EMap<String, String> details = eAnnotation.getDetails();
						for (String key : details.keySet()) {
							installInvariant(ecore2pivot, eClassifier, key, results);
						}
					}
					EcoreUtil.getConstraints(eClassifier);
					if (eClassifier instanceof EClass) {
						EClass eClass = (EClass)eClassifier;
						for (EOperation eOperation : eClass.getEOperations()) {
							installOperation(ecore2pivot, eOperation, results);
						}
						for (EStructuralFeature eFeature : eClass.getEStructuralFeatures()) {
							installProperty(ecore2pivot, eFeature, results);
						}
					}
				}
			}
			return super.doPreGenerate(object, projectType);
		}

		protected void installInvariant(Ecore2Pivot ecore2pivot, EClassifier eClassifier, String key, Map<String, String> results) {
			Type pType = ecore2pivot.getCreated(Type.class, eClassifier);
			List<Constraint> ownedRules = pType.getOwnedRules();
//			String fragmentURI = EcoreUtil.getURI(pOperation).fragment().toString();
//			String body = EcoreUtil.getAnnotation(eOperation, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT, InvocationBehavior.BODY_CONSTRAINT_KEY);
//			if (body != null) {
//				EcoreUtil.setAnnotation(eOperation, GenModelPackage.eNS_URI, "body", results.get(fragmentURI));
//			}
		}

		protected void installOperation(Ecore2Pivot ecore2pivot, EOperation eOperation, Map<String, String> results) {
			Operation pOperation = ecore2pivot.getCreated(Operation.class, eOperation);
			String fragmentURI = EcoreUtil.getURI(pOperation).fragment().toString();
			String body = EcoreUtil.getAnnotation(eOperation, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT, InvocationBehavior.BODY_CONSTRAINT_KEY);
			if (body != null) {
				EcoreUtil.setAnnotation(eOperation, GenModelPackage.eNS_URI, "body", results.get(fragmentURI));
			}
		}

		protected void installProperty(Ecore2Pivot ecore2pivot, EStructuralFeature eFeature, Map<String, String> results) {
			Property pProperty = ecore2pivot.getCreated(Property.class, eFeature);
			String fragmentURI = EcoreUtil.getURI(pProperty).fragment().toString();
			String body = EcoreUtil.getAnnotation(eFeature, OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT, InvocationBehavior.BODY_CONSTRAINT_KEY);
			if (body != null) {
				EcoreUtil.setAnnotation(eFeature, GenModelPackage.eNS_URI, "body", results.get(fragmentURI));
			}
		}
	}