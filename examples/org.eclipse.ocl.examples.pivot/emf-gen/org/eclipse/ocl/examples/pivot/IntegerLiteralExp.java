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
 * $Id: IntegerLiteralExp.java,v 1.2 2011/01/24 20:42:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import java.math.BigInteger;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.pivot.IntegerLiteralExp#getIntegerSymbol <em>Integer Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getIntegerLiteralExp()
 * @model
 * @generated
 */
public interface IntegerLiteralExp
		extends NumericLiteralExp {

	/**
	 * Returns the value of the '<em><b>Integer Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Symbol</em>' attribute.
	 * @see #setIntegerSymbol(BigInteger)
	 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getIntegerLiteralExp_IntegerSymbol()
	 * @model dataType="org.eclipse.ocl.examples.pivot.Integer" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/ocl/3.1.0/Pivot!IntegerLiteralExp!integerSymbol'"
	 * @generated
	 */
	BigInteger getIntegerSymbol();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.examples.pivot.IntegerLiteralExp#getIntegerSymbol <em>Integer Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Symbol</em>' attribute.
	 * @see #getIntegerSymbol()
	 * @generated
	 */
	void setIntegerSymbol(BigInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of an integer Literal expression is the type Integer.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nself.type = Integer\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.IntegerLiteralExpBodies%>._invariant_TypeIsInteger.INSTANCE.evaluate(evaluator, returnType, self);\n\tfinal boolean resultIsNull = result.isNull();\n\tif (!resultIsNull && result.asBoolean()) {\t// true => true, false/null => dropthrough, invalid => exception\n\t\treturn true;\n\t}\n\tif (diagnostics != null) {\n\t\tint severity = resultIsNull ? <%org.eclipse.emf.common.util.Diagnostic%>.ERROR : <%org.eclipse.emf.common.util.Diagnostic%>.WARNING;\n\t\tString message = <%org.eclipse.osgi.util.NLS%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationConstraintIsNotSatisfied_ERROR_, new Object[]{\"IntegerLiteralExp\", \"TypeIsInteger\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n\t    diagnostics.add(new <%org.eclipse.emf.common.util.BasicDiagnostic%>(severity, <%org.eclipse.ocl.examples.pivot.util.PivotValidator%>.DIAGNOSTIC_SOURCE, <%org.eclipse.ocl.examples.pivot.util.PivotValidator%>.INTEGER_LITERAL_EXP__TYPE_IS_INTEGER, message, new Object [] { this }));\n\t}\n\treturn false;\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tString message = <%org.eclipse.osgi.util.NLS%>.bind(<%org.eclipse.ocl.examples.domain.messages.EvaluatorMessages%>.ValidationEvaluationFailed_ERROR_, new Object[]{\"IntegerLiteralExp\", \"TypeIsInteger\", <%org.eclipse.emf.ecore.util.EObjectValidator%>.getObjectLabel(this, context)});\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(message, e);\n}\n'"
	 * @generated
	 */
	boolean validateTypeIsInteger(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IntegerLiteralExp
