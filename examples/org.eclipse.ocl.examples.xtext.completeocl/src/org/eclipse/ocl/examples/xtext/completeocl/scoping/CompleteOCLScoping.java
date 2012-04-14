/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.examples.pivot.scoping.Attribution;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.completeocl.attributes.ClassifierContextCSAttribution;
import org.eclipse.ocl.examples.xtext.completeocl.attributes.CompleteOCLDocumentCSAttribution;
import org.eclipse.ocl.examples.xtext.completeocl.attributes.IncludeCSAttribution;
import org.eclipse.ocl.examples.xtext.completeocl.attributes.OperationContextCSAttribution;
import org.eclipse.ocl.examples.xtext.completeocl.attributes.PackageDeclarationCSAttribution;
import org.eclipse.ocl.examples.xtext.completeocl.attributes.PropertyContextCSAttribution;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;

public class CompleteOCLScoping
{	
	public static void init() {
		Map<EClassifier, Attribution> registry = Attribution.REGISTRY;
		registry.put(CompleteOCLCSTPackage.Literals.CLASSIFIER_CONTEXT_DECL_CS, ClassifierContextCSAttribution.INSTANCE);
		registry.put(CompleteOCLCSTPackage.Literals.COMPLETE_OCL_DOCUMENT_CS, CompleteOCLDocumentCSAttribution.INSTANCE);
		registry.put(CompleteOCLCSTPackage.Literals.INCLUDE_CS, IncludeCSAttribution.INSTANCE);	// new IncludeAttribution()
		registry.put(CompleteOCLCSTPackage.Literals.OPERATION_CONTEXT_DECL_CS, OperationContextCSAttribution.INSTANCE);
		registry.put(CompleteOCLCSTPackage.Literals.PACKAGE_DECLARATION_CS, PackageDeclarationCSAttribution.INSTANCE);
		registry.put(CompleteOCLCSTPackage.Literals.PROPERTY_CONTEXT_DECL_CS, PropertyContextCSAttribution.INSTANCE);
		CS2Pivot.addUnresolvedProxyMessageProvider(IncludeCSAttribution.INSTANCE);			
	}
}
