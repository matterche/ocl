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

import org.eclipse.ocl.examples.domain.elements.DomainInheritance;
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
    protected void setUp() throws Exception {
        super.setUp();
        helper.setContext(metaModelManager.getAnyClassifierType());
    }

	public void test_Inheritance_Boolean() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			DomainInheritance oclAnyInheritance = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
			PrimitiveType booleanType = metaModelManager.getBooleanType();
			DomainInheritance booleanInheritance = metaModelManager.getInheritance(booleanType);
			assert booleanInheritance.getDepth() == 1;
			Iterator<DomainInheritance> allSuperInheritances = booleanInheritance.getAllSuperInheritances().iterator();
			assert allSuperInheritances.next() == oclAnyInheritance;
			assert allSuperInheritances.next() == booleanInheritance;
			assert !allSuperInheritances.hasNext();
			Iterator<DomainInheritance> depth0Inheritances = booleanInheritance.getSuperInheritances(0).iterator();
			assert depth0Inheritances.next() == oclAnyInheritance;
			assert !depth0Inheritances.hasNext();
			Iterator<DomainInheritance> depth1Inheritances = booleanInheritance.getSuperInheritances(1).iterator();
			assert depth1Inheritances.next() == booleanInheritance;
			assert !depth1Inheritances.hasNext();
		} finally {
			metaModelManager.dispose();
		}
	}

	public void test_Inheritance_OclAny() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			AnyType oclAnyType = metaModelManager.getOclAnyType();
			DomainInheritance oclAnyInheritance = metaModelManager.getInheritance(oclAnyType);
			assert oclAnyInheritance.getDepth() == 0;
			Iterator<DomainInheritance> allSuperInheritances = oclAnyInheritance.getAllSuperInheritances().iterator();
			assert allSuperInheritances.next() == oclAnyInheritance;
			assert !allSuperInheritances.hasNext();
			Iterator<DomainInheritance> depth0Inheritances = oclAnyInheritance.getSuperInheritances(0).iterator();
			assert depth0Inheritances.next() == oclAnyInheritance;
			assert !depth0Inheritances.hasNext();
		} finally {
			metaModelManager.dispose();
		}
	}

	public void test_Inheritance_Set() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			DomainInheritance oclAnyInheritance = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
	//		InheritanceInheritance collectionInheritance = metaModelManager.getInheritance(metaModelManager.getCollectionType());
			SetType setType = metaModelManager.getSetType();
			DomainInheritance setInheritance = metaModelManager.getInheritance(setType);
			assert setInheritance.getDepth() == 3;
			Iterator<DomainInheritance> allSuperInheritances = setInheritance.getAllSuperInheritances().iterator();
			assert allSuperInheritances.next() == oclAnyInheritance;
	//		assert allSuperInheritances.next() == collectionInheritance;
			DomainInheritance next = allSuperInheritances.next();
			while (allSuperInheritances.hasNext()) {
				next = allSuperInheritances.next();
			}
			assert next == setInheritance;
			assert !allSuperInheritances.hasNext();
			Iterator<DomainInheritance> depth0Inheritances = setInheritance.getSuperInheritances(0).iterator();
			assert depth0Inheritances.next() == oclAnyInheritance;
			assert !depth0Inheritances.hasNext();
	//		Iterator<InheritanceInheritance> depth1Inheritances = setInheritance.getSuperInheritances(1).iterator();
	//		assert depth1Inheritances.next() == collectionInheritance;
	//		assert !depth1Inheritances.hasNext();
			Iterator<DomainInheritance> depth3Inheritances = setInheritance.getSuperInheritances(3).iterator();
			assert depth3Inheritances.next() == setInheritance;
			assert !depth3Inheritances.hasNext();
		} finally {
			metaModelManager.dispose();
		}
	}

	public void test_Inheritance_IfExp() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			DomainInheritance oclAnyInheritance = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
			DomainInheritance ifInheritance = metaModelManager.getInheritance(metaModelManager.getPivotType("IfExp"));
			Iterator<DomainInheritance> allSuperInheritances = ifInheritance.getAllSuperInheritances().iterator();
			assert allSuperInheritances.next() == oclAnyInheritance;
			DomainInheritance next = allSuperInheritances.next();
			while (allSuperInheritances.hasNext()) {
				next = allSuperInheritances.next();
			}
			assert next == ifInheritance;
			assert !allSuperInheritances.hasNext();
			Iterator<DomainInheritance> depth0Inheritances = ifInheritance.getSuperInheritances(0).iterator();
			assert depth0Inheritances.next() == oclAnyInheritance;
			assert !depth0Inheritances.hasNext();
			Iterator<DomainInheritance> depthNInheritances = ifInheritance.getSuperInheritances(ifInheritance.getDepth()).iterator();
			assert depthNInheritances.next() == ifInheritance;
			assert !depthNInheritances.hasNext();
			assert oclAnyInheritance.isSuperInheritanceOf(metaModelManager, ifInheritance);
			assert !ifInheritance.isSuperInheritanceOf(metaModelManager, oclAnyInheritance);
			DomainInheritance oclExpressionInheritance = metaModelManager.getInheritance(metaModelManager.getPivotType("OclExpression"));
			assert oclExpressionInheritance.isSuperInheritanceOf(metaModelManager, ifInheritance);
			assert !ifInheritance.isSuperInheritanceOf(metaModelManager, oclExpressionInheritance);
			DomainInheritance loopExpInheritance = metaModelManager.getInheritance(metaModelManager.getPivotType("LoopExp"));
			assert !ifInheritance.isSuperInheritanceOf(metaModelManager, loopExpInheritance);
			assert !loopExpInheritance.isSuperInheritanceOf(metaModelManager, ifInheritance);
		} finally {
			metaModelManager.dispose();
		}
	}

	public void test_Inheritance_UnlimitedNatural() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			DomainInheritance oclAnyInheritance = metaModelManager.getInheritance(metaModelManager.getOclAnyType());
			DomainInheritance realTypeInheritance = metaModelManager.getInheritance(metaModelManager.getRealType());
			DomainInheritance integerTypeInheritance = metaModelManager.getInheritance(metaModelManager.getIntegerType());
			DomainInheritance unlimitedNaturalTypeInheritance = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
			assertEquals(4, unlimitedNaturalTypeInheritance.getDepth());
			Iterator<DomainInheritance> allSuperInheritances = unlimitedNaturalTypeInheritance.getAllSuperInheritances().iterator();
			assertEquals(oclAnyInheritance, allSuperInheritances.next());
			Iterator<DomainInheritance> depth0Inheritances = unlimitedNaturalTypeInheritance.getSuperInheritances(0).iterator();
			assertEquals(oclAnyInheritance, depth0Inheritances.next());
			assert !depth0Inheritances.hasNext();
			Iterator<DomainInheritance> depth2Inheritances = unlimitedNaturalTypeInheritance.getSuperInheritances(2).iterator();
			assertEquals(realTypeInheritance, depth2Inheritances.next());
			assert !depth2Inheritances.hasNext();
			Iterator<DomainInheritance> depth3Inheritances = unlimitedNaturalTypeInheritance.getSuperInheritances(3).iterator();
			assertEquals(integerTypeInheritance, depth3Inheritances.next());
			assert !depth3Inheritances.hasNext();
			Iterator<DomainInheritance> depth4Inheritances = unlimitedNaturalTypeInheritance.getSuperInheritances(4).iterator();
			assertEquals(unlimitedNaturalTypeInheritance, depth4Inheritances.next());
			assert !depth4Inheritances.hasNext();
		} finally {
			metaModelManager.dispose();
		}
	}

	/**
	 * Check that an inheritance loop is diagnosed. 
	 */
	public void test_Inheritance_Loop() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			DomainInheritance unlimitedNaturalTypeInheritance = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
			assertEquals(4, unlimitedNaturalTypeInheritance.getDepth());
			try {
				metaModelManager.getRealType().getSuperClasses().add(metaModelManager.getIntegerType());
				unlimitedNaturalTypeInheritance.getDepth();
				fail("Missing IllegalStateException");
			} catch (IllegalStateException e) {
				// FIXME validate body
			} finally {
				metaModelManager.getRealType().getSuperClasses().remove(metaModelManager.getIntegerType());
			}
		} finally {
			metaModelManager.dispose();
		}
	}

	/**
	 * Check that addition of a supertype invalidates cached inheritances. 
	 */
	public void test_Inheritance_Addition() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			DomainInheritance unlimitedNaturalTypeInheritance = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
			assertEquals(4, unlimitedNaturalTypeInheritance.getDepth());
			try {
				metaModelManager.getRealType().getSuperClasses().add(metaModelManager.getStringType());
				assertEquals(3, metaModelManager.getInheritance(metaModelManager.getRealType()).getDepth());
				assertEquals(5, unlimitedNaturalTypeInheritance.getDepth());
			} finally {
				metaModelManager.getRealType().getSuperClasses().remove(metaModelManager.getStringType());
			}
		} finally {
			metaModelManager.dispose();
		}
	}


	/**
	 * Check that removal of a supertype invalidates cached inheritances. 
	 */
	public void test_Inheritance_Removal() {
		MetaModelManager metaModelManager = new MetaModelManager();
		try {
			DomainInheritance unlimitedNaturalTypeInheritance = metaModelManager.getInheritance(metaModelManager.getUnlimitedNaturalType());
			assertEquals(4, unlimitedNaturalTypeInheritance.getDepth());
			try {
				metaModelManager.getIntegerType().getSuperClasses().remove(metaModelManager.getRealType());
				assertEquals(2, unlimitedNaturalTypeInheritance.getDepth());
				assertEquals(1, metaModelManager.getInheritance(metaModelManager.getIntegerType()).getDepth());
				assertEquals(2, metaModelManager.getInheritance(metaModelManager.getRealType()).getDepth());
			} finally {
				metaModelManager.getIntegerType().getSuperClasses().add(metaModelManager.getRealType());
			}
		} finally {
			metaModelManager.dispose();
		}
	}
}
