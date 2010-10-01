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
 * $Id: CompleteOCLScopeProvider.java,v 1.6.6.1 2010/10/01 15:03:01 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.EmptyCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scoping.cs.ModelElementCSScopeAdapter;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.BodyCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DerCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InitCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.InvCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PreCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.util.CompleteOCLCSTSwitch;
import org.eclipse.ocl.examples.xtext.essentialocl.scoping.EssentialOCLCSScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class CompleteOCLScopeProvider extends EssentialOCLCSScopeProvider
{
	protected static final class Factory extends EssentialOCLCSScopeProvider.Factory
	{
		protected Factory() {
			addSwitch(CompleteOCLCSTPackage.eINSTANCE, new CompleteOCLScopeSwitch());
		}
	}

	public static ModelElementCSScopeAdapter.Factory FACTORY = new Factory();
	
	public static class CompleteOCLScopeSwitch 
	extends CompleteOCLCSTSwitch<ScopeAdapter>
	implements ScopeAdapter.Switch
	{
		@Override
		public ScopeAdapter caseBodyCS(BodyCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseClassifierContextDeclCS(ClassifierContextDeclCS eObject) {
			return new ClassifierContextScopeAdapter(eObject);
		}
	
		@Override
		public ScopeAdapter caseCompleteOCLDocumentCS(CompleteOCLDocumentCS eObject) {
			return new CompleteOCLDocumentScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseDefCS(DefCS eObject) {
			return new DefScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseDerCS(DerCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseInitCS(InitCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseInvCS(InvCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter caseOperationContextDeclCS(OperationContextDeclCS eObject) {
			return new OperationContextScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter casePackageDeclarationCS(PackageDeclarationCS eObject) {
			return new PackageDeclarationScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter casePostCS(PostCS eObject) {
			return new PostScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter casePreCS(PreCS eObject) {
			return new EmptyCSScopeAdapter(eObject);
		}

//		@Override
//		public ScopeAdapter casePreExpCS(PreExpCS eObject) {
//			return new PreExpCSScopeAdapter(eObject);
//		}

		@Override
		public ScopeAdapter casePropertyContextDeclCS(PropertyContextDeclCS eObject) {
			return new PropertyContextScopeAdapter(eObject);
		}

		@Override
		public ScopeAdapter defaultCase(EObject eObject) {
			return new EmptyCSScopeAdapter((ModelElementCS) eObject);
		}

		public ScopeAdapter doInPackageSwitch(EObject eObject) {
			return doSwitch(eObject.eClass(), eObject);
		}
	}
}
