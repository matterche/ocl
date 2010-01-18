/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2008 IBM Corporation, Zeligsoft Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenericEvaluateOclAnyOperationsTest.java,v 1.1.2.3 2010/01/18 08:57:41 ewillink Exp $
 */

package org.eclipse.ocl.tests;

import org.eclipse.emf.ecore.EObject;

/**
 * Tests for OclAny operations.
 */
@SuppressWarnings("nls")
public abstract class GenericEvaluateOclAnyOperationsTest<E extends EObject, PK extends E, T extends E, C extends T, CLS extends C, DT extends C, PT extends C, ET extends DT, O extends E, PM extends E, P extends E, PA extends P, PR extends P, EL, S, COA, SSA, CT>
	extends GenericTestSuite<E, PK, T, C, CLS, DT, PT, ET, O, PM, P, PA, PR, EL, S, COA, SSA, CT> {

	PK pkg1;
	PK pkg2;
	PK pkg3;
	PK pkg4;
	PK pkg5;
	PK jim;
	PK bob;
	PK george;

    @Override
    protected void setUp() {
        super.setUp();
        if (OCL20A) {
        	
        }

        // need a metamodel that has a reflexive EReference.
        // Ecore will do nicely. Create the following structure:
        // pkg1
        //  pkg2
        //   jim
        //  bob
        //  pkg3
        //   pkg4
        //   pkg5
        //    george

        pkg1 = reflection.createPackage("pkg1");
/*        pkg2 = reflection.createNestedPackage(pkg1, "pkg2");
        jim = reflection.createNestedPackage(pkg2, "jim");
        bob = reflection.createNestedPackage(pkg1, "bob");
        pkg3 = reflection.createNestedPackage(pkg1, "pkg3");
        pkg4 = reflection.createNestedPackage(pkg3, "pkg4");
        pkg5 = reflection.createNestedPackage(pkg3, "pkg5");
        george = reflection.createNestedPackage(pkg5, "george"); */
        helper.setContext(getMetaclass(denormalize("%Package")));
    }

    /**
     * Tests the oclAsType() operator.
     */
	public void test_oclAsType() {
		assertQueryInvalid(null, "true.oclAsType(Integer)");
		assertQueryInvalid(null, "true.oclAsType(String)");
		assertQueryTrue(null, "true.oclAsType(Boolean)");
		assertQueryTrue(null, "true.oclAsType(OclAny)");
		assertQueryInvalid(null, "true.oclAsType(OclVoid)");
		assertQueryInvalid(null, "true.oclAsType(OclInvalid)");
		assertQueryEquals(null, 3, "3.oclAsType(Integer)");
		assertQueryEquals(null, 3.0, "3.oclAsType(Real)");
		assertQueryEquals(null, 3, "3.0.oclAsType(Integer)");
		assertQueryEquals(null, 3.0, "3.0.oclAsType(Real)");
		assertQueryInvalid(null, "3.oclAsType(String)");
		assertQueryEquals(null, 3, "3.oclAsType(OclAny)");
		assertQueryInvalid(null, "3.oclAsType(OclVoid)");
		assertQueryInvalid(null, "3.oclAsType(OclInvalid)");

		assertQueryInvalid(null, "3.14.oclAsType(Integer)");
		assertQueryEquals(null, 3.14, "3.14.oclAsType(Real)");
		assertQueryInvalid(null, "3.14.oclAsType(String)");
		assertQueryEquals(null, 3.14, "3.14.oclAsType(OclAny)");
		assertQueryInvalid(null, "3.14.oclAsType(OclVoid)");
		assertQueryInvalid(null, "3.14.oclAsType(OclInvalid)");

		assertQueryInvalid(null, "*.oclAsType(Integer)");
		assertQueryInvalid(null, "*.oclAsType(Real)");
		assertQueryUnlimited(null, "*.oclAsType(UnlimitedNatural)");
		assertQueryInvalid(null, "*.oclAsType(String)");
		assertQueryUnlimited(null, "*.oclAsType(OclAny)");
		assertQueryInvalid(null, "*.oclAsType(OclVoid)");
		assertQueryInvalid(null, "*.oclAsType(OclInvalid)");
	}

    /**
     * Tests the oclIsInvalid() operator.
     */
    public void test_oclIsInvalid() {
        assertQueryTrue(pkg1, "invalid.oclIsInvalid()");
        assertQueryFalse(pkg1, "null.oclIsInvalid()");
        assertQueryFalse(pkg1, "true.oclIsInvalid()");
        assertQueryFalse(pkg1, "false.oclIsInvalid()");
        assertQueryFalse(pkg1, "3.14.oclIsInvalid()");
        assertQueryFalse(pkg1, "1.oclIsInvalid()");
        assertQueryFalse(pkg1, "*.oclIsInvalid()");
        assertQueryFalse(pkg1, "'invalid'.oclIsInvalid()");
        assertQueryFalse(pkg1, "self.oclIsInvalid()");
    }

    /**
     * Tests the oclIsKindOf() operator.
     */
    public void test_oclIsKindOf() {
        assertQueryTrue(pkg1, "invalid.oclIsKindOf(OclInvalid)");
        assertQueryTrue(pkg1, "invalid.oclIsKindOf(OclVoid)");
        assertQueryTrue(pkg1, "invalid.oclIsKindOf(OclAny)");
        assertQueryTrue(pkg1, "invalid.oclIsKindOf(%Package)");
        assertQueryFalse(OCL20A, pkg1, "null.oclIsKindOf(OclInvalid)");
        assertQueryTrue(pkg1, "null.oclIsKindOf(OclVoid)");
        assertQueryTrue(pkg1, "null.oclIsKindOf(OclAny)");
        assertQueryTrue(pkg1, "null.oclIsKindOf(%Package)");
        assertQueryFalse(pkg1, "true.oclIsKindOf(OclInvalid)");
        assertQueryFalse(pkg1, "true.oclIsKindOf(OclVoid)");
        assertQueryTrue(pkg1, "true.oclIsKindOf(Boolean)");
        assertQueryFalse(pkg1, "true.oclIsKindOf(Integer)");
        assertQueryFalse(pkg1, "true.oclIsKindOf(String)");
        assertQueryTrue(OCL20A, pkg1, "true.oclIsKindOf(OclAny)");
        assertQueryFalse(pkg1, "true.oclIsKindOf(%Package)");
        assertQueryFalse(pkg1, "3.14.oclIsKindOf(OclInvalid)");
        assertQueryFalse(pkg1, "3.14.oclIsKindOf(OclVoid)");
        assertQueryFalse(pkg1, "3.14.oclIsKindOf(Boolean)");
        assertQueryTrue(pkg1, "3.14.oclIsKindOf(Real)");
        assertQueryFalse(pkg1, "3.14.oclIsKindOf(Integer)");
        assertQueryFalse(pkg1, "3.14.oclIsKindOf(String)");
        assertQueryTrue(OCL20A, pkg1, "3.14.oclIsKindOf(OclAny)");
        assertQueryFalse(pkg1, "3.14.oclIsKindOf(%Package)");
        assertQueryFalse(pkg1, "1.oclIsKindOf(OclInvalid)");
        assertQueryFalse(pkg1, "1.oclIsKindOf(OclVoid)");
        assertQueryFalse(pkg1, "1.oclIsKindOf(Boolean)");
        assertQueryTrue(pkg1, "1.oclIsKindOf(Real)");
        assertQueryTrue(pkg1, "1.oclIsKindOf(Integer)");
        assertQueryTrue(pkg1, "(-1).oclIsKindOf(Integer)");
        assertQueryTrue(OCL20A, pkg1, "1.oclIsKindOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "1.oclIsKindOf(String)");
        assertQueryTrue(OCL20A, pkg1, "1.oclIsKindOf(OclAny)");
        assertQueryFalse(pkg1, "1.oclIsKindOf(%Package)");
        assertQueryFalse(pkg1, "*.oclIsKindOf(OclInvalid)");
        assertQueryFalse(pkg1, "*.oclIsKindOf(OclVoid)");
        assertQueryFalse(pkg1, "*.oclIsKindOf(Boolean)");
        assertQueryTrue(pkg1, "*.oclIsKindOf(Real)");
        assertQueryTrue(pkg1, "*.oclIsKindOf(Integer)");
        assertQueryTrue(OCL20A, pkg1, "*.oclIsKindOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "*.oclIsKindOf(String)");
        assertQueryTrue(OCL20A, pkg1, "*.oclIsKindOf(OclAny)");
        assertQueryFalse(pkg1, "*.oclIsKindOf(%Package)");
        assertQueryFalse(pkg1, "'invalid'.oclIsKindOf(OclInvalid)");
        assertQueryFalse(pkg1, "'null'.oclIsKindOf(OclVoid)");
        assertQueryFalse(pkg1, "'true'.oclIsKindOf(Boolean)");
        assertQueryFalse(pkg1, "'3.14'.oclIsKindOf(Real)");
        assertQueryFalse(pkg1, "'1'.oclIsKindOf(Integer)");
        assertQueryFalse(pkg1, "'*'.oclIsKindOf(UnlimitedNatural)");
        assertQueryTrue(pkg1, "'string'.oclIsKindOf(String)");
        assertQueryTrue(OCL20A, pkg1, "'any'.oclIsKindOf(OclAny)");
        assertQueryFalse(pkg1, "'self'.oclIsKindOf(%Package)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(OclInvalid)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(OclVoid)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(Boolean)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(Real)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(Integer)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(String)");
        assertQueryTrue(OCL20A, pkg1, "self.oclIsKindOf(OclAny)");
        assertQueryTrue(pkg1, "self.oclIsKindOf(%Package)");
    }

	/**
     * Tests the oclIsTypeOf() operator.
     */
    public void test_oclIsTypeOf() {
        assertQueryTrue(pkg1, "invalid.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "invalid.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "invalid.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "invalid.oclIsTypeOf(%Package)");
        assertQueryFalse(pkg1, "null.oclIsTypeOf(OclInvalid)");
        assertQueryTrue(pkg1, "null.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "null.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "null.oclIsTypeOf(%Package)");
        assertQueryFalse(pkg1, "true.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "true.oclIsTypeOf(OclVoid)");
        assertQueryTrue(pkg1, "true.oclIsTypeOf(Boolean)");
        assertQueryFalse(pkg1, "true.oclIsTypeOf(String)");
        assertQueryFalse(pkg1, "true.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "true.oclIsTypeOf(%Package)");
        assertQueryFalse(pkg1, "3.14.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "3.14.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "3.14.oclIsTypeOf(Boolean)");
        assertQueryTrue(pkg1, "3.14.oclIsTypeOf(Real)");
        assertQueryFalse(pkg1, "3.14.oclIsTypeOf(Integer)");
        assertQueryFalse(pkg1, "3.14.oclIsTypeOf(String)");
        assertQueryFalse(pkg1, "3.14.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "3.14.oclIsTypeOf(%Package)");
        assertQueryFalse(pkg1, "1.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "1.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "1.oclIsTypeOf(Boolean)");
        assertQueryFalse(pkg1, "1.oclIsTypeOf(Real)");
        assertQueryFalse(OCL20A, pkg1, "1.oclIsTypeOf(Integer)");
        assertQueryTrue(pkg1, "(-1).oclIsTypeOf(Integer)");
        assertQueryTrue(OCL20A, pkg1, "1.oclIsTypeOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "1.oclIsTypeOf(String)");
        assertQueryFalse(pkg1, "1.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "1.oclIsTypeOf(%Package)");
        assertQueryFalse(pkg1, "*.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "*.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "*.oclIsTypeOf(Boolean)");
        assertQueryFalse(pkg1, "*.oclIsTypeOf(Real)");
        assertQueryFalse(OCL20A, pkg1, "*.oclIsTypeOf(Integer)");
        assertQueryTrue(OCL20A, pkg1, "*.oclIsTypeOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "*.oclIsTypeOf(String)");
        assertQueryFalse(pkg1, "*.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "*.oclIsTypeOf(%Package)");
        assertQueryFalse(pkg1, "'invalid'.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "'null'.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "'true'.oclIsTypeOf(Boolean)");
        assertQueryFalse(pkg1, "'3.14'.oclIsTypeOf(Real)");
        assertQueryFalse(pkg1, "'1'.oclIsTypeOf(Integer)");
        assertQueryFalse(pkg1, "'*'.oclIsTypeOf(UnlimitedNatural)");
        assertQueryTrue(pkg1, "'string'.oclIsTypeOf(String)");
        assertQueryFalse(pkg1, "'any'.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "'self'.oclIsTypeOf(%Package)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(Boolean)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(Real)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(Integer)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(String)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(OclAny)");
        assertQueryTrue(pkg1, "self.oclIsTypeOf(%Package)");
    }

    /**
     * Tests the oclIsUndefined() operator.
     */
    public void test_oclIsUndefined() {
        assertQueryTrue(pkg1, "invalid.oclIsUndefined()");
        assertQueryTrue(pkg1, "null.oclIsUndefined()");
        assertQueryFalse(pkg1, "true.oclIsUndefined()");
        assertQueryFalse(pkg1, "false.oclIsUndefined()");
        assertQueryFalse(pkg1, "3.14.oclIsUndefined()");
        assertQueryFalse(pkg1, "1.oclIsUndefined()");
        assertQueryFalse(pkg1, "*.oclIsUndefined()");
        assertQueryFalse(pkg1, "'null'.oclIsUndefined()");
        assertQueryFalse(pkg1, "self.oclIsUndefined()");
    }
}
