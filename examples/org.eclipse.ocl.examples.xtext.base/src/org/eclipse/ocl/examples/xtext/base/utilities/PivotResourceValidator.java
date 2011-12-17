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
 * $Id: PivotDiagnostician.java,v 1.1 2011/02/19 12:00:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;

public class PivotResourceValidator extends ResourceValidatorImpl
{
	private static final Logger log = Logger.getLogger(PivotResourceValidator.class);

	@Override
	public List<Issue> validate(Resource csResource, CheckMode mode, CancelIndicator monitor) {
		List<Issue> issues = super.validate(csResource, mode, monitor);
		if (!monitor.isCanceled() && mode.shouldCheck(CheckType.EXPENSIVE) && (csResource instanceof BaseCSResource)) {
			CS2PivotResourceAdapter cs2pivotAdapter = CS2PivotResourceAdapter.findAdapter((BaseCSResource)csResource);
			if (cs2pivotAdapter != null) {
				Resource pivotResource = cs2pivotAdapter.getPivotResource(csResource);
				if (pivotResource != null) {
					IAcceptor<Issue> acceptor = createAcceptor(issues);
					Diagnostician diagnostician = getDiagnostician();
				    Map<Object, Object> context = diagnostician.createDefaultContext();
					for (Resource pResource : pivotResource.getResourceSet().getResources()) {
						for (EObject pObject : pResource.getContents()) {
							try {
								if (monitor.isCanceled())
									return null;
							    Diagnostic diagnostic = diagnostician.validate(pObject, context);
								if (!diagnostic.getChildren().isEmpty()) {
									for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
										issueFromEValidatorDiagnostic(childDiagnostic, acceptor);
									}
								} else {
									issueFromEValidatorDiagnostic(diagnostic, acceptor);
								}
							} catch (RuntimeException e) {
								log.error(e.getMessage(), e);
							}
						}
					}
				}
			}
		}
		return issues;
	}
}
