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
 * $Id: GenericEvaluateOperationsTest.java,v 1.1.2.1 2009/12/14 22:02:06 ewillink Exp $
 */

package org.eclipse.ocl.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.SemanticException;
import org.eclipse.ocl.SyntaxException;
import org.eclipse.ocl.internal.l10n.OCLMessages;

/**
 * Tests for iterator expressions.
 * 
 * @author Christian W. Damus (cdamus)
 */
@SuppressWarnings("nls")
public abstract class GenericEvaluateOperationsTest<E extends EObject, PK extends E, T extends E, C extends T, CLS extends C, DT extends C, PT extends C, ET extends DT, O extends E, PM extends E, P extends E, PA extends P, PR extends P, EL, S, COA, SSA, CT>
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
        pkg2 = reflection.createNestedPackage(pkg1, "pkg2");
        jim = reflection.createNestedPackage(pkg2, "jim");
        bob = reflection.createNestedPackage(pkg1, "bob");
        pkg3 = reflection.createNestedPackage(pkg1, "pkg3");
        pkg4 = reflection.createNestedPackage(pkg3, "pkg4");
        pkg5 = reflection.createNestedPackage(pkg3, "pkg5");
        george = reflection.createNestedPackage(pkg5, "george");
        helper.setContext(getMetaclass(denormalize("%Package")));
    }

    /**
     * Tests the generic iterate() iterator.
     */
    public void test_oclIsInvalid() {
        assertQueryTrue(pkg1, "invalid.oclIsInvalid()");
        assertQueryFalse(pkg1, "null.oclIsInvalid()");
        assertQueryFalse(pkg1, "true.oclIsInvalid()");
        assertQueryFalse(pkg1, "'invalid'.oclIsInvalid()");
        assertQueryFalse(pkg1, "self.oclIsInvalid()");
    }
}
