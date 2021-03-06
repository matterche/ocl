/**
 * <copyright>
 * 
 * Copyright (c) 2009,2011 E.D.Willink and others.
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
 * $Id: EvaluateOclAnyOperationsTest.java,v 1.13 2011/05/20 15:27:16 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.tests;

import java.util.Collections;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.examples.pivot.AnyType;
import org.eclipse.ocl.examples.pivot.ClassifierType;
import org.eclipse.ocl.examples.pivot.InvalidType;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.PrimitiveType;
import org.eclipse.ocl.examples.pivot.TupleType;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.VoidType;
import org.eclipse.ocl.examples.pivot.manager.TupleTypeManager;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;

/**
 * Tests for OclAny operations.
 */
@SuppressWarnings("nls")
public class EvaluateOclAnyOperationsTest extends PivotSimpleTestSuite
{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        helper.setContext(getMetaclass("OclAny"));
    }

    public void testEqual() {
		assertQueryTrue(null, "Boolean = Boolean");
		assertQueryFalse(null, "Boolean = Integer");
		assertQueryTrue(null, "OclVoid = OclVoid");
		assertQueryTrue(null, "OclInvalid = OclInvalid");
		assertQueryFalse(null, "OclInvalid = OclVoid");
		assertQueryTrue(null, "Set(String) = Set(String)");
		assertQueryFalse(null, "Set(String) = Set(Integer)");
		assertQueryFalse(null, "Set(String) = Sequence(String)");
		//
		assertQueryTrue(null, "ocl::CollectionKind::_'Collection' = ocl::CollectionKind::_'Collection'");
		assertQueryFalse(null, "ocl::CollectionKind::_'Collection' = ocl::CollectionKind::_'Set'");
    	//
		loadEPackage("ecore", EcorePackage.eINSTANCE);
    	assertQueryFalse(null, "ecore::EDate{'2000-01-25'} = ecore::EDate{'2000-01-24'}");
        assertQueryTrue(null, "ecore::EDate{'2000-01-24'} = ecore::EDate{'2000-01-24'}");
        assertQueryFalse(null, "ecore::EDate{'2000-01-23'} = ecore::EDate{'2000-01-24'}");
        //
	    // invalid
        //
		assertQueryInvalid(null, "invalid = 3");
		assertQueryInvalid(null, "3 = invalid");
		assertQueryInvalid(null, "invalid = 3.0");
		assertQueryInvalid(null, "3.0 = invalid");

		assertQueryInvalid(null, "invalid = 'test'");
		assertQueryInvalid(null, "'test' = invalid");
		assertQueryInvalid(null, "invalid = true");
		assertQueryInvalid(null, "false = invalid");
		assertQueryInvalid(null, "invalid = Sequence{}");
		assertQueryInvalid(null, "Sequence{} = invalid");

		assertQueryInvalid(null, "invalid = invalid");
		//
		// null
		//
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
    
    public void testGreaterThan() {
    	loadEPackage("ecore", EcorePackage.eINSTANCE);
        assertQueryTrue(null, "ecore::EDate{'2000-01-25'} > ecore::EDate{'2000-01-24'}");
        assertQueryFalse(null, "ecore::EDate{'2000-01-24'} > ecore::EDate{'2000-01-24'}");
        assertQueryFalse(null, "ecore::EDate{'2000-01-23'} > ecore::EDate{'2000-01-24'}");
        //
	    // invalid
        //
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "invalid > 0");
//		assertSemanticErrorQuery("0 > invalid", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.GREATER_THAN_OPERATOR);
		assertQueryInvalid(null, "0 > invalid");
		assertSemanticErrorQuery("invalid > invalid", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.GREATER_THAN_OPERATOR, metaModelManager.getOclInvalidType(), metaModelManager.getOclInvalidType());
		//
		// null
		//
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "null > 0");
//		assertSemanticErrorQuery("0 > null", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.GREATER_THAN_OPERATOR);
		assertQueryInvalid(null, "0 > null");
		assertSemanticErrorQuery("null > null", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.GREATER_THAN_OPERATOR, metaModelManager.getOclVoidType(), metaModelManager.getOclVoidType());
	}
    
    public void testGreaterThanOrEqual() {
    	loadEPackage("ecore", EcorePackage.eINSTANCE);
        assertQueryTrue(null, "ecore::EDate{'2000-01-25'} >= ecore::EDate{'2000-01-24'}");
        assertQueryTrue(null, "ecore::EDate{'2000-01-24'} >= ecore::EDate{'2000-01-24'}");
        assertQueryFalse(null, "ecore::EDate{'2000-01-23'} >= ecore::EDate{'2000-01-24'}");
        //
	    // invalid
        //
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "invalid >= 0");
//		assertSemanticErrorQuery("0 >= invalid", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.GREATER_THAN_OR_EQUAL_OPERATOR);
		assertQueryInvalid(null, "0 >= invalid");
		assertSemanticErrorQuery("invalid >= invalid", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.GREATER_THAN_OR_EQUAL_OPERATOR, metaModelManager.getOclInvalidType(), metaModelManager.getOclInvalidType());
		//
		// null
		//
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "null >= 0");
//		assertSemanticErrorQuery("0 >= null", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.GREATER_THAN_OR_EQUAL_OPERATOR);
		assertQueryInvalid(null, "0 >= null");
		assertSemanticErrorQuery("null >= null", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.GREATER_THAN_OR_EQUAL_OPERATOR, metaModelManager.getOclVoidType(), metaModelManager.getOclVoidType());
	}
    
    public void testLessThan() {
    	loadEPackage("ecore", EcorePackage.eINSTANCE);
    	assertQueryFalse(null, "ecore::EDate{'2000-01-25'} < ecore::EDate{'2000-01-24'}");
    	assertQueryFalse(null, "ecore::EDate{'2000-01-24'} < ecore::EDate{'2000-01-24'}");
        assertQueryTrue(null, "ecore::EDate{'2000-01-23'} < ecore::EDate{'2000-01-24'}");
        //
	    // invalid
        //
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "invalid < 0");
//		assertSemanticErrorQuery("0 < invalid", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.LESS_THAN_OPERATOR);
		assertQueryInvalid(null, "0 < invalid");
		assertSemanticErrorQuery("invalid < invalid", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.LESS_THAN_OPERATOR, metaModelManager.getOclInvalidType(), metaModelManager.getOclInvalidType());
		//
		// null
		//
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "null < 0");
//		assertSemanticErrorQuery("0 < null", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.LESS_THAN_OPERATOR);
		assertQueryInvalid(null, "0 < null");
		assertSemanticErrorQuery("null < null", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.LESS_THAN_OPERATOR, metaModelManager.getOclVoidType(), metaModelManager.getOclVoidType());
	}
    
    public void testLessThanOrEqual() {
    	loadEPackage("ecore", EcorePackage.eINSTANCE);
    	assertQueryFalse(null, "ecore::EDate{'2000-01-25'} <= ecore::EDate{'2000-01-24'}");
        assertQueryTrue(null, "ecore::EDate{'2000-01-24'} <= ecore::EDate{'2000-01-24'}");
        assertQueryTrue(null, "ecore::EDate{'2000-01-23'} <= ecore::EDate{'2000-01-24'}");
        //
	    // invalid
        //
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "invalid <= 0");
//		assertSemanticErrorQuery("0 <= invalid", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.LESS_THAN_OR_EQUAL_OPERATOR);
		assertQueryInvalid(null, "0 <= invalid");
		assertSemanticErrorQuery("invalid <= invalid", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.LESS_THAN_OR_EQUAL_OPERATOR, metaModelManager.getOclInvalidType(), metaModelManager.getOclInvalidType());
		//
		// null
		//
		// FIXME Analyzer-extraOperation OclAny::< should not be defined
		assertQueryInvalid(null, "null <= 0");
