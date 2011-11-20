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
 * $Id: ValueSpecification.java,v 1.2 2011/01/24 20:49:35 ewillink Exp $
 */
package org.eclipse.ocl.examples.pivot;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value specification is the specification of a (possibly empty) set of instances, including both objects and data values.
 * ValueSpecification specializes ParameterableElement to specify that a value specification can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.ocl.examples.pivot.PivotPackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification
		extends TypedElement, ParameterableElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() determines whether a value specification can be computed in a model. This operation cannot be fully defined in OCL. A conforming implementation is expected to deliver true for this operation for all value specifications that it can compute, and to compute all of those for which the operation is true. A conforming implementation is expected to be able to compute the value of all literals.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nfalse\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies%>._isComputable_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (Boolean) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies\", e);\n}\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='false'"
	 * @generated
	 */
	boolean isComputable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query integerValue() gives a single Integer value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.Integer" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nSet{}\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_OclAny = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._OclAny;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Set_OclAny_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies%>._integerValue_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (BigInteger) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies\", e);\n}\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{}'"
	 * @generated
	 */
	BigInteger integerValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query booleanValue() gives a single Boolean value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nSet{}\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_OclAny = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._OclAny;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Set_OclAny_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies%>._booleanValue_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (Boolean) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies\", e);\n}\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{}'"
	 * @generated
	 */
	boolean booleanValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query stringValue() gives a single String value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nSet{}\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_OclAny = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._OclAny;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Set_OclAny_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies%>._stringValue_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (String) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies\", e);\n}\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{}'"
	 * @generated
	 */
	String stringValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.ocl.examples.pivot.UnlimitedNatural" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nSet{}\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainStandardLibrary%> standardLibrary = valueFactory.getStandardLibrary();\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_OclAny = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._OclAny;\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainCollectionType%> T_Set_OclAny_ = standardLibrary.getSetType(T_OclAny);\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Set_OclAny_;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies%>._unlimitedValue_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (BigInteger) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies\", e);\n}\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{}'"
	 * @generated
	 */
	BigInteger unlimitedValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNull() returns true when it can be computed that the value is null.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.ocl.examples.pivot.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/*\nfalse\n\052/\ntry {\n\tfinal <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.ocl.examples.pivot.PivotTables%>.LIBRARY);\n\tfinal <%org.eclipse.ocl.examples.domain.values.ValueFactory%> valueFactory = evaluator.getValueFactory();\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> self = valueFactory.valueOf(this);\n\tfinal <%org.eclipse.ocl.examples.library.executor.ExecutorType%> T_Boolean = <%org.eclipse.ocl.examples.library.oclstdlib.OCLstdlibTables%>.Types._Boolean;\n\t\n\tfinal <%org.eclipse.ocl.examples.domain.elements.DomainType%> returnType = T_Boolean;\n\tfinal <%org.eclipse.ocl.examples.domain.values.Value%> result = <%org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies%>._isNull_body_.INSTANCE.evaluate(evaluator, returnType, self);\n\treturn (Boolean) valueFactory.getEcoreValueOf(result);\n} catch (<%org.eclipse.ocl.examples.domain.evaluation.InvalidValueException%> e) {\n\tthrow new <%org.eclipse.emf.common.util.WrappedException%>(\"Failed to evaluate org.eclipse.ocl.examples.pivot.bodies.ValueSpecificationBodies\", e);\n}\n'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='false'"
	 * @generated
	 */
	boolean isNull();
} // ValueSpecification
