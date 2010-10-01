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
 * $Id: OCLinEcore2MonikerSwitch.java,v 1.1.2.1 2010/10/01 14:48:52 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.oclinecore.utilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.pivot.utilities.PivotConstants;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCS2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.OCLinEcoreCSTPackage;
import org.eclipse.ocl.examples.xtext.oclinecore.oclinEcoreCST.util.OCLinEcoreCSTSwitch;

public class OCLinEcore2MonikerSwitch extends OCLinEcoreCSTSwitch<Object> implements PivotConstants, CS2Moniker.Switch
{	
	private static final class Factory extends CS2Moniker.Factory
	{
		private Factory() {
			EssentialOCLCS2MonikerSwitch.FACTORY.getClass();
			CS2Moniker.addFactory(this);
			roleNames.put(OCLinEcoreCSTPackage.Literals.OC_LIN_ECORE_CONSTRAINT_CS__OWNED_EXPRESSION, "exp");
			roleNames.put(OCLinEcoreCSTPackage.Literals.OC_LIN_ECORE_CONSTRAINT_CS__OWNED_REASON, "reason");
		}
		
		@Override
		public CS2Moniker.Switch create(CS2Moniker moniker) {
			return new OCLinEcore2MonikerSwitch(moniker);
		}

		public EPackage getEPackage() {
			return OCLinEcoreCSTPackage.eINSTANCE;
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();
		
	protected final CS2Moniker moniker;
	protected final BaseCS2MonikerSwitch baseSwitch;
	
	public OCLinEcore2MonikerSwitch(CS2Moniker moniker) {
		this.moniker = moniker;			
		baseSwitch = (BaseCS2MonikerSwitch) moniker.getSwitch(BaseCS2MonikerSwitch.FACTORY);
	}

//	@Override
//	public Object caseOCLinEcoreDocumentCS(OCLinEcoreDocumentCS object) {
//		return baseSwitch.caseRootPackageCS(object);
//	}

//	@Override
//	public Object caseOCLinEcorePackageCS(OCLinEcorePackageCS object) {
//		return baseSwitch.casePackageCS(object);
//	}

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
