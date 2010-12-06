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
 * $Id: OCLinEcoreCSScopeProvider.java,v 1.1.2.2 2010/12/06 18:28:19 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.DefaultScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.EssentialOCLCSScopeProvider;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreCSTPackage;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.util.OCLinEcoreCSTSwitch;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class OCLinEcoreCSScopeProvider extends EssentialOCLCSScopeProvider
{
	protected static class Factory extends EssentialOCLCSScopeProvider.Factory
	{
		protected Factory() {
			addSwitch(OCLinEcoreCSTPackage.eINSTANCE, new OCLinEcoreScopeSwitch());
		}
	}

	public static ModelElementCSScopeAdapter.Factory FACTORY = new Factory();
	
	public static class OCLinEcoreScopeSwitch 
		extends OCLinEcoreCSTSwitch<ScopeAdapter>
		implements ScopeAdapter.Switch
	{
//		@Override
//		public ScopeAdapter caseOCLinEcoreDocumentCS(OCLinEcoreDocumentCS eObject) {
//			return new OCLinEcoreDocumentScopeAdapter(eObject);
//		}

//		@Override
//		public ScopeAdapter caseOCLinEcorePackageCS(OCLinEcorePackageCS eObject) {
//			return new OCLinEcorePackageScopeAdapter(eObject);
//		}

		@Override
		public ScopeAdapter defaultCase(EObject eObject) {
			return new DefaultScopeAdapter(eObject);
		}

		public ScopeAdapter doInPackageSwitch(EObject eObject) {
			return doSwitch(eObject.eClass(), eObject);
		}
	}
}
