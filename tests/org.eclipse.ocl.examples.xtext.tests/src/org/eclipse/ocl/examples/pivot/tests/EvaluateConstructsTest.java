/**
 * <copyright>
 * 
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 */

package org.eclipse.ocl.examples.pivot.tests;

import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.osgi.util.NLS;

/**
 * Tests for Boolean operations.
 */
@SuppressWarnings("nls")
public class EvaluateConstructsTest extends PivotTestSuite
{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        helper.setContext(getMetaclass("String"));
    }

	public void testConstruct_if() {		
		assertQueryFalse(null, "if true then false else false endif");
		assertQueryEquals(null, 1, "if true then 1 else 2 endif");
		assertQueryEquals(null, 2, "if false then 1 else 2 endif");
		assertQueryEquals(null, 3.0, "if true then 3 else 4.0 endif");
		assertQueryEquals(null, 4.0, "if false then 3 else 4.0 endif");
		//
		assertQueryInvalid(null, "if null then 1 else 2 endif");
		assertQueryInvalid(null, "if invalid then 1 else 2 endif");
		//
		assertQueryEquals(null, 4.5, "if true then 4.5 else null endif");
		assertQueryEquals(null, "ok", "if false then null else 'ok' endif");
		assertQueryEquals(null, 4.5, "if true then 4.5 else invalid endif");
		assertQueryEquals(null, "ok", "if false then invalid else 'ok' endif");
		//
		assertQueryTrue(null, "if self.oclIsUndefined() then true else false endif");
		assertQueryInvalid(null, "if 4 then 4 else 4 endif", NLS.bind(EvaluatorMessages.TypedValueRequired, "Boolean", "UnlimitedNatural"), null);
		assertQueryEquals(null, 4, "if 4=4 then 4 else 4 endif");
	}
}
