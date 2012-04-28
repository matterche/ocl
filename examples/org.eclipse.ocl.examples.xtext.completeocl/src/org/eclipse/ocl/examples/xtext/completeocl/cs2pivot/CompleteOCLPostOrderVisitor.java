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
 * $Id: CompleteOCLPostOrderVisitor.java,v 1.9 2011/05/20 19:51:18 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.Feature;
import org.eclipse.ocl.examples.pivot.Model;
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.SingleContinuation;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ClassifierContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLDocumentCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextConstraintCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.ContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefOperationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.DefPropertyCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.IncludeCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.OperationContextDeclCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PackageDeclarationCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PostCS;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.PropertyContextDeclCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpSpecificationCS;

public class CompleteOCLPostOrderVisitor extends AbstractCompleteOCLPostOrderVisitor
{
	public static final CS2PivotConversion.CacheKey<Map<NamedElement, List<ContextConstraintCS>>> rulesKey = new CS2PivotConversion.CacheKey<Map<NamedElement, List<ContextConstraintCS>>>("rules");
	
	public static class ContextConstraintCSCompletion extends SingleContinuation<ContextConstraintCS>
	{
		public ContextConstraintCSCompletion(CS2PivotConversion context, ContextConstraintCS csElement) {		// FIXME Share code with ConstraintCSCompletion
			super(context, null, null, csElement);
		}

		@Override
		public BasicContinuation<?> execute() {
			Constraint pivotConstraint = PivotUtil.getPivot(Constraint.class, csElement);
			ExpSpecificationCS csSpecification = (ExpSpecificationCS) csElement.getSpecification();
			ExpCS csExpression = csSpecification.getOwnedExpression();
			if (csExpression != null) {
				ExpressionInOcl pivotSpecification = PivotUtil.getPivot(ExpressionInOcl.class, csSpecification);
//				context.installPivotUsage(csSpecification, pivotSpecification);
				pivotConstraint.setSpecification(pivotSpecification);
		
				Variable contextVariable = pivotSpecification.getContextVariable();
				if (contextVariable == null) {
					contextVariable = PivotFactory.eINSTANCE.createVariable();
					pivotSpecification.setContextVariable(contextVariable);
				}
				String selfVariableName = Environment.SELF_VARIABLE_NAME;
				ContextDeclCS contextDecl = csElement.getContextDecl();
				if (contextDecl instanceof ClassifierContextDeclCS) {
					ClassifierContextDeclCS csClassifierContextDecl = (ClassifierContextDeclCS)contextDecl;
					Type contextType = csClassifierContextDecl.getClassifier();
					if (contextType.eIsProxy()) {
						contextType = null;
					}
					context.setType(contextVariable, contextType);
					String selfName = csClassifierContextDecl.getSelfName();
					if (selfName != null) {
						selfVariableName = selfName;
					}
				}
				else if (contextDecl instanceof PropertyContextDeclCS) {
					PropertyContextDeclCS csPropertyContextDecl = (PropertyContextDeclCS)contextDecl;
					Property contextProperty = csPropertyContextDecl.getProperty();
					if ((contextProperty != null) && !contextProperty.eIsProxy()) {
						context.setType(contextVariable, contextProperty.getOwningType());
					}
				}
				else if (contextDecl instanceof OperationContextDeclCS) {
					OperationContextDeclCS csOperationContextDecl = (OperationContextDeclCS)contextDecl;
					Operation contextOperation = csOperationContextDecl.getOperation();
			        pivotSpecification.getParameterVariable().clear();
					if ((contextOperation != null) && !contextOperation.eIsProxy()) {
						context.setType(contextVariable, contextOperation.getOwningType());
				        for (Parameter parameter : contextOperation.getOwnedParameter()) {
							if ((parameter != null) && !parameter.eIsProxy()) {
						        Variable param = PivotFactory.eINSTANCE.createVariable();
						        param.setName(parameter.getName());
								context.setTypeWithMultiplicity(param, parameter);
						        param.setRepresentedParameter(parameter);
						        pivotSpecification.getParameterVariable().add(param);
							}
				        }
					}
			        if (csElement instanceof PostCS) {
						Variable resultVariable = pivotSpecification.getResultVariable();
						if (resultVariable == null) {
							resultVariable = PivotFactory.eINSTANCE.createVariable();
						}
						resultVariable.setName(Environment.RESULT_VARIABLE_NAME);
						context.setTypeWithMultiplicity(resultVariable, contextOperation);
						pivotSpecification.setResultVariable(resultVariable);
			        }
				}
				context.refreshName(contextVariable, selfVariableName);
				
				
				OclExpression bodyExpression = context.visitLeft2Right(OclExpression.class, csExpression);		
				pivotSpecification.setBodyExpression(bodyExpression);
				pivotSpecification.setType(bodyExpression.getType());
				ExpSpecificationCS csMessageSpecification = (ExpSpecificationCS) csElement.getMessageSpecification();
				if (csMessageSpecification != null) {
					context.installPivotUsage(csMessageSpecification, pivotSpecification);		//WIP
					ExpCS csMessageExpression = csMessageSpecification.getOwnedExpression();
					if (csMessageExpression != null) {
						OclExpression messageExpression = context.visitLeft2Right(OclExpression.class, csMessageExpression);		
						pivotSpecification.setMessageExpression(messageExpression);
					}
				}
//				NamedElement pivotObject = PivotUtil.getPivot(NamedElement.class, contextDecl);
//				if (pivotObject != null) {
//					pivotObject.getOwnedRule().add(pivotConstraint);
//				}
			}
			return null;
		}
	}
	
