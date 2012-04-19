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
 * $Id: OCLinEcorePostOrderVisitor.java,v 1.4 2011/03/01 08:46:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot;

import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreConstraintCS;

public class OCLinEcorePostOrderVisitor extends AbstractOCLinEcorePostOrderVisitor
{
	public OCLinEcorePostOrderVisitor(CS2PivotConversion context) {
		super(context);
	}

	@Override
	public Continuation<?> visitOCLinEcoreConstraintCS(OCLinEcoreConstraintCS csConstraint) {
		Continuation<?> continuation = super.visitOCLinEcoreConstraintCS(csConstraint);
		Constraint pivotElement = PivotUtil.getPivot(Constraint.class, csConstraint);
		pivotElement.setIsCallable(csConstraint.isCallable());
		return continuation;
	}
}