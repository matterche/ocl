package org.eclipse.ocl;

import org.eclipse.ocl.expressions.OperationCallExp;


/**
 * @since 3.0
 */
public interface LibraryOperation
{
	/**
	 * Return true if this LibraryOperation can evaluate operationCall..
	 * 
	 * @param oc
	 * @return true if operationCall can be evaluated 
	 */
	boolean canEvaluate(OperationCallExp<?, ?> operationCall);

	/**
	 * Return the result of evaluating an operationCall for a visitor.
	 * 
	 * @param environment
	 * @param evaluationEnvironment
	 * @param oc
	 * @return the result 
	 */
	<C, O> Object evaluate(EvaluationVisitor<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<C, O> operationCall);

	Object getOperationCode();
}
