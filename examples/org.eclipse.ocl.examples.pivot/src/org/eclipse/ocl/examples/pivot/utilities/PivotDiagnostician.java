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
 * $Id$
 */
package org.eclipse.ocl.examples.pivot.utilities;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;

public class PivotDiagnostician extends Diagnostician
{
	public static PivotDiagnostician INSTANCE = new PivotDiagnostician();
	
	@Override
	public String getObjectLabel(EObject eObject) {
		return DomainUtil.getLabel(eObject);
	}

	@Override
	public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
		return DomainUtil.getLabel(eStructuralFeature);
	}

	@Override
	public String getValueLabel(EDataType eDataType, Object value) {
		return DomainUtil.getLabel(eDataType, value, null);
	}
}
