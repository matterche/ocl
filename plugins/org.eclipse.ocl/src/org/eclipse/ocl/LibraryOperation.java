package org.eclipse.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.expressions.OperationCallExp;


public interface LibraryOperation {

	boolean canEvaluate(OperationCallExp operationCall);

	EObject evaluate(EvaluationVisitor evaluationVisitor, OperationCallExp operationCall);
}
