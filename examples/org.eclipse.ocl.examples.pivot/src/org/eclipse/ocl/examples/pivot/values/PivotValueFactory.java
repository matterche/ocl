/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ValueFactoryImpl.java,v 1.9 2011/05/07 16:41:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.values;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.impl.AbstractValueFactory;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotValueFactory extends AbstractValueFactory
{
	public PivotValueFactory(MetaModelManager metaModelManager) {
		super(metaModelManager);
	}

	@Override
	public Object getEcoreValueOf(Value value) {
		Object ecoreValue = super.getEcoreValueOf(value);
		if (ecoreValue instanceof Element) {
			EObject target = ((Element)ecoreValue).getETarget();
			if (target instanceof EEnumLiteral) {
				return ((EEnumLiteral)target).getInstance();
			}
			return target;
		}
		return ecoreValue;
	}

	public MetaModelManager getMetaModelManager() {
		return (MetaModelManager) getStandardLibrary();
	}
}
 