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
 * $Id: CollectionLiteralExpCSScopeAdapter.java,v 1.1.2.1 2010/10/01 14:30:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import java.util.Collections;

import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;

public class CollectionLiteralExpCSScopeAdapter extends ExpCSScopeAdapter<CollectionLiteralExpCS, CollectionLiteralExp>
{
	private Type type = null;
	
	public CollectionLiteralExpCSScopeAdapter(CollectionLiteralExpCS csElement) {
		super(csElement, CollectionLiteralExp.class);
	}
	
	@Override
	public Type getSynthesizedType() {
		if (type == null) {
			CollectionLiteralExpCS target = getTarget();
			CollectionTypeCS collectionTypeCS = target.getOwnedType();
			Type elementType = null;
			for (CollectionLiteralPartCS partCS : target.getOwnedParts()) {
				ExpCS expressionCS = partCS.getExpressionCS();
				ScopeAdapter expressionScopeAdapter = getScopeAdapter(expressionCS);
				Type partElementType = expressionScopeAdapter.getSynthesizedType();
				if (elementType == null) {
					elementType = partElementType;
				}
				else {
					elementType = commonConformantType(elementType, partElementType);
				}
			}
			type = getPivotManager().getLibraryType(collectionTypeCS.getName(), Collections.singletonList(elementType));
		}
		return type;
	}
}
