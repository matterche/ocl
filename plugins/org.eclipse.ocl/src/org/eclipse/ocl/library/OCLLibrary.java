package org.eclipse.ocl.library;

import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.types.OCLStandardLibrary;

/**
 * @since 3.0
 */
public interface OCLLibrary extends OCLStandardLibrary<OCLType> {

	OCLType getBoolean();

	OCLType getInteger();

	OCLType getUnlimitedNatural();

	OCLType getOclInvalid();

	OCLType getReal();

	OCLType getString();

	OCLType getOclAny();

	OCLType getOclElement();

	OCLExpression<OCLType> getInvalid();

	OCLExpression<OCLType> getNull();

	OCLType getState();

	OCLType getOclMessage();

	OCLType getOclType();

	OCLType getOclVoid();

	OCLType getT();

	OCLType getT2();

	OCLType getSet();

	OCLType getOrderedSet();

	OCLType getBag();

	OCLType getSequence();

	OCLType getCollection();

	OCLType getOclExpression();
	
	OCLOperation getOperation(OperationCallExp<?,?> operationCall);
	
	OCLType getOCLTypeOfType(Object object);
	
	OCLType getOCLTypeOfValue(Object object);
}