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
 * $Id: CompleteOCLPreOrderVisitor.java,v 1.11 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.completeocl.util.CompleteOCLCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLLeft2RightVisitor;

public class AbstractCompleteOCLLeft2RightVisitor
	extends EssentialOCLLeft2RightVisitor implements CompleteOCLCSVisitor<Element>
{	
	//
	//	This file is maintained by copying from AbstractExtendingCompleteOCLCSVisitor and changing R to Element.
	//
	protected AbstractCompleteOCLLeft2RightVisitor(CS2PivotConversion context) {
	    super(context);
	}	

	public Element visitBodyCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.BodyCS object) {
		return visitContextConstraintCS(object);
	}

	public Element visitClassifierContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS object) {
		return visitContextDeclCS(object);
	}

	public Element visitCompleteOCLDocumentCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS object) {
		return visitPackageCS(object);
	}

	public Element visitContextConstraintCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS object) {
		return visitConstraintCS(object);
	}

	public Element visitContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS object) {
		return visitPathNameDeclCS(object);
	}

	public Element visitContextSpecificationCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextSpecificationCS object) {
		return visitExpSpecificationCS(object);
	}

	public Element visitDefCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS object) {
		return visitContextConstraintCS(object);
	}

	public Element visitDerCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS object) {
		return visitContextConstraintCS(object);
	}

	public Element visitFeatureContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.FeatureContextDeclCS object) {
		return visitContextDeclCS(object);
	}

	public Element visitIncludeCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS object) {
		return visitNamedElementCS(object);
	}

	public Element visitInitCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS object) {
		return visitContextConstraintCS(object);
	}

	public Element visitInvCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS object) {
		return visitContextConstraintCS(object);
	}

	public Element visitOclMessageArgCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OclMessageArgCS object) {
		return visitExpCS(object);
	}

	public Element visitOperationContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS object) {
		return visitFeatureContextDeclCS(object);
	}

	public Element visitPackageDeclarationCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS object) {
		return visitPathNameDeclCS(object);
	}

	public Element visitPathNameDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PathNameDeclCS object) {
		return visitModelElementCS(object);
	}

	public Element visitPostCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS object) {
		return visitContextConstraintCS(object);
	}

	public Element visitPreCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS object) {
		return visitContextConstraintCS(object);
	}

	public Element visitPropertyContextDeclCS(org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS object) {
		return visitFeatureContextDeclCS(object);
	}
}