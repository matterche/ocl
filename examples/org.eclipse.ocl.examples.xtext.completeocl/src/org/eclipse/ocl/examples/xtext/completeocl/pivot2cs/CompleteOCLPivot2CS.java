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
 * $Id: OCLinEcorePivot2CS.java,v 1.4 2011/03/01 08:46:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.pivot2cs;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.BaseDeclarationVisitor;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.BaseReferenceVisitor;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CS;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CSConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.pivot2cs.EssentialOCLPivot2CS;
import org.eclipse.ocl.examples.xtext.essentialocl.pivot2cs.EssentialOCLReferenceVisitor;

public class CompleteOCLPivot2CS extends EssentialOCLPivot2CS
{	
	private static final class Factory implements Pivot2CS.Factory
	{
		private static Pivot2CS.Factory INSTANCE = new Factory();

		public CompleteOCLDeclarationVisitor createDeclarationVisitor(Pivot2CSConversion converter) {
			return new CompleteOCLDeclarationVisitor(converter);
		}

		public BaseReferenceVisitor createReferenceVisitor(Pivot2CSConversion converter) {
			return new EssentialOCLReferenceVisitor(converter);
		}

		public EClass[] getEClasses() {
			return new EClass[] {
				PivotPackage.Literals.CLASS,
				PivotPackage.Literals.CONSTRAINT,
				PivotPackage.Literals.OPERATION,
				PivotPackage.Literals.PACKAGE,
				PivotPackage.Literals.PARAMETER,
				PivotPackage.Literals.PROPERTY,
				PivotPackage.Literals.TYPE
			};
		}
	}
		
	public CompleteOCLPivot2CS(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, MetaModelManager metaModelManager) {
		super(cs2pivotResourceMap, metaModelManager);
		addFactory(Factory.INSTANCE);
		for (Resource csResource : cs2pivotResourceMap.keySet()) {
			MetaModelManagerResourceAdapter.getAdapter(csResource, metaModelManager);
		}
	}

	@Override
	public BaseDeclarationVisitor createDefaultDeclarationVisitor(Pivot2CSConversion converter) {
		return new CompleteOCLDeclarationVisitor(converter);
	}

	@Override
	public BaseReferenceVisitor createDefaultReferenceVisitor(Pivot2CSConversion converter) {
		return new EssentialOCLReferenceVisitor(converter);
	}
}
