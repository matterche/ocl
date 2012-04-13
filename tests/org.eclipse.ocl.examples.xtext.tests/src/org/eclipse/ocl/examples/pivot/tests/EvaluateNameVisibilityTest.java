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
 *   L.Goubet, E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EvaluateNameVisibilityTest.java,v 1.8 2011/05/20 15:27:16 ewillink Exp $
 */

package org.eclipse.ocl.examples.pivot.tests;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.PivotConstants;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.messages.OCLMessages;

/**
 * Tests for Name access.
 */
@SuppressWarnings("nls")
public class EvaluateNameVisibilityTest extends PivotFruitTestSuite
{
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        helper.setContext(metaModelManager.getAnyClassifierType());
    }

	/**
	 * Tests the basic name accesses
	 */
	public void test_bad_navigation() throws InvocationTargetException {
		assertSemanticErrorQuery("let a : Type = null in a.Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "Type");
		assertSemanticErrorQuery("let a : Type = null in a.Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "Type");
		assertSemanticErrorQuery("let a : Set(Type) = null in a.Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "Set(Type)");
		assertSemanticErrorQuery("let a : Set(Type) = null in a.Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "Set(Type)");
		assertSemanticErrorQuery("Type.Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "ClassClassifier(Type)");
		assertSemanticErrorQuery("Type.Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "ClassClassifier(Type)");
		assertSemanticErrorQuery("Set(Type).Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "CollectionClassifier(Set(Type),Type)");
		assertSemanticErrorQuery("Set(Type).Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "CollectionClassifier(Set(Type),Type)");
		assertSemanticErrorQuery("let a : Type = null in a->Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "Set(Type)");
		assertSemanticErrorQuery("let a : Type = null in a->Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "Set(Type)");
		assertSemanticErrorQuery("let a : Set(Type) = null in a->Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "Set(Type)");
		assertSemanticErrorQuery("let a : Set(Type) = null in a->Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "Set(Type)");
		assertSemanticErrorQuery("Type->Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "Set(ClassClassifier(Type))");
		assertSemanticErrorQuery("Type->Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "Set(ClassClassifier(Type))");
		assertSemanticErrorQuery("Set(Type)->Package", OCLMessages.UnresolvedProperty_ERROR_, "Package", "Set(CollectionClassifier(Set(Type),Type))");
		assertSemanticErrorQuery("Set(Type)->Package()", OCLMessages.UnresolvedOperation_ERROR_, "Package", "Set(CollectionClassifier(Set(Type),Type))");
		assertSemanticErrorQuery("let a : Type = null in a.if", "missing EOF at ''.''");
		assertSemanticErrorQuery("let a : Type = null in a->if", "missing EOF at ''->''");
	}

	public void test_iterator_scope() {
		assertQueryEquals(null, 6, "Set{1, 2, 3 }->iterate(i : Integer; sum : Integer = 0 | sum + i)");
		assertQueryInvalid(null, "let s : Set(String) = invalid in Set{'a'}->union(s)");
	}

	/**
	 * Tests the let in operator.
	 */
	public void test_let() {
		assertQueryEquals(null, 4, "let a : Integer = 4 in a");
		assertQueryEquals(null, 11, "let a : Integer = 4, b : Integer = 7, c : Integer = a + b in c");
		assertSemanticErrorQuery("let a : Boolean = true, b : Boolean = a and b, c : Boolean = true in c", OCLMessages.UnresolvedProperty_ERROR_, "b", "Boolean");
		assertSemanticErrorQuery("let a : Boolean = b and c, b : Boolean = true, c : Boolean = true in c", OCLMessages.UnresolvedProperty_ERROR_, "b", PivotConstants.UNKNOWN_TYPE_TEXT);
		assertQueryResults(null, "Set{2,3}", "let a : Set(Integer) = Set{1,2,3,4}, b : Set(Integer) = Set{1,4}, c : Set(Integer) = a - b in c");

		assertQueryEquals(null, 16, "let a : Integer = 4 in let a : Integer = 7, b : Integer = a + 9 in b");
		assertQueryEquals(null, 16, "let a : Integer = 4 in let a : Integer = 7 in a + 9 ");
	}

	/**
	 * Tests the basic name accesses
	 */
	public void test_container_navigation() throws InvocationTargetException {
		initFruitPackage();
		metaModelManager.addGlobalNamespace("fruit", fruitPackage);
		//
		//	Simple model: aTree contains redApple
		//
		EObject redApple = fruitEFactory.create(apple);
		redApple.eSet(fruit_color, color_red);
//		EObject greenApple = fruitEFactory.create(apple);
//		greenApple.eSet(fruit_color, color_green);
		EObject aTree = fruitEFactory.create(tree);
		@SuppressWarnings("unchecked")
		List<Object> treeFruits = (List<Object>) aTree.eGet(tree_fruits);
		treeFruits.add(redApple);
		//
		Type pivotTree = metaModelManager.getPivotOfEcore(Type.class, tree);
		//
		assertQueryEquals(redApple, color_red, "let aFruit : fruit::Fruit = self in aFruit.color");
		assertQueryEquals(aTree, valueFactory.createOrderedSetOf(redApple), "let aTree : fruit::Tree = self in aTree.fruits");
		assertQueryEquals(aTree, valueFactory.createOrderedSetOf(redApple), "self.fruits");
		assertQueryEquals(aTree, valueFactory.createOrderedSetOf(redApple), "fruits");
		assertQueryEquals(redApple, aTree, "self.oclContainer()");
		assertQueryEquals(redApple, aTree, "self.Tree");
		//
		//	type/property ambiguity is resolved to type.
		//
		assertQueryEquals(redApple, pivotTree, "Tree");
		//
		//	type/property ambiguity is resolved to type.
		//
		assertQueryInvalid(redApple, "self.oclAsType(Tree)");
//		assertQueryEquals(aTree, valueFactory.createOrderedSetOf(redApple), "self.oclAsType(Tree).fruits");
	}
	
	/**
	 * Tests the nested name accesses
	 */
	public void test_nested_names() throws InvocationTargetException {
		initFruitPackage();
		//
		//	Simple model: appleTree contains redApple
		//
		EObject redApple = fruitEFactory.create(apple);
		redApple.eSet(fruit_color, color_red);
		redApple.eSet(fruit_name, "RedApple");
		EObject appleTree = fruitEFactory.create(tree);
		appleTree.eSet(tree_name, "AppleTree");
		@SuppressWarnings("unchecked")
		List<Object> treeFruits = (List<Object>) appleTree.eGet(tree_fruits);
		treeFruits.add(redApple);
//		
		assertQueryEquals(redApple, redApple, "self.oclAsType(Apple)");//
		assertQueryEquals(redApple, redApple, "self.oclAsType(fruit::Apple)");
		assertQueryEquals(redApple, valueFactory.createSetOf(redApple), "self->oclAsType(Set(Fruit))");
		assertQueryEquals(redApple, valueFactory.createSetOf(redApple), "self->oclAsType(Set(fruit::Apple))");
		assertSemanticErrorQuery("self->oclAsType(Set(fruit::apple::BadApple))", OCLMessages.UnresolvedType_ERROR_, "BadApple");
		assertSemanticErrorQuery("self->oclAsType(Set(fruit::apple::BadApple))", OCLMessages.UnresolvedType_ERROR_, "BadApple");
		assertSemanticErrorQuery("self->oclAsType(Set(fruit::badapple::BadApple))", OCLMessages.UnresolvedNamespace_ERROR_, "badapple");
		assertSemanticErrorQuery("self->oclAsType(Set(badfruit::badapple::BadApple))", OCLMessages.UnresolvedNamespace_ERROR_, "badfruit");
		assertQueryInvalid(redApple, "self->oclAsType(Set(fruit::apple::EatingApple))");
		assertQueryInvalid(redApple, "self->oclAsType(Set(fruit::Tree))");		
		//
		assertQueryEquals(redApple, valueFactory.createSetOf(appleTree), "Tree.allInstances()");
		assertQueryEquals(redApple, valueFactory.createSetOf(appleTree), "fruit::Tree.allInstances()");
		assertQueryEquals(null, getEmptySetValue(), "fruit::Tree.allInstances()");
//
		metaModelManager.addGlobalNamespace("zz", fruitPackage);
		assertQueryEquals(redApple, valueFactory.createSetOf(appleTree), "zz::Tree.allInstances()");
//
		assertQueryEquals(redApple, valueFactory.createBagOf(redApple), "Fruit.allInstances().oclAsType(Apple)");		
		assertQueryEquals(redApple, valueFactory.createSetOf(redApple), "Fruit.allInstances()->oclAsType(Set(Apple))");		
	}
	
	/**
	 * Tests construction of a type instance with property values
	 */
	public void test_type_construction() throws InvocationTargetException {
		initFruitPackage();
		EObject context = fruitEFactory.create(tree);
		assertQueryEquals(context, "RedApple", "Apple{name='RedApple',color=Color::red}.name");
		assertQueryEquals(context, color_red, "Apple{name='RedApple',color=Color::red}.color");
		assertQueryFalse(context, "Apple{name='RedApple',color=Color::red} = Apple{name='RedApple',color=Color::red}");
		assertQueryFalse(context, "let thisApple = Apple{name='AnApple',color=Color::red}, thatApple = Apple{name='AnApple',color=Color::red} in thisApple = thatApple");
		assertQueryTrue(context, "let thisApple = Apple{name='AnApple',color=Color::red}, thatApple = Apple{name='AnApple',color=Color::red} in thisApple.name = thatApple.name");
		assertQueryTrue(context, "let thisApple = Apple{name='AnApple',color=Color::red}, thatApple = Apple{name='AnApple',color=Color::red} in thisApple.color = thatApple.color");
		assertQueryTrue(context, "let thisApple = Apple{name='AnApple',color=Color::red}, thatApple = Apple{name='AnApple',color=Color::red} in thisApple.name = thatApple.name and thisApple.color = thatApple.color");
		assertQueryFalse(context, "let thisApple = Apple{name='ThisApple',color=Color::red}, thatApple = Apple{name='ThatApple',color=Color::red} in thisApple.name = thatApple.name and thisApple.color = thatApple.color");
		assertQueryFalse(context, "let thisApple = Apple{name='AnApple',color=Color::red}, thatApple = Apple{name='AnApple',color=Color::black} in thisApple.name = thatApple.name and thisApple.color = thatApple.color");
	}
}
