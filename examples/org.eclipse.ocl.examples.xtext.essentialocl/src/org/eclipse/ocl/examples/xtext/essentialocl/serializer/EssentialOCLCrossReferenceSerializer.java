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
package org.eclipse.ocl.examples.xtext.essentialocl.serializer;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.AliasAnalysis;
import org.eclipse.ocl.examples.xtext.base.scope.QualifiedPath;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

// FIXME Temporary workaround for Bug 361577
@SuppressWarnings("restriction")
public class EssentialOCLCrossReferenceSerializer extends CrossReferenceSerializer
{

	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	private IValueConverterService valueConverter;

	@Override
	protected String getCrossReferenceNameFromScope(EObject semanticObject,
			CrossReference crossref, EObject target, IScope scope, Acceptor errors) {
		String ruleName = linkingHelper.getRuleNameFrom(crossref);
		if ("URI".equals(ruleName)) {
			Iterable<IEObjectDescription> elements = scope.getElements(target);
			for (IEObjectDescription desc : elements) {
				URI uri = URI.createURI(desc.getName().toString());
				URI baseURI = semanticObject.eResource().getURI();
				URI deresolvedURI = uri.deresolve(baseURI, true, true, false);
				return valueConverter.toString(deresolvedURI.toString(), ruleName);
			}
		}
		if (semanticObject instanceof PathElementCS) {
			PathElementCS pathElement = (PathElementCS)semanticObject;
			PathNameCS pathName = pathElement.getPathName();
			int index = pathName.getPath().indexOf(pathElement);
			Element element = pathElement.getElement();
			NamedElement namedElement = ElementUtil.isPathable(element);
			if (namedElement != null) {
				String name = namedElement.getName();
				if ((index == 0) && (namedElement instanceof org.eclipse.ocl.examples.pivot.Package)) {
					EObject root = EcoreUtil.getRootContainer(semanticObject);
					Resource csResource = root.eResource();
					Resource asResource = null;
					if (root instanceof RootPackageCS) {
						EObject root2 = ((RootPackageCS)root).getPivot();
						asResource = EcoreUtil.getRootContainer(root2).eResource();
					}
					Resource elementResource = namedElement.eResource();
					if ((elementResource != csResource) && (elementResource != asResource)) {
						AliasAnalysis adapter = AliasAnalysis.getAdapter(csResource);
						if (adapter != null) {
							String alias = adapter.getAlias(namedElement);
							if (alias != null) {
								name = alias;
							}
						}	
					}
				}
				return valueConverter.toString(name, ruleName);
			}
			else {
				URI uri;
				EObject eTarget = element.getETarget();
				if (eTarget != null) {
					uri = EcoreUtil.getURI(eTarget);
				}
				else {
					uri = EcoreUtil.getURI(element);
				}
				URI baseURI = semanticObject.eResource().getURI();
				URI deresolvedURI = uri.deresolve(baseURI, true, true, false);
				return valueConverter.toString(deresolvedURI.toString(), ruleName);
			}
		}
		boolean foundOne = false;
		List<ISerializationDiagnostic> recordedErrros = null;
		Iterable<IEObjectDescription> elements = scope.getElements(target);
		if ("URI".equals(ruleName)) {
			for (IEObjectDescription desc : elements) {
				foundOne = true;
				URI uri = URI.createURI(desc.getName().toString());
				URI baseURI = semanticObject.eResource().getURI();
				URI deresolvedURI = uri.deresolve(baseURI, true, true, false);
				return valueConverter.toString(deresolvedURI.toString(), ruleName);
			}
		}
		else {
			for (IEObjectDescription desc : elements) {
				foundOne = true;
				QualifiedName name = desc.getName();
				List<String> segments;
				if (name instanceof QualifiedPath) {
					segments = ((QualifiedPath)name).getSegments(semanticObject);
				}
				else {
					segments = name.getSegments();
				}
				int iMax = segments.size();
				String[] converted = new String[iMax];
				String unconverted = null;
				try {
					for (int i = 0; i < iMax; i++) {
						unconverted = segments.get(i);
						if ((i > 0) && "UnrestrictedName".equals(ruleName)) {
							converted[i] = valueConverter.toString(unconverted, "UnreservedName");
						}
						else {
							converted[i] = valueConverter.toString(unconverted, ruleName);
						}
					}
					return qualifiedNameConverter.toString(new QualifiedName(converted) {});
				} catch (ValueConverterException e) {
					if (errors != null) {
						if (recordedErrros == null)
							recordedErrros = Lists.newArrayList();
						recordedErrros.add(diagnostics.getValueConversionExceptionDiagnostic(semanticObject, crossref,
								unconverted, e));
					}
				}
			}
		}
		if (errors != null) {
			if (recordedErrros != null)
				for (ISerializationDiagnostic diag : recordedErrros)
					errors.accept(diag);
			if (!foundOne)
				errors.accept(diagnostics.getNoEObjectDescriptionFoundDiagnostic(semanticObject, crossref, target,
						scope));
		}
		return null;
	}
}
