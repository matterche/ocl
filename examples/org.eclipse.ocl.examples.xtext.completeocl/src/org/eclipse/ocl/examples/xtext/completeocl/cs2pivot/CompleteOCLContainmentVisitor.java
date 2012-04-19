/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PathNameDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;
import org.eclipse.ocl.examples.xtext.essentialocl.attributes.AbstractOperationFilter;

public class CompleteOCLContainmentVisitor extends AbstractCompleteOCLContainmentVisitor
{
	public class OperationDeclScopeFilter extends AbstractOperationFilter
	{
		private final List<ParameterCS> csParameters;
		
		public OperationDeclScopeFilter(MetaModelManager metaModelManager, Type sourceType, List<ParameterCS> csParameters) {
			super(metaModelManager, sourceType);
			this.csParameters = csParameters;
		}

		public boolean matches(EnvironmentView environmentView, Type forType, EObject eObject) {
			if (eObject instanceof Iteration) {
				return false;
			}
			if (eObject instanceof Operation) {
				Operation candidateOperation = (Operation)eObject;
				List<Parameter> candidateParameters = candidateOperation.getOwnedParameter();
				int iMax = csParameters.size();
				if (iMax != candidateParameters.size()) {
					return false;
				}
				Map<TemplateParameter, ParameterableElement> bindings = getOperationBindings(candidateOperation);
				for (int i = 0; i < iMax; i++) {
					Parameter candidateParameter = candidateParameters.get(i);
					ParameterCS csParameter = csParameters.get(i);
					if (csParameter == null) {
						return false;
					}
					TypedRefCS csType = csParameter.getOwnedType();
					Type pType = PivotUtil.getPivot(Type.class, csType);
					if (pType == null) {
						return false;
					}
					Type candidateType = metaModelManager.getTypeWithMultiplicity(candidateParameter);
					if (candidateType instanceof SelfType) {
						candidateType = candidateOperation.getOwningType();
					}
					pType = PivotUtil.getBehavioralType(pType);			// FIXME make this a general facility
					if (!metaModelManager.conformsTo(pType, candidateType, bindings)) {
						return false;
					}
				}
				if (bindings != null) {
					installBindings(environmentView, forType, eObject, bindings);
				}
				return true;
			}
			else {
				return false;
			}
		}
	}

	public CompleteOCLContainmentVisitor(CS2PivotConversion context) {
		super(context);
	}

	@Override
	public Continuation<?> visitClassifierContextDeclCS(ClassifierContextDeclCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.TYPE, csElement, null);
		return null;
	}

	@Override
	public Continuation<?> visitDefCS(DefCS csElement) {
/*		if (csElement.isOperation()) {
			return context.refreshModelElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		}
		else {
			Property pivotProperty = context.refreshModelElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
			pivotProperty.setIsDerived(true);
			pivotProperty.setIsReadOnly(true);
			pivotProperty.setIsTransient(true);
			pivotProperty.setIsVolatile(true);
			pivotProperty.setIsResolveProxies(false);
			return pivotProperty;
		} */
		return visitContextConstraintCS(csElement);
	}

	@Override
	public Continuation<?> visitIncludeCS(IncludeCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitOperationContextDeclCS(OperationContextDeclCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.OPERATION, csElement,
			new OperationDeclScopeFilter(metaModelManager, null, csElement.getParameters()));
		Operation pivotElement = context.refreshModelElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		context.refreshComments(pivotElement, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitPackageDeclarationCS(PackageDeclarationCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.PACKAGE, csElement, null);
		return null;
	}

	@Override
	public Continuation<?> visitPathNameDeclCS(PathNameDeclCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitPropertyContextDeclCS(PropertyContextDeclCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.PROPERTY, csElement, null);
		Property pivotElement = context.refreshModelElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
		context.refreshComments(pivotElement, csElement);
		return null;
	}
}
