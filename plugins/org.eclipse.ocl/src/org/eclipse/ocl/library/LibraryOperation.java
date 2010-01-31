/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryOperation.java,v 1.1.2.5 2010/01/31 22:23:43 ewillink Exp $
 */
package org.eclipse.ocl.library;

import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.OperationCallExp;

/**
 * @since 3.0
 */
public interface LibraryOperation extends LibraryFeature {
	/**
	 * Return the result of evaluating operationCall upon sourceVal within the environment
	 * provided by EvaluationVisitor. An invalid return may be indicated by throwing an exception
	 * returning Java null or OCL invalid.
	 *
	 * @param <PK>
	 * @param <C>
	 * @param <O>
	 * @param <P>
	 * @param <EL>
	 * @param <PM>
	 * @param <S>
	 * @param <COA>
	 * @param <SSA>
	 * @param <CT>
	 * @param <CLS>
	 * @param <E>
	 * @param evaluationVisitor the evaluation context
	 * @param sourceVal the source operand for the operation
	 * @param operationCall the operation and additional arguments
	 * @return the evaluated value
	 */
	<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> Object evaluate(EvaluationVisitor<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E> evaluationVisitor, Object sourceVal, OperationCallExp<C, O> operationCall);

}
