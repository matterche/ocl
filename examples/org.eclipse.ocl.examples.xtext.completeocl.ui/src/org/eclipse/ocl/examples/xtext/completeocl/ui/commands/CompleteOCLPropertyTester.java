/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.completeocl.ui.commands;

import java.util.Collection;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ocl.examples.xtext.oclinecore.ui.commands.CreateDynamicInstanceHandler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.services.IEvaluationService;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class CompleteOCLPropertyTester extends PropertyTester
{
	private static final String RESOURCE_SET_AVAILABLE = "resourceSetAvailable"; //$NON-NLS-1$

	public CompleteOCLPropertyTester() {
		super();
	}

	private boolean hasResourceSet(Object receiver) {
		if (receiver instanceof EObject) {
			Resource resource = ((EObject)receiver).eResource();
			return (resource != null) && (resource.getResourceSet() != null);
		}
		else if (receiver instanceof Resource) {
			return ((Resource)receiver).getResourceSet() != null;
		}
		else if (receiver instanceof ResourceSet) {
			return true;
		}
		else if (receiver instanceof TextSelection) {
			IEvaluationContext evaluationContext = getApplicationContext();
			XtextEditor xtextEditor = CreateDynamicInstanceHandler.getActiveXtextEditor(evaluationContext);
			return xtextEditor != null;
		}
		return false;
	}

	/**
	 * @return an evaluation context
	 */
	public static IEvaluationContext getApplicationContext() {
		IEvaluationService es = (IEvaluationService) PlatformUI.getWorkbench().getService(IEvaluationService.class);
		return es == null ? null : es.getCurrentState();
	}

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (RESOURCE_SET_AVAILABLE.equals(property)) {
			if (receiver instanceof Collection) {
				for (Object aReceiver : (Collection<?>)receiver) {
					if (hasResourceSet(aReceiver)) {
						return true;
					}
				}
			}
			else {
				return hasResourceSet(receiver);
			}
		}
		return false;
	}
}
