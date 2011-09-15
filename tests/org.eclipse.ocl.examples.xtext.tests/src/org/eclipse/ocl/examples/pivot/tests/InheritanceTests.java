/**
 * <copyright>
 * 
 * Copyright (c) 2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PrettyPrinterTest.java,v 1.3 2011/05/13 19:15:57 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.tests;

import java.util.Iterator;

import org.eclipse.ocl.examples.domain.types.DomainInheritance;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.SetType;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;

/**
 * Tests for OclAny operations.
 */
@SuppressWarnings("nls")
public class InheritanceTests extends PivotSimpleTestSuite
{
    @Override
    protected void setUp() {
        super.setUp();
        helper.setContext(getMetaclass("Classifier"));
    }

	public void test_Inheritance_Boolean() {
		MetaModelManager metaModelManager = new MetaModelManager();
		DomainInheritance oclAnyAdapter = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
		PrimitiveType booleanType = metaModelManager.getBooleanType();
		DomainInheritance booleanAdapter = metaModelManager.getInheritance(booleanType);
		assert booleanAdapter.getDepth() == 1;
		Iterator<DomainInheritance> allSuperAdapters = booleanAdapter.getAllSuperInheritances().iterator();
		assert allSuperAdapters.next() == oclAnyAdapter;
		assert allSuperAdapters.next() == booleanAdapter;
		assert !allSuperAdapters.hasNext();
		Iterator<DomainInheritance> depth0Adapters = booleanAdapter.getSuperInheritances(0).iterator();
		assert depth0Adapters.next() == oclAnyAdapter;
		assert !depth0Adapters.hasNext();
		Iterator<DomainInheritance> depth1Adapters = booleanAdapter.getSuperInheritances(1).iterator();
		assert depth1Adapters.next() == booleanAdapter;
		assert !depth1Adapters.hasNext();
	}

	public void test_Inheritance_OclAny() {
		MetaModelManager metaModelManager = new MetaModelManager();
		AnyType oclAnyType = metaModelManager.getOclAnyType();
		DomainInheritance oclAnyAdapter = metaModelManager.getInheritance(oclAnyType);
		assert oclAnyAdapter.getDepth() == 0;
		Iterator<DomainInheritance> allSuperAdapters = oclAnyAdapter.getAllSuperInheritances().iterator();
		assert allSuperAdapters.next() == oclAnyAdapter;
		assert !allSuperAdapters.hasNext();
		Iterator<DomainInheritance> depth0Adapters = oclAnyAdapter.getSuperInheritances(0).iterator();
		assert depth0Adapters.next() == oclAnyAdapter;
		assert !depth0Adapters.hasNext();
	}

	public void test_Inheritance_Set() {
		MetaModelManager metaModelManager = new MetaModelManager();
		DomainInheritance oclAnyAdapter = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
//		InheritanceAdapter collectionAdapter = metaModelManager.getInheritance(metaModelManager.getCollectionType());
		SetType setType = metaModelManager.getSetType();
		DomainInheritance setAdapter = metaModelManager.getInheritance(setType);
		assert setAdapter.getDepth() == 3;
		Iterator<DomainInheritance> allSuperAdapters = setAdapter.getAllSuperInheritances().iterator();
		assert allSuperAdapters.next() == oclAnyAdapter;
//		assert allSuperAdapters.next() == collectionAdapter;
		DomainInheritance next = allSuperAdapters.next();
		while (allSuperAdapters.hasNext()) {
			next = allSuperAdapters.next();
		}
		assert next == setAdapter;
		assert !allSuperAdapters.hasNext();
		Iterator<DomainInheritance> depth0Adapters = setAdapter.getSuperInheritances(0).iterator();
		assert depth0Adapters.next() == oclAnyAdapter;
		assert !depth0Adapters.hasNext();
//		Iterator<InheritanceAdapter> depth1Adapters = setAdapter.getSuperAdapters(1).iterator();
//		assert depth1Adapters.next() == collectionAdapter;
//		assert !depth1Adapters.hasNext();
		Iterator<DomainInheritance> depth3Adapters = setAdapter.getSuperInheritances(3).iterator();
		assert depth3Adapters.next() == setAdapter;
		assert !depth3Adapters.hasNext();
	}

	public void test_Inheritance_IfExp() {
		MetaModelManager metaModelManager = new MetaModelManager();
		DomainInheritance oclAnyAdapter = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
		DomainInheritance ifAdapter = metaModelManager.getInheritance(metaModelManager.getPivotType("IfExp"));
		Iterator<DomainInheritance> allSuperAdapters = ifAdapter.getAllSuperInheritances().iterator();
		assert allSuperAdapters.next() == oclAnyAdapter;
		DomainInheritance next = allSuperAdapters.next();
		while (allSuperAdapters.hasNext()) {
			next = allSuperAdapters.next();
		}
		assert next == ifAdapter;
		assert !allSuperAdapters.hasNext();
		Iterator<DomainInheritance> depth0Adapters = ifAdapter.getSuperInheritances(0).iterator();
		assert depth0Adapters.next() == oclAnyAdapter;
		assert !depth0Adapters.hasNext();
		Iterator<DomainInheritance> depthNAdapters = ifAdapter.getSuperInheritances(ifAdapter.getDepth()).iterator();
		assert depthNAdapters.next() == ifAdapter;
		assert !depthNAdapters.hasNext();
		assert oclAnyAdapter.isSuperInheritanceOf(ifAdapter, metaModelManager);
		assert !ifAdapter.isSuperInheritanceOf(oclAnyAdapter, metaModelManager);
		DomainInheritance oclExpressionAdapter = metaModelManager.getInheritance(metaModelManager.getPivotType("OclExpression"));
		assert oclExpressionAdapter.isSuperInheritanceOf(ifAdapter, metaModelManager);
		assert !ifAdapter.isSuperInheritanceOf(oclExpressionAdapter, metaModelManager);
		DomainInheritance loopExpAdapter = metaModelManager.getInheritance(metaModelManager.getPivotType("LoopExp"));
		assert !ifAdapter.isSuperInheritanceOf(loopExpAdapter, metaModelManager);
		assert !loopExpAdapter.isSuperInheritanceOf(ifAdapter, metaModelManager);
	}

