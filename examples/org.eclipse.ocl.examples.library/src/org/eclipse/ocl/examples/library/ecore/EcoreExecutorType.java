/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.ocl.examples.library.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.domain.values.ObjectValue;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.domain.values.ValueFactory;
import org.eclipse.ocl.examples.library.executor.ExecutorFragment;
import org.eclipse.ocl.examples.library.executor.ExecutorPackage;
import org.eclipse.ocl.examples.library.executor.ExecutorType;
import org.eclipse.ocl.examples.library.executor.ExecutorTypeParameter;

public class EcoreExecutorType extends ExecutorType
{
	protected EClassifier eClassifier;
	
	/**
	 * Construct an executable type descriptor in the absence of a known EClassifier. A subsequent
	 * call of {@link #init(EClassifier)} may define an EClassifier.
	 */
	public EcoreExecutorType(String name, ExecutorPackage evaluationPackage, int flags, ExecutorTypeParameter... typeParameters) {
		super(name, evaluationPackage, flags, typeParameters);
		this.eClassifier = null;		
	}
	
	/**
	 * Construct an executable type descriptor for a known EClassifier.
	 */
	public EcoreExecutorType(EClassifier eClassifier, EcoreExecutorPackage evaluationPackage, int flags, ExecutorTypeParameter... typeParameters) {
		super(eClassifier.getName(), evaluationPackage, flags, typeParameters);
		this.eClassifier = eClassifier;		
	}

	@Override
	public ObjectValue createInstance(ValueFactory valueFactory) {
		if (eClassifier instanceof EClass) {
			EClass eClass = (EClass)eClassifier;
			EObject element = eClass.getEPackage().getEFactoryInstance().create(eClass);
			return valueFactory.createObjectValue(element);
		}
		return super.createInstance(valueFactory);
	}

	@Override
	public Value createInstance(ValueFactory valueFactory, String value) {
		if (eClassifier instanceof EDataType) {
			EDataType eDataType = (EDataType) eClassifier;
			Object element = eDataType.getEPackage().getEFactoryInstance().createFromString(eDataType, value);
			return valueFactory.valueOf(element);
		}
		return super.createInstance(valueFactory);
	}

	public final EClassifier getEClassifier() {
		return eClassifier;
	}

	@Override
	public String getMetaTypeName() {
		return eClassifier.getName();
	}
	
	/**
	 * Define the EClassifier associated with an executable type. This initialization may
	 * be performed once to allow an Ecore-aware package of type descriptors to re-use and
	 * enhance an Ecore-unaware package. This occurs for the PivotTables that enhance the
	 * OCLstdlibTables.
	 */
	public EcoreExecutorType initFragments(ExecutorFragment[] fragments, int[] depthCounts, EClassifier eClassifier) {
		assert this.eClassifier == null;
		assert name.equals(eClassifier.getName());
		this.eClassifier = eClassifier;		
//		if (eClassifier instanceof EClass) {
			initFragments(fragments, depthCounts);
//		}
		return this;
	}
}
