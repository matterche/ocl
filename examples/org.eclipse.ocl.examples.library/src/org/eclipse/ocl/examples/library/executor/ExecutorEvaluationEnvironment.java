/**
 * <copyright>
 *
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */
package org.eclipse.ocl.examples.library.executor;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.elements.DomainTypedElement;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluationEnvironment;
import org.eclipse.ocl.examples.domain.values.Value;

public class ExecutorEvaluationEnvironment implements DomainEvaluationEnvironment
{
	private Map<DomainTypedElement, Value> variables = new HashMap<DomainTypedElement, Value>();
	
	public void add(DomainTypedElement variable, Value value) {
		variables.put(variable, value);
	}

	public DomainTypedElement createVariable(String name, DomainType type) {
		return new ExecutorTypedElement(name, type);
	}	

	public void replace(DomainTypedElement variable, Value value) {
		variables.put(variable, value);
	}
}
