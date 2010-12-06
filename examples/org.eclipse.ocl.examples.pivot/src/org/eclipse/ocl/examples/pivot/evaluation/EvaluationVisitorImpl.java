/**
 * <copyright>
 *
 * Copyright (c) 2005, 2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 253252
 *   Radek Dvorak - Bugs 261128, 265066
 *   E.D.Willink - Bug 297541
 *
 * </copyright>
 *
 * $Id: EvaluationVisitorImpl.java,v 1.1.2.4 2010/12/06 17:29:02 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.evaluation;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.AssociationClassCallExp;
import org.eclipse.ocl.examples.pivot.BooleanLiteralExp;
import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.CollectionItem;
import org.eclipse.ocl.examples.pivot.CollectionKind;
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp;
import org.eclipse.ocl.examples.pivot.CollectionLiteralPart;
import org.eclipse.ocl.examples.pivot.CollectionRange;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.CompleteClass;
import org.eclipse.ocl.examples.pivot.CompleteOperation;
import org.eclipse.ocl.examples.pivot.EnumLiteralExp;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.EnvironmentFactory;
import org.eclipse.ocl.examples.pivot.IfExp;
import org.eclipse.ocl.examples.pivot.ImplementableElement;
import org.eclipse.ocl.examples.pivot.IntegerLiteralExp;
import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.LetExp;
import org.eclipse.ocl.examples.pivot.MessageExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.OperationCallExp;
import org.eclipse.ocl.examples.pivot.Property;
import org.eclipse.ocl.examples.pivot.PropertyCallExp;
import org.eclipse.ocl.examples.pivot.RealLiteralExp;
import org.eclipse.ocl.examples.pivot.StateExp;
import org.eclipse.ocl.examples.pivot.StringLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralExp;
import org.eclipse.ocl.examples.pivot.TupleLiteralPart;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.TypeExp;
import org.eclipse.ocl.examples.pivot.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.examples.pivot.UnspecifiedValueExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.VariableDeclaration;
import org.eclipse.ocl.examples.pivot.VariableExp;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.ocl.examples.pivot.util.PivotPlugin;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.CompleteEnvironmentManager;
import org.eclipse.ocl.examples.pivot.values.CollectionUtil;

/**
 * An evaluation visitor implementation for OCL expressions.
 * 
 * @author Tim Klinger (tklinger)
 * @author Christian W. Damus (cdamus)
 * 
 * @since 1.3
 */
public class EvaluationVisitorImpl extends AbstractEvaluationVisitor
{

//	private static int tempCounter = 0;
	
	/**
	 * Constructor
	 * 
	 * @param env
	 *            an evaluation environment (map of variable names to values)
	 * @param extentMap
	 *            a map of classes to their instance lists
	 */
	public EvaluationVisitorImpl(Environment env,
			EvaluationEnvironment evalEnv,
			Map<? extends org.eclipse.ocl.examples.pivot.Class, ? extends Set<?>> extentMap) {
		super(env, evalEnv, extentMap);
	}



//	private static synchronized String generateName() {
//		return "__result__" + tempCounter++;//$NON-NLS-1$
//	}

	// private static inner class for lazy lists over an integer range
	private static final class IntegerRangeList
		extends AbstractList<Integer> {

//		public IntegerRangeList() {
//			super();
//		}

		public IntegerRangeList(int first, int last) {
			super();
			this.first = first;
			this.last = last;
		}

//		public int getFirst() {
//			return first;
//		}

//		public int getLast() {
//			return last;
//		}

		@Override
        public int size() {
			return last - first + 1;
		}

		@Override
        public Integer get(int index) {
			if (index < 0 || index >= size()) {
				String message = OCLMessages.bind(
						OCLMessages.IndexOutOfRange_ERROR_,
						new Object[] {
								Integer.toString(index),
								Integer.toString(first),
								Integer.toString(last)});
				IllegalArgumentException error = new IllegalArgumentException(
					message);
				PivotPlugin.throwing(getClass(), "get", error);//$NON-NLS-1$
				throw error;
			}
			return new Integer(first + index);
		}

		@Override
        public java.util.Iterator<Integer> iterator() {
			// local iterator class that provides
			// hasNext() and next() methods appropriate
			// for this range set
			class IntegerRangeIterator
				implements java.util.Iterator<Integer> {

				public IntegerRangeIterator() {
					curr = first;
					initialized = false;
				}

				public Integer next() {
					if (!initialized) {
						curr = first - 1;
						initialized = true;
					}
					if (hasNext()) {
                        return new Integer(++curr);
                    }
					throw new NoSuchElementException();
				}

				public boolean hasNext() {
					return curr < last;
				}

				public void remove() {
					throw new UnsupportedOperationException();
				}

				private int curr;

				private boolean initialized;
			}

			return new IntegerRangeIterator();
		}

		private int first;

		private int last;
	}

//	public void addVariable(VariableDeclaration variableDeclaration) {
//		getEvaluationEnvironment().add(variable.getName(), variable);
//	}

	protected Object callImplementation(ImplementableElement implementableElement, Object sourceValue, CallExp callExp) {
		if (implementableElement == null) {
			return createInvalidValue(sourceValue, callExp, "No implementable element", null);
		}
		CallableImplementation implementation = implementableElement.getImplementation();
		if (implementation == null) {
			String implementationClassName = implementableElement.getImplementationClass();
			try {
				implementation = loadImplementationClass(implementationClassName);
			} catch (Exception e) {
				return createInvalidValue(sourceValue, callExp, "Failed to load '" + implementationClassName + "'", e);
			}
			if (implementation == null) {
				return createInvalidValue(sourceValue, callExp, "Failed to load '" + implementationClassName + "'", null);
			}
		}
		return implementation.evaluate(getUndecoratedVisitor(), sourceValue, callExp);
	}

	public EvaluationVisitor createNestedVisitor() {
		Environment env = getEnvironment();
		EnvironmentFactory factory = env.getFactory();
		EvaluationEnvironment evalEnv = getEvaluationEnvironment();
    	EvaluationEnvironment nestedEvalEnv = factory.createEvaluationEnvironment(evalEnv);
		return new EvaluationVisitorImpl(env, nestedEvalEnv, getExtentMap());
	}

	public Object getValueOfVariable(VariableDeclaration variable) {
		if (variable == null) {
			return null;
		}
		Object value = getEvaluationEnvironment().getValueOf(variable.getName());
		if (value instanceof Visitable) {
			return ((Visitable) value).accept(getUndecoratedVisitor());
		}
		return value;
	}

	public CallableImplementation loadImplementationClass(String implementationClass) throws Exception {
		Class<?> theClass = Class.forName(implementationClass);
		Field field = theClass.getField("INSTANCE");
		Object object = field.get(null);
		return (CallableImplementation) object;
	}

	/**
	 * Callback for an AssociationClassCallExp visit. Evaluates the source of the
	 * expression and then reflectively gets the value of the reference on the
	 * result. For example, in "self.foo", "self" is the source and would be
	 * evaluated first, then the value of the reference "foo" would be derived
	 * on that object.
	 */
	@Override
    public Object visitAssociationClassCallExp(AssociationClassCallExp ae) {
		Object context = ae.getSource().accept(getUndecoratedVisitor());
		
		if (isUndefined(context)) {
			return getInvalidValue();
		}
		
		// evaluate attribute on source value
		return getEvaluationEnvironment().navigateAssociationClass(
			ae.getReferredAssociationClass(),
			ae.getNavigationSource(),
			context);
	}

	/**
	 * Callback for a BooleanLiteralExp visit.
	 * 
	 * @return the value of the boolean literal as a java.lang.Boolean.
	 */
	@Override
    public Object visitBooleanLiteralExp(BooleanLiteralExp booleanLiteralExp) {
    	boolean value = booleanLiteralExp.isBooleanSymbol();
		return Boolean.valueOf(value);
	}

	/**
	 * Callback for a CollectionLiteralExp visit.
	 */
	@Override
    public Object visitCollectionLiteralExp(CollectionLiteralExp cl) {
		// construct the appropriate collection from the parts
		// based on the collection kind.
		CollectionKind kind = cl.getKind();
		List<CollectionLiteralPart> parts = cl.getParts();
		Collection<Object> result = CollectionUtil.createNewCollection(kind);

		if ((kind == CollectionKind.SEQUENCE) && CollectionUtil.isSimpleRange(cl)) {
			// literal is of the form: Sequence{first..last}.
			// construct a list with a lazy iterator for it.
			CollectionRange collRange = (CollectionRange) parts.get(0);
			OclExpression first = collRange.getFirst();
			OclExpression last = collRange.getLast();

			// evaluate first value
			Integer firstVal = (Integer) first.accept(getUndecoratedVisitor());
			if (firstVal == null) {
				result.add(null);
				return result;
			}
			// evaluate last value
			Integer lastVal = (Integer) last.accept(getUndecoratedVisitor());
			if (lastVal == null) {
				result.add(null);
				return result;
			}

			int firstInt = firstVal.intValue();
			int lastInt = lastVal.intValue();
			if (firstInt > lastInt) {
                return result;
            }

			// construct a lazy integer list for the range
			return new IntegerRangeList(firstInt, lastInt);
		} else {
			// not a sequence or not a simple range
			for (CollectionLiteralPart part : parts) {
				if (part instanceof CollectionItem) {
					// CollectionItem part
					CollectionItem item = (CollectionItem) part;
					OclExpression itemExp = item.getItem();
					Object itemVal = itemExp.accept(getUndecoratedVisitor());
					if (itemVal != null) {
						// add it to the result set
						result.add(itemVal);
					}
				} else {
					// Collection range
					CollectionRange range = (CollectionRange) part;
					OclExpression first = range.getFirst();
					OclExpression last = range.getLast();

					// evaluate first value
					Integer firstVal = (Integer) first.accept(getUndecoratedVisitor());
					Integer lastVal = (Integer) last.accept(getUndecoratedVisitor());
					if (!((firstVal == null) || (lastVal == null))) {
						// TODO: enhance IntegerRangeList to support multiple ranges
						// add values between first and last inclusive
						int firstInt = firstVal.intValue();
						int lastInt = lastVal.intValue();
						for (int i = firstInt; i <= lastInt; i++) {
                            result.add(new Integer(i));
                        }
					}
				} // end of collection range

			} // end of parts iterator

		} // end of not-simple range case

		return result;
	} // end of Set, OrderedSet, Bag Literals

	/**
	 * Callback for an EnumLiteralExp visit. Get the referred enum literal and
	 * return it as an Integer.
	 * 
	 * @param el
	 *            the enumeration literal expresion
	 * @return the enumeration literal as an Integer
	 */
	@Override
    public Object visitEnumLiteralExp(EnumLiteralExp el) {
		return getEvaluationEnvironment().getValue(el.getReferredEnumLiteral());
	}

	/**
	 * Callback for an IfExp visit.
	 */
	@Override
    public Object visitIfExp(IfExp ifExp) {
		OclExpression condition = ifExp.getCondition();
		if (condition == null) {
			return null;
		}
		Object evaluatedCondition = condition.accept(getUndecoratedVisitor());
		OclExpression expression = null;
		if (evaluatedCondition == Boolean.TRUE) {
			expression = ifExp.getThenExpression();
		} else if (evaluatedCondition == Boolean.FALSE) {
			expression = ifExp.getElseExpression();
		}
		if (expression == null) {
			return null;
		}
		return expression.accept(getUndecoratedVisitor());
	}

	/**
	 * Callback for an IntegerLiteralExp visit.
	 * 
	 * @return the value of the integer literal as a java.lang.Integer.
	 */
	@Override
    public Object visitIntegerLiteralExp(IntegerLiteralExp integerLiteralExp) {
		BigInteger value = integerLiteralExp.getIntegerSymbol();
		return value != null ? getIntegerValue(value) : null;
	}

	@Override
    public Object visitInvalidLiteralExp(InvalidLiteralExp invalidLiteralExp) {
		return invalidLiteralExp;
	}

	/**
	 * Callback for an IterateExp visit.
	 *
	@Override
    public Object visitIterateExp(IterateExp iterateExp) {
		OclExpression source = iterateExp.getSource();	// FIXME self
		Object sourceValue = source != null ? source.accept(getUndecoratedVisitor()) : null;
		Iterate iterate = iterateExp.getReferredIterate();
		return callImplementation(iterate, sourceValue, iterateExp);
	} */

	/**
	 * Callback for an IteratorExp visit.
	 *
	@Override
    public Object visitIteratorExp(IteratorExp iteratorExp) {
		OclExpression source = iteratorExp.getSource();	// FIXME self
		Object sourceValue = source != null ? source.accept(getUndecoratedVisitor()) : null;
		Iterator iterator = iteratorExp.getReferredIterator();
		return callImplementation(iterator, sourceValue, iteratorExp);
	} */

	/**
	 * Callback for LetExp visit.
	 */
	@Override
    public Object visitLetExp(LetExp letExp) {
		OclExpression expression = letExp.getIn();
		if (expression == null) {
			return null;
		}
		Variable variable = letExp.getVariable();
		if (variable == null) {
			return null;
		}
    	EvaluationVisitor nestedVisitor = getUndecoratedVisitor().createNestedVisitor();		
//    	EvaluationEnvironment nestedEvalEnv = nestedVisitor.getEvaluationEnvironment();    	
		nestedVisitor.getEvaluationEnvironment().addVariable(variable, variable);
		return expression.accept(nestedVisitor);
/*
		String name = (String) variable.accept(getUndecoratedVisitor());
		
		try {
			// evaluate the "in" part of the let
			OclExpression inExp = letExp.getIn();
			// return the value of the "in"			
			return inExp.accept(getUndecoratedVisitor());
			
		} finally {
			// remove the variable-init expression binding from the environment
			getEvaluationEnvironment().remove(name);
		} */
	}

	
	@Override
    public Object visitMessageExp(MessageExp m) {
		throw new UnsupportedOperationException("evaluation of MessageExp"); //$NON-NLS-1$
	}

	@Override
    public Object visitNullLiteralExp(NullLiteralExp nullLiteralExp) {
		return getNullValue();
	}

	/**
	 * 
	 * Callback for an OperationCallExp visit.
	 *  
	 */
	@Override
    public Object visitOperationCallExp(OperationCallExp operationCallExp) {
		OclExpression source = operationCallExp.getSource();	// FIXME self
		Object sourceValue = source != null ? source.accept(getUndecoratedVisitor()) : null;
		Type dynamicSourceType = getStandardLibrary().getTypeOfValue(sourceValue, source != null ? source.getType() : operationCallExp.getReferredOperation().getClass_());
		Operation staticOperation = operationCallExp.getReferredOperation();
		CompleteEnvironmentManager completeManager = getEnvironment().getPivotManager().getCompleteEnvironmentManager();
		CompleteOperation staticCompleteOperation = completeManager.getCompleteOperation(staticOperation);
		CompleteClass dynamicCompleteClass = completeManager.getCompleteClass((org.eclipse.ocl.examples.pivot.Class)dynamicSourceType);
		CompleteOperation dynamicOperation = dynamicCompleteClass.getDynamicOperation(staticCompleteOperation);
		return callImplementation(dynamicOperation, sourceValue, operationCallExp);
	}

	/**
	 * 
	 * Callback for an OperationCallExp visit.
	 *  
	 */
	@Override
    public Object visitPropertyCallExp(PropertyCallExp propertyCallExp) {
		OclExpression source = propertyCallExp.getSource();	// FIXME self
		Object sourceValue = source != null ? source.accept(getUndecoratedVisitor()) : null;
		Property property = propertyCallExp.getReferredProperty();
		return callImplementation(property, sourceValue, propertyCallExp);
	}

	/**
	 * Callback for a PropertyCallExp visit. Evaluates the source of the
	 * expression and then reflectively gets the value of the property on the
	 * result. For example, in "self.foo", "self" is the source and would be
	 * evaluated first, then the value of the property "foo" would be accessed
	 * on that object.
	 */
//	@Override
    public Object visitPropertyCallExp2(PropertyCallExp pc) {
		Property property = pc.getReferredProperty();
		OclExpression source = pc.getSource();

		// evaluate source
		Object context = source.accept(getUndecoratedVisitor());

		// if source is undefined, result is OclInvalid
		if (isUndefined(context)) {
            return getInvalidValue();
        }

		OclExpression derivation = getPropertyBody(property);
		if (derivation != null) {
			// this is an additional property
			
			return navigate(property, derivation, context);
		}
		
		List<Object> qualifiers;
		
		if (pc.getQualifiers().isEmpty()) {
			qualifiers = Collections.emptyList();
		} else {
			// handle qualified association navigation
			qualifiers = new java.util.ArrayList<Object>();
			
			for (OclExpression q : pc.getQualifiers()) {
				qualifiers.add(q.accept(getUndecoratedVisitor()));
			}
		}
		
		Object result = getEvaluationEnvironment().navigateProperty(property, qualifiers, context);
		
		if ((pc.getType() instanceof CollectionType) && !(result instanceof Collection<?>)) {
			// this was an XSD "unspecified multiplicity".  Now that we know what
			//    the multiplicity is, we can coerce it to a collection value
			CollectionKind kind = CollectionUtil.getKind((CollectionType) pc.getType());
			
			Collection<Object> collection = CollectionUtil.createNewCollection(kind);
			
			collection.add(result);
			result = collection;
		}
		
		return result;
	}

	/**
	 * Callback for a RealLiteralExp visit.
	 * 
	 * @return the value of the real literal as a java.lang.Double.
	 */
	@Override
    public Object visitRealLiteralExp(RealLiteralExp realLiteralExp) {
		BigDecimal value = realLiteralExp.getRealSymbol();
		return value != null ? getRealValue(value) : null;
	}
	
	@Override
    public Object visitStateExp(StateExp s) {
		return s.getReferredState();
	}

	/**
	 * Callback for a StringLiteralExp visit.
	 * 
	 * @return the value of the string literal as a java.lang.String.
	 */
	@Override
    public Object visitStringLiteralExp(StringLiteralExp stringLiteralExp) {
		String value = stringLiteralExp.getStringSymbol();
		return value != null ? getStringValue(value) : null;
	}

	/**
	 * Callback for a TupleLiteralExp visit.
	 * 
	 * @param tl
	 *            tuple literal expression
	 * @return String
	 */
	@Override
    public Object visitTupleLiteralExp(TupleLiteralExp tl) {
		Type type = tl.getType();
		List<TupleLiteralPart> tp = tl.getParts();
		
		Map<Property, Object> propertyValues = new HashMap<Property, Object>();
		
		for (TupleLiteralPart part : tp) {
			// Set the tuple field with the value of the init expression
			propertyValues.put(part.getAttribute(), part.accept(getUndecoratedVisitor()));
		}

		return getEvaluationEnvironment().createTuple(type, propertyValues);

	}
	
	@Override
    public Object visitTupleLiteralPart(TupleLiteralPart tp) {
		return tp.getAttribute().accept(getUndecoratedVisitor());
	}

	/**
	 * Callback for a TypeExp visiy.
	 */
	@Override
    public Object visitTypeExp(TypeExp t) {
		return t.getReferredType();
	}
    
    /**
     * Callback for an UnlimitedNaturalLiteralExp visit.
     * 
     * @return the value of the natural literal as a java.lang.Integer.
     */
    @Override
    public Object visitUnlimitedNaturalLiteralExp(UnlimitedNaturalLiteralExp unlimitedNaturalLiteralExp) {
		BigInteger value = unlimitedNaturalLiteralExp.getSymbol();
		return value != null ? getUnlimitedNaturalValue(value) : null;
	}
	
	/**
	 * Callback for an UnspecifiedValueExp visit.
	 */
	@Override
    public Object visitUnspecifiedValueExp(UnspecifiedValueExp uv) {
		// TODO: return a "random instance of the type of the expression"
		throw new UnsupportedOperationException("evaluation of UnspecifiedValueExp"); //$NON-NLS-1$
	}

	/**
	 * Callback for a Variable visit.
	 */
	@Override
    public Object visitVariable(Variable variable) {
		// add the variable to the environment, initialized to
		// its initial expression (if it has one). return the name
		// of the variable.
//		String varName = variable.getName();
		OclExpression initExp = variable.getInitExpression();
		if (initExp == null) {
			return createInvalidValue(variable, null, "Uninitialized variable", null);
		}
		Object initVal = initExp.accept(getUndecoratedVisitor());
// FIXME		getEvaluationEnvironment().setVariable(variable, initVal);
		return initVal;
	}

	/**
	 * Callback for a VariableExp visit.
	 * 
	 * @param v
	 *            the variable expression
	 * @return the value of the variable
	 */
	@Override
    public Object visitVariableExp(VariableExp variableExp) {
//		getValueOfVariable(getReferredVariable())
		// get the referred variable name
		VariableDeclaration variableDeclaration = variableExp.getReferredVariable();
		VariableDeclaration variable = getEvaluationEnvironment().getVariable(variableDeclaration);
//		String varName = vd.getName();

		// evaluate the variable in the current environment
//		Object variableValue = getEvaluationEnvironment().getValueOf(varName);
//		return variableValue;
		if (variable == null) {
			return createInvalidValue(variable, variableExp, "Undefined variable", null);
		}
		return variable.accept(getUndecoratedVisitor());
	}


} //EvaluationVisitorImpl
