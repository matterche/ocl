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
 * $Id: LibraryIteration.java,v 1.1.2.1 2010/10/01 13:28:36 ewillink Exp $
 */
package org.eclipse.ocl.examples.library;

import org.eclipse.ocl.examples.pivot.EvaluationContext;
import org.eclipse.ocl.examples.pivot.IteratorExp;

/**
 * @since 3.1
 */
public interface LibraryIteration extends LibraryFeature {
	/**
	 * Return the result of evaluating iterationExp upon sourceVal within the environment
	 * provided by EvaluationVisitor. An invalid return may be indicated by throwing an exception
	 * returning Java null or OCL invalid.
	 *
	 * @param evaluationContext the evaluation context
	 * @param sourceVal the source operand for the operation
	 * @param iteratorExp the iteration and additional arguments
	 * @return the evaluated value
	 */
	Object evaluate(EvaluationContext evaluationContext, Object sourceVal, IteratorExp iteratorExp);

}
