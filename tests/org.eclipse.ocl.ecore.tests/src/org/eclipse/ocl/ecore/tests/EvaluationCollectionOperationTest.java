/**
 * Copyright (c) 2012 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 */
package org.eclipse.ocl.ecore.tests;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.tests.GenericEvaluationCollectionOperationTest;

@SuppressWarnings("nls")
public class EvaluationCollectionOperationTest
extends GenericEvaluationCollectionOperationTest<EObject, EPackage, EClassifier, EClassifier, EClass, EDataType, EClassifier, EEnum, EOperation, EParameter, EStructuralFeature,
EAttribute, EReference, EEnumLiteral, EObject, CallOperationAction, SendSignalAction, Constraint>
{
	@Override
	public EcoreTestReflection getStaticReflection() {
		return EcoreTestReflection.INSTANCE;
	}

	public void testCollectionProduct_bug284129() {										// BUG 378036 this doesn't work for UML
		// FIXME Due to number equality inconsistency between Java and OCL, the following doesn't work:
		// assertExpressionResults("Set{Tuple{first = 3, second = 3.0}, Tuple{first = 3, second = 4}, Tuple{first = 4.0, second = 3.0}, Tuple{first = 4.0, second = 4}}", "Sequence{3, 4.0}->product(Sequence{3.0, 4})");
		// But if we relax a little and compare the result to all Double/Real values, it works:
		assertExpressionResults("Set{Tuple{first = 3.0, second = 3.0}, Tuple{first = 3.0, second = 4.0}, Tuple{first = 4.0, second = 3.0}, Tuple{first = 4.0, second = 4.0}}", "Sequence{3, 4.0}->product(Sequence{3.0, 4})");
	}

	public void testCollectionProductNullValue() {										// BUG 378036 this doesn't work for UML
		assertExpressionResults("Set{Tuple{first = 3, second = null}, Tuple{first = 4, second = null}}", "Sequence{3, 4}->product(OrderedSet{null})");
		assertExpressionResults("Set{Tuple{first = 3, second = null}, Tuple{first = 4, second = null}}", "Bag{3, 4}->product(let s:Set(OclVoid)=Set{} in s->including(null))");
		assertExpressionResults("Set{Tuple{first = 3, second = null}, Tuple{first = 4, second = null}}", "Set{3, 4}->product(Bag{null})");
		assertExpressionResults("Set{Tuple{first = 3, second = null}, Tuple{first = 4, second = null}}", "OrderedSet{3, 4}->product(Sequence{null})");

		assertExpressionResults("Set{Tuple{first = null, second = 3}, Tuple{first = 4, second = 3}}", "Sequence{null, 4}->product(Sequence{3})");
		assertExpressionResults("Set{Tuple{first = null, second = 3}, Tuple{first = 4, second = 3}}", "Bag{null, 4}->product(Set{3})");
		assertExpressionResults("Set{Tuple{first = null, second = 3}, Tuple{first = 4, second = 3}}", "Set{null, 4}->product(Bag{3})");
		assertExpressionResults("Set{Tuple{first = null, second = 3}, Tuple{first = 4, second = 3}}", "OrderedSet{null, 4}->product(Sequence{3})");
	}
}
