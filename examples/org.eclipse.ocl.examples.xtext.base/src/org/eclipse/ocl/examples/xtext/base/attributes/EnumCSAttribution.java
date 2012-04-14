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
 * $Id: EnumCSAttribution.java,v 1.3 2011/04/25 09:50:02 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.AbstractAttribution;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;

public class EnumCSAttribution extends AbstractAttribution
{
	public static final EnumCSAttribution INSTANCE = new EnumCSAttribution();

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		EnumerationCS targetElement = (EnumerationCS)target;
		Enumeration pivot = PivotUtil.getPivot(Enumeration.class, targetElement);
		if (pivot != null) {
			environmentView.addNamedElements(pivot.getOwnedLiteral());
			environmentView.addElements(PivotUtil.getTemplateParameters(pivot));
		}
		MetaModelManager metaModelManager = environmentView.getMetaModelManager();
		environmentView.addLibContents(metaModelManager.getOclAnyType(), scopeView);
		return scopeView.getOuterScope();
	}
}
