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
 * $Id: GenericDebugTest.java,v 1.1.2.1 2010/01/24 15:22:28 ewillink Exp $
 */

package org.eclipse.ocl.tests;

import org.eclipse.emf.ecore.EObject;

/**
 * The JUnit4 GUI does not support re-running individual tests in isolation.
 * 
 * This dummy test is therefore a debugging placeHolder for re-use while debugging.
 */
public abstract class GenericDebugTest<E extends EObject, PK extends E, T extends E, C extends T, CLS extends C, DT extends C, PT extends C, ET extends DT, O extends E, PM extends E, P extends E, PA extends P, PR extends P, EL, S, COA, SSA, CT>
	extends GenericTestSuite<E, PK, T, C, CLS, DT, PT, ET, O, PM, P, PA, PR, EL, S, COA, SSA, CT> {
}
