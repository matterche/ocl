/**
 * <copyright>
 *
 * Copyright (c) 2005, 2009 Eclipse Foundation.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   aigdalov - Bug 290680
 *
 * </copyright>
 *
 * $Id: CollectionsConformToOclAnyTest.java,v 1.1.2.1 2010/01/30 22:25:44 ewillink Exp $
 */

package org.eclipse.ocl.ecore.tests;

import java.math.BigInteger;
import java.util.Arrays;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.expressions.OCLExpression;


/**
 * OCL 2.1: Tests for conformance of Collections to OclAny.
 *
 */
@SuppressWarnings("nls")
public class CollectionsConformToOclAnyTest
	extends AbstractTestSuite {

	public void test_collections_conform_to_OclAny_290680() {
		helper.setContext(EcorePackage.Literals.ESTRING);

		try {
			OCLExpression<EClassifier> expr = helper.createQuery("Sequence{OrderedSet{'a', 'b'}}->oclIsKindOf(OclAny)");
			assertEquals(true, ocl.evaluate("", expr));

			expr = helper.createQuery("Set{1, 'c'}->oclIsKindOf(OclAny)");
			assertEquals(true, ocl.evaluate("", expr));

			expr = helper.createQuery("Bag{1, 2}->oclIsKindOf(OclAny)");
			assertEquals(true, ocl.evaluate("", expr));

			// implicit collect is still there
			expr = helper.createQuery("Sequence{1, 2}.oclIsKindOf(OclAny)");
			assertEquals(Arrays.asList(true, true), ocl.evaluate("", expr));

			expr = helper.createQuery("Bag{1, 2}->oclIsTypeOf(OclAny)");
			assertEquals(false, ocl.evaluate("", expr));
			
			expr = helper.createQuery("let c : Collection(Integer) = Bag{1, 2} in c->oclIsKindOf(OclAny)");
			assertEquals(true, ocl.evaluate("", expr));

			// invokes oclIsKindOf() on Bag{1, 2}
			expr = helper.createQuery("let c : OclAny = Bag{1, 2} in c.oclIsKindOf(OclAny)");
			assertEquals(true, ocl.evaluate("", expr));

			// invokes oclIsKindOf() on Collection{Bag{1, 2}}
			expr = helper.createQuery("let c : OclAny = Bag{1, 2} in c->oclIsKindOf(OclAny)");
			assertEquals(true, ocl.evaluate("", expr));

//			// invokes size() on Bag{1, 2}
//			expr = helper.createQuery("let c : OclAny = Bag{1, 2} in c.oclAsType(Bag(Integer))->size()");
//			assertEquals(2, ocl.evaluate("", expr));
			
			// invokes size() on Collection{Bag{1, 2}}
			expr = helper.createQuery("let c : OclAny = Bag{1, 2} in c->size()");
			assertEquals(1, ocl.evaluate("", expr));

			// invokes flatten() on Collection{Sequence{1, 2}}
			expr = helper.createQuery("let c : OclAny = Sequence{1, 2} in c->asSequence()->flatten()");
			assertEquals(Arrays.asList(BigInteger.ONE, BigInteger.valueOf(2)), ocl.evaluate("", expr));
		} catch (Exception e) {
			fail("Failed to parse or evaluate: " + e.getLocalizedMessage());
		}
	}

	
	public void test_mixed_element_types_in_collections_290680() {
		helper.setContext(EcorePackage.Literals.ESTRING);

		try {
			OCLExpression<EClassifier> expr = helper.createQuery("Sequence{1, OrderedSet{'a', 'b'}, 'c'}->oclIsKindOf(OclAny)");
			assertEquals(true, ocl.evaluate("", expr));

			expr = helper.createQuery("Sequence{1, OrderedSet{'a', 'b'}, 'c'}->size()");
			assertEquals(3, ocl.evaluate("", expr));
		} catch (Exception e) {
			fail("Failed to parse or evaluate: " + e.getLocalizedMessage());
		}
	}

	public void test_collections_oclIsInvalid_290680() {
		helper.setContext(EcorePackage.Literals.ESTRING);

		try {
			OCLExpression<EClassifier> expr = helper.createQuery("Sequence{1, 2}->oclIsInvalid()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("Set{1, 2}->oclIsInvalid()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("Bag{1, 2}->oclIsInvalid()");
			assertEquals(false, ocl.evaluate("", expr));
		
			expr = helper.createQuery("OrderedSet{1, 2}->oclIsInvalid()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("let c : Collection(Integer) = OrderedSet{1, 2} in c->oclIsInvalid()");
			assertEquals(false, ocl.evaluate("", expr));
		} catch (Exception e) {
			fail("Failed to parse or evaluate: " + e.getLocalizedMessage());
		}
	}
	
	public void test_collections_oclIsUndefined_290680() {
		helper.setContext(EcorePackage.Literals.ESTRING);

		try {
			OCLExpression<EClassifier> expr = helper.createQuery("Sequence{1, 2}->oclIsUndefined()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("Set{1, 2}->oclIsUndefined()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("Bag{1, 2}->oclIsUndefined()");
			assertEquals(false, ocl.evaluate("", expr));
		
			expr = helper.createQuery("OrderedSet{1, 2}->oclIsUndefined()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("let c : Collection(Integer) = OrderedSet{1, 2} in c->oclIsUndefined()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("let c : Collection(Integer) = null in c->oclIsUndefined()");
			assertEquals(true, ocl.evaluate("", expr));

			expr = helper.createQuery("let c : OrderedSet(Sequence(Set(Bag(Collection(Integer))))) = null in c->oclIsUndefined()");
			assertEquals(true, ocl.evaluate("", expr));
		} catch (Exception e) {
			fail("Failed to parse or evaluate: " + e.getLocalizedMessage());
		}
	}
	
	public void test_collections_oclAsType_290680() {
		helper.setContext(EcorePackage.Literals.ESTRING);

		try {
			OCLExpression<EClassifier> expr = helper.createQuery("Sequence{1, 2}->oclAsType(OclAny).oclIsUndefined()");
			assertEquals(false, ocl.evaluate("", expr));

			expr = helper.createQuery("let c : OclAny = Sequence{1, 2}->oclAsType(OclAny) in c->asSequence()->flatten()");
			assertEquals(Arrays.asList(BigInteger.ONE, BigInteger.valueOf(2)), ocl.evaluate("", expr));
		} catch (Exception e) {
			fail("Failed to parse or evaluate: " + e.getLocalizedMessage());
		}
	}
	
	public void test_def_collection_operation_on_OclAny_290680() {
		helper.setContext(getOCLStandardLibrary().getInteger());

		try {
			helper.defineOperation("size() : Integer = 1");

			OCLExpression<EClassifier> expr = helper.createQuery("Sequence{1, 2, 3}->size()");
			assertEquals(3, ocl.evaluate("", expr));

			expr = helper.createQuery("Sequence{1, 2, 3}.size()");
			assertEquals(Arrays.asList(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE), ocl.evaluate("", expr));

		} catch (Exception e) {
			fail("Failed to parse or evaluate: " + e.getLocalizedMessage());
		}
	}

	public void test_def_OclAny_operation_290680() {
		helper.setContext(getOCLStandardLibrary().getOclAny());

		try {
			helper.defineOperation("foo() : Integer = 1");

			OCLExpression<EClassifier> expr = helper.createQuery("10.foo()");
			assertEquals(1, ocl.evaluate("", expr));
			
			expr = helper.createQuery("Sequence{1, 2, 3}->foo()");
			assertEquals(1, ocl.evaluate("", expr));

			expr = helper.createQuery("Sequence{1, 2, 3}.foo()");
			assertEquals(Arrays.asList(BigInteger.ONE, BigInteger.ONE, BigInteger.ONE), ocl.evaluate("", expr));

		} catch (Exception e) {
			fail("Failed to parse or evaluate: " + e.getLocalizedMessage());
		}
	}
}