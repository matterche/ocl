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
 * $Id: LibRootPackageAttribution.java,v 1.2 2011/05/22 16:42:11 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.attributes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.xtext.base.attributes.RootPackageCSAttribution;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.MetaTypeName;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTFactory;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage;

public class LibRootPackageCSAttribution extends RootPackageCSAttribution
{
	public static final LibRootPackageCSAttribution INSTANCE = new LibRootPackageCSAttribution();

	private static List<MetaTypeName> metaTypeNames = null;

	@Override
	public ScopeView computeLookup(EObject target, EnvironmentView environmentView, ScopeView scopeView) {
		RootPackageCS targetElement = (RootPackageCS)target;
		if (environmentView.getReference() == OCLstdlibCSTPackage.Literals.LIB_CLASS_CS__META_TYPE_NAME) {
			if (metaTypeNames == null) {
				metaTypeNames = new ArrayList<MetaTypeName>();
				for (EClassifier eClassifier : PivotPackage.eINSTANCE.getEClassifiers()) {
					if (eClassifier instanceof EClass) {
						if (PivotPackage.Literals.CLASS.isSuperTypeOf((EClass) eClassifier)) {
							MetaTypeName metaTypeName = OCLstdlibCSTFactory.eINSTANCE.createMetaTypeName();
							metaTypeName.setName(eClassifier.getName());
							metaTypeNames.add(metaTypeName);
						}
					}
				}
			}
			environmentView.addElements(metaTypeNames);
			return null;
		}
		else {
			return super.computeLookup(targetElement, environmentView, scopeView);
		}
	}
}
