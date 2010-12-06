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
 * $Id: MonikerOCLstdlibCSVisitor.java,v 1.1.2.1 2010/12/06 18:14:19 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.utilities;

import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.util.EssentialOCLCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.MonikerEssentialOCLCSVisitor;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.PrecedenceCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.util.AbstractExtendingDelegatingOCLstdlibCSVisitor;

public class MonikerOCLstdlibCSVisitor
	extends AbstractExtendingDelegatingOCLstdlibCSVisitor<Object, CS2Moniker, EssentialOCLCSVisitor<Object, CS2Moniker>>
	implements PivotConstants
{	
	private static final class Factory implements CS2Moniker.Factory
	{
		private Factory() {
			MonikerEssentialOCLCSVisitor.FACTORY.getClass();
			CS2Moniker.addFactory(OCLstdlibCSTPackage.eINSTANCE, this);
		}
		
		public BaseCSVisitor<?, ?> create(CS2Moniker context) {
			return new MonikerOCLstdlibCSVisitor(context);
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();
		
	@SuppressWarnings("unchecked")
	public MonikerOCLstdlibCSVisitor(CS2Moniker context) {
		super((EssentialOCLCSVisitor<Object, CS2Moniker>) context.getVisitor(EssentialOCLCSTPackage.eINSTANCE), context);
	}

	@Override
	public Object visitPrecedenceCS(PrecedenceCS object) {
		context.appendParentCS(object, PRECEDENCE_PREFIX);
		context.appendNameCS(object);
		return true;
	}
}
