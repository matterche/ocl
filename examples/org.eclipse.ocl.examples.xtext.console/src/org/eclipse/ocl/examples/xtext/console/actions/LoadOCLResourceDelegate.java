/**
 * <copyright>
 *
 * Copyright (c) 2005,2011 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   E.D.Willink - rework of LPG OCL Console for Xtext
 *
 * </copyright>
 *
 * $Id: ShowConsoleDelegate.java,v 1.1 2011/03/04 22:18:25 ewillink Exp $
 */

package org.eclipse.ocl.examples.xtext.console.actions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.ExtendedLoadResourceDialog;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceSetAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.ocl.examples.xtext.console.OCLConsole;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate2;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;


/**
 */
public class LoadOCLResourceDelegate
	extends LoadResourceAction implements IActionDelegate2, IEditorActionDelegate {
	
	protected class ResourceDialog extends ExtendedLoadResourceDialog
	{
		protected ResourceDialog(Shell parent, EditingDomain domain) {
			super(parent, domain);
		}

		@Override
		protected boolean processResources() {
			ResourceSet resourceSet = null;
			if (editor instanceof IEditingDomainProvider) {
				EditingDomain editingDomain = ((IEditingDomainProvider)editor).getEditingDomain();
				if (editingDomain != null) {
					resourceSet = editingDomain.getResourceSet();
				}
			}
			if (resourceSet == null) {
				resourceSet = ecoreResource.getResourceSet();
			}
			MetaModelManagerResourceSetAdapter adapter = MetaModelManagerResourceSetAdapter.getAdapter(resourceSet, null);
			MetaModelManager metaModelManager = adapter.getMetaModelManager();
//			ResourceSetImpl csResourceSet = new ResourceSetImpl();
			Set<EPackage> ePackages = new HashSet<EPackage>();
			for (URI uri : getURIs()) {
				CompleteOCLEObjectValidator completeOCLEObjectValidator = new CompleteOCLEObjectValidator(ecoreResource, uri, metaModelManager)
				{
					{
						initialize();
					}
				};
/*				try {
					Resource csResource = csResourceSet.createResource(uri, "org.eclipse.ocl.examples.completeOCL");
					csResource.load(null);
					if (!processResource(csResource)) {
						return false;
					}
				} catch (RuntimeException e) {
					EMFEditUIPlugin.INSTANCE.log(e);
				} catch (IOException e) {
					EMFEditUIPlugin.INSTANCE.log(e);
				} */
				for (TreeIterator<EObject> tit = ecoreResource.getAllContents(); tit.hasNext(); ) {
					EObject eObject = tit.next();
					EPackage ePackage = eObject.eClass().getEPackage();
					if (ePackages.add(ePackage)) {
						EValidator.Registry.INSTANCE.put(ePackage, completeOCLEObjectValidator);
					}
				}
			}
			return true;
		}

		@Override
		protected boolean processResource(Resource resource) {
			// FIXME errors, install
			return true;
		}
	}

	private IEditorPart editor = null;
	private Resource ecoreResource = null;
	
	/**
	 * Initializes me.
	 */
	public LoadOCLResourceDelegate() {
		super();
	}

	public void run(IAction action) {
		if (ecoreResource != null) {
			Shell shell = editor.getSite().getShell();
			ResourceDialog dialog = new ResourceDialog(shell, domain);
			dialog.open();
	  /*	      if (loadResourceDialog.open() == Window.OK && !loadResourceDialog.getRegisteredPackages().isEmpty())
	  	      {
	  	        String source = EcoreEditorPlugin.INSTANCE.getSymbolicName();
	  	        BasicDiagnostic diagnosic = 
	  	          new BasicDiagnostic(Diagnostic.INFO, source, 0, EcoreEditorPlugin.INSTANCE.getString("_UI_RuntimePackageDetail_message"), null);
	  	        for (EPackage ePackage : loadResourceDialog.getRegisteredPackages())
	  	        {
	  	          diagnosic.add(new BasicDiagnostic(Diagnostic.INFO, source, 0, ePackage.getNsURI(), null));
	  	        }
	  	        new DiagnosticDialog
	  	         (shell, 
	  	          EcoreEditorPlugin.INSTANCE.getString("_UI_Information_title"), 
	  	          EcoreEditorPlugin.INSTANCE.getString("_UI_RuntimePackageHeader_message"),
	  	          diagnosic,
	  	          Diagnostic.INFO).open();
	  	      } */
	  	     
    	}
	}
	
	protected void consoleOpened(OCLConsole console) {
	    // do nothing
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = targetEditor;
	}

    public void selectionChanged(IAction action, ISelection selection) {
    	ecoreResource = null;
    	if (selection instanceof IStructuredSelection) {
    		for (Iterator it = ((IStructuredSelection)selection).iterator(); it.hasNext(); ) {
    			Object aSelection = it.next();
    			if (aSelection instanceof EObject) {
    				aSelection = ((EObject)aSelection).eResource();
    			}
    			if (aSelection instanceof Resource) {
    				ecoreResource = (Resource)aSelection;
    				break;
    			}
    		}
    	}
		System.out.println("selectionChanged " + selection);
	}

	public void init(IAction action) {
	}

	public void dispose() {
	}

	public void runWithEvent(IAction action, Event event) {
		run(action);
	}
}
