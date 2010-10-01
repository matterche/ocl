/**
 * <copyright>
 * 
 * Copyright (c) 2006, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   E.D.Willink - Bug 296409
 *
 * </copyright>
 *
 * $Id: IteratorsTest.java,v 1.1.2.1 2010/10/01 15:33:23 ewillink Exp $
 */

package org.eclipse.ocl.examples.test.ecore;

import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.test.generic.GenericIteratorsTest;

/**
 * Tests for iterator expressions.
 * 
 * @author Christian W. Damus (cdamus)
 */
@SuppressWarnings("nls")
public class IteratorsTest extends GenericIteratorsTest
 {

	@Override
	public PivotTestReflection getStaticReflection() {
		return new PivotTestReflection(pivotManager);
	}
    
    /**
     * Test to check the validation of the <tt>sortedBy</tt> iterator, that
     * the body expression type has a <tt>&lt;</tt> operation.
     */
	@Override
	public void test_sortedByRequiresComparability_192729() {
    	super.test_sortedByRequiresComparability_192729();
    	Type context = getMetaclass("Package");
        
        // EDate defines '<' by having a Comparable instance class
        assertQuery(context, "let dates : Sequence(Date) = Sequence{} in dates->sortedBy(e | e)");
    }
}
