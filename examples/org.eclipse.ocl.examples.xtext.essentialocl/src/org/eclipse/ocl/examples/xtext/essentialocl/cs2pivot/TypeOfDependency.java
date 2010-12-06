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
 * $Id: TypeOfDependency.java,v 1.1.2.1 2010/12/06 18:03:09 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import org.eclipse.ocl.examples.pivot.TypedElement;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Dependency;

public class TypeOfDependency extends Dependency<TypedElement>
{
	public TypeOfDependency(TypedElement element) {
		super(element);
	}

	@Override
	public boolean canExecute() {
		return element.getType() != null;
	}
}