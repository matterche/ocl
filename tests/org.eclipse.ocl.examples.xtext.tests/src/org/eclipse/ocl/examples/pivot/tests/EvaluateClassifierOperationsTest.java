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
 * $Id: EvaluateClassifierOperationsTest.java,v 1.6 2011/05/20 15:27:16 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.tests;

import org.eclipse.ocl.examples.domain.messages.EvaluatorMessages;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;
import org.eclipse.osgi.util.NLS;

/**
 * Tests for OclAny operations.
 */
@SuppressWarnings("nls")
public class EvaluateClassifierOperationsTest extends PivotSimpleTestSuite
{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        helper.setContext(metaModelManager.getAnyClassifierType());
    }

	/**
	 * Tests the allInstances() operator.
	 */
	public void test_allInstances() {
		assertQueryResults(null, "Set{CollectionKind::Bag,CollectionKind::Collection,CollectionKind::_'OrderedSet',CollectionKind::_'Sequence',CollectionKind::_'Set'}", "CollectionKind.allInstances()");
		assertQueryResults(null, "Set{true,false}", "Boolean.allInstances()");
		assertQueryResults(null, "Set{null}", "OclVoid.allInstances()");
		assertQueryResults(null, "Set{}", "ocl::Package.allInstances()");
		assertQueryEquals(pkg1, 8, "Package.allInstances()->size()");
		assertSemanticErrorQuery("Integer.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "ClassClassifier(Integer)");
		assertSemanticErrorQuery("String.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "ClassClassifier(String)");
		assertSemanticErrorQuery("Set(Integer).allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "CollectionClassifier(Set(Integer),Integer)");
		assertSemanticErrorQuery("Tuple(a:Integer).allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "ClassClassifier(Tuple(a:Integer))");
		assertSemanticErrorQuery("OclAny.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "ClassClassifier(OclAny)");
		assertSemanticErrorQuery("4.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "UnlimitedNatural");
		assertSemanticErrorQuery("true.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "Boolean");
		assertSemanticErrorQuery("Set{1}.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "Set(UnlimitedNatural)");
		assertSemanticErrorQuery("Tuple{a:Integer=1}.allInstances()", OCLMessages.UnresolvedOperation_ERROR_, "allInstances", "Tuple(a:Integer)");
		assertQueryInvalid(null, "OclInvalid.allInstances()");
	}
	
	/**
	 * Tests the conformsTo() operator.
	 */
	public void test_conformsTo() {
		assertQueryTrue(null, "Boolean.conformsTo(Boolean)");
		assertQueryFalse(null, "String.conformsTo(Boolean)");
		assertQueryFalse(null, "Boolean.conformsTo(String)");
		assertQueryTrue(null, "Integer.conformsTo(Real)");
		assertQueryTrue(null, "UnlimitedNatural.conformsTo(Integer)");
		assertQueryTrue(null, "UnlimitedNatural.conformsTo(Real)");
		assertQueryFalse(null, "Real.conformsTo(Integer)");
		assertQueryFalse(null, "Real.conformsTo(UnlimitedNatural)");
		assertQueryFalse(null, "Integer.conformsTo(UnlimitedNatural)");
		//FIXME much more
	}
	
	/**
	 * Tests the oclContainer() operator.
	 */
	public void test_oclContainer() {
		assertQueryInvalid(pkg2, "invalid.oclContainer()");
		assertQueryInvalid(pkg2, "null.oclContainer()");
		assertQueryResults(pkg1, "null", "oclContainer()");
		assertQueryEquals(pkg2, pkg1, "oclContainer()");
		assertQueryInvalid(null, "1.oclContainer()", NLS.bind(EvaluatorMessages.TypedValueRequired, "Object", "UnlimitedNatural"), null);
	}
	
	/**
	 * Tests the oclContents() operator.
	 */
	public void test_oclContents() {
		assertQueryInvalid(pkg2, "invalid.oclContents()");
		assertQueryInvalid(pkg2, "null.oclContents()");
		assertQueryEquals(pkg1, valueFactory.createSetOf(bob, pkg2, pkg3), "oclContents()");
		assertQueryEquals(pkg2, valueFactory.createSetOf(jim), "oclContents()");
		assertQueryEquals(george, valueFactory.createSetOf(), "oclContents()");
		assertQueryInvalid(null, "1.oclContents()", NLS.bind(EvaluatorMessages.TypedValueRequired, "Object", "UnlimitedNatural"), null);
	}
}
