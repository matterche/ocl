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

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary;
import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorManager;
import org.eclipse.ocl.examples.library.executor.LazyModelManager;

public class EcoreExecutorManager extends ExecutorManager
{
	protected static ValueFactory getValueFactory(EObject contextObject, Map<Object, Object> contextMap, DomainStandardLibrary standardLibrary) {
		if (contextMap != null) {
			Object valueFactory = contextMap.get(ValueFactory.class);
			if (valueFactory instanceof ValueFactory) {
				return (ValueFactory) valueFactory;
			}
		}
		EPackage ePackage = contextObject.eClass().getEPackage();
		EList<Adapter> eAdapters = ePackage.eAdapters();
		for (Adapter adapter : eAdapters) {
			if (adapter instanceof ValueFactory) {
				return (ValueFactory) adapter;
			}
		}
		EcoreValueFactory ecoreValueFactory = new EcoreValueFactory(standardLibrary);
		eAdapters.add(ecoreValueFactory);
		return ecoreValueFactory;
	}

	private final EObject contextObject;
	private final Map<Object, Object> contextMap;
	private LazyModelManager modelManager = null;
	
	public EcoreExecutorManager(EObject contextObject, DomainStandardLibrary standardLibrary) {
		this(contextObject, null, standardLibrary);
	}

	public EcoreExecutorManager(EObject contextObject, Map<Object, Object> contextMap, DomainStandardLibrary standardLibrary) {
		super(getValueFactory(contextObject, contextMap, standardLibrary));
		this.contextObject = contextObject;
		this.contextMap = contextMap;
	}

	public DomainEvaluator createNestedEvaluator() {
		return new EcoreExecutorManager(contextObject, contextMap, valueFactory.getStandardLibrary());
	}

	@Override
	public DomainModelManager getModelManager() {
		if (modelManager == null) {
			modelManager = new LazyModelManager(contextObject)
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