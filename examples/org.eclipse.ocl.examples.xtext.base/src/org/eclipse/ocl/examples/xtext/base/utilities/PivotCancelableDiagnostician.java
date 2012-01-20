/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.base.utilities;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.xtext.validation.CancelableDiagnostician;

import com.google.inject.Inject;

public class PivotCancelableDiagnostician extends CancelableDiagnostician
{
	@Inject
	public PivotCancelableDiagnostician(EValidator.Registry registry) {
		super(registry);
	}
	
	@Override
	public String getObjectLabel(EObject eObject) {
		return String.valueOf(eObject);
	}

	@Override
	public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
		return String.valueOf(eStructuralFeature);
	}

	@Override
	public String getValueLabel(EDataType eDataType, Object value) {
		return String.valueOf(value);
	}
}
