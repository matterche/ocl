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
 *
 * $Id: CompleteOCLEObjectValidator.java,v 1.4 2011/05/20 15:26:51 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.validation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.domain.utilities.DomainUtil;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.EnvironmentFactory;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;

/**
 * A BasicCompleteOCLEObjectValidator validates CompleteOCL invariants during an EMF validation, for each
 * EPackage for which a/the BasicCompleteOCLEObjectValidator instance has been registered as a validator
 * in the EValidator.Registry.
 */
public class BasicCompleteOCLEObjectValidator extends EObjectValidator
{	
	protected final MetaModelManager metaModelManager;
	private EnvironmentFactory environmentFactory = null;
	private Environment rootEnvironment = null;
	
	public BasicCompleteOCLEObjectValidator(MetaModelManager metaModelManager) {
		this.metaModelManager = metaModelManager != null ? metaModelManager : new MetaModelManager();
	}
	
	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (eObject.eIsProxy()) {
	        return true;
	    }
		return validatePivot(eClass, eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
	    if (!eDataType.isInstance(value))
	    {
	        return true;
	    }
		return validatePivot(eDataType, value, diagnostics, context);
	}

	protected boolean validatePivot(EClassifier eClassifier, Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (rootEnvironment == null) {
			environmentFactory = new PivotEnvironmentFactory(null, metaModelManager);
			rootEnvironment = environmentFactory.createEnvironment();
		}
		boolean allOk = true;
		Type type = metaModelManager.getPivotOfEcore(Type.class, eClassifier);
		for (Constraint constraint : metaModelManager.getAllConstraints(type)) {
			if (UMLReflection.INVARIANT.equals(constraint.getStereotype())) {
				String constraintName = constraint.getName();
				ValueSpecification specification = constraint.getSpecification();
				if (specification instanceof ExpressionInOcl) {			// Ignore OpaqueExpression -- probably from EAnnotations
					ExpressionInOcl query = (ExpressionInOcl)specification;
					EvaluationEnvironment evaluationEnvironment = environmentFactory.createEvaluationEnvironment();
					ValueFactory valueFactory = metaModelManager.getValueFactory();
					Value value = valueFactory.valueOf(object);
					evaluationEnvironment.add(query.getContextVariable(), value);
					DomainModelManager extents = evaluationEnvironment.createModelManager(object);
					EvaluationVisitor evaluationVisitor = environmentFactory.createEvaluationVisitor(rootEnvironment, evaluationEnvironment, extents);
					int severity = Diagnostic.ERROR;
					String message = null;
					if (query.getType() != evaluationVisitor.getMetaModelManager().getBooleanType()) {
						message = DomainUtil.bind(OCLMessages.ValidationConstraintIsNotBoolean_ERROR_,
							eClassifier.getName(), constraintName);
					}
					try {
						Value expressionResult = query.accept(evaluationVisitor);
						boolean isOk = false;
						if (!expressionResult.isNull()) {
							isOk = expressionResult.asBoolean();
							severity = Diagnostic.WARNING;
						}
						if (!isOk) {
							String objectLabel = DomainUtil.getLabel(eClassifier, object, context);
							OclExpression messageExpression = query.getMessageExpression();
							if (messageExpression != null) {
								try {
									Value messageResult = messageExpression.accept(evaluationVisitor);
									if (!messageResult.isNull()) {
										message = messageResult.asString();
									}
								} catch (InvalidValueException e) {
									message = DomainUtil.bind(OCLMessages.ValidationMessageIsNotString_ERROR_,
										eClassifier.getName(), constraintName);
									severity = Diagnostic.ERROR;
								}
								catch (Exception e) {
									message = DomainUtil.bind(OCLMessages.ValidationMessageException_ERROR_,
										eClassifier.getName(), constraintName, objectLabel, e.getMessage());
									severity = Diagnostic.ERROR;
								}
							}
							if (message == null) {
								message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_,
									eClassifier.getName(), constraintName, objectLabel);
							}
						}
					} catch (InvalidValueException e) {
						message = DomainUtil.bind(OCLMessages.ValidationResultIsNotBoolean_ERROR_,
							eClassifier.getName(), constraintName);
					} catch (InvalidEvaluationException e) {
						message = DomainUtil.bind(OCLMessages.ValidationResultIsInvalid_ERROR_,
							eClassifier.getName(), constraintName);
					}
					if (message != null) {
						diagnostics.add(new BasicDiagnostic(severity, DIAGNOSTIC_SOURCE, 0, message, new Object [] { object }));
					    allOk = false;
					    if (severity == Diagnostic.ERROR) {
					    	break;		// Generate many warnings but only one error
					    }
					}
				}
			}
		}
		return allOk || (diagnostics != null);
	}
}
