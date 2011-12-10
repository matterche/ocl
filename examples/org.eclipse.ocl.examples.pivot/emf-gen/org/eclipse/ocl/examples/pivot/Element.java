/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: Element.java,v 1.4 2011/05/19 16:55:39 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.pivot.util.Visitable;
import org.eclipse.ocl.examples.pivot.utilities.PivotObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * @extends org.eclipse.ocl.examples.domain.elements.DomainElement
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element is a constituent of a model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.Element#getOwnedComments <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getElement()
 * @model abstract="true" superTypes="org.eclipse.ocl.examples.pivot.Visitable"
 * @extends PivotObject
 * @generated
 */
public interface Element
		extends PivotObject, Visitable, org.eclipse.ocl.examples.domain.elements.DomainElement {

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.pivot.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Comments owned by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getElement_OwnedComment()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment' body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/3.1.0/Pivot!Element!ownedComment'"
	 * @generated
	 */
	EList<Comment> getOwnedComments();

	/**
	 * Creates a new {@link org.eclipse.ocl.examples.pivot.Comment} and appends it to the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.ocl.examples.pivot.Comment}.
	 * @see #getOwnedComments()
	 * @generated
	 */
	Comment createOwnedComment();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\noclContents()\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_OclElement = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._OclElement;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_Set_OclElement_ = standardLibrary.getSetType(T_OclElement);\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Set_OclElement_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.ElementBodies%>._allOwnedElements_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\t@SuppressWarnings(\"unchecked\")\n\tEList<Element> ecoreResult = (EList<Element>) valueFactory.getEcoreValueOf(result);\n\treturn ecoreResult;\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.ElementBodies\", e);\n}\n'"
	 * @generated
	 */
	EList<Element> allOwnedElements();

	EObject getETarget();
} // Element
