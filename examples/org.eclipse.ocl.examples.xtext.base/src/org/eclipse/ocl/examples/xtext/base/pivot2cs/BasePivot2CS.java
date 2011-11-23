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
 * $Id: BasePivot2CS.java,v 1.2 2011/01/24 21:00:30 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.pivot2cs;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class BasePivot2CS extends Pivot2CS
{	
	private static final class Factory implements Pivot2CS.Factory
	{
		private static Pivot2CS.Factory INSTANCE = new Factory();

		public BaseDeclarationVisitor createDeclarationVisitor(Pivot2CSConversion converter) {
			return new BaseDeclarationVisitor(converter);
		}

		public BaseReferenceVisitor createReferenceVisitor(Pivot2CSConversion converter) {
			return new BaseReferenceVisitor(converter);
		}

		public EClass[] getEClasses() {
			return new EClass[] {};
		}
	}

	public BasePivot2CS(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap,
			MetaModelManager metaModelManager) {
		super(cs2pivotResourceMap, metaModelManager);
		addFactory(Factory.INSTANCE);
	}
}