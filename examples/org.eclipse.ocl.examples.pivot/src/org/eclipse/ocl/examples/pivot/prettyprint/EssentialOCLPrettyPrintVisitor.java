/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D. Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PrettyPrintExprVisitor.java,v 1.7 2011/05/13 18:41:43 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot.prettyprint;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.ConstructorExp;
import org.eclipse.ocl.examples.pivot.ConstructorPart;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.ExpressionInOcl;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.Iteration;
import org.eclipse.ocl.examples.pivot.IteratorExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.PivotPackage;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralPart;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.UMLReflection;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.util.AbstractVisitor;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;

/**
 * The PrettyPrintExprVisitor supports pretty printing of OCL expressions.
 * PrettyPrintOptions may be used to configure the printing.
 */
public class EssentialOCLPrettyPrintVisitor extends PivotPrettyPrintVisitor
{	
	private static final class Factory implements PrettyPrinter.Factory
	{
		private Factory() {
			PrettyPrinter.addFactory(PivotPackage.eINSTANCE, this);
		}

		public AbstractVisitor<Object, PrettyPrinter> createPrettyPrintVisitor(PrettyPrinter printer) {
			return new EssentialOCLPrettyPrintVisitor(printer);
		}
	}

	public static PrettyPrinter.Factory FACTORY = new Factory();

	public EssentialOCLPrettyPrintVisitor(PrettyPrinter context) {
		super(context);
	}

	protected void appendSourceNavigation(CallExp object) {
		OclExpression source = object.getSource();
		if (source != null) {
			if (!(source instanceof VariableExp) || !((VariableExp)source).isImplicit()) {
				if ((source instanceof OperationCallExp)
				 && (((OperationCallExp)source).getReferredOperation() != null)
				 && (((OperationCallExp)source).getReferredOperation().getPrecedence() != null)) {
					context.append("(");
					context.precedenceVisit(source, null);
					context.append(")");
				}
				else {
					safeVisit(source);
				}
				if (source.getType() instanceof CollectionType) {
					context.append(object.isImplicit() ? "." : "->");				// "." for implicit collect
				}
				else {
					if (!object.isImplicit()) {
						context.append(".");
					}
				}
			}
		}
	}

	@Override
	public Object visitBooleanLiteralExp(BooleanLiteralExp object) {
		context.append(Boolean.toString(object.isBooleanSymbol()));
		return null;
	}

	@Override
	public Object visitCollectionItem(CollectionItem object) {
		safeVisit(object.getItem());
		return null;
	}

	@Override
	public Object visitCollectionLiteralExp(CollectionLiteralExp object) {
		context.appendName(object.getType(), context.getReservedNames());
		List<CollectionLiteralPart> parts = object.getPart();
		if (parts.isEmpty()) {
			context.append("{}");
		}
		else {
			context.push("{", "");
			String prefix = ""; //$NON-NLS-1$
			for (CollectionLiteralPart part : parts) {
				context.append(prefix);
				safeVisit(part);
				prefix = ", ";
			}
			context.exdent("", "}", "");
			context.pop();
		}
		return null;
	}

	@Override
	public Object visitCollectionRange(CollectionRange object) {
		safeVisit(object.getFirst());
		context.next("", "..", "");
        safeVisit(object.getLast());
		return null;
	}

	@Override
	public Object visitConstraint(Constraint object) {
		String stereotype = object.getStereotype();
		if (UMLReflection.BODY.equals(stereotype)) {
			context.append("body");
		}
		else if (UMLReflection.DERIVATION.equals(stereotype)) {
			context.append("der");
		}
		else if (UMLReflection.INITIAL.equals(stereotype)) {
			context.append("init");
		}
		else if (UMLReflection.INVARIANT.equals(stereotype)) {
			context.append("inv");
		}
		else if (UMLReflection.POSTCONDITION.equals(stereotype)) {
			context.append("post");
		}
		else if (UMLReflection.PRECONDITION.equals(stereotype)) {
			context.append("pre");
		}
		else {
			context.append(stereotype);
		}
		if (object.getName() != null) {
			context.append(" ");
			context.appendName(object);
		}
		context.push(":", " ");
        safeVisit(object.getSpecification());
		context.pop();
		return null;
	}

