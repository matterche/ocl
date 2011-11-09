/**
 * <copyright>
 * 
 * Copyright (c) 2011 E.D.Willink and others.
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
 * $Id$
 */

package org.eclipse.ocl.examples.pivot.tests;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;

/**
 * Tests for OclAny operations.
 */
@SuppressWarnings("nls")
public class EvaluateModelOperationsTest extends PivotTestSuite
{
    @Override
    protected void setUp() {
        super.setUp();
        OCLinEcoreStandaloneSetup.doSetup();
    }

	/**
	 * Test that Ecore Data Types can be used. Inspired by Bug 358713.
	 */
	public void test_ecoreDataTypes() throws IOException {
		MetaModelManager metaModelManager = new MetaModelManager();
		String metaModelText =
			"import ecore : 'http://www.eclipse.org/emf/2002/Ecore#/';\n" +
			"package pkg : pkg = 'pkg' {\n" +
			"  class A {\n" +
			"    property anEBigDecimal : ecore::EBigDecimal;\n" +
			"    property anEBigInteger : ecore::EBigInteger;\n" +
			"    property anEBoolean : ecore::EBoolean;\n" +
			"    property anEBooleanObject : ecore::EBooleanObject;\n" +
			"    property anEByte : ecore::EByte;\n" +
			"    property anEByteObject : ecore::EByteObject;\n" +
			"    property anEChar : ecore::EChar;\n" +
			"    property anECharacterObject : ecore::ECharacterObject;\n" +
			"    property anEDouble : ecore::EDouble;\n" +
			"    property anEDoubleObject : ecore::EDoubleObject;\n" +
			"    property anEFloat : ecore::EFloat;\n" +
			"    property anEFloatObject : ecore::EFloatObject;\n" +
			"    property anEInt : ecore::EInt;\n" +
			"    property anEIntegerObject : ecore::EIntegerObject;\n" +
			"    property anELong : ecore::ELong;\n" +
			"    property anELongObject : ecore::ELongObject;\n" +
			"    property anEShort : ecore::EShort;\n" +
			"    property anEShortObject : ecore::EShortObject;\n" +
			"    property anEString : ecore::EString;\n" +
			"  }\n" +
			"}\n";
		Resource metaModel = PivotTestUtils.getEcoreFromCS(metaModelManager, metaModelText, null);
		EPackage ePackage = (EPackage) metaModel.getContents().get(0);
		EClass eClass = (EClass) ePackage.getEClassifiers().get(0);
        helper.setContext((Type) metaModelManager.getType(eClass));
        EObject eObject = ePackage.getEFactoryInstance().create(eClass);
        //
        eObject.eSet(eClass.getEStructuralFeature("anEBigDecimal"), BigDecimal.valueOf(0));
		assertQueryEquals(eObject, 0, "anEBigDecimal");
		assertQueryEquals(eObject, 1, "anEBigDecimal + 1");
		assertQueryEquals(eObject, 0, "self.anEBigDecimal");
		assertQueryEquals(eObject, 1, "self.anEBigDecimal + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEBigInteger"), BigInteger.valueOf(0));
		assertQueryEquals(eObject, 0, "anEBigInteger");
		assertQueryEquals(eObject, 1, "anEBigInteger + 1");
		assertQueryEquals(eObject, 0, "self.anEBigInteger");
		assertQueryEquals(eObject, 1, "self.anEBigInteger + 1");
        //
		assertQueryEquals(eObject, false, "anEBoolean");
		assertQueryEquals(eObject, true, "anEBoolean or true");
		assertQueryEquals(eObject, false, "self.anEBoolean");
		assertQueryEquals(eObject, true, "self.anEBoolean or true");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEBooleanObject"), false);
		assertQueryEquals(eObject, false, "anEBooleanObject");
		assertQueryEquals(eObject, true, "anEBooleanObject or true");
		assertQueryEquals(eObject, false, "self.anEBooleanObject");
		assertQueryEquals(eObject, true, "self.anEBooleanObject or true");
        //
		assertQueryEquals(eObject, 0, "anEByte");
		assertQueryEquals(eObject, 1, "anEByte + 1");
		assertQueryEquals(eObject, 0, "self.anEByte");
		assertQueryEquals(eObject, 1, "self.anEByte + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEByteObject"), (byte)0);
		assertQueryEquals(eObject, 0, "anEByteObject");
		assertQueryEquals(eObject, 1, "anEByteObject + 1");
		assertQueryEquals(eObject, 0, "self.anEByteObject");
		assertQueryEquals(eObject, 1, "self.anEByteObject + 1");
        //
		assertQueryEquals(eObject, 0, "anEChar");
		assertQueryEquals(eObject, 1, "anEChar + 1");
		assertQueryEquals(eObject, 0, "self.anEChar");
		assertQueryEquals(eObject, 1, "self.anEChar + 1");
        //
	    eObject.eSet(eClass.getEStructuralFeature("anECharacterObject"), (char)0);
		assertQueryEquals(eObject, 0, "anECharacterObject");
		assertQueryEquals(eObject, 1, "anECharacterObject + 1");
		assertQueryEquals(eObject, 0, "self.anECharacterObject");
		assertQueryEquals(eObject, 1, "self.anECharacterObject + 1");
        //
		assertQueryEquals(eObject, 0, "anEDouble");
		assertQueryEquals(eObject, 1, "anEDouble + 1");
		assertQueryEquals(eObject, 0, "self.anEDouble");
		assertQueryEquals(eObject, 1, "self.anEDouble + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEDoubleObject"), (double)0);
		assertQueryEquals(eObject, 0, "anEDoubleObject");
		assertQueryEquals(eObject, 1, "anEDoubleObject + 1");
		assertQueryEquals(eObject, 0, "self.anEDoubleObject");
		assertQueryEquals(eObject, 1, "self.anEDoubleObject + 1");
        //
		assertQueryEquals(eObject, 0, "anEFloat");
		assertQueryEquals(eObject, 1, "anEFloat + 1");
		assertQueryEquals(eObject, 0, "self.anEFloat");
		assertQueryEquals(eObject, 1, "self.anEFloat + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEFloatObject"), (float)0);
		assertQueryEquals(eObject, 0, "anEFloatObject");
		assertQueryEquals(eObject, 1, "anEFloatObject + 1");
		assertQueryEquals(eObject, 0, "self.anEFloatObject");
		assertQueryEquals(eObject, 1, "self.anEFloatObject + 1");
        //
		assertQueryEquals(eObject, 0, "anEInt");
		assertQueryEquals(eObject, 1, "anEInt + 1");
		assertQueryEquals(eObject, 0, "self.anEInt");
		assertQueryEquals(eObject, 1, "self.anEInt + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEIntegerObject"), 0);
		assertQueryEquals(eObject, 0, "anEIntegerObject");
		assertQueryEquals(eObject, 1, "anEIntegerObject + 1");
		assertQueryEquals(eObject, 0, "self.anEIntegerObject");
		assertQueryEquals(eObject, 1, "self.anEIntegerObject + 1");
        //
		assertQueryEquals(eObject, 0, "anELong");
		assertQueryEquals(eObject, 1, "anELong + 1");
		assertQueryEquals(eObject, 0, "self.anELong");
		assertQueryEquals(eObject, 1, "self.anELong + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anELongObject"), (long)0);
		assertQueryEquals(eObject, 0, "anELongObject");
		assertQueryEquals(eObject, 1, "anELongObject + 1");
		assertQueryEquals(eObject, 0, "self.anELongObject");
		assertQueryEquals(eObject, 1, "self.anELongObject + 1");
        //
		assertQueryEquals(eObject, 0, "anEShort");
		assertQueryEquals(eObject, 1, "anEShort + 1");
		assertQueryEquals(eObject, 0, "self.anEShort");
		assertQueryEquals(eObject, 1, "self.anEShort + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEShortObject"), (short)0);
		assertQueryEquals(eObject, 0, "anEShortObject");
		assertQueryEquals(eObject, 1, "anEShortObject + 1");
		assertQueryEquals(eObject, 0, "self.anEShortObject");
		assertQueryEquals(eObject, 1, "self.anEShortObject + 1");
        //
        eObject.eSet(eClass.getEStructuralFeature("anEString"), "");
		assertQueryEquals(eObject, "", "anEString");
		assertQueryEquals(eObject, "1", "anEString + '1'");
		assertQueryEquals(eObject, "", "self.anEString");
		assertQueryEquals(eObject, "1", "self.anEString + '1'");
        //
		metaModelManager.dispose();
	}
}
