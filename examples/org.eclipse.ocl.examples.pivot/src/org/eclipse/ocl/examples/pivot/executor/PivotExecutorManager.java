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
package org.eclipse.ocl.examples.pivot.executor;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.library.executor.ExecutorManager;
import org.eclipse.ocl.examples.library.executor.ExecutorValueFactory;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManageable;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

public class PivotExecutorManager extends ExecutorManager implements MetaModelManageable
{
	protected final MetaModelManager metaModelManager;
	
	public PivotExecutorManager(MetaModelManager metaModelManager) {
		super(new ExecutorValueFactory(metaModelManager));
		this.metaModelManager = metaModelManager;		
	}

/*	protected int computeBases(List<List<Type>> bases, Type pivotClass) {
		int depth;
		List<Type> superClasses = pivotClass.getSuperClass();
		if (superClasses.size() > 0) {
			depth = Integer.MAX_VALUE;
			for (Type superClass : superClasses) {
				int superDepth = computeBases(bases, superClass);
				if (superDepth < depth) {
					depth = superDepth;
				}
			}
		}
		else {
			depth = 0;
		}
		List<Type> equiDepthBases;
		if (depth < bases.size()) {
			equiDepthBases = bases.get(depth);
		}
		else {
			assert depth == bases.size()+1;
			equiDepthBases = new ArrayList<Type>();
			bases.add(equiDepthBases);
		}
		equiDepthBases.add(pivotClass);
		return depth+1;
	}
	
	protected PivotExecutorClass[] computeClasses(PivotExecutorManager dispatcher, org.eclipse.ocl.examples.pivot.Package pivotPackage) {
		PivotExecutorPackage evaluationPackage = getEvaluationPackage(pivotPackage);
		List<Type> ownedTypes = pivotPackage.getOwnedType();
		PivotExecutorClass[] classes = new PivotExecutorClass[ownedTypes.size()];
		for (int i = 0; i < classes.length; i++) {
			org.eclipse.ocl.examples.pivot.Class pivotClass = (org.eclipse.ocl.examples.pivot.Class) ownedTypes.get(i);
			int flags;
			if (pivotClass instanceof OrderedSetType) {
				flags = PivotExecutorClass.ORDERED | PivotExecutorClass.UNIQUE;
			}
			else if (pivotClass instanceof SetType) {
				flags = PivotExecutorClass.UNIQUE;
			}
			else if (pivotClass instanceof SequenceType) {
				flags = PivotExecutorClass.ORDERED;
			}
			else {
				flags = 0;
			}
			classes[i] = new PivotExecutorClass(evaluationPackage, flags, computeFragments(pivotClass), pivotClass);
		}
		return null;
	}
	
	protected PivotFragment[] computeFragments(Type pivotClass) {
		List<List<Type>> bases = new ArrayList<List<Type>>();
		computeBases(bases, pivotClass);
		int numFragments = 0;
		for (List<Type> equiDepthBases : bases) {
			numFragments += equiDepthBases.size();
		}
		PivotExecutorType pivotInheritance = metaModelManager.getInheritance(pivotClass);
		PivotFragment[] fragments = new PivotFragment[numFragments];
		numFragments = 0;
		for (List<Type> equiDepthBases : bases) {
			for (Type  base : equiDepthBases) {
				PivotExecutorType baseInheritance = metaModelManager.getInheritance(base);
				PivotExecutorOperation[] operations = computeOperations(base);
				ExecutorProperty[] properties = computeProperties(base);
				fragments[numFragments++] = new PivotFragment(pivotInheritance, baseInheritance, operations, properties, base);
			}
		}
		return fragments;
	}

	protected PivotExecutorOperation[] computeOperations(Type pivotClass) {
		PivotExecutorType pivotInheritance = metaModelManager.getInheritance(pivotClass);
		List<Operation> ownedOperations = pivotClass.getOwnedOperation();
		PivotExecutorOperation[] operations = new PivotExecutorOperation[ownedOperations.size()];
		for (int i = 0; i < ownedOperations.size(); i++) {			
			Operation pivotOperation = ownedOperations.get(i);
			operations[i] = new PivotExecutorOperation(pivotInheritance, i, pivotOperation);
		}
		return operations;
	}

	protected ExecutorProperty[] computeProperties(Type pivotClass) {
//		PivotExecutorClass evaluationClass = getEvaluationClass(pivotClass);
		List<Property> ownedProperties = pivotClass.getOwnedAttribute();
		ExecutorProperty[] properties = new ExecutorProperty[ownedProperties.size()];
//		for (int i = 0; i < ownedOperations.size(); i++) {			
//			Operation pivotOperation = ownedOperations.get(i);
//			operations[i] = new PivotEvaluationOperation(evaluationClass, i, pivotOperation);
//		}
		return properties;		// WIP FIXME
	} */

	public DomainEvaluator createNestedEvaluator() {
		return new PivotExecutorManager(metaModelManager);
	}

	public MetaModelManager getMetaModelManager() {
		return metaModelManager;
	}
}