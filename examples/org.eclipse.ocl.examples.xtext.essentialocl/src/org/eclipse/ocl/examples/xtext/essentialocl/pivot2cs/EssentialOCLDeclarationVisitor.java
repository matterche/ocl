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
 * $Id: EssentialOCLDeclarationVisitor.java,v 1.1.2.1 2010/12/06 18:03:08 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.pivot2cs;

import org.apache.log4j.Logger;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.BaseDeclarationVisitor;
import org.eclipse.ocl.examples.xtext.base.pivot2cs.Pivot2CSConversion;

public class EssentialOCLDeclarationVisitor extends BaseDeclarationVisitor
{
	static final Logger logger = Logger.getLogger(EssentialOCLDeclarationVisitor.class);

	public EssentialOCLDeclarationVisitor(Pivot2CSConversion context) {
		super(context);
	}	
}