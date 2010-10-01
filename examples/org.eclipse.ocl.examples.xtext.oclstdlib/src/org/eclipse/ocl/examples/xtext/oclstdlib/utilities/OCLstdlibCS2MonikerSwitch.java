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
 * $Id: OCLstdlibCS2MonikerSwitch.java,v 1.1.2.1 2010/10/01 14:34:05 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclstdlib.utilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibIterationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibOperationCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibPropertyCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.OCLstdlibCSTPackage;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.util.OCLstdlibCSTSwitch;

public class OCLstdlibCS2MonikerSwitch extends OCLstdlibCSTSwitch<Object> implements CS2Moniker.Switch
{	
	private static final class Factory extends CS2Moniker.Factory
	{
		private Factory() {
			BaseCS2MonikerSwitch.FACTORY.getClass();
			CS2Moniker.addFactory(this);
		}
		
		@Override
		public CS2Moniker.Switch create(CS2Moniker moniker) {
			return new OCLstdlibCS2MonikerSwitch(moniker);
		}

		public EPackage getEPackage() {
			return OCLstdlibCSTPackage.eINSTANCE;
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();
		
	protected final CS2Moniker moniker;
	protected final BaseCS2MonikerSwitch baseSwitch;
	
	public OCLstdlibCS2MonikerSwitch(CS2Moniker moniker) {
		this.moniker = moniker;
		baseSwitch = (BaseCS2MonikerSwitch) moniker.getSwitch(BaseCS2MonikerSwitch.FACTORY);
	}

	@Override
	public Object caseLibIterationCS(LibIterationCS object) {
		return baseSwitch.caseOperationCS(object);
	}

	@Override
	public Object caseLibOperationCS(LibOperationCS object) {
		return baseSwitch.caseOperationCS(object);
	}

	@Override
	public Object caseLibPropertyCS(LibPropertyCS object) {
		return baseSwitch.caseNamedElementCS(object);
	}

	@Override
	public Object defaultCase(EObject object) {
		return baseSwitch.doSwitch(object);
	}

	public Object doInPackageSwitch(EObject theEObject) {
		int classifierID = theEObject.eClass().getClassifierID();
		return doSwitch(classifierID, theEObject);
	}

	@Override
	public Object doSwitch(EObject theEObject) {
		EClass eClass = theEObject.eClass();
		return doSwitch(eClass, theEObject);
	}

	@Override
	public String toString() {
		return moniker.toString();
	}	
}
