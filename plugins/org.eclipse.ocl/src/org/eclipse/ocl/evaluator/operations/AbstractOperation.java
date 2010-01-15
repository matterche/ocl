/**
 * <copyright>
 *
 * Copyright (c) 2009 Eclipse Modeling Project and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: AbstractOperation.java,v 1.1.2.5 2010/01/15 17:27:37 ewillink Exp $
 */
package org.eclipse.ocl.evaluator.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.expressions.InvalidLiteralExp;
import org.eclipse.ocl.expressions.NullLiteralExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.UnlimitedNaturalLiteralExp;
import org.eclipse.ocl.library.impl.LibraryOperationImpl;
import org.eclipse.ocl.types.OCLStandardLibrary;


/**
 * @since 3.0
 */
public abstract class AbstractOperation extends LibraryOperationImpl
{
	public static BigDecimal bigDecimalValueOf(Object val) {
		if (val instanceof BigDecimal) {
			return (BigDecimal) val;
		}
		else if (val instanceof BigInteger) {
			return new BigDecimal((BigInteger)val);
		}
		else if (val instanceof Number) {
			return BigDecimal.valueOf(((Number)val).doubleValue());
		}
		else {
			return null;
		}
	}

	public static BigInteger bigIntegerValueOf(Object val) {
		if (val instanceof UnlimitedNaturalLiteralExp<?>) {
			val = ((UnlimitedNaturalLiteralExp<?>)val).getUnlimitedNaturalSymbol();
		}
		if (val instanceof BigInteger) {
			return (BigInteger) val;
		}
		else if (val instanceof Number) {
			return BigInteger.valueOf(((Number)val).longValue());
		}
		else {
			return null;
		}
	}

/*	public static Double doubleValueOf(Object val) {
		if (val instanceof Double) {
			return (Double)val;
		}
		else if (val instanceof Number) {
			return Double.valueOf(((Number)val).doubleValue());
		}
		else {
			return null;
		}
	} */

/*	public static Integer integerValueOf(Object val) {
		if (val instanceof UnlimitedNaturalLiteralExp<?>) {
			val = ((UnlimitedNaturalLiteralExp<?>)val).getUnlimitedNaturalSymbol();
		}
		if (val instanceof Integer) {
			return (Integer)val;
		}
		else if (val instanceof Number) {
			return Integer.valueOf(((Number)val).intValue());
		}
		else {
			return null;
		}
	} */

/*	public static Long longValueOf(Object val) {
		if (val instanceof UnlimitedNaturalLiteralExp<?>) {
			val = ((UnlimitedNaturalLiteralExp<?>)val).getUnlimitedNaturalSymbol();
		}
		if (val instanceof Long) {
			return (Long)val;
		}
		else if (val instanceof Number) {
			return Long.valueOf(((Number)val).longValue());
		}
		else {
			return null;
		}
	} */

	protected <C> Object evaluateArgument(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<C, ?> operationCall, int argumentNumber) {
		try {
			List<OCLExpression<C>> args = operationCall.getArgument();
			if ((args != null) && (0 <= argumentNumber) && (argumentNumber < args.size())) {
				OCLExpression<?> arg = args.get(argumentNumber);
				Object argVal = arg.accept(visitor);
				return argVal;
			}
		}
		catch (Exception e) {
		}
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		OCLStandardLibrary<?> oclStandardLibrary = environment.getOCLStandardLibrary();
		return oclStandardLibrary.getInvalid();
	}

	protected Object evaluateSource(EvaluationVisitor<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> visitor, OperationCallExp<?, ?> operationCall) {
		try {
			OCLExpression<?> source = operationCall.getSource();
			Object sourceVal = source.accept(visitor);
			return sourceVal;
		}
		catch (Exception e) {
		}
		Environment<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
		OCLStandardLibrary<?> oclStandardLibrary = environment.getOCLStandardLibrary();
		return oclStandardLibrary.getInvalid();
	}

	protected int getNumArguments(OperationCallExp<?, ?> operationCall) {
		List<?> args = operationCall.getArgument();
		return args.size();
	}

	protected boolean isBoolean(Object value) {
		return value instanceof Boolean;
	}

	protected boolean isInteger(Object value) {
		return value instanceof BigInteger;
	}

	/**
	 * Convenience method to determine whether the specified value is the <tt>null</tt>
     * or <tt>invalid</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	protected boolean isUndefined(Object value) {
		return (value == null) || 		// FIXME Deprecated
		(value instanceof NullLiteralExp<?>) || 
		(value instanceof InvalidLiteralExp<?>);
	}
	
	/**
	 * Convenience method to determine whether the specified value is the <tt>invalid</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	protected boolean isInvalid(Object value) {
		return (value == null) || 		// FIXME Deprecated
			(value instanceof InvalidLiteralExp<?>);
	}
	
	/**
	 * Convenience method to determine whether the specified value is the <tt>null</tt> value.
	 * 
	 * @param value a value
	 * 
	 * @return whether it is undefined
	 */
	protected boolean isNull(Object value) {
		return value instanceof NullLiteralExp<?>;
	}

	protected boolean isString(Object value) {
		return (value instanceof String) || (value instanceof StringBuffer);
	}
	
	protected boolean isUnlimited(Object value) {
		return (value instanceof UnlimitedNaturalLiteralExp<?>) && ((UnlimitedNaturalLiteralExp<?>)value).isUnlimited();
	}

	protected boolean isUnlimited(BigInteger value) {
		return value.signum() < 0;
	}

	protected boolean isUnlimitedNatural(Object value) {
		return isUnlimited(value) || ((value instanceof BigInteger) && (((BigInteger)value).signum() >= 0));
	}
	
//	protected boolean isUnlimited(Integer value) {
//		return Integer.signum(value) < 0;
//	}

//	protected boolean isUnlimited(Long value) {
//		return Long.signum(value) < 0;
//	}
	
//	public String toString() {
//		Environment<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> environment = visitor.getEnvironment();
//		UMLReflection<?, C, O, ?, ?, ?, ?, ?, ?, ?> reflection = environment.getUMLReflection();
//		return "::" + reflection.getName(operation);
//	}
}
