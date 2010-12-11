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
 * $Id: OCLinEcoreLinkingService.java,v 1.7.6.3 2010/12/11 10:44:27 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.services;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.utilities.CS2PivotResourceSetAdapter;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.baseCST.BaseCSTPackage;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ImportScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.ElementUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.services.EssentialOCLLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.parsetree.AbstractNode;

public class OCLinEcoreLinkingService extends EssentialOCLLinkingService
{
//	private static final Logger log = Logger.getLogger(OCLinEcoreLinkingService.class);
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, AbstractNode node) throws IllegalNodeException {
		if ((ref == BaseCSTPackage.Literals.IMPORT_CS__NAMESPACE) && (context instanceof ImportCS)) {
			return getLinkedImport((ModelElementCS)context, node);
		}
		return super.getLinkedObjects(context, ref, node);
	}

	private List<EObject> getLinkedImport(ModelElementCS context, AbstractNode node) {
		ScopeAdapter scopeAdapter = ElementUtil.getScopeAdapter(context);
		String text = getText(node);
		if ((scopeAdapter instanceof ImportScopeAdapter) && (text != null)) {
			Resource csResource = context.eResource();
			URI uri = URI.createURI(text);
			uri = uri.resolve(csResource.getURI());
			ImportScopeAdapter importScopeAdapter = (ImportScopeAdapter)scopeAdapter;
			URI oldURI = importScopeAdapter.getURI();
			Element importedElement;				
			if (uri.equals(oldURI)) {
				importedElement = importScopeAdapter.getImportedElement();
			}
			else {
				CS2PivotResourceSetAdapter adapter = CS2PivotResourceSetAdapter.getAdapter(csResource.getResourceSet(), null);
				PivotManager pivotManager = adapter.getPivotManager();
				importedElement = pivotManager.loadResource(uri, ((ImportCS)context).getName());				
				importScopeAdapter.setImportedElement(uri, importedElement);
			}
			if (importedElement != null) {
				return Collections.<EObject>singletonList(importedElement);
			}
		}
		return Collections.emptyList();
	}
}
