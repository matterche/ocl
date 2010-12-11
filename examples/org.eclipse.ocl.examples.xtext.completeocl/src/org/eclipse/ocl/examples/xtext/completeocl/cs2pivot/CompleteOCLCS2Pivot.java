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
 * $Id: CompleteOCLCS2Pivot.java,v 1.1.2.2 2010/12/11 10:44:23 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.utilities.PivotManager;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLCS2Pivot;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreCSTPackage;

public class CompleteOCLCS2Pivot extends EssentialOCLCS2Pivot
{	
	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			EssentialOCLCS2Pivot.FACTORY.getClass();
			CS2Pivot.addFactory(this);
		}

		public CompleteOCLPostOrderVisitor createPostOrderVisitor(CS2PivotConversion converter) {
			return new CompleteOCLPostOrderVisitor(converter);
		}

		public CompleteOCLPreOrderVisitor createPreOrderVisitor(CS2PivotConversion converter) {
			return new CompleteOCLPreOrderVisitor(converter);
		}

		public BaseCSVisitor<ScopeCSAdapter, PivotManager> createScopeVisitor(PivotManager pivotManager) {
			return new CompleteOCLScopeVisitor(pivotManager);
		}

		public EPackage getEPackage() {
			return OCLinEcoreCSTPackage.eINSTANCE;
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();
		
	public CompleteOCLCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, PivotManager pivotManager) {
		super(cs2pivotResourceMap, pivotManager);
	}
}