	protected static class DefCSCompletion extends SingleContinuation<DefCS>
	{
		public DefCSCompletion(CS2PivotConversion context, DefCS csElement) {
			super(context, null, null, csElement);
		}

		@Override
		public BasicContinuation<?> execute() {
			Feature contextFeature = PivotUtil.getPivot(Feature.class, csElement.getFeature());
			ExpSpecificationCS csSpecification = (ExpSpecificationCS) csElement.getSpecification();
			ExpressionInOcl pivotSpecification = PivotUtil.getPivot(ExpressionInOcl.class, csSpecification);
			Constraint pivotConstraint = PivotUtil.getPivot(Constraint.class, csElement);
			pivotConstraint.setSpecification(pivotSpecification);

			Variable contextVariable = pivotSpecification.getContextVariable();
			if (contextVariable == null) {
				contextVariable = PivotFactory.eINSTANCE.createVariable();
				pivotSpecification.setContextVariable(contextVariable);
			}
			context.refreshName(contextVariable, Environment.SELF_VARIABLE_NAME);
			if (contextFeature instanceof Operation) {
				Operation contextOperation = (Operation) contextFeature;
				context.setType(contextVariable, contextOperation.getOwningType());
		        pivotSpecification.getParameterVariable().clear();
		        for (Parameter parameter : contextOperation.getOwnedParameter()) {
			        Variable param = PivotFactory.eINSTANCE.createVariable();
			        param.setName(parameter.getName());
			        param.setType(parameter.getType());
			        param.setRepresentedParameter(parameter);
			        pivotSpecification.getParameterVariable().add(param);
		        }
			}
			else if (contextFeature instanceof Property) {
				Property contextProperty = (Property) contextFeature;
				context.setType(contextVariable, contextProperty.getOwningType());
			}
			ExpCS csExpression = csSpecification.getOwnedExpression();
			OclExpression bodyExpression = context.visitLeft2Right(OclExpression.class, csExpression);		
			pivotSpecification.setBodyExpression(bodyExpression);
			context.setType(pivotSpecification, bodyExpression != null ? bodyExpression.getType() : null);
			if (contextFeature != null) {
				contextFeature.getOwnedRule().add(pivotConstraint);
			}
			return null;
		}
	}
	
	protected class DocumentCSCompletion extends SingleContinuation<CompleteOCLDocumentCS>
	{
		public DocumentCSCompletion(CS2PivotConversion context, CompleteOCLDocumentCS csElement) {
			super(context, null, null, csElement);
		}

