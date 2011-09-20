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
package org.eclipse.ocl.examples.library.ecore;

import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.library.executor.ExecutorManager;

public class EcoreExecutorManager extends ExecutorManager
{
	public static final EcoreExecutorManager INSTANCE = new EcoreExecutorManager(null);		// WIP

	public EcoreExecutorManager(DomainStandardLibrary standardLibrary) {
		super(new EcoreValueFactory(standardLibrary));
	}

	public DomainEvaluator createNestedEvaluator() {
		return new EcoreExecutorManager(valueFactory.getStandardLibrary());
	}
}