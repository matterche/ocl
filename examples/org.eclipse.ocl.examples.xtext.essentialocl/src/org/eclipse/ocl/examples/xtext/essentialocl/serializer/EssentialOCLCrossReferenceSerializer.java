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
		boolean foundOne = false;
		List<ISerializationDiagnostic> recordedErrros = null;
		Iterable<IEObjectDescription> elements = scope.getElements(target);
		if ("URI".equals(ruleName)) {
			for (IEObjectDescription desc : elements) {
				foundOne = true;
				URI uri = URI.createURI(desc.getName().toString());
				URI baseURI = semanticObject.eResource().getURI();
				URI deresolvedURI = uri.deresolve(baseURI);
				return valueConverter.toString(deresolvedURI.toString(), ruleName);
			}
		}
		else {
			for (IEObjectDescription desc : elements) {
				foundOne = true;
				QualifiedName name = desc.getName();
				int iMax = name.getSegmentCount();
				String[] converted = new String[iMax];
				String unconverted = null;
				try {
					for (int i = 0; i < iMax; i++) {
						unconverted = name.getSegment(i);
						converted[i] = valueConverter.toString(unconverted, ruleName);
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
