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
 * $Id: OCLstdlibCS2Pivot.java,v 1.2 2011/01/24 22:28:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.cs2pivot;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLCS2Pivot;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;

public class OCLstdlibCS2Pivot extends EssentialOCLCS2Pivot
{	
	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			EssentialOCLCS2Pivot.FACTORY.getClass();
			CS2Pivot.addFactory(this);
		}

		public OCLstdlibContainmentVisitor createContainmentVisitor(CS2PivotConversion converter) {
			return new OCLstdlibContainmentVisitor(converter);
		}

		public OCLstdlibLeft2RightVisitor createLeft2RightVisitor(CS2PivotConversion converter) {
			return new OCLstdlibLeft2RightVisitor(converter);
		}

		public OCLstdlibPostOrderVisitor createPostOrderVisitor(CS2PivotConversion converter) {
			return new OCLstdlibPostOrderVisitor(converter);
		}

		public OCLstdlibPreOrderVisitor createPreOrderVisitor(CS2PivotConversion converter) {
			return new OCLstdlibPreOrderVisitor(converter);
		}

		public EPackage getEPackage() {
			return OCLstdlibCSTPackage.eINSTANCE;
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();
		
	public OCLstdlibCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, MetaModelManager metaModelManager) {
		super(cs2pivotResourceMap, metaModelManager);
	}

	@Override
	public synchronized void update(IDiagnosticConsumer diagnosticsConsumer) {
		metaModelManager.setLibraryLoadInProgress(true);
		try {
			super.update(diagnosticsConsumer);
		} finally {
			metaModelManager.setLibraryLoadInProgress(false);
		}
	}
}