	public void test_Inheritance_UnlimitedNatural() {
		MetaModelManager metaModelManager = new MetaModelManager();
		DomainInheritance oclAnyAdapter = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
		DomainInheritance realTypeAdapter = metaModelManager.getInheritance(metaModelManager.getRealType());
		DomainInheritance integerTypeAdapter = metaModelManager.getInheritance(metaModelManager.getIntegerType());
		DomainInheritance unlimitedNaturalTypeAdapter = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
		assert unlimitedNaturalTypeAdapter.getDepth() == 3;
		Iterator<DomainInheritance> allSuperAdapters = unlimitedNaturalTypeAdapter.getAllSuperInheritances().iterator();
		assert allSuperAdapters.next() == oclAnyAdapter;
		assert allSuperAdapters.next() == realTypeAdapter;
		assert allSuperAdapters.next() == integerTypeAdapter;
		assert allSuperAdapters.next() == unlimitedNaturalTypeAdapter;
		assert !allSuperAdapters.hasNext();
		Iterator<DomainInheritance> depth0Adapters = unlimitedNaturalTypeAdapter.getSuperInheritances(0).iterator();
		assert depth0Adapters.next() == oclAnyAdapter;
		assert !depth0Adapters.hasNext();
		Iterator<DomainInheritance> depth1Adapters = unlimitedNaturalTypeAdapter.getSuperInheritances(1).iterator();
		assert depth1Adapters.next() == realTypeAdapter;
		assert !depth1Adapters.hasNext();
		Iterator<DomainInheritance> depth2Adapters = unlimitedNaturalTypeAdapter.getSuperInheritances(2).iterator();
		assert depth2Adapters.next() == integerTypeAdapter;
		assert !depth2Adapters.hasNext();
		Iterator<DomainInheritance> depth3Adapters = unlimitedNaturalTypeAdapter.getSuperInheritances(3).iterator();
		assert depth3Adapters.next() == unlimitedNaturalTypeAdapter;
		assert !depth3Adapters.hasNext();
	}

	/**
	 * Check that an inheritance loop is diagnosed. 
	 */
	public void test_Inheritance_Loop() {
		MetaModelManager metaModelManager = new MetaModelManager();
		DomainInheritance unlimitedNaturalTypeAdapter = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
		assert unlimitedNaturalTypeAdapter.getDepth() == 3;		
		try {
			metaModelManager.getRealType().getSuperClasses().add(metaModelManager.getIntegerType());
			unlimitedNaturalTypeAdapter.getDepth();
			fail("Missing IllegalStateException");
		} catch (IllegalStateException e) {
			// FIXME validate body
		} finally {
			metaModelManager.getRealType().getSuperClasses().remove(metaModelManager.getIntegerType());
		}
	}

	/**
	 * Check that addition of a superclass invalidates cached inheritances. 
	 */
	public void test_Inheritance_Addition() {
		MetaModelManager metaModelManager = new MetaModelManager();
		DomainInheritance unlimitedNaturalTypeAdapter = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
		assert unlimitedNaturalTypeAdapter.getDepth() == 3;		
		try {
			metaModelManager.getRealType().getSuperClasses().add(metaModelManager.getStringType());
			assert metaModelManager.getInheritance(metaModelManager.getRealType()).getDepth() == 2;
			assert unlimitedNaturalTypeAdapter.getDepth() == 4;
		} finally {
			metaModelManager.getRealType().getSuperClasses().remove(metaModelManager.getStringType());
		}
	}


	/**
	 * Check that removal of a superclass invalidates cached inheritances. 
	 */
	public void test_Inheritance_Removal() {
		MetaModelManager metaModelManager = new MetaModelManager();
		DomainInheritance unlimitedNaturalTypeAdapter = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
		assert unlimitedNaturalTypeAdapter.getDepth() == 3;		
		try {
			metaModelManager.getIntegerType().getSuperClasses().remove(metaModelManager.getRealType());
			assert unlimitedNaturalTypeAdapter.getDepth() == 2;
			assert metaModelManager.getInheritance(metaModelManager.getIntegerType()).getDepth() == 1;
			assert metaModelManager.getInheritance(metaModelManager.getRealType()).getDepth() == 1;
		} finally {
			metaModelManager.getIntegerType().getSuperClasses().add(metaModelManager.getRealType());
		}
	}
}
