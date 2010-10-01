/**
 * <copyright>
 *
 * Copyright (c) 2007, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EvaluationVisitorDecorator.java,v 1.1.2.1 2010/10/01 13:51:57 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.evaluation;

import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.AssociationClassCallExp;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MessageExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StateExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralPart;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableExp;

/**
 * A visitor that decorates another {@link EvaluationVisitor}, to intercept
 * invocations of the <code>visitXxx(...)</code> methods.  By default, every
 * visitation is simply delegated to the decorated visitor.  Subclasses may
 * extend these delegations with any additional behaviour that is required,
 * even replacing calls to the delegate where necessary.
 * <p>
 * This class works together with the {@link AbstractEvaluationVisitor} to
 * ensure that recursive <code>visitXxx()</code> calls are correctly intercepted
 * by me (and not just implemented within the decorated visitor).  Moreover,
 * this works with decorators nested to any depth.
 * </p>
 * 
 * @author Christian W. Damus (cdamus)
 */
public class EvaluationVisitorDecorator implements EvaluationVisitor<Object> {

    private final EvaluationVisitor<?> delegate;
    
    protected EvaluationVisitorDecorator(EvaluationVisitor<?> decorated) {
        assert decorated != null : "cannot decorate a null visitor"; //$NON-NLS-1$
        
        this.delegate = decorated;
        
        setupRecursion(decorated, this);
    }
    
    /**
     * Configures the specified decorated visitor to correctly handle the
     * invocation of recursive <code>visitXxx(...)</code> calls.  In particular,
     * the tail of a chain of decorators is informed (if it is an
     * {@link AbstractEvaluationVisitor} of the head decorator of the chain,
     * so that recursive visitation follows the entire decorator chain at
     * every step.
     * 
     * @param decorated a visitor that is decorated by a decorator
     * @param decorator the decorator decorating the decorated visitor
     */
    static 
    void setupRecursion(
            EvaluationVisitor<?> decorated,
            EvaluationVisitorDecorator decorator) {
        if (decorated instanceof AbstractEvaluationVisitor) {
            // tell the visitor to recursively invoke the head decorator so
            //   that it may intercept the recursion
            AbstractEvaluationVisitor
                abstractVisitor = (AbstractEvaluationVisitor) decorated;
            
            abstractVisitor.setVisitor(decorator);
        } else if (decorated instanceof EvaluationVisitorDecorator) {
            // propagate the head decorator down the chain to the tail
            //   (which, hopefully, is an AbstractEvaluationVisitor)
            EvaluationVisitorDecorator
                nestedDecorator = (EvaluationVisitorDecorator) decorated;
            
            setupRecursion(nestedDecorator.getDelegate(), decorator);
        }
    }
    
    /**
     * Obtains the visitor that I decorate.
     * 
     * @return my decorated visitor
     */
    protected final EvaluationVisitor<?>
    getDelegate() {
        return delegate;
    }
    
    /**
     * Obtains my delegate's environment.
     */
    public Environment getEnvironment() {
        return getDelegate().getEnvironment();
    }

    /**
     * Obtains my delegate's evaluation environment.
     */
    public EvaluationEnvironment getEvaluationEnvironment() {
        return getDelegate().getEvaluationEnvironment();
    }

    /**
     * Obtains my delegate's extent map.
     */
    public Map<? extends org.eclipse.ocl.examples.pivot.Class, ? extends Set<?>> getExtentMap() {
        return getDelegate().getExtentMap();
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitConstraint(Constraint constraint) {
        return getDelegate().visitConstraint(constraint);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitExpression(OclExpression expression) {
        return getDelegate().visitExpression(expression);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitAssociationClassCallExp(
            AssociationClassCallExp callExp) {
        return getDelegate().visitAssociationClassCallExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitBooleanLiteralExp(BooleanLiteralExp literalExp) {
        return getDelegate().visitBooleanLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitCollectionItem(CollectionItem item) {
        return getDelegate().visitCollectionItem(item);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitCollectionLiteralExp(CollectionLiteralExp literalExp) {
        return getDelegate().visitCollectionLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitCollectionRange(CollectionRange range) {
        return getDelegate().visitCollectionRange(range);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitEnumLiteralExp(EnumLiteralExp literalExp) {
        return getDelegate().visitEnumLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitExpressionInOcl(ExpressionInOcl expression) {
        return getDelegate().visitExpressionInOcl(expression);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitIfExp(IfExp ifExp) {
        return getDelegate().visitIfExp(ifExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitIntegerLiteralExp(IntegerLiteralExp literalExp) {
        return getDelegate().visitIntegerLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitInvalidLiteralExp(InvalidLiteralExp literalExp) {
        return getDelegate().visitInvalidLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitIterateExp(IterateExp callExp) {
        return getDelegate().visitIterateExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitIteratorExp(IteratorExp callExp) {
        return getDelegate().visitIteratorExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitLetExp(LetExp letExp) {
        return getDelegate().visitLetExp(letExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitMessageExp(MessageExp messageExp) {
        return getDelegate().visitMessageExp(messageExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitNullLiteralExp(NullLiteralExp literalExp) {
        return getDelegate().visitNullLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitOperationCallExp(OperationCallExp callExp) {
        return getDelegate().visitOperationCallExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitPropertyCallExp(PropertyCallExp callExp) {
        return getDelegate().visitPropertyCallExp(callExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitRealLiteralExp(RealLiteralExp literalExp) {
        return getDelegate().visitRealLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitStateExp(StateExp stateExp) {
        return getDelegate().visitStateExp(stateExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitStringLiteralExp(StringLiteralExp literalExp) {
        return getDelegate().visitStringLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitTupleLiteralExp(TupleLiteralExp literalExp) {
        return getDelegate().visitTupleLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitTupleLiteralPart(TupleLiteralPart part) {
        return getDelegate().visitTupleLiteralPart(part);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitTypeExp(TypeExp typeExp) {
        return getDelegate().visitTypeExp(typeExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitUnlimitedNaturalLiteralExp(
            UnlimitedNaturalLiteralExp literalExp) {
        return getDelegate().visitUnlimitedNaturalLiteralExp(literalExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitUnspecifiedValueExp(UnspecifiedValueExp unspecExp) {
        return getDelegate().visitUnspecifiedValueExp(unspecExp);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitVariable(Variable variable) {
        return getDelegate().visitVariable(variable);
    }

    /**
     * Delegates to my decorated visitor.
     */
    public Object visitVariableExp(VariableExp variableExp) {
        return getDelegate().visitVariableExp(variableExp);
    }
}
