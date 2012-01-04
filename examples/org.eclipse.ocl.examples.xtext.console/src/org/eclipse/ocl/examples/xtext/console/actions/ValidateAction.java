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
 * $Id: LoadResourceAction.java,v 1.2 2011/05/07 16:41:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.console.actions;

import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ocl.examples.pivot.utilities.PivotDiagnostician;
import org.eclipse.ocl.examples.xtext.console.OCLConsolePage;
import org.eclipse.ocl.examples.xtext.console.XtextConsolePlugin;
import org.eclipse.ocl.examples.xtext.console.messages.ConsoleMessages;
import org.osgi.framework.Bundle;

/**
 * An action that validates the selection with added Complete OCL contributions.
 */
public class ValidateAction extends org.eclipse.emf.edit.ui.action.ValidateAction
{
    protected final OCLConsolePage consolePage;
	
	/**
	 * Initializes me.
	 */
	public ValidateAction(OCLConsolePage consolePage) {
		this.consolePage = consolePage;
		Bundle bundle = XtextConsolePlugin.getInstance().getBundle();
		Path imagePath = new Path("$nl$/icons/elcl16/validate.gif"); //$NON-NLS-1$
		URL imageFile = FileLocator.find(bundle, imagePath, null);
		setImageDescriptor(ImageDescriptor.createFromURL(imageFile));
		setToolTipText(ConsoleMessages.ValidateAction_Tip);
	}

	@Override
	protected Diagnostician createDiagnostician(final AdapterFactory adapterFactory, final IProgressMonitor progressMonitor) {
		return new PivotDiagnostician()
		{
			@Override
			public String getObjectLabel(EObject eObject) {
				if (adapterFactory != null && !eObject.eIsProxy()) {
					IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory
						.adapt(eObject, IItemLabelProvider.class);
					if (itemLabelProvider != null) {
						return itemLabelProvider.getText(eObject);
					}
				}

				return super.getObjectLabel(eObject);
			}

			@Override
			public boolean validate(EClass eClass, EObject eObject,
					DiagnosticChain diagnostics, Map<Object, Object> context) {
				progressMonitor.worked(1);
				return super.validate(eClass, eObject, diagnostics, context);
			}
		};
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
//		super.selectionChanged(event);
	}

	@Override
	public boolean updateSelection(IStructuredSelection selection) {
//		return super.updateSelection(selection);
		return true;
	}

	@Override
	protected Diagnostic validate(IProgressMonitor progressMonitor) {
		return super.validate(progressMonitor);
	}

	public void setSelection(EObject contextObject) {
		if (contextObject != null) {
			selectedObjects = Collections.singletonList(contextObject);
		}
		else {
			selectedObjects = Collections.emptyList();
		}
	}
}