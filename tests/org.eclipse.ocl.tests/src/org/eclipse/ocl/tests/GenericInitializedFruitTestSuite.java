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
 *   Ed Willink - Bug 254919; Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenericFruitTestSuite.java,v 1.2 2010/04/25 06:50:19 ewillink Exp $
 */

package org.eclipse.ocl.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Generic extended test framework for tests using the Fruit meta-model.
 *
 * @author Christian W. Damus (cdamus)
 */
@SuppressWarnings("nls")
public abstract class GenericInitializedFruitTestSuite<E extends EObject, PK extends E, T extends E, C extends T, CLS extends C, DT extends C, PT extends C, ET extends DT, O extends E, PM extends E, P extends E, PA extends P, PR extends P, EL, S, COA, SSA, CT>
	extends GenericFruitTestSuite<E, PK, T, C, CLS, DT, PT, ET, O, PM, P, PA, PR, EL, S, COA, SSA, CT> {

	protected CLS fruit;

	@SuppressWarnings("unchecked")
	protected void initFruitPackage() {
		URI uri = getTestModelURI(reflection.getFruitModelPath());
		Resource res = resourceSet.getResource(uri, true);	
		fruitPackage = (PK) res.getContents().get(0);
		fruit = (CLS) reflection.getOwnedType(fruitPackage, "Fruit");
	}
}
