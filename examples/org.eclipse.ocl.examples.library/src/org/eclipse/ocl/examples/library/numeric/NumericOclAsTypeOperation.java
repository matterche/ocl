/**
 * <copyright>
 *
 * Copyright (c) 2009,2010 E.D.Willink and others.
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
 * $Id: NumericOclAsTypeOperation.java,v 1.1.2.5 2011/01/08 15:34:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.numeric;

import org.eclipse.ocl.examples.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.IntegerValue;
import org.eclipse.ocl.examples.pivot.values.RealValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * NumericOclAsTypeOperation realises the Real::oclIsTypeOf() library operation.
 * 
 * @since 3.1
 */
public class NumericOclAsTypeOperation extends OclAnyOclAsTypeOperation
{
	public static final NumericOclAsTypeOperation INSTANCE = new NumericOclAsTypeOperation();

	@Override
	protected Value evaluateConforming(EvaluationVisitor evaluationVisitor, Value sourceVal, Type argType) {
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		if (sourceVal.isUnlimited() && ((argType == stdlib.getIntegerType()) || (argType == stdlib.getRealType()))) {
			return null;
		}
		else if ((sourceVal instanceof IntegerValue) && (argType == stdlib.getRealType())) {
			return ((IntegerValue)sourceVal).toRealValue();
		}
		else {
			return sourceVal;
		}
	}

	@Override
	protected Value evaluateNonConforming(EvaluationVisitor evaluationVisitor, Value sourceVal, Type argType) {
		StandardLibrary stdlib = evaluationVisitor.getStandardLibrary();
		RealValue realValue = sourceVal.asRealValue();
		if (realValue != null) {
			if (argType == stdlib.getUnlimitedNaturalType()) {
				if (realValue.signum() < 0) {
					return evaluationVisitor.getValueFactory().createInvalidValue(sourceVal, null, "not positive", null);
				}
				return realValue.toIntegerValue();
			}
			else if (argType == stdlib.getIntegerType()) {
				return realValue.toIntegerValue();
			}
			return null;
		}
		IntegerValue integerValue = sourceVal.asIntegerValue();
		if (integerValue != null) {
			if (argType == stdlib.getUnlimitedNaturalType()) {
				if (integerValue.signum() < 0) {
					return evaluationVisitor.getValueFactory().createInvalidValue(sourceVal, null, "not positive", null);
				}
				return integerValue;
			}
		}
		return null;
	}
}