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
 * $Id: OCLinEcoreLeft2RightVisitor.java,v 1.1.2.1 2010/12/13 08:15:04 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.cs2pivot;

import org.eclipse.ocl.examples.pivot.MonikeredElement;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLLeft2RightVisitor;
import org.eclipse.ocl.examples.xtext.oclinecore.util.AbstractExtendingDelegatingOCLinEcoreCSVisitor;

public class OCLinEcoreLeft2RightVisitor
	extends AbstractExtendingDelegatingOCLinEcoreCSVisitor<MonikeredElement, CS2PivotConversion, EssentialOCLLeft2RightVisitor>
{
	public OCLinEcoreLeft2RightVisitor(CS2PivotConversion context) {
		super(new EssentialOCLLeft2RightVisitor(context), context);
	}
}