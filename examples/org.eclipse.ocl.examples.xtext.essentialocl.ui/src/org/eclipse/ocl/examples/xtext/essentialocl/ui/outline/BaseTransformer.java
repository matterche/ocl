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
 * $Id: BaseTransformer.java,v 1.1.2.3 2010/12/11 10:44:29 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.ui.outline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
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

	protected List<EObject> appendContents(List<EObject> contents, NamedElement pivotElement) {
		addContents(contents, pivotElement.getOwnedRules());
		addContents(contents, pivotElement.getOwnedAnnotations());
//		addContents(contents, pivotElement.getOwnedComments());
		return contents;
	}

	@Override
	protected List<EObject> getChildNodes(EObject semanticNode) {
		if (semanticNode instanceof ModelElementCS) {
			EObject pivotElement = ((ModelElementCS)semanticNode).getPivot();
			if (pivotElement != null) {
				return super.getChildNodes(pivotElement);
			}
		}
		return super.getChildNodes(semanticNode);
	}
	
	public List<EObject> getChildren(org.eclipse.ocl.examples.pivot.Class pivotElement) {
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, PivotUtil.getTemplateParameters(pivotElement));
//		addContents(contents, pivotElement.getSuperClasses());
		addContents(contents, pivotElement.getOwnedOperations());
		addContents(contents, pivotElement.getOwnedAttributes());
		return appendContents(contents, pivotElement);
	}

	public List<EObject> getChildren(Type pivotElement) {
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, PivotUtil.getTemplateParameters(pivotElement));
		return appendContents(contents, pivotElement);
	}

	public List<EObject> getChildren(Operation pivotElement) {
		List<EObject> contents = new ArrayList<EObject>();
		addContents(contents, PivotUtil.getTemplateParameters(pivotElement));
		addContents(contents, pivotElement.getOwnedParameters());
		return appendContents(contents, pivotElement);
	}

	
	public List<EObject> getChildren(org.eclipse.ocl.examples.pivot.Package pivotElement) {
		List<EObject> contents = new ArrayList<EObject>();
//		addContents(contents, pivotElement.getOwnedImport());
//		addContents(contents, pivotElement.getOwnedLibrary());
		addContents(contents, pivotElement.getNestedPackages());
		addContents(contents, pivotElement.getOwnedTypes());
		return appendContents(contents, pivotElement);
	}

	public List<EObject> getChildren(Parameter pivotElement) {
		List<EObject> contents = new ArrayList<EObject>();
		return appendContents(contents, pivotElement);
	}

	public List<EObject> getChildren(Property pivotElement) {
		List<EObject> contents = new ArrayList<EObject>();
		return appendContents(contents, pivotElement);
	}
}
