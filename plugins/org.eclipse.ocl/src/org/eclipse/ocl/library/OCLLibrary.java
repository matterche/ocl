package org.eclipse.ocl.library;

import java.util.LinkedHashMap;

import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.PropertyCallExp;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.utilities.ExpressionInOCL;

/**
 * @since 3.0
 */
public interface OCLLibrary extends OCLStandardLibrary<OCLType> {

	OCLOperation defineOperation(OCLType ownerType, String name, OCLType returnType, LinkedHashMap<String, OCLType> params, String stereotype, ExpressionInOCL<?, ?> specification);

	OCLProperty defineProperty(OCLType ownerType, String name, OCLType valueType, String stereotype, ExpressionInOCL<?, ?> specification);

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
	
	OCLOperation getOperation(OCLType sourceType, OperationCallExp<?,?> operationCall);
	
	OCLProperty getProperty(OCLType sourceType, PropertyCallExp<?,?> propertyCall);
	
	OCLType getOCLTypeOfType(Object object);
	
	OCLType getOCLTypeOfValue(Object object);
}