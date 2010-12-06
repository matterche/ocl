/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
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
 * $Id: TracingEvaluationVisitor.java,v 1.1.2.3 2010/12/06 17:29:02 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.evaluation;

import org.eclipse.ocl.examples.pivot.AssociationClassCallExp;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MessageExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
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
import org.eclipse.ocl.examples.pivot.util.PivotPlugin;


/**
 * A decorator for evaluation visitors that is installed when evaluation tracing
 * is enabled, to trace interim evaluation results to the console.
 * 
 * @author Christian W. Damus (cdamus)
 */
public class TracingEvaluationVisitor extends EvaluationVisitorDecorator {

    /**
     * Initializes me with the visitor whose evaluation I trace to the console.
     * 
     * @param decorated a real evaluation visitor
     */
    public TracingEvaluationVisitor(EvaluationVisitor decorated) {
        super(decorated);
    }

	@Override
	public EvaluationVisitor createNestedVisitor() {
		return new TracingEvaluationVisitor(super.createNestedVisitor());
	}

    private boolean isInvalid(Object value) {
        return value == getEnvironment().getOCLStandardLibrary().getInvalidValue();
    }
    
    private Object trace(Object expression, Object value) {
        try {
            PivotPlugin.trace("Evaluate: " + expression); //$NON-NLS-1$
            PivotPlugin.trace("Result  : " + //$NON-NLS-1$
                (isInvalid(value)? "OclInvalid" : String.valueOf(value))); //$NON-NLS-1$
        } catch (Exception e) {
            // tracing must not interfere with evaluation
        }
        
        return value;
    }
    
    @Override
    public Object visitAssociationClassCallExp(AssociationClassCallExp callExp) {
        return trace(callExp, getDelegate().visitAssociationClassCallExp(callExp));
    }

    @Override
    public Object visitBooleanLiteralExp(BooleanLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitBooleanLiteralExp(literalExp));
    }

    @Override
    public Object visitCollectionItem(CollectionItem item) {
        return trace(item, getDelegate().visitCollectionItem(item));
    }

    @Override
    public Object visitCollectionLiteralExp(CollectionLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitCollectionLiteralExp(literalExp));
    }

    @Override
    public Object visitCollectionRange(CollectionRange range) {
        return trace(range, getDelegate().visitCollectionRange(range));
    }

    @Override
    public Object visitConstraint(Constraint constraint) {
        return trace(constraint, getDelegate().visitConstraint(constraint));
    }

    @Override
    public Object visitEnumLiteralExp(EnumLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitEnumLiteralExp(literalExp));
    }

//    @Override
//    public Object visitExpression(OclExpression expression) {
//        return trace(expression, getDelegate().visitExpression(expression));
//    }

    @Override
    public Object visitExpressionInOcl(ExpressionInOcl expression) {
        return trace(expression, getDelegate().visitExpressionInOcl(expression));
    }

    @Override
    public Object visitIfExp(IfExp ifExp) {
        return trace(ifExp, getDelegate().visitIfExp(ifExp));
    }

    @Override
    public Object visitIntegerLiteralExp(IntegerLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitIntegerLiteralExp(literalExp));
    }

    @Override
    public Object visitInvalidLiteralExp(InvalidLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitInvalidLiteralExp(literalExp));
    }

    @Override
    public Object visitLetExp(LetExp letExp) {
        return trace(letExp, getDelegate().visitLetExp(letExp));
    }

    @Override
    public Object visitMessageExp(MessageExp messageExp) {
        return trace(messageExp, getDelegate().visitMessageExp(messageExp));
    }

    @Override
    public Object visitNullLiteralExp(NullLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitNullLiteralExp(literalExp));
    }

    @Override
    public Object visitOperationCallExp(OperationCallExp callExp) {
        return trace(callExp, getDelegate().visitOperationCallExp(callExp));
    }

    @Override
    public Object visitPropertyCallExp(PropertyCallExp callExp) {
        return trace(callExp, getDelegate().visitPropertyCallExp(callExp));
    }

    @Override
    public Object visitRealLiteralExp(RealLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitRealLiteralExp(literalExp));
    }

    @Override
    public Object visitStateExp(StateExp stateExp) {
        return trace(stateExp, getDelegate().visitStateExp(stateExp));
    }

    @Override
    public Object visitStringLiteralExp(StringLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitStringLiteralExp(literalExp));
    }

    @Override
    public Object visitTupleLiteralExp(TupleLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitTupleLiteralExp(literalExp));
    }

    @Override
    public Object visitTupleLiteralPart(TupleLiteralPart part) {
        return trace(part, getDelegate().visitTupleLiteralPart(part));
    }

    @Override
    public Object visitTypeExp(TypeExp typeExp) {
        return trace(typeExp, getDelegate().visitTypeExp(typeExp));
    }

    @Override
    public Object visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp literalExp) {
        return trace(literalExp, getDelegate().visitUnlimitedNaturalLiteralExp(literalExp));
    }

    @Override
    public Object visitUnspecifiedValueExp(UnspecifiedValueExp unspecExp) {
        return trace(unspecExp, getDelegate().visitUnspecifiedValueExp(unspecExp));
    }

    @Override
    public Object visitVariable(Variable variable) {
        return trace(variable, getDelegate().visitVariable(variable));
    }

    @Override
    public Object visitVariableExp(VariableExp variableExp) {
        return trace(variableExp, getDelegate().visitVariableExp(variableExp));
    }
}
