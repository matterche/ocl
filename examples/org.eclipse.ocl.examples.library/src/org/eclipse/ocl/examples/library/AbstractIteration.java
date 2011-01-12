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
 * $Id: AbstractIteration.java,v 1.1.2.7 2011/01/12 10:28:53 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.ocl.examples.pivot.CallExp;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.Value;
import org.eclipse.ocl.examples.pivot.values.ValueFactory;
import org.eclipse.ocl.examples.pivot.values.impl.BagValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.OrderedSetValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SequenceValueImpl;
import org.eclipse.ocl.examples.pivot.values.impl.SetValueImpl;

/**
 * AbstractIteration realises shared characteristics of library iterations.
 * 
 * @since 3.1
 */
public abstract class AbstractIteration extends AbstractFeature implements LibraryIteration
{
	private static AtomicInteger tempCounter = new AtomicInteger();

	protected Value createAccumulationValue(ValueFactory valueFactory, boolean isOrdered, boolean isUnique) {
		if (isOrdered) {
			if (isUnique) {
				return new OrderedSetValueImpl.Accumulator(valueFactory);
			}
			else {
				return new SequenceValueImpl.Accumulator(valueFactory);
			}
		}
		else {
			if (isUnique) {
				return new SetValueImpl.Accumulator(valueFactory);
			}
			else {
				return new BagValueImpl.Accumulator(valueFactory);
			}
		}
	}

	public Value evaluate(EvaluationVisitor evaluationVisitor, Value sourceValue, CallExp callExp) {
		return evaluate(evaluationVisitor, sourceValue, (LoopExp) callExp);
	}	

	protected static synchronized String generateName() {
		return "__result__" + tempCounter.getAndIncrement();	//$NON-NLS-1$
	}
}