		@Override
		public BasicContinuation<?> execute() {
			for (NamedElement pivot : constrainedElement2constraints.keySet()) {
				List<ContextConstraintCS> constraints = constrainedElement2constraints.get(pivot);
				context.refreshList(Constraint.class, pivot.getOwnedRule(), constraints);
			}
			return null;
		}
	}

	private Map<org.eclipse.ocl.examples.pivot.Package, org.eclipse.ocl.examples.pivot.Package> modelPackage2contextPackage =
			new HashMap<org.eclipse.ocl.examples.pivot.Package, org.eclipse.ocl.examples.pivot.Package>();
	private Map<Type, Type> modelType2contextType = new HashMap<Type, Type>();
	private List<DefOperationCS> defOperations = new ArrayList<DefOperationCS>();
	private List<OperationContextDeclCS> operationContexts = new ArrayList<OperationContextDeclCS>();
	private List<DefPropertyCS> defProperties = new ArrayList<DefPropertyCS>();
	private List<PropertyContextDeclCS> propertyContexts = new ArrayList<PropertyContextDeclCS>();
	private Map<NamedElement, List<ContextConstraintCS>> constrainedElement2constraints = new HashMap<NamedElement, List<ContextConstraintCS>>();
	
	public CompleteOCLPostOrderVisitor(CS2PivotConversion context) {
		super(context);
	}

