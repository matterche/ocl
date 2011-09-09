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
package org.eclipse.ocl.examples.xtext.base.cs2pivot;

import java.util.List;

import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;

public class PivotHasSuperClassesDependency extends AbstractDependency<TypedTypeRefCS>
{
	public PivotHasSuperClassesDependency(TypedTypeRefCS csElement) {
		super(csElement);
	}

	@Override
	public boolean canExecute() {
		Type pivot = element.getType();
		if (pivot == null) {
			return false;
		}
		Type type = PivotUtil.getUnspecializedTemplateableElement(pivot);
		assert type == pivot;		// WIP
		if (type instanceof AnyType) {
			return true;
		}
		if (!(type instanceof org.eclipse.ocl.examples.pivot.Class)) {
			return true;
		}
		List<org.eclipse.ocl.examples.pivot.Class> superClasses = ((org.eclipse.ocl.examples.pivot.Class)type).getSuperClasses();
		return !superClasses.isEmpty();
	}
}