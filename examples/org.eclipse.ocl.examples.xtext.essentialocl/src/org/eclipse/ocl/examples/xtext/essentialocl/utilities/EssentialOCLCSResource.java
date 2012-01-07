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
 * $Id: EssentialOCLCSResource.java,v 1.15 2011/05/23 08:45:51 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.utilities;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationContext;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.IllegalLibraryException;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironment;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.LibraryDiagnostic;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLCS2Pivot;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.util.CancelIndicator;

public class EssentialOCLCSResource extends LazyLinkingResource
	implements BaseCSResource, EvaluationContext
{	
	private PivotEnvironment environment = null;
	private NamedElement specificationContext = null;
	
	public EssentialOCLCSResource() {
		super();
	}

	protected void addLibraryError(List<Diagnostic> errors, IllegalLibraryException e) {
		String message = e.getMessage();
		for (Resource.Diagnostic diagnostic : errors) {
			if (diagnostic instanceof LibraryDiagnostic) {
				Exception exception = ((LibraryDiagnostic)diagnostic).getException();
				if (exception instanceof IllegalLibraryException) {
					if (message.equals(exception.getMessage())) {
						return;
					}
				}
			}
		}
		errors.add(new LibraryDiagnostic(e));
	}

	public CS2Pivot createCS2Pivot(
			Map<? extends Resource, ? extends Resource> cs2pivotResourceMap,
			MetaModelManager metaModelManager) {
		return new EssentialOCLCS2Pivot(cs2pivotResourceMap, metaModelManager);
	}

	public MetaModelManager createMetaModelManager() {
		ResourceSet resourceSet = getResourceSet();
		MetaModelManagerResourceSetAdapter resourceSetAdapter = MetaModelManagerResourceSetAdapter.findAdapter(resourceSet);
		if (resourceSetAdapter != null) {
			return resourceSetAdapter.getMetaModelManager();
		}
		else {
			return new MetaModelManager();
		}
	}

	@Override
	protected void doLinking() {
		List<Diagnostic> errors = getErrors();
		if (errors.size() > 0) {
			for (int i = errors.size(); --i >= 0; ) {
				Diagnostic error = errors.get(i);
				if (error instanceof LibraryDiagnostic) {
					errors.remove(i);
				}
			}
		}
		super.doLinking();
	}

	public String getEditorName() {
		return "Essential OCL";
	}

	public PivotEnvironment getEnvironment() {
		return environment;
	}
	
	public NamedElement getSpecificationContext() {
		return specificationContext;
	}

	public URI resolve(URI uri) {
		URI csURI = getURI();
		if (csURI.isRelative()) {
			File csRelative = new File(csURI.toFileString());
			File csAbsolute = csRelative.getAbsoluteFile();
			csURI = URI.createFileURI(csAbsolute.toString());
		}
		return uri.resolve(csURI);
	}

	@Override
	public void resolveLazyCrossReferences(CancelIndicator mon) {	// FIXME move to Validation rules
		List<Diagnostic> errors = getErrors();
		if (ElementUtil.hasSyntaxError(errors)) {
			return;
		}
		MetaModelManagerResourceAdapter adapter = MetaModelManagerResourceAdapter.findAdapter(this);
		if (adapter != null) {
			MetaModelManager metaModelManager = adapter.getMetaModelManager();
			if (metaModelManager != null) {
//				if (metaModelManager.getLibraryResource() != org.eclipse.ocl.examples.library.oclstdlib.OCLstdlib.INSTANCE) {
//					metaModelManager.resetLibrary();		// FIXME is this needed; if so test it
//				}
				try {
					metaModelManager.getOclAnyType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getOclElementType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getOclVoidType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getOclInvalidType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getAnyClassifierType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getBooleanType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getRealType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getIntegerType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getUnlimitedNaturalType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getStringType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getCollectionType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getBagType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getSequenceType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getSetType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getOrderedSetType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getEnumerationType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getOclTupleType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
				try {
					metaModelManager.getOclLambdaType();
				} catch (IllegalLibraryException e) {			
					addLibraryError(errors, e);
				}
			}
			super.resolveLazyCrossReferences(mon);
		}
	}

	public void setContext(NamedElement pivotContext, Map<String, Type> pivotParameters) {
		this.specificationContext = pivotContext;		
	}

	public void setEnvironment(PivotEnvironment environment) {
		this.environment = environment;
	}
}