	private Map<Type, List<Operation>> gatherContextTypeOperations() {
		Map<Type, List<Operation>> contextTypeOperations = new HashMap<Type, List<Operation>>();
		for (DefOperationCS csOperation : defOperations) {
			Operation contextOperation = PivotUtil.getPivot(Operation.class, csOperation);
			ContextDeclCS csClassifierContextDecl = csOperation.getDef().getContextDecl();
			Type contextType = PivotUtil.getPivot(Type.class, csClassifierContextDecl);
			if (contextType != null) {
				List<Operation> contextOperations = contextTypeOperations.get(contextType);
				if (contextOperations == null) {
					contextOperations = new ArrayList<Operation>();
					contextTypeOperations.put(contextType, contextOperations);
				}
				if (!contextOperations.contains(contextOperation)) {
					contextOperations.add(contextOperation);
				}
			}
		}
		for (OperationContextDeclCS csOperationContext : operationContexts) {
			Operation contextOperation = PivotUtil.getPivot(Operation.class, csOperationContext);
			Operation modelOperation = csOperationContext.getOperation();
			if (modelOperation != null) {
				Type modelType = modelOperation.getOwningType();
				if (modelType != null) {
					Type contextType = modelType2contextType.get(modelType);
					if (contextType == null) {
						contextType = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, null);
						contextType.setName(modelType.getName());
						modelType2contextType.put(modelType, contextType);
					}
					List<Operation> contextOperations = contextTypeOperations.get(contextType);
					if (contextOperations == null) {
						contextOperations = new ArrayList<Operation>();
						contextTypeOperations.put(contextType, contextOperations);
					}
					if (!contextOperations.contains(contextOperation)) {
						contextOperations.add(contextOperation);
					}
				}
			}
		}
		return contextTypeOperations;
	}

	private Map<Type, List<Property>> gatherContextTypeProperties() {
		Map<Type, List<Property>> contextTypeProperties = new HashMap<Type, List<Property>>();
		for (DefPropertyCS csProperty : defProperties) {
			Property contextProperty = PivotUtil.getPivot(Property.class, csProperty);
			ContextDeclCS csClassifierContextDecl = csProperty.getDef().getContextDecl();
			Type contextType = PivotUtil.getPivot(Type.class, csClassifierContextDecl);
			if (contextType != null) {
				List<Property> contextProperties = contextTypeProperties.get(contextType);
				if (contextProperties == null) {
					contextProperties = new ArrayList<Property>();
					contextTypeProperties.put(contextType, contextProperties);
				}
				if (!contextProperties.contains(contextProperty)) {
					contextProperties.add(contextProperty);
				}
			}
		}
		for (PropertyContextDeclCS csPropertyContext : propertyContexts) {
			Property contextProperty = PivotUtil.getPivot(Property.class, csPropertyContext);
			Property modelProperty = csPropertyContext.getProperty();
			if (modelProperty != null) {
				Type modelType = modelProperty.getOwningType();
				if (modelType != null) {
					Type contextType = modelType2contextType.get(modelType);
					if (contextType == null) {
						contextType = context.refreshModelElement(org.eclipse.ocl.examples.pivot.Class.class, PivotPackage.Literals.CLASS, null);
						contextType.setName(modelType.getName());
						modelType2contextType.put(modelType, contextType);
					}
					List<Property> contextProperties = contextTypeProperties.get(contextType);
					if (contextProperties == null) {
						contextProperties = new ArrayList<Property>();
						contextTypeProperties.put(contextType, contextProperties);
					}
					if (!contextProperties.contains(contextProperty)) {
						contextProperties.add(contextProperty);
					}
				}
			}
		}
		return contextTypeProperties;
	}

	private void installPackages(org.eclipse.ocl.examples.pivot.Package nestingPackage, Map<Type, List<Operation>> contextOperations, Map<Type, List<Property>> contextProperties) {
		org.eclipse.ocl.examples.pivot.Package contextNestingPackage = modelPackage2contextPackage.get(nestingPackage);
		metaModelManager.installPackage(contextNestingPackage);
		installTypes(nestingPackage, contextOperations, contextProperties);
		List<org.eclipse.ocl.examples.pivot.Package> contextNestedPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		for (org.eclipse.ocl.examples.pivot.Package nestedPackage : nestingPackage.getNestedPackage()) {
			org.eclipse.ocl.examples.pivot.Package contextNestedPackage = modelPackage2contextPackage.get(nestedPackage);
			if (contextNestedPackage != null) {
				contextNestedPackages.add(contextNestedPackage);
			}
		}
		PivotUtil.refreshList(contextNestingPackage.getNestedPackage(), contextNestedPackages);
	}

	private void installTypes(org.eclipse.ocl.examples.pivot.Package modelPackage, Map<Type, List<Operation>> contextOperations, Map<Type, List<Property>> contextProperties) {
		org.eclipse.ocl.examples.pivot.Package contextPackage = modelPackage2contextPackage.get(modelPackage);
		List<Type> contextTypes = new ArrayList<Type>();
		for (org.eclipse.ocl.examples.pivot.Package aModelPackage : metaModelManager.getAllPackages(modelPackage, true)) {
			for (Type modelType : aModelPackage.getOwnedType()) {
				Type contextType = modelType2contextType.get(modelType);
				if (contextType != null) {
					contextTypes.add(contextType);
					List<Operation> newOperations = contextOperations.get(contextType);
					if (newOperations != null) {
						PivotUtil.refreshList(contextType.getOwnedOperation(), newOperations);
					}
					else {
						contextType.getOwnedOperation().clear();
					}
					List<Property> newProperties = contextProperties.get(contextType);
					if (newProperties != null) {
						PivotUtil.refreshList(contextType.getOwnedAttribute(), newProperties);
					}
					else {
						contextType.getOwnedAttribute().clear();
					}
				}
			}
		}
		PivotUtil.refreshList(contextPackage.getOwnedType(), contextTypes);
	}

	@Override
	public Continuation<?> visitClassifierContextDeclCS(ClassifierContextDeclCS csElement) {
		Type modelClassifier = csElement.getClassifier();
		if ((modelClassifier != null) && !modelClassifier.eIsProxy()) {
			Type contextClassifier = modelType2contextType.get(modelClassifier);
			if (contextClassifier == null) {
				contextClassifier = PivotUtil.getPivot(Type.class, csElement);
				modelType2contextType.put(modelClassifier, contextClassifier);
			}
		}
		return null;
	}

	@Override
	public Continuation<?> visitCompleteOCLDocumentCS(CompleteOCLDocumentCS csElement) {
		Model contextModel = PivotUtil.getPivot(Model.class, csElement);		
		Map<Type, List<Operation>> contextTypeOperations = gatherContextTypeOperations();
		Map<Type, List<Property>> contextTypeProperties = gatherContextTypeProperties();
		for (org.eclipse.ocl.examples.pivot.Package modelPackage : modelPackage2contextPackage.keySet()) {
			installPackages(modelPackage, contextTypeOperations, contextTypeProperties);
		}
		List<org.eclipse.ocl.examples.pivot.Package> contextPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		for (org.eclipse.ocl.examples.pivot.Package contextPackage : modelPackage2contextPackage.values()) {
			if (contextPackage.getNestingPackage() == null) {
				contextPackages.add(contextPackage);
			}
		}
		PivotUtil.refreshList(contextModel.getNestedPackage(), contextPackages);
		return new DocumentCSCompletion(context, csElement);
	}

	@Override
	public Continuation<?> visitContextConstraintCS(ContextConstraintCS csNewConstraint) {
		NamedElement constrainedElement = PivotUtil.getPivot(NamedElement.class, csNewConstraint.getContextDecl());
		if ((constrainedElement != null) && !constrainedElement.eIsProxy()) {
			List<ContextConstraintCS> csConstraints = constrainedElement2constraints.get(constrainedElement);
			if (csConstraints == null) {
				csConstraints = new ArrayList<ContextConstraintCS>();
				constrainedElement2constraints.put(constrainedElement, csConstraints);
			}
			csConstraints.add(csNewConstraint);
			if (csNewConstraint.getSpecification() != null) {
				return new ContextConstraintCSCompletion(context, csNewConstraint);
			}
		}
		return null;
	}

	@Override
	public Continuation<?> visitContextDeclCS(ContextDeclCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitDefCS(DefCS csDef) {
		if (csDef.getSpecification() != null) {
			return new DefCSCompletion(context, csDef);
		}
		else {
			return null;
		}
	}

	@Override
	public Continuation<?> visitDefOperationCS(DefOperationCS csElement) {
		Operation contextOperation = PivotUtil.getPivot(Operation.class, csElement);
		contextOperation.setType(PivotUtil.getPivot(Type.class, csElement.getOwnedType()));		// FIXME type consistency check
		defOperations.add(csElement);
		return null;
	}

	@Override
	public Continuation<?> visitDefPropertyCS(DefPropertyCS csElement) {
		Property contextProperty = PivotUtil.getPivot(Property.class, csElement);
		contextProperty.setType(PivotUtil.getPivot(Type.class, csElement.getOwnedType()));		// FIXME type consistency check
		defProperties.add(csElement);
		return null;
	}

	@Override
	public Continuation<?> visitIncludeCS(IncludeCS csElement) {
		return null;
	}

	@Override
	public Continuation<?> visitOperationContextDeclCS(OperationContextDeclCS csElement) {
		Operation modelOperation = csElement.getOperation();
		if ((modelOperation != null) && !modelOperation.eIsProxy()) {
			Operation contextOperation = PivotUtil.getPivot(Operation.class, csElement);
			contextOperation.setName(modelOperation.getName());
			contextOperation.setType(modelOperation.getType());		// FIXME type consistency check
			operationContexts.add(csElement);
		}
		return null;
	}

	@Override
	public Continuation<?> visitPackageDeclarationCS(PackageDeclarationCS csElement) {
		org.eclipse.ocl.examples.pivot.Package modelPackage = csElement.getPackage();
		if ((modelPackage != null) && !modelPackage.eIsProxy()) {
			org.eclipse.ocl.examples.pivot.Package contextPackage = modelPackage2contextPackage.get(modelPackage);
			if (contextPackage == null) {
				contextPackage = PivotUtil.getPivot(org.eclipse.ocl.examples.pivot.Package.class, csElement);
				modelPackage2contextPackage.put(modelPackage, contextPackage);
			}
		}
		return null;
	}

	@Override
	public Continuation<?> visitPropertyContextDeclCS(PropertyContextDeclCS csElement) {
		// FIXME type consistency check
		Property modelProperty = csElement.getProperty();
		if ((modelProperty != null) && !modelProperty.eIsProxy()) {
			Property contextProperty = PivotUtil.getPivot(Property.class, csElement);
			contextProperty.setName(modelProperty.getName());
			contextProperty.setType(modelProperty.getType());
			propertyContexts.add(csElement);
		}
		return null;
	}
}