/**
 * <copyright>
 *
 * Copyright (c) 2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: UtilitiesTest.java,v 1.3 2009/11/28 18:17:16 ewillink Exp $
 */

package org.eclipse.ocl.uml.tests;

import org.eclipse.ocl.uml.util.OCLUMLUtil;


/**
 * Tests the {@link OCLUMLUtil} class.
 *
 * @author Christian W. Damus (cdamus)
 */
@SuppressWarnings("nls")
public class UtilitiesTest extends AbstractTestSuite {

    /**
     * Tests the <code>getMetaclass(Element)</code> method.
     */
    public void test_getMetaclass() {
        // no resource set ==> no metaclass
        assertNull(OCLUMLUtil.getMetaclass(umlf.createActivity()));
        
        assertSame(getMetametaclass("Class"),
            OCLUMLUtil.getMetaclass(fruit));
        assertSame(getMetametaclass("AssociationClass"),
            OCLUMLUtil.getMetaclass(stem));
        assertSame(getMetametaclass("Property"),
            OCLUMLUtil.getMetaclass(apple_label));
        assertSame(getMetametaclass("Operation"),
            OCLUMLUtil.getMetaclass(fruit_preferredColor));
        assertSame(getMetametaclass("EnumerationLiteral"),
            OCLUMLUtil.getMetaclass(color_black));
        assertSame(getMetametaclass("Package"),
            OCLUMLUtil.getMetaclass(fruitPackage));
    }
}
