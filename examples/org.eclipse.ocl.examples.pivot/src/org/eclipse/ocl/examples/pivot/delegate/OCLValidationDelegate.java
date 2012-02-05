/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   C.Damus, K.Hussey, E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLValidationDelegate.java,v 1.7 2011/05/13 18:43:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.delegate;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
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
import org.eclipse.ocl.examples.pivot.NamedElement;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * An implementation of the dynamic validation delegate API, maintaining a cache
 * of compiled constraints and invariants.
 */
public class OCLValidationDelegate implements ValidationDelegate
{	
	protected final OCLDelegateDomain delegateDomain;
	protected final EClassifier eClassifier;
	  
	/**
	 * Initializes me with the classifier whose DelegateEClassifierAdapter delegates to me.
	 * 
	 * @param classifier
	 *            my classifier
	 */
	public OCLValidationDelegate(OCLDelegateDomain delegateDomain, EClassifier classifier) {
		this.delegateDomain = delegateDomain;
		this.eClassifier = classifier;
	}


	public EvaluationVisitor createEvaluationVisitor(Object object, ExpressionInOcl query) {
		EnvironmentFactory environmentFactory = delegateDomain.getOCL().getEnvironmentFactory();
		Environment rootEnvironment = environmentFactory.createEnvironment();
		// can determine a more appropriate context from the context
		// variable of the expression, to account for stereotype constraints
//			context = HelperUtil.getConstraintContext(rootEnvironment, context, expression);
		EvaluationEnvironment evaluationEnvironment = createEvaluationEnvironment(object, query, environmentFactory);
//			if ((value != null) && !value.isUndefined()) {
//				expression.getContextVariable().setValue(value);
//			}
		DomainModelManager extents = evaluationEnvironment.createModelManager(object);

		EvaluationVisitor evaluationVisitor = environmentFactory.createEvaluationVisitor(rootEnvironment, evaluationEnvironment, extents);
		return evaluationVisitor;
	}

	public EvaluationEnvironment createEvaluationEnvironment(Object object, ExpressionInOcl query,
			EnvironmentFactory environmentFactory) {
		EvaluationEnvironment evaluationEnvironment = environmentFactory.createEvaluationEnvironment();
		MetaModelManager metaModelManager = evaluationEnvironment.getMetaModelManager();
		ValueFactory valueFactory = metaModelManager.getValueFactory();
		Value value = valueFactory.valueOf(object);
		evaluationEnvironment.add(query.getContextVariable(), value);
		return evaluationEnvironment;
	}

	protected String evaluateMessage(EvaluationVisitor evaluationVisitor, String constraintName, ExpressionInOcl query) {
		OclExpression messageExpression = query.getMessageExpression();
		if (messageExpression == null) {
			return null;
		}
		try {
			Value result = messageExpression.accept(evaluationVisitor);
			return result.asString();
		} catch (InvalidValueException e) {
			String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
			String message = DomainUtil.bind(OCLMessages.ValidationMessageIsNotString_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			throw new OCLDelegateException(message, e);
		}
	}

	@Override
	public String toString() {
		return "<" + delegateDomain.getURI() + ":validate> " + eClassifier.getEPackage().getName() + "::" + eClassifier.getName(); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	public boolean validate(EClass eClass, EObject eObject,
			Map<Object, Object> context, EOperation invariant, String expression) {
		MetaModelManager metaModelManager = delegateDomain.getMetaModelManager();
		NamedElement namedElement = delegateDomain.getPivot(NamedElement.class, invariant);
		if (namedElement instanceof Operation) {
			Operation operation = (Operation)namedElement;
			ExpressionInOcl query = InvocationBehavior.INSTANCE.getExpressionInOcl(metaModelManager, operation);
			InvocationBehavior.INSTANCE.validate(operation);
			return validateExpressionInOcl(eClass, eObject, null, context,
				invariant.getName(), null, 0, query);
		}
		else if (namedElement instanceof Constraint) {
			Constraint constraint = (Constraint)namedElement;
			NamedElement contextType = constraint.getContext();
			ExpressionInOcl query = ValidationBehavior.INSTANCE.getExpressionInOcl(metaModelManager, contextType, constraint);
			if (query == null) {
				String message = DomainUtil.bind(OCLMessages.MissingBodyForInvocationDelegate_ERROR_, contextType);
				throw new OCLDelegateException(message);
			}
			ValidationBehavior.INSTANCE.validate(constraint);
			return validateExpressionInOcl(eClass, eObject, null, context,
				invariant.getName(), null, 0, query);
		}
		else {
			throw new ClassCastException(namedElement.getClass().getName() + " does not provide a Constraint");
		}
	}

	public boolean validate(EClass eClass, EObject eObject,
			Map<Object, Object> context, String constraintName, String expression) {
		return validatePivot(eClass, eObject, null, context, constraintName, null, 0);
	}

	public boolean validate(EDataType eDataType, Object value,
			Map<Object, Object> context, String constraintName, String expression) {
		return validatePivot(eDataType, value, null, context, constraintName, null, 0);
	}

	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context,
			String constraintName, String expression, int severity, String source, int code) {
		return validatePivot(eClass, eObject, diagnostics, context, constraintName, source, code);
	}

	public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics, Map<Object, Object> context,
			String constraintName, String expression, int severity, String source, int code) {
		return validatePivot(eDataType, value, diagnostics, context, constraintName, source, code);
	}

	protected boolean validatePivot(EClassifier eClassifier, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context, String constraintName, String source, int code) {
		MetaModelManager metaModelManager = delegateDomain.getMetaModelManager();
		Type type = delegateDomain.getPivot(Type.class, eClassifier);
		Constraint constraint = ValidationBehavior.INSTANCE.getConstraint(metaModelManager, eClassifier, constraintName);
		if (constraint == null) {
			String message = DomainUtil.bind(OCLMessages.MissingBodyForInvocationDelegate_ERROR_, type);
			throw new OCLDelegateException(message);
		}
		ExpressionInOcl query = ValidationBehavior.INSTANCE.getExpressionInOcl(metaModelManager, type, constraint);
		if (query == null) {
			String message = DomainUtil.bind(OCLMessages.MissingBodyForInvocationDelegate_ERROR_, type);
			throw new OCLDelegateException(message);
		}
		return validateExpressionInOcl(eClassifier, value, diagnostics, context,
			constraintName, source, code, query);
	}
	protected boolean check(EvaluationVisitor evaluationVisitor, String constraintName, ExpressionInOcl query) {
		if (query.getType() != evaluationVisitor.getMetaModelManager().getBooleanType()) {
			String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
			String message = DomainUtil.bind(OCLMessages.ValidationConstraintIsNotBoolean_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			throw new OCLDelegateException(message);
		}
		try {
			Value result = query.accept(evaluationVisitor);
			if (result.isNull()) {
				String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
				String message = DomainUtil.bind(OCLMessages.ValidationResultIsNull_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
				throw new OCLDelegateException(message);
			}
			return result.asBoolean();
		} catch (InvalidValueException e) {
			String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
			String message = DomainUtil.bind(OCLMessages.ValidationResultIsNotBoolean_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			throw new OCLDelegateException(message, e);
		} catch (InvalidEvaluationException e) {
			String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
			String message = DomainUtil.bind(OCLMessages.ValidationResultIsInvalid_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			throw new OCLDelegateException(message, e);
		}
	}

	protected boolean validateExpressionInOcl(EClassifier eClassifier, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context, String constraintName, String source, int code, ExpressionInOcl query) {
		EvaluationVisitor evaluationVisitor = createEvaluationVisitor(value, query);
		if (query.getType() != evaluationVisitor.getMetaModelManager().getBooleanType()) {
			String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
			String message = DomainUtil.bind(OCLMessages.ValidationConstraintIsNotBoolean_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			throw new OCLDelegateException(message);
		}
		Value result;
		try {
			result = query.accept(evaluationVisitor);
			if (result.isNull()) {
				if (diagnostics == null) {
					String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
					String message = DomainUtil.bind(OCLMessages.ValidationResultIsNull_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
					throw new OCLDelegateException(message);
				}
			}
			else if (result.asBoolean()) {
				return true;
			}
		} catch (InvalidValueException e) {
			String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
			String message = DomainUtil.bind(OCLMessages.ValidationResultIsNotBoolean_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			throw new OCLDelegateException(message, e);
		} catch (InvalidEvaluationException e) {
			String objectLabel = DomainUtil.getLabel(query.getContextVariable().getType());
			String message = DomainUtil.bind(OCLMessages.ValidationResultIsInvalid_ERROR_, PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			throw new OCLDelegateException(message, e);
		}
		if (diagnostics != null) {
			String message = evaluateMessage(evaluationVisitor, constraintName, query);
			if (message == null) {
				Object objectLabel = DomainUtil.getLabel(eClassifier, value, context);
				message = DomainUtil.bind(EvaluatorMessages.ValidationConstraintIsNotSatisfied_ERROR_,
					PivotUtil.getConstraintTypeName(query), constraintName, objectLabel);
			}
			int severity = result.isNull() ? Diagnostic.ERROR : Diagnostic.WARNING;
		    diagnostics.add(new BasicDiagnostic(severity, source, code, message, new Object [] { value }));
		}
		return false;
	}
}
