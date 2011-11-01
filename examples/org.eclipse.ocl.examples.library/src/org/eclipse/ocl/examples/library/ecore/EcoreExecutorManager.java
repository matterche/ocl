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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.library.executor.ExecutorManager;
import org.eclipse.ocl.examples.library.executor.LazyModelManager;

public class EcoreExecutorManager extends ExecutorManager
{
	private final EObject context;
	private LazyModelManager modelManager = null;
	
	public EcoreExecutorManager(EObject context, DomainStandardLibrary standardLibrary) {
		super(new EcoreValueFactory(standardLibrary));
		this.context = context;
	}

	public DomainEvaluator createNestedEvaluator() {
		return new EcoreExecutorManager(context, valueFactory.getStandardLibrary());
	}

	@Override
	public DomainModelManager getModelManager() {
		if (modelManager == null) {
			modelManager = new LazyModelManager(context)
			{
				@Override
				protected boolean isInstance(DomainType type, EObject element) {
					EClass eClass = element.eClass();
					DomainStandardLibrary standardLibrary = valueFactory.getStandardLibrary();
					DomainType elementType = standardLibrary.getType(eClass);
					return elementType.conformsTo(standardLibrary, type);
				}
				
			};
		}
		return modelManager;
	}
}