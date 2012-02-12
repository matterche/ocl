/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ocl.examples.test.xtext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ocl.examples.pivot.AssociativityKind;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Precedence;
import org.eclipse.ocl.examples.pivot.manager.PrecedenceManager;
import org.eclipse.ocl.examples.xtext.tests.XtextTestCase;

/**
 * Tests the PrecedenceManager and Precedence relationships.
 */
public class PrecedenceTests extends XtextTestCase
{
	protected Precedence createPrecedence(org.eclipse.ocl.examples.pivot.Package root1, String name, AssociativityKind associativity) {
		Precedence precedence = PivotFactory.eINSTANCE.createPrecedence();
		precedence.setName(name);
		precedence.setAssociativity(associativity);
		root1.getOwnedPrecedence().add(precedence);
		return precedence;
	}

	public void testOkAssignPrecedences() {
		Collection<org.eclipse.ocl.examples.pivot.Package> rootPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		org.eclipse.ocl.examples.pivot.Package root1 = PivotFactory.eINSTANCE.createPackage();
		Precedence p1a = createPrecedence(root1, "A", AssociativityKind.LEFT);
		Precedence p1b = createPrecedence(root1, "B", AssociativityKind.LEFT);
		Precedence p1c = createPrecedence(root1, "D", AssociativityKind.LEFT);
		rootPackages.add(root1);
		org.eclipse.ocl.examples.pivot.Package root2 = PivotFactory.eINSTANCE.createPackage();
		Precedence p2a = createPrecedence(root2, "B", AssociativityKind.LEFT);
		Precedence p2b = createPrecedence(root2, "C", AssociativityKind.LEFT);
		Precedence p2c = createPrecedence(root2, "D", AssociativityKind.LEFT);
		rootPackages.add(root2);
		List<String> errors = new PrecedenceManager().compilePrecedences(rootPackages);
		assertEquals(0, p1a.getOrder().intValue());
		assertEquals(1, p1b.getOrder().intValue());
		assertEquals(3, p1c.getOrder().intValue());
		assertEquals(1, p2a.getOrder().intValue());
		assertEquals(2, p2b.getOrder().intValue());
		assertEquals(3, p2c.getOrder().intValue());
		assertEquals(0, errors.size());
	}
	
	public void testBadOrderingAssignPrecedences() {
		Collection<org.eclipse.ocl.examples.pivot.Package> rootPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		org.eclipse.ocl.examples.pivot.Package root1 = PivotFactory.eINSTANCE.createPackage();
		Precedence p1a = createPrecedence(root1, "A", AssociativityKind.LEFT);
		Precedence p1b = createPrecedence(root1, "B", AssociativityKind.LEFT);
		rootPackages.add(root1);
		org.eclipse.ocl.examples.pivot.Package root2 = PivotFactory.eINSTANCE.createPackage();
		Precedence p2a = createPrecedence(root2, "B", AssociativityKind.LEFT);
		Precedence p2b = createPrecedence(root2, "A", AssociativityKind.LEFT);
		rootPackages.add(root2);
		List<String> errors = new PrecedenceManager().compilePrecedences(rootPackages);
		assertEquals(0, p1a.getOrder().intValue());
		assertEquals(1, p1b.getOrder().intValue());
		assertEquals(1, p2a.getOrder().intValue());
		assertEquals(0, p2b.getOrder().intValue());
		assertEquals(1, errors.size());
	}
	
	public void testBadAssociativityAssignPrecedences() {
		Collection<org.eclipse.ocl.examples.pivot.Package> rootPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		org.eclipse.ocl.examples.pivot.Package root1 = PivotFactory.eINSTANCE.createPackage();
		Precedence p1a = createPrecedence(root1, "A", AssociativityKind.LEFT);
		rootPackages.add(root1);
		org.eclipse.ocl.examples.pivot.Package root2 = PivotFactory.eINSTANCE.createPackage();
		Precedence p2a = createPrecedence(root2, "A", AssociativityKind.RIGHT);
		rootPackages.add(root2);
		List<String> errors = new PrecedenceManager().compilePrecedences(rootPackages);
		assertEquals(0, p1a.getOrder().intValue());
		assertEquals(0, p2a.getOrder().intValue());
		assertEquals(1, errors.size());
	}
	
	public void testAmbiguousInternalAssignPrecedences() {
		Collection<org.eclipse.ocl.examples.pivot.Package> rootPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		org.eclipse.ocl.examples.pivot.Package root1 = PivotFactory.eINSTANCE.createPackage();
		Precedence p1a = createPrecedence(root1, "A", AssociativityKind.LEFT);
		Precedence p1b = createPrecedence(root1, "B", AssociativityKind.LEFT);
		Precedence p1c = createPrecedence(root1, "D", AssociativityKind.LEFT);
		rootPackages.add(root1);
		org.eclipse.ocl.examples.pivot.Package root2 = PivotFactory.eINSTANCE.createPackage();
		Precedence p2a = createPrecedence(root2, "A", AssociativityKind.LEFT);
		Precedence p2b = createPrecedence(root2, "C", AssociativityKind.LEFT);
		Precedence p2c = createPrecedence(root2, "D", AssociativityKind.LEFT);
		rootPackages.add(root2);
		List<String> errors = new PrecedenceManager().compilePrecedences(rootPackages);
		assertEquals(0, p1a.getOrder().intValue());
		assertEquals(2, p1b.getOrder().intValue());
		assertEquals(3, p1c.getOrder().intValue());
		assertEquals(0, p2a.getOrder().intValue());
		assertEquals(1, p2b.getOrder().intValue());
		assertEquals(3, p2c.getOrder().intValue());
		assertEquals(1, errors.size());
	}
	
	public void testAmbiguousTailAssignPrecedences() {
		Collection<org.eclipse.ocl.examples.pivot.Package> rootPackages = new ArrayList<org.eclipse.ocl.examples.pivot.Package>();
		org.eclipse.ocl.examples.pivot.Package root1 = PivotFactory.eINSTANCE.createPackage();
		Precedence p1a = createPrecedence(root1, "A", AssociativityKind.LEFT);
		Precedence p1b = createPrecedence(root1, "B", AssociativityKind.LEFT);
		rootPackages.add(root1);
		org.eclipse.ocl.examples.pivot.Package root2 = PivotFactory.eINSTANCE.createPackage();
		Precedence p2a = createPrecedence(root2, "A", AssociativityKind.LEFT);
		Precedence p2b = createPrecedence(root2, "C", AssociativityKind.LEFT);
		rootPackages.add(root2);
		List<String> errors = new PrecedenceManager().compilePrecedences(rootPackages);
		assertEquals(0, p1a.getOrder().intValue());
		assertEquals(2, p1b.getOrder().intValue());
		assertEquals(0, p2a.getOrder().intValue());
		assertEquals(1, p2b.getOrder().intValue());
		assertEquals(1, errors.size());
	}
}
