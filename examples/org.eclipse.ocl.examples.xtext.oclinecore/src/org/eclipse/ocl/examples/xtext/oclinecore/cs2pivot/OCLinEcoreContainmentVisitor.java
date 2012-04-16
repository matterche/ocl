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
package org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot;

import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLContainmentVisitor;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreConstraintCS;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreSpecificationCS;
import org.eclipse.ocl.examples.xtext.oclinecore.util.OCLinEcoreCSVisitor;

public class OCLinEcoreContainmentVisitor extends EssentialOCLContainmentVisitor implements OCLinEcoreCSVisitor<Continuation<?>, CS2PivotConversion>
{
	public OCLinEcoreContainmentVisitor(CS2PivotConversion context) {
		super(context);
	}

	public Continuation<?> visitOCLinEcoreConstraintCS(OCLinEcoreConstraintCS csElement) {
		return visitConstraintCS(csElement);
	}

	public Continuation<?> visitOCLinEcoreSpecificationCS(OCLinEcoreSpecificationCS csElement) {
		return visitExpSpecificationCS(csElement);
	}
}