//		assertSemanticErrorQuery("0 <= null", OCLMessages.OperationCallNotFound_ERROR_, PivotConstants.LESS_THAN_OR_EQUAL_OPERATOR);
		assertQueryInvalid(null, "0 <= null");
		assertSemanticErrorQuery("null <= null", OCLMessages.UnresolvedOperationCall_ERROR_, PivotConstants.LESS_THAN_OR_EQUAL_OPERATOR, metaModelManager.getOclVoidType(), metaModelManager.getOclVoidType());
	}

	public void testNotEqual() {
		assertQueryFalse(null, "Boolean <> Boolean");
		assertQueryTrue(null, "Boolean <> Integer");
		assertQueryFalse(null, "OclVoid <> OclVoid");
		assertQueryFalse(null, "OclInvalid <> OclInvalid");
		assertQueryTrue(null, "OclInvalid <> OclVoid");
		assertQueryFalse(null, "Set(String) <> Set(String)");
		assertQueryTrue(null, "Set(String) <> Set(Integer)");
		assertQueryTrue(null, "Set(String) <> Sequence(String)");
		//
		assertQueryFalse(null, "ocl::CollectionKind::_'Collection' <> ocl::CollectionKind::_'Collection'");
		assertQueryTrue(null, "ocl::CollectionKind::_'Collection' <> ocl::CollectionKind::_'Set'");
		//
		loadEPackage("ecore", EcorePackage.eINSTANCE);
    	assertQueryTrue(null, "ecore::EDate{'2000-01-25'} <> ecore::EDate{'2000-01-24'}");
    	assertQueryFalse(null, "ecore::EDate{'2000-01-24'} <> ecore::EDate{'2000-01-24'}");
    	assertQueryTrue(null, "ecore::EDate{'2000-01-23'} <> ecore::EDate{'2000-01-24'}");
        //
	    // invalid
        //
        assertQueryInvalid(null, "invalid <> 3");
		assertQueryInvalid(null, "3 <> invalid");
		assertQueryInvalid(null, "invalid <> 3.0");
		assertQueryInvalid(null, "3.0 <> invalid");

		assertQueryInvalid(null, "invalid <> 'test'");
		assertQueryInvalid(null, "'test' <> invalid");
		assertQueryInvalid(null, "invalid <> true");
		assertQueryInvalid(null, "false <> invalid");
		assertQueryInvalid(null, "invalid <> Sequence{}");
		assertQueryInvalid(null, "Sequence{} <> invalid");

		assertQueryInvalid(null, "invalid <> invalid");
		//
		// null
		//
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
	
    /**
     * Tests the explicit oclAsSet() operator.
     */
	public void test_oclAsSet_explicit() {
		assertQueryResults(null, "Set{true}", "true.oclAsSet()");
		assertQueryResults(null, "Set{}", "null.oclAsSet()");
		assertQueryInvalid(null, "invalid.oclAsSet()");
		assertQueryResults(null, "Set{Set{1..4}}", "Set{1..4}->oclAsSet()");
	}
	
    /**
     * Tests the implicit oclAsSet() operator.
     */
	public void test_oclAsSet_implicit() {
		assertQueryResults(null, "Set{true}", "true->select(true)");
		assertQueryResults(null, "Set{true}", "Set{true}->select(true)");
		assertQueryResults(null, "Set{}", "null->select(true)");
		assertQueryResults(null, "Set{}", "Set{}->select(true)");
		assertQueryResults(null, "Set{null}", "Set{null}->select(true)");
		assertQueryInvalid(null, "invalid->select(true)");
		//
		assertQueryResults(null, "false", "true.oclIsUndefined()");
		assertQueryResults(null, "false", "true->oclIsUndefined()");	// Set{true}
		assertQueryResults(null, "true", "null.oclIsUndefined()");
		assertQueryResults(null, "false", "null->oclIsUndefined()");	// Set{}
		assertQueryResults(null, "true", "invalid.oclIsUndefined()");
		assertQueryResults(null, "true", "invalid->oclIsUndefined()");	// invalid
		//
		assertQueryEquals(null, 4, "'1234'.size()");
		assertQueryEquals(null, 1, "'1234'->size()");
		//
		PrimitiveType booleanType = metaModelManager.getBooleanType();
		assertQueryEquals(null, booleanType, "true.oclType()");
		Type collectionType = getCollectionType("Set", booleanType);
		assertQueryEquals(null, collectionType, "true->oclType()");		// Set{true}
	}
	
    /**
     * Tests the oclAsType() operator.
     */
	public void test_oclAsType() {
		assertQueryInvalid(null, "invalid.oclAsType(String)");
		assertQueryInvalid(null, "invalid.oclAsType(Integer)");
		assertQueryInvalid(null, "invalid.oclAsType(AnyClassifier)");
		assertQueryInvalid(null, "invalid.oclAsType(OclVoid)");
		assertQueryInvalid(null, "invalid.oclAsType(OclInvalid)");
		assertQueryInvalid(null, "invalid.oclAsType(AnyClassifier)");
		assertQueryInvalid(null, "invalid.oclAsType(Set(String))");
		assertQueryInvalid(null, "invalid.oclAsType(Tuple(a:String))");
		assertQueryInvalid(null, "invalid.oclAsType(ocl::Package)");
		//
		assertQueryNull(null, "null.oclAsType(String)");
		assertQueryNull(null, "null.oclAsType(Integer)");
		assertQueryNull(null, "null.oclAsType(AnyClassifier)");
		assertQueryNull(null, "null.oclAsType(OclVoid)");
		assertQueryInvalid(null, "null.oclAsType(OclInvalid)");
		assertQueryNull(null, "null.oclAsType(AnyClassifier)");
		assertQueryNull(null, "null.oclAsType(Set(String))");
		assertQueryNull(null, "null.oclAsType(Tuple(a:String))");
		assertQueryNull(null, "null.oclAsType(ocl::Package)");
		//
		assertQueryInvalid(null, "true.oclAsType(Integer)");
		assertQueryInvalid(null, "true.oclAsType(String)");
		assertQueryTrue(null, "true.oclAsType(Boolean)");
		assertQueryTrue(null, "true.oclAsType(OclAny)");
		assertQueryInvalid(null, "true.oclAsType(OclVoid)");
		assertQueryInvalid(null, "true.oclAsType(OclInvalid)");
		//
		assertQueryEquals(null, 3, "3.oclAsType(Integer)");
		assertQueryEquals(null, 3.0, "3.oclAsType(Real)");
		assertQueryInvalid(null, "3.0.oclAsType(Integer)");		// Cannot downcast
		assertQueryEquals(null, 3.0, "3.0.oclAsType(Real)");
		assertQueryInvalid(null, "3.oclAsType(String)");
		assertQueryEquals(null, 3, "3.oclAsType(OclAny)");
		assertQueryInvalid(null, "3.oclAsType(OclVoid)");
		assertQueryInvalid(null, "3.oclAsType(OclInvalid)");
		//
		assertQueryInvalid(null, "3.14.oclAsType(Integer)");
		assertQueryEquals(null, 3.14, "3.14.oclAsType(Real)");
		assertQueryInvalid(null, "3.14.oclAsType(String)");
		assertQueryEquals(null, 3.14, "3.14.oclAsType(OclAny)");
		assertQueryInvalid(null, "3.14.oclAsType(OclVoid)");
		assertQueryInvalid(null, "3.14.oclAsType(OclInvalid)");
		//
		assertQueryInvalid(null, "*.oclAsType(Integer)");
		assertQueryInvalid(null, "*.oclAsType(Real)");
		assertQueryUnlimited(null, "*.oclAsType(UnlimitedNatural)");
		assertQueryInvalid(null, "*.oclAsType(String)");
		assertQueryUnlimited(null, "*.oclAsType(OclAny)");
		assertQueryInvalid(null, "*.oclAsType(OclVoid)");
		assertQueryInvalid(null, "*.oclAsType(OclInvalid)");
		//
		assertQueryResults(null, "Set{1,2}", "Set{1,2}->oclAsType(Set(UnlimitedNatural))");
		assertQueryResults(null, "Set{1,2}", "Set{1,2}->oclAsType(Set(Integer))");
		assertQueryResults(null, "Set{1,2}", "Set{1,2}->oclAsType(Collection(Real))");
		assertQueryResults(null, "Set{1,2}", "Set{1,2}->oclAsType(Collection(UnlimitedNatural))");
		assertQueryInvalid(null, "Set{1.0,2}->oclAsType(Collection(UnlimitedNatural))");
		assertQueryInvalid(null, "Set{1,2}->oclAsType(Sequence(UnlimitedNatural))");
		assertQueryInvalid(null, "Set{1,2}.oclAsType(Set(UnlimitedNatural))");		// Cannot cast non-collection (elements) to collection
		assertQueryResults(null, "Bag{1,2}", "Set{1,2}.oclAsType(UnlimitedNatural)");
		assertQueryInvalid(null, "Set{1,2}.oclAsType(Set(Integer))");				// Cannot cast non-collection (elements) to collection
		assertQueryResults(null, "Bag{1,2}", "Set{1,2}.oclAsType(Integer)");
		assertQueryResults(null, "Set{Set{1,2},Set{3,4}}", "Set{Set{1,2},Set{3,4}}->oclAsType(Set(Set(UnlimitedNatural)))");
		assertQueryResults(null, "Set{Set{1,2},Set{3,4}}", "Set{Set{1,2},Set{3,4}}->oclAsType(Set(Collection(UnlimitedNatural)))");
		assertQueryResults(null, "Set{Set{1,2},Set{3,4}}", "Set{Set{1,2},Set{3,4}}->oclAsType(Collection(Set(UnlimitedNatural)))");
		assertQueryResults(null, "Set{Set{1,2},Set{3,4}}", "Set{Set{1,2},Set{3,4}}->oclAsType(Set(Set(Integer)))");
		assertQueryInvalid(null, "Set{Set{1,2},Set{3,4}}->oclAsType(Set(Sequence(UnlimitedNatural)))");
		assertQueryInvalid(null, "Set{Set{1,2},Set{3,4}}->oclAsType(Sequence(Set(UnlimitedNatural)))");
		//
		assertSemanticErrorQuery("3.oclAsType(OclAny).abs()", OCLMessages.UnresolvedOperation_ERROR_, "abs", "OclAny");
		assertSemanticErrorQuery("let v : OclAny = 3 in v.abs()", OCLMessages.UnresolvedOperation_ERROR_, "abs", "OclAny");
		assertQueryEquals(null, 3, "let v : OclAny = 3 in v.oclAsType(Integer).abs()");
		assertQueryInvalid(null, "Integer.oclAsType(Real)");
	}

    /**
     * Tests the oclIsInvalid() operator.
     */
    public void test_oclIsInvalid() {
        assertQueryTrue(null, "invalid.oclIsInvalid()");
        assertQueryFalse(null, "null.oclIsInvalid()");
        assertQueryFalse(null, "true.oclIsInvalid()");
        assertQueryFalse(null, "false.oclIsInvalid()");
        assertQueryFalse(null, "3.14.oclIsInvalid()");
        assertQueryFalse(null, "1.oclIsInvalid()");
        assertQueryFalse(null, "*.oclIsInvalid()");
        assertQueryFalse(null, "'invalid'.oclIsInvalid()");
        assertQueryFalse(pkg1, "self.oclIsInvalid()");
		assertQueryTrue(null, "invalid.oclIsInvalid()");
		assertQueryTrue(null, "('123a'.toInteger()).oclIsInvalid()");	// Bug 342561 for old evaluator
		assertQueryTrue(null, "let a:Integer='123a'.toInteger() in a.oclIsInvalid()");	// Bug 342561 for old evaluator
    }

    /**
     * Tests the oclIsKindOf() operator.
     */
    public void test_oclIsKindOf() {
        assertQueryTrue(null, "invalid.oclIsKindOf(OclInvalid)");
        assertQueryTrue(null, "invalid.oclIsKindOf(OclVoid)");
        assertQueryTrue(null, "invalid.oclIsKindOf(OclAny)");
		assertQueryTrue(null, "invalid.oclIsKindOf(String)");
		assertQueryTrue(null, "invalid.oclIsKindOf(Integer)");
		assertQueryTrue(null, "invalid.oclIsKindOf(AnyClassifier)");
		assertQueryTrue(null, "invalid.oclIsKindOf(Bag(Boolean))");
		assertQueryTrue(null, "invalid.oclIsKindOf(Tuple(a:Integer))");
        assertQueryTrue(null, "invalid.oclIsKindOf(ocl::Package)");
        //
        assertQueryFalse(null, "null.oclIsKindOf(OclInvalid)");
        assertQueryTrue(null, "null.oclIsKindOf(OclVoid)");
        assertQueryTrue(null, "null.oclIsKindOf(OclAny)");
		assertQueryTrue(null, "null.oclIsKindOf(String)");
		assertQueryTrue(null, "null.oclIsKindOf(Integer)");
		assertQueryTrue(null, "null.oclIsKindOf(AnyClassifier)");
		assertQueryTrue(null, "null.oclIsKindOf(Bag(Boolean))");
		assertQueryTrue(null, "null.oclIsKindOf(Tuple(a:Integer))");
        assertQueryTrue(null, "null.oclIsKindOf(ocl::Package)");
        //
        assertQueryFalse(null, "true.oclIsKindOf(OclInvalid)");
        assertQueryFalse(null, "true.oclIsKindOf(OclVoid)");
        assertQueryTrue(null, "true.oclIsKindOf(Boolean)");
        assertQueryFalse(null, "true.oclIsKindOf(Integer)");
        assertQueryFalse(null, "true.oclIsKindOf(String)");
        assertQueryTrue(null, "true.oclIsKindOf(OclAny)");
        assertQueryFalse(null, "true.oclIsKindOf(ocl::Package)");
        //
        assertQueryFalse(null, "3.14.oclIsKindOf(OclInvalid)");
        assertQueryFalse(null, "3.14.oclIsKindOf(OclVoid)");
        assertQueryFalse(null, "3.14.oclIsKindOf(Boolean)");
        assertQueryTrue(null, "3.14.oclIsKindOf(Real)");
        assertQueryFalse(null, "3.14.oclIsKindOf(Integer)");
        assertQueryFalse(null, "3.14.oclIsKindOf(String)");
        assertQueryTrue(null, "3.14.oclIsKindOf(OclAny)");
        assertQueryFalse(null, "3.14.oclIsKindOf(ocl::Package)");
        //
        assertQueryFalse(null, "1.oclIsKindOf(OclInvalid)");
        assertQueryFalse(null, "1.oclIsKindOf(OclVoid)");
        assertQueryFalse(null, "1.oclIsKindOf(Boolean)");
        assertQueryTrue(null, "1.oclIsKindOf(Real)");
        assertQueryTrue(null, "1.oclIsKindOf(Integer)");
        assertQueryTrue(null, "(-1).oclIsKindOf(Integer)");
        assertQueryTrue(null, "1.oclIsKindOf(UnlimitedNatural)");
        assertQueryFalse(null, "1.oclIsKindOf(String)");
        assertQueryTrue(null, "1.oclIsKindOf(OclAny)");
        assertQueryFalse(null, "1.oclIsKindOf(ocl::Package)");
        //
        assertQueryFalse(null, "*.oclIsKindOf(OclInvalid)");
        assertQueryFalse(null, "*.oclIsKindOf(OclVoid)");
        assertQueryFalse(null, "*.oclIsKindOf(Boolean)");
        assertQueryTrue(null, "*.oclIsKindOf(Real)");
        assertQueryTrue(null, "*.oclIsKindOf(Integer)");
        assertQueryTrue(null, "*.oclIsKindOf(UnlimitedNatural)");
        assertQueryFalse(null, "*.oclIsKindOf(String)");
        assertQueryTrue(null, "*.oclIsKindOf(OclAny)");
        assertQueryFalse(null, "*.oclIsKindOf(ocl::Package)");
        //
        assertQueryFalse(null, "'invalid'.oclIsKindOf(OclInvalid)");
        assertQueryFalse(null, "'null'.oclIsKindOf(OclVoid)");
        assertQueryFalse(null, "'true'.oclIsKindOf(Boolean)");
        assertQueryFalse(null, "'3.14'.oclIsKindOf(Real)");
        assertQueryFalse(null, "'1'.oclIsKindOf(Integer)");
        assertQueryFalse(null, "'*'.oclIsKindOf(UnlimitedNatural)");
        assertQueryTrue(null, "'string'.oclIsKindOf(String)");
        assertQueryTrue(null, "'any'.oclIsKindOf(OclAny)");
        assertQueryFalse(pkg1, "'self'.oclIsKindOf(ocl::Package)");
        //
        assertQueryFalse(pkg1, "self.oclIsKindOf(OclInvalid)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(OclVoid)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(Boolean)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(Real)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(Integer)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "self.oclIsKindOf(String)");
        assertQueryTrue(pkg1, "self.oclIsKindOf(OclAny)");
        assertQueryTrue(pkg1, "self.oclIsKindOf(ocl::Package)");
    }

	/**
     * Tests the oclIsTypeOf() operator.
     */
    public void test_oclIsTypeOf() {
        assertQueryTrue(null, "invalid.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(null, "invalid.oclIsTypeOf(OclVoid)");
        assertQueryFalse(null, "invalid.oclIsTypeOf(OclAny)");
		assertQueryFalse(null, "invalid.oclIsTypeOf(Integer)");
		assertQueryFalse(null, "invalid.oclIsTypeOf(String)");
		assertQueryFalse(null, "invalid.oclIsTypeOf(AnyClassifier)");
		assertQueryFalse(null, "invalid.oclIsTypeOf(Set(String))");
        assertQueryFalse(null, "invalid.oclIsTypeOf(ocl::Package)");
        //
        assertQueryFalse(null, "null.oclIsTypeOf(OclInvalid)");
        assertQueryTrue(null, "null.oclIsTypeOf(OclVoid)");
        assertQueryFalse(null, "null.oclIsTypeOf(OclAny)");
		assertQueryFalse(null, "null.oclIsTypeOf(Integer)");
		assertQueryFalse(null, "null.oclIsTypeOf(String)");
		assertQueryFalse(null, "null.oclIsTypeOf(AnyClassifier)");
		assertQueryFalse(null, "null.oclIsTypeOf(Set(String))");
        assertQueryFalse(null, "null.oclIsTypeOf(ocl::Package)");
        //
        assertQueryFalse(null, "true.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(null, "true.oclIsTypeOf(OclVoid)");
        assertQueryTrue(null, "true.oclIsTypeOf(Boolean)");
        assertQueryFalse(null, "true.oclIsTypeOf(String)");
        assertQueryFalse(null, "true.oclIsTypeOf(OclAny)");
        assertQueryFalse(null, "true.oclIsTypeOf(ocl::Package)");
        //
        assertQueryFalse(null, "3.14.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(null, "3.14.oclIsTypeOf(OclVoid)");
        assertQueryFalse(null, "3.14.oclIsTypeOf(Boolean)");
        assertQueryTrue(null, "3.14.oclIsTypeOf(Real)");
        assertQueryFalse(null, "3.14.oclIsTypeOf(Integer)");
        assertQueryFalse(null, "3.14.oclIsTypeOf(String)");
        assertQueryFalse(null, "3.14.oclIsTypeOf(OclAny)");
        assertQueryFalse(null, "3.14.oclIsTypeOf(ocl::Package)");
        //
        assertQueryFalse(null, "1.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(null, "1.oclIsTypeOf(OclVoid)");
        assertQueryFalse(null, "1.oclIsTypeOf(Boolean)");
        assertQueryFalse(null, "1.oclIsTypeOf(Real)");
        assertQueryFalse(null, "1.oclIsTypeOf(Integer)");
        assertQueryTrue(null, "(-1).oclIsTypeOf(Integer)");
        assertQueryTrue(null, "1.oclIsTypeOf(UnlimitedNatural)");
        assertQueryFalse(null, "1.oclIsTypeOf(String)");
        assertQueryFalse(null, "1.oclIsTypeOf(OclAny)");
        assertQueryFalse(null, "1.oclIsTypeOf(ocl::Package)");
        //
        assertQueryFalse(null, "*.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(null, "*.oclIsTypeOf(OclVoid)");
        assertQueryFalse(null, "*.oclIsTypeOf(Boolean)");
        assertQueryFalse(null, "*.oclIsTypeOf(Real)");
        assertQueryFalse(null, "*.oclIsTypeOf(Integer)");
        assertQueryTrue(null, "*.oclIsTypeOf(UnlimitedNatural)");
        assertQueryFalse(null, "*.oclIsTypeOf(String)");
        assertQueryFalse(null, "*.oclIsTypeOf(OclAny)");
        assertQueryFalse(null, "*.oclIsTypeOf(ocl::Package)");
        //
        assertQueryFalse(null, "'invalid'.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(null, "'null'.oclIsTypeOf(OclVoid)");
        assertQueryFalse(null, "'true'.oclIsTypeOf(Boolean)");
        assertQueryFalse(null, "'3.14'.oclIsTypeOf(Real)");
        assertQueryFalse(null, "'1'.oclIsTypeOf(Integer)");
        assertQueryFalse(null, "'*'.oclIsTypeOf(UnlimitedNatural)");
        assertQueryTrue(null, "'string'.oclIsTypeOf(String)");
        assertQueryFalse(null, "'any'.oclIsTypeOf(OclAny)");
        assertQueryFalse(pkg1, "'self'.oclIsTypeOf(ocl::Package)");
        //
        assertQueryFalse(pkg1, "self.oclIsTypeOf(OclInvalid)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(OclVoid)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(Boolean)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(Real)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(Integer)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(UnlimitedNatural)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(String)");
        assertQueryFalse(pkg1, "self.oclIsTypeOf(OclAny)");
        assertQueryTrue(pkg1, "self.oclIsTypeOf(ocl::Model)");
    }

    /**
     * Tests the oclIsUndefined() operator.
     */
    public void test_oclIsUndefined() {
        assertQueryTrue(null, "invalid.oclIsUndefined()");
        assertQueryTrue(null, "null.oclIsUndefined()");
        assertQueryFalse(null, "true.oclIsUndefined()");
        assertQueryFalse(null, "false.oclIsUndefined()");
        assertQueryFalse(null, "3.14.oclIsUndefined()");
        assertQueryFalse(null, "1.oclIsUndefined()");
        assertQueryFalse(null, "*.oclIsUndefined()");
        assertQueryFalse(null, "'null'.oclIsUndefined()");
        assertQueryFalse(pkg1, "self.oclIsUndefined()");
    }

    /**
     * Tests the oclType() operator for Booleans.
     */
    public void test_oclType_Boolean() {
    	PrimitiveType booleanType = metaModelManager.getBooleanType();
    	ClassifierType classifierBooleanType = getClassifierType(booleanType);
    	assertQueryEquals(null, booleanType, "true.oclType()");
    	assertQueryEquals(null, "Boolean", "true.oclType().name");
		assertQueryEquals(null, booleanType, "Boolean");
    	assertQueryEquals(null, "Boolean", "Boolean.name");
    	assertQueryEquals(null, classifierBooleanType, "true.oclType().oclType()");
    	assertQueryEquals(null, "ClassClassifier", "true.oclType().oclType().name");			// FIXME uniform name
    	assertQueryEquals(null, classifierBooleanType, "Boolean.oclType()");
    	assertQueryEquals(null, "ClassClassifier", "Boolean.oclType().name");			// FIXME uniform name
    	assertQueryEquals(null, getClassifierType(classifierBooleanType), "true.oclType().oclType().oclType()");
    	assertQueryEquals(null, "ClassClassifier", "true.oclType().oclType().oclType().name");			// FIXME uniform name
    	assertQueryResults(null, "Set{false,true}", "Boolean.allInstances()");
    	assertQueryResults(null, "Set{false,true}", "true.oclType().allInstances()");
    	assertQueryResults(null, "Set{}", "Boolean.oclType().allInstances()");
    	assertQueryEquals(null, 1, "true.oclType().ownedOperation->select(name = 'xor')->any(true).ownedParameter->size()");
    }

    /**
     * Tests the oclType() operator for Classifiers.
     */
    public void test_oclType_Classifier() {
    	Type modelType = metaModelManager.getPivotType("Model");
    	Type packageType = metaModelManager.getPivotType("Package");
       	assertQueryEquals(pkg1, modelType, "self.oclType()");
    	assertQueryEquals(pkg1, "Model", "self.oclType().name");
		assertQueryEquals(null, packageType, "Package");
    	assertQueryEquals(null, "Package", "Package.name");
    	assertQueryEquals(null, getClassifierType(packageType), "Package.oclType()");
    	assertQueryResults(null, "Set{}", "Package.allInstances()");
    	assertQueryEquals(pkg1, 8, "Package.allInstances()->size()");
       	assertQueryResults(pkg1, "self.oclAsType(Package)->closure(nestedPackage)->including(self)", "Package.allInstances()");
       	assertQueryEquals(pkg1, 8, "self.oclType().allInstances()->size()");
       	assertQueryEquals(pkg1, 0, "Package.oclType().allInstances()->size()");
    }

    /**
     * Tests the oclType() operator for Collections.
     */
    public void test_oclType_Collection() {   	
     	assertQueryEquals(null, 1, "Set{1}->oclType().ownedOperation->select(name = 'flatten')->size()");
    	assertQueryEquals(null, metaModelManager.getSetType(metaModelManager.getOclAnyType()), "Set{}->oclType()");
    	assertQueryEquals(null, metaModelManager.getSetType(metaModelManager.getUnlimitedNaturalType()), "Set{1}->oclType()");
    	assertQueryResults(null, "Bag{'UnlimitedNatural'}", "Set{1}.oclType().name");
    	assertQueryEquals(null, "Set", "Set{1}->oclType().name");
    	assertSemanticErrorQuery("Set{1}.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "Set(UnlimitedNatural)");
    	assertSemanticErrorQuery("Set{1}->allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "Set(UnlimitedNatural)");
    	assertSemanticErrorQuery("Set{1}.oclType().allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "Bag(AnyClassifier(UnlimitedNatural))");
    	assertSemanticErrorQuery("Set{1}->oclType().allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "CollectionClassifier(Set(UnlimitedNatural),UnlimitedNatural)");
    	assertQueryResults(null, "Set{}", "Set.oclType().allInstances()");
    	assertQueryEquals(null, metaModelManager.getUnlimitedNaturalType(), "Set{1}->oclType().elementType");
    }

    /**
     * Tests the oclType() operator for Enumerations.
     */
    public void test_oclType_Enumeration() {
    	Type collectionKindType = metaModelManager.getPivotType("CollectionKind");
//    	assertQueryEquals(null, metaModelManager.getPivotType("EnumerationLiteral"), "CollectionKind::Set.oclType()");
    	// NB this is not EnumerationLiteral: cf. 4.oclType() is Integer not IntegerLiteral.
    	assertQueryEquals(null, metaModelManager.getPivotType("CollectionKind"), "CollectionKind::Set.oclType()");
    	assertQueryEquals(null, "CollectionKind", "CollectionKind::Set.oclType().name");
    	assertQueryEquals(null, collectionKindType, "CollectionKind");
    	assertQueryEquals(null, "CollectionKind", "CollectionKind.name");
    	assertQueryEquals(null, getClassifierType(collectionKindType), "CollectionKind.oclType()");
    	assertQueryEquals(null, 5, "CollectionKind.ownedLiteral->size()");
    	assertSemanticErrorQuery("CollectionKind.oclType().ownedLiteral", OCLMessages.UnresolvedProperty_ERROR_, "ownedLiteral", "ClassClassifier(EnumerationClassifier(CollectionKind))");
    	assertQueryResults(null, "Set{CollectionKind::Bag,CollectionKind::Collection,CollectionKind::_'OrderedSet',CollectionKind::_'Sequence',CollectionKind::_'Set'}", "CollectionKind.allInstances()");
    	assertQueryResults(null, "Set{CollectionKind::Bag,CollectionKind::Collection,CollectionKind::OrderedSet,CollectionKind::Sequence,CollectionKind::Set}", "CollectionKind::Set.oclType().allInstances()");
    	assertQueryResults(null, "Set{}", "CollectionKind.oclType().allInstances()");
    }

    /**
     * Tests the oclType() operator for Numerics.
     */
    public void test_oclType_Numeric() {
//
    	PrimitiveType integerType = metaModelManager.getIntegerType();
    	assertQueryEquals(null, metaModelManager.getUnlimitedNaturalType(), "3.oclType()");
    	assertQueryEquals(null, metaModelManager.getRealType(), "3.0.oclType()");
    	assertQueryEquals(null, metaModelManager.getUnlimitedNaturalType(), "*.oclType()");
		assertQueryEquals(null, getClassifierType(integerType), "Integer.oclType()");
    	assertQueryEquals(null, integerType, "Integer");
    	assertSemanticErrorQuery("Integer.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "ClassClassifier(Integer)");
    	assertSemanticErrorQuery("3.oclType().allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "AnyClassifier(UnlimitedNatural)");
    	assertQueryResults(null, "Set{}", "Integer.oclType().allInstances()");
		assertQueryEquals(null, "UnlimitedNatural", "4.oclType().name");
     }

    /**
     * Tests the oclType() operator for OclAny.
     */
    public void test_oclType_OclAny() {
    	AnyType anyType = metaModelManager.getOclAnyType();
    	assertQueryEquals(null, metaModelManager.getOclVoidType(), "null.oclAsType(OclAny).oclType()");		// Cast does not change the dynamic type
//    	assertQueryEquals(null, "OclAny", "null.oclAsType(OclAny).name");
		assertQueryEquals(null, anyType, "OclAny");
    	assertQueryEquals(null, "OclAny", "OclAny.name");
    	assertQueryEquals(null, getClassifierType(anyType), "OclAny.oclType()");
    	assertSemanticErrorQuery("OclAny.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "ClassClassifier(OclAny)");
    	assertSemanticErrorQuery("null.oclAsType(OclAny).oclType().allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "AnyClassifier(OclAny)");
    	assertQueryResults(null, "Set{}", "OclAny.oclType().allInstances()");
    }

    /**
     * Tests the oclType() operator for OclInvalid.
     */
    public void test_oclType_OclInvalid() {
    	InvalidType invalidType = metaModelManager.getOclInvalidType();
    	assertQueryEquals(null, invalidType, "invalid.oclType()");
    	assertQueryEquals(null, "OclInvalid", "invalid.oclType().name");
		assertQueryEquals(null, invalidType, "OclInvalid");
    	assertQueryEquals(null, "OclInvalid", "OclInvalid.name");
    	assertQueryEquals(null, getClassifierType(invalidType), "OclInvalid.oclType()");
    	assertQueryInvalid(null, "OclInvalid.allInstances()");
    	assertQueryInvalid(null, "invalid.oclType().allInstances()");
    	assertQueryResults(null, "Set{}", "OclInvalid.oclType().allInstances()");
    	assertQueryEquals(null, 1, "invalid.oclType().ownedOperation->select(name = '=')->any(true).ownedParameter->size()");
    }

    /**
     * Tests the oclType() operator for OclVoid.
     */
    public void test_oclType_OclVoid() {
    	VoidType nullType = metaModelManager.getOclVoidType();
    	assertQueryEquals(null, nullType, "null.oclType()");
    	assertQueryEquals(null, "OclVoid", "null.oclType().name");
		assertQueryEquals(null, nullType, "OclVoid");
    	assertQueryEquals(null, "OclVoid", "OclVoid.name");
    	assertQueryEquals(null, getClassifierType(nullType), "OclVoid.oclType()");
    	assertQueryResults(null, "Set{null}", "OclVoid.allInstances()");
    	assertQueryResults(null, "Set{null}", "null.oclType().allInstances()");
    	assertQueryResults(null, "Set{}", "OclVoid.oclType().allInstances()");
    	assertQueryEquals(null, 1, "null.oclType().ownedOperation->select(name = '=')->any(true).ownedParameter->size()");
    }

    /**
     * Tests the oclType() operator for Tuples.
     */
    public void test_oclType_Tuple() {
    	TupleTypeManager.TuplePart part = new TupleTypeManager.TuplePart("a", metaModelManager.getIntegerType());
    	TupleType tupleType = metaModelManager.getTupleType("Tuple", Collections.singletonList(part), null);
//    	ClassifierType tupleClassifierType = getClassifierType(tupleType);
		assertQueryEquals(null, tupleType, "Tuple{a:Integer=3}.oclType()");
    	assertQueryEquals(null, tupleType, "Tuple(a:Integer)");
		assertQueryEquals(null, getClassifierType(tupleType), "Tuple(a:Integer).oclType()");
    	assertSemanticErrorQuery("Tuple(a:Integer).allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "ClassClassifier(Tuple(a:Integer))");
    	assertSemanticErrorQuery("Tuple{a:Integer=3}.oclType().allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "AnyClassifier(Tuple(a:Integer))");	// FIXME
    	assertQueryResults(null, "Set{}", "Tuple(a:Integer).oclType().allInstances()");
		assertQueryEquals(null, "Tuple", "Tuple{a:Integer=3}.oclType().name");
     }

    /**
     * Tests the oclType() operator.
     */
    public void test_oclType() {
		assertQueryEquals(null, metaModelManager.getStringType(), "'string'.oclType()");
		assertQueryEquals(null, metaModelManager.getOclVoidType(), "self.oclType()");
    	assertQueryEquals(null, getClassifierType(metaModelManager.getUnlimitedNaturalType()), "3.oclType().oclType()");
    	assertQueryEquals(null, getClassifierType(getClassifierType(metaModelManager.getUnlimitedNaturalType())), "3.oclType().oclType().oclType()");
    	assertQueryEquals(null, getClassifierType(metaModelManager.getBooleanType()), "Boolean.oclType()");
    	assertQueryEquals(null, "ClassClassifier", "Boolean.oclType().name");
    	assertSemanticErrorQuery("3.oclType(OclAny)", OCLMessages.UnresolvedOperationCall_ERROR_, "oclType", "UnlimitedNatural", "ClassClassifier(OclAny)");
    }
    
    public void testToString() {
    	loadEPackage("ecore", EcorePackage.eINSTANCE);
    	String emfString = EcoreFactory.eINSTANCE.createFromString(EcorePackage.Literals.EDATE, "2000-01-24").toString();
        assertQueryEquals(null, emfString, "ecore::EDate{'2000-01-24'}.toString()");
    }

	public Type getCollectionType(String collectionName, Type type) {
		Type collectionType = metaModelManager.getCollectionType(collectionName, type);
		metaModelManager.addLockedElement(collectionType);
		return collectionType;
	}
}
