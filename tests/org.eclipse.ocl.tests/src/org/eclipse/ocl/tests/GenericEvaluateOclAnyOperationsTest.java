/**
 * <copyright>
 * 
 * Copyright (c) 2009,2010 Eclipse Modeling Project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   L.Goubet, E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenericEvaluateOclAnyOperationsTest.java,v 1.1.2.4 2010/01/18 22:07:14 ewillink Exp $
 */

package org.eclipse.ocl.tests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.options.EvaluationOptions;

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

	public void testEqualInvalid() {
		/*
		 * FIXME we're expecting here results as specified in 2.0 : (11.2.4) any
		 * call on invalid results in invalid. Note that 2.1 didn't alter
		 * this statement but added in 11.2.5 an override of '=' so that it
		 * returns "true if object is invalid". Which should we respect in the
		 * implementation? respecting 11.2.4 is better as far as error handling
		 * is concerned ... but then we should probably respect 11.2.3 and have
		 * '=' fail on 'null'.
		 */
		assertQueryFalse(null, "invalid = 3");
		assertQueryFalse(null, "3 = invalid");
		assertQueryFalse(null, "invalid = 3.0");
		assertQueryFalse(null, "3.0 = invalid");

		assertQueryFalse(null, "invalid = 'test'");
		assertQueryFalse(null, "'test' = invalid");
		assertQueryFalse(null, "invalid = true");
		assertQueryFalse(null, "false = invalid");
		assertQueryFalse(null, "invalid = Sequence{}");
		assertQueryFalse(null, "Sequence{} = invalid");

		assertQueryTrue(null, "invalid = invalid");
	}

	public void testEqualNull() {
		assertQueryFalse(null, "null = 3");
		assertQueryFalse(null, "3 = null");
		assertQueryFalse(null, "null = 3.0");
		assertQueryFalse(null, "3.0 = null");

		assertQueryFalse(null, "null = 'test'");
		assertQueryFalse(null, "'test' = null");
		assertQueryFalse(null, "null = true");
		assertQueryFalse(null, "false = null");
		assertQueryFalse(null, "null = Sequence{}");
		assertQueryFalse(null, "Sequence{} = null");

		assertQueryTrue(null, "null = null");
	}

	public void testGreaterThanInvalid() {
		assertQueryInvalid(null, "invalid > 0");
		assertQueryInvalid(null, "0 > invalid");
		assertQueryInvalid(null, "invalid > invalid");
	}

	public void testGreaterThanNull() {
		assertQueryInvalid(null, "null > 0");
		assertQueryInvalid(null, "0 > null");
		assertQueryInvalid(null, "null > null");
	}

	public void testGreaterThanOrEqualInvalid() {
		assertQueryInvalid(null, "invalid >= 0");
		assertQueryInvalid(null, "0 >= invalid");
		assertQueryInvalid(null, "invalid >= invalid");
	}

	public void testGreaterThanOrEqualNull() {
		assertQueryInvalid(null, "null >= 0");
		assertQueryInvalid(null, "0 >= null");
		assertQueryInvalid(null, "null >= null");
	}

	public void testLessThanInvalid() {
		assertQueryInvalid(null, "invalid < 0");
		assertQueryInvalid(null, "0 < invalid");
		assertQueryInvalid(null, "invalid < invalid");
	}

	public void testLessThanNull() {
		// FIXME '=' is defined for null ... why not <? at least <= should be.
		assertQueryInvalid(null, "null < 0");
		assertQueryInvalid(null, "0 < null");
		assertQueryInvalid(null, "null < null");
	}

	public void testLessThanOrEqualInvalid() {
		assertQueryInvalid(null, "invalid <= 0");
		assertQueryInvalid(null, "0 <= invalid");
		assertQueryInvalid(null, "invalid <= invalid");
	}

	public void testLessThanOrEqualNull() {
		assertQueryInvalid(null, "null <= 0");
		assertQueryInvalid(null, "0 <= null");
		assertQueryInvalid(null, "null <= null");
	}

	public void testNotEqualInvalid() {
		/*
		 * FIXME we're expecting here results as specified in 2.0 : (11.2.4) any
		 * call on invalid results in invalid. Note that 2.1 didn't alter
		 * this statement but added in 11.2.5 an override of '=' so that it
		 * returns "true if object is invalid". Which should we respect in the
		 * implementation? respecting 11.2.4 is better as far as error handling
		 * is concerned ... but then we should probably respect 11.2.3 and have
		 * '=' fail on 'null'.
		 */
		assertQueryTrue(null, "invalid <> 3");
		assertQueryTrue(null, "3 <> invalid");
		assertQueryTrue(null, "invalid <> 3.0");
		assertQueryTrue(null, "3.0 <> invalid");

		assertQueryTrue(null, "invalid <> 'test'");
		assertQueryTrue(null, "'test' <> invalid");
		assertQueryTrue(null, "invalid <> true");
		assertQueryTrue(null, "false <> invalid");
		assertQueryTrue(null, "invalid <> Sequence{}");
		assertQueryTrue(null, "Sequence{} <> invalid");

		assertQueryFalse(null, "invalid <> invalid");
	}

	public void testNotEqualNull() {
		assertQueryTrue(null, "null <> 3");
		assertQueryTrue(null, "3 <> null");
		assertQueryTrue(null, "null <> 3.0");
		assertQueryTrue(null, "3.0 <> null");

		assertQueryTrue(null, "null <> 'test'");
		assertQueryTrue(null, "'test' <> null");
		assertQueryTrue(null, "null <> true");
		assertQueryTrue(null, "false <> null");
		assertQueryTrue(null, "null <> Sequence{}");
		assertQueryTrue(null, "Sequence{} <> null");

		assertQueryFalse(null, "null <> null");
	}

	public void testOclAsTypeInvalidLaxNullHandlingInvalid() {
		assertQueryInvalid(null, "invalid.oclAsType(String)");
		assertQueryInvalid(null, "invalid.oclAsType(EClass)");
		assertQueryInvalid(null, "invalid.oclAsType(OclVoid)");
		assertQueryInvalid(null, "invalid.oclAsType(OclInvalid)");
	}

/* FIXME	public void testOclAsTypeLaxNullHandlingNull() {
		/ *
		 * FIXME EvaluationOptions.LAX_NULL_HANDLING is on, its javadoc tells us
		 * "null" is the expected result whatever the given type. We should
		 * either fix the evaluation or the javadoc.
		 * /
		assertQueryNull(null, "null.oclAsType(String)");
		assertQueryNull(null, "null.oclAsType(Integer)");
		assertQueryNull(null, "null.oclAsType(EClass)");
		assertQueryNull(null, "null.oclAsType(OclVoid)");
		assertQueryNull(null, "null.oclAsType(OclInvalid)");
	} */

	public void testOclAsTypeNoLaxNullHandlingInvalid() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertQueryInvalid(null, "invalid.oclAsType(String)");
		assertQueryInvalid(null, "invalid.oclAsType(Integer)");
		assertQueryInvalid(null, "invalid.oclAsType(EClass)");
		assertQueryInvalid(null, "invalid.oclAsType(OclVoid)");
		assertQueryInvalid(null, "invalid.oclAsType(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	}

/* FIXME	public void testOclAsTypeNoLaxNullHandlingNull() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertQueryInvalid(null, "null.oclAsType(String)");
		assertQueryInvalid(null, "null.oclAsType(Integer)");
		assertQueryInvalid(null, "null.oclAsType(EClass)");
		assertQueryInvalid(null, "null.oclAsType(OclVoid)");
		assertQueryInvalid(null, "null.oclAsType(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	} */

	public void testOclIsInvalidInvalid() {
		assertQueryTrue(null, "invalid.oclIsInvalid()");
	}

	public void testOclIsInvalidNull() {
		assertQueryFalse(null, "null.oclIsInvalid()");
	}

/* FIXME	public void testOclIsKindOfInvalidLaxNullHandling() {
		/ *
		 * FIXME why is the evaluation of oclIsKindOf altered for invalid
		 * with LAX_NULL_HANDLING off? That is no documented behavior.
		 * /
		assertQueryInvalid(null, "invalid.oclIsKindOf(String)");
		assertQueryInvalid(null, "invalid.oclIsKindOf(EClass)");
		assertQueryInvalid(null, "invalid.oclIsKindOf(OclVoid)");
		assertQueryInvalid(null, "invalid.oclIsKindOf(OclInvalid)");
	} */

/* FIXME	public void testOclIsKindOfInvalidNoLaxHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertQueryInvalid(null, "invalid.oclIsKindOf(String)");
		assertQueryInvalid(null, "invalid.oclIsKindOf(Integer)");
		assertQueryInvalid(null, "invalid.oclIsKindOf(EClass)");
		assertQueryInvalid(null, "invalid.oclIsKindOf(OclVoid)");
		assertQueryInvalid(null, "invalid.oclIsKindOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	} */

	public void testOclIsKindOfNullLaxNullHandling() {
		/*
		 * FIXME EvaluationOptions.LAX_NULL_HANDLING is on, its javadoc tells us
		 * "true" is the expected result whatever the given type. We should
		 * either fix the evaluation or the javadoc.
		 */
		assertQueryTrue(null, "null.oclIsKindOf(String)");
		assertQueryTrue(null, "null.oclIsKindOf(Integer)");
		assertQueryTrue(null, "null.oclIsKindOf(EClass)");
		assertQueryTrue(null, "null.oclIsKindOf(OclVoid)");
		assertQueryFalse(null, "null.oclIsKindOf(OclInvalid)");
	}

/* FIXME	public void testOclIsKindOfNullNoLaxHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertQueryInvalid(null, "null.oclIsKindOf(String)");
		assertQueryInvalid(null, "null.oclIsKindOf(Integer)");
		assertQueryInvalid(null, "null.oclIsKindOf(EClass)");
		assertQueryInvalid(null, "null.oclIsKindOf(OclVoid)");
		assertQueryInvalid(null, "null.oclIsKindOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	} */

	public void testOclIsTypeOfInvalidLaxNullHandling() {
		/*
		 * FIXME why is the evaluation of oclIsTypeOf altered for invalid
		 * with LAX_NULL_HANDLING off? That is no documented behavior.
		 */
		assertQueryFalse(null, "invalid.oclIsTypeOf(String)");
		assertQueryFalse(null, "invalid.oclIsTypeOf(EClass)");
		assertQueryFalse(null, "invalid.oclIsTypeOf(OclVoid)");
		assertQueryTrue(null, "invalid.oclIsTypeOf(OclInvalid)");
	}

/* FIXME	public void testOclIsTypeOfInvalidNoLaxNullHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertQueryInvalid(null, "invalid.oclIsTypeOf(String)");
		assertQueryInvalid(null, "invalid.oclIsTypeOf(Integer)");
		assertQueryInvalid(null, "invalid.oclIsTypeOf(EClass)");
		assertQueryInvalid(null, "invalid.oclIsTypeOf(OclVoid)");
		assertQueryInvalid(null, "invalid.oclIsTypeOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	} */

	public void testOclIsTypeOfNullLaxNullHandling() {
		/*
		 * FIXME EvaluationOptions.LAX_NULL_HANDLING is on, its javadoc tells us
		 * "true" is the expected result whatever the given type. We should
		 * either fix the evaluation or the javadoc.
		 */
		assertQueryFalse(null, "null.oclIsTypeOf(String)");
		assertQueryFalse(null, "null.oclIsTypeOf(Integer)");
		assertQueryFalse(null, "null.oclIsTypeOf(EClass)");
		assertQueryTrue(null, "null.oclIsTypeOf(OclVoid)");
		assertQueryFalse(null, "null.oclIsTypeOf(OclInvalid)");
	}

/* FIXME	public void testOclIsTypeOfNullNoLaxNullHandling() {
		Boolean oldNullHandling = EvaluationOptions.getValue(ocl
			.getEvaluationEnvironment(), EvaluationOptions.LAX_NULL_HANDLING);
		// If this assert ever fails, LAX_NULL_HANDLING's default changed
		assertEquals(Boolean.TRUE, oldNullHandling);
		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.FALSE);

		assertQueryInvalid(null, "null.oclIsTypeOf(String)");
		assertQueryInvalid(null, "null.oclIsTypeOf(Integer)");
		assertQueryInvalid(null, "null.oclIsTypeOf(EClass)");
		assertQueryInvalid(null, "null.oclIsTypeOf(OclVoid)");
		assertQueryInvalid(null, "null.oclIsTypeOf(OclInvalid)");

		EvaluationOptions.setOption(ocl.getEvaluationEnvironment(),
			EvaluationOptions.LAX_NULL_HANDLING, Boolean.TRUE);
	} */

	public void testOclIsUndefinedInvalid() {
		assertQueryTrue(null, "invalid.oclIsUndefined()");
	}

	public void testOclIsUndefinedNull() {
		assertQueryTrue(null, "null.oclIsUndefined()");
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
