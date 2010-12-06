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
 * $Id: PivotTypeOfDependency.java,v 1.1.2.1 2010/12/06 18:03:09 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.xtext.base.baseCST.MonikeredElementCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Dependency;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionLiteralPartCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;

public class PivotTypeOfDependency extends Dependency<MonikeredElementCS>
{
	public PivotTypeOfDependency(ExpCS csElement) {
		super(csElement);
	}

	public PivotTypeOfDependency(CollectionLiteralPartCS csElement) {
		super(csElement);
	}

	@Override
	public boolean canExecute() {
		Element pivot = element.getPivot();
		if (pivot == null) {
			return false;
		}
		return ((TypedElement)pivot).getType() != null;
	}
}