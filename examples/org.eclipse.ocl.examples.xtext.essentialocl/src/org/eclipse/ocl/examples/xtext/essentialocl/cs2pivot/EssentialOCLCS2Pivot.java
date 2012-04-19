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
 * $Id: EssentialOCLCS2Pivot.java,v 1.10 2011/05/20 15:27:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BaseCS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;

public class EssentialOCLCS2Pivot extends BaseCS2Pivot
{		
	public EssentialOCLCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, MetaModelManager metaModelManager) {
		super(cs2pivotResourceMap, metaModelManager);
	}
	
	
	public EssentialOCLCS2Pivot(EssentialOCLCS2Pivot cs2pivot) {
		super(cs2pivot);
	}

	@Override
	protected EssentialOCLContainmentVisitor createContainmentVisitor(CS2PivotConversion converter) {
		return new EssentialOCLContainmentVisitor(converter);
	}

	@Override
	protected EssentialOCLLeft2RightVisitor createLeft2RightVisitor(CS2PivotConversion converter) {
		return new EssentialOCLLeft2RightVisitor(converter);
	}

	@Override
	protected EssentialOCLPostOrderVisitor createPostOrderVisitor(CS2PivotConversion converter) {
		return new EssentialOCLPostOrderVisitor(converter);
	}

	@Override
	protected EssentialOCLPreOrderVisitor createPreOrderVisitor(CS2PivotConversion converter) {
		return new EssentialOCLPreOrderVisitor(converter);
	}
}
