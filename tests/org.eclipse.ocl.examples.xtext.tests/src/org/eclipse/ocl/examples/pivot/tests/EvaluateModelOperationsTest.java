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
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.domain.values.Value;
import org.eclipse.ocl.examples.pivot.CollectionType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;

/**
 * Tests for OclAny operations.
 */
@SuppressWarnings("nls")
public class EvaluateModelOperationsTest extends PivotTestSuite
{
	@SuppressWarnings("unchecked")
	public void eAdd(EObject eObject, String featureName, Object value) {
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		assert eStructuralFeature.isMany();
		if (eStructuralFeature instanceof EReference) {
			assert value instanceof EObject;
		}
		else {
			assert !(value instanceof EObject);
		}
		((List<Object>)eObject.eGet(eStructuralFeature)).add(value);
	}

	public EObject eCreate(EClass cClass) {
		return cClass.getEPackage().getEFactoryInstance().create(cClass);
	}

	public void eSet(EObject eObject, String featureName, Object value) {
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(featureName);
		assert !eStructuralFeature.isMany();
		if (eStructuralFeature instanceof EReference) {
			assert value instanceof EObject;
		}
		else {
			assert !(value instanceof EObject);
		}
		eObject.eSet(eStructuralFeature, value);
	}

	@Override
    protected void setUp() throws Exception {
        super.setUp();
        OCLinEcoreStandaloneSetup.doSetup();
    }

	/**
	 * Test that Ecore Data Types can be used. Inspired by Bug 358713.
	 */
	public void test_ecoreDataTypes() throws IOException {
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
		Resource metaModel = getEcoreFromCS(metaModelManager, metaModelText, null);
		EPackage ePackage = (EPackage) metaModel.getContents().get(0);
		EClass eClass = (EClass) ePackage.getEClassifiers().get(0);
        helper.setContext((Type) metaModelManager.getType(eClass));
        EObject eObject = eCreate(eClass);
        //
        eSet(eObject, "anEBigDecimal", BigDecimal.valueOf(0));
		assertQueryEquals(eObject, 0, "anEBigDecimal");
		assertQueryEquals(eObject, 1, "anEBigDecimal + 1");
		assertQueryEquals(eObject, 0, "self.anEBigDecimal");
		assertQueryEquals(eObject, 1, "self.anEBigDecimal + 1");
        //
        eSet(eObject, "anEBigInteger", BigInteger.valueOf(0));
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
        eSet(eObject, "anEBooleanObject", false);
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
        eSet(eObject, "anEByteObject", (byte)0);
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
	    eSet(eObject, "anECharacterObject", (char)0);
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
        eSet(eObject, "anEDoubleObject", (double)0);
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
        eSet(eObject, "anEFloatObject", (float)0);
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
        eSet(eObject, "anEIntegerObject", 0);
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
        eSet(eObject, "anELongObject", (long)0);
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
        eSet(eObject, "anEShortObject", (short)0);
		assertQueryEquals(eObject, 0, "anEShortObject");
		assertQueryEquals(eObject, 1, "anEShortObject + 1");
		assertQueryEquals(eObject, 0, "self.anEShortObject");
		assertQueryEquals(eObject, 1, "self.anEShortObject + 1");
        //
        eSet(eObject, "anEString", "");
		assertQueryEquals(eObject, "", "anEString");
		assertQueryEquals(eObject, "1", "anEString + '1'");
		assertQueryEquals(eObject, "", "self.anEString");
		assertQueryEquals(eObject, "1", "self.anEString + '1'");
	}

	/**
	 * Test implicit collect and oclAsSet() therein. Inspired by Bug 351512.
	 */
	public void test_oclAsSet_351512() throws IOException {
		String metaModelText =
			"import ecore : 'http://www.eclipse.org/emf/2002/Ecore#/';\n" +
			"package pkg : pkg = 'pkg' {\n" +
			"  class A {\n" +
			"    property bs : B[*] {ordered,unique};\n" +
			"    attribute name : String;\n" +
			"  }\n" +
			"  class B {\n" +
			"    property c : C;\n" +
			"  }\n" +
			"  class C {\n" +
			"    attribute name : String;\n" +
			"  }\n" +
			"}\n";
		Resource metaModel = getEcoreFromCS(metaModelManager, metaModelText, null);
		EPackage ePackage = (EPackage) metaModel.getContents().get(0);
		EClass aClass = (EClass) ePackage.getEClassifier("A");
		EClass bClass = (EClass) ePackage.getEClassifier("B");
		EClass cClass = (EClass) ePackage.getEClassifier("C");
        EObject c1 = eCreate(cClass);
        eSet(c1, "name", "c1");
        EObject c2 = eCreate(cClass);
        eSet(c2, "name", "c2");
        EObject b1 = eCreate(bClass);
        eSet(b1, "c", c1);
        EObject b2 = eCreate(bClass);
        eSet(b2, "c", c2);
        EObject a = eCreate(aClass);
        eAdd(a, "bs", b1);
        eAdd(a, "bs", b2);

        Type aType = (Type) metaModelManager.getType(aClass);
        Type bType = (Type) metaModelManager.getType(bClass);
        Type cType = (Type) metaModelManager.getType(cClass);
		CollectionType orderedSet_B_type = metaModelManager.getOrderedSetType(bType);
		CollectionType sequence_C_type = metaModelManager.getSequenceType(cType);
		CollectionType bag_C_type = metaModelManager.getBagType(cType);
        //
		Value b1_value = valueFactory.valueOf(b1);
		Value b2_value = valueFactory.valueOf(b2);
		Value c1_value = valueFactory.valueOf(c1);
		Value c2_value = valueFactory.valueOf(c2);
		Value orderedSet_b1_b2 = valueFactory.createOrderedSetValue(orderedSet_B_type, b1_value, b2_value);
		Value sequence_c1_c2 = valueFactory.createSequenceValue(sequence_C_type, c1_value, c2_value);
		Value bag_c1_c2 = valueFactory.createBagValue(bag_C_type, c1_value, c2_value);
		//
		helper.setContext(aType);
		//
		assertQueryEquals(a, orderedSet_b1_b2, "bs");
		assertQueryEquals(a, sequence_c1_c2, "bs.c");
		assertQueryEquals(a, bag_c1_c2, "bs.c.oclAsSet()");
		assertQueryResults(a, "Sequence{'c1','c2'}", "bs.c.name");
		assertQueryResults(a, "Sequence{'c1','c2'}", "self.bs.c.name");
        assertQueryResults(a, "Bag{'c1','c2'}", "bs.c.oclAsSet().name");
        assertQueryResults(a, "Bag{'c1','c2'}", "bs.c.oclAsSet()->collect(name)");	// Test for Bug 351512
        assertQueryResults(a, "Bag{'c1','c2'}", "bs.c->collect(oclAsSet()).name");
        assertQueryResults(a, "Bag{'c1','c2'}", "bs.c->collect(j : C | j.oclAsSet()).name");
        assertQueryResults(a, "Bag{'c1','c2'}", "bs->collect(i : B | i.c)->collect(j : C | j.oclAsSet())->collect(k : C | k.name)");
	}
}
