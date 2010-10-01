/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
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
 * $Id: BaseTransformer.java,v 1.1.2.1 2010/10/01 15:04:04 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.outline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

/**
 * customization of the default outline structure
 * 
 */
public class BaseTransformer extends AbstractDeclarativeSemanticModelTransformer
{
	protected void addContent(List<EObject> contents, EObject csElement) {
		if (csElement != null)
			contents.add(csElement);
	}

	protected void addContents(List<EObject> contents, Collection<? extends EObject> csElements) {
		contents.addAll(csElements);
	}
	
	public List<EObject> getChildren(ClassCS csElement) {
		org.eclipse.ocl.examples.pivot.Class pivotElement = (org.eclipse.ocl.examples.pivot.Class) csElement.getPivot();
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, ElementUtil.getTemplateParameters(pivotElement));
		addContents(contents, pivotElement.getSuperClasses());
		addContents(contents, pivotElement.getOwnedOperations());
		addContents(contents, pivotElement.getOwnedAttributes());
		addContents(contents, pivotElement.getOwnedRules());
		addContents(contents, pivotElement.getOwnedAnnotations());
		return contents;
	}

	public List<EObject> getChildren(ClassifierCS csElement) {
		Type pivotElement = (Type) csElement.getPivot();
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, ElementUtil.getTemplateParameters(pivotElement));
		addContents(contents, pivotElement.getOwnedRules());
		addContents(contents, pivotElement.getOwnedAnnotations());
		return contents;
	}

	public List<EObject> getChildren(OperationCS csElement) {
		Operation pivotElement = (Operation) csElement.getPivot();
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, ElementUtil.getTemplateParameters(pivotElement));
		addContents(contents, pivotElement.getOwnedParameters());
		addContents(contents, pivotElement.getOwnedRules());
		addContents(contents, pivotElement.getOwnedAnnotations());
		return contents;
	}

	public List<EObject> getChildren(ParameterCS csElement) {
		Parameter pivotElement = (Parameter) csElement.getPivot();
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, pivotElement.getOwnedAnnotations());
		return contents;
	}
	
	public List<EObject> getChildren(RootPackageCS csElement) {
		org.eclipse.ocl.examples.pivot.Package pivotElement = (org.eclipse.ocl.examples.pivot.Package) csElement.getPivot();
		List<EObject> contents = new ArrayList<EObject>();
		if (pivotElement != null) {
//			addContents(contents, pivotElement.getOwnedImport());
//			addContents(contents, pivotElement.getOwnedLibrary());
			addContents(contents, pivotElement.getNestedPackages());
//			addContents(contents, pivotElement.getAnnotations());
		}
		return contents;
	}

	public List<EObject> getChildren(StructuralFeatureCS csElement) {
		Property pivotElement = (Property) csElement.getPivot();
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, pivotElement.getOwnedRules());
		addContents(contents, pivotElement.getOwnedAnnotations());
		return contents;
	}
}
