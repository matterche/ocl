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

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.Model;
import org.eclipse.ocl.examples.pivot.Namespace;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParameterableElement;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.SelfType;
import org.eclipse.ocl.examples.pivot.TemplateParameter;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.ImportCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.LibraryCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedRefCS;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefFeatureCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefOperationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefPropertyCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
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

	public static String getStereotype(String stereotype) {
		if (stereotype == null) {
			return null;
		}
		else if (stereotype.equals("body")) {
			return UMLReflection.BODY;
		}
		else if (stereotype.equals("def")) {
			return UMLReflection.DEFINITION;
		}
		else if (stereotype.equals("derive")) {
			return UMLReflection.DERIVATION;
		}
		else if (stereotype.equals("init")) {
			return UMLReflection.INITIAL;
		}
		else if (stereotype.equals("inv")) {
			return UMLReflection.INVARIANT;
		}
		else if (stereotype.equals("pre")) {
			return UMLReflection.PRECONDITION;
		}
		else if (stereotype.equals("post")) {
			return UMLReflection.POSTCONDITION;
		}
		else {
			return stereotype;
		}
	}
	
	private Map<org.eclipse.ocl.examples.pivot.Package, org.eclipse.ocl.examples.pivot.Package> modelPackage2contextPackage =
			new HashMap<org.eclipse.ocl.examples.pivot.Package, org.eclipse.ocl.examples.pivot.Package>();
	private Map<Type, Type> modelType2contextType = new HashMap<Type, Type>();

	public CompleteOCLContainmentVisitor(CS2PivotConversion context) {
		super(context);
	}

	@Override
	public Continuation<?> visitClassifierContextDeclCS(ClassifierContextDeclCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.TYPE, csElement, null);
		Type modelClassifier = csElement.getClassifier();
		if ((modelClassifier != null) && !modelClassifier.eIsProxy()) {
			Type contextClassifier = modelType2contextType.get(modelClassifier);
			if (contextClassifier == null) {
				contextClassifier = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, csElement);
				contextClassifier.setName(modelClassifier.getName());
				context.refreshComments(contextClassifier, csElement);
				modelType2contextType.put(modelClassifier, contextClassifier);
			}
			else {
				context.installPivotUsage(csElement, contextClassifier);
			}
		}
		return null;
	}

	@Override
	public Continuation<?> visitCompleteOCLDocumentCS(CompleteOCLDocumentCS csElement) {
		for (IncludeCS csInclude : csElement.getOwnedInclude()) {
			csInclude.getNamespace();					// Resolve the proxy to perform the import.
		}
		Model contextModel = refreshPackage(Model.class, PivotPackage.Literals.MODEL, csElement);
		metaModelManager.installPackage(contextModel);
		return null;
	}

	@Override
	public Continuation<?> visitContextConstraintCS(ContextConstraintCS csElement) {
		Constraint pivotElement = refreshNamedElement(Constraint.class, PivotPackage.Literals.CONSTRAINT, csElement);
		String newStereotype = csElement.getStereotype();
		String stereotype = getStereotype(newStereotype);
		pivotElement.setStereotype(stereotype);
		return null;
	}

	@Override
	public Continuation<?> visitDefCS(DefCS csElement) {
		Constraint pivotElement = refreshNamedElement(Constraint.class, PivotPackage.Literals.CONSTRAINT, csElement);
		DefFeatureCS csFeature = csElement.getFeature();
		pivotElement.setStereotype(csFeature instanceof DefOperationCS ? UMLReflection.BODY : UMLReflection.INITIAL);
		Feature pivotFeature = PivotUtil.getPivot(Feature.class, csFeature);
		pivotFeature.setIsStatic(csElement.isStatic());
		PivotUtil.refreshList(pivotFeature.getOwnedRule(), Collections.singletonList(pivotElement));
		return null;
	}

	@Override
	public Continuation<?> visitDefOperationCS(DefOperationCS csElement) {
		Operation pivotElement = refreshNamedElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		context.refreshPivotList(Parameter.class, pivotElement.getOwnedParameter(), csElement.getParameters());
		return null;
	}

	@Override
	public Continuation<?> visitDefPropertyCS(DefPropertyCS csElement) {
		Property pivotElement = refreshNamedElement(Property.class, PivotPackage.Literals.PROPERTY, csElement);
		pivotElement.setIsDerived(true);
		pivotElement.setIsReadOnly(true);
		pivotElement.setIsTransient(true);
		pivotElement.setIsVolatile(true);
		pivotElement.setIsResolveProxies(false);
		return null;
	}

	@Override
	public Continuation<?> visitImportCS(ImportCS csElement) {
		Namespace namespace = csElement.getNamespace();													// Resolve the proxy to perform the import.
		if ((namespace != null) && !namespace.eIsProxy()) {
			context.installPivotUsage(csElement, namespace);
		}
		return null;
	}

	@Override
	public Continuation<?> visitIncludeCS(IncludeCS csElement) {
		return null;		// Suppressed here to avoid reversed post-order
	}

	@Override
	public Continuation<?> visitLibraryCS(LibraryCS csElement) {
		org.eclipse.ocl.examples.pivot.Package pPackage = csElement.getPackage();						// Resolve the proxy to perform the import.
		if ((pPackage != null) && !pPackage.eIsProxy()) {
			context.installPivotUsage(csElement, pPackage);
		}
		return null;
	}

	@Override
	public Continuation<?> visitOperationContextDeclCS(OperationContextDeclCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.OPERATION, csElement,
			new OperationDeclScopeFilter(metaModelManager, null, csElement.getParameters()));
		Operation pivotElement = context.refreshModelElement(Operation.class, PivotPackage.Literals.OPERATION, csElement);
		context.refreshPivotList(Parameter.class, pivotElement.getOwnedParameter(), csElement.getParameters());
		context.refreshComments(pivotElement, csElement);
		return null;
	}

	@Override
	public Continuation<?> visitPackageDeclarationCS(PackageDeclarationCS csElement) {
		CS2Pivot.setElementType(csElement.getPathName(), PivotPackage.Literals.PACKAGE, csElement, null);
		org.eclipse.ocl.examples.pivot.Package modelPackage = csElement.getPackage();
		if ((modelPackage != null) && !modelPackage.eIsProxy()) {
			org.eclipse.ocl.examples.pivot.Package contextPackage = modelPackage2contextPackage.get(modelPackage);
			if (contextPackage == null) {
				contextPackage = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Package.class, PivotPackage.Literals.PACKAGE, csElement);
				contextPackage.setName(modelPackage.getName());
				contextPackage.setNsURI(modelPackage.getNsURI());
				modelPackage2contextPackage.put(modelPackage, contextPackage);
			}
			else {
				context.installPivotUsage(csElement, contextPackage);
			}
		}
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
