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
package org.eclipse.ocl.examples.xtext.base.utilities;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;

public class PivotDiagnosticConverter extends DiagnosticConverterImpl
{
	@Override
	protected EObject getCauser(Diagnostic diagnostic) {
		EObject causer = super.getCauser(diagnostic);
		if (causer instanceof Element) {
			ModelElementCS csModelElement = ElementUtil.getCsElement((Element) causer);
			if (csModelElement != null) {
				return csModelElement;
			}
		}
		return causer;
	}
}
