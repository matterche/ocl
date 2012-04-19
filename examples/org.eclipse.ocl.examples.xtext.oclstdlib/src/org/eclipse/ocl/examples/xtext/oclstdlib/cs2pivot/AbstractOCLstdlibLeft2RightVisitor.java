/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: OCLstdlibPreOrderVisitor.java,v 1.11 2011/05/20 15:27:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.cs2pivot;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLLeft2RightVisitor;
import org.eclipse.ocl.examples.xtext.oclstdlib.util.OCLstdlibCSVisitor;

public class AbstractOCLstdlibLeft2RightVisitor
	extends EssentialOCLLeft2RightVisitor implements OCLstdlibCSVisitor<Element>
{
	//
	//	This file is maintained by copying from AbstractExtendingOCLstdlibCSVisitor and changing R to Element.
	//
	protected AbstractOCLstdlibLeft2RightVisitor(CS2PivotConversion context) {
	    super(context);
	}	

	public Element visitLibClassCS(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibClassCS object) {
		return visitClassCS(object);
	}

	public Element visitLibConstraintCS(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibConstraintCS object) {
		return visitConstraintCS(object);
	}

	public Element visitLibIterationCS(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibIterationCS object) {
		return visitOperationCS(object);
	}

	public Element visitLibOperationCS(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibOperationCS object) {
		return visitOperationCS(object);
	}

	public Element visitLibPropertyCS(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibPropertyCS object) {
		return visitAttributeCS(object);
	}

	public Element visitLibRootPackageCS(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibRootPackageCS object) {
		return visitRootPackageCS(object);
	}

	public Element visitMetaTypeName(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.MetaTypeName object) {
		return visiting(object);
	}

	public Element visitPrecedenceCS(org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.PrecedenceCS object) {
		return visitNamedElementCS(object);
	}
}