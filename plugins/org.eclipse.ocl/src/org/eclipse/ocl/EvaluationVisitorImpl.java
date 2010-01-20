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
 * $Id: EvaluationVisitorImpl.java,v 1.3.6.10 2010/01/20 06:09:34 ewillink Exp $
 */

package org.eclipse.ocl;

import java.math.BigInteger;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.expressions.AssociationClassCallExp;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.CollectionItem;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.expressions.CollectionLiteralExp;
import org.eclipse.ocl.expressions.CollectionLiteralPart;
import org.eclipse.ocl.expressions.CollectionRange;
import org.eclipse.ocl.expressions.EnumLiteralExp;
import org.eclipse.ocl.expressions.IfExp;
import org.eclipse.ocl.expressions.IntegerLiteralExp;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.IterateExp;
import org.eclipse.ocl.expressions.IteratorExp;
import org.eclipse.ocl.expressions.LetExp;
import org.eclipse.ocl.expressions.MessageExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.expressions.RealLiteralExp;
import org.eclipse.ocl.expressions.StateExp;
import org.eclipse.ocl.expressions.StringLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralExp;
import org.eclipse.ocl.expressions.TupleLiteralPart;
import org.eclipse.ocl.expressions.TypeExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.expressions.UnspecifiedValueExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.expressions.VariableExp;
import org.eclipse.ocl.internal.OCLPlugin;
import org.eclipse.ocl.internal.OCLStatusCodes;
import org.eclipse.ocl.internal.evaluation.IterationTemplate;
import org.eclipse.ocl.internal.evaluation.IterationTemplateAny;
import org.eclipse.ocl.internal.evaluation.IterationTemplateClosure;
import org.eclipse.ocl.internal.evaluation.IterationTemplateCollect;
import org.eclipse.ocl.internal.evaluation.IterationTemplateCollectNested;
import org.eclipse.ocl.internal.evaluation.IterationTemplateExists;
import org.eclipse.ocl.internal.evaluation.IterationTemplateForAll;
import org.eclipse.ocl.internal.evaluation.IterationTemplateIsUnique;
import org.eclipse.ocl.internal.evaluation.IterationTemplateOne;
import org.eclipse.ocl.internal.evaluation.IterationTemplateReject;
import org.eclipse.ocl.internal.evaluation.IterationTemplateSelect;
import org.eclipse.ocl.internal.evaluation.IterationTemplateSortedBy;
import org.eclipse.ocl.internal.l10n.OCLMessages;
import org.eclipse.ocl.library.OCLOperation;
import org.eclipse.ocl.library.OCLType;
import org.eclipse.ocl.library.operations.AbstractOperation;
import org.eclipse.ocl.types.BagType;
import org.eclipse.ocl.types.CollectionType;
import org.eclipse.ocl.types.OrderedSetType;
import org.eclipse.ocl.types.SequenceType;
import org.eclipse.ocl.types.SetType;
import org.eclipse.ocl.util.CollectionUtil;
import org.eclipse.ocl.util.OCLStandardLibraryUtil;
import org.eclipse.ocl.util.OCLUtil;
import org.eclipse.ocl.utilities.PredefinedType;

/**
 * An evaluation visitor implementation for OCL expressions.
 * 
 * @author Tim Klinger (tklinger)
 * @author Christian W. Damus (cdamus)
 * 
 * @since 1.3
 */
public class EvaluationVisitorImpl<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
	extends AbstractEvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> {

	private static int tempCounter = 0;

	private EvaluationEnvironment.Enumerations<EL> enumerations;
	
	/**
	 * Constructor
	 * 
	 * @param env
	 *            an evaluation environment (map of variable names to values)
	 * @param extentMap
	 *            a map of classes to their instance lists
	 */
	@SuppressWarnings("unchecked")
	public EvaluationVisitorImpl(
			Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> env,
			EvaluationEnvironment<C, O, P, CLS, E> evalEnv,
			Map<? extends CLS, ? extends Set<? extends E>> extentMap) {
		super(env, evalEnv, extentMap);
		
		enumerations = OCLUtil.getAdapter(evalEnv, EvaluationEnvironment.Enumerations.class);
	}

	/**
	 * 
	 * Callback for an OperationCallExp visit.
	 *  
	 */
	@Override
    public Object visitOperationCallExp(OperationCallExp<C, O> oc) {
		try {
			OCLExpression<?> source = oc.getSource();
			Object sourceVal = source.accept(this);
			OCLType sourceType = library.getOCLTypeOfValue(sourceVal);
			OCLOperation oclOperation = library.getOperation(sourceType, oc);
			if (oclOperation != null) {
				Object result = oclOperation.evaluate(this, sourceVal, oc);
				if (result == null) {
					result = library.getInvalid();
				}
				return result;
			}
		}
		catch (Exception e) {
			return library.getInvalid();
		}
		// check if source type is primitive and handle the
		// primitive ops "inline". Otherwise use java reflection
		// to invoke the operation (there is currently no means
		// to do this directly in EMF).

		// Note: Generally the result of an operation invocation on the
		// undefined
		// object or with an undefined argument is undefined except in the
		// following
		// cases prescribed by the spec (p. 2-10, sec. 2.4.11)
		// 1. true || <anything> is true
		// 2. false && <anything> is false
		// 3. false implies <anything> is true
		// 4. if <condition> <something1> else <something2> has the value
		// dictated
		// by the condition regardless of the other value.
		// all irrespective of the order of the arguments.

		EvaluationEnvironment<C, O, P, CLS, E> evaluationEnvironment = getEvaluationEnvironment();
		OCLExpression<C> source = oc.getSource();
		O oper = oc.getReferredOperation();
		int opCode = oc.getOperationCode();
		List<OCLExpression<C>> args = oc.getArgument();
		int numArgs = args.size();

		// evaluate source
		Object sourceVal = source.accept(getVisitor());
		
		OCLExpression<C> body = getOperationBody(oper);
		if ((body != null) || opCode <= 0 /* not a pre-defined operation */
				|| evaluationEnvironment.overrides(oper, opCode)) {
			// delegate evaluation to the evaluation environment
			
			// evaluate args
			Object[] evalArgs = new Object[numArgs];
			int i = 0;
			for (Iterator<OCLExpression<C>> it = args.iterator(); it.hasNext(); i++) {
				OCLExpression<C> arg = it.next();
				evalArgs[i] = arg.accept(getVisitor());
			}
	
			// ask the environment to evaluate
			try {
				Object result;
				
				if (body != null) {
					// if source is undefined, result is OclInvalid
					if (isUndefined(sourceVal)) {
						return library.getInvalid();
					}
					
					result = call(oper, body, sourceVal, evalArgs);
				} else {
				    // handle <, <=, >, and >= operators
				    if (opCode <= 0) {
				        opCode = inferOperationCode(oper, opCode);
				    }
					result = evaluationEnvironment.callOperation(
							oper, opCode, sourceVal, evalArgs);
				}
				
				return result;
	        } catch (EvaluationHaltedException e) {
				// evaluation stopped on demand, propagate father	        
	        	throw e;				
			} catch (UnsupportedOperationException ignore) {
				// let the EvaluationVisitor do its thing
			} catch (Exception e) {
				OCLPlugin
					.catching(getClass(), "visitOperationCallExp", e);//$NON-NLS-1$
				OCLPlugin.log(
					Diagnostic.ERROR,
					OCLStatusCodes.IGNORED_EXCEPTION_WARNING,
					OCLMessages.bind(
						OCLMessages.ErrorMessage_ERROR_,
						"visitOperationCallExp", //$NON-NLS-1$
						e.getLocalizedMessage()),
					e);
			}
		}

		return library.getInvalid();
	}
	
	/**
	 * Infers a standard operation code from the name of a user-defined
	 * operation.  This applies for cases where a standard operation is not
	 * defined by the OCL Standard Library, but is implemented nonetheless by
	 * the interpreter.
	 * 
	 * @param operation the operation
     * @param opcode the original operation code from the AST
	 * @return the appropriate operation code, or the original <tt>opcode</tt>
     *     if there is no matching standard operation
	 */
	private int inferOperationCode(O operation, int opcode) {
	    int result = opcode;
	    String opName = getName(operation);
	    
        if (PredefinedType.LESS_THAN_NAME.equals(opName)) {
            result = PredefinedType.LESS_THAN;
        } else if (PredefinedType.GREATER_THAN_NAME.equals(opName)) {
            result = PredefinedType.GREATER_THAN;
        } else if (PredefinedType.LESS_THAN_EQUAL_NAME.equals(opName)) {
            result = PredefinedType.LESS_THAN_EQUAL;
        } else if (PredefinedType.GREATER_THAN_EQUAL_NAME.equals(opName)) {
            result = PredefinedType.GREATER_THAN_EQUAL;
        }
        
        return result;
    }

	/**
	 * Callback for an IterateExp visit.
	 */
	@Override
    public Object visitIterateExp(IterateExp<C, PM> ie) {
		// get the variable declaration for the result
		Variable<C, PM> vd = ie.getResult();
		String resultName = (String) vd.accept(getVisitor());

		try {
			// get the list of ocl iterators
			List<Variable<C, PM>> iterators = ie.getIterator();
	
			// evaluate the source collection
			Object sourceValue = ie.getSource().accept(getVisitor());
	
			// value of iteration expression is undefined if the source is
			//   null or OclInvalid
			if (isUndefined(sourceValue)) {
				return library.getInvalid();
			}
			
			Collection<?> coll = (Collection<?>) sourceValue;
			
			// get the body expression
			OCLExpression<C> body = ie.getBody();
	
			// construct an iteration template to evaluate the iterator
			IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
				IterationTemplate.getInstance(getVisitor());
	
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result variable from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	/**
	 * Callback for an IteratorExp visit.
	 */
	@Override
    public Object visitIteratorExp(IteratorExp<C, PM> ie) {
		C sourceType = ie.getSource().getType();
		
		if (sourceType instanceof PredefinedType<?>) {
			Object sourceValue = ie.getSource().accept(getVisitor());
			
			// value of iteration expression is undefined if the source is
			//   null or OclInvalid
			if (isUndefined(sourceValue)) {
				return library.getInvalid();
			}
			
			Collection<?> sourceCollection = (Collection<?>) sourceValue;
			
			switch (OCLStandardLibraryUtil.getOperationCode(ie.getName())) {
			case PredefinedType.EXISTS:
				return evaluateExistsIterator(ie, sourceCollection);
			case PredefinedType.FOR_ALL:
				return evaluateForAllIterator(ie, sourceCollection);
			case PredefinedType.SELECT:
				return evaluateSelectIterator(ie, sourceCollection);
			case PredefinedType.REJECT:
				return evaluateRejectIterator(ie, sourceCollection);
			case PredefinedType.COLLECT:
				return evaluateCollectIterator(ie, sourceCollection);
			case PredefinedType.COLLECT_NESTED:
				return evaluateCollectNestedIterator(ie, sourceCollection);
			case PredefinedType.ONE:
				return evaluateOneIterator(ie, sourceCollection);
			case PredefinedType.ANY:
				return evaluateAnyIterator(ie, sourceCollection);
			case PredefinedType.SORTED_BY:
				return evaluateSortedByIterator(ie, sourceCollection);
			case PredefinedType.IS_UNIQUE:
				return evaluateIsUnique(ie, sourceCollection);
			case PredefinedType.CLOSURE:
				return evaluateClosure(ie, sourceCollection);
			}
		}
		
		String message = OCLMessages.bind(
				OCLMessages.IteratorNotImpl_ERROR_, ie.getName());
		UnsupportedOperationException ex = new UnsupportedOperationException(
			message);
		OCLPlugin.throwing(getClass(), "visitIteratorExp", ex);//$NON-NLS-1$
		throw ex;
	}

	private static synchronized String generateName() {
		return "__result__" + tempCounter++;//$NON-NLS-1$
	}

	private Object evaluateExistsIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateExists.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, Boolean.FALSE);

		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove the result variable from the environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateForAllIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		//		int numIters = iterators.size();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateForAll.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, Boolean.TRUE);

		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from the environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateCollectNestedIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		//		int numIters = iterators.size();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get initial result value based on the source type
		@SuppressWarnings("unchecked")
		CollectionType<C, O> collType = (CollectionType<C, O>) ie.getSource().getType();
		
		Object initResultVal = null;
		if (collType instanceof SetType<?, ?> || collType instanceof BagType<?, ?>) {
            // collection on a Bag or a Set yields a Bag
			initResultVal = CollectionUtil.createNewBag();
        } else {
            // Sequence or Ordered Set yields a Sequence
			initResultVal = CollectionUtil.createNewSequence();
        }
		
		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateCollectNested.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, initResultVal);

		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {		
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateCollectIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		//		int numIters = iterators.size();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get initial result value based on the source type
		@SuppressWarnings("unchecked")
		CollectionType<C, O> collType = (CollectionType<C, O>) ie.getSource().getType();
		
		Object initResultVal = null;
		if (collType instanceof SetType<?, ?> || collType instanceof BagType<?, ?>) {
            // collection on a Bag or a Set yields a Bag
			initResultVal = CollectionUtil.createNewBag();
        } else {
            // Sequence or Ordered Set yields a Sequence
			initResultVal = CollectionUtil.createNewSequence();
        }

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateCollect.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, initResultVal);

		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateSelectIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		//		int numIters = iterators.size();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get initial result value based on the source type
		@SuppressWarnings("unchecked")
		CollectionType<C, O> collType = (CollectionType<C, O>) ie.getSource().getType();
		
		Object initResultVal = null;
		if (collType instanceof SetType<?, ?>) {
            // Set
			initResultVal = CollectionUtil.createNewSet();
        } else if (collType instanceof BagType<?, ?>) {
            // Bag
			initResultVal = CollectionUtil.createNewBag();
        } else if (collType instanceof SequenceType<?, ?>) {
            // Sequence
			initResultVal = CollectionUtil.createNewSequence();
        } else {
            // OrderedSet
			initResultVal = CollectionUtil.createNewOrderedSet();
        }

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateSelect.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, initResultVal);
		
		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateRejectIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		//		int numIters = iterators.size();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get initial result value based on the source type
		@SuppressWarnings("unchecked")
		CollectionType<C, O> collType = (CollectionType<C, O>) ie.getSource().getType();
		
		Object initResultVal = null;
		if (collType instanceof SetType<?, ?>) {
            // Set
			initResultVal = CollectionUtil.createNewSet();
        } else if (collType instanceof BagType<?, ?>) {
            // Bag
			initResultVal = CollectionUtil.createNewBag();
        } else if (collType instanceof SequenceType<?, ?>) {
            // Sequence
			initResultVal = CollectionUtil.createNewSequence();
        } else {
            // OrderedSet
			initResultVal = CollectionUtil.createNewOrderedSet();
        }

		//	get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateReject.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, initResultVal);

		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateOneIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		//		int numIters = iterators.size();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateOne.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, Boolean.FALSE);

		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateAnyIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateAny.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, null);

		try {
			// evaluate
			return is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	private Object evaluateSortedByIterator(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		//		int numIters = iterators.size();

		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateSortedBy.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		
		final Map<Object, Comparable<Object>> map =
			new HashMap<Object, Comparable<Object>>();
		getEvaluationEnvironment().add(resultName, map);
		try {
			// evaluate
			// TODO: find an efficient way to do this.
			Object evaluationResult = is.evaluate(coll, iterators, body, resultName);
			
			if (evaluationResult == library.getInvalid()) {
				// handle the OclInvalid result
				return evaluationResult;
			}
			
			is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
		// sort the source collection based on the natural ordering of the
		// body expression evaluations
		List<Object> result = new ArrayList<Object>(coll);

		Collections.sort(result, new Comparator<Object>() {

			public int compare(Object o1, Object o2) {
				Comparable<Object> b1 = map.get(o1);
				Comparable<Object> b2 = map.get(o2);
				return (b1.compareTo(b2));
			}
		});

		// create result
		// type is Sequence if source is a sequence or a Bag,
		// SortedSet if source is a SortedSet or a Set
		C collType = ie.getSource().getType();
		if (collType instanceof SetType<?, ?> || collType instanceof OrderedSetType<?, ?>) {
            return CollectionUtil.createNewOrderedSet(result);
        } else {
            return CollectionUtil.createNewSequence(result);
        }
	}

	private Object evaluateIsUnique(IteratorExp<C, PM> ie, Collection<?> coll) {
		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();
		
		// get the body expression
		OCLExpression<C> body = ie.getBody();

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> is =
			IterationTemplateIsUnique.getInstance(getVisitor());

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, new HashSet<Object>());

		try {
			// evaluate
			is.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
		
		return is.isDone() ? Boolean.FALSE : Boolean.TRUE;
	}

	private Object evaluateClosure(IteratorExp<C, PM> ie, Collection<?> coll) {

		// get the list of ocl iterators
		List<Variable<C, PM>> iterators = ie.getIterator();

		// get the body expression
		OCLExpression<C> body = ie.getBody();
		C type = ie.getType();
		// create initial result value
		Object initResultVal = type instanceof OrderedSetType<?,?> ? CollectionUtil.createNewOrderedSet() : CollectionUtil.createNewSet();

		// get an iteration template to evaluate the iterator
		IterationTemplate<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> template =
			IterationTemplateClosure.getInstance(getVisitor(), body);

		// generate a name for the result variable and add it to the environment
		String resultName = generateName();
		getEvaluationEnvironment().add(resultName, initResultVal);

		try {
			// evaluate
			return template.evaluate(coll, iterators, body, resultName);
		} finally {
			// remove result name from environment
			getEvaluationEnvironment().remove(resultName);
		}
	}

	/**
	 * Callback for an EnumLiteralExp visit. Get the referred enum literal and
	 * return it as an Integer.
	 * 
	 * @param el
	 *            the enumeration literal expresion
	 * @return the enumeration literal as an Integer
	 */
	@Override
    public Object visitEnumLiteralExp(EnumLiteralExp<C, EL> el) {
		return (enumerations == null) ? el.getReferredEnumLiteral()
			: enumerations.getValue(el.getReferredEnumLiteral());
	}

	/**
	 * Callback for a VariableExp visit.
	 * 
	 * @param v
	 *            the variable expression
	 * @return the value of the variable
	 */
	@Override
    public Object visitVariableExp(VariableExp<C, PM> v) {

		// get the referred variable name
		Variable<C, PM> vd = v.getReferredVariable();
		String varName = vd.getName();

		// evaluate the variable in the current environment
		return getEvaluationEnvironment().getValueOf(varName);
	}

	/**
	 * Callback for a PropertyCallExp visit. Evaluates the source of the
	 * expression and then reflectively gets the value of the property on the
	 * result. For example, in "self.foo", "self" is the source and would be
	 * evaluated first, then the value of the property "foo" would be accessed
	 * on that object.
	 */
	@Override
    public Object visitPropertyCallExp(PropertyCallExp<C, P> pc) {
		P property = pc.getReferredProperty();
		OCLExpression<C> source = pc.getSource();

		// evaluate source
		Object context = source.accept(getVisitor());

		// if source is undefined, result is OclInvalid
		if (isUndefined(context)) {
            return library.getInvalid();
        }

		OCLExpression<C> derivation = getPropertyBody(property);
		if (derivation != null) {
			// this is an additional property
			
			return navigate(property, derivation, context);
		}
		
		List<Object> qualifiers;
		
		if (pc.getQualifier().isEmpty()) {
			qualifiers = Collections.emptyList();
		} else {
			// handle qualified association navigation
			qualifiers = new java.util.ArrayList<Object>();
			
			for (OCLExpression<C> q : pc.getQualifier()) {
				qualifiers.add(q.accept(getVisitor()));
			}
		}
		
		Object result = getEvaluationEnvironment().navigateProperty(property, qualifiers, context);
		
		if ((pc.getType() instanceof CollectionType<?, ?>) && !(result instanceof Collection<?>)) {
			// this was an XSD "unspecified multiplicity".  Now that we know what
			//    the multiplicity is, we can coerce it to a collection value
			@SuppressWarnings("unchecked")
			CollectionKind kind = ((CollectionType<C, O>) pc.getType()).getKind();
			
			Collection<Object> collection = CollectionUtil.createNewCollection(kind);
			
			collection.add(result);
			result = collection;
		}
		
		return result;
	}

	/**
	 * Callback for an AssociationClassCallExp visit. Evaluates the source of the
	 * expression and then reflectively gets the value of the reference on the
	 * result. For example, in "self.foo", "self" is the source and would be
	 * evaluated first, then the value of the reference "foo" would be derived
	 * on that object.
	 */
	@Override
    public Object visitAssociationClassCallExp(AssociationClassCallExp<C, P> ae) {
		Object context = ae.getSource().accept(getVisitor());
		
		if (isUndefined(context)) {
			return library.getInvalid();
		}
		
		// evaluate attribute on source value
		return getEvaluationEnvironment().navigateAssociationClass(
			ae.getReferredAssociationClass(),
			ae.getNavigationSource(),
			context);
	}

	/**
	 * Callback for a VariableDeclaration visit.
	 */
	@Override
    public Object visitVariable(Variable<C, PM> vd) {
		// add the variable to the environment, initialized to
		// its initial expression (if it has one). return the name
		// of the variable.
		String varName = vd.getName();
		OCLExpression<C> initExp = vd.getInitExpression();
		Object initVal = null;
		if (initExp != null) {
            initVal = initExp.accept(getVisitor());
        }
		getEvaluationEnvironment().add(varName, initVal);
		return varName;
	}

	/**
	 * Callback for an IfExp visit.
	 */
	@Override
    public Object visitIfExp(IfExp<C> ie) {
		// get condition
		OCLExpression<C> condition = ie.getCondition();

		// evaluate condition
		Boolean condVal = (Boolean) condition.accept(getVisitor());
		if (condVal == null) {
            return null;
        }

		if (condVal.booleanValue()) {
            return ie.getThenExpression().accept(getVisitor());
        }
		return ie.getElseExpression().accept(getVisitor());
	}

	/**
	 * Callback for a TypeExp visiy.
	 */
	@Override
    public Object visitTypeExp(TypeExp<C> t) {
		return t.getReferredType();
	}
	
	@Override
    public Object visitStateExp(StateExp<C, S> s) {
		return s.getReferredState();
	}
	
	@Override
    public Object visitMessageExp(MessageExp<C, COA, SSA> m) {
		throw new UnsupportedOperationException("evaluation of MessageExp"); //$NON-NLS-1$
	}
	
	/**
	 * Callback for an UnspecifiedValueExp visit.
	 */
	@Override
    public Object visitUnspecifiedValueExp(UnspecifiedValueExp<C> uv) {
		// TODO: return a "random instance of the type of the expression"
		throw new UnsupportedOperationException("evaluation of UnspecifiedValueExp"); //$NON-NLS-1$
	}

	/**
	 * Callback for an IntegerLiteralExp visit.
	 * 
	 * @return the value of the integer literal as a java.lang.Integer.
	 */
	@Override
    public Object visitIntegerLiteralExp(IntegerLiteralExp<C> il) {
		return il.getIntegerSymbol();
	}
    
    /**
     * Callback for an UnlimitedNaturalLiteralExp visit.
     * 
     * @return the value of the natural literal as a java.lang.Integer.
     */
    @Override
    public Object visitUnlimitedNaturalLiteralExp(
            UnlimitedNaturalLiteralExp<C> literalExp) {
        return literalExp.isUnlimited() ? literalExp : literalExp.getUnlimitedNaturalSymbol();
    }

	/**
	 * Callback for a RealLiteralExp visit.
	 * 
	 * @return the value of the real literal as a java.lang.Double.
	 */
	@Override
    public Object visitRealLiteralExp(RealLiteralExp<C> rl) {
		return rl.getRealSymbol();
	}

	/**
	 * Callback for a StringLiteralExp visit.
	 * 
	 * @return the value of the string literal as a java.lang.String.
	 */
	@Override
    public Object visitStringLiteralExp(StringLiteralExp<C> sl) {
		return sl.getStringSymbol();
	}

	/**
	 * Callback for a BooleanLiteralExp visit.
	 * 
	 * @return the value of the boolean literal as a java.lang.Boolean.
	 */
	@Override
    public Object visitBooleanLiteralExp(BooleanLiteralExp<C> bl) {
		return bl.getBooleanSymbol();
	}

	@Override
    public Object visitInvalidLiteralExp(InvalidLiteralExp<C> il) {
		// just make up some object to take the place of the OclInvalid literal
		return library.getInvalid();
	}

	@Override
    public Object visitNullLiteralExp(NullLiteralExp<C> il) {
		// the single OclVoid instance is equivalent to Java null
		return library.getNull();
	}

	/**
	 * Callback for LetExp visit.
	 */
	@Override
    public Object visitLetExp(LetExp<C, PM> l) {
		// get variable decl for let variable
		Variable<C, PM> vd = l.getVariable();
		String name = (String) vd.accept(getVisitor());
		
		try {
			// evaluate the "in" part of the let
			OCLExpression<C> inExp = l.getIn();
			// return the value of the "in"			
			return inExp.accept(getVisitor());
			
		} finally {
			// remove the variable-init expression binding from the environment
			getEvaluationEnvironment().remove(name);
		}
	}

	/**
	 * Callback for a CollectionLiteralExp visit.
	 */
	@Override
    public Object visitCollectionLiteralExp(CollectionLiteralExp<C> cl) {
		// construct the appropriate collection from the parts
		// based on the collection kind.
		CollectionKind kind = cl.getKind();
		List<CollectionLiteralPart<C>> parts = cl.getPart();
		Collection<Object> result = CollectionUtil.createNewCollection(kind);

		if ((kind == CollectionKind.SEQUENCE_LITERAL) && cl.isSimpleRange()) {
			// literal is of the form: Sequence{first..last}.
			// construct a list with a lazy iterator for it.
			CollectionRange<C> collRange = (CollectionRange<C>) parts.get(0);
			OCLExpression<C> first = collRange.getFirst();
			OCLExpression<C> last = collRange.getLast();

			// evaluate first value
			Number firstVal = (BigInteger) first.accept(getVisitor());
			if (firstVal == null) {
				CollectionUtil.add(result, null);
				return result;
			}
			// evaluate last value
			Number lastVal = (BigInteger) last.accept(getVisitor());
			if (lastVal == null) {
				CollectionUtil.add(result, null);
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
			for (CollectionLiteralPart<C> part : parts) {
				if (part instanceof CollectionItem<?>) {
					// CollectionItem part
					CollectionItem<C> item = (CollectionItem<C>) part;
					OCLExpression<C> itemExp = item.getItem();
					Object itemVal = itemExp.accept(getVisitor());
					if (AbstractOperation.isInvalid(itemVal)) {
						return library.getInvalid();
					}
					CollectionUtil.add(result, itemVal);
				} else {
					// Collection range
					CollectionRange<C> range = (CollectionRange<C>) part;
					OCLExpression<C> first = range.getFirst();
					OCLExpression<C> last = range.getLast();

					// evaluate first value
					BigInteger firstVal = (BigInteger) first.accept(getVisitor());
					BigInteger lastVal = (BigInteger) last.accept(getVisitor());
					if (!((firstVal == null) || (lastVal == null))) {
						// TODO: enhance IntegerRangeList to support multiple ranges
						// add values between first and last inclusive
						int firstInt = firstVal.intValue();
						int lastInt = lastVal.intValue();
						for (int i = firstInt; i <= lastInt; i++) {
							CollectionUtil.add(result, BigInteger.valueOf(i));
                        }
					}
				} // end of collection range

			} // end of parts iterator

		} // end of not-simple range case

		return result;
	} // end of Set, OrderedSet, Bag Literals

	// private static inner class for lazy lists over an integer range
	private static final class IntegerRangeList
		extends AbstractList<BigInteger> {

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
        public BigInteger get(int index) {
			if (index < 0 || index >= size()) {
				String message = OCLMessages.bind(
						OCLMessages.IndexOutOfRange_ERROR_,
						new Object[] {
								Integer.toString(index),
								Integer.toString(first),
								Integer.toString(last)});
				IllegalArgumentException error = new IllegalArgumentException(
					message);
				OCLPlugin.throwing(getClass(), "get", error);//$NON-NLS-1$
				throw error;
			}
			return BigInteger.valueOf(first + index);
		}

		@Override
        public Iterator<BigInteger> iterator() {
			// local iterator class that provides
			// hasNext() and next() methods appropriate
			// for this range set
			class IntegerRangeIterator
				implements Iterator<BigInteger> {

				public IntegerRangeIterator() {
					curr = first;
					initialized = false;
				}

				public BigInteger next() {
					if (!initialized) {
						curr = first - 1;
						initialized = true;
					}
					if (hasNext()) {
                        return BigInteger.valueOf(++curr);
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

	/**
	 * Callback for a TupleLiteralExp visit.
	 * 
	 * @param tl
	 *            tuple literal expression
	 * @return String
	 */
	@Override
    public Object visitTupleLiteralExp(TupleLiteralExp<C, P> tl) {
		C type = tl.getType();
		List<TupleLiteralPart<C, P>> tp = tl.getPart();
		
		Map<P, Object> propertyValues = new HashMap<P, Object>();
		
		for (TupleLiteralPart<C, P> part : tp) {
			// Set the tuple field with the value of the init expression
			propertyValues.put(part.getAttribute(), part.accept(getVisitor()));
		}

		return getEvaluationEnvironment().createTuple(type, propertyValues);

	}
	
	@Override
    public Object visitTupleLiteralPart(TupleLiteralPart<C, P> tp) {
		return tp.getValue().accept(getVisitor());
	}
} //EvaluationVisitorImpl
