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
 * $Id: CompleteOCL2MonikerSwitch.java,v 1.1.2.1 2010/10/01 15:03:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.utilities;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.xtext.base.utilities.CS2Moniker;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCS2MonikerSwitch;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ExpConstraintCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.util.CompleteOCLCSTSwitch;
import org.eclipse.ocl.examples.xtext.essentialocl.utilities.EssentialOCLCS2MonikerSwitch;

public class CompleteOCL2MonikerSwitch extends CompleteOCLCSTSwitch<Object> implements CS2Moniker.Switch
{	
	private static final class Factory extends CS2Moniker.Factory
	{
		private Factory() {
			EssentialOCLCS2MonikerSwitch.FACTORY.getClass();
			CS2Moniker.addFactory(this);
		}
		
		@Override
		public CS2Moniker.Switch create(CS2Moniker moniker) {
			return new CompleteOCL2MonikerSwitch(moniker);
		}

		public EPackage getEPackage() {
			return CompleteOCLCSTPackage.eINSTANCE;
		}
	}

	public static CS2Moniker.Factory FACTORY = new Factory();
		
	protected final CS2Moniker moniker;
	protected final BaseCS2MonikerSwitch baseSwitch;
	
	public CompleteOCL2MonikerSwitch(CS2Moniker moniker) {
		this.moniker = moniker;			
		baseSwitch = (BaseCS2MonikerSwitch) moniker.getSwitch(BaseCS2MonikerSwitch.FACTORY);
	}

	@Override
	public Object caseClassifierContextDeclCS(ClassifierContextDeclCS object) {
		moniker.appendElement(object.getClassifier());
		return true;
	}

	@Override
	public Object caseCompleteOCLDocumentCS(CompleteOCLDocumentCS object) {
		return baseSwitch.caseRootPackageCS(object);
	}

	@Override
	public Object caseContextDeclCS(ContextDeclCS object) {
		// TODO Auto-generated method stub
		return super.caseContextDeclCS(object);
	}

	@Override
	public Object caseDefCS(DefCS object) {
		// TODO Auto-generated method stub
		return super.caseDefCS(object);
	}

	@Override
	public Object caseDerCS(DerCS object) {
		// TODO Auto-generated method stub
		return super.caseDerCS(object);
	}

	@Override
	public Object caseExpConstraintCS(ExpConstraintCS object) {
		moniker.appendParent(object, "@");
		moniker.append(object.hashCode());
		return true;
	}

	@Override
	public Object caseInitCS(InitCS object) {
		// TODO Auto-generated method stub
		return super.caseInitCS(object);
	}

	@Override
	public Object caseInvCS(InvCS object) {
		// TODO Auto-generated method stub
		return super.caseInvCS(object);
	}

	@Override
	public Object caseOclMessageArgCS(OclMessageArgCS object) {
		// TODO Auto-generated method stub
		return super.caseOclMessageArgCS(object);
	}

	@Override
	public Object caseOperationContextDeclCS(OperationContextDeclCS object) {
		moniker.appendElement(object.getOperation());
		return true;
	}

	@Override
	public Object casePackageDeclarationCS(PackageDeclarationCS object) {
		moniker.appendElement(object.getPackage());
		return true;
	}

	@Override
	public Object casePostCS(PostCS object) {
		// TODO Auto-generated method stub
		return super.casePostCS(object);
	}

	@Override
	public Object casePreCS(PreCS object) {
		// TODO Auto-generated method stub
		return super.casePreCS(object);
	}

	@Override
	public Object casePropertyContextDeclCS(PropertyContextDeclCS object) {
		moniker.appendElement(object.getProperty());
		return true;
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
