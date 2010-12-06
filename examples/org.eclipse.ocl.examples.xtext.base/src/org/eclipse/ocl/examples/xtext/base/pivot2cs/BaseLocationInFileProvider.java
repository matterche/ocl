/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: BaseLocationInFileProvider.java,v 1.1.2.1 2010/12/06 17:53:58 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.pivot2cs;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.examples.pivot.Comment;
import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.util.TextLocation;

public class BaseLocationInFileProvider extends DefaultLocationInFileProvider {

	@Override
	public TextLocation getLocation(EObject owner,
			EStructuralFeature feature, int indexInList) {
		// TODO Auto-generated method stub
		return super.getLocation(owner, feature, indexInList);
	}

	@Override
	public TextLocation getLocation(EObject obj) {
		if (obj instanceof MonikeredElement) {
			MonikeredElementCS csMonikeredElement = getCsElement(obj);
			if (csMonikeredElement != null) {
				return super.getLocation(csMonikeredElement);
			}
		}
		else if (obj instanceof Comment) {
			MonikeredElementCS csMonikeredElement = getCsElement(obj.eContainer());
			if (csMonikeredElement != null) {
				CompositeNode node = NodeUtil.getNode(csMonikeredElement);
				List<LeafNode> documentationNodes = CS2Pivot.getDocumentationNodes(node);
				LeafNode first = documentationNodes.get(0);
				LeafNode last = documentationNodes.get(documentationNodes.size()-1);
				int start = first.getOffset();
				int end = last.getOffset() + last.getLength();
				return new TextLocation(start, end-start);
			}
		}
		return super.getLocation(obj);
	}

	protected MonikeredElementCS getCsElement(EObject obj) {
		String moniker = ((MonikeredElement) obj).getMoniker();
		Resource resource = obj.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		CS2Pivot cs2Pivot = CS2Pivot.findAdapter(resourceSet);
		Map<String, MonikeredElementCS> moniker2CSMap = cs2Pivot.computeMoniker2CSMap();
		MonikeredElementCS csMonikeredElement = moniker2CSMap.get(moniker);
		return csMonikeredElement;
	}
	
}