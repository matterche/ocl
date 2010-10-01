/**
 * <copyright>
 * 
 * Copyright (c) 2009 E.D.Willink and others.
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
 * $Id: EvaluateCollectionOperationsTest.java,v 1.1.2.1 2010/10/01 15:33:23 ewillink Exp $
 */

package org.eclipse.ocl.examples.test.ecore;

import org.eclipse.ocl.examples.test.generic.GenericEvaluateCollectionOperationsTest;

/**
 * Tests for evaluate collection expressions.
 */
public class EvaluateCollectionOperationsTest extends GenericEvaluateCollectionOperationsTest {

	@Override
	public PivotTestReflection getStaticReflection() {
		return new PivotTestReflection(pivotManager);
	}
}
