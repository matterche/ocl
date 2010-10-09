/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EvaluationVisitor.java,v 1.1.2.3 2010/10/09 20:09:24 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.evaluation;

import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.OclExpression;
import org.eclipse.ocl.examples.pivot.StandardLibrary;
import org.eclipse.ocl.examples.pivot.utilities.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.Visitor;

/**
 * A specialized visitor that is used for evaluation an
 * {@linkplain OclExpression OCL expression} by walking its AST.
 * <p>
 * See the {@link Environment} class for a description of the
 * generic type parameters of this class. 
 * </p>
 * 
 * @author Tim Klinger (tklinger)
 * @author Christian W. Damus (cdamus)
 */
public interface EvaluationVisitor extends Visitor<Object> {

	EvaluationVisitor createNestedVisitor();
	
	/**
     * Obtains the environment that provides the metamodel semantics for the
     * expression to be evaluated.
     *  
	 * @return the environment
	 */
	public Environment getEnvironment();

	/**
     * Obtains the evaluation environment that keeps track of variable values
     * and knows how to call operations, navigate properties, etc.
     * 
	 * @return the evaluation environment
	 */
	public EvaluationEnvironment getEvaluationEnvironment();
	
	/**
     * Obtains the mapping of model classes to their extents.
     * 
	 * @return the extent map
	 */
	public Map<? extends org.eclipse.ocl.examples.pivot.Class, ? extends Set<? extends Object>> getExtentMap();

	public StandardLibrary getStandardLibrary();

	/**
	 * Load the implementation class that realises a feature.
	 * 
	 * @param implementationClass name
	 * @return class
	 * @throws Exception from class loading
	 */
	public CallableImplementation loadImplementationClass(String implementationClass) throws Exception;
    
    /**
     * Configures the specified decorated visitor to correctly handle the
     * invocation of recursive <code>visitXxx(...)</code> calls.  In particular,
     * the tail of a chain of decorators is informed (if it is an
     * {@link AbstractEvaluationVisitor} of the head decorator of the chain,
     * so that recursive visitation follows the entire decorator chain at
     * every step.
     * 
     * @param decorator the decorator that is not decorated/
     */
	public void setUndecoratedVisitor(EvaluationVisitor evaluationVisitor);

    /**
     * @deprecated use {@link #visit(Visitable)
     */
	@Deprecated
	public Object visitExpression(OclExpression expression);
}