    @Override
	public Value visitConstructorExp(ConstructorExp object) {
		context.appendQualifiedType(object.getType());
		context.push("{", "");
		String prefix = ""; //$NON-NLS-1$
		for (ConstructorPart part : object.getPart()) {
			context.append(prefix);
			safeVisit(part);
			prefix = ", ";
		}
		context.exdent("", "}", "");
		context.pop();
		return null;
    }

	@Override
	public String visitConstructorPart(ConstructorPart part) {
		context.appendName(part.getReferredProperty());
		OclExpression initExpression = part.getInitExpression();
		if (initExpression != null) {
			context.append(" = ");
			safeVisit(initExpression);
		}
		return null;
	}

	@Override
	public Object visitEnumLiteralExp(EnumLiteralExp object) {
		safeVisit(object.getReferredEnumLiteral());
		return null;
	}

	@Override
	public Object visitExpressionInOcl(ExpressionInOcl object) {
		safeVisit(object.getBodyExpression());
		return null;
	}

	@Override
	public Object visitIfExp(IfExp object) {
		context.push("if", " ");
		safeVisit(object.getCondition());
		context.exdent(" ", "then", " ");
		safeVisit(object.getThenExpression());
		context.exdent(" ", "else", " ");
        safeVisit(object.getElseExpression());
		context.exdent(" ", "endif", "");
		context.pop();
		return null;
	}

	@Override
	public Object visitIntegerLiteralExp(IntegerLiteralExp object) {
		context.append(object.getIntegerSymbol());
		return null;
	}

	@Override
	public Object visitInvalidLiteralExp(InvalidLiteralExp object) {
		context.append("invalid");
		return null;
	}

	@Override
	public Object visitIterateExp(IterateExp object) {
		List<Variable> iterators = object.getIterator();
		Operation referredOperation = object.getReferredIteration();
		appendSourceNavigation(object);
		context.appendName(referredOperation);
		context.push("(", "");
		String prefix = null;
		if (iterators.size() > 0) {
			boolean hasExplicitIterator = false;
			for (Variable iterator : iterators) {
				if (!iterator.isImplicit()) {
					if (prefix != null) {
						context.next(null, prefix, " ");
					}
					safeVisit(iterator);
					prefix = ",";
					hasExplicitIterator = true;
				}
			}
			if (hasExplicitIterator) {
				prefix = ";";
			}
			if (prefix != null) {
				context.next(null, prefix, " ");
			}
			safeVisit(object.getResult());
			context.next(null, " |", " ");
		}
		safeVisit(object.getBody());
		context.next("", ")", "");
		context.pop();
		return null;
	}

	@Override
	public Object visitIteratorExp(IteratorExp object) {
		Iteration referredIteration = object.getReferredIteration();
		List<Variable> iterators = object.getIterator();
		appendSourceNavigation(object);
		if (object.isImplicit()) {
			assert referredIteration.getName().equals("collect");
			assert iterators.size() == 1;
			safeVisit(object.getBody());
		}
		else {
			context.appendName(referredIteration);
			context.push("(", "");
			if (iterators.size() > 0) {
				String prefix = null;
				boolean hasExplicitIterator = false;
				for (Variable iterator : iterators) {
					if (!iterator.isImplicit()) {
						if (prefix != null) {
							context.next(null, prefix, " ");
						}
						safeVisit(iterator);
						prefix = ",";
						hasExplicitIterator = true;
					}
				}
				if (hasExplicitIterator) {
					context.next(null, " |", " ");
				}
				else if (prefix != null) {
					context.next(null, prefix, " ");
				}
			}
			safeVisit(object.getBody());
			context.next("", ")", "");
			context.pop();
		}
		return null;
	}

	@Override
	public Object visitLetExp(LetExp object) {
		context.push("let", " ");
		safeVisit(object.getVariable());
		context.exdent(" ", "in", " ");
        safeVisit(object.getIn());
		context.pop();
		return null;
	}

	@Override
	public Object visitNullLiteralExp(NullLiteralExp object) {
		context.append("null");
		return null;
	}

	@Override
	public Object visitOclExpression(OclExpression object) {
		context.append("<");
		context.append(object.eClass().getName());
		context.append(">");
		return null;
	}

	@Override
	public Object visitOpaqueExpression(OpaqueExpression object) {
		context.append(PivotUtil.getBody(object));
		return null;
	}

	@Override
	public Object visitOperationCallExp(OperationCallExp object) {
		OclExpression source = object.getSource();
		List<OclExpression> arguments = object.getArgument();
		Operation referredOperation = object.getReferredOperation();
		Precedence precedence = referredOperation != null ? referredOperation.getPrecedence() : null;
		if (precedence == null) {
			appendSourceNavigation(object);
			if (!object.isImplicit()) {
				context.appendName(referredOperation);
				context.push("(", "");
				String prefix = null; //$NON-NLS-1$
				for (OclExpression argument : arguments) {
					if (prefix != null) {
						context.next(null, prefix, " ");
					}
					context.precedenceVisit(argument, null);
					prefix = ",";
				}
				context.next("", ")", "");
				context.pop();
			}
		}
		else {
			Precedence currentPrecedence = context.getCurrentPrecedence();
			boolean lowerPrecedence = (currentPrecedence  != null) && precedence.getOrder().compareTo(currentPrecedence.getOrder()) > 0;
			if (lowerPrecedence) {
				context.push("(", null);
			}
			if (arguments.size() == 0) {			// Prefix
				context.appendName(referredOperation, null);
				if ((referredOperation != null) && PivotUtil.isValidIdentifier(referredOperation.getName())) {
					context.append(" ");			// No space for unary minus
				}
				context.precedenceVisit(source, precedence);
			}
			else {			// Infix
				context.precedenceVisit(source, precedence);
				context.next(" ", context.getName(referredOperation, null), " ");
				context.precedenceVisit(arguments.get(0), precedence);
			}
			if (lowerPrecedence) {
				context.exdent("", ")", "");
				context.pop();
			}
		}
		return null;
	}

	@Override
	public Object visitParameter(Parameter object) {
		context.appendName(object);
		Type type = object.getType();
		if (type != null) {
			context.append(" : ");
			context.appendQualifiedType(type);
		}
		return null;
	}

	@Override
	public Object visitPropertyCallExp(PropertyCallExp object) {
		appendSourceNavigation(object);
		context.appendName(object.getReferredProperty());
		return null;
	}

	@Override
	public Object visitRealLiteralExp(RealLiteralExp object) {
		context.append(object.getRealSymbol());
		return null;
	}

	@Override
	public Object visitStringLiteralExp(StringLiteralExp object) {
		context.append("'");
		context.append(PivotUtil.convertToOCLString(object.getStringSymbol()));
		context.append("'");
		return null;
	}

	@Override
	public Object visitTupleLiteralExp(TupleLiteralExp object) {
		context.append("Tuple");
		context.push("{", "");
		String prefix = ""; //$NON-NLS-1$
		for (TupleLiteralPart part : object.getPart()) {
			context.append(prefix);
			safeVisit(part);
			prefix = ", ";
		}
		context.exdent("", "}", "");
		context.pop();
		return null;
	}

	@Override
	public Object visitTupleLiteralPart(TupleLiteralPart object) {
		context.appendName(object);
		context.append(" = ");
		safeVisit(object.getInitExpression());
		return null;
	}

	@Override
	public Object visitTypeExp(TypeExp object) {
		context.appendQualifiedType(object.getReferredType());
		return null;
	}

	@Override
	public Object visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp object) {
		BigInteger symbol = object.getUnlimitedNaturalSymbol();
		if (symbol.signum() < 0) {
			context.append("*");
		}
		else {
			context.append(symbol);
		}
		return null;
	}

	@Override
	public Object visitVariable(Variable object) {
		context.appendName(object);
		Type type = object.getType();
		if (type != null) {
			context.append(" : ");
			context.appendQualifiedType(type);
		}
		OclExpression initExpression = object.getInitExpression();
		if (initExpression != null) {
			context.append(" = ");
			safeVisit(initExpression);
		}
		return null;
	}

	@Override
	public Object visitVariableExp(VariableExp object) {
		VariableDeclaration referredVariable = object.getReferredVariable();
		if ((referredVariable != null) && "self".equals(referredVariable.getName())) {
			context.appendName(referredVariable, null);
		}
		else {
			context.appendName(referredVariable);
		}
		return null;
	}
}
