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
 * $Id: EnumerationAttribution.java,v 1.5 2011/04/25 09:50:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;

public class EnumerationAttribution extends AbstractAttribution
{
	public static final EnumerationAttribution INSTANCE = new EnumerationAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		org.eclipse.ocl.examples.pivot.Enumeration targetEnumeration = (org.eclipse.ocl.examples.pivot.Enumeration) target;
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addElements(targetEnumeration.getOwnedLiteral());
		environmentView.addElementsOfScope(metaModelManager.getEnumerationType(), scopeView);
		if (!environmentView.hasFinalResult()) {
			environmentView.addElementsOfScope(metaModelManager.getOclAnyType(), scopeView);
		}	// FIXME Use EnvironmentView.addInheritedContents consistently
		return scopeView.getParent();
	}
}
