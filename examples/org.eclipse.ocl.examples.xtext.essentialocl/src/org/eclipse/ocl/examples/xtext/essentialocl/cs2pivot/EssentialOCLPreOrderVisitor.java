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
 * $Id: EssentialOCLPreOrderVisitor.java,v 1.7 2011/05/11 19:26:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedTypeRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasePreOrderVisitor;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.SingleContinuation;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.CollectionTypeCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ConstructorExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ContextCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InfixExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingArgCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigatingExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NavigationOperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.OperatorCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.TypeNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.VariableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.util.AbstractExtendingDelegatingEssentialOCLCSVisitor;

public class EssentialOCLPreOrderVisitor
	extends AbstractExtendingDelegatingEssentialOCLCSVisitor<Continuation<?>, CS2PivotConversion, BasePreOrderVisitor>
{
	protected static class CollectionTypeContinuation extends SingleContinuation<CollectionTypeCS>
	{
		public CollectionTypeContinuation(CS2PivotConversion context, CollectionTypeCS csElement) {
			super(context, null, null, csElement, context.getPackagesHaveTypesInterDependency());
		}

		@Override
		public boolean canExecute() {
			if (!super.canExecute()) {
				return false;
			}
			TypedRefCS csTypedRef = csElement.getOwnedType();			
			if (csTypedRef == null) {
				return true;
			}
			if (csTypedRef instanceof TypedTypeRefCS) {
				NamedElement unspecializedPivotElement = CS2Pivot.basicGetType((TypedTypeRefCS)csTypedRef);
				if (unspecializedPivotElement == null) {
					return false;
				}
//				if (unspecializedPivotElement.eIsProxy()) {
//					return false;
//				}
			}
			if (csTypedRef.getPivot() == null) {
				return false;
			}
			return true;
		}

		@Override
		public BasicContinuation<?> execute() {
			MetaModelManager metaModelManager = context.getMetaModelManager();
			TypedRefCS csElementType = csElement.getOwnedType();
			Type type;
			if (csElementType != null) {
				Type elementType = PivotUtil.getPivot(Type.class, csElementType);
				type = metaModelManager.getLibraryType(csElement.getName(), Collections.singletonList(elementType));
			}
			else {
				type = metaModelManager.getLibraryType(csElement.getName());
			}
			csElement.setPivot(type);
			return null;
		}
	}

	protected static class TypeNameExpContinuation extends SingleContinuation<TypeNameExpCS>
	{
		public TypeNameExpContinuation(CS2PivotConversion context, TypeNameExpCS csElement) {
			super(context, null, null, csElement, context.getPackagesHaveTypesInterDependency());
		}

		@Override
		public BasicContinuation<?> execute() {
			Type element = csElement.getElement();
			if ((element == null) || element.eIsProxy()) {
				String boundMessage = context.bind(csElement, OCLMessages.UnresolvedType_ERROR_, csElement.toString());
				context.addDiagnostic(csElement, boundMessage);
				element = context.getMetaModelManager().getOclInvalidType();	// FIXME with reason
			}
			csElement.setPivot(element);
			return null;
		}
	}

	public EssentialOCLPreOrderVisitor(CS2PivotConversion context) {
		super(new BasePreOrderVisitor(context), context);
	}

	@Override
	public Continuation<?> visitCollectionTypeCS(CollectionTypeCS csCollectionType) {
		// Must at least wait till library types defined
		return new CollectionTypeContinuation(context, csCollectionType);
	}

	@Override
	public Continuation<?> visitConstructorExpCS(ConstructorExpCS csConstructorExp) {
		return null;
	}

	@Override
	public Continuation<?> visitContextCS(ContextCS csContext) {
		return null;
	}

	@Override
	public Continuation<?> visitExpCS(ExpCS csExp) {
		return null;
	}

	@Override
	public Continuation<?> visitNameExpCS(NameExpCS csNameExp) {
		return null;
	}

	@Override
	public Continuation<?> visitNavigatingArgCS(NavigatingArgCS csNavigatingArg) {
		return null;
	}

	@Override
	public Continuation<?> visitNavigatingExpCS(NavigatingExpCS csNavigatingExp) {
		NameExpCS namedExp = (NameExpCS) csNavigatingExp.getSimpleNamedExp();
		if (namedExp != null) {
			CS2Pivot.setElementType(namedExp.getPathName(), PivotPackage.Literals.OPERATION, csNavigatingExp);
		}
		return super.visitNavigatingExpCS(csNavigatingExp);
	}

	@Override
	public Continuation<?> visitNavigationOperatorCS(NavigationOperatorCS object) {
		EObject eContainer = object.eContainer();
		if (eContainer instanceof InfixExpCS) {
			InfixExpCS csInfixExp = (InfixExpCS)eContainer;
			int index = csInfixExp.getOwnedOperator().indexOf(object);
			if (index >= 0) {
				List<ExpCS> expressions = csInfixExp.getOwnedExpression();
				if ((index+1) < expressions.size()) {
					ExpCS csExp = expressions.get(index+1);
					if (csExp instanceof NameExpCS) {
						CS2Pivot.setElementType(((NameExpCS) csExp).getPathName(), PivotPackage.Literals.PROPERTY, csExp);
					}
				}
			}
		}
		return null;
	}

	@Override
	public Continuation<?> visitOperatorCS(OperatorCS object) {
		return null;
	}

	@Override
	public Continuation<?> visitTypeNameExpCS(TypeNameExpCS csTypeNameExp) {
		CS2Pivot.setElementType(csTypeNameExp.getPathName(), PivotPackage.Literals.TYPE, csTypeNameExp);
		return new TypeNameExpContinuation(context, csTypeNameExp);
	}

	@Override
	public Continuation<?> visitVariableCS(VariableCS csVariable) {
		return null;
	}
}