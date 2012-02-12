/**
 * <copyright>
 *
 * Copyright (c) 2005,2011 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bugs 238050, 253252
 *   Radek Dvorak - Bugs 261128, 265066
 *
 * </copyright>
 *
 * $Id: AbstractEvaluationVisitor.java,v 1.8 2011/05/07 16:41:08 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.evaluation;

import java.util.Set;

import org.eclipse.ocl.examples.domain.elements.DomainExpression;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.evaluation.EvaluationHaltedException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidEvaluationException;
import org.eclipse.ocl.examples.domain.evaluation.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.NullValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.ValueSpecification;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.util.AbstractExtendingVisitor;
import org.eclipse.ocl.examples.pivot.util.Visitable;

/**
 * An evaluation visitor implementation for OCL expressions.
 * <p>
 * <b>Note</b> that this class is not intended to be used or extended by
 * clients.  Use the {@link AbstractEvaluationVisitor} interface, instead.
 * </p>
 * <p>
 * See the {@link Environment} class for a description of the
 * generic type parameters of this class. 
 * </p>
 * 
 * @author Tim Klinger (tklinger)
 * @author Christian W. Damus (cdamus)
 */
public abstract class AbstractEvaluationVisitor
	extends AbstractExtendingVisitor<Value, Object> implements EvaluationVisitor {

    // stereotypes associated with boolean-valued constraints
	private static Set<String> BOOLEAN_CONSTRAINTS;
	
	protected final EvaluationEnvironment evaluationEnvironment;
	protected final Environment environment;
	protected final MetaModelManager metaModelManager;	
	protected final DomainModelManager modelManager;
	protected final ValueFactory valueFactory;;

    private EvaluationVisitor undecoratedVisitor;

    /**
     * Set true by {@link #setCanceled} to terminate execution at next call to {@link #getValuefactory()}.
     */
	private boolean isCanceled = false;
    
	static {
		BOOLEAN_CONSTRAINTS = new java.util.HashSet<String>();
		BOOLEAN_CONSTRAINTS.add(UMLReflection.INVARIANT);
		BOOLEAN_CONSTRAINTS.add(UMLReflection.PRECONDITION);
		BOOLEAN_CONSTRAINTS.add(UMLReflection.POSTCONDITION);
	}
	
	/**
	 * Initializes me.
	 * 
     * @param env the current environment
	 * @param evalEnv an evaluation environment (map of variable names to values)
	 * @param modelManager a map of classes to their instance sets
	 */
	protected AbstractEvaluationVisitor(
			Environment env,
			EvaluationEnvironment evalEnv,
			DomainModelManager modelManager) {
        super(null);
        this.evaluationEnvironment = evalEnv;
        this.environment = env;
        this.metaModelManager = env.getMetaModelManager();
        this.modelManager = modelManager;
		this.valueFactory = evalEnv.getValueFactory();
        this.undecoratedVisitor = this;  // assume I have no decorator
    }

    // implements the interface method
	public Environment getEnvironment() {
		return environment;
	}
    
    // implements the interface method
	public EvaluationEnvironment getEvaluationEnvironment() {
		return evaluationEnvironment;
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}
	
    // implements the interface method
	public DomainModelManager getModelManager() {
		return modelManager;
	}

	public DomainStandardLibrary getStandardLibrary() {
		return metaModelManager;
	}
  
    /**
     * Obtains the visitor on which I perform nested
     * {@link Visitable#accept(org.eclipse.ocl.utilities.Visitor)} calls.  This
     * handles the case in which I am decorated by another visitor that must
     * intercept every <tt>visitXxx()</tt> method.  If I internally just
     * recursively visit myself, then this decorator is cut out of the picture.
     * 
     * @return my delegate visitor, which may be my own self or some other
     */
    protected EvaluationVisitor getUndecoratedVisitor() {
        return undecoratedVisitor;
    }

	public ValueFactory getValueFactory() {
		if (isCanceled) {
			throw new EvaluationHaltedException("Canceled");
		}
		return valueFactory;
	}
    
    /**
     * Obtains the visitor on which I perform nested
     * {@link Visitable#accept(org.eclipse.ocl.utilities.Visitor)} calls.  This
     * handles the case in which I am decorated by another visitor that must
     * intercept every <tt>visitXxx()</tt> method.  If I internally just
     * recursively visit myself, then this decorator is cut out of the picture.
     * 
     * @return my delegate visitor, which may be my own self or some other
     * 
     * @deprecated use {@link #getUndecoratedVisitor}
     */
	@Deprecated
    protected final EvaluationVisitor getVisitor() {
        return undecoratedVisitor;
    }

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

    /**
     * Sets the visitor on which I perform nested
     * {@link Visitable#accept(org.eclipse.ocl.utilities.Visitor)} calls.
     * 
     * @param visitor my delegate visitor
     * 
     * @see #getUndecoratedVisitor()
     */
	public void setUndecoratedVisitor(EvaluationVisitor evaluationVisitor) {
        this.undecoratedVisitor = evaluationVisitor;
	}
    
    /**
     * Sets the visitor on which I perform nested
     * {@link Visitable#accept(org.eclipse.ocl.utilities.Visitor)} calls.
     * 
     * @param visitor my delegate visitor
     * 
     * @see #getVisitor()
     * 
     * @deprecated use {@link #setUndecoratedVisitor}
     */
	@Deprecated
    void setVisitor(EvaluationVisitor visitor) {
		setUndecoratedVisitor(visitor);
    }

	public NullValue throwInvalidEvaluation(String message) throws InvalidEvaluationException {
		return evaluationEnvironment.throwInvalidEvaluation(message);
	}


	public NullValue throwInvalidEvaluation(InvalidValueException e) throws InvalidEvaluationException {
		return evaluationEnvironment.throwInvalidEvaluation(e);
	}


	public NullValue throwInvalidEvaluation(Throwable e, DomainExpression expression, Object value, String message, Object... bindings) {
		return evaluationEnvironment.throwInvalidEvaluation(e, expression, value, message, bindings);
	}
	
	@Override
    public String toString() {
		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (evaluation environment: ");//$NON-NLS-1$
		result.append(getEvaluationEnvironment());
		result.append(')');
		return result.toString();
	}

	/**
	 * This default implementation asserts that the <tt>constraint</tt> is
	 * boolean-valued if it is an invariant, pre-condition, or post-condition
	 * constraint and returns the value of its body expression by delegation to
	 * {@link #visitExpression(OCLExpression)}.
	 */
	@Override
    public Value visitConstraint(Constraint constraint) {
		ValueSpecification specification = constraint.getSpecification();
		if (!(specification instanceof ExpressionInOcl)) {
			return null;
		}
		OclExpression body = ((ExpressionInOcl)specification).getBodyExpression();
		boolean isBoolean = BOOLEAN_CONSTRAINTS.contains(constraint.getStereotype());
		
		if (body == null) {
			throw new IllegalArgumentException("constraint has no body expression"); //$NON-NLS-1$
		}
		
		if (isBoolean && !(body.getType() != metaModelManager.getBooleanType())) {
			throw new IllegalArgumentException("constraint is not boolean"); //$NON-NLS-1$
		}
		
		Value result = body.accept(getUndecoratedVisitor());
		try {
			return result.asBooleanValue();
		} catch (InvalidValueException e) {
			return evaluationEnvironment.throwInvalidEvaluation(e);
		}
	}
} //EvaluationVisitorImpl
