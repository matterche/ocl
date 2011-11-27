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
 * $Id: CompleteOCLScopeVisitor.java,v 1.6 2011/05/20 15:26:50 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import org.eclipse.ocl.examples.xtext.base.scoping.cs.CSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.EmptyCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.scoping.ClassifierContextScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.scoping.CompleteOCLDocumentScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.scoping.IncludeScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.scoping.OperationContextScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.scoping.PackageDeclarationScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.scoping.PropertyContextScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.util.AbstractExtendingDelegatingCompleteOCLCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLScopeVisitor;

public class CompleteOCLScopeVisitor
	extends AbstractExtendingDelegatingCompleteOCLCSVisitor<CSScopeAdapter, Object, EssentialOCLScopeVisitor>
{
	public CompleteOCLScopeVisitor() {
		super(new EssentialOCLScopeVisitor(), null);
	}

	@Override
	public CSScopeAdapter visitClassifierContextDeclCS(ClassifierContextDeclCS eObject) {
		return ClassifierContextScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitCompleteOCLDocumentCS(CompleteOCLDocumentCS eObject) {
		return CompleteOCLDocumentScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitContextConstraintCS(ContextConstraintCS eObject) {
		return EmptyCSScopeAdapter.INSTANCE;
	}
	
	@Override
	public CSScopeAdapter visitIncludeCS(IncludeCS eObject) {
		return new IncludeScopeAdapter();
	}

	@Override
	public CSScopeAdapter visitOperationContextDeclCS(OperationContextDeclCS eObject) {
		return OperationContextScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitPackageDeclarationCS(PackageDeclarationCS eObject) {
		return PackageDeclarationScopeAdapter.INSTANCE;
	}

	@Override
	public CSScopeAdapter visitPropertyContextDeclCS(PropertyContextDeclCS eObject) {
		return PropertyContextScopeAdapter.INSTANCE;
	}
}