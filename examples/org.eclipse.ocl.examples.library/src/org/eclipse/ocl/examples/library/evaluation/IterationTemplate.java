/**
 * <copyright>
 *
 * Copyright (c) 2005, 2009 IBM Corporation, Borland Software Corporation, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Radek Dvorak - Bugs 261128, 265066
 *
 * </copyright>
 *
 * $Id: IterationTemplate.java,v 1.1.2.6 2011/01/08 18:22:47 ewillink Exp $
 */

package org.eclipse.ocl.examples.library.evaluation;

import java.util.Iterator;
import java.util.List;

import org.eclipse.ocl.examples.pivot.InvalidLiteralExp;
import org.eclipse.ocl.examples.pivot.NullLiteralExp;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;

public class IterationTemplate {
	
	private EvaluationVisitor evaluationVisitor;
	private EvaluationEnvironment env;
	private boolean done = false;
	
	// singleton
	protected IterationTemplate(EvaluationVisitor evaluationVisitor) {		
		this.evaluationVisitor = evaluationVisitor;
		this.env = evaluationVisitor.getEvaluationEnvironment();
	}
	
	public static IterationTemplate getInstance(EvaluationVisitor evaluationVisitor) {
		return new IterationTemplate(evaluationVisitor);
	}

	public EvaluationVisitor getEvaluationVisitor() {
		return evaluationVisitor;
	}
	
	public EvaluationEnvironment getEvalEnvironment() {
		return env;
	}

	public ValueFactory getValueFactory() {
		return env.getValueFactory();
	}
	
	public final void setDone(boolean done) {
		this.done = done;
	}
	
	public final boolean isDone() {
		return done;
	}
	
	public Value evaluate(CollectionValue coll, List<Variable> iterators,
							OclExpression body, String resultName) {

		// if the collection is empty, then nothing to do
		if (coll.isEmpty().isTrue())
			return env.getValueOf(resultName);
		
		// construct an array of java iterators, one for each
		// ocl iterator in the expression
		int numIters = iterators.size();
		Iterator<?>[] javaIters = new Iterator<?>[numIters];

		try {
			initializeIterators(iterators, javaIters, coll);
			
			while (true) {
				// evaluate the body of the expression in this environment
				Value bodyVal = body.accept(evaluationVisitor);
		
				// If the body result is invalid then the entire expression's value
				// is invalid, because OCL does not permit invalid in a collection
				Value resultVal; 
				if (bodyVal.isInvalid()) {
					setDone(true);
					resultVal = getValueFactory().createInvalidValue("undefined body");
				}
				else {
					// get the new result value
					resultVal = evaluateResult(iterators, resultName, bodyVal);
				}
				
				// set the result variable in the environment with the result value
				env.replace(resultName, resultVal);
				
				// find the next unfinished iterator
				int curr = getNextUnfinishedIterator(javaIters);
				
				if (!moreToGo(curr, numIters)) {
					// all iterators are finished and so are we:
					break;
				}
		
				// more iteration to go:
				// reset all iterators up to the current unfinished one
				// and replace their assignments in the environment
				advanceIterators(iterators, javaIters, coll, curr);
			}
			
			// return the result value
			return env.getValueOf(resultName);
			
		} finally {
			// remove the iterators from the environment			
			removeIterators(iterators);
		}
	}
		
	protected void initializeIterators(
			List<Variable> iterators,
			Iterator<?>[] javaIters,
			CollectionValue c) {
		
		for (int i = 0, n = javaIters.length; i < n; i++) {
			javaIters[i] = c.iterator();
			Variable iterDecl = iterators.get(i);
			String iterName = iterDecl.accept(evaluationVisitor).toString(); // FIXME
			Value value = (Value) javaIters[i].next();
			env.replace(iterName, value);
		}
	}
	
	protected int getNextUnfinishedIterator(Iterator<?>[] javaIters) {
		int curr;
		int numIters = javaIters.length;
		for (curr = 0; curr < numIters; curr++)
			if (javaIters[curr].hasNext())
				break;
		return curr;
	}
	
	protected void advanceIterators(
			List<Variable> iterators,
			Iterator<?>[] javaIters,
			CollectionValue c,
			int curr) {
		
		// assumes all the iterators have been added to the environment
		// already by initializeIterators().
		for (int i = 0, n = curr; i <= n; i++) {
			Variable iterDecl = iterators.get(i);
			String iterName = iterDecl.getName();
			if (i != curr)
				javaIters[i] = c.iterator();
			Value value = (Value) javaIters[i].next();
			env.replace(iterName, value);
		}
	}

	protected void removeIterators(List<Variable> iterators) {
		// remove the iterators from the environment
		for (int i = 0, n = iterators.size(); i < n; i++) {
			 Variable iterDecl = iterators.get(i);
			 String iterName = iterDecl.getName();
			 env.remove(iterName);
		 }
	}
	
	protected boolean moreToGo(int curr, int numIters) {
		if (done)
			return false;
		return curr < numIters;
	}
	
	// override this method for different iterator behaviors
	protected Value evaluateResult(List<Variable> iterators, String resultName, Value bodyVal) {
		return bodyVal;
	}
	
//	@Deprecated // Use getOCLLibrary
//	protected OCLStandardLibrary<C> getOCLStandardLibrary() {
//		return evalVisitor.getEnvironment().getOCLStandardLibrary();
//	}
	
//	protected MergedLibrary getOCLLibrary() {
//		return evalVisitor.getEnvironment().getMergedLibrary();
//	}

//	public InvalidValue createInvalidValue(String reason) {
//		return createInvalidValue(null, null, reason, null);
//	}

//	public InvalidValue createInvalidValue(Object object, OclExpression expression, String reason, Throwable throwable) {
//		return createInvalidValue(object, expression, reason, throwable);
//	}
	
//	protected Object getInvalid() {
//		return evaluationVisitor.getStandardLibrary().getInvalidValue();
//	}

	@Deprecated
	protected boolean isInvalid(Object bodyVal) {
		return bodyVal instanceof InvalidLiteralExp;
	}

	@Deprecated
	protected boolean isNull(Object bodyVal) {
		return bodyVal instanceof NullLiteralExp;
	}

	@Deprecated
	protected boolean isUndefined(Object bodyVal) {
		return isInvalid(bodyVal) || isNull(bodyVal);
	}
}